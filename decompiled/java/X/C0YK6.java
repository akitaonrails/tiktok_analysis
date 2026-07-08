package X;

/* JADX INFO: renamed from: X.0YK6, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.usecase.getmsgbyuser.combo.DefaultComboGetMsgByUserUseCase", f = "DefaultComboGetMsgByUserUseCase.kt", l = {496}, m = "onPullMsgEndWithError")
public final class C0YK6 extends AbstractC23140094w {
    public int LL;
    public C872330YJz LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C872170YJj LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0YK6(C872170YJj c872170YJj, InterfaceC1364105Vn<? super C0YK6> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c872170YJj;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DefaultComboGetMsgByUserUseCase@23a3.onPullMsgEndWithError$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLJII = this.LLILZ.LJII(0, null, this);
        C1C7U.LIZIZ("DefaultComboGetMsgByUserUseCase@23a3.onPullMsgEndWithError$1");
        return objLJII;
    }
}
