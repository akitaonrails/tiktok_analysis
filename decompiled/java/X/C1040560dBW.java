package X;

import android.webkit.WebBackForwardList;
import android.webkit.WebView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0dBW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1040560dBW extends C09AY implements Function1<C1023640ckE, Unit> {
    public final /* synthetic */ C1040740dBo LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ WebView LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1040560dBW(C1040740dBo c1040740dBo, long j, long j2, int i, WebView webView) {
        super(1);
        this.LL = c1040740dBo;
        this.LLILLJJLI = j;
        this.LLILLL = j2;
        this.LLILZ = i;
        this.LLILZIL = webView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1023640ckE c1023640ckE) {
        int size;
        WebBackForwardList webBackForwardListCopyBackForwardList;
        C1023640ckE c1023640ckE2 = c1023640ckE;
        C1043500dGG.LIZ.getClass();
        c1023640ckE2.withParam(C1043500dGG.LJIILJJIL, Integer.valueOf(this.LL.LLILLL));
        c1023640ckE2.withParam(C1043500dGG.LJIILLIIL, this.LL.LLJI);
        c1023640ckE2.withParam(C1043500dGG.LJIIZILJ, Long.valueOf(this.LLILLJJLI));
        c1023640ckE2.withParam(C1043500dGG.LJIJJ, Long.valueOf(this.LL.LLILZLL));
        c1023640ckE2.withParam(C1043500dGG.LJIJJLI, Long.valueOf(this.LL.LLIZ));
        c1023640ckE2.withParam(C1043500dGG.LJIL, Long.valueOf(this.LLILLL));
        c1023640ckE2.withParam(C1043500dGG.LJJIJIIJIL, Integer.valueOf(this.LLILZ));
        C1002190cBd c1002190cBd = C1043500dGG.LJJIJLIJ;
        WebView webView = this.LLILZIL;
        if (webView != null && (webBackForwardListCopyBackForwardList = webView.copyBackForwardList()) != null) {
            size = webBackForwardListCopyBackForwardList.getSize();
        } else {
            size = -1;
        }
        c1023640ckE2.withParam(c1002190cBd, Integer.valueOf(size));
        return Unit.LIZ;
    }
}
