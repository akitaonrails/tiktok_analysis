package X;

import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;

/* JADX INFO: renamed from: X.01Gm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C305801Gm {
    public static long LIZ;
    public static final /* synthetic */ int LIZIZ = 0;

    public static void LIZ(int i) {
        C766270U4b.LJIIJJI(C497740JfY.LJII().getString(i));
        LIZ = C445101oH.LIZ();
    }

    public static void LIZIZ(int i) {
        String string = C497740JfY.LJII().getString(i);
        long jLIZ = C445101oH.LIZ();
        long j = LIZ;
        long j2 = jLIZ - j;
        if (j != 0 && j2 < 2000) {
            C786410Ut5.LJLIIL(j2, new BPEAHandler(Looper.getMainLooper()), new RunnableC514701zV(string, 2));
        } else {
            C766270U4b.LJIIJJI(string);
        }
        LIZ = 0L;
    }
}
