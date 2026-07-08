package X;

import android.os.HandlerThread;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.084j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C20579084j extends C09AY implements Function0<HandlerThread> {
    public C20579084j() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final HandlerThread invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("saf-preload-");
        sbLIZ.append(System.currentTimeMillis());
        HandlerThread handlerThread = new HandlerThread(C2188811AlT.LIZIZ(sbLIZ));
        handlerThread.start();
        return handlerThread;
    }
}
