package X;

import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.model.UcpContentItem;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.model.UcpProperties;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.onestep.OnestepCheckoutFragment;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0DBB, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DBB extends C09AY implements Function1<C1023640ckE, Unit> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ C0D3K LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ OnestepCheckoutFragment LLILZ;
    public final /* synthetic */ C332730D2p LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0DBB(int i, C0D3K c0d3k, String str, OnestepCheckoutFragment onestepCheckoutFragment, C332730D2p c332730D2p) {
        super(1);
        this.LL = i;
        this.LLILLJJLI = c0d3k;
        this.LLILLL = str;
        this.LLILZ = onestepCheckoutFragment;
        this.LLILZIL = c332730D2p;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1023640ckE c1023640ckE) {
        String str;
        String str2;
        boolean z;
        long j;
        String str3;
        Double d;
        UcpContentItem ucpContentItem;
        String str4;
        String str5;
        String str6;
        String str7;
        Map<String, String> map;
        List<C332860D3c> list;
        C1023640ckE c1023640ckE2 = c1023640ckE;
        C0DIQ.LIZ.getClass();
        c1023640ckE2.withParam(C0DIQ.LJJIIZ, 1);
        c1023640ckE2.withParam(C0DIQ.LIZJ, "place_order");
        c1023640ckE2.withParam(C0DIQ.LIZLLL, "one_step_checkout");
        c1023640ckE2.withParam(C0DIQ.LJJIFFI, Long.valueOf(this.LL));
        C1002190cBd c1002190cBd = C0DIQ.LJJ;
        C0D3Y c0d3y = this.LLILLJJLI.priceInfo;
        List listSingletonList = null;
        if (c0d3y != null) {
            str = c0d3y.price;
        } else {
            str = null;
        }
        c1023640ckE2.withParam(c1002190cBd, str);
        C1002190cBd c1002190cBd2 = C0DIQ.LJJI;
        C0D3Y c0d3y2 = this.LLILLJJLI.priceInfo;
        if (c0d3y2 != null) {
            str2 = c0d3y2.currency;
        } else {
            str2 = null;
        }
        c1023640ckE2.withParam(c1002190cBd2, str2);
        C1002190cBd c1002190cBd3 = C0DIQ.LJJII;
        C0D3N c0d3n = this.LLILLJJLI.dealsInfo;
        if (c0d3n != null && (list = c0d3n.deals) != null && (!list.isEmpty())) {
            z = true;
        } else {
            z = false;
        }
        long j2 = 1;
        if (z) {
            j = 1;
        } else {
            j = 0;
        }
        c1023640ckE2.withParam(c1002190cBd3, Long.valueOf(j));
        C1002190cBd c1002190cBd4 = C0DIQ.LJJIII;
        C0D3N c0d3n2 = this.LLILLJJLI.dealsInfo;
        if (c0d3n2 == null || !c0d3n2.getHasClaimedDeal()) {
            j2 = 0;
        }
        c1023640ckE2.withParam(c1002190cBd4, Long.valueOf(j2));
        String str8 = this.LLILLL;
        if (str8 != null) {
            c1023640ckE2.withParam(C0DIQ.LJIJJ, str8);
        }
        C335000DBi c335000DBi = this.LLILZ.LLJILLL;
        if (c335000DBi != null && (map = c335000DBi.LIZ) != null) {
            str3 = map.get("ac_ad_type");
        } else {
            str3 = null;
        }
        if (C0D0H.LIZ(str3)) {
            C0DBY c0dby = C335000DBi.LIZJ;
            C0D3Y c0d3y3 = this.LLILLJJLI.priceInfo;
            if (c0d3y3 != null) {
                d = c0d3y3.rawOriginalPrice;
                if (d == null) {
                    d = c0d3y3.rawCurrentPrice;
                }
            } else {
                d = null;
            }
            c0dby.getClass();
            String strLIZIZ = C0DBY.LIZIZ(d);
            String str9 = this.LLILLL;
            if (str9 != null) {
                int i = this.LL;
                C0D3K c0d3k = this.LLILLJJLI;
                Integer numValueOf = Integer.valueOf(i);
                C0D3M c0d3m = c0d3k.titleRating;
                if (c0d3m != null) {
                    str6 = c0d3m.title;
                } else {
                    str6 = null;
                }
                C0D3O c0d3o = c0d3k.shopHeader;
                if (c0d3o != null) {
                    str7 = c0d3o.shopName;
                } else {
                    str7 = null;
                }
                ucpContentItem = new UcpContentItem(strLIZIZ, numValueOf, str9, str6, str7);
            } else {
                ucpContentItem = null;
            }
            C1002190cBd c1002190cBd5 = C0DIQ.LJJIIJZLJL;
            Map<String, String> map2 = this.LLILZIL.passThrough;
            C0D3Y c0d3y4 = this.LLILLJJLI.priceInfo;
            if (c0d3y4 != null) {
                str4 = c0d3y4.price;
            } else {
                str4 = null;
            }
            String strLIZJ = C0DBY.LIZJ(str4);
            C0D3Y c0d3y5 = this.LLILLJJLI.priceInfo;
            if (c0d3y5 != null) {
                str5 = c0d3y5.currency;
            } else {
                str5 = null;
            }
            if (ucpContentItem != null) {
                listSingletonList = Collections.singletonList(ucpContentItem);
            }
            c1023640ckE2.withParam(c1002190cBd5, C0DBY.LIZ(map2, "ac_shop_sku_confirm", new UcpProperties(strLIZJ, str5, listSingletonList)));
        }
        return Unit.LIZ;
    }
}
