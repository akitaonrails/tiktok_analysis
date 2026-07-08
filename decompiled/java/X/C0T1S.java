package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0T1S, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0T1S {
    public static long LIZIZ;
    public static int LIZJ;
    public static int LJFF;
    public static boolean LJI;
    public static boolean LJII;
    public static boolean LJIIIIZZ;
    public static boolean LJIIIZ;
    public static boolean LJIIJ;
    public static final C0T1S LIZ = new C0T1S();
    public static String LIZLLL = "";
    public static String LJ = "";

    public static void LIZ(HashMap map) {
        long j;
        int i;
        String str = (String) map.get("click_timestamp");
        String str2 = (String) map.get("card_status");
        String str3 = (String) map.get("click_area");
        String str4 = (String) map.get("page_size");
        String str5 = (String) map.get("single_player");
        map.get("enter_from");
        if (str != null) {
            j = CastLongProtector.parseLong(str);
        } else {
            j = 0;
        }
        LIZIZ = j;
        if (str2 == null) {
            str2 = "";
        }
        LIZLLL = str2;
        if (str3 == null) {
            str3 = "";
        }
        LJ = str3;
        int i2 = 0;
        if (str4 != null) {
            i = CastIntegerProtector.parseInt(str4);
        } else {
            i = 0;
        }
        LIZJ = i;
        if (str5 != null) {
            i2 = CastIntegerProtector.parseInt(str5);
        }
        LJFF = i2;
    }

    public static final void LIZJ(String str, String str2) {
        try {
            LIZ.getClass();
            if (LIZIZ(str, str2, "", "") && !LJIIIIZZ) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LIZLLL(jCurrentTimeMillis - LIZIZ, "duration");
                c2344009Gk.LIZJ(LIZJ, "page_size");
                c2344009Gk.LJIIIIZZ("card_status", LIZLLL);
                c2344009Gk.LJIIIIZZ("click_area", LJ);
                c2344009Gk.LIZJ(LJFF, "single_player");
                c2344009Gk.LJIIIIZZ("enter_from", str2);
                C20684815ws.LJIILLIIL("rd_tiktokec_mall_video_view_cell_created", c2344009Gk.LIZ);
                LJIIIIZZ = true;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static boolean LIZIZ(String str, String str2, String str3, String str4) {
        if (Intrinsics.LJFF("from_ttmall_homepage", str) && Intrinsics.LJFF("mall", str2) && Intrinsics.LJFF(str3, str4)) {
            return true;
        }
        return false;
    }
}
