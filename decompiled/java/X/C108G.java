package X;

import android.content.Context;
import com.bytedance.keva.Keva;
import com.bytedance.router.SmartRouter;
import kotlin.jvm.internal.AFwS215S0000000_26;

/* JADX INFO: renamed from: X.108G, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C108G {
    public static final C108G LIZ = new C108G();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(379));
    public static int LIZJ = -1;
    public static long LIZLLL;

    public static void LIZIZ(Integer num) {
        if (LIZJ == -1) {
            LIZJ = ((Keva) LIZIZ.getValue()).getInt("show_count", 0);
        }
        int i = LIZJ;
        int i2 = i + 1;
        if (i2 != i) {
            LIZJ = i2;
            ((Keva) LIZIZ.getValue()).storeInt("show_count", i2);
        }
        LIZLLL = System.currentTimeMillis();
        C1163504gr c1163504gr = C1163504gr.LIZIZ;
        C191969108h c191969108h = new C191969108h();
        if (num != null) {
            int iIntValue = num.intValue();
            LIZ.getClass();
            if (iIntValue != 3) {
                if (iIntValue == 4) {
                    iIntValue = 2;
                }
            } else {
                iIntValue = 1;
            }
            c191969108h.LIZ(iIntValue, "user_type");
        }
        c191969108h.LIZJ("enter_from", "privacy_settings");
        LIZ.getClass();
        if (LIZJ == -1) {
            LIZJ = ((Keva) LIZIZ.getValue()).getInt("show_count", 0);
        }
        c191969108h.LIZ(LIZJ, "trigger_time");
        c1163504gr.onEventV3("enter_age_grad_banner", c191969108h.LIZ);
    }

    public static void LIZ(Context context, String str, Integer num) {
        SmartRouter.buildRoute(context, str).open();
        C1163504gr c1163504gr = C1163504gr.LIZIZ;
        C191969108h c191969108h = new C191969108h();
        if (num != null) {
            int iIntValue = num.intValue();
            LIZ.getClass();
            if (iIntValue != 3) {
                if (iIntValue == 4) {
                    iIntValue = 2;
                }
            } else {
                iIntValue = 1;
            }
            c191969108h.LIZ(iIntValue, "user_type");
        }
        c191969108h.LIZJ("enter_from", "enter_age_grad_banner");
        c191969108h.LIZIZ(System.currentTimeMillis() - LIZLLL, "duration");
        c191969108h.LIZ(1, "exit_method");
        c1163504gr.onEventV3("click_age_grad_banner", c191969108h.LIZ);
    }
}
