package X;

import Y.ACListenerS150S0100000_15;
import Y.ARunnableS26S0101000_15;
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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bjo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C984940bjo extends FrameLayout {
    public Function1<? super Boolean, Unit> LL;
    public Function1<? super ArrayList<Float>, Unit> LLILLJJLI;
    public Boolean LLILLL;
    public AnimatorSet LLILZ;
    public final C984960bjq LLILZIL;
    public final C984960bjq LLILZLL;
    public final ConstraintLayout LLIZ;
    public final View LLIZLLLIL;
    public final ConstraintLayout LLJ;
    public final FrameLayout LLJI;
    public final C16F5 LLJIJIL;
    public ARunnableS84S0200000_15 LLJILJIL;
    public final List<C984960bjq> LLJILJILJ;
    public final List<C984960bjq> LLJILLL;

    public final void LIZJ() {
        this.LLILLL = null;
        for (C984960bjq c984960bjq : this.LLJILJILJ) {
            if (c984960bjq != null) {
                c984960bjq.setDefaultSeat(true);
            }
        }
        for (C984960bjq c984960bjq2 : this.LLJILLL) {
            if (c984960bjq2 != null) {
                c984960bjq2.setDefaultSeat(false);
            }
        }
    }

    public final void setIsMulti(boolean z) {
    }

    public final void LIZ() {
        AnimatorSet animatorSet = this.LLILZ;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = this.LLILZ;
        if (animatorSet2 != null) {
            animatorSet2.removeAllListeners();
        }
        this.LLILZ = null;
        HandlerHook.viewRemoveCallbacks(this, null);
        HandlerHook.viewRemoveCallbacks(this, this.LLJILJIL);
        this.LLJILJIL = null;
        HandlerHook.viewRemoveCallbacks(this, null);
    }

    public final void LIZIZ() {
        C1324720kZq c1324720kZq;
        C984960bjq c984960bjq = Intrinsics.LJFF(this.LLILLL, Boolean.TRUE) ? this.LLILZIL : this.LLILZLL;
        if (c984960bjq == null || (c1324720kZq = (C1324720kZq) c984960bjq.findViewById(R.id.oyt)) == null) {
            return;
        }
        C786410Ut5.LLJJIII(c1324720kZq, 0);
        C786410Ut5.h5(c1324720kZq, 1.0f);
    }

    public final void setContainerClickCallback(Function1<? super Boolean, Unit> function1) {
        this.LL = function1;
    }

    public final void setMVPAnimationStartCallback(Function1<? super ArrayList<Float>, Unit> function1) {
        this.LLILLJJLI = function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C984940bjo(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLJILJILJ = new ArrayList();
        this.LLJILLL = new ArrayList();
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.gya, this, true);
        C1091250eVH c1091250eVH = (C1091250eVH) findViewById(R.id.i8a);
        c1091250eVH.setEnableSizeChange(true);
        c1091250eVH.setEnableFixedSize(true);
        this.LLIZ = (ConstraintLayout) findViewById(R.id.oyu);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.mbs);
        if (linearLayout != null) {
            C786410Ut5.R7(linearLayout, new ACListenerS150S0100000_15(this, 16));
        }
        C984960bjq c984960bjq = (C984960bjq) findViewById(R.id.mkw);
        this.LLILZIL = c984960bjq;
        this.LLJILJILJ = C1697810uHb.LJIILJJIL(c984960bjq, findViewById(R.id.mkx), findViewById(R.id.mky));
        LinearLayout linearLayout2 = (LinearLayout) findViewById(R.id.mei);
        if (linearLayout2 != null) {
            C786410Ut5.R7(linearLayout2, new ACListenerS150S0100000_15(this, 17));
        }
        C984960bjq c984960bjq2 = (C984960bjq) findViewById(R.id.tm7);
        this.LLILZLL = c984960bjq2;
        this.LLJILLL = C1697810uHb.LJIILJJIL(c984960bjq2, findViewById(R.id.tm8), findViewById(R.id.tm9));
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.oyw);
        this.LLJ = constraintLayout;
        if (constraintLayout != null) {
            C786410Ut5.Y7(constraintLayout, new ACListenerS150S0100000_15(this, 18));
        }
        findViewById(R.id.lj7);
        findViewById(R.id.u31);
        findViewById(R.id.nfl);
        this.LLJIJIL = (C16F5) findViewById(R.id.zyh);
        this.LLJI = (FrameLayout) findViewById(R.id.oys);
        findViewById(R.id.oyx);
        findViewById(R.id.user_guide_stroke);
        findViewById(R.id.nkk);
        this.LLIZLLLIL = findViewById(R.id.er_);
        findViewById(R.id.l8w);
        findViewById(R.id.l8y);
        findViewById(R.id.l90);
        findViewById(R.id.l8v);
        findViewById(R.id.l8x);
        findViewById(R.id.l8z);
    }

    public final void LJ(List list, boolean z) {
        List<C984960bjq> list2;
        int i;
        C01BH c01bh;
        List listLL;
        ArrayList arrayList = new ArrayList();
        if (list != null && (listLL = C13LP.LL(list, 3)) != null) {
            arrayList.addAll(listLL);
        }
        if (arrayList.size() < 3) {
            int size = 3 - arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (z) {
                    c01bh = C984960bjq.LLIZLLLIL;
                } else {
                    c01bh = C984960bjq.LLJ;
                }
                arrayList.add(c01bh);
            }
        }
        if (z) {
            list2 = this.LLJILJILJ;
        } else {
            list2 = this.LLJILLL;
        }
        int i3 = 0;
        for (Object obj : arrayList) {
            int i4 = i3 + 1;
            if (i3 >= 0) {
                C01BH c01bh2 = (C01BH) obj;
                C984960bjq c984960bjq = (C984960bjq) C13LP.LJJJLZIJ(i3, list2);
                if (c984960bjq != null) {
                    if (c984960bjq.LLILZIL) {
                        if (i4 != 1) {
                            if (i4 != 2) {
                                i = R.drawable.ey6;
                            } else {
                                i = R.drawable.ey7;
                            }
                        } else {
                            i = R.drawable.ey5;
                        }
                    } else if (i4 != 1) {
                        if (i4 != 2) {
                            i = R.drawable.eth;
                        } else {
                            i = R.drawable.eti;
                        }
                    } else {
                        i = R.drawable.etg;
                    }
                    C01BH c01bh3 = C984960bjq.LLIZLLLIL;
                    int i5 = R.drawable.fa_;
                    if (c01bh2 == c01bh3) {
                        c984960bjq.LL = true;
                        C1324720kZq c1324720kZq = c984960bjq.LLILLJJLI;
                        if (c1324720kZq != null) {
                            C786410Ut5.LLJJIII(c1324720kZq, 0);
                        }
                        c984960bjq.LLILZLL = null;
                        C1324720kZq c1324720kZq2 = c984960bjq.LLILLJJLI;
                        if (c1324720kZq2 != null) {
                            if (!c984960bjq.LLILZIL) {
                                i5 = R.drawable.fa9;
                            }
                            c1324720kZq2.setImageResource(i5);
                        }
                        C0GRS c0grs = c984960bjq.LLILZ;
                        if (c0grs != null) {
                            int visibility = c0grs.getVisibility();
                            c0grs.setVisibility(8);
                            C1602160rnK.LIZIZ(visibility, 8, c0grs);
                        }
                        C1324720kZq c1324720kZq3 = c984960bjq.LLILLL;
                        if (c1324720kZq3 != null) {
                            C786410Ut5.LLJJIII(c1324720kZq3, 8);
                        }
                        C1324720kZq c1324720kZq4 = c984960bjq.LLIZ;
                        if (c1324720kZq4 != null) {
                            C786410Ut5.h5(c1324720kZq4, 0.0f);
                        }
                    } else if (c01bh2 == C984960bjq.LLJ) {
                        c984960bjq.LL = true;
                        C1324720kZq c1324720kZq5 = c984960bjq.LLILLJJLI;
                        if (c1324720kZq5 != null) {
                            C786410Ut5.LLJJIII(c1324720kZq5, 0);
                        }
                        c984960bjq.LLILZLL = null;
                        C1324720kZq c1324720kZq6 = c984960bjq.LLILLJJLI;
                        if (c1324720kZq6 != null) {
                            if (!c984960bjq.LLILZIL) {
                                i5 = R.drawable.fa9;
                            }
                            c1324720kZq6.setImageResource(i5);
                        }
                        C0GRS c0grs2 = c984960bjq.LLILZ;
                        if (c0grs2 != null) {
                            int visibility2 = c0grs2.getVisibility();
                            c0grs2.setVisibility(8);
                            C1602160rnK.LIZIZ(visibility2, 8, c0grs2);
                        }
                        C1324720kZq c1324720kZq7 = c984960bjq.LLILLL;
                        if (c1324720kZq7 != null) {
                            C786410Ut5.LLJJIII(c1324720kZq7, 8);
                        }
                        C1324720kZq c1324720kZq8 = c984960bjq.LLIZ;
                        if (c1324720kZq8 != null) {
                            C786410Ut5.h5(c1324720kZq8, 0.0f);
                        }
                    } else {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("contributorInfo = ");
                        sbLIZ.append(c984960bjq.LLILZLL);
                        C20441214yg.LIZIZ("CatchBeansMvpSeatView", C2188811AlT.LIZIZ(sbLIZ));
                        C01BH c01bh4 = c984960bjq.LLILZLL;
                        if (c01bh4 == null) {
                            c984960bjq.LLILZLL = c01bh2;
                        } else if (c01bh4.LIZ != c01bh2.LIZ || !Intrinsics.LJFF(c01bh4.LIZJ, c01bh2.LIZJ)) {
                        }
                        c984960bjq.LLILZLL = c01bh2;
                        c984960bjq.LL = false;
                        C1324720kZq c1324720kZq9 = c984960bjq.LLILLJJLI;
                        if (c1324720kZq9 != null) {
                            C1324610kZf c1324610kZfLJIIIZ = C1819620xS4.LIZ().LJIIIZ(c01bh2.LIZJ);
                            c1324610kZfLJIIIZ.LJIIIZ = R.drawable.el_;
                            int width = c1324720kZq9.getWidth();
                            int height = c1324720kZq9.getHeight();
                            c1324610kZfLJIIIZ.LJ = width;
                            c1324610kZfLJIIIZ.LJFF = height;
                            c1324610kZfLJIIIZ.LJIILIIL = Boolean.TRUE;
                            c1324610kZfLJIIIZ.LJJI(c1324720kZq9);
                        }
                        C1324720kZq c1324720kZq10 = c984960bjq.LLILLJJLI;
                        if (c1324720kZq10 != null) {
                            HandlerHook.viewPost(c1324720kZq10, new ARunnableS26S0101000_15(i, c984960bjq, 0));
                        }
                    }
                }
                i3 = i4;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }

    public static final AnimatorSet LIZLLL(float f, float f2, C984960bjq c984960bjq, C984960bjq c984960bjq2, float f3, float f4) {
        c984960bjq2.setPivotX(f);
        c984960bjq2.setPivotY(f2);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(c984960bjq, (Property<C984960bjq, Float>) View.SCALE_X, f3, f4);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(c984960bjq, (Property<C984960bjq, Float>) View.SCALE_Y, f3, f4);
        objectAnimatorOfFloat.setDuration(500L);
        objectAnimatorOfFloat2.setDuration(500L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        return animatorSet;
    }
}
