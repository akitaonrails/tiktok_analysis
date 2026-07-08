package X;

import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import android.webkit.WebView;

/* JADX INFO: renamed from: X.0W7V, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0W7V extends CookieManager {
    @Override // android.webkit.CookieManager
    public final void setAcceptCookie(boolean z) {
    }

    @Override // android.webkit.CookieManager
    public final void setAcceptThirdPartyCookies(WebView webView, boolean z) {
    }

    @Override // android.webkit.CookieManager
    public final boolean acceptCookie() {
        throw null;
    }

    @Override // android.webkit.CookieManager
    public final void flush() {
        throw null;
    }

    @Override // android.webkit.CookieManager
    public final boolean hasCookies() {
        throw null;
    }

    @Override // android.webkit.CookieManager
    public final void removeAllCookie() {
        throw null;
    }

    @Override // android.webkit.CookieManager
    public final void removeExpiredCookie() {
        throw null;
    }

    @Override // android.webkit.CookieManager
    public final void removeSessionCookie() {
        throw null;
    }

    @Override // android.webkit.CookieManager
    public final boolean acceptThirdPartyCookies(WebView webView) {
        throw null;
    }

    @Override // android.webkit.CookieManager
    public final String getCookie(String str) {
        return C2204961BRm.LLIZ(null, str, new C0WZX("dzBzEgAjS8/YVFkiQFyIfx2bdaMzSphZ1vNnQrubtpFHzMbSvQ7DBGqqpXeiL2AT2s8Y", null));
    }

    @Override // android.webkit.CookieManager
    public final void removeAllCookies(ValueCallback<Boolean> valueCallback) {
        throw null;
    }

    @Override // android.webkit.CookieManager
    public final void removeSessionCookies(ValueCallback<Boolean> valueCallback) {
        throw null;
    }

    @Override // android.webkit.CookieManager
    public final void setCookie(String str, String str2) throws Throwable {
        String strLLIZ;
        C2204961BRm.LLJ(null, str, str2, new C0WZX("dzBzEgAjS8/YVFkiQFyIfx2bdaMzSphZ1vNnQrubtpFHzMbSvQ7DBGqqpXeiL2AT2s8Y", null));
        if (C2162308dZ.LJI(C1BWL.LIZ()) && C0C25.LIZ() && (strLLIZ = C2204961BRm.LLIZ(CookieManager.getInstance(), C818020W7c.LIZIZ(), new C0WZX("dzBzEgAjS8/YVFkiQFyIfx2bdaMzSphZ1vNnQrubtpFHzMbSvQ7DBGqqpXeiL2AT2s8Y", null))) != null && !TextUtils.equals(strLLIZ, C818020W7c.LIZ())) {
            C818020W7c.LIZJ(C818020W7c.LIZIZ(), strLLIZ);
        }
    }

    @Override // android.webkit.CookieManager
    public final void setCookie(String str, String str2, final ValueCallback<Boolean> valueCallback) throws Throwable {
        if (C2162308dZ.LJI(C1BWL.LIZ()) && C0C25.LIZ()) {
            C2204961BRm.LLIZLLLIL(CookieManager.getInstance(), str, str2, new ValueCallback<Boolean>(valueCallback) { // from class: X.0W7W
                public final ValueCallback<Boolean> LIZ;

                {
                    this.LIZ = valueCallback;
                }

                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(Boolean bool) throws Throwable {
                    ValueCallback<Boolean> valueCallback2 = this.LIZ;
                    if (valueCallback2 != null) {
                        valueCallback2.onReceiveValue(bool);
                    }
                    String strLLIZ = C2204961BRm.LLIZ(C786410Ut5.A2(), C818020W7c.LIZIZ(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOytZpuA0DPYxmyah2CEOyi1/y1NUHnP54zTes3O9Q==", null));
                    if (strLLIZ != null && !TextUtils.equals(strLLIZ, C818020W7c.LIZ())) {
                        C818020W7c.LIZJ(C818020W7c.LIZIZ(), strLLIZ);
                    }
                }
            }, new C0WZX("dzBzEgAjS8/YVFkiQFyIfx2bdaMzSphZ1vNnQrubtpFHzMbSvQ7DBGqqpXeiL2AT2s8Y", null));
        } else {
            C2204961BRm.LLIZLLLIL(null, str, str2, valueCallback, new C0WZX("dzBzEgAjS8/YVFkiQFyIfx2bdaMzSphZ1vNnQrubtpFHzMbSvQ7DBGqqpXeiL2AT2s8Y", null));
        }
    }
}
