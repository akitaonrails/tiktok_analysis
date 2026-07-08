package X;

import android.net.Uri;
import android.webkit.WebView;
import com.bytedance.hybrid.spark.security.web_js.setting.JSInjectConfig;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: renamed from: X.0qIo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1544800qIo extends C09AY implements InterfaceC1685420txc<String, String, AbstractC1544900qIy, JSInjectConfig, C1544870qIv, Boolean> {
    public final /* synthetic */ WebView LL;
    public final /* synthetic */ Uri LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1544800qIo(Uri uri, WebView webView) {
        super(5);
        this.LL = webView;
        this.LLILLJJLI = uri;
    }

    @Override // X.InterfaceC1685420txc
    public final Boolean invoke(String str, String str2, AbstractC1544900qIy abstractC1544900qIy, JSInjectConfig jSInjectConfig, C1544870qIv c1544870qIv) {
        String str3 = str;
        String str4 = str2;
        AbstractC1544900qIy abstractC1544900qIy2 = abstractC1544900qIy;
        JSInjectConfig jSInjectConfig2 = jSInjectConfig;
        C1544870qIv c1544870qIv2 = c1544870qIv;
        boolean z = false;
        if (str3.length() > 0) {
            int i = C1544880qIw.LIZ;
            String str5 = (String) C1544880qIw.LIZLLL(this.LL, this.LLILLJJLI, str3, jSInjectConfig2, abstractC1544900qIy2, null).getSecond();
            String strLIZIZ = C20509081r.LIZIZ(this.LLILLJJLI);
            if (strLIZIZ != null) {
                C1544860qIu c1544860qIu = C1544760qIk.LIZ;
                WebView webView = this.LL;
                Uri uri = this.LLILLJJLI;
                Set setSingleton = Collections.singleton(strLIZIZ);
                EnumC1541410qDL enumC1541410qDL = EnumC1541410qDL.ONLY_MAINFRAMES;
                c1544860qIu.getClass();
                boolean zLIZ = C1544860qIu.LIZ(webView, str5, uri, setSingleton, str4, enumC1541410qDL);
                C1544870qIv.LIZIZ(c1544870qIv2, this.LL, false, "js_inject_manage_client_inline_main", null, null, null, 56);
                z = zLIZ;
            }
        }
        return Boolean.valueOf(z);
    }
}
