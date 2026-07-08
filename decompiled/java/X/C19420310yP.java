package X;

import Y.ATListenerS461S0100000_29;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AwS573S0100000_29;

/* JADX INFO: renamed from: X.10yP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19420310yP implements InterfaceC19369110q9 {
    public final Context LIZ;
    public final ViewGroup LIZIZ;
    public final boolean LIZJ;
    public final ViewGroup LIZLLL;
    public final ViewGroup LJ;
    public final C19420010yM LJFF;
    public final C1214960hio LJI;
    public final C19420210yO LJII;
    public boolean LJIIIIZZ = true;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public boolean LJIIJJI;

    @Override // X.InterfaceC19369110q9
    public final void LIZ() {
    }

    @Override // X.InterfaceC19369110q9
    public final void LIZIZ() {
        if (this.LJIIIZ || this.LJIIJ) {
            return;
        }
        this.LIZLLL.clearAnimation();
        this.LJFF.LIZ(AFwS218S0000000_29.get$arr$(403));
        this.LJIIJ = true;
        if (C19420110yN.LIZJ()) {
            return;
        }
        this.LJI.LIZIZ(new AwS573S0100000_29(this, 978));
    }

    public final void LIZLLL() {
        if (!this.LJIIIZ || this.LJIIJJI) {
            return;
        }
        this.LIZLLL.clearAnimation();
        this.LJIIJJI = true;
        final C19420210yO c19420210yO = this.LJII;
        final AwS573S0100000_29 awS573S0100000_29 = new AwS573S0100000_29(this, 976);
        if (c19420210yO.LIZJ.getAnimation() != null) {
            c19420210yO.LIZJ.clearAnimation();
        }
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(c19420210yO.LIZ, R.anim.bv);
        animationLoadAnimation.setInterpolator(C1619980sG4.LJI());
        animationLoadAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: X.10yQ
            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationStart(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationEnd(Animation animation) {
                C786410Ut5.LJLLLLLL(8, c19420210yO.LIZJ);
                awS573S0100000_29.invoke();
            }
        });
        c19420210yO.LIZJ.startAnimation(animationLoadAnimation);
    }

    @Override // X.InterfaceC19369110q9
    public final void start() {
        if (!C19420110yN.LIZIZ() || this.LJIIIZ) {
            return;
        }
        View viewFindViewById = this.LIZLLL.findViewById(R.id.vzd);
        if (viewFindViewById != null) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById);
        }
        this.LJFF.LIZIZ(AFwS218S0000000_29.get$arr$(402));
    }

    @Override // X.InterfaceC19369110q9
    public final void stop() {
        if (!C19420110yN.LIZIZ() || this.LJIIIZ) {
            return;
        }
        this.LJFF.LIZ(AFwS218S0000000_29.get$arr$(403));
    }

    @Override // X.InterfaceC19369110q9
    public final void LIZJ() {
        LIZLLL();
    }

    @Override // X.InterfaceC19369110q9
    public final void onPageSelected() {
        LIZLLL();
    }

    public C19420310yP(Context context, ViewGroup viewGroup, boolean z) {
        this.LIZ = context;
        this.LIZIZ = viewGroup;
        this.LIZJ = z;
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.vz7);
        this.LIZLLL = viewGroup2;
        if (z) {
            this.LJ = (ViewGroup) viewGroup.findViewById(R.id.hrc);
        }
        this.LJFF = new C19420010yM(viewGroup2);
        this.LJI = new C1214960hio(context, viewGroup2);
        this.LJII = new C19420210yO(context, viewGroup2);
        viewGroup2.setOnTouchListener(new ATListenerS461S0100000_29(this, 20));
    }
}
