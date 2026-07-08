package X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import kotlin.jvm.internal.AFwS199S0000000_12;

/* JADX INFO: renamed from: X.0Uo1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C783270Uo1 {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(107));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(106));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(105));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(104));

    public static Looper LIZ() {
        return C786410Ut5.W2((HandlerThread) LIZJ.getValue());
    }

    public static Looper LIZIZ() {
        return C786410Ut5.W2((HandlerThread) LIZ.getValue());
    }

    public static Handler LIZJ() {
        return (Handler) LIZIZ.getValue();
    }

    public static void LIZLLL(Runnable runnable) {
        C786410Ut5.LJJZZIII((Handler) LIZLLL.getValue(), runnable);
    }

    public static void LJ(Runnable runnable) {
        C786410Ut5.LJJZZIII(LIZJ(), runnable);
    }

    public static void LJFF(Runnable runnable) {
        LIZJ().removeCallbacks(runnable);
    }
}
