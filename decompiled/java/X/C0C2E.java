package X;

import android.os.HandlerThread;

/* JADX INFO: renamed from: X.0C2E, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0C2E {
    public static final HandlerThread LIZ;

    static {
        HandlerThread handlerThread = new HandlerThread("AVUtilThread");
        LIZ = handlerThread;
        handlerThread.start();
    }
}
