package X;

import Y.ACListenerS150S0100000_15;
import Y.ARunnableS115S0100000_15;
import Y.ARunnableS21S0201000_15;
import Y.ARunnableS84S0200000_15;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bjn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C984930bjn extends FrameLayout {
    public static final /* synthetic */ int LLJJIJI = 0;
    public Function0<Unit> LL;
    public Function0<Unit> LLILLJJLI;
    public Function1<? super int[], Unit> LLILLL;
    public Boolean LLILZ;
    public AnimatorSet LLILZIL;
    public final C984950bjp LLILZLL;
    public final ConstraintLayout LLIZ;
    public final View LLIZLLLIL;
    public final LinearLayout LLJ;
    public final ConstraintLayout LLJI;
    public final FrameLayout LLJIJIL;
    public final C16F5 LLJILJIL;
    public ARunnableS84S0200000_15 LLJILJILJ;
    public ARunnableS115S0100000_15 LLJILLL;
    public final C984950bjp LLJJ;
    public final C984950bjp LLJJI;
    public final List<C984950bjp> LLJJIII;

    public final void setIsMulti(boolean z) {
    }

    public final void LIZ() {
        AnimatorSet animatorSet = this.LLILZIL;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = this.LLILZIL;
        if (animatorSet2 != null) {
            animatorSet2.removeAllListeners();
        }
        this.LLILZIL = null;
        HandlerHook.viewRemoveCallbacks(this, null);
        HandlerHook.viewRemoveCallbacks(this, this.LLJILJILJ);
        this.LLJILJILJ = null;
        HandlerHook.viewRemoveCallbacks(this, null);
        HandlerHook.viewRemoveCallbacks(this, this.LLJILLL);
        this.LLJILLL = null;
    }

    public final void LIZIZ() {
        C984950bjp c984950bjp;
        C1324720kZq c1324720kZq;
        if (C500260Jjc.LJJIJIIJIL(this.LLILZ) || !Intrinsics.LJFF(this.LLILZ, Boolean.TRUE) || (c984950bjp = this.LLILZLL) == null || (c1324720kZq = (C1324720kZq) c984950bjp.findViewById(R.id.oyt)) == null) {
            return;
        }
        C786410Ut5.LLJJIII(c1324720kZq, 0);
        C786410Ut5.h5(c1324720kZq, 1.0f);
    }

    public final int getMvpWidth() {
        Integer numValueOf;
        LinearLayout linearLayout = this.LLJ;
        return ((linearLayout == null || (numValueOf = Integer.valueOf(linearLayout.getMeasuredWidth())) == null) ? 0 : numValueOf.intValue()) - ((int) C497740JfY.LIZIZ(8.0f));
    }

    public final List<C984950bjp> getSeatList() {
        return this.LLJJIII;
    }

    public final void LIZJ(C985000bju c985000bju) {
        this.LLILZ = null;
        for (C984950bjp c984950bjp : this.LLJJIII) {
            if (c984950bjp != null) {
                c984950bjp.LL = true;
                c984950bjp.LLILZIL = true;
                C1324720kZq c1324720kZq = c984950bjp.LLILLJJLI;
                if (c1324720kZq != null) {
                    c1324720kZq.setImageResource(c984950bjp.LIZ(c985000bju));
                }
                C1324720kZq c1324720kZq2 = c984950bjp.LLILLJJLI;
                if (c1324720kZq2 != null) {
                    C786410Ut5.LLJJIII(c1324720kZq2, 0);
                }
                C1324720kZq c1324720kZq3 = c984950bjp.LLILLL;
                if (c1324720kZq3 != null) {
                    C786410Ut5.LLJJIII(c1324720kZq3, 8);
                }
                C0GRL c0grl = c984950bjp.LLILZ;
                if (c0grl != null) {
                    int visibility = c0grl.getVisibility();
                    c0grl.setVisibility(8);
                    C1602160rnK.LIZIZ(visibility, 8, c0grl);
                }
                C1324720kZq c1324720kZq4 = c984950bjp.LLIZ;
                if (c1324720kZq4 != null) {
                    C786410Ut5.LLJJIII(c1324720kZq4, 0);
                }
                C1324720kZq c1324720kZq5 = c984950bjp.LLIZ;
                if (c1324720kZq5 != null) {
                    C786410Ut5.h5(c1324720kZq5, 0.0f);
                }
                c984950bjp.LLILZLL = null;
            }
        }
        C984950bjp c984950bjp2 = this.LLJJ;
        if (c984950bjp2 != null) {
            int visibility2 = c984950bjp2.getVisibility();
            c984950bjp2.setVisibility(8);
            C1602160rnK.LIZIZ(visibility2, 8, c984950bjp2);
        }
        C984950bjp c984950bjp3 = this.LLJJI;
        if (c984950bjp3 != null) {
            int visibility3 = c984950bjp3.getVisibility();
            c984950bjp3.setVisibility(8);
            C1602160rnK.LIZIZ(visibility3, 8, c984950bjp3);
        }
    }

    public final void setContainerClickCallback(Function0<Unit> function0) {
        this.LL = function0;
    }

    public final void setMVPAnimationStartCallback(Function1<? super int[], Unit> function1) {
        this.LLILLL = function1;
    }

    public final void setRematchEventCallback(Function0<Unit> function0) {
        this.LLILLJJLI = function0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C984930bjn(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLJJIII = new ArrayList();
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.h5_, this, true);
        C1091250eVH c1091250eVH = (C1091250eVH) findViewById(R.id.i8a);
        c1091250eVH.setEnableSizeChange(true);
        c1091250eVH.setEnableFixedSize(true);
        this.LLIZ = (ConstraintLayout) findViewById(R.id.oyu);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.mbs);
        this.LLJ = linearLayout;
        if (linearLayout != null) {
            C786410Ut5.R7(linearLayout, new ACListenerS150S0100000_15(this, 40));
        }
        C984950bjp c984950bjp = (C984950bjp) findViewById(R.id.mkw);
        this.LLILZLL = c984950bjp;
        this.LLJJIII = C1697810uHb.LJIILJJIL(c984950bjp, findViewById(R.id.mkx), findViewById(R.id.mky));
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.oyw);
        this.LLJI = constraintLayout;
        if (constraintLayout != null) {
            C786410Ut5.Y7(constraintLayout, new ACListenerS150S0100000_15(this, 41));
        }
        findViewById(R.id.lj7);
        findViewById(R.id.u31);
        findViewById(R.id.nfl);
        this.LLJILJIL = (C16F5) findViewById(R.id.zyh);
        this.LLJIJIL = (FrameLayout) findViewById(R.id.oys);
        findViewById(R.id.oyx);
        findViewById(R.id.user_guide_stroke);
        findViewById(R.id.nkk);
        this.LLJJ = (C984950bjp) findViewById(R.id.blc);
        this.LLJJI = (C984950bjp) findViewById(R.id.bld);
        this.LLIZLLLIL = findViewById(R.id.er_);
        findViewById(R.id.l8w);
        findViewById(R.id.l8y);
        findViewById(R.id.l90);
        findViewById(R.id.l8v);
        findViewById(R.id.l8x);
        findViewById(R.id.l8z);
    }

    public final void LJ(List<C01BH> list, C985000bju c985000bju) {
        List listLL;
        ArrayList arrayList = new ArrayList();
        if (list != null && (listLL = C13LP.LL(list, 3)) != null) {
            arrayList.addAll(listLL);
        }
        if (arrayList.size() < 3) {
            int size = 3 - arrayList.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(C984950bjp.LLIZLLLIL);
            }
        }
        int i2 = 0;
        for (Object obj : arrayList) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                C01BH c01bh = (C01BH) obj;
                C984950bjp c984950bjp = (C984950bjp) C13LP.LJJJLZIJ(i2, this.LLJJIII);
                if (c984950bjp != null) {
                    if (c01bh == C984950bjp.LLIZLLLIL) {
                        c984950bjp.LL = true;
                        C1324720kZq c1324720kZq = c984950bjp.LLILLJJLI;
                        if (c1324720kZq != null) {
                            C786410Ut5.LLJJIII(c1324720kZq, 0);
                        }
                        c984950bjp.LLILZLL = null;
                        C1324720kZq c1324720kZq2 = c984950bjp.LLILLJJLI;
                        if (c1324720kZq2 != null) {
                            c1324720kZq2.setImageResource(c984950bjp.LIZ(c985000bju));
                        }
                        C0GRL c0grl = c984950bjp.LLILZ;
                        if (c0grl != null) {
                            int visibility = c0grl.getVisibility();
                            c0grl.setVisibility(8);
                            C1602160rnK.LIZIZ(visibility, 8, c0grl);
                        }
                        C1324720kZq c1324720kZq3 = c984950bjp.LLILLL;
                        if (c1324720kZq3 != null) {
                            C786410Ut5.LLJJIII(c1324720kZq3, 8);
                        }
                        C1324720kZq c1324720kZq4 = c984950bjp.LLIZ;
                        if (c1324720kZq4 != null) {
                            C786410Ut5.h5(c1324720kZq4, 0.0f);
                        }
                    } else if (c01bh == C984950bjp.LLJ) {
                        c984950bjp.LL = true;
                        C1324720kZq c1324720kZq5 = c984950bjp.LLILLJJLI;
                        if (c1324720kZq5 != null) {
                            C786410Ut5.LLJJIII(c1324720kZq5, 0);
                        }
                        c984950bjp.LLILZLL = null;
                        C1324720kZq c1324720kZq6 = c984950bjp.LLILLJJLI;
                        if (c1324720kZq6 != null) {
                            c1324720kZq6.setImageResource(c984950bjp.LIZ(c985000bju));
                        }
                        C0GRL c0grl2 = c984950bjp.LLILZ;
                        if (c0grl2 != null) {
                            int visibility2 = c0grl2.getVisibility();
                            c0grl2.setVisibility(8);
                            C1602160rnK.LIZIZ(visibility2, 8, c0grl2);
                        }
                        C1324720kZq c1324720kZq7 = c984950bjp.LLILLL;
                        if (c1324720kZq7 != null) {
                            C786410Ut5.LLJJIII(c1324720kZq7, 8);
                        }
                        C1324720kZq c1324720kZq8 = c984950bjp.LLIZ;
                        if (c1324720kZq8 != null) {
                            C786410Ut5.h5(c1324720kZq8, 0.0f);
                        }
                    } else {
                        C01BH c01bh2 = c984950bjp.LLILZLL;
                        if (c01bh2 == null) {
                            c984950bjp.LLILZLL = c01bh;
                        } else if (c01bh2.LIZ != c01bh.LIZ || !Intrinsics.LJFF(c01bh2.LIZJ, c01bh.LIZJ)) {
                        }
                        c984950bjp.LLILZLL = c01bh;
                        c984950bjp.LL = false;
                        C1324720kZq c1324720kZq9 = c984950bjp.LLILLJJLI;
                        if (c1324720kZq9 != null) {
                            C1324610kZf c1324610kZfLJIIIZ = C1819620xS4.LIZ().LJIIIZ(c01bh.LIZJ);
                            c1324610kZfLJIIIZ.LJIIIZ = R.drawable.el_;
                            int width = c1324720kZq9.getWidth();
                            int height = c1324720kZq9.getHeight();
                            c1324610kZfLJIIIZ.LJ = width;
                            c1324610kZfLJIIIZ.LJFF = height;
                            c1324610kZfLJIIIZ.LJIILIIL = Boolean.TRUE;
                            c1324610kZfLJIIIZ.LJJI(c1324720kZq9);
                        }
                        C1324720kZq c1324720kZq10 = c984950bjp.LLILLJJLI;
                        if (c1324720kZq10 != null) {
                            HandlerHook.viewPost(c1324720kZq10, new ARunnableS21S0201000_15(i3, c984950bjp, c985000bju, 3));
                        }
                    }
                }
                i2 = i3;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }

    public static final AnimatorSet LIZLLL(float f, float f2, C984950bjp c984950bjp, C984950bjp c984950bjp2, float f3, float f4) {
        c984950bjp2.setPivotX(f);
        c984950bjp2.setPivotY(f2);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(c984950bjp, (Property<C984950bjp, Float>) View.SCALE_X, f3, f4);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(c984950bjp, (Property<C984950bjp, Float>) View.SCALE_Y, f3, f4);
        objectAnimatorOfFloat.setDuration(500L);
        objectAnimatorOfFloat2.setDuration(500L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        return animatorSet;
    }
}
