package X;

import android.os.HandlerThread;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0C2D, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0C2D extends C09AY implements Function0<HandlerThread> {
    public C0C2D() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final HandlerThread invoke() {
        HandlerThread handlerThread = new HandlerThread("tracker-serial-t-handler-thread");
        handlerThread.start();
        return handlerThread;
    }
}
