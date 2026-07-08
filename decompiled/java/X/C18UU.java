package X;

import android.os.SystemClock;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.18UU, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final /* synthetic */ class C18UU extends C2217421BqW implements Function0<Unit> {
    public C18UU(C18UQ c18uq) {
        super(0, c18uq, C18UQ.class, "onStartSendMessageToServer", "onStartSendMessageToServer()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C18UQ c18uq = (C18UQ) this.receiver;
        C18UT c18utLJIIIZ = c18uq.LJIIIZ();
        if (c18utLJIIIZ != null) {
            c18utLJIIIZ.LIZIZ = C18UV.SEND_TO_SERVER;
            C21290818Tq.LIZJ("AiChatSendMessageStageTracker", "onStartSendMessageToServer");
            c18utLJIIIZ.LJI = Long.valueOf(SystemClock.uptimeMillis());
        }
        c18uq.LJIIJ(true, C18UV.SEND_TO_SERVER, true, null, null);
        return Unit.LIZ;
    }
}
