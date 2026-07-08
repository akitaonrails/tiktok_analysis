package X;

import android.os.HandlerThread;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1AED, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AED extends C09AY implements Function0<HandlerThread> {
    public C1AED() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ HandlerThread invoke() {
        HandlerThread handlerThread = new HandlerThread("live_applog_flush");
        handlerThread.start();
        return handlerThread;
    }
}
