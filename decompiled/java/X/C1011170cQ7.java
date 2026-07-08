package X;

import android.view.View;
import com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.event.SearchAdEventLogger;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.search.AwemeSearchAdModel;
import com.ss.android.ugc.aweme.feed.model.search.SearchCarouselAdsProductInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AwS0S2001000_16;
import kotlin.jvm.internal.AwS595S0100000_16;

/* JADX INFO: renamed from: X.0cQ7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1011170cQ7 extends C1011080cPy implements InterfaceC657570Pql {
    public final InterfaceC1010250cOd LLILZLL;
    public C0Q18 LLIZ;
    public InterfaceC1011370cQR LLIZLLLIL;
    public final SearchAdEventLogger LLJ;
    public C1066240dqw LLJI;
    public C1011930cRL LLJIJIL;
    public C424720Gl4 LLJILJIL;
    public boolean LLJILJILJ;
    public List<SearchCarouselAdsProductInfo> LLJILLL;
    public final List<View> LLJJ;
    public long LLJJI;
    public final C01GW LLJJIII;
    public boolean LLJJIJI;

    @Override // X.InterfaceC656670PpJ
    public final void J0() {
        C1011930cRL c1011930cRL = this.LLJIJIL;
        if (c1011930cRL != null) {
            c1011930cRL.LJJJIL();
        }
        if (this.LLJJIJI) {
            LJJ().LIZJ(this.LLILZLL.getAweme());
            this.LLJJIJI = false;
        } else {
            C1484050oip c1484050oipLJJ = LJJ();
            c1484050oipLJJ.getClass();
            int i = C2510609se.LIZ;
            c1484050oipLJJ.LIZ().resume();
        }
        this.LLJILJILJ = true;
        C1484050oip c1484050oipLJJ2 = LJJ();
        InterfaceC1011370cQR interfaceC1011370cQR = this.LLIZLLLIL;
        c1484050oipLJJ2.LIZIZ(interfaceC1011370cQR != null ? interfaceC1011370cQR.isMute() : true);
    }

    public final C1484050oip LJJ() {
        return (C1484050oip) this.LLJJIII.getValue();
    }

    public final boolean LJJI() {
        Aweme aweme;
        AwemeRawAd awemeRawAd;
        AwemeSearchAdModel searchAdInfo;
        InterfaceC1010250cOd interfaceC1010250cOd = this.LLILZLL;
        return interfaceC1010250cOd == null || (aweme = interfaceC1010250cOd.getAweme()) == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (searchAdInfo = awemeRawAd.getSearchAdInfo()) == null || searchAdInfo.productCarousel == null;
    }

    @Override // X.InterfaceC656670PpJ
    public final void LLZZZZ() {
        C1011930cRL c1011930cRL = this.LLJIJIL;
        if (c1011930cRL != null) {
            c1011930cRL.LJJJJ();
        }
        this.LLJILJILJ = false;
        C1484050oip c1484050oipLJJ = LJJ();
        c1484050oipLJJ.getClass();
        int i = C2510609se.LIZ;
        c1484050oipLJJ.LIZ().pause();
    }

    @Override // X.C0PPF
    public final void onDestroy() {
        C0Q18 c0q18 = this.LLIZ;
        if (c0q18 != null) {
            c0q18.onDestroy();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x0172  */
    @Override // X.C1011080cPy, X.C0PPF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void bind() {
        /*
            Method dump skipped, instruction units count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1011170cQ7.bind():void");
    }

    @Override // X.C1011080cPy, X.C0PPF
    public final void onViewAttachedToWindow() {
        super.onViewAttachedToWindow();
        SearchAdEventLogger searchAdEventLogger = this.LLJ;
        C1009980cOC.LIZ.getClass();
        searchAdEventLogger.logAd(C1009980cOC.LIZIZ);
        C0Q18 c0q18 = this.LLIZ;
        if (c0q18 != null) {
            c0q18.onViewAttachedToWindow();
        }
        C1011930cRL c1011930cRL = this.LLJIJIL;
        LJJIFFI(c1011930cRL != null ? c1011930cRL.getCurrentPhotoIndex() : 0);
        this.LLJJI = System.currentTimeMillis();
    }

    @Override // X.C1011080cPy, X.C0PPF
    public final void onViewDetachedFromWindow() {
        super.onViewDetachedFromWindow();
        C0Q18 c0q18 = this.LLIZ;
        if (c0q18 != null) {
            c0q18.onViewDetachedFromWindow();
        }
        C1484050oip c1484050oipLJJ = LJJ();
        c1484050oipLJJ.getClass();
        int i = C2510609se.LIZ;
        c1484050oipLJJ.LIZ().release();
        SearchAdEventLogger searchAdEventLogger = this.LLJ;
        C1009980cOC.LIZ.getClass();
        searchAdEventLogger.logAd(C1009980cOC.LIZJ);
        if (C1010120cOQ.LJJJJ(this.LLILZLL.getAweme())) {
            this.LLJ.logAd(C1009980cOC.LJJIJIL, new AwS595S0100000_16(this, 213));
        }
    }

    @Override // X.InterfaceC656550Pp7
    public final C0Q18 LIZ() {
        return this.LLIZ;
    }

    @Override // X.InterfaceC656550Pp7
    public final List<View> LJIIJ() {
        return this.LLJJ;
    }

    @Override // X.InterfaceC1010530cP5
    public final InterfaceC1010250cOd Mh() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC656670PpJ
    public final boolean isPlaying() {
        return this.LLJILJILJ;
    }

    public C1011170cQ7(C1011420cQW c1011420cQW) {
        super(c1011420cQW);
        this.LLILZLL = c1011420cQW;
        this.LLJ = new SearchAdEventLogger(c1011420cQW.LIZ);
        this.LLJJ = new ArrayList();
        this.LLJJIII = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(368));
        this.LLJJIJI = true;
    }

    @Override // X.C0Q70
    public final <T extends InterfaceC656540Pp6> void LIZJ(T t) {
        if (t instanceof InterfaceC1011370cQR) {
            this.LLIZLLLIL = (InterfaceC1011370cQR) t;
        }
    }

    @Override // X.InterfaceC657570Pql
    public final void LJIILJJIL(boolean z) {
        LJJ().LIZIZ(z);
    }

    public final void LJJIFFI(int i) {
        String uri;
        String str;
        SearchCarouselAdsProductInfo searchCarouselAdsProductInfo;
        List<SearchCarouselAdsProductInfo> list = this.LLJILLL;
        if (list != null && (searchCarouselAdsProductInfo = (SearchCarouselAdsProductInfo) C13LP.LJJJLZIJ(i, list)) != null) {
            uri = searchCarouselAdsProductInfo.getUri();
        } else {
            uri = null;
        }
        String strValueOf = String.valueOf(uri);
        C1011930cRL c1011930cRL = this.LLJIJIL;
        if (c1011930cRL != null && c1011930cRL.LLLZIL) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        SearchAdEventLogger searchAdEventLogger = this.LLJ;
        C1009980cOC.LIZ.getClass();
        searchAdEventLogger.logAd((InterfaceC1023400cjq<C443120HZe<String, String, String>>) C1009980cOC.LJJJJL.getValue(), new AwS0S2001000_16(i, str, strValueOf, 0));
    }
}
