package X;

import android.webkit.WebBackForwardList;
import android.webkit.WebView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1E1R, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1E1R extends C09AY implements Function1<C1023640ckE, Unit> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ C1040740dBo LLILLL;
    public final /* synthetic */ WebView LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ Long LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1E1R(int i, long j, C1040740dBo c1040740dBo, WebView webView, String str, int i2, Long l) {
        super(1);
        this.LL = i;
        this.LLILLJJLI = j;
        this.LLILLL = c1040740dBo;
        this.LLILZ = webView;
        this.LLILZIL = str;
        this.LLILZLL = i2;
        this.LLIZ = l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1023640ckE c1023640ckE) {
        String url;
        Long lValueOf;
        int size;
        WebBackForwardList webBackForwardListCopyBackForwardList;
        C1023640ckE c1023640ckE2 = c1023640ckE;
        C1E1S.LIZ.getClass();
        c1023640ckE2.withParam(C1E1S.LIZIZ, Integer.valueOf(this.LL));
        c1023640ckE2.withParam(C1E1S.LIZJ, Long.valueOf(this.LLILLJJLI));
        c1023640ckE2.withParam(C1E1S.LJJJJJ, Long.valueOf(this.LLILLL.LLILLL));
        c1023640ckE2.withParam(C1E1S.LJJLIIIIJ, Long.valueOf(this.LLILLL.LLILZIL));
        c1023640ckE2.withParam(C1E1S.LJJLIIIJILLIZJL, this.LLILLL.LLJI);
        C1002190cBd c1002190cBd = C1E1S.LJJIJLIJ;
        WebView webView = this.LLILZ;
        Long lValueOf2 = null;
        if (webView != null) {
            url = webView.getUrl();
        } else {
            url = null;
        }
        c1023640ckE2.withParam(c1002190cBd, url);
        c1023640ckE2.withParam(C1E1S.LJJII, Long.valueOf(this.LLILLL.LLILZLL));
        c1023640ckE2.withParam(C1E1S.LJJIJIIJIL, Long.valueOf(this.LLILLL.LLIZ));
        c1023640ckE2.withParam(C1E1S.LJJIIZI, this.LLILZIL);
        c1023640ckE2.withParam(C1E1S.LJJIIJZLJL, Long.valueOf(this.LLILZLL));
        c1023640ckE2.withParam(C1E1S.LJIIJJI, Long.valueOf(this.LLILLL.LLJJIJIL));
        c1023640ckE2.withParam(C1E1S.LJIIL, "iab");
        c1023640ckE2.withParam(C1E1S.LJIIJ, this.LLIZ);
        C1002190cBd c1002190cBd2 = C1E1S.LJJ;
        if (this.LLILLL.LL.getAwemeRawAd() != null) {
            lValueOf = Long.valueOf(r0.getPreloadH5Type());
        } else {
            lValueOf = null;
        }
        c1023640ckE2.withParam(c1002190cBd2, lValueOf);
        c1023640ckE2.withParam(C1E1S.LJJIIZ, Long.valueOf(this.LLILLL.LLJJJ));
        C1002190cBd c1002190cBd3 = C1E1S.LJJIII;
        if (this.LLILLL.LL != null) {
            lValueOf2 = Long.valueOf(r0.getHasPageStart());
        }
        c1023640ckE2.withParam(c1002190cBd3, lValueOf2);
        c1023640ckE2.withParam(C1E1S.LJJJJLL, Long.valueOf(this.LLILLL.LLILLJJLI));
        C1002190cBd c1002190cBd4 = C1E1S.LJIILLIIL;
        WebView webView2 = this.LLILZ;
        if (webView2 != null && (webBackForwardListCopyBackForwardList = webView2.copyBackForwardList()) != null) {
            size = webBackForwardListCopyBackForwardList.getSize();
        } else {
            size = -1;
        }
        c1023640ckE2.withParam(c1002190cBd4, Long.valueOf(size));
        c1023640ckE2.withParam(C1E1S.LJII, Long.valueOf(this.LLILLL.LL.getPreWarmV2Status()));
        return Unit.LIZ;
    }
}
