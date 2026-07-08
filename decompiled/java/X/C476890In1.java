package X;

import android.animation.ValueAnimator;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.ss.android.ugc.aweme.live.root.tab.room.skylight.SkylightController;

/* JADX INFO: renamed from: X.0In1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C476890In1 implements InterfaceC477240Ina {
    public final /* synthetic */ EnterRoomConfig LIZ;
    public final /* synthetic */ SkylightController LIZIZ;

    public final EnterRoomConfig LIZ() {
        EnterRoomConfig enterRoomConfigEq = null;
        if (this.LIZIZ.LIZ() == null) {
            return null;
        }
        InterfaceC466370IQp currentFragment = this.LIZIZ.LIZ().getCurrentFragment();
        return (currentFragment == null || (enterRoomConfigEq = currentFragment.Eq()) == null) ? (this.LIZIZ.LIZ() == null || this.LIZIZ.LIZ().getCurrentPosition() != 0) ? enterRoomConfigEq : this.LIZ : enterRoomConfigEq;
    }

    public final void LIZIZ(float f) {
        C475460Iki c475460IkiC1;
        C1324720kZq c1324720kZq;
        if (this.LIZIZ.LLJJ.c1() != null && (c1324720kZq = (c475460IkiC1 = this.LIZIZ.LLJJ.c1()).LJ) != null && c1324720kZq.getVisibility() == 0) {
            ValueAnimator valueAnimator = c475460IkiC1.LJIIL;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            C1324720kZq c1324720kZq2 = c475460IkiC1.LJ;
            if (c1324720kZq2 != null) {
                C786410Ut5.md(c1324720kZq2, f);
            }
            C1295960jpS c1295960jpS = c475460IkiC1.LJIIJJI;
            if (c1295960jpS != null) {
                C786410Ut5.ld(c1295960jpS, f);
            }
            C16FZ c16fz = c475460IkiC1.LJIIJ;
            if (c16fz != null) {
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c16fz);
                c16fz.setTranslationY(f);
            }
        }
    }

    public C476890In1(SkylightController skylightController, EnterRoomConfig enterRoomConfig) {
        this.LIZIZ = skylightController;
        this.LIZ = enterRoomConfig;
    }
}
