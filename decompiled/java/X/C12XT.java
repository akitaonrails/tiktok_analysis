package X;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.12XT, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12XT {
    public View LIZ;
    public C12MC LIZIZ;
    public C12MC LIZJ;
    public TextView LIZLLL;
    public TextView LJ;
    public View LJFF;
    public C19EG LJI;
    public boolean LJIIIZ;
    public final VideoPublishEditModel LJIIJ;
    public C12XZ LJIIJJI;
    public C12XU LJIIL;
    public InterfaceC524950KiL LJIILIIL;
    public int LJII = 100;
    public int LJIIIIZZ = 100;
    public final C12XV LJIILJJIL = new InterfaceC362610EJn() { // from class: X.12XV
        @Override // X.InterfaceC362610EJn
        public final boolean onKeyDown(int i, KeyEvent keyEvent) {
            C12XU c12xu;
            C12XT c12xt = this.LL;
            if (i == 4) {
                if (c12xt.LJIIIZ && (c12xu = c12xt.LJIIL) != null) {
                    c12xu.LIZ();
                    return true;
                }
                return false;
            }
            c12xt.getClass();
            return false;
        }
    };
    public View LJIILL = null;
    public boolean LJIILLIIL = false;

    public final void LIZJ() {
        C12XU c12xu = this.LJIIL;
        if (c12xu != null) {
            c12xu.LIZ();
        }
        try {
            C1637890six.LIZ("aweme_short_video_volume_set", null, new JSONObject().put("mVoiceVolume", this.LJIIIIZZ).put("mMusicVolume", this.LJII));
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.12XV] */
    public C12XT(VideoPublishEditModel videoPublishEditModel) {
        this.LJIIJ = videoPublishEditModel;
    }

    public final void LIZ(boolean z) {
        C12MC c12mc;
        float f;
        if (this.LJIIIZ && (c12mc = this.LIZJ) != null) {
            c12mc.setEnabled(z);
            C12MC c12mc2 = this.LIZJ;
            if (z) {
                f = 1.0f;
            } else {
                f = 0.5f;
            }
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c12mc2);
            c12mc2.setAlpha(f);
            if (!z) {
                this.LIZJ.setProgress(0);
            }
        }
    }

    public final void LIZIZ(boolean z) {
        C12MC c12mc;
        float f;
        float f2 = 1.0f;
        if (this.LJIIIZ && (c12mc = this.LIZIZ) != null) {
            c12mc.setEnabled(z);
            C12MC c12mc2 = this.LIZIZ;
            if (z) {
                f = 1.0f;
            } else {
                f = 0.5f;
            }
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c12mc2);
            c12mc2.setAlpha(f);
            if (!z) {
                this.LIZIZ.setProgress(0);
            }
        }
        VideoPublishEditModel videoPublishEditModel = this.LJIIJ;
        if (videoPublishEditModel != null && videoPublishEditModel.getVeAudioRecorderParam() != null && this.LIZIZ != null) {
            if (!this.LJIIJ.getVeAudioRecorderParam().getNeedOriginalSound()) {
                this.LIZIZ.setEnabled(false);
                C12MC c12mc3 = this.LIZIZ;
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c12mc3);
                c12mc3.setAlpha(0.5f);
            } else if (this.LJIIJ.hasOriginalSound(false) && !this.LJIIJ.isMuted()) {
                this.LIZIZ.setEnabled(z);
                C12MC c12mc4 = this.LIZIZ;
                if (!z) {
                    f2 = 0.5f;
                }
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c12mc4);
                c12mc4.setAlpha(f2);
            } else {
                this.LIZIZ.setEnabled(false);
                C12MC c12mc5 = this.LIZIZ;
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c12mc5);
                c12mc5.setAlpha(0.5f);
            }
            if (this.LJIIJ.getMMusicPath() != null) {
                this.LJII = (int) (this.LJIIJ.getMusicVolume() * 100.0f);
            }
            this.LIZIZ.setProgress((int) (this.LJIIJ.getVoiceVolume() * 100.0f));
        }
    }

    public final void LIZLLL(boolean z) {
        if (!this.LJIIIZ) {
            return;
        }
        if (z) {
            View view = this.LIZ;
            if (view != null) {
                C786410Ut5.LJLLLLLL(0, view);
                C786410Ut5.ed(this.LIZ, C0JAI.LIZ(400.0f, this.LJI));
                this.LIZ.animate().translationY(0.0f).setDuration(400L).start();
            }
            InterfaceC524950KiL interfaceC524950KiL = this.LJIILIIL;
            if (interfaceC524950KiL != null) {
                interfaceC524950KiL.b8(this.LJIILJJIL);
                this.LJIILIIL.kF(this.LJIILJJIL);
                return;
            }
            return;
        }
        View view2 = this.LIZ;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(4, view2);
        }
        InterfaceC524950KiL interfaceC524950KiL2 = this.LJIILIIL;
        if (interfaceC524950KiL2 == null) {
            return;
        }
        interfaceC524950KiL2.b8(this.LJIILJJIL);
    }
}
