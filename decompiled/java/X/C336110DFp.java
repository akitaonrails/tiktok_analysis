package X;

import com.ss.android.ugc.aweme.ad.ecp.model.ShopifyEcpCheckout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0DFp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C336110DFp extends C09AY implements Function1<C1023640ckE, Unit> {
    public final /* synthetic */ ShopifyEcpCheckout LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL = "credential.build";
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ C0DF6 LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C336110DFp(C0DF6 c0df6, ShopifyEcpCheckout shopifyEcpCheckout, String str, String str2, String str3, String str4) {
        super(1);
        this.LL = shopifyEcpCheckout;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZLL = str4;
        this.LLIZ = c0df6;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1023640ckE c1023640ckE) {
        C1023640ckE c1023640ckE2 = c1023640ckE;
        C2266581Dnc.LIZ.getClass();
        C1002190cBd c1002190cBd = C2266581Dnc.LJI;
        C0DF2 c0df2 = C0DF2.LIZ;
        ShopifyEcpCheckout shopifyEcpCheckout = this.LL;
        c0df2.getClass();
        c1023640ckE2.withParam(c1002190cBd, C0DF2.LIZ(shopifyEcpCheckout));
        c1023640ckE2.withParam(C2266581Dnc.LJJIIZI, this.LLILLJJLI);
        c1023640ckE2.withParam(C2266581Dnc.LJIIIZ, this.LLILLL);
        c1023640ckE2.withParam(C2266581Dnc.LJIIJ, this.LLILZ);
        c1023640ckE2.withParam(C2266581Dnc.LJJJI, this.LLILZIL);
        c1023640ckE2.withParam(C2266581Dnc.LJJIZ, this.LLILZLL);
        c1023640ckE2.withParam(C2266581Dnc.LJJIJIIJI, C0DF2.LJI(this.LLIZ));
        return Unit.LIZ;
    }
}
