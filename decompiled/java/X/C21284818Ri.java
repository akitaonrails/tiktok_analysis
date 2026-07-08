package X;

import Y.ARunnableS50S0110000_32;
import android.app.Activity;
import android.app.Dialog;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import kotlin.jvm.internal.AwS398S0200000_32;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18Ri, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21284818Ri extends C21284618Rg<InterfaceC613500O4m, C21285518Rp> {
    public C21284918Rj LLJIJIL;

    @Override // X.InterfaceC1393560mMs
    public final InterfaceC1393560mMs clone() {
        return new C21284818Ri();
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final int type() {
        return EnumC1430380nKG.ANCHOR_BOOKTOK.getTYPE();
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [X.18Rj] */
    @Override // X.C21284618Rg
    public final void LJJIJIIJI(final C21285518Rp c21285518Rp) {
        Boolean boolValueOf;
        LJJIJ(new AwS398S0200000_32(c21285518Rp, (C21285518Rp) this, (C21284618Rg<InterfaceC21284718Rh, C21285518Rp>) 75));
        LJJIJIL().LJIIIIZZ(this.LLJIJIL);
        String strLJIILJJIL = LJJIJIL().LJIILJJIL(this.LLIZ);
        boolean zLIZ = LJJIJIL().LIZ(this.LLIZ);
        c21285518Rp.setId(strLJIILJJIL);
        if (LJJIJIL().LJIILLIIL(strLJIILJJIL) != null) {
            boolValueOf = LJJIJIL().LJIILLIIL(strLJIILJJIL);
        } else {
            boolValueOf = Boolean.valueOf(zLIZ);
        }
        if (boolValueOf != null) {
            c21285518Rp.LJ(boolValueOf.booleanValue());
        }
        this.LLJIJIL = new C0O4M() { // from class: X.18Rj
            @Override // X.C0O4M
            public final void LIZ(String str, boolean z) {
                if (Intrinsics.LJFF(str, c21285518Rp.getId())) {
                    C21285518Rp c21285518Rp2 = c21285518Rp;
                    HandlerHook.viewPost(c21285518Rp2, new ARunnableS50S0110000_32(c21285518Rp2, z, 5));
                }
            }
        };
        LJJIJIL().LJIILIIL(this.LLJIJIL);
    }

    @Override // X.C21284618Rg, X.AbstractC1066910ds1, X.InterfaceC1393560mMs
    public final void yg(Activity activity, Dialog dialog) {
        super.yg(activity, dialog);
        if (!dialog.isShowing()) {
            LJJIJIL().LJIIIIZZ(this.LLJIJIL);
        }
    }
}
