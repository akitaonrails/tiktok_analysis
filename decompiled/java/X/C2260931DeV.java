package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Path;
import android.graphics.PointF;
import android.view.View;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemePlayFunModel;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS579S0100000_35;

/* JADX INFO: renamed from: X.1DeV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2260931DeV {
    public final ViewOnTouchListenerC2260921DeU LIZ;
    public AwemePlayFunModel LIZLLL;
    public final View LJ;
    public final View LJFF;
    public final View LJI;
    public DataCenter LJIIIIZZ;
    public long LJIIJ;
    public C988710bpt LJIIJJI;
    public C2260981Dea LIZIZ = new C2260981Dea();
    public String LIZJ = "IdleState";
    public final C01GW LJII = C452501pT.LIZIZ(new AwS579S0100000_35(this, 382));
    public final boolean LJIIIZ = true;
    public String LJIIL = "";
    public final HashMap<String, String> LJIILIIL = C2097608Jq.LJI(new Pair("IdleState", "ExpandState"), new Pair("ExpandState", "EggShowState"), new Pair("EggShowState", "CollapseState"), new Pair("CollapseState", "WidgetShowState"), new Pair("WidgetShowState", "FinishState"));
    public final HashMap<String, AbstractC2260961DeY> LJIILJJIL = C2097608Jq.LJI(new Pair("IdleState", new AbstractC2260961DeY(this) { // from class: X.1DeZ
        @Override // X.AbstractC2260961DeY
        public final void LIZIZ() {
            this.LIZ.getClass();
            this.LIZ.LIZIZ(0);
        }

        {
            super(this);
        }
    }), new Pair("ExpandState", new C2261011Ded(this)), new Pair("EggShowState", new C2261031Def(this)), new Pair("CollapseState", new C2261051Deh(this) { // from class: X.1Dee
        public List<? extends Animator> LIZLLL;

        @Override // X.AbstractC2260961DeY
        public final void LIZIZ() {
            C2260931DeV c2260931DeV = this.LIZ;
            AwemePlayFunModel awemePlayFunModel = c2260931DeV.LIZLLL;
            float f = (awemePlayFunModel != null ? awemePlayFunModel.endDuration : 0.0f) * LSPassThroughRecordSizeConfig.DEFAULT;
            PointF pointFLIZ = c2260931DeV.LIZ();
            C2261041Deg c2261041Deg = new C2261041Deg();
            c2261041Deg.LIZ = f;
            PointF pointF = new PointF(this.LIZ.LJFF.getTranslationX(), this.LIZ.LJFF.getTranslationY());
            c2261041Deg.LIZIZ = pointF.x;
            c2261041Deg.LIZJ = pointF.y;
            PointF pointF2 = new PointF(pointFLIZ.x, pointFLIZ.y);
            c2261041Deg.LJFF = pointF2.x;
            c2261041Deg.LJI = pointF2.y;
            C2261061Dei c2261061DeiLIZ = c2261041Deg.LIZ();
            C2260931DeV c2260931DeV2 = this.LIZ;
            View view = c2260931DeV2.LJFF;
            C2260981Dea c2260981Dea = c2260931DeV2.LIZIZ;
            view.setPivotX(c2260981Dea.LIZ / 2.0f);
            view.setPivotY(c2260981Dea.LIZ / 2.0f);
            Path path = new Path();
            path.moveTo(c2261061DeiLIZ.LIZIZ, c2261061DeiLIZ.LIZJ);
            float f2 = c2261061DeiLIZ.LIZIZ;
            float f3 = c2261061DeiLIZ.LJFF;
            float f4 = 2;
            float f5 = c2261061DeiLIZ.LIZJ;
            float f6 = c2261061DeiLIZ.LJI;
            path.cubicTo((f2 + f3) / f4, f5, f3, (f5 + f6) / f4, f3, f6);
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "translationX", "translationY", path);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, "scaleX", view.getScaleX(), c2260981Dea.LIZLLL);
            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(view, "ScaleY", view.getScaleY(), c2260981Dea.LIZLLL);
            AnimatorSet animatorSet = new AnimatorSet();
            float f7 = c2261061DeiLIZ.LIZ;
            animatorSet.setDuration(f7 > 0.0f ? (long) f7 : 400L);
            animatorSet.setInterpolator(new C21388418n4());
            animatorSet.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2).with(objectAnimatorOfFloat3);
            LJI(animatorSet);
            Animator animator = this.LIZJ;
            if (animator != null) {
                animator.start();
            }
            long j = ((long) f) / ((long) 2);
            ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.LIZ.LJ, "alpha", 1.0f, 0.0f);
            objectAnimatorOfFloat4.setDuration(j);
            objectAnimatorOfFloat4.start();
            ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(this.LIZ.LJI, "alpha", 1.0f, 0.0f);
            objectAnimatorOfFloat5.setDuration(200L);
            objectAnimatorOfFloat5.start();
            this.LIZLLL = C1697810uHb.LJIIJJI(objectAnimatorOfFloat4, objectAnimatorOfFloat5);
            this.LIZ.getClass();
            this.LIZ.getClass();
        }

        @Override // X.AbstractC2260961DeY
        public final void LJ() {
            Animator animator = this.LIZJ;
            if (animator != null) {
                animator.cancel();
            }
            LJI(null);
            LJII(new InterfaceC2261101Dem() { // from class: X.1Dek
                @Override // X.InterfaceC2261101Dem
                public final void LIZ(Animator animator2) {
                    animator2.cancel();
                }
            });
            this.LIZLLL = null;
            this.LIZ.getClass();
        }

        @Override // X.C2261051Deh, X.AbstractC2260961DeY
        public final void LIZLLL() {
            super.LIZLLL();
            LJII(new InterfaceC2261101Dem() { // from class: X.1Dej
                @Override // X.InterfaceC2261101Dem
                public final void LIZ(Animator animator) {
                    animator.pause();
                }
            });
            this.LIZ.getClass();
        }

        @Override // X.C2261051Deh, X.AbstractC2260961DeY
        public final void LJFF() {
            super.LJFF();
            LJII(new InterfaceC2261101Dem() { // from class: X.1Del
                @Override // X.InterfaceC2261101Dem
                public final void LIZ(Animator animator) {
                    animator.resume();
                }
            });
            this.LIZ.getClass();
        }

        {
            super(this);
        }

        public final void LJII(InterfaceC2261101Dem interfaceC2261101Dem) {
            List<? extends Animator> list = this.LIZLLL;
            if (list != null) {
                for (Animator animator : list) {
                    if (animator != null) {
                        interfaceC2261101Dem.LIZ(animator);
                    }
                }
            }
        }
    }), new Pair("WidgetShowState", new C2260951DeX(this)), new Pair("FinishState", new AbstractC2260961DeY(this) { // from class: X.1Deb
        @Override // X.AbstractC2260961DeY
        public final void LIZIZ() {
        }

        {
            super(this);
        }
    }));

    public final PointF LIZ() {
        int height;
        float f = ((1 - this.LIZIZ.LIZLLL) / 2.0f) * r1.LIZ;
        C844470XAv.LIZ.getClass();
        float fLIZJ = C12ES.LIZJ(12.0f, C844470XAv.LIZ()) - f;
        if (C444960Hcc.LIZIZ()) {
            fLIZJ = -fLIZJ;
        }
        View view = (View) this.LJII.getValue();
        if (view != null) {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            height = iArr[1] - this.LIZ.getBottomOffset();
        } else {
            int[] iArr2 = new int[2];
            this.LIZ.getLocationOnScreen(iArr2);
            height = iArr2[1] + this.LIZ.getHeight();
        }
        this.LIZ.getLocationOnScreen(new int[2]);
        return new PointF(fLIZJ, (((height - r0[1]) - this.LIZIZ.LIZ) + f) - C12ES.LIZJ(16.0f, C844470XAv.LIZ()));
    }

    public final void LIZLLL() {
        C786410Ut5.T4(this.LJFF, 0.0f);
        C786410Ut5.T4(this.LJI, 0.0f);
        C786410Ut5.T4(this.LJ, 0.0f);
        Iterator<T> it2 = this.LJIILJJIL.values().iterator();
        while (it2.hasNext()) {
            ((AbstractC2260961DeY) it2.next()).LJ();
        }
        this.LIZJ = "IdleState";
    }

    public C2260931DeV(ViewOnTouchListenerC2260921DeU viewOnTouchListenerC2260921DeU) {
        this.LIZ = viewOnTouchListenerC2260921DeU;
        this.LJ = viewOnTouchListenerC2260921DeU.findViewById(R.id.aa_);
        this.LJFF = viewOnTouchListenerC2260921DeU.findViewById(R.id.aaa);
        this.LJI = viewOnTouchListenerC2260921DeU.findViewById(R.id.aab);
    }

    public final void LIZIZ(int i) {
        if (i != 0) {
            if (i == 1) {
                this.LIZJ = "FinishState";
                return;
            }
            return;
        }
        String str = this.LJIILIIL.get(this.LIZJ);
        if (str == null) {
            return;
        }
        this.LIZJ = str;
        AbstractC2260961DeY abstractC2260961DeY = this.LJIILJJIL.get(str);
        if (abstractC2260961DeY == null) {
            return;
        }
        abstractC2260961DeY.LIZIZ();
    }

    public final void LIZJ(String str) {
        AwemeRawAd awemeRawAd;
        ViewOnTouchListenerC2260921DeU viewOnTouchListenerC2260921DeU = this.LIZ;
        viewOnTouchListenerC2260921DeU.getClass();
        C988530bpb c988530bpb = C988530bpb.LIZ;
        Aweme aweme = viewOnTouchListenerC2260921DeU.LLIZ;
        if (aweme != null) {
            awemeRawAd = aweme.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        c988530bpb.getClass();
        C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "othershow", awemeRawAd);
        c1022820ciuLIZLLL.LIZJ(str, "refer");
        c1022820ciuLIZLLL.LJII();
    }
}
