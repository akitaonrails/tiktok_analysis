package X;

import com.ss.android.ugc.aweme.account.otl.WebAuthSyncLoginApi;

/* JADX INFO: renamed from: X.0WW3, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.otl.WebAuthSyncLoginApi", f = "WebAuthSyncLoginApi.kt", l = {47}, m = "getWebAuthToken")
public final class C0WW3 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ WebAuthSyncLoginApi LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0WW3(WebAuthSyncLoginApi webAuthSyncLoginApi, InterfaceC1364105Vn<? super C0WW3> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = webAuthSyncLoginApi;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("WebAuthSyncLoginApi@b7ac.getWebAuthToken$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLJJLI.LIZ(null, null, null, this);
        C1C7U.LIZIZ("WebAuthSyncLoginApi@b7ac.getWebAuthToken$1");
        return objLIZ;
    }
}
