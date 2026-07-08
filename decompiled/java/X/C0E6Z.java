package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.ss.android.ugc.gamora.editorpro.framework.datastore.EditModelProvider;

/* JADX INFO: renamed from: X.0E6Z, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0E6Z implements InterfaceC350230DoD, C0EMV {
    public final C0E5S LL;

    public C0E6Z(C0E5S c0e5s) {
        this.LL = c0e5s;
    }

    @Override // X.C0EMV
    public final void LIZ(C0EMO c0emo) {
        C0E48 c0e48 = c0emo.LIZ;
        if (c0e48 == null) {
            return;
        }
        c0e48.S7().LIZIZ(Boolean.TRUE, "about_to_exit_edit_page", false);
        c0e48.S7().LIZIZ(new C351100Dpc(null), "selected_nle_track", false);
        this.LL.w6(null, false, false);
    }

    @Override // X.InterfaceC350230DoD
    public final void LIZIZ(C348820Dlw c348820Dlw) {
        boolean zA1;
        NLEModel nLEModelLIZ = c348820Dlw.LIZ();
        if (nLEModelLIZ == null) {
            return;
        }
        EditModelProvider.Companion.getClass();
        C0EGC musicController = C0E1T.LIZ().getMusicController();
        NLETrack mainTrack = nLEModelLIZ.getMainTrack();
        if (mainTrack != null) {
            if (musicController != null) {
                zA1 = musicController.a1();
            } else {
                zA1 = false;
            }
            mainTrack.setExtra("ep_stick_point_switch", String.valueOf(zA1));
        }
    }

    @Override // X.C0EMV
    public final void LIZJ(C0EMO c0emo) {
        LIZ(c0emo);
        this.LL.QD2(false, false);
    }

    @Override // X.C0EMV
    public final void LJ(C0EMO c0emo) {
        LIZ(c0emo);
    }
}
