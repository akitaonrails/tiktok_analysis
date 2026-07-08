package X;

import android.webkit.WebBackForwardList;
import android.webkit.WebView;
import com.bytedance.lynx.hybrid.webkit.ttwebview.TTWebViewHelper;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1E1Q, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1E1Q extends C09AY implements Function1<C1023640ckE, Unit> {
    public final /* synthetic */ C1040740dBo LL;
    public final /* synthetic */ WebView LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ Long LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1E1Q(C1040740dBo c1040740dBo, WebView webView, long j, long j2, String str, int i, Long l) {
        super(1);
        this.LL = c1040740dBo;
        this.LLILLJJLI = webView;
        this.LLILLL = j;
        this.LLILZ = j2;
        this.LLILZIL = str;
        this.LLILZLL = i;
        this.LLIZ = l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v61, types: [int] */
    /* JADX WARN: Type inference failed for: r0v67 */
    /* JADX WARN: Type inference failed for: r0v76 */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1023640ckE c1023640ckE) {
        String url;
        Long lValueOf;
        int size;
        ?? IsTTWebView;
        WebBackForwardList webBackForwardListCopyBackForwardList;
        C1023640ckE c1023640ckE2 = c1023640ckE;
        C1E1O.LIZ.getClass();
        c1023640ckE2.withParam(C1E1O.LJJJJL, Long.valueOf(this.LL.LLILLL));
        c1023640ckE2.withParam(C1E1O.LJJLIIIJILLIZJL, Long.valueOf(this.LL.LLILZIL));
        c1023640ckE2.withParam(C1E1O.LJJLIIIJJIZ, this.LL.LLJI);
        C1002190cBd c1002190cBd = C1E1O.LJJIZ;
        WebView webView = this.LLILLJJLI;
        Long lValueOf2 = null;
        if (webView != null) {
            url = webView.getUrl();
        } else {
            url = null;
        }
        c1023640ckE2.withParam(c1002190cBd, url);
        c1023640ckE2.withParam(C1E1O.LJJJJIZL, Long.valueOf(this.LLILLL));
        c1023640ckE2.withParam(C1E1O.LJJIIJ, Long.valueOf(this.LL.LLILZLL));
        c1023640ckE2.withParam(C1E1O.LJJIJL, Long.valueOf(this.LL.LLIZ));
        c1023640ckE2.withParam(C1E1O.LJIIL, Long.valueOf(this.LLILZ));
        c1023640ckE2.withParam(C1E1O.LJJIJIIJI, this.LLILZIL);
        c1023640ckE2.withParam(C1E1O.LJJIIZI, Long.valueOf(this.LLILZLL));
        c1023640ckE2.withParam(C1E1O.LJIILIIL, Long.valueOf(this.LL.LLJJIJIL));
        c1023640ckE2.withParam(C1E1O.LJIILJJIL, "iab");
        c1023640ckE2.withParam(C1E1O.LJIIJJI, this.LLIZ);
        C1002190cBd c1002190cBd2 = C1E1O.LJJIFFI;
        if (this.LL.LL.getAwemeRawAd() != null) {
            lValueOf = Long.valueOf(r0.getPreloadH5Type());
        } else {
            lValueOf = null;
        }
        c1023640ckE2.withParam(c1002190cBd2, lValueOf);
        c1023640ckE2.withParam(C1E1O.LJJIJ, Long.valueOf(this.LL.LLJJJ));
        C1002190cBd c1002190cBd3 = C1E1O.LJJIIJZLJL;
        if (this.LL.LL != null) {
            lValueOf2 = Long.valueOf(r0.getHasPageStart());
        }
        c1023640ckE2.withParam(c1002190cBd3, lValueOf2);
        c1023640ckE2.withParam(C1E1O.LJJJJZI, Long.valueOf(this.LL.LLILLJJLI));
        C1002190cBd c1002190cBd4 = C1E1O.LJIJ;
        WebView webView2 = this.LLILLJJLI;
        if (webView2 != null && (webBackForwardListCopyBackForwardList = webView2.copyBackForwardList()) != null) {
            size = webBackForwardListCopyBackForwardList.getSize();
        } else {
            size = -1;
        }
        c1023640ckE2.withParam(c1002190cBd4, Long.valueOf(size));
        c1023640ckE2.withParam(C1E1O.LJIIIIZZ, Long.valueOf(this.LL.LL.getPreWarmV2Status()));
        C1002190cBd c1002190cBd5 = C1E1O.LJLLL;
        C1040740dBo c1040740dBo = this.LL;
        WebView webView3 = this.LLILLJJLI;
        c1040740dBo.getClass();
        if (webView3 == null) {
            IsTTWebView = 0;
        } else {
            IsTTWebView = TTWebViewHelper.INSTANCE.isTTWebView(webView3);
        }
        c1023640ckE2.withParam(c1002190cBd5, Long.valueOf((long) IsTTWebView));
        C1002190cBd c1002190cBd6 = C1E1O.LJLLLL;
        C1040740dBo c1040740dBo2 = this.LL;
        WebView webView4 = this.LLILLJJLI;
        c1040740dBo2.getClass();
        c1023640ckE2.withParam(c1002190cBd6, C1040740dBo.LJJLI(webView4));
        return Unit.LIZ;
    }
}
