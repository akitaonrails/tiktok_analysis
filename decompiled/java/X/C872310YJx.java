package X;

/* JADX INFO: renamed from: X.0YJx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.usecase.getmsgbyuser.combo.DefaultComboGetMsgByUserUseCase", f = "DefaultComboGetMsgByUserUseCase.kt", l = {328, 343, 397}, m = "fetchOnePageResponse-BWLJW6A")
public final class C872310YJx extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public Object LLILZIL;
    public Object LLILZLL;
    public long LLIZ;
    public /* synthetic */ Object LLIZLLLIL;
    public final /* synthetic */ C872170YJj LLJ;
    public int LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C872310YJx(C872170YJj c872170YJj, InterfaceC1364105Vn<? super C872310YJx> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLJ = c872170YJj;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DefaultComboGetMsgByUserUseCase@23a3.fetchOnePageResponse$1");
        this.LLIZLLLIL = obj;
        this.LLJI |= Integer.MIN_VALUE;
        Object objLIZJ = this.LLJ.LIZJ(null, this, null, null);
        if (objLIZJ == C099R.LJFF()) {
            C1C7U.LIZIZ("DefaultComboGetMsgByUserUseCase@23a3.fetchOnePageResponse$1");
            return objLIZJ;
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objLIZJ);
        C1C7U.LIZIZ("DefaultComboGetMsgByUserUseCase@23a3.fetchOnePageResponse$1");
        return c189200o6M1boximpl;
    }
}
