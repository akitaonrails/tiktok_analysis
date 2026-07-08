package X;

import android.os.SystemClock;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX INFO: renamed from: X.13UT, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13UT {
    public static final C13UT LIZ = new C13UT();
    public static final FutureC199576136w LIZIZ = new FutureC199576136w();
    public static final Keva LIZJ = Keva.getRepo("music_dsp_df_repo");
    public static final C199578136y LIZLLL = C199578136y.LIZ;

    public static void LIZ(int i) {
        LIZLLL.getClass();
        C199578136y.LIZIZ = SystemClock.elapsedRealtime();
        Keva keva = LIZJ;
        boolean z = false;
        int i2 = keva.getInt("try_times", 0) + 1;
        if (i == 0) {
            z = true;
        }
        FutureC199576136w futureC199576136w = LIZIZ;
        if (z) {
            futureC199576136w.LLILLJJLI.set(4);
        } else {
            futureC199576136w.LLILLJJLI.set(3);
        }
        futureC199576136w.LL.release();
        keva.storeInt("try_times", i2);
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(i, "prepare_result");
        c2344009Gk.LIZLLL(C199578136y.LIZIZ - C199578136y.LIZJ, "prepare_till_end");
        c2344009Gk.LIZJ(i2, "try_times");
        if (i == 0) {
            if (C199578136y.LIZIZ >= C199578136y.LIZLLL) {
                c2344009Gk.LJFF("first_access_till_success", String.valueOf(C199578136y.LIZIZ - C199578136y.LIZLLL));
                c2344009Gk.LIZJ(C199578136y.LJ, "access_type");
            } else {
                c2344009Gk.LJFF("first_access_till_success", CardStruct.IStatusCode.DEFAULT);
                c2344009Gk.LIZJ(1, "access_type");
            }
        }
    }
}
