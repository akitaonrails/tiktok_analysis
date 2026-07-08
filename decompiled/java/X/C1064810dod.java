package X;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.crash.Npth;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.ss.android.ugc.tiktok.security.OptIABUAExp;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0dod, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1064810dod extends WebView {
    public long LL;

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

    @Override // android.webkit.WebView
    public final void reload() {
        this.LL = System.currentTimeMillis();
        super.reload();
    }

    public final long getLastLoadUrlTimestamp() {
        return this.LL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1064810dod(Context context) {
        Integer numValueOf;
        String strLIZJ;
        C1537480q70 hybridContext;
        super(context);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("last_webview_type", "ad_iab_prewarm");
        Npth.addTags(linkedHashMap);
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

    public static void LIZ(String str) {
        if (!Intrinsics.LJFF(str, "about:blank")) {
            C1AF0.LJ(new RuntimeException("IABPreWarmWebView loadUrl is not about:blank, url: " + str));
        }
    }

    @Override // android.webkit.WebView
    public final void loadUrl(String str) {
        if (C794280VDu.LIZ(this, "seclink")) {
            LIZ(str);
            this.LL = System.currentTimeMillis();
            super.loadUrl(str);
        } else {
            String strOnLoadUrl = C1064860doi.LIZ.onLoadUrl(this, str);
            if (!TextUtils.isEmpty(strOnLoadUrl)) {
                str = strOnLoadUrl;
            }
            LIZ(str);
            this.LL = System.currentTimeMillis();
            super.loadUrl(str);
        }
    }

    @Override // android.webkit.WebView
    public final void loadUrl(String str, Map map) {
        if (C794280VDu.LIZ(this, "seclink")) {
            LIZ(str);
            this.LL = System.currentTimeMillis();
            super.loadUrl(str, map);
        } else {
            String strOnLoadUrl = C1064860doi.LIZ.onLoadUrl(this, str);
            if (!TextUtils.isEmpty(strOnLoadUrl)) {
                str = strOnLoadUrl;
            }
            LIZ(str);
            this.LL = System.currentTimeMillis();
            super.loadUrl(str, map);
        }
    }

    @Override // android.webkit.WebView
    public final void loadData(String str, String str2, String str3) {
        this.LL = System.currentTimeMillis();
        super.loadData(str, str2, str3);
    }

    @Override // android.webkit.WebView
    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.LL = System.currentTimeMillis();
        super.loadDataWithBaseURL(str, str2, str3, str4, str5);
    }
}
