package X;

import android.view.View;
import com.ss.android.ugc.aweme.feed.infra.riskapi.FeedRiskApiConfig;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.1AVr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2180571AVr {
    public static final /* synthetic */ int LIZ = 0;

    public static List LIZJ(int i) {
        ArrayList arrayList = new ArrayList();
        C089E c089e = new C089E(ThreadMethodProxy.getStackTrace(C786410Ut5.u3()));
        boolean z = false;
        while (c089e.hasNext()) {
            StackTraceElement stackTraceElement = (StackTraceElement) c089e.next();
            if (z) {
                String className = stackTraceElement.getClassName();
                if (className == null) {
                    className = "";
                } else {
                    int iLJJJJ = a0.LJJJJ(className, '.', 0, 6);
                    if (iLJJJJ != -1) {
                        className = className.substring(iLJJJJ + 1);
                    }
                }
                String methodName = stackTraceElement.getMethodName();
                stackTraceElement.getLineNumber();
                arrayList.add(new C2180621AVw(className, methodName));
                if (arrayList.size() >= i) {
                    break;
                }
                String className2 = stackTraceElement.getClassName();
                stackTraceElement.getMethodName();
                if (LJ(className2)) {
                    break;
                }
            } else if (u.LJIIZILJ(stackTraceElement.getMethodName(), "Lancet", false)) {
                z = true;
            }
        }
        return arrayList;
    }

    public static boolean LJ(String str) {
        if (a0.LJJIIZI(str, "com.ss.android.ugc", false) || a0.LJJIIZI(str, "com.bytedance.tiktok", false)) {
            for (Object obj : (Set) FeedRiskApiConfig.LJIIJ.getValue()) {
                if (a0.LJJIIZI(str, (String) obj, false)) {
                    if (obj == null) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public static boolean LIZIZ(EnumC2180541AVo enumC2180541AVo, Object obj) {
        if (!C1AW1.LIZIZ()) {
            return true;
        }
        if ((enumC2180541AVo == EnumC2180541AVo.V_ALPHA && !Intrinsics.LJFF(obj, Float.valueOf(0.0f)) && !Intrinsics.LJFF(obj, Float.valueOf(1.0f))) || (enumC2180541AVo == EnumC2180541AVo.V_VISIBLITY && Intrinsics.LJFF(obj, 0))) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String LIZLLL(View view, Function0 function0) {
        String riskId;
        if (view instanceof InterfaceC20343214is) {
            riskId = ((InterfaceC20343214is) view).getRiskId();
        } else {
            Object tag = view.getTag(R.id.emc);
            if (tag instanceof String) {
                riskId = (String) tag;
            }
            return (String) function0.invoke();
        }
        if (riskId != null) {
            return riskId;
        }
        return (String) function0.invoke();
    }

    public static String LIZ(View view, C1AV2 c1av2, List list) {
        AwS555S0100000_11 awS555S0100000_11 = new AwS555S0100000_11(view, 1683);
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            list = new ArrayList();
        }
        boolean z = false;
        for (C2180621AVw c2180621AVw : list) {
            if (!a0.LJJIIZI(c2180621AVw.LIZIZ, "Clean", false) && !a0.LJJIIZI(c2180621AVw.LIZIZ, "clear", false)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(c2180621AVw.LIZ);
                sbLIZ.append('/');
                sbLIZ.append(c2180621AVw.LIZIZ);
                arrayList.add(C2188811AlT.LIZIZ(sbLIZ));
            } else if (!z) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(c2180621AVw.LIZ);
                sbLIZ2.append('/');
                sbLIZ2.append(c2180621AVw.LIZIZ);
                arrayList.add(C2188811AlT.LIZIZ(sbLIZ2));
                z = true;
            }
            if (arrayList.size() >= 3) {
                break;
            }
        }
        String strLIZLLL = LIZLLL(view, awS555S0100000_11);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(strLIZLLL);
        sbLIZ3.append(',');
        sbLIZ3.append(c1av2);
        sbLIZ3.append(',');
        sbLIZ3.append(C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62));
        return C2188811AlT.LIZIZ(sbLIZ3);
    }
}
