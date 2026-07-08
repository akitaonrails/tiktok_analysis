package X;

/* JADX INFO: renamed from: X.0x3U, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.android.live.walletclean.domain.usecase.packagelist.v1.GetWalletPackageListUseCase", f = "GetWalletPackageListUseCase.kt", l = {27}, m = "execute")
public final class C1804380x3U extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1804340x3Q LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1804380x3U(C1804340x3Q c1804340x3Q, InterfaceC1364105Vn<? super C1804380x3U> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c1804340x3Q;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Exception {
        C1C7U.LIZ("GetWalletPackageListUseCase@938b.execute$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJFF = this.LLILLJJLI.LJFF(null, this);
        C1C7U.LIZIZ("GetWalletPackageListUseCase@938b.execute$1");
        return objLJFF;
    }
}
