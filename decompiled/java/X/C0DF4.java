package X;

import com.ss.android.ugc.aweme.ad.ecp.model.ShopifyEcpCheckout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0DF4, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DF4 extends C09AY implements Function1<C1023640ckE, Unit> {
    public final /* synthetic */ ShopifyEcpCheckout LL;
    public final /* synthetic */ C0DF3 LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ C0DF6 LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0DF4(C0DF6 c0df6, ShopifyEcpCheckout shopifyEcpCheckout, C0DF3 c0df3, String str) {
        super(1);
        this.LL = shopifyEcpCheckout;
        this.LLILLJJLI = c0df3;
        this.LLILLL = str;
        this.LLILZ = c0df6;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1023640ckE c1023640ckE) {
        String str;
        String str2;
        C1023640ckE c1023640ckE2 = c1023640ckE;
        C2266601Dne.LIZ.getClass();
        C1002190cBd c1002190cBd = C2266601Dne.LJI;
        C0DF2 c0df2 = C0DF2.LIZ;
        ShopifyEcpCheckout shopifyEcpCheckout = this.LL;
        c0df2.getClass();
        c1023640ckE2.withParam(c1002190cBd, C0DF2.LIZ(shopifyEcpCheckout));
        c1023640ckE2.withParam(C2266601Dne.LJJIIZI, C0DF2.LJII(this.LL));
        C1002190cBd c1002190cBd2 = C2266601Dne.LJIIIZ;
        C0DF3 c0df3 = this.LLILLJJLI;
        String str3 = null;
        if (c0df3 != null) {
            str = c0df3.LIZ;
        } else {
            str = null;
        }
        c1023640ckE2.withParam(c1002190cBd2, str);
        C1002190cBd c1002190cBd3 = C2266601Dne.LJIIJ;
        C0DF3 c0df32 = this.LLILLJJLI;
        if (c0df32 != null) {
            str2 = c0df32.LIZIZ;
        } else {
            str2 = null;
        }
        c1023640ckE2.withParam(c1002190cBd3, str2);
        c1023640ckE2.withParam(C2266601Dne.LJJJI, this.LLILLL);
        C1002190cBd c1002190cBd4 = C2266601Dne.LJJIZ;
        C0DF3 c0df33 = this.LLILLJJLI;
        if (c0df33 != null) {
            str3 = c0df33.LIZJ;
        }
        c1023640ckE2.withParam(c1002190cBd4, str3);
        c1023640ckE2.withParam(C2266601Dne.LJJIJIIJI, C0DF2.LJI(this.LLILZ));
        return Unit.LIZ;
    }
}
