package X;

import android.content.Context;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.tiktok.security.OptIABUAExp;

/* JADX INFO: renamed from: X.0doe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1064820doe extends WebView {
    @Override // android.webkit.WebView
    public final boolean canGoBack() {
        if (C794280VDu.LIZ(this, "seclink")) {
            return super.canGoBack();
        }
        if (!super.canGoBack()) {
            return false;
        }
        C1064860doi.LIZ.getClass();
        return C1064860doi.LIZIZ(this);
    }

    @Override // android.webkit.WebView
    public final void goBack() {
        if (C794280VDu.LIZ(this, "seclink")) {
            super.goBack();
            return;
        }
        C1064860doi.LIZ.getClass();
        if (C1064860doi.LIZJ(this)) {
            return;
        }
        super.goBack();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1064820doe(Context context) {
        Integer numValueOf;
        String strLIZJ;
        C1537480q70 hybridContext;
        super(context);
        if (C292470BdF.LIZ()) {
            if (C794280VDu.LIZ(this, "csrf")) {
                C786500UtE.LIZ = getSettings().hashCode();
                return;
            }
            if ((this instanceof WebKitView) && (hybridContext = ((WebKitView) this).getHybridContext()) != null) {
                numValueOf = Integer.valueOf(hybridContext.LJ());
            } else {
                numValueOf = null;
            }
            WebSettings settings = getSettings();
            if (numValueOf != null) {
                C788140Uvs.LIZ.put(settings, numValueOf);
            }
            String userAgentString = settings.getUserAgentString();
            if (OptIABUAExp.LIZ(numValueOf)) {
                strLIZJ = OptIABUAExp.LIZJ();
                if (strLIZJ == null || strLIZJ.isEmpty()) {
                    return;
                }
            } else {
                strLIZJ = " BytedanceWebview/d8a21c6";
            }
            if (!userAgentString.contains(strLIZJ)) {
                C786410Ut5.se(settings, userAgentString.concat(strLIZJ));
            }
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onWindowFocusChanged(boolean z) {
        try {
            super.onWindowFocusChanged(z);
        } catch (NullPointerException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
