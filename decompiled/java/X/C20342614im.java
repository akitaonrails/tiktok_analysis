package X;

import Y.ARunnableS100S0200000_31;
import Y.ARunnableS103S0100000_3;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.crash.Npth;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.agilelogger.ALog;
import java.lang.reflect.Field;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS590S0100000_11;

/* JADX INFO: renamed from: X.14im, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20342614im {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(350));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(351));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(352));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(353));

    public static List LIZJ(AwS590S0100000_11 awS590S0100000_11) {
        Object obj;
        try {
            Field field = (Field) LIZJ.getValue();
            List list = null;
            if (field != null) {
                obj = field.get(LIZLLL.getValue());
            } else {
                obj = null;
            }
            if (obj instanceof List) {
                list = (List) obj;
            }
            if (list == null) {
                list = C13BV.INSTANCE;
            }
            return (List) awS590S0100000_11.invoke(list);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            ALog.e("FVT", "getTargetRootView error ", e);
            return C13BV.INSTANCE;
        }
    }

    public static void LIZ(C20342714in c20342714in, List list, AFwS243S0000000_11 aFwS243S0000000_11, Function1 function1, boolean z) {
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            View view = (View) it2.next();
            ArrayDeque arrayDeque = new ArrayDeque();
            C20343014iq c20343014iqLIZ = C20342814io.LIZ(c20342714in, view);
            arrayDeque.add(new Pair(view, c20343014iqLIZ));
            while (!arrayDeque.isEmpty()) {
                Pair pair = (Pair) arrayDeque.removeFirst();
                View view2 = (View) pair.getFirst();
                C20343014iq c20343014iq = (C20343014iq) pair.getSecond();
                if (view2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view2;
                    int childCount = viewGroup.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        View childAt = viewGroup.getChildAt(i);
                        if (((Boolean) aFwS243S0000000_11.invoke(childAt)).booleanValue()) {
                            C20343014iq c20343014iqLIZ2 = C20342814io.LIZ(c20342714in, childAt);
                            c20343014iq.LJI.add(c20343014iqLIZ2);
                            arrayDeque.add(new Pair(childAt, c20343014iqLIZ2));
                        }
                    }
                    c20343014iq.toString();
                }
            }
            arrayList.add(new Pair(c20343014iqLIZ, new C1865460ye0(C20343014iq.LJIIJJI)));
        }
        if (arrayList.isEmpty()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("collectViewInfo error, rootView is empty  ");
            sbLIZ.append(list.size());
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogE("FVT", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        ARunnableS100S0200000_31 aRunnableS100S0200000_31 = new ARunnableS100S0200000_31(arrayList, function1, 48);
        if (z) {
            C823050WQl.LIZLLL().submit(new ARunnableS103S0100000_3((Object) aRunnableS100S0200000_31, 68));
        } else {
            aRunnableS100S0200000_31.run();
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.14in] */
    public static void LIZIZ(C0S48 c0s48, List list, AFwS243S0000000_11 aFwS243S0000000_11, Function1 function1, boolean z) {
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("collectViewTreeInfo start entry: ");
            sbLIZ.append(c0s48);
            sbLIZ.append(", rootView ");
            sbLIZ.append(list.size());
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogE("FVT", C2188811AlT.LIZIZ(sbLIZ));
            LIZ(new Object() { // from class: X.14in
            }, list, aFwS243S0000000_11, function1, z);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            Npth.reportBizException("FeedViewTree", (Throwable) e, "collectViewTreeInfo error", (Map<String, String>) new HashMap(), true);
            ALog.e("FVT", "collectViewTreeInfo error ", e);
        }
    }
}
