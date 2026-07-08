package X;

import com.ss.android.ugc.aweme.amazon.service.AmazonCheckoutAdServiceImpl;

/* JADX INFO: renamed from: X.0deE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.amazon.service.AmazonCheckoutAdServiceImpl", f = "AmazonCheckoutAdServiceImpl.kt", l = {23}, m = "unlinkAmazonCheckoutRequest")
public final class C1058360deE extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ AmazonCheckoutAdServiceImpl LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1058360deE(AmazonCheckoutAdServiceImpl amazonCheckoutAdServiceImpl, InterfaceC1364105Vn<? super C1058360deE> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = amazonCheckoutAdServiceImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AmazonCheckoutAdServiceImpl@573b.unlinkAmazonCheckoutRequest$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLJJLI.LIZIZ(this);
        C1C7U.LIZIZ("AmazonCheckoutAdServiceImpl@573b.unlinkAmazonCheckoutRequest$1");
        return objLIZIZ;
    }
}
