package X;

import android.content.Context;
import android.net.Uri;
import android.webkit.WebView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.local_test.LocalTestApi;
import com.ss.android.ugc.tiktok.security.settings.WebViewHttpsGuardSettings;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0WOn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C822550WOn extends AbstractC822580WOq {
    @Override // X.InterfaceC822600WOs
    public final InterfaceC822600WOs getNext() {
        return null;
    }

    public static boolean LIZIZ(Context context, String str) {
        LocalTestApi localTestApiLIZ = C19273110af.LIZ();
        if (localTestApiLIZ == null || !localTestApiLIZ.enableWebHttps()) {
            return false;
        }
        Uri uri = UriProtector.parse(str);
        if (!Intrinsics.LJFF(uri.getScheme(), "http")) {
            return false;
        }
        Iterator it2 = ((ArrayList) C1493400oxu.LJIIJ(context).LJIIJJI()).iterator();
        while (it2.hasNext()) {
            if (LIZJ(uri.getHost(), (String) it2.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean LIZJ(String str, String str2) {
        if (str != null && str.length() != 0 && a0.LJJIJ(str, '\\')) {
            str = a0.LJJLL('\\', str, str);
        }
        if (!Intrinsics.LJFF(str, str2)) {
            if (str != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append('.');
                sbLIZ.append(str2);
                if (!u.LJIIZILJ(str, C2188811AlT.LIZIZ(sbLIZ), false)) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    @Override // X.InterfaceC822570WOp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Pair LIZ(com.lynx.tasm.LynxView r13, java.lang.String r14) {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C822550WOn.LIZ(com.lynx.tasm.LynxView, java.lang.String):kotlin.Pair");
    }

    @Override // X.AbstractC822580WOq, X.InterfaceC822590WOr
    public final String onLoadUrl(WebView webView, String str) {
        WebViewHttpsGuardSettings.HttpsGuardConfig httpsGuardConfig;
        String strLIZ;
        try {
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            httpsGuardConfig = WebViewHttpsGuardSettings.LIZ;
            WebViewHttpsGuardSettings.HttpsGuardConfig httpsGuardConfig2 = (WebViewHttpsGuardSettings.HttpsGuardConfig) settingsManagerLIZLLL.LJIIIIZZ("webview_loadurl_force_https", WebViewHttpsGuardSettings.HttpsGuardConfig.class, httpsGuardConfig);
            if (httpsGuardConfig2 != null) {
                httpsGuardConfig = httpsGuardConfig2;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            httpsGuardConfig = WebViewHttpsGuardSettings.LIZ;
        }
        if (httpsGuardConfig.enable) {
            try {
                if (LIZIZ(webView.getContext(), str)) {
                    C295501Cn c295501CnLIZIZ = C295301Cl.LIZIZ(str);
                    if (c295501CnLIZIZ == null || (strLIZ = c295501CnLIZIZ.LIZ()) == null) {
                        strLIZ = "";
                    }
                    C822610WOt.LIZ(new C824330WVj(10005, strLIZ));
                    if (str != null) {
                        str = new Regex("http").replaceFirst(str, "https");
                    } else {
                        str = null;
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            return super.onLoadUrl(webView, str);
        }
        return super.onLoadUrl(webView, str);
    }
}
