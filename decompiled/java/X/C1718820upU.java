package X;

import android.content.Context;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.component.verify.pin.model.HintPageChildren;
import com.ss.android.ugc.aweme.component.verify.pin.model.HintPageMsg;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS121S0400000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0upU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1718820upU {
    public static final C1718820upU LIZ = new C1718820upU();

    public static void LIZ(Context context, String str, List list) {
        if (str != null && str.length() != 0) {
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, str);
            if (list != null) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    Pair pair = (Pair) it2.next();
                    smartRouteBuildRoute.withParam((String) pair.getFirst(), (String) pair.getSecond());
                }
            }
            smartRouteBuildRoute.open();
        }
    }

    public static void LIZIZ(Context context, HintPageMsg hintPageMsg, List list, Function1 function1) {
        if (context != null && hintPageMsg != null && hintPageMsg.LIZ()) {
            ArrayList arrayList = new ArrayList();
            List<HintPageChildren> list2 = hintPageMsg.children;
            if (list2 != null) {
                ArrayList arrayList2 = new ArrayList();
                for (HintPageChildren hintPageChildren : list2) {
                    if (Intrinsics.LJFF(hintPageChildren.type, "button")) {
                        arrayList2.add(hintPageChildren);
                    }
                }
                arrayList.addAll(arrayList2);
            }
            if (arrayList.isEmpty()) {
                arrayList.add(new HintPageChildren("button", C20642515q3.LJI(2131844825), null, null));
            }
            C1397580mTM c1397580mTM = new C1397580mTM(context);
            c1397580mTM.LJI(hintPageMsg.title);
            c1397580mTM.LJII = false;
            c1397580mTM.LIZIZ(hintPageMsg.desc);
            C1238130iKB.LIZ(c1397580mTM, new AwS121S0400000_26((List) arrayList, (List<HintPageChildren>) context, (Context) list, (List<Pair<String, String>>) function1, (Function1<? super String, Unit>) 16));
            new C1397510mTF(c1397580mTM).LIZLLL();
        }
    }
}
