package X;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.0Syq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C739020Syq extends AbstractC23273099z implements CoroutineExceptionHandler {
    public final int $t;

    public static final void LJJ$0(C739020Syq c739020Syq, CoroutineContext coroutineContext, Throwable th) {
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void LJJ(CoroutineContext coroutineContext, Throwable th) {
        switch (this.$t) {
            case 0:
                LJJ$0(this, coroutineContext, th);
                break;
            case 1:
                LJJ$1(this, coroutineContext, th);
                break;
            case 2:
                LJJ$2(this, coroutineContext, th);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C739020Syq(C2185208hG c2185208hG, int i) {
        super(c2185208hG);
        this.$t = i;
    }

    public static final void LJJ$1(C739020Syq c739020Syq, CoroutineContext coroutineContext, Throwable th) {
        C2276411E8h.LIZIZ.log("common_feed", "Error doDislike in DislikeAssem");
    }

    public static final void LJJ$2(C739020Syq c739020Syq, CoroutineContext coroutineContext, Throwable th) {
        C2276411E8h.LIZIZ.log("common_feed", "Error doDislikeCancel in DislikeAssem");
    }
}
