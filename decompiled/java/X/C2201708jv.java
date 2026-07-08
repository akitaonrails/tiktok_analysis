package X;

import com.ss.android.ugc.aweme.setting.AccountAttributesApi;

/* JADX INFO: renamed from: X.08jv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.setting.AccountAttributesApi", f = "AccountAttributesApi.kt", l = {35}, m = "getAccountAttributes")
public final class C2201708jv extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ AccountAttributesApi LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2201708jv(AccountAttributesApi accountAttributesApi, InterfaceC1364105Vn<? super C2201708jv> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = accountAttributesApi;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AccountAttributesApi@8708.getAccountAttributes$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLJJLI.LIZ(this);
        C1C7U.LIZIZ("AccountAttributesApi@8708.getAccountAttributes$1");
        return objLIZ;
    }
}
