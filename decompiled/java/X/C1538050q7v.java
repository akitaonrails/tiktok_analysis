package X;

import android.content.Context;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.util.HashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: X.0q7v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1538050q7v extends C1537510q73 {
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final boolean LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public InterfaceC1538960q9O LLJ;

    public String applyAppendCommonParamsUrl(String str) {
        return str;
    }

    public boolean applyCommonShouldOverrideUrl(WebView webView, String str) {
        return false;
    }

    public String applyGlobalLoadUrl(String str) {
        return str;
    }

    public void applyGlobalSettings(WebSettings webSettings, WebView webView) {
    }

    public HashMap<String, Object> getStableProps(Context context) {
        return null;
    }

    public HashMap<String, Object> getUnstableProps(Context context, C1537480q70 c1537480q70, boolean z) {
        return null;
    }

    public final String getAppId() {
        return this.LLILLJJLI;
    }

    public final String getAppVersion() {
        return this.LLILLL;
    }

    public final boolean getCompatReuseKitInitParamIssue() {
        return this.LLILZLL;
    }

    public final String getDid() {
        return this.LLILZ;
    }

    public final InterfaceC1538960q9O getNativeStorageVisitor() {
        return this.LLJ;
    }

    public final boolean getNeedIgnoreNavigationBarMode() {
        return this.LLIZLLLIL;
    }

    public final String getRegion() {
        return this.LL;
    }

    public final boolean getUseWeakReferenceForSparkContextTransfer() {
        return this.LLIZ;
    }

    public final boolean isDebug() {
        return this.LLILZIL;
    }

    public final void setCompatReuseKitInitParamIssue(boolean z) {
        this.LLILZLL = z;
    }

    public final void setNativeStorageVisitor(InterfaceC1538960q9O interfaceC1538960q9O) {
        this.LLJ = interfaceC1538960q9O;
    }

    public final void setNeedIgnoreNavigationBarMode(boolean z) {
        this.LLIZLLLIL = z;
    }

    public final void setUseWeakReferenceForSparkContextTransfer(boolean z) {
        this.LLIZ = z;
    }

    public static /* synthetic */ HashMap getUnstableProps$default(C1538050q7v c1538050q7v, Context context, C1537480q70 c1537480q70, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                z = false;
            }
            return c1538050q7v.getUnstableProps(context, c1537480q70, z);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getUnstableProps");
    }

    public C1538050q7v(String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, InterfaceC1538960q9O interfaceC1538960q9O) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = str4;
        this.LLILZIL = z;
        this.LLILZLL = z2;
        this.LLIZ = z3;
        this.LLIZLLLIL = z4;
        this.LLJ = interfaceC1538960q9O;
    }

    public /* synthetic */ C1538050q7v(String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, InterfaceC1538960q9O interfaceC1538960q9O, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, z, (i & 32) != 0 ? false : z2, (i & 64) != 0 ? false : z3, (i & 128) != 0 ? false : z4, (i & 256) != 0 ? null : interfaceC1538960q9O);
    }
}
