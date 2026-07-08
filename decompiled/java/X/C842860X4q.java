package X;

import android.content.Context;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AFwS200S0000000_13;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0X4q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C842860X4q {
    public static final C842860X4q LIZ = new C842860X4q();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(308));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(309));

    public static void LIZ(String str) {
        Object obj;
        Context contextLIZ;
        AbstractC1387200mCc abstractC1387200mCcLJFF = C1906580ziK.LJFF();
        if (abstractC1387200mCcLJFF != null) {
            obj = abstractC1387200mCcLJFF.LIZ;
        } else {
            obj = null;
        }
        List<String> listLJIIJJI = C1697810uHb.LJIIJJI("LogoutDialogActivity", "KidsRelaunchPopup");
        if (!(listLJIIJJI instanceof Collection) || !listLJIIJJI.isEmpty()) {
            for (String str2 : listLJIIJJI) {
                if (obj != null && a0.LJJIIZI(obj.getClass().getName(), str2, false)) {
                    return;
                }
            }
        }
        AbstractC1387200mCc abstractC1387200mCcLJFF2 = C1906580ziK.LJFF();
        if (abstractC1387200mCcLJFF2 == null || (contextLIZ = abstractC1387200mCcLJFF2.LIZIZ()) == null) {
            C844470XAv.LIZ.getClass();
            contextLIZ = C844470XAv.LIZ();
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(contextLIZ, "//ftc/relaunch");
        smartRouteBuildRoute.withParam("enter_from", str);
        smartRouteBuildRoute.withParam("is_sign_up", ((Boolean) LIZJ.getValue()).booleanValue());
        smartRouteBuildRoute.open();
    }
}
