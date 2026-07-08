package X;

import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PUg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C645680PUg {
    public static final C645680PUg LIZ = new C645680PUg();
    public static boolean LIZIZ;
    public static boolean LIZJ;

    public static final void LIZ(String str, String str2, String str3, String str4) {
        long j;
        try {
            LIZ.getClass();
            if (Intrinsics.LJFF("goods_search", str) && Intrinsics.LJFF("goods_search", str2) && Intrinsics.LJFF(str3, str4) && !LIZJ && !LIZIZ) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                C651970Phj.LLILLL.getClass();
                String str5 = (String) C651980Phk.LIZIZ(str2).get("start_click_time");
                if (str5 != null) {
                    j = CastLongProtector.parseLong(str5);
                } else {
                    j = 0;
                }
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("enter_from", str2);
                c2344009Gk.LJIIIIZZ("aweme_id", str4);
                if (j > 0) {
                    c2344009Gk.LIZLLL(jCurrentTimeMillis - j, "duration");
                }
                C20684815ws.LJIILLIIL("rd_tiktokec_shop_search_video_page_load", c2344009Gk.LIZ);
                LIZJ = true;
                LIZIZ = true;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
        }
    }
}
