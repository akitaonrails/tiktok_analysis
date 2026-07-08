package X;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.12Yv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public class C19775512Yv extends AbstractC23273099z implements CoroutineExceptionHandler {
    public final int $t;
    public Object l0;

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void LJJ(CoroutineContext coroutineContext, Throwable th) {
        switch (this.$t) {
            case 0:
                LJJ$0(this, coroutineContext, th);
                break;
            case 1:
                LJJ$1(this, coroutineContext, th);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19775512Yv(C2185208hG c2185208hG, C11Y7 c11y7, int i) {
        super(c2185208hG);
        this.$t = i;
        this.l0 = c11y7;
    }

    public static final void LJJ$0(C19775512Yv c19775512Yv, CoroutineContext coroutineContext, Throwable th) {
        ((C11Y7) c19775512Yv.l0).U9("");
    }

    public static final void LJJ$1(C19775512Yv c19775512Yv, CoroutineContext coroutineContext, Throwable th) {
        C11YC c11yc = ((C11Y7) c19775512Yv.l0).LLLJ;
        String message = th.getMessage();
        if (message == null) {
            message = "unknow error";
        }
        c11yc.LIZIZ(message);
        ((C11Y7) c19775512Yv.l0).LLLJ.LIZ(900);
        ((C11Y7) c19775512Yv.l0).LLLJ.LIZJ(C11YJ.CLIENT.getValue());
        ((C11Y7) c19775512Yv.l0).LLLJ.LIZLLL();
        ((C11Y7) c19775512Yv.l0).U9("");
    }
}
