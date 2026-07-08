package X;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.0Kdc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C522020Kdc extends AbstractC23273099z implements CoroutineExceptionHandler {
    public final int $t;

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void LJJ(CoroutineContext coroutineContext, Throwable th) {
        switch (this.$t) {
            case 0:
                C1CC2.LIZ("initAIReply", th);
                break;
            case 1:
                LJJ$1(this, coroutineContext, th);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C522020Kdc(C2185208hG c2185208hG, int i) {
        super(c2185208hG);
        this.$t = i;
    }

    public static final void LJJ$1(C522020Kdc c522020Kdc, CoroutineContext coroutineContext, Throwable th) {
        C20441214yg.LJI("GiftPanelLeafV2.coroutine", th);
        C1AF0.LJFF(th, "GiftPanelLeafV2.coroutine");
    }
}
