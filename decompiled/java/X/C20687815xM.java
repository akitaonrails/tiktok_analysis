package X;

import android.content.Context;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS221S0000000_31;

/* JADX INFO: renamed from: X.15xM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20687815xM implements InterfaceC19369110q9 {
    public final ViewGroup LIZ;
    public final ViewGroup LIZIZ;
    public final C20687915xN LIZJ;
    public boolean LIZLLL;
    public boolean LJ = true;

    @Override // X.InterfaceC19369110q9
    public final void LIZ() {
        C786410Ut5.LJLZ(8, this.LIZIZ);
        this.LJ = false;
    }

    @Override // X.InterfaceC19369110q9
    public final void LIZIZ() {
        if (this.LJ && this.LIZLLL) {
            this.LIZJ.LIZIZ(AFwS221S0000000_31.get$arr$(130));
            ViewGroup viewGroup = this.LIZIZ;
            TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 1.0f);
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration(200L);
            AnimationSet animationSet = new AnimationSet(true);
            animationSet.addAnimation(translateAnimation);
            animationSet.setDuration(300L);
            animationSet.addAnimation(alphaAnimation);
            animationSet.setFillAfter(false);
            viewGroup.startAnimation(animationSet);
            C786410Ut5.LJLZ(8, this.LIZIZ);
            this.LIZLLL = false;
        }
    }

    public final void LIZLLL() {
        if (this.LJ && !this.LIZLLL) {
            C786410Ut5.LJLZ(0, this.LIZIZ);
            ViewGroup viewGroup = this.LIZIZ;
            TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
            AlphaAnimation alphaAnimation = new AlphaAnimation(-0.5f, 1.0f);
            AnimationSet animationSet = new AnimationSet(true);
            animationSet.addAnimation(translateAnimation);
            animationSet.setDuration(300L);
            animationSet.addAnimation(alphaAnimation);
            animationSet.setFillAfter(false);
            viewGroup.startAnimation(animationSet);
            this.LIZLLL = true;
            this.LIZJ.LIZ(AFwS221S0000000_31.get$arr$(129));
        }
    }

    @Override // X.InterfaceC19369110q9
    public final void start() {
        this.LIZJ.LIZ(AFwS221S0000000_31.get$arr$(129));
    }

    @Override // X.InterfaceC19369110q9
    public final void stop() {
        this.LIZJ.LIZIZ(AFwS221S0000000_31.get$arr$(130));
    }

    @Override // X.InterfaceC19369110q9
    public final void LIZJ() {
        LIZLLL();
    }

    @Override // X.InterfaceC19369110q9
    public final void onPageSelected() {
        LIZLLL();
    }

    public C20687815xM(Context context, ViewGroup viewGroup) {
        this.LIZ = viewGroup;
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.vz7);
        this.LIZIZ = viewGroup2;
        this.LIZJ = new C20687915xN(context, viewGroup2);
        this.LIZLLL = true;
    }
}
