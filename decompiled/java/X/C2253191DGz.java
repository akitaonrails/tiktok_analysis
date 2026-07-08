package X;

import com.bytedance.bpea.basics.Cert;
import com.ss.android.ugc.aweme.absetting.DeferAudioCaptureInitAB;
import com.ss.android.ugc.aweme.absetting.PostFrameAudioCaptureInitAB;
import pyl.q;

/* JADX INFO: renamed from: X.1DGz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2253191DGz extends AbstractC2252991DGf {
    public final C2253181DGy LIZIZ;
    public final String LIZJ = "type_ui_operation";

    public final void LIZJ() {
        LIZIZ(this, "action_name_init_audio_capture", null, new C1662180tM8());
    }

    @Override // X.InterfaceC2190671AoT
    public final String getType() {
        return this.LIZJ;
    }

    public C2253191DGz(C2253181DGy c2253181DGy) {
        this.LIZIZ = c2253181DGy;
    }

    public final void LIZLLL(Cert cert) {
        LIZIZ(this, "action_name_release_audio_capture", cert, null);
    }

    public final void LJFF(Cert cert) {
        LIZIZ(this, "action_name_start_preview", cert, new C2253131DGt(false, 2));
    }

    public final void LJI(Cert cert) {
        LIZIZ(this, "action_name_stop_audio_capture", cert, null);
    }

    public final void LJ(Cert cert, Runnable runnable) {
        if ((DeferAudioCaptureInitAB.isEnabled() || PostFrameAudioCaptureInitAB.isEnabled()) && !this.LIZIZ.LIZ.St2().getAudioController().LJFF()) {
            LIZJ();
        }
        LIZIZ(this, "action_name_start_audio_capture", cert, new C1661540tL6(runnable));
    }

    public final void LJIIIIZZ(int i, Cert cert) {
        if (i != 0) {
            if (i == 1) {
                LIZIZ(this, "action_name_switch_shake_free_mode", cert, new C1DH5(true));
                return;
            }
            return;
        }
        LIZIZ(this, "action_name_switch_shake_free_mode", cert, new C1DH5(false));
    }

    public final void LJII(q qVar, Cert cert, String str) {
        LIZIZ(this, "action_name_switch_camera", cert, new C1DH4(qVar, str));
    }

    public static void LIZIZ(C2253191DGz c2253191DGz, String str, Cert cert, Object obj) {
        c2253191DGz.getClass();
        c2253191DGz.LIZ(new C2253021DGi(c2253191DGz.LIZJ, new C1660750tJp(0, 0), new C2253031DGj(c2253191DGz.LIZIZ.LIZ(obj, str), cert)));
    }
}
