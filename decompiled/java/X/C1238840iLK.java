package X;

import com.ss.android.ugc.aweme.account.login.v2.network.GSMAApi;

/* JADX INFO: renamed from: X.0iLK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.login.v2.network.GSMAApi", f = "GSMAApi.kt", l = {70}, m = "getGSMARedirectUrl")
public final class C1238840iLK extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ GSMAApi LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1238840iLK(GSMAApi gSMAApi, InterfaceC1364105Vn<? super C1238840iLK> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = gSMAApi;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GSMAApi@7471.getGSMARedirectUrl$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLJJLI.LIZ(null, 0, false, this);
        C1C7U.LIZIZ("GSMAApi@7471.getGSMARedirectUrl$1");
        return objLIZ;
    }
}
