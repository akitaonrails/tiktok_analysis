package X;

import com.ss.android.ugc.aweme.ecommerce.search.result.api.EcSearchApi;

/* JADX INFO: renamed from: X.0Qde, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.result.api.EcSearchApi", f = "EcSearchApi.kt", l = {315}, m = "ackEcSearchBubble")
public final class C674920Qde extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ EcSearchApi LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C674920Qde(EcSearchApi ecSearchApi, InterfaceC1364105Vn<? super C674920Qde> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = ecSearchApi;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EcSearchApi@a7a3.ackEcSearchBubble$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLJJLI.LIZ(0, this);
        C1C7U.LIZIZ("EcSearchApi@a7a3.ackEcSearchBubble$1");
        return objLIZ;
    }
}
