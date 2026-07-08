package X;

import android.content.Context;
import com.bytedance.keva.Keva;
import com.bytedance.tux.icon.TuxIconView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AwS600S0100000_21;

/* JADX INFO: renamed from: X.0lAQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1347400lAQ {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(496));
    public static long LIZIZ = -1;
    public static long LIZJ = -1;
    public static int LIZLLL = -1;

    public static Keva LIZ() {
        return (Keva) LIZ.getValue();
    }

    public static boolean LIZIZ() {
        if (LIZIZ == -1) {
            LIZIZ = LIZ().getLong("key_last_click_audio_timestamp", -1L);
        }
        if (LIZIZ > 0) {
            return false;
        }
        if (LIZJ == -1) {
            LIZJ = LIZ().getLong("key_last_show_timestamp", -1L);
        }
        return System.currentTimeMillis() - LIZJ >= 1209600000;
    }

    public static C0P0T LIZJ(Context context, TuxIconView tuxIconView, Function0 function0) {
        C450720Hlu c450720Hlu = new C450720Hlu(context);
        c450720Hlu.LLILLJJLI.LIZIZ = tuxIconView;
        c450720Hlu.LJIIJ(2131826738);
        EnumC1235690iGF enumC1235690iGF = EnumC1235690iGF.END;
        C1391600mJi c1391600mJi = c450720Hlu.LLILLJJLI;
        c1391600mJi.LIZLLL = enumC1235690iGF;
        c1391600mJi.LJIJJ = true;
        c1391600mJi.LJIIL = true;
        c450720Hlu.LIZJ(new AwS600S0100000_21(function0, (Function0<Unit>) 291));
        C0P0T c0p0tLIZIZ = c450720Hlu.LIZIZ();
        c0p0tLIZIZ.show();
        if (LIZLLL == -1) {
            LIZLLL = LIZ().getBoolean("key_has_shown_guide", false) ? 1 : 0;
        }
        if (LIZLLL == 1) {
            if (LIZIZ == -1) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                LIZIZ = jCurrentTimeMillis;
                LIZ().storeLong("key_last_click_audio_timestamp", jCurrentTimeMillis);
            }
        } else {
            LIZLLL = 1;
            LIZ().storeBoolean("key_has_shown_guide", true);
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        LIZJ = jCurrentTimeMillis2;
        LIZ().storeLong("key_last_show_timestamp", jCurrentTimeMillis2);
        return c0p0tLIZIZ;
    }
}
