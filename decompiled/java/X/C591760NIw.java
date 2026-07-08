package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.panel.IBaseListFragmentPanel;

/* JADX INFO: renamed from: X.0NIw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C591760NIw implements InterfaceC2179551ARt {
    public InterfaceC739770T0d LL;

    public final InterfaceC739770T0d LIZ() {
        InterfaceC739770T0d interfaceC739770T0d = this.LL;
        if (interfaceC739770T0d != null) {
            return interfaceC739770T0d;
        }
        return null;
    }

    @Override // X.InterfaceC2179551ARt
    public final void LJIILJJIL(C0NIR c0nir) {
        String strC7;
        Aweme awemeLLILLIZIL = LIZ().LLILLIZIL();
        Aweme awemeLJJIJIIJIL = LIZ().LJJIJIIJIL();
        IBaseListFragmentPanel iBaseListFragmentPanelLJJLIIIJJIZ = LIZ().LJJLIIIJJIZ();
        if (iBaseListFragmentPanelLJJLIIIJJIZ != null) {
            strC7 = iBaseListFragmentPanelLJJLIIIJJIZ.C7(true);
        } else {
            strC7 = null;
        }
        if (awemeLLILLIZIL != null && awemeLJJIJIIJIL != null && strC7 != null) {
            C587810N3r.LJFF(awemeLLILLIZIL, awemeLJJIJIIJIL, strC7, "click_audio_next");
        }
        C587810N3r.LIZJ = true;
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C591740NIu(this, null), 3);
    }

    @Override // X.InterfaceC2179551ARt
    public final void LJIJ(C0NIR c0nir) {
        String strC7;
        if (LIZ() != null) {
            Aweme awemeLJJLIIIJLJLI = LIZ().LJJLIIIJLJLI();
            Aweme awemeLLILLIZIL = LIZ().LLILLIZIL();
            IBaseListFragmentPanel iBaseListFragmentPanelLJJLIIIJJIZ = LIZ().LJJLIIIJJIZ();
            if (iBaseListFragmentPanelLJJLIIIJJIZ != null) {
                strC7 = iBaseListFragmentPanelLJJLIIIJJIZ.C7(true);
            } else {
                strC7 = null;
            }
            if (awemeLJJLIIIJLJLI != null && awemeLLILLIZIL != null && strC7 != null) {
                C587810N3r.LJFF(awemeLJJLIIIJLJLI, awemeLLILLIZIL, strC7, "click_audio_previous");
            }
        }
        C587810N3r.LIZJ = true;
        if (LIZ() != null) {
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C591750NIv(this, null), 3);
        }
    }
}
