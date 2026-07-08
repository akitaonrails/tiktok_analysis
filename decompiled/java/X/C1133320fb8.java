package X;

/* JADX INFO: renamed from: X.0fb8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.gift.base.platform.business.giftbasic.data.datasource.RemoteDataSource", f = "RemoteDataSource.kt", l = {99}, m = "fetchGiftPages-gIAlu-s")
public final class C1133320fb8 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1133290fb5 LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1133320fb8(C1133290fb5 c1133290fb5, InterfaceC1364105Vn<? super C1133320fb8> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c1133290fb5;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RemoteDataSource@33a9.fetchGiftPages$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLJJLI.LIZ(null, this);
        if (objLIZ == C099R.LJFF()) {
            C1C7U.LIZIZ("RemoteDataSource@33a9.fetchGiftPages$1");
            return objLIZ;
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objLIZ);
        C1C7U.LIZIZ("RemoteDataSource@33a9.fetchGiftPages$1");
        return c189200o6M1boximpl;
    }
}
