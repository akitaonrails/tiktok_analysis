package X;

import android.webkit.WebBackForwardList;
import android.webkit.WebView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lynx.hybrid.webkit.ttwebview.TTWebViewHelper;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.web.metric.LogItem;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0dum, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1068620dum extends C09AY implements Function1<C1023640ckE, Unit> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ C1040740dBo LLILLJJLI;
    public final /* synthetic */ WebView LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ Long LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ boolean LLIZ;
    public final /* synthetic */ long LLIZLLLIL;
    public final /* synthetic */ boolean LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1068620dum(int i, C1040740dBo c1040740dBo, WebView webView, long j, Long l, boolean z, boolean z2, long j2, boolean z3) {
        super(1);
        this.LL = i;
        this.LLILLJJLI = c1040740dBo;
        this.LLILLL = webView;
        this.LLILZ = j;
        this.LLILZIL = l;
        this.LLILZLL = z;
        this.LLIZ = z2;
        this.LLIZLLLIL = j2;
        this.LLJ = z3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v115 */
    /* JADX WARN: Type inference failed for: r0v126 */
    /* JADX WARN: Type inference failed for: r0v74, types: [int] */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1023640ckE c1023640ckE) {
        String url;
        Long lValueOf;
        int size;
        List<LogItem> listLIZ;
        ?? IsTTWebView;
        WebBackForwardList webBackForwardListCopyBackForwardList;
        long j;
        C1023640ckE c1023640ckE2 = c1023640ckE;
        C1E1W.LIZ.getClass();
        c1023640ckE2.withParam(C1E1W.LJIILIIL, Long.valueOf(this.LL));
        c1023640ckE2.withParam(C1E1W.LJJ, Long.valueOf(this.LLILLJJLI.LLILZIL));
        c1023640ckE2.withParam(C1E1W.LJJIII, this.LLILLJJLI.LLJI);
        C1002190cBd c1002190cBd = C1E1W.LJII;
        WebView webView = this.LLILLL;
        String webUrl = null;
        if (webView != null) {
            url = webView.getUrl();
        } else {
            url = null;
        }
        c1023640ckE2.withParam(c1002190cBd, url);
        c1023640ckE2.withParam(C1E1W.LJIIL, Long.valueOf(this.LLILZ));
        c1023640ckE2.withParam(C1E1W.LIZLLL, this.LLILZIL);
        long j2 = 1;
        if (this.LLILZLL) {
            if (this.LLIZ) {
                j = 2;
            } else {
                j = 1;
            }
            C1E1U.LIZ.getClass();
            c1023640ckE2.withParam(C1E1U.LJJIJIIJIL, Long.valueOf(j));
        }
        c1023640ckE2.withParam(C1E1W.LJJIIJZLJL, Long.valueOf(this.LLILLJJLI.LLILZLL));
        c1023640ckE2.withParam(C1E1W.LJJIJIL, Long.valueOf(this.LLILLJJLI.LLIZ));
        c1023640ckE2.withParam(C1E1W.LJ, Long.valueOf(this.LLIZLLLIL));
        c1023640ckE2.withParam(C1E1W.LJFF, Long.valueOf(this.LLILLJJLI.LLJJIJIL));
        c1023640ckE2.withParam(C1E1W.LJI, "iab");
        c1023640ckE2.withParam(C1E1W.LJJIJLIJ, "h5");
        c1023640ckE2.withParam(C1E1W.LJJIIZI, Long.valueOf(this.LLILLJJLI.LL.getHasPageStart()));
        c1023640ckE2.withParam(C1E1W.LJJIJIIJI, Long.valueOf(this.LLILLJJLI.LLJJJ));
        C1002190cBd c1002190cBd2 = C1E1W.LJJI;
        if (this.LLILLJJLI.LL.getAwemeRawAd() != null) {
            lValueOf = Long.valueOf(r0.getPreloadH5Type());
        } else {
            lValueOf = null;
        }
        c1023640ckE2.withParam(c1002190cBd2, lValueOf);
        C1E1U.LIZ.getClass();
        C1002190cBd c1002190cBd3 = C1E1U.LJJLIIIJJIZ;
        if (!this.LLJ) {
            j2 = 0;
        }
        c1023640ckE2.withParam(c1002190cBd3, Long.valueOf(j2));
        c1023640ckE2.withParam(C1E1U.LJJJLZIJ, Long.valueOf(this.LLILLJJLI.LLILLJJLI));
        C1002190cBd c1002190cBd4 = C1E1U.LJIJJ;
        WebView webView2 = this.LLILLL;
        if (webView2 != null && (webBackForwardListCopyBackForwardList = webView2.copyBackForwardList()) != null) {
            size = webBackForwardListCopyBackForwardList.getSize();
        } else {
            size = -1;
        }
        c1023640ckE2.withParam(c1002190cBd4, Long.valueOf(size));
        C1002190cBd c1002190cBd5 = C1E1U.LJJIJIIJI;
        Gson gson = C7740030o.LIZ().getGson();
        C1039460d9k c1039460d9k = this.LLILLJJLI.LLJJL;
        if (c1039460d9k != null) {
            listLIZ = c1039460d9k.LIZ();
        } else {
            listLIZ = null;
        }
        c1023640ckE2.withParam(c1002190cBd5, GsonProtectorUtils.toJson(gson, listLIZ));
        C1002190cBd c1002190cBd6 = C1E1U.LJIIIZ;
        AwemeRawAd awemeRawAd = this.LLILLJJLI.LL.getAwemeRawAd();
        if (awemeRawAd != null) {
            webUrl = awemeRawAd.getWebUrl();
        }
        c1023640ckE2.withParam(c1002190cBd6, C989070bqT.LIZIZ(webUrl));
        c1023640ckE2.withParam(C1E1U.LJJIFFI, Long.valueOf(this.LLILLJJLI.LL.getPreWarmV2Status()));
        C1002190cBd c1002190cBd7 = C1E1U.LLII;
        C1040740dBo c1040740dBo = this.LLILLJJLI;
        WebView webView3 = this.LLILLL;
        c1040740dBo.getClass();
        if (webView3 == null) {
            IsTTWebView = 0;
        } else {
            IsTTWebView = TTWebViewHelper.INSTANCE.isTTWebView(webView3);
        }
        c1023640ckE2.withParam(c1002190cBd7, Long.valueOf((long) IsTTWebView));
        C1002190cBd c1002190cBd8 = C1E1U.LLIIII;
        C1040740dBo c1040740dBo2 = this.LLILLJJLI;
        WebView webView4 = this.LLILLL;
        c1040740dBo2.getClass();
        c1023640ckE2.withParam(c1002190cBd8, C1040740dBo.LJJLI(webView4));
        this.LLILLJJLI.getClass();
        try {
            SettingsManager.LIZLLL().getClass();
            if (SettingsManager.LIZ("iab_load_finish_iframe_info_enable", false)) {
                C1047720dN4 c1047720dN4 = C1047720dN4.LIZ;
                C1047800dNC c1047800dNCLIZ = C1047720dN4.LIZ();
                c1023640ckE2.withParam(C1E1U.LJLJL, Integer.valueOf(c1047800dNCLIZ.successInfo.iframeInjectSuccessTimes));
                c1023640ckE2.withParam(C1E1U.LJLJLJ, Long.valueOf(c1047800dNCLIZ.successInfo.iframeTotalSuccessDuration));
                c1023640ckE2.withParam(C1E1U.LJLJLLL, Long.valueOf(c1047800dNCLIZ.successInfo.iframeTtnetSuccessRequestDuration));
                c1023640ckE2.withParam(C1E1U.LJLL, Long.valueOf(c1047800dNCLIZ.successInfo.iframeScriptSuccessLoadDuration));
                c1023640ckE2.withParam(C1E1U.LJLLI, Long.valueOf(c1047800dNCLIZ.successInfo.iframeSecuritySuccessDecisionDuration));
                c1023640ckE2.withParam(C1E1U.LJLLILLLL, Integer.valueOf(c1047800dNCLIZ.failureInfo.iframeInjectFailTimes));
                c1023640ckE2.withParam(C1E1U.LJLLJ, Long.valueOf(c1047800dNCLIZ.failureInfo.iframeTotalFailedDuration));
                c1023640ckE2.withParam(C1E1U.LJLLL, Long.valueOf(c1047800dNCLIZ.failureInfo.iframeTtnetFailedRequestDuration));
                c1023640ckE2.withParam(C1E1U.LJLLLL, Long.valueOf(c1047800dNCLIZ.failureInfo.iframeScriptFailedLoadDuration));
                c1023640ckE2.withParam(C1E1U.LJLLLLLL, Long.valueOf(c1047800dNCLIZ.failureInfo.iframeSecurityFailedDecisionDuration));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
        }
        return Unit.LIZ;
    }
}
