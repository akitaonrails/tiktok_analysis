package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import tikcast.linkmic.controller.ChangeStateReq;
import tikcast.linkmic.controller.ChangeStateResp;

/* JADX INFO: renamed from: X.01vX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C490101vX extends C09AY implements Function1<Throwable, Unit> {
    public final /* synthetic */ C490301vZ LL;
    public final /* synthetic */ Function1<Boolean, Unit> LLILLJJLI;
    public final /* synthetic */ ChangeStateReq LLILLL;
    public final /* synthetic */ C926820aE4<ChangeStateResp> LLILZ;
    public final /* synthetic */ C490701vd LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C490101vX(C490301vZ c490301vZ, Function1<? super Boolean, Unit> function1, ChangeStateReq changeStateReq, C926820aE4<ChangeStateResp> c926820aE4, C490701vd c490701vd) {
        super(1);
        this.LL = c490301vZ;
        this.LLILLJJLI = function1;
        this.LLILLL = changeStateReq;
        this.LLILZ = c926820aE4;
        this.LLILZIL = c490701vd;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th) {
        int i;
        Throwable th2 = th;
        C490301vZ c490301vZ = this.LL;
        c490301vZ.LL.LJFF(3, new C020I(c490301vZ, this.LLILLL, this.LLILZIL, th2, 5));
        Function1<Boolean, Unit> function1 = this.LLILLJJLI;
        if (function1 != null) {
            function1.invoke(Boolean.FALSE);
        }
        int i2 = this.LLILLL.stateType;
        C926820aE4<ChangeStateResp> c926820aE4 = this.LLILZ;
        if (c926820aE4 != null) {
            i = c926820aE4.statusCode;
        } else {
            i = 0;
        }
        C505301xz.LIZ(i2, 0, i, th2);
        return Unit.LIZ;
    }
}
