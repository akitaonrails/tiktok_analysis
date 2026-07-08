package X;

import android.content.Context;
import android.content.Intent;
import com.bytedance.pipo.verify.base.model.response.PopupContent;
import com.bytedance.router.OnActivityResultCallback;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.component.verify.pin.model.HintPageChildren;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS121S0400000_26;

/* JADX INFO: renamed from: X.0ukB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1715530ukB {
    public static final C1715530ukB LIZ = new C1715530ukB();

    public static void LIZ(Context context, final PopupContent popupContent, List list, final Function1 function1) {
        String str = popupContent.url;
        if (str != null && str.length() != 0) {
            try {
                SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, str);
                if (list != null) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        Pair pair = (Pair) it2.next();
                        smartRouteBuildRoute.withParam((String) pair.getFirst(), (String) pair.getSecond());
                    }
                }
                smartRouteBuildRoute.withParam("disable_hint_msg", true);
                smartRouteBuildRoute.open(112233, new OnActivityResultCallback() { // from class: X.0ukC
                    @Override // com.bytedance.router.OnActivityResultCallback
                    public final void onActivityResult(int i, int i2, Intent intent) {
                        Function1<String, Unit> function12 = function1;
                        if (function12 != null) {
                            function12.invoke(popupContent.trackingId);
                        }
                    }
                });
                return;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1AF0.LJ(th);
                if (function1 != null) {
                    function1.invoke(popupContent.trackingId);
                    return;
                }
                return;
            }
        }
        if (function1 != null) {
            function1.invoke(popupContent.trackingId);
        }
    }

    public static void LIZIZ(Context context, String str, String str2, List list, List list2, Function1 function1) {
        if (context == null) {
            return;
        }
        if ((str == null || str.length() == 0) && (str2 == null || str2.length() == 0)) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            arrayList.addAll(list);
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new PopupContent("button", C20642515q3.LJI(2131844825), null, null));
        }
        C1397580mTM c1397580mTM = new C1397580mTM(context);
        c1397580mTM.LJI(str);
        c1397580mTM.LJII = false;
        c1397580mTM.LIZIZ(str2);
        C1238130iKB.LIZ(c1397580mTM, new AwS121S0400000_26((List) arrayList, (List<HintPageChildren>) context, (Context) list2, (List<Pair<String, String>>) function1, (Function1<? super String, Unit>) 27));
        new C1397510mTF(c1397580mTM).LIZLLL();
    }
}
