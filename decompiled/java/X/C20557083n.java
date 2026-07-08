package X;

import android.os.HandlerThread;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.083n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C20557083n extends C09AY implements Function0<HandlerThread> {
    public C20557083n() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final HandlerThread invoke() {
        HandlerThread handlerThread = new HandlerThread("engage_info_process_thread");
        handlerThread.start();
        return handlerThread;
    }
}
