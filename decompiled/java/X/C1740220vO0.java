package X;

import android.app.Activity;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.ug.popup.view.ShopTabOverlayActivity;
import java.util.Map;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0vO0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1740220vO0 {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZIZ(Map map) {
        Object obj;
        String string;
        if (map != null && (obj = map.get("is_indirectly_pdp")) != null && (string = obj.toString()) != null && !a0.LJJJIL(string)) {
            return false;
        }
        return true;
    }

    public static void LIZ(EnumC1740250vO3 enumC1740250vO3, Activity activity, Map map) {
        int iIntValue;
        String string;
        String string2;
        Integer numLJIIJJI;
        String string3;
        Integer numLJIIJJI2;
        if (map != null && C1740230vO1.LIZ(map)) {
            Object obj = map.get("need_overlay");
            if (obj != null && (string3 = obj.toString()) != null && (numLJIIJJI2 = C2095008Iq.LJIIJJI(string3)) != null) {
                numLJIIJJI2.intValue();
            }
            Object obj2 = map.get("after_landing_draw");
            if (obj2 != null && (string2 = obj2.toString()) != null && (numLJIIJJI = C2095008Iq.LJIIJJI(string2)) != null) {
                iIntValue = numLJIIJJI.intValue();
            } else {
                iIntValue = 0;
            }
            int i = C1740240vO2.LIZ[enumC1740250vO3.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        if (iIntValue > 0) {
                            C1435305jb.LIZIZ(((long) iIntValue) * 1000, "draw_end_resume_native");
                            return;
                        }
                        return;
                    }
                    throw new C1954807lC();
                }
                if (activity != null) {
                    try {
                        C1740300vO8.LIZ.getClass();
                        if (activity.getClass() == ShopTabOverlayActivity.class && !activity.isFinishing()) {
                            activity.finish();
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
                C1435305jb.LIZ("page_close_resume");
                Object obj3 = map.get("ec_ug_landing_uuid");
                if (obj3 != null) {
                    string = obj3.toString();
                } else {
                    string = null;
                }
                if (!C123100dR.LIZ(string)) {
                    return;
                }
                C1740260vO4.LIZ.getClass();
                C1740260vO4.LIZ(string);
            }
        }
    }
}
