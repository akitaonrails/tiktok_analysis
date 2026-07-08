package X;

import android.os.HandlerThread;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0NBP, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NBP extends C09AY implements Function0<HandlerThread> {
    public C0NBP() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final HandlerThread invoke() {
        HandlerThread handlerThread = new HandlerThread("milo-handler-thread");
        handlerThread.start();
        return handlerThread;
    }
}
