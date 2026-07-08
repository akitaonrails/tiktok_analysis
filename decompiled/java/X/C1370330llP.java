package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;

/* JADX INFO: renamed from: X.0llP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C1370330llP implements InterfaceC1370310llN {
    public final InterfaceC1370310llN LL;

    @Override // X.InterfaceC1370450llb
    public final int LJJJJLI() {
        return 100;
    }

    @Override // X.InterfaceC1370310llN
    public final float LIZLLL() {
        return this.LL.LIZLLL();
    }

    @Override // X.InterfaceC1370310llN
    public final void LJI() {
        this.LL.LJI();
    }

    @Override // X.InterfaceC1370310llN
    public final int LJII() {
        return this.LL.LJII();
    }

    @Override // X.InterfaceC1370310llN
    public final int LJIIIIZZ() {
        return this.LL.LJIIIIZZ();
    }

    @Override // X.InterfaceC1370310llN
    public final boolean LJIIIZ() {
        return this.LL.LJIIIZ();
    }

    @Override // X.InterfaceC1370310llN
    public final C0M7Z LJIIJ() {
        return this.LL.LJIIJ();
    }

    @Override // X.InterfaceC1370310llN
    public final int LJIIJJI() {
        return this.LL.LJIIJJI();
    }

    @Override // X.InterfaceC1370310llN
    public final Integer LJIILJJIL() {
        return this.LL.LJIILJJIL();
    }

    @Override // X.InterfaceC1370310llN
    public final int LJIJJLI() {
        return this.LL.LJIJJLI();
    }

    @Override // X.InterfaceC1370310llN
    public final Integer LJJIJIIJIL() {
        return this.LL.LJJIJIIJIL();
    }

    @Override // X.InterfaceC1370310llN
    public final boolean LJJIL() {
        return this.LL.LJJIL();
    }

    @Override // X.InterfaceC1370310llN
    public final String LJJIZ() {
        return this.LL.LJJIZ();
    }

    @Override // X.InterfaceC1370310llN
    public final Integer LJJJJIZL() {
        return this.LL.LJJJJIZL();
    }

    @Override // X.InterfaceC1370310llN
    public final boolean LJJJJL() {
        return this.LL.LJJJJL();
    }

    @Override // X.InterfaceC1370310llN
    public final boolean LJJJLZIJ() {
        return this.LL.LJJJLZIJ();
    }

    @Override // X.InterfaceC1370310llN
    public final EnumC1216710hld LJJJZ() {
        return this.LL.LJJJZ();
    }

    @Override // X.InterfaceC1370310llN
    public final int LJJLIIIJJIZ() {
        return this.LL.LJJLIIIJJIZ();
    }

    @Override // X.InterfaceC1370310llN
    public final boolean LJJLIIIJL() {
        return this.LL.LJJLIIIJL();
    }

    @Override // X.InterfaceC1370310llN
    public final boolean enable() {
        return this.LL.enable();
    }

    @Override // X.InterfaceC1370310llN
    public final String key() {
        return this.LL.key();
    }

    @Override // X.InterfaceC1370310llN
    public final String label() {
        return this.LL.label();
    }

    public C1370330llP(InterfaceC1370310llN interfaceC1370310llN) {
        this.LL = interfaceC1370310llN;
    }

    @Override // X.InterfaceC1370310llN
    public final void LJIILL(InterfaceC1362720lZ8 interfaceC1362720lZ8) {
        this.LL.LJIILL(interfaceC1362720lZ8);
    }

    @Override // X.InterfaceC1370310llN
    public final void LJIJJ(TextView textView) {
        this.LL.LJIJJ(textView);
    }

    @Override // X.InterfaceC1370310llN
    public final int LJJJJ(EnumC1369720lkQ enumC1369720lkQ) {
        return this.LL.LJJJJ(enumC1369720lkQ);
    }

    @Override // X.InterfaceC1370310llN
    public final void LJJJJI(BaseSharePackage baseSharePackage) {
        this.LL.LJJJJI(baseSharePackage);
    }

    @Override // X.InterfaceC1370310llN
    public final void LJIILIIL(Context context, BaseSharePackage baseSharePackage) {
        C2196701AyC c2196701AyC = C2196701AyC.LIZ;
        String strKey = key();
        c2196701AyC.getClass();
        C2196701AyC.LJJII("tm_more_functional_panel_icon_click", strKey);
        this.LL.LJIILIIL(context, baseSharePackage);
    }

    @Override // X.InterfaceC1370310llN
    public final void LJJIIZI(View view, BaseSharePackage baseSharePackage) {
        C2196701AyC c2196701AyC = C2196701AyC.LIZ;
        String strKey = key();
        c2196701AyC.getClass();
        C2196701AyC.LJJII("tm_more_functional_panel_icon_click", strKey);
        this.LL.LJJIIZI(view, baseSharePackage);
    }

    @Override // X.InterfaceC1370310llN
    public final void LJJJI(Context context, BaseSharePackage baseSharePackage) {
        this.LL.LJJJI(context, baseSharePackage);
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

    @Override // X.InterfaceC1370310llN
    public final void LJJIJ(ImageView imageView, View view, int i) {
        this.LL.LJJIJ(imageView, view, i);
    }
}
