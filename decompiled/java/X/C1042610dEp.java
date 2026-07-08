package X;

import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.ad.FeatureCenterModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0dEp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1042610dEp extends C09AY implements Function1<C1023640ckE, Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ EnumC1042620dEq LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ InterfaceC1041500dD2 LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1042610dEp(int i, EnumC1042620dEq enumC1042620dEq, InterfaceC1041500dD2 interfaceC1041500dD2, String str, String str2, String str3, String str4, boolean z) {
        super(1);
        this.LL = z;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = i;
        this.LLILZIL = str3;
        this.LLILZLL = enumC1042620dEq;
        this.LLIZ = str4;
        this.LLIZLLLIL = interfaceC1041500dD2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1023640ckE c1023640ckE) {
        String lpRefer;
        String string;
        String string2;
        String string3;
        String realCreativeIdStr;
        C1035880d3y c1035880d3y;
        String requestId;
        C1035880d3y c1035880d3y2;
        AwemeRawAd rawAd;
        FeatureCenterModel feature;
        Integer num;
        AwemeRawAd rawAd2;
        FeatureCenterModel feature2;
        Integer num2;
        C1023640ckE c1023640ckE2 = c1023640ckE;
        C1042690dEx.LIZ.getClass();
        c1023640ckE2.withParam(C1042690dEx.LIZIZ, Integer.valueOf(this.LL ? 1 : 0));
        C1002190cBd c1002190cBd = C1042690dEx.LIZJ;
        String str = this.LLILLJJLI;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        c1023640ckE2.withParam(c1002190cBd, str);
        c1023640ckE2.withParam(C1042690dEx.LJFF, this.LLILLL);
        if (this.LL) {
            c1023640ckE2.withParam(C1042690dEx.LJI, Integer.valueOf(this.LLILZ));
        }
        c1023640ckE2.withParam(C1042690dEx.LJII, C1042580dEm.LJIILIIL.getValue());
        C1002190cBd c1002190cBd2 = C1042690dEx.LJJJI;
        String str3 = this.LLILZIL;
        if (str3 == null) {
            str3 = "";
        }
        c1023640ckE2.withParam(c1002190cBd2, str3);
        c1023640ckE2.withParam(C1042690dEx.LJIIIZ, this.LLILZLL.getType());
        C1002190cBd c1002190cBd3 = C1042690dEx.LJIIIIZZ;
        String str4 = this.LLIZ;
        if (str4 == null) {
            str4 = "";
        }
        c1023640ckE2.withParam(c1002190cBd3, str4);
        C1002190cBd c1002190cBd4 = C1042690dEx.LJJJJLL;
        InterfaceC1041500dD2 interfaceC1041500dD2 = this.LLIZLLLIL;
        if (interfaceC1041500dD2 == null || (lpRefer = interfaceC1041500dD2.getLpRefer()) == null) {
            lpRefer = "";
        }
        c1023640ckE2.withParam(c1002190cBd4, lpRefer);
        C1002190cBd c1002190cBd5 = C1042690dEx.LJJJJZI;
        InterfaceC1041500dD2 interfaceC1041500dD22 = this.LLIZLLLIL;
        if (interfaceC1041500dD22 == null || (rawAd2 = interfaceC1041500dD22.getRawAd()) == null || (feature2 = rawAd2.getFeature()) == null || (num2 = feature2.landingPageSSPOptType) == null || (string = num2.toString()) == null) {
            string = "";
        }
        c1023640ckE2.withParam(c1002190cBd5, string);
        C1002190cBd c1002190cBd6 = C1042690dEx.LJJJJZ;
        InterfaceC1041500dD2 interfaceC1041500dD23 = this.LLIZLLLIL;
        if (interfaceC1041500dD23 == null || (rawAd = interfaceC1041500dD23.getRawAd()) == null || (feature = rawAd.getFeature()) == null || (num = feature.landingPageRedirectType) == null || (string2 = num.toString()) == null) {
            string2 = "";
        }
        c1023640ckE2.withParam(c1002190cBd6, string2);
        C1002190cBd c1002190cBd7 = C1042690dEx.LJJJLIIL;
        InterfaceC1041500dD2 interfaceC1041500dD24 = this.LLIZLLLIL;
        if (!(interfaceC1041500dD24 instanceof C1035880d3y) || (c1035880d3y2 = (C1035880d3y) interfaceC1041500dD24) == null || (string3 = Integer.valueOf(c1035880d3y2.getRedirectTypeAtPageStart()).toString()) == null) {
            string3 = "";
        }
        c1023640ckE2.withParam(c1002190cBd7, string3);
        C1002190cBd c1002190cBd8 = C1042690dEx.LJJJLL;
        InterfaceC1041500dD2 interfaceC1041500dD25 = this.LLIZLLLIL;
        if (interfaceC1041500dD25 == null || (realCreativeIdStr = interfaceC1041500dD25.getRealCreativeIdStr()) == null) {
            realCreativeIdStr = "";
        }
        c1023640ckE2.withParam(c1002190cBd8, realCreativeIdStr);
        C1002190cBd c1002190cBd9 = C1042690dEx.LJJJLZIJ;
        InterfaceC1041500dD2 interfaceC1041500dD26 = this.LLIZLLLIL;
        if ((interfaceC1041500dD26 instanceof C1035880d3y) && (c1035880d3y = (C1035880d3y) interfaceC1041500dD26) != null && (requestId = c1035880d3y.getRequestId()) != null) {
            str2 = requestId;
        }
        c1023640ckE2.withParam(c1002190cBd9, str2);
        return Unit.LIZ;
    }
}
