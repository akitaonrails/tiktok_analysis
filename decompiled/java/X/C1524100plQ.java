package X;

import Y.AfS45S1100000_12;
import android.graphics.Bitmap;
import android.webkit.WebView;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.ss.android.ugc.aweme.serviceplugin.AddServicePluginAnchorActivity;
import com.ss.android.ugc.aweme.serviceplugin.IServicePluginPlatformManager;

/* JADX INFO: renamed from: X.0plQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1524100plQ extends AbstractC1541650qDj<C1ET2> implements InterfaceC1524070plN {
    public WebKitView LLIZ;
    public AddServicePluginAnchorActivity LLIZLLLIL;

    @Override // X.AbstractC1541650qDj
    public final void LIZJ() {
        C0V1Y c0v1yLIZ = LIZ();
        this.LLIZ = c0v1yLIZ instanceof WebKitView ? (WebKitView) c0v1yLIZ : null;
        C1541640qDi.LIZ(((C1BVV) LIZ()).getExtendableWebViewClient(), new AbstractC1541650qDj<C2205951BVh>(this) { // from class: X.0plR
            public final C759520Tqo LLIZ;

            @Override // X.AbstractC1541650qDj
            public final void LIZJ() {
                LJ("onPageStarted", this.LLIZ, 8000);
                LJ("onPageFinished", this.LLIZ, 8000);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [X.0Tqo] */
            {
                this.LLIZ = new AbstractC2205961BVi() { // from class: X.0Tqo
                    @Override // X.AbstractC1541670qDl
                    public final AbstractC1541650qDj<?> getExtension() {
                        return this.LL;
                    }

                    @Override // X.AbstractC2205961BVi
                    public final void onPageFinished(WebView webView, String str) {
                        super.onPageFinished(webView, str);
                        AddServicePluginAnchorActivity addServicePluginAnchorActivity = this.LLIZLLLIL;
                        if (addServicePluginAnchorActivity != null) {
                            addServicePluginAnchorActivity.LLLLZI();
                            addServicePluginAnchorActivity.LLJI = false;
                        }
                    }

                    @Override // X.AbstractC2205961BVi
                    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                        WebKitView webKitView;
                        String url;
                        super.onPageStarted(webView, str, bitmap);
                        AddServicePluginAnchorActivity addServicePluginAnchorActivity = this.LLIZLLLIL;
                        if (addServicePluginAnchorActivity != null) {
                            C1524100plQ c1524100plQ = addServicePluginAnchorActivity.LLJJI;
                            if (c1524100plQ != null && (webKitView = c1524100plQ.LLIZ) != null && (url = webKitView.getUrl()) != null) {
                                addServicePluginAnchorActivity.LLJILJILJ = url;
                            }
                            addServicePluginAnchorActivity.LLLLZI();
                            C197039127h c197039127h = addServicePluginAnchorActivity.LLILZ;
                            if (c197039127h != null) {
                                c197039127h.setEnabled(false);
                            }
                            addServicePluginAnchorActivity.LLJI = true;
                            String str2 = addServicePluginAnchorActivity.LLJILJILJ;
                            addServicePluginAnchorActivity.LLJILJIL.LIZ(((IServicePluginPlatformManager) addServicePluginAnchorActivity.LLJJIII.getValue()).LLLF(str2).LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LJJIIZ(new AfS45S1100000_12(addServicePluginAnchorActivity, str2, 5), new C09JN() { // from class: X.00Oy
                                @Override // X.C09JN
                                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                                    C1C7U.LIZ("AddServicePluginAnchorActivity@a4d7.validateUrl$2");
                                    C1C7U.LIZIZ("AddServicePluginAnchorActivity@a4d7.validateUrl$2");
                                }
                            }));
                        }
                    }
                };
            }
        });
    }
}
