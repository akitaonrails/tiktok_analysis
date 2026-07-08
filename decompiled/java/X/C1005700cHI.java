package X;

import android.os.SystemClock;
import java.util.Locale;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0cHI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1005700cHI {
    public static final C1005700cHI LIZ = new C1005700cHI();

    public static void LIZ(C1005700cHI c1005700cHI, Integer num, String str, String str2, String str3, long j, boolean z, boolean z2, int i) {
        EnumC1005710cHJ enumC1005710cHJ;
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 32) != 0) {
            z = false;
        }
        if ((i & 64) != 0) {
            z2 = false;
        }
        c1005700cHI.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZLLL(jElapsedRealtime - j, "duration");
        c2344009Gk.LJFF("platform", str2.toLowerCase(Locale.getDefault()));
        if (a0.LJJIIZI(str3, "pop", true)) {
            enumC1005710cHJ = EnumC1005710cHJ.POPUP;
        } else {
            enumC1005710cHJ = EnumC1005710cHJ.CARD;
        }
        c2344009Gk.LJFF("scene_type", enumC1005710cHJ.getValue());
        c2344009Gk.LJ(Boolean.valueOf(z2), "isAfterAuth");
        c2344009Gk.LJ(Boolean.valueOf(z), "isPlatformOnly");
        if (num == null) {
            c2344009Gk.LJFF("result", EnumC1005110cGL.FAIL.getValue());
            c2344009Gk.LJFF("reason", str);
        } else if (num.intValue() == 0) {
            c2344009Gk.LJFF("result", EnumC1005110cGL.EMPTY.getValue());
        } else {
            c2344009Gk.LJFF("result", EnumC1005110cGL.SUCCESS.getValue());
        }
        C20684815ws.LJIILLIIL("recommend_after_permission_monitor", c2344009Gk.LIZ);
    }
}
