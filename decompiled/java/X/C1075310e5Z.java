package X;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.ies.web.jsbridge.IESJsBridge;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.aweme.share.ShareDependServiceImpl;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0e5Z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1075310e5Z implements InterfaceC1370310llN {
    public final InterfaceC1037490d6Z LL;
    public final IESJsBridge LLILLJJLI;
    public final WebView LLILLL;

    @Override // X.InterfaceC1370310llN
    public final float LIZLLL() {
        return -1.0f;
    }

    @Override // X.InterfaceC1370310llN
    public final void LJI() {
    }

    @Override // X.InterfaceC1370310llN
    public final int LJII() {
        return R.raw.icon_2pt_arrow_clockwise;
    }

    @Override // X.InterfaceC1370310llN
    public final int LJIIIIZZ() {
        return R.raw.icon_2pt_arrow_clockwise;
    }

    @Override // X.InterfaceC1370310llN
    public final boolean LJIIIZ() {
        return false;
    }

    @Override // X.InterfaceC1370310llN
    public final Integer LJIILJJIL() {
        return null;
    }

    @Override // X.InterfaceC1370310llN
    public final void LJIILL(InterfaceC1362720lZ8 interfaceC1362720lZ8) {
    }

    @Override // X.InterfaceC1370310llN
    public final int LJIJJLI() {
        return 0;
    }

    @Override // X.InterfaceC1370310llN
    public final void LJJIIZI(View view, BaseSharePackage baseSharePackage) {
    }

    @Override // X.InterfaceC1370310llN
    public final void LJJIJ(ImageView imageView, View view, int i) {
    }

    @Override // X.InterfaceC1370310llN
    public final Integer LJJIJIIJIL() {
        return null;
    }

    @Override // X.InterfaceC1370310llN
    public final boolean LJJIL() {
        return true;
    }

    @Override // X.InterfaceC1370310llN
    public final String LJJIZ() {
        return "";
    }

    @Override // X.InterfaceC1370310llN
    public final void LJJJI(Context context, BaseSharePackage baseSharePackage) {
    }

    @Override // X.InterfaceC1370310llN
    public final void LJJJJI(BaseSharePackage baseSharePackage) {
    }

    @Override // X.InterfaceC1370310llN
    public final Integer LJJJJIZL() {
        return null;
    }

    @Override // X.InterfaceC1370310llN
    public final boolean LJJJJL() {
        return false;
    }

    @Override // X.InterfaceC1370450llb
    public final int LJJJJLI() {
        return 100;
    }

    @Override // X.InterfaceC1370310llN
    public final boolean LJJJLZIJ() {
        return false;
    }

    @Override // X.InterfaceC1370310llN
    public final int LJJLIIIJJIZ() {
        return R.string.rvr;
    }

    @Override // X.InterfaceC1370310llN
    public final boolean LJJLIIIJL() {
        return false;
    }

    @Override // X.InterfaceC1370310llN
    public final boolean enable() {
        return true;
    }

    @Override // X.InterfaceC1370310llN
    public final String key() {
        return "refresh";
    }

    @Override // X.InterfaceC1370310llN
    public final String label() {
        return "";
    }

    @Override // X.InterfaceC1370310llN
    public final int LJIIJJI() {
        return !enable() ? 1 : 0;
    }

    @Override // X.InterfaceC1370310llN
    public final C0M7Z LJIIJ() {
        return C0M7Z.ShareButton;
    }

    @Override // X.InterfaceC1370310llN
    public final EnumC1216710hld LJJJZ() {
        return EnumC1216710hld.NORMAL;
    }

    @Override // X.InterfaceC1370310llN
    public final void LJIJJ(TextView textView) {
        C1370320llO.LJ(this, textView);
    }

    @Override // X.InterfaceC1370310llN
    public final int LJJJJ(EnumC1369720lkQ enumC1369720lkQ) {
        return C1370320llO.LIZJ(enumC1369720lkQ);
    }

    @Override // X.InterfaceC1370310llN
    public final void LJIILIIL(Context context, BaseSharePackage baseSharePackage) {
        ShareDependService.LIZ.getClass();
        ShareDependServiceImpl.LJJJJI().LJJIIJZLJL(baseSharePackage.extras.getString("aweme_id"), baseSharePackage);
        InterfaceC1037490d6Z interfaceC1037490d6Z = this.LL;
        if (interfaceC1037490d6Z != null) {
            interfaceC1037490d6Z.refresh();
            return;
        }
        IESJsBridge iESJsBridge = this.LLILLJJLI;
        if (iESJsBridge != null) {
            WebView webView = iESJsBridge.LIZ;
            if (webView == null) {
                return;
            }
            webView.reload();
            return;
        }
        WebView webView2 = this.LLILLL;
        if (webView2 == null) {
            return;
        }
        webView2.reload();
    }

    @Override // X.InterfaceC1370310llN
    public final void LJJJJLL(View view, BaseSharePackage baseSharePackage) {
        C1370320llO.LIZ(this, view, baseSharePackage);
    }

    @Override // X.InterfaceC1370310llN
    public final void LJJLIIIIJ(View view, BaseSharePackage baseSharePackage) {
        C1370320llO.LIZIZ(this, view, baseSharePackage);
    }

    @Override // X.InterfaceC1370310llN
    public final void LJJLIIIJILLIZJL(Context context, BaseSharePackage baseSharePackage) {
        C1370320llO.LIZLLL(context, baseSharePackage, this);
    }

    public C1075310e5Z(InterfaceC1037490d6Z interfaceC1037490d6Z, IESJsBridge iESJsBridge, WebView webView, int i) {
        interfaceC1037490d6Z = (i & 1) != 0 ? null : interfaceC1037490d6Z;
        iESJsBridge = (i & 2) != 0 ? null : iESJsBridge;
        webView = (i & 4) != 0 ? null : webView;
        this.LL = interfaceC1037490d6Z;
        this.LLILLJJLI = iESJsBridge;
        this.LLILLL = webView;
    }
}
