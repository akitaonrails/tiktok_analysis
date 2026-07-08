package X;

import java.util.List;

/* JADX INFO: renamed from: X.1BVj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public class C2205971BVj extends AbstractC1541650qDj<C2205951BVh> {
    public final /* synthetic */ C2205891BVb LLIZ;

    @Override // X.AbstractC1541650qDj
    public final boolean LIZIZ() {
        return this.LLIZ.LLILZ;
    }

    @Override // X.AbstractC1541650qDj
    public final void LIZJ() {
        List<String> listLJIIJJI = C1697810uHb.LJIIJJI("shouldOverrideUrlLoading", "onPageStarted", "onPageFinished", "onLoadResource", "onPageCommitVisible", "shouldInterceptRequest", "onTooManyRedirects", "onReceivedError", "onReceivedHttpError", "onFormResubmission", "doUpdateVisitedHistory", "onReceivedSslError", "onReceivedClientCertRequest", "onReceivedHttpAuthRequest", "shouldOverrideKeyEvent", "onUnhandledKeyEvent", "onScaleChanged", "onReceivedLoginRequest", "onRenderProcessGone", "onSafeBrowsingHit");
        C2205891BVb c2205891BVb = this.LLIZ;
        for (String str : listLJIIJJI) {
            C844210X9v c844210X9vLIZIZ = c2205891BVb.LLJ.LIZIZ();
            c844210X9vLIZIZ.setCustomExtension(this);
            LJ(str, c844210X9vLIZIZ, 9000);
        }
    }

    public C2205971BVj(C2205891BVb c2205891BVb) {
        this.LLIZ = c2205891BVb;
    }
}
