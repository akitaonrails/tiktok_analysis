package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.ss.android.ugc.aweme.minis.model.NetworkResponse;
import com.ss.android.ugc.aweme.minis.model.TiktokMinisLinkResponse;
import com.ss.android.ugc.aweme.minis.page.main.fragment.ShareSheetPanelFragment;
import com.ss.android.ugc.aweme.minis.viewmodel.MinisViewModel;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0lz7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1378830lz7 implements InterfaceC1370310llN {
    public final C1378700lyu LL;

    @Override // X.InterfaceC1370310llN
    public final float LIZLLL() {
        return -1.0f;
    }

    @Override // X.InterfaceC1370310llN
    public final void LJI() {
    }

    @Override // X.InterfaceC1370310llN
    public final int LJII() {
        return R.raw.icon_link_fill;
    }

    @Override // X.InterfaceC1370310llN
    public final int LJIIIIZZ() {
        return R.raw.icon_link_fill;
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
        return 2131822224;
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
        return "minis_link_share";
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

    public C1378830lz7(C1378700lyu c1378700lyu) {
        this.LL = c1378700lyu;
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
    public final void LJIILIIL(final Context context, BaseSharePackage baseSharePackage) {
        String strBQ;
        C2196701AyC.LIZ.getClass();
        C2196701AyC.LJIJI("share link", "");
        InterfaceC1378810lz5 interfaceC1378810lz5 = this.LL.LJFF;
        if (interfaceC1378810lz5 != null) {
            strBQ = interfaceC1378810lz5.BQ();
        } else {
            strBQ = null;
        }
        C1378700lyu c1378700lyu = this.LL;
        C1383140m64.LIZIZ(c1378700lyu.LJ, strBQ, c1378700lyu.LIZJ, new InterfaceC1383150m65() { // from class: X.0lzA
            @Override // X.InterfaceC1383150m65
            public final void LIZ(boolean z, C1378790lz3 c1378790lz3) {
                String strBQ2;
                int i = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("fetchMinisLink, jsb onResult, isSuccess:");
                sbLIZ.append(z);
                sbLIZ.append(", shareInfo:");
                sbLIZ.append(c1378790lz3);
                C2188811AlT.LIZIZ(sbLIZ);
                if (z) {
                    if (c1378790lz3 == null) {
                        return;
                    }
                    InterfaceC1378810lz5 interfaceC1378810lz52 = this.LIZ.LL.LJFF;
                    if (interfaceC1378810lz52 != null) {
                        strBQ2 = interfaceC1378810lz52.BQ();
                    } else {
                        strBQ2 = null;
                    }
                    final C1378700lyu c1378700lyu2 = this.LIZ.LL;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("fetchMinisLink, shareInfo:");
                    sbLIZ2.append(c1378790lz3);
                    C2188811AlT.LIZIZ(sbLIZ2);
                    MinisViewModel minisViewModel = c1378700lyu2.LIZJ;
                    if (minisViewModel != null) {
                        minisViewModel.wQ2(c1378700lyu2.LIZLLL, c1378790lz3, strBQ2, new InterfaceC1378930lzH() { // from class: X.0lzC
                            @Override // X.InterfaceC1378930lzH
                            public final void LIZ(boolean z2, NetworkResponse<TiktokMinisLinkResponse> networkResponse) {
                                TiktokMinisLinkResponse tiktokMinisLinkResponse;
                                TiktokMinisLinkResponse tiktokMinisLinkResponse2;
                                String str;
                                String str2 = null;
                                if (networkResponse != null && (tiktokMinisLinkResponse2 = networkResponse.data) != null && (str = tiktokMinisLinkResponse2.minisLink) != null) {
                                    C1378700lyu c1378700lyu3 = c1378700lyu2;
                                    C0K53.LIZ(c1378700lyu3.LIZ, str);
                                    C1389890mGx c1389890mGx = new C1389890mGx(c1378700lyu3.LIZ);
                                    c1389890mGx.LJIIIZ(2131822329);
                                    c1389890mGx.LJFF(R.raw.icon_tick_circle_fill);
                                    c1389890mGx.LJII(R.attr.a1h);
                                    c1389890mGx.LJIIJJI();
                                }
                                Context context2 = c1378700lyu2.LIZIZ;
                                if (context2 != null) {
                                    String str3 = ShareSheetPanelFragment._pnsPageId;
                                    C1378440lyU.LIZ(context2);
                                }
                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                sbLIZ3.append("fetchMinisLink, isSuccess:");
                                sbLIZ3.append(z2);
                                sbLIZ3.append(", resp:");
                                if (networkResponse != null && (tiktokMinisLinkResponse = networkResponse.data) != null) {
                                    str2 = tiktokMinisLinkResponse.minisLink;
                                }
                                sbLIZ3.append(str2);
                                C2188811AlT.LIZIZ(sbLIZ3);
                            }
                        });
                    }
                }
                String str = ShareSheetPanelFragment._pnsPageId;
                C1378440lyU.LIZ(context);
            }
        });
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
}
