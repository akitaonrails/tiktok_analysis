package X;

import android.os.HandlerThread;
import android.os.Looper;

/* JADX INFO: renamed from: X.0uLB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public class C1700030uLB {
    public static final Looper LIZ;

    static {
        HandlerThread handlerThread = new HandlerThread("DownloadWatchDog");
        handlerThread.start();
        LIZ = C786410Ut5.W2(handlerThread);
    }
}
