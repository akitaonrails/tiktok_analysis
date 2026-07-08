package X;

import com.ss.android.ugc.aweme.feed.model.commercialize.adshopifycheckout.ShopifyCheckoutEntity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0dCr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1041390dCr extends C09AY implements Function1<C1023640ckE, Unit> {
    public final /* synthetic */ ShopifyCheckoutEntity LL;
    public final /* synthetic */ C1040740dBo LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1041390dCr(ShopifyCheckoutEntity shopifyCheckoutEntity, C1040740dBo c1040740dBo, String str, String str2, String str3, String str4, String str5) {
        super(1);
        this.LL = shopifyCheckoutEntity;
        this.LLILLJJLI = c1040740dBo;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = str3;
        this.LLILZLL = str4;
        this.LLIZ = str5;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1023640ckE c1023640ckE) {
        String shopifyDomain;
        C1023640ckE c1023640ckE2 = c1023640ckE;
        C1043500dGG.LIZ.getClass();
        C1002190cBd c1002190cBd = C1043500dGG.LLFII;
        ShopifyCheckoutEntity shopifyCheckoutEntity = this.LL;
        if (shopifyCheckoutEntity != null) {
            shopifyDomain = shopifyCheckoutEntity.getShopifyDomain();
        } else {
            shopifyDomain = null;
        }
        c1023640ckE2.withParam(c1002190cBd, shopifyDomain);
        c1023640ckE2.withParam(C1043500dGG.LLFFF, this.LLILLJJLI.LLJI);
        c1023640ckE2.withParam(C1043500dGG.LLIIIL, this.LLILLL);
        c1023640ckE2.withParam(C1043500dGG.LLIIIZ, this.LLILZ);
        c1023640ckE2.withParam(C1043500dGG.LLIIJI, this.LLILZIL);
        c1023640ckE2.withParam(C1043500dGG.LLIIJLIL, this.LLILZLL);
        c1023640ckE2.withParam(C1043500dGG.LLIIL, this.LLIZ);
        return Unit.LIZ;
    }
}
