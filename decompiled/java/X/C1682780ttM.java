package X;

import com.ss.android.ugc.aweme.account.org.create.OrgAccountsInfoApi;

/* JADX INFO: renamed from: X.0ttM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.org.create.OrgAccountsInfoApi", f = "OrgAccountsInfoApi.kt", l = {26}, m = "fetchOrgAccounts")
public final class C1682780ttM extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ OrgAccountsInfoApi LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1682780ttM(OrgAccountsInfoApi orgAccountsInfoApi, InterfaceC1364105Vn<? super C1682780ttM> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = orgAccountsInfoApi;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OrgAccountsInfoApi@906a.fetchOrgAccounts$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLJJLI.LIZ(this);
        C1C7U.LIZIZ("OrgAccountsInfoApi@906a.fetchOrgAccounts$1");
        return objLIZ;
    }
}
