package X;

import android.webkit.WebBackForwardList;
import android.webkit.WebView;
import com.bytedance.lynx.hybrid.webkit.ttwebview.TTWebViewHelper;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.web.metric.LogItem;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0dUg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1052440dUg extends C09AY implements Function1<C1023640ckE, Unit> {
    public final /* synthetic */ C1040740dBo LL;
    public final /* synthetic */ WebView LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ Long LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1052440dUg(C1040740dBo c1040740dBo, WebView webView, long j, long j2, int i, Long l) {
        super(1);
        this.LL = c1040740dBo;
        this.LLILLJJLI = webView;
        this.LLILLL = j;
        this.LLILZ = j2;
        this.LLILZIL = i;
        this.LLILZLL = l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v72, types: [int] */
    /* JADX WARN: Type inference failed for: r0v78 */
    /* JADX WARN: Type inference failed for: r0v86 */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1023640ckE c1023640ckE) {
        String url;
        Long lValueOf;
        long j;
        int size;
        ?? IsTTWebView;
        WebBackForwardList webBackForwardListCopyBackForwardList;
        C1023640ckE c1023640ckE2 = c1023640ckE;
        C1E1M.LIZ.getClass();
        c1023640ckE2.withParam(C1E1M.LJJJJL, Long.valueOf(this.LL.LLILLL));
        c1023640ckE2.withParam(C1E1M.LJJLIIIJILLIZJL, Long.valueOf(this.LL.LLILZIL));
        c1023640ckE2.withParam(C1E1M.LJJLIIIJJIZ, this.LL.LLJI);
        C1002190cBd c1002190cBd = C1E1M.LJJIL;
        WebView webView = this.LLILLJJLI;
        List<LogItem> listLIZ = null;
        if (webView != null) {
            url = webView.getUrl();
        } else {
            url = null;
        }
        c1023640ckE2.withParam(c1002190cBd, url);
        c1023640ckE2.withParam(C1E1M.LJJJJIZL, Long.valueOf(this.LLILLL));
        c1023640ckE2.withParam(C1E1M.LJJIIJ, Long.valueOf(this.LL.LLILZLL));
        c1023640ckE2.withParam(C1E1M.LJJIJIL, Long.valueOf(this.LL.LLIZ));
        c1023640ckE2.withParam(C1E1M.LJIIL, Long.valueOf(this.LLILZ));
        c1023640ckE2.withParam(C1E1M.LJJ, Long.valueOf(this.LLILZIL));
        c1023640ckE2.withParam(C1E1M.LJIILIIL, Long.valueOf(this.LL.LLJJIJIL));
        c1023640ckE2.withParam(C1E1M.LJIILJJIL, "iab");
        c1023640ckE2.withParam(C1E1M.LJIIJJI, this.LLILZLL);
        C1002190cBd c1002190cBd2 = C1E1M.LJJIFFI;
        if (this.LL.LL.getAwemeRawAd() != null) {
            lValueOf = Long.valueOf(r0.getPreloadH5Type());
        } else {
            lValueOf = null;
        }
        c1023640ckE2.withParam(c1002190cBd2, lValueOf);
        c1023640ckE2.withParam(C1E1M.LJJIJ, Long.valueOf(this.LL.LLJJJ));
        c1023640ckE2.withParam(C1E1M.LJJIIJZLJL, Long.valueOf(this.LL.LL.getHasPageStart()));
        C1002190cBd c1002190cBd3 = C1E1M.LJJJIL;
        if (this.LL.LLJJIJIIJIL) {
            j = 0;
        } else {
            j = 1;
        }
        c1023640ckE2.withParam(c1002190cBd3, Long.valueOf(j));
        c1023640ckE2.withParam(C1E1M.LJJJJZI, Long.valueOf(this.LL.LLILLJJLI));
        C1002190cBd c1002190cBd4 = C1E1M.LJIJ;
        WebView webView2 = this.LLILLJJLI;
        if (webView2 != null && (webBackForwardListCopyBackForwardList = webView2.copyBackForwardList()) != null) {
            size = webBackForwardListCopyBackForwardList.getSize();
        } else {
            size = -1;
        }
        c1023640ckE2.withParam(c1002190cBd4, Long.valueOf(size));
        C1002190cBd c1002190cBd5 = C1E1M.LJJIIZI;
        Gson gson = C7740030o.LIZ().getGson();
        C1039460d9k c1039460d9k = this.LL.LLJJL;
        if (c1039460d9k != null) {
            listLIZ = c1039460d9k.LIZ();
        }
        c1023640ckE2.withParam(c1002190cBd5, GsonProtectorUtils.toJson(gson, listLIZ));
        c1023640ckE2.withParam(C1E1M.LJIIIIZZ, Long.valueOf(this.LL.LL.getPreWarmV2Status()));
        C1002190cBd c1002190cBd6 = C1E1M.LJLLL;
        C1040740dBo c1040740dBo = this.LL;
        WebView webView3 = this.LLILLJJLI;
        c1040740dBo.getClass();
        if (webView3 == null) {
            IsTTWebView = 0;
        } else {
            IsTTWebView = TTWebViewHelper.INSTANCE.isTTWebView(webView3);
        }
        c1023640ckE2.withParam(c1002190cBd6, Long.valueOf((long) IsTTWebView));
        C1002190cBd c1002190cBd7 = C1E1M.LJLLLL;
        C1040740dBo c1040740dBo2 = this.LL;
        WebView webView4 = this.LLILLJJLI;
        c1040740dBo2.getClass();
        c1023640ckE2.withParam(c1002190cBd7, C1040740dBo.LJJLI(webView4));
        return Unit.LIZ;
    }
}
