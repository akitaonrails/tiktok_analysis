package X;

/* JADX INFO: renamed from: X.0x3L, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.android.live.walletclean.domain.usecase.packagelist.BaseGetPackageListUseCase", f = "BaseGetPackageListUseCase.kt", l = {58, 64, 78, 86, 95, 101, 123}, m = "execute$suspendImpl")
public final class C1804290x3L<WALLET_PACKAGE> extends AbstractC23140094w {
    public AbstractC1804230x3F LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public Object LLILZIL;
    public /* synthetic */ Object LLILZLL;
    public final /* synthetic */ AbstractC1804230x3F<WALLET_PACKAGE> LLIZ;
    public int LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1804290x3L(AbstractC1804230x3F<WALLET_PACKAGE> abstractC1804230x3F, InterfaceC1364105Vn<? super C1804290x3L> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLIZ = abstractC1804230x3F;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws C1803880x2g {
        C1C7U.LIZ("BaseGetPackageListUseCase@badf.execute$1");
        this.LLILZLL = obj;
        this.LLIZLLLIL |= Integer.MIN_VALUE;
        Object objLJIIIZ = AbstractC1804230x3F.LJIIIZ(this.LLIZ, null, this);
        C1C7U.LIZIZ("BaseGetPackageListUseCase@badf.execute$1");
        return objLJIIIZ;
    }
}
