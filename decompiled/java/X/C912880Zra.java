package X;

import Y.AAListenerS264S0200000_12;
import Y.AAListenerS266S0200000_14;
import Y.AAListenerS323S0100000_12;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.AwS415S0200000_14;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: renamed from: X.0Zra, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C912880Zra extends AbstractC912890Zrb {
    public final C01GW LJ = C1509305vX.LIZ(AFwS201S0000000_14.get$arr$(596));
    public final C01GW LJFF = C1509305vX.LIZ(AFwS201S0000000_14.get$arr$(597));
    public final C01GW LJI = C1509305vX.LIZ(AFwS201S0000000_14.get$arr$(595));
    public final C01GW LJII = C1509305vX.LIZ(AFwS201S0000000_14.get$arr$(594));
    public final int LJIIIIZZ = R.layout.dmf;
    public final C01GW LJIIIZ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1681));
    public final C01GW LJIIJ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1680));
    public final C01GW LJIIJJI = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1679));

    public final FrameLayout LJIIIZ() {
        return (FrameLayout) this.LJIIJ.getValue();
    }

    public final Context LJIIJ() {
        return LJI().getContext();
    }

    @Override // X.C18YF
    public final int LIZLLL() {
        return this.LJIIIIZZ;
    }

    @Override // X.C18YF
    public final void LJ(C18YL c18yl) {
        int iIntValue;
        ((RecyclerView) this.LJIIIZ.getValue()).setAdapter((AbstractC21673619ry) this.LJIIJJI.getValue());
        ((RecyclerView) this.LJIIIZ.getValue()).setLayoutManager(new LinearLayoutManager(LJIIJ()));
        ((View) this.LJIIIZ.getValue()).setOverScrollMode(2);
        FrameLayout frameLayoutLJIIIZ = LJIIIZ();
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        float fLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        float[] fArr = new float[8];
        int i = 0;
        do {
            fArr[i] = fLIZIZ;
            i++;
        } while (i < 8);
        LayerDrawable layerDrawableLJIILIIL = null;
        shapeDrawable.setShape(new RoundRectShape(fArr, null, null));
        Paint paint = shapeDrawable.getPaint();
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.c3, LJIIJ());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = -1;
        }
        paint.setColor(iIntValue);
        frameLayoutLJIIIZ.setBackground(shapeDrawable);
        if (c18yl.LIZIZ == EnumC912790ZrR.MIDDLE) {
            FrameLayout frameLayoutLJIIIZ2 = LJIIIZ();
            Drawable background = LJIIIZ().getBackground();
            if (background != null) {
                C19659111vp c19659111vp = new C19659111vp();
                c19659111vp.LIZ = C418440Gaw.LIZIZ(12);
                c19659111vp.LJFF = Integer.valueOf(ColorProtector.parseColor("#1a000000"));
                c19659111vp.LIZLLL = C418440Gaw.LIZIZ(26);
                c19659111vp.LIZJ = C418440Gaw.LIZIZ(5);
                layerDrawableLJIILIIL = C426750GoL.LJIILIIL(background, c19659111vp.LIZ(LJIIIZ().getContext()));
            }
            frameLayoutLJIIIZ2.setBackground(layerDrawableLJIILIIL);
        }
    }

    @Override // X.C18YF
    public final void LJFF(C18YK c18yk) {
        ((C1578970rBv) this.LJIIJJI.getValue()).LLLFZ(((C912900Zrc) c18yk).LIZ);
    }

    @Override // X.C18YF
    public final Animator LIZ(View view, C18YK c18yk, C18YL c18yl) {
        AwS415S0200000_14 awS415S0200000_14 = new AwS415S0200000_14(view, c18yl, 131);
        AnimatorSet animatorSet = new AnimatorSet();
        if (view.getVisibility() == 0) {
            animatorSet.playTogether(ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f), ObjectAnimator.ofFloat(view, "scaleX", 1.0f, 0.8f), ObjectAnimator.ofFloat(view, "scaleY", 1.0f, 0.8f));
            animatorSet.addListener(new AAListenerS266S0200000_14(view, awS415S0200000_14, 7));
            animatorSet.setInterpolator(C1619980sG4.LJIILIIL());
            return animatorSet;
        }
        awS415S0200000_14.invoke();
        return animatorSet;
    }

    @Override // X.C18YF
    public final Animator LIZIZ(View view, C18YK c18yk, C18YL c18yl) {
        AwS415S0200000_14 awS415S0200000_14 = new AwS415S0200000_14(view, c18yl, 132);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f), ObjectAnimator.ofFloat(view, "scaleX", 0.8f, 1.0f), ObjectAnimator.ofFloat(view, "scaleY", 0.8f, 1.0f));
        animatorSet.addListener(new AAListenerS264S0200000_12(view, awS415S0200000_14, 1));
        animatorSet.addListener(new AAListenerS323S0100000_12(view, 28));
        animatorSet.setInterpolator(C1619980sG4.LJIILIIL());
        return animatorSet;
    }

    @Override // X.C18YF
    public final void LIZJ(EnumC912790ZrR enumC912790ZrR, boolean z, Integer num) {
        FrameLayout.LayoutParams layoutParams;
        int i;
        ViewGroup.LayoutParams layoutParams2 = LJIIIZ().getLayoutParams();
        if ((layoutParams2 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams2) != null) {
            int[] iArr = C912870ZrZ.LIZ;
            int i2 = iArr[enumC912790ZrR.ordinal()];
            if (i2 != 1 && i2 != 2) {
                if (i2 == 3) {
                    i = 8388613;
                } else {
                    throw new C1954807lC();
                }
            } else {
                i = 8388611;
            }
            layoutParams.gravity = i;
            int i3 = iArr[enumC912790ZrR.ordinal()];
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 == 3) {
                        C426750GoL.LJIIJ(layoutParams, LJIIJ(), Integer.valueOf(((Number) this.LJI.getValue()).intValue()), null, Integer.valueOf(((Number) this.LJFF.getValue()).intValue()), null, 52);
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    C426750GoL.LJIIJ(layoutParams, LJIIJ(), 0, null, 0, Integer.valueOf(((Number) this.LJII.getValue()).intValue()), 36);
                }
            } else {
                C426750GoL.LJIIJ(layoutParams, LJIIJ(), Integer.valueOf(((Number) this.LJ.getValue()).intValue()), null, Integer.valueOf(((Number) this.LJI.getValue()).intValue()), null, 52);
            }
            if (z && num != null) {
                LJIIIZ().setMinimumWidth(num.intValue());
            }
            C786410Ut5.a6(LJIIIZ(), layoutParams);
        }
    }
}
