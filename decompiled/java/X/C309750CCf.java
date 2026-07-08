package X;

import android.os.HandlerThread;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0CCf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C309750CCf extends C09AY implements Function0<HandlerThread> {
    public C309750CCf() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final HandlerThread invoke() {
        HandlerThread handlerThread = new HandlerThread("DowngradeThread-Top");
        handlerThread.start();
        return handlerThread;
    }
}
