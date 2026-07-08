package X;

/* JADX INFO: renamed from: X.0x3u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.android.live.walletclean.framework.repository.WalletRepository", f = "WalletRepository.kt", l = {146}, m = "getGooglePackageList")
public final class C1804640x3u extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1804610x3r LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1804640x3u(C1804610x3r c1804610x3r, InterfaceC1364105Vn<? super C1804640x3u> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c1804610x3r;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("WalletRepository@2260.getGooglePackageList$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJII = this.LLILLJJLI.LJII(null, this);
        C1C7U.LIZIZ("WalletRepository@2260.getGooglePackageList$1");
        return objLJII;
    }
}
