package X;

import android.content.Context;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.UriProtector;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Tlk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C756380Tlk extends FrameLayout {
    public LinearLayout LL;
    public SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LLILLJJLI;
    public final C427480GpW LLILLL;

    public final LinearLayout getPolicyWebContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.rf8);
            this.LL = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final void setPolicyWebContainerFromXml(LinearLayout linearLayout) {
        this.LL = linearLayout;
    }

    public C756380Tlk(Context context, String str, boolean z) {
        super(context, null, 0);
        C427480GpW c427480GpW = (C427480GpW) C786410Ut5.Td(C786410Ut5.ne(context), R.layout.e9p, this, true).findViewById(R.id.rf1);
        this.LLILLL = c427480GpW;
        if (!z) {
            C786410Ut5.LLZIL(c427480GpW, 8);
        }
        if (str != null) {
            String string = UriProtector.parse("aweme://webview").buildUpon().appendQueryParameter("url", str).appendQueryParameter("hide_loading", "1").build().toString();
            C1537900q7g c1537900q7g = C1541950qED.LIZJ;
            Context context2 = getContext();
            SparkContext sparkContext = new SparkContext();
            sparkContext.LJJLIIJ(string);
            sparkContext.LJJ(InterfaceC1057870ddR.class, new InterfaceC1057870ddR() { // from class: X.1DjD
                @Override // X.InterfaceC1163130gND
                public final void release() {
                }

                @Override // X.InterfaceC1057870ddR
                public final void LJJJLL(InterfaceC1531560pxS interfaceC1531560pxS) {
                    final C756380Tlk c756380Tlk = this.LL;
                    ((C1541480qDS) interfaceC1531560pxS).LIZLLL = new C1542400qEw() { // from class: X.1DjC
                        @Override // X.C1BVX
                        public final void onProgressChanged(WebView webView, int i) {
                            c756380Tlk.LLILLL.setProgress(i);
                        }
                    };
                }
            });
            c1537900q7g.getClass();
            this.LLILLJJLI = new C1541950qED(context2, sparkContext).LIZ(false);
            getPolicyWebContainerFromXml().addView(this.LLILLJJLI, new ViewGroup.LayoutParams(-1, -1));
        }
    }
}
