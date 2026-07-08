package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0YK1, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.usecase.getmsgbyuser.combo.DefaultComboGetMsgByUserUseCase", f = "DefaultComboGetMsgByUserUseCase.kt", l = {451}, m = "fetchResponse-0E7RQCE")
public final class C0YK1 extends AbstractC23140094w {
    public Object LL;
    public Function1 LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C872170YJj LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0YK1(C872170YJj c872170YJj, InterfaceC1364105Vn<? super C0YK1> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c872170YJj;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DefaultComboGetMsgByUserUseCase@23a3.fetchResponse$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLIZLLL = this.LLILZ.LIZLLL(null, this, null);
        if (objLIZLLL == C099R.LJFF()) {
            C1C7U.LIZIZ("DefaultComboGetMsgByUserUseCase@23a3.fetchResponse$1");
            return objLIZLLL;
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objLIZLLL);
        C1C7U.LIZIZ("DefaultComboGetMsgByUserUseCase@23a3.fetchResponse$1");
        return c189200o6M1boximpl;
    }
}
