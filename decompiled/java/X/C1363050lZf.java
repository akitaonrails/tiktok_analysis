package X;

import Y.ACListenerS155S0100000_21;
import android.animation.AnimatorSet;
import android.widget.LinearLayout;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import java.io.Serializable;
import java.util.Collection;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: renamed from: X.0lZf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1363050lZf extends C1364640lcE {
    public final C1363060lZg LJIJ;
    public final SharePackage LJIJI;
    public final InterfaceC1364650lcF LJIJJ;
    public final boolean LJIJJLI;
    public final boolean LJIL;
    public boolean LJJ;
    public final C01GW LJJI;
    public final C01GW LJJIFFI;

    @Override // X.C1364640lcE, X.InterfaceC1365090lcx
    public final boolean LIZJ(Function1<? super Serializable, Unit> function1) {
        return false;
    }

    @Override // X.C1364640lcE
    public final void LJII() {
        LJI(false);
    }

    @Override // X.C1364640lcE, X.InterfaceC1365090lcx
    public final boolean eo() {
        return false;
    }

    @Override // X.C1364640lcE, X.InterfaceC1365090lcx
    public final void LIZLLL() {
        boolean z = this.LJIJJLI || (((Boolean) this.LJJI.getValue()).booleanValue() && ((Boolean) this.LJJIFFI.getValue()).booleanValue());
        this.LJIJ.LIZIZ.setClickable(false);
        C786410Ut5.R7(this.LJIJ.LIZ, new ACListenerS155S0100000_21(this, 226));
        if (z) {
            LJIIJ(z);
        }
    }

    @Override // X.C1364640lcE
    public final void LJIIIIZZ() {
        super.LJIIIIZZ();
    }

    @Override // X.C1364640lcE, X.InterfaceC1365090lcx
    public final boolean isChecked() {
        return this.LJJ;
    }

    @Override // X.C1364640lcE, X.InterfaceC1365090lcx
    public final void LIZ(Collection<? extends IMContact> collection) {
        super.LIZ(collection);
        if (collection.isEmpty() && !this.LJIL) {
            if (this.LJIJ.LIZ.getVisibility() != 8) {
                if (!((Boolean) this.LJJI.getValue()).booleanValue()) {
                    LJIIJ(false);
                }
                ((AnimatorSet) this.LJIIIZ.getValue()).start();
                return;
            }
            return;
        }
        LinearLayout linearLayout = this.LJIJ.LIZ;
        if (linearLayout.getVisibility() == 0) {
            return;
        }
        C786410Ut5.LJZL(0, linearLayout);
        ((AnimatorSet) this.LJIIIIZZ.getValue()).start();
    }

    public final void LJIIJ(boolean z) {
        if (this.LJJ == z) {
            return;
        }
        this.LJJ = z;
        this.LJIJ.LIZIZ.setChecked(z);
        if (((Boolean) this.LJJI.getValue()).booleanValue() && ((Boolean) this.LJJIFFI.getValue()).booleanValue() != z) {
            Keva keva = (Keva) C1340600kzS.LIZ.getValue();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("share_panel_checkbox_");
            sbLIZ.append(C461720I8s.LIZIZ());
            keva.storeBoolean(C2188811AlT.LIZIZ(sbLIZ), z);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1363050lZf(C1363060lZg c1363060lZg, SharePackage sharePackage, InterfaceC1364650lcF interfaceC1364650lcF, boolean z, int i) {
        z = (i & 8) != 0 ? false : z;
        super(c1363060lZg, sharePackage, interfaceC1364650lcF, z, false);
        this.LJIJ = c1363060lZg;
        this.LJIJI = sharePackage;
        this.LJIJJ = interfaceC1364650lcF;
        this.LJIJJLI = z;
        this.LJIL = false;
        this.LJJI = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1420));
        this.LJJIFFI = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(545));
    }
}
