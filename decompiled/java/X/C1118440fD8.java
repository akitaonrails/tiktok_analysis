package X;

import android.os.Looper;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0fD8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1118440fD8 {
    public static Function2<? super String, ? super Integer, Unit> LIZ;
    public static boolean LIZIZ;
    public static int LIZLLL;
    public static long LJ;
    public static boolean LJFF;
    public static final BPEAHandler LIZJ = new BPEAHandler(Looper.getMainLooper());
    public static final RunnableC787610Uv1 LJI = RunnableC787610Uv1.LL;

    public static void LIZIZ() {
        if (LIZ == null || GiftManager.inst().findGiftById(LJ) == null) {
            return;
        }
        if (LIZIZ) {
            Function2<? super String, ? super Integer, Unit> function2 = LIZ;
            if (function2 != null) {
                function2.invoke("convenient_gift", Integer.valueOf(LIZLLL));
            }
        } else {
            Function2<? super String, ? super Integer, Unit> function22 = LIZ;
            if (function22 != null) {
                function22.invoke("normal_gift", Integer.valueOf(LIZLLL));
            }
        }
        LJFF = false;
        LIZ = null;
    }

    public static void LIZ(long j, boolean z, Function2 function2) {
        if (LJFF) {
            if (j != LJ) {
                LIZJ.removeCallbacks(LJI);
                LIZIZ();
            } else {
                LIZLLL++;
                BPEAHandler bPEAHandler = LIZJ;
                RunnableC787610Uv1 runnableC787610Uv1 = LJI;
                bPEAHandler.removeCallbacks(runnableC787610Uv1);
                C786410Ut5.LJLIIL(3000L, bPEAHandler, runnableC787610Uv1);
                return;
            }
        }
        LIZ = function2;
        LIZLLL = 1;
        LJFF = true;
        C786410Ut5.LJLIIL(3000L, LIZJ, LJI);
        if (j != LJ) {
            LJ = j;
        }
        LIZIZ = z;
    }
}
