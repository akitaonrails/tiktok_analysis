package X;

import android.os.Handler;
import android.os.Looper;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.13zP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20190913zP {
    public static final int LIZJ(WebView webView) {
        WebSettings settings;
        String userAgentString;
        Object c098200Yq;
        Intrinsics.LJFF(((Handler) C1287700jc8.LIZJ.getValue()).getLooper(), Looper.myLooper());
        if (webView == null || (settings = webView.getSettings()) == null || (userAgentString = settings.getUserAgentString()) == null) {
            return -1;
        }
        try {
            String lowerCase = userAgentString.toLowerCase(Locale.getDefault());
            String strLJJLIL = a0.LJJLIL(lowerCase, "chrome/", lowerCase);
            c098200Yq = Integer.valueOf(CastIntegerProtector.parseInt(a0.LJJZ(strLJJLIL, e3.d, strLJJLIL)));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = -1;
        }
        return ((Number) c098200Yq).intValue();
    }

    public static final void LIZ(String str, StringBuilder sb) {
        if (str == null) {
            return;
        }
        sb.append("(\"");
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\r') {
                if (cCharAt != '\"') {
                    if (cCharAt != '\'') {
                        if (cCharAt != '\\') {
                            switch (cCharAt) {
                                case '\b':
                                    sb.append("\\b");
                                    break;
                                case BdTuring.TYPE_ECAF /* 9 */:
                                    sb.append("\\t");
                                    break;
                                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                                    sb.append("\\n");
                                    break;
                                default:
                                    sb.append(cCharAt);
                                    break;
                            }
                        } else {
                            sb.append("\\\\");
                        }
                    } else {
                        sb.append("\\'");
                    }
                } else {
                    sb.append("\\\"");
                }
            } else {
                sb.append("\\r");
            }
        }
        sb.append("\")");
    }

    public static final void LIZIZ(WebView webView, String str, final InterfaceC1530550pvp<String> interfaceC1530550pvp) {
        if (webView != null) {
            webView.evaluateJavascript(str, new ValueCallback() { // from class: X.13zQ
                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(Object obj) {
                    InterfaceC1530550pvp<String> interfaceC1530550pvp2 = interfaceC1530550pvp;
                    if (interfaceC1530550pvp2 != null) {
                        interfaceC1530550pvp2.accept(obj);
                    }
                }
            });
        }
    }
}
