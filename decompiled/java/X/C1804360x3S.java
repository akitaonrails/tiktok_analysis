package X;

import webcast.api.profit.ListV3Result;

/* JADX INFO: renamed from: X.0x3S, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.android.live.walletclean.domain.usecase.packagelist.v3.GetPackageListV3UseCase", f = "GetPackageListV3UseCase.kt", l = {61}, m = "getIapPackage")
public final class C1804360x3S extends AbstractC23140094w {
    public ListV3Result LL;
    public C13BV LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C1804300x3M LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1804360x3S(C1804300x3M c1804300x3M, InterfaceC1364105Vn<? super C1804360x3S> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c1804300x3M;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GetPackageListV3UseCase@c08f.getIapPackage$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLJIIJJI = this.LLILZ.LJIIJJI(null, null, this);
        C1C7U.LIZIZ("GetPackageListV3UseCase@c08f.getIapPackage$1");
        return objLJIIJJI;
    }
}
