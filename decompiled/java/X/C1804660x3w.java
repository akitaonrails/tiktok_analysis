package X;

import org.json.JSONException;

/* JADX INFO: renamed from: X.0x3w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.android.live.walletclean.framework.repository.WalletRepository", f = "WalletRepository.kt", l = {122}, m = "getWalletPackageList")
public final class C1804660x3w extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1804610x3r LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1804660x3w(C1804610x3r c1804610x3r, InterfaceC1364105Vn<? super C1804660x3w> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c1804610x3r;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        C1C7U.LIZ("WalletRepository@2260.getWalletPackageList$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJIIL = this.LLILLJJLI.LJIIL(null, this);
        C1C7U.LIZIZ("WalletRepository@2260.getWalletPackageList$1");
        return objLJIIL;
    }
}
