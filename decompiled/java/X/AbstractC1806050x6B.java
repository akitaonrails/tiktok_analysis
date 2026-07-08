package X;

import com.bytedance.android.live.walletclean.presentation.assem.body.view.RechargePanelBodyDialogAbility;
import com.bytedance.android.livesdk.wallet.Diamond;

/* JADX INFO: renamed from: X.0x6B, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public abstract class AbstractC1806050x6B implements InterfaceC1807160x7y {
    public final InterfaceC1806590x73 LIZ;
    public final RechargePanelBodyDialogAbility LIZIZ;

    @Override // X.InterfaceC1806590x73
    public final void LIZJ(boolean z, int i, C1806600x74 c1806600x74) {
    }

    @Override // X.InterfaceC1806580x72
    public final void LJI() {
        InterfaceC1806590x73 interfaceC1806590x73 = this.LIZ;
        if (interfaceC1806590x73 != null) {
            interfaceC1806590x73.LJI();
        }
    }

    @Override // X.InterfaceC1807160x7y
    public final void LJIIL() {
        RechargePanelBodyDialogAbility rechargePanelBodyDialogAbility = this.LIZIZ;
        if (rechargePanelBodyDialogAbility != null) {
            rechargePanelBodyDialogAbility.iP2();
        }
    }

    @Override // X.InterfaceC1806590x73
    public final void LJIIJ(Diamond diamond) {
        InterfaceC1806590x73 interfaceC1806590x73 = this.LIZ;
        if (interfaceC1806590x73 != null) {
            interfaceC1806590x73.LJIIJ(diamond);
        }
    }

    @Override // X.InterfaceC1806240x6U
    public final void LJIIJJI(String str) {
        InterfaceC1806590x73 interfaceC1806590x73 = this.LIZ;
        if (interfaceC1806590x73 != null) {
            interfaceC1806590x73.LJIIJJI(str);
        }
    }

    @Override // X.InterfaceC1806240x6U
    public final void LJIILIIL(C1797200wru c1797200wru) {
        InterfaceC1806590x73 interfaceC1806590x73 = this.LIZ;
        if (interfaceC1806590x73 != null) {
            interfaceC1806590x73.LJIILIIL(c1797200wru);
        }
    }

    public AbstractC1806050x6B(InterfaceC1806590x73 interfaceC1806590x73, RechargePanelBodyDialogAbility rechargePanelBodyDialogAbility) {
        this.LIZ = interfaceC1806590x73;
        this.LIZIZ = rechargePanelBodyDialogAbility;
    }

    @Override // X.InterfaceC1806590x73
    public final void LJIIIIZZ(int i, int i2) {
        InterfaceC1806590x73 interfaceC1806590x73 = this.LIZ;
        if (interfaceC1806590x73 != null) {
            interfaceC1806590x73.LJIIIIZZ(i, i2);
        }
    }
}
