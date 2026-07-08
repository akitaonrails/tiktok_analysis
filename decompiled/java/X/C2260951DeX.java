package X;

import android.animation.Animator;
import android.graphics.Point;
import android.graphics.PointF;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1DeX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2260951DeX extends AbstractC2260961DeY {
    public Animator LIZJ;
    public Animator LIZLLL;

    @Override // X.AbstractC2260961DeY
    public final void LIZIZ() {
        this.LIZ.LIZJ("badge");
        C786410Ut5.LJLLLLLL(8, this.LIZ.LJI);
        this.LIZ.getClass();
        PointF pointFLIZ = this.LIZ.LIZ();
        float translationY = this.LIZ.LJFF.getTranslationY();
        float f = pointFLIZ.y;
        if (translationY != f) {
            Animator animatorLIZ = C20516515Pv.LIZ(this.LIZ.LJFF, f);
            this.LIZLLL = animatorLIZ;
            animatorLIZ.start();
        }
        C2260931DeV c2260931DeV = this.LIZ;
        Point point = new Point((int) this.LIZ.LJFF.getTranslationX(), (int) this.LIZ.LJFF.getTranslationY());
        ViewOnTouchListenerC2260921DeU viewOnTouchListenerC2260921DeU = c2260931DeV.LIZ;
        viewOnTouchListenerC2260921DeU.getClass();
        C1017580caS.LIZIZ(viewOnTouchListenerC2260921DeU.LLIZ, true, "become_widget", point, null);
        DataCenter dataCenter = this.LIZ.LJIIIIZZ;
        if (dataCenter != null) {
            dataCenter.zQ2(null, "ON_AD_PLAY_FUN_STATE_WIDGET_SHOW");
        }
    }

    @Override // X.AbstractC2260961DeY
    public final boolean LIZJ() {
        return !Intrinsics.LJFF(this.LIZ.LJIIL, "popupmask");
    }

    @Override // X.AbstractC2260961DeY
    public final void LJ() {
        super.LJ();
        Animator animator = this.LIZJ;
        if (animator != null) {
            animator.cancel();
        }
        this.LIZJ = null;
        Animator animator2 = this.LIZLLL;
        if (animator2 != null) {
            animator2.cancel();
        }
        this.LIZLLL = null;
    }

    public C2260951DeX(C2260931DeV c2260931DeV) {
        super(c2260931DeV);
    }
}
