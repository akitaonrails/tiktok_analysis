package X;

import com.ss.android.ugc.aweme.ecommerce.mixmall.container.ECMMKContainerController;
import kotlin.jvm.internal.AwS614S0100000_35;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1Dxr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2272931Dxr extends AbstractC2272911Dxp implements InterfaceC1772410wDv, InterfaceC1768150w73 {
    public volatile boolean LLIZ;
    public volatile int LLIZLLLIL;
    public volatile boolean LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public volatile boolean LLJILJIL = true;

    @Override // X.InterfaceC1772410wDv
    public final void LIZ(String str) {
        C599820Nfo c599820Nfo = C599820Nfo.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("resumePlay by ");
        sbLIZ.append(str);
        sbLIZ.append(", pageReady:");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", tabIndex:");
        sbLIZ.append(this.LLIZLLLIL);
        C2188811AlT.LIZIZ(sbLIZ);
        c599820Nfo.getClass();
        C599820Nfo.LIZLLL();
        int iHashCode = str.hashCode();
        if (iHashCode == -321860608 ? str.equals("refreshEnd") : iHashCode == 109757538 ? str.equals("start") : !(iHashCode != 786138316 || !str.equals("scrollAfterRefresh"))) {
            this.LLJ = false;
        }
        if (this.LLIZ) {
            this.LL = true;
            if (this.LLIZLLLIL == 0) {
                this.LLJILJIL = true;
                LJIIJJI(true, false);
            }
        }
    }

    @Override // X.InterfaceC1772410wDv
    public final void LIZLLL(ECMMKContainerController eCMMKContainerController) {
        if (this.LLIZ) {
            return;
        }
        C599820Nfo.LIZ.getClass();
        C599820Nfo.LIZLLL();
        this.LLIZ = true;
        eCMMKContainerController.LL.LJ.getBodyList().LJ(new AwS614S0100000_35(this, 143));
        LIZ("start");
    }

    @Override // X.InterfaceC1772410wDv
    public final void LJIILIIL(int i) {
        C599820Nfo c599820Nfo = C599820Nfo.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onTabSelected: ");
        sbLIZ.append(i);
        C2188811AlT.LIZIZ(sbLIZ);
        c599820Nfo.getClass();
        C599820Nfo.LIZLLL();
        this.LLIZLLLIL = i;
        if (i == 0) {
            if (C1771440wCM.LIZJ() && this.LLJ) {
                C599820Nfo.LIZLLL();
                return;
            } else {
                LJII();
                LIZ("onTabSelected");
                return;
            }
        }
        LJIILLIIL("onTabSelected", true);
    }

    @Override // X.InterfaceC1772410wDv
    public final void LJIILLIIL(String str, boolean z) {
        EnumC2176021AEe enumC2176021AEe;
        if (Intrinsics.LJFF("refreshStart", str)) {
            this.LLJ = true;
        }
        if (Intrinsics.LJFF(str, "onTabSelected")) {
            enumC2176021AEe = EnumC2176021AEe.TAB_UNSELECTED;
        } else {
            enumC2176021AEe = EnumC2176021AEe.NO_PLAYABLE;
        }
        LJIJI(enumC2176021AEe, z);
    }
}
