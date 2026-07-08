package X;

import com.ss.android.ugc.aweme.account.login.v2.network.GSMAApi;

/* JADX INFO: renamed from: X.0iLM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.login.v2.network.GSMAApi", f = "GSMAApi.kt", l = {88}, m = "sendGSMACode")
public final class C1238860iLM extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ GSMAApi LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1238860iLM(GSMAApi gSMAApi, InterfaceC1364105Vn<? super C1238860iLM> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = gSMAApi;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GSMAApi@7471.sendGSMACode$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZJ = this.LLILLJJLI.LIZJ(null, false, this);
        C1C7U.LIZIZ("GSMAApi@7471.sendGSMACode$1");
        return objLIZJ;
    }
}
