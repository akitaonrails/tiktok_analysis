package X;

import com.bytedance.ies.im.core.send.MessageQueue;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0YTl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C874790YTl extends C09AY implements Function0<C874760YTi> {
    public final /* synthetic */ C874740YTg LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C874790YTl(C874740YTg c874740YTg) {
        super(0);
        this.LL = c874740YTg;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C874760YTi invoke() {
        MessageQueue messageQueue = (MessageQueue) this.LL.LIZLLL.getValue();
        C874740YTg c874740YTg = this.LL;
        return new C874760YTi(messageQueue, c874740YTg.LIZIZ, c874740YTg.LIZJ);
    }
}
