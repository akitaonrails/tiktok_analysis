package X;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.0wJw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public class C1776140wJw extends AbstractC23273099z implements CoroutineExceptionHandler {
    public final int $t;

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void LJJ(CoroutineContext coroutineContext, Throwable th) {
        switch (this.$t) {
            case 0:
                LJJ$0(this, coroutineContext, th);
                break;
            case 1:
                C1AF0.LJ(th);
                break;
            case 2:
                C1716030ukz.LIZ(false);
                break;
            case 3:
                C1AF0.LJ(th);
                break;
            case 4:
                C1AF0.LJ(th);
                break;
            case 5:
                C1AF0.LJ(th);
                break;
            case 6:
                C1AF0.LJ(th);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1776140wJw(C2185208hG c2185208hG, int i) {
        super(c2185208hG);
        this.$t = i;
    }

    public static final void LJJ$0(C1776140wJw c1776140wJw, CoroutineContext coroutineContext, Throwable th) {
    }
}
