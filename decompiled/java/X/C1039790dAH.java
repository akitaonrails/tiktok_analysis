package X;

import android.webkit.WebView;
import com.ss.android.ugc.aweme.web.webcallback.AdWebViewClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0dAH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1039790dAH extends C09AY implements Function0<Unit> {
    public final /* synthetic */ AdWebViewClient LL;
    public final /* synthetic */ WebView LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ C259800zU<String> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1039790dAH(AdWebViewClient adWebViewClient, WebView webView, String str, int i, C259800zU<String> c259800zU) {
        super(0);
        this.LL = adWebViewClient;
        this.LLILLJJLI = webView;
        this.LLILLL = str;
        this.LLILZ = i;
        this.LLILZIL = c259800zU;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C1039700dA8.LJ(this.LL.adWebViewExtension, this.LLILLJJLI, this.LLILLL, false, this.LLILZ, this.LLILZIL.element);
        return Unit.LIZ;
    }
}
