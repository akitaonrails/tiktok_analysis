package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: renamed from: X.0lvq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1376800lvq implements InterfaceC1370310llN {
    public final C1373880lr8 LL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1395));

    @Override // X.InterfaceC1370310llN
    public final float LIZLLL() {
        return -1.0f;
    }

    @Override // X.InterfaceC1370310llN
    public final boolean LJIIIZ() {
        return false;
    }

    @Override // X.InterfaceC1370310llN
    public final void LJIILIIL(Context context, BaseSharePackage baseSharePackage) {
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
    public final boolean LJJLIIIJL() {
        return false;
    }

    @Override // X.InterfaceC1370310llN
    public final boolean enable() {
        return true;
    }

    @Override // X.InterfaceC1370310llN
    public final String label() {
        return "";
    }

    @Override // X.InterfaceC1370310llN
    public final void LJI() {
        AbstractC1376810lvr abstractC1376810lvr;
        C1373880lr8 c1373880lr8 = this.LL;
        if (c1373880lr8 == null || (abstractC1376810lvr = c1373880lr8.LIZIZ) == null) {
            return;
        }
        abstractC1376810lvr.LIZJ();
    }

    @Override // X.InterfaceC1370310llN
    public final int LJII() {
        C1374250lrj c1374250lrj;
        C1376820lvs c1376820lvs = (C1376820lvs) this.LLILLJJLI.getValue();
        if (c1376820lvs != null) {
            return c1376820lvs.LIZIZ;
        }
        C1373880lr8 c1373880lr8 = this.LL;
        if (c1373880lr8 == null || (c1374250lrj = c1373880lr8.LIZ) == null) {
            return -1;
        }
        return c1374250lrj.LIZ;
    }

    @Override // X.InterfaceC1370310llN
    public final int LJIIIIZZ() {
        C1374250lrj c1374250lrj;
        C1376820lvs c1376820lvs = (C1376820lvs) this.LLILLJJLI.getValue();
        if (c1376820lvs != null) {
            return c1376820lvs.LIZ;
        }
        C1373880lr8 c1373880lr8 = this.LL;
        if (c1373880lr8 == null || (c1374250lrj = c1373880lr8.LIZ) == null) {
            return -1;
        }
        return c1374250lrj.LIZ;
    }

    @Override // X.InterfaceC1370310llN
    public final int LJJLIIIJJIZ() {
        C1374250lrj c1374250lrj;
        C1373880lr8 c1373880lr8 = this.LL;
        if (c1373880lr8 == null || (c1374250lrj = c1373880lr8.LIZ) == null) {
            return -1;
        }
        return c1374250lrj.LIZIZ;
    }

    @Override // X.InterfaceC1370310llN
    public final String key() {
        C1374250lrj c1374250lrj;
        String str;
        C1373880lr8 c1373880lr8 = this.LL;
        return (c1373880lr8 == null || (c1374250lrj = c1373880lr8.LIZ) == null || (str = c1374250lrj.LIZJ) == null) ? "" : str;
    }

    @Override // X.InterfaceC1370310llN
    public final int LJIIJJI() {
        return !enable() ? 1 : 0;
    }

    @Override // X.InterfaceC1370310llN
    public final C0M7Z LJIIJ() {
        return C0M7Z.LongPress;
    }

    @Override // X.InterfaceC1370310llN
    public final EnumC1216710hld LJJJZ() {
        return EnumC1216710hld.NORMAL;
    }

    public C1376800lvq(C1373880lr8 c1373880lr8) {
        this.LL = c1373880lr8;
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
    public final void LJJIIZI(View view, BaseSharePackage baseSharePackage) {
        AbstractC1376810lvr abstractC1376810lvr;
        C1373880lr8 c1373880lr8 = this.LL;
        if (c1373880lr8 != null && (abstractC1376810lvr = c1373880lr8.LIZIZ) != null) {
            abstractC1376810lvr.LJII(view);
        }
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
