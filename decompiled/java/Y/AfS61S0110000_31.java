package Y;

import X.C09JN;
import X.C0XZJ;
import X.C1AI9;
import X.C1AIP;
import X.C1C7U;
import X.C20441214yg;
import X.C2188811AlT;
import X.InterfaceC20325014fw;

/* JADX INFO: loaded from: classes32.dex */
public class AfS61S0110000_31 implements C09JN {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
        }
    }

    public AfS61S0110000_31(C1AI9 c1ai9, int i) {
        this.$t = i;
        this.z1 = true;
        this.l0 = c1ai9;
    }

    public static final void accept$0(AfS61S0110000_31 afS61S0110000_31, Object obj) {
        C1C7U.LIZ("CredentialManagerService@16d5.createPasskey$1$1$2");
        Throwable th = (Throwable) obj;
        if ((th instanceof C0XZJ) && th != null) {
            ((InterfaceC20325014fw) afS61S0110000_31.l0).LIZ(th, true, afS61S0110000_31.z1);
        }
        C1C7U.LIZIZ("CredentialManagerService@16d5.createPasskey$1$1$2");
    }

    public static final void accept$1(AfS61S0110000_31 afS61S0110000_31, Object obj) {
        C1C7U.LIZ("ViewerWishesSettingsPresenter@547f.updateGiftPicks$2");
        Throwable th = (Throwable) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateGiftPicks failed, message = ");
        sbLIZ.append(th.getMessage());
        C20441214yg.LJ("ViewerWishesSettingPresenter", C2188811AlT.LIZIZ(sbLIZ));
        if (afS61S0110000_31.z1) {
            C1AIP c1aip = ((C1AI9) afS61S0110000_31.l0).LIZ;
            th.getMessage();
            c1aip.Ak();
        }
        ((C1AI9) afS61S0110000_31.l0).LJJIII = false;
        C1C7U.LIZIZ("ViewerWishesSettingsPresenter@547f.updateGiftPicks$2");
    }

    public AfS61S0110000_31(InterfaceC20325014fw interfaceC20325014fw, boolean z, int i) {
        this.$t = i;
        this.l0 = interfaceC20325014fw;
        this.z1 = z;
    }
}
