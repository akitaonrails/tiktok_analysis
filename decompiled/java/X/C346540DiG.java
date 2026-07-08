package X;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.0DiG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C346540DiG extends AbstractC23273099z implements CoroutineExceptionHandler {
    public final int $t;

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void LJJ(CoroutineContext coroutineContext, Throwable th) {
        switch (this.$t) {
            case 0:
                C21290818Tq.LIZIZ("CreationChatLandingMsg", "failed", th);
                break;
            case 1:
                LJJ$1(this, coroutineContext, th);
                break;
            case 2:
                LJJ$2(this, coroutineContext, th);
                break;
            case 3:
                LJJ$3(this, coroutineContext, th);
                break;
            case 4:
                C21290818Tq.LIZIZ("AiChatTrace", "aigcTrace failed", th);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C346540DiG(C2185208hG c2185208hG, int i) {
        super(c2185208hG);
        this.$t = i;
    }

    public static final void LJJ$1(C346540DiG c346540DiG, CoroutineContext coroutineContext, Throwable th) {
        int i = C2187451AjH.LIZ;
        C1720106oR.LIZIZ("MultiViewModel", "sendNoticeAckService onError called", th);
    }

    public static final void LJJ$2(C346540DiG c346540DiG, CoroutineContext coroutineContext, Throwable th) {
        int i = C2187451AjH.LIZ;
        C1720106oR.LIZIZ("MultiViewModel", "sendNoticeAckService onError called", th);
    }

    public static final void LJJ$3(C346540DiG c346540DiG, CoroutineContext coroutineContext, Throwable th) {
        int i = C2187451AjH.LIZ;
        C1720106oR.LIZIZ("MultiViewModel", "sendNoticeAckService onError called", th);
    }
}
