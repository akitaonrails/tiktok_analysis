package X;

import Y.ACListenerS82S0300000_16;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS417S0200000_16;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cQ4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1011140cQ4 extends AbstractC1010710cPN<ViewGroup> {
    @Override // X.AbstractC1010710cPN
    /* JADX INFO: renamed from: LJII, reason: merged with bridge method [inline-methods] */
    public final ViewGroup LIZIZ() {
        ViewGroup viewGroup = this.LL.LIZ;
        if (viewGroup != null) {
            return (ViewGroup) viewGroup.findViewById(R.id.ab4);
        }
        return null;
    }

    @Override // X.AbstractC1010710cPN, X.C0PPF
    public final void bind() {
        int i = C658170Prj.LIZ[this.LL.LIZJ.ordinal()];
        if (i == 1) {
            InterfaceC1010250cOd interfaceC1010250cOd = this.LL.LJI;
            InterfaceC1011000cPq interfaceC1011000cPq = (InterfaceC1011000cPq) (interfaceC1010250cOd instanceof InterfaceC1011000cPq ? interfaceC1010250cOd : null);
            if (interfaceC1011000cPq != null) {
                interfaceC1011000cPq.Ib(LIZIZ());
                return;
            }
            return;
        }
        if (i == 2) {
            InterfaceC1010250cOd interfaceC1010250cOd2 = this.LL.LJI;
            if (!(interfaceC1010250cOd2 instanceof InterfaceC1011400cQU)) {
                interfaceC1010250cOd2 = null;
            }
            InterfaceC1011400cQU interfaceC1011400cQU = (InterfaceC1011400cQU) interfaceC1010250cOd2;
            ViewGroup viewGroupLIZIZ = LIZIZ();
            C1012300cRw c1012300cRw = viewGroupLIZIZ instanceof C1012300cRw ? (C1012300cRw) viewGroupLIZIZ : null;
            if (Intrinsics.LJFF(interfaceC1011400cQU != null ? Boolean.valueOf(interfaceC1011400cQU.LJIIIZ()) : null, Boolean.TRUE)) {
                if (c1012300cRw != null) {
                    C786410Ut5.Ja(c1012300cRw, new ACListenerS82S0300000_16(interfaceC1011400cQU, this, c1012300cRw, 8));
                }
                InterfaceC1011430cQX interfaceC1011430cQX = this.LL.LIZLLL;
                if (interfaceC1011430cQX != null) {
                    interfaceC1011430cQX.LIZLLL(EnumC1011130cQ3.PHOTO_CARD_REQUEST_TO_PLAY, new AwS417S0200000_16(interfaceC1011400cQU, c1012300cRw, 78));
                }
                InterfaceC1011430cQX interfaceC1011430cQX2 = this.LL.LIZLLL;
                if (interfaceC1011430cQX2 != null) {
                    interfaceC1011430cQX2.LIZLLL(EnumC1011130cQ3.PHOTO_CARD_REQUEST_TO_PAUSE, new AwS560S0100000_16(c1012300cRw, 775));
                }
            }
        }
    }

    public C1011140cQ4(C1010580cPA c1010580cPA) {
        super(c1010580cPA);
    }

    @Override // X.AbstractC1010710cPN
    public final boolean LJFF(C1010580cPA c1010580cPA) {
        EnumC658110Prd enumC658110Prd = c1010580cPA.LIZJ;
        if (enumC658110Prd != EnumC658110Prd.NORMAL_VIDEO_AD && enumC658110Prd != EnumC658110Prd.CAROUSEL_ADS) {
            return false;
        }
        return true;
    }
}
