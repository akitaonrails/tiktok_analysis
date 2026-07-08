package X;

import java.util.List;

/* JADX INFO: renamed from: X.1BVY, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public class C1BVY extends AbstractC1541650qDj<C1BVW> {
    public final /* synthetic */ C2205891BVb LLIZ;

    @Override // X.AbstractC1541650qDj
    public final boolean LIZIZ() {
        return this.LLIZ.LLILZ;
    }

    @Override // X.AbstractC1541650qDj
    public final void LIZJ() {
        List<String> listLJIIJJI = C1697810uHb.LJIIJJI("onProgressChanged", "onReceivedTitle", "onReceivedIcon", "onReceivedTouchIconUrl", "onShowCustomView", "onHideCustomView", "onCreateWindow", "onRequestFocus", "onCloseWindow", "onJsAlert", "onJsConfirm", "onJsPrompt", "onJsBeforeUnload", "onExceededDatabaseQuota", "onReachedMaxAppCacheSize", "onGeolocationPermissionsShowPrompt", "onGeolocationPermissionsHidePrompt", "onPermissionRequest", "onPermissionRequestCanceled", "onJsTimeout", "onConsoleMessage", "getDefaultVideoPoster", "getVideoLoadingProgressView", "getVisitedHistory", "onShowFileChooser");
        C2205891BVb c2205891BVb = this.LLIZ;
        for (String str : listLJIIJJI) {
            C1542400qEw c1542400qEwLIZ = c2205891BVb.LLJ.LIZ();
            c1542400qEwLIZ.setCustomExtension(this);
            LJ(str, c1542400qEwLIZ, 9000);
        }
    }

    public C1BVY(C2205891BVb c2205891BVb) {
        this.LLIZ = c2205891BVb;
    }
}
