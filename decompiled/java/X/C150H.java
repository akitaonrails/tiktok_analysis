package X;

import Y.AfS200S0100000_31;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.150H, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C150H extends LinearLayout {
    public static final /* synthetic */ int LLJILJILJ = 0;
    public final TextView LL;
    public final LiveIconView LLILLJJLI;
    public final TextView LLILLL;
    public final LiveIconView LLILZ;
    public final TextView LLILZIL;
    public final ArrayList<C150F> LLILZLL;
    public C11JF LLIZ;
    public C150F LLIZLLLIL;
    public long LLJ;
    public Animator LLJI;
    public boolean LLJIJIL;
    public int LLJILJIL;

    public final void LIZLLL() {
        if (this.LLILZLL.isEmpty()) {
            return;
        }
        ArrayList<C150F> arrayList = this.LLILZLL;
        int i = this.LLJILJIL;
        this.LLJILJIL = i + 1;
        LJ((C150F) ListProtector.get(arrayList, i % arrayList.size()));
    }

    public final void LIZ() {
        C11JF c11jf;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cancelRolling isDisposed:");
        C11JF c11jf2 = this.LLIZ;
        sbLIZ.append(c11jf2 != null ? Boolean.valueOf(c11jf2.isDisposed()) : null);
        LIZJ(C2188811AlT.LIZIZ(sbLIZ));
        C11JF c11jf3 = this.LLIZ;
        if (c11jf3 != null && !c11jf3.isDisposed() && (c11jf = this.LLIZ) != null) {
            c11jf.dispose();
        }
        this.LLIZ = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        LIZ();
    }

    public final int getCurIndex() {
        return this.LLJILJIL;
    }

    public static void LIZJ(String str) {
        C20441214yg.LJ("BoardChildViewNew", str);
    }

    private final void setAnimation(final View view) {
        PropertyValuesHolder propertyValuesHolderOfKeyframe = PropertyValuesHolder.ofKeyframe(LinearLayout.ROTATION, Keyframe.ofFloat(0.0f, 0.0f), Keyframe.ofFloat(0.25f, -9.0f), Keyframe.ofFloat(0.5f, 0.0f), Keyframe.ofFloat(0.75f, 9.0f), Keyframe.ofFloat(1.0f, 0.0f));
        Animator animator = this.LLJI;
        if (animator != null) {
            animator.cancel();
        }
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, propertyValuesHolderOfKeyframe);
        this.LLJI = objectAnimatorOfPropertyValuesHolder;
        if (objectAnimatorOfPropertyValuesHolder != null) {
            objectAnimatorOfPropertyValuesHolder.setDuration(1000L);
        }
        Animator animator2 = this.LLJI;
        if (animator2 != null) {
            animator2.setInterpolator(new Interpolator() { // from class: X.0GaB
                @Override // android.animation.TimeInterpolator
                public final float getInterpolation(float f) {
                    return (float) ((Math.pow(2.0d, (-10) * f) * Math.sin((((double) (f - (0.3f / 4))) * 6.283185307179586d) / ((double) 0.3f))) + ((double) 1));
                }
            });
        }
        Animator animator3 = this.LLJI;
        if (animator3 != null) {
            animator3.addListener(new C464420IJc() { // from class: X.150J
                public final void LIZ() {
                    Animator animator4 = this.LLJI;
                    if (animator4 != null) {
                        animator4.removeAllListeners();
                    }
                    this.LLJI = null;
                    C786410Ut5.Ab(view, 0.0f);
                    View view2 = view;
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    layoutParams.width = -1;
                    C786410Ut5.W5(view2, layoutParams);
                }

                @Override // X.C464420IJc, android.animation.Animator.AnimatorListener
                public final void onAnimationCancel(Animator animator4) {
                    LIZ();
                }

                @Override // X.C464420IJc, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator4) {
                    LIZ();
                }

                @Override // X.C464420IJc, android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator4) {
                    View view2 = view;
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    layoutParams.width = -2;
                    C786410Ut5.W5(view2, layoutParams);
                }
            });
        }
        Animator animator4 = this.LLJI;
        if (animator4 != null) {
            animator4.start();
        }
    }

    public final void LJ(final C150F c150f) {
        boolean z;
        int measuredHeight;
        View view;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("next boardDataNew:");
        sbLIZ.append(c150f);
        LIZJ(C2188811AlT.LIZIZ(sbLIZ));
        C150F c150f2 = this.LLIZLLLIL;
        if (c150f2 != null && this.LLJIJIL) {
            this.LL.setText(c150f.LIZ);
            ArrayList arrayList = new ArrayList();
            Object parent = this.LLILLJJLI.getParent();
            if ((parent instanceof View) && (view = (View) parent) != null) {
                measuredHeight = view.getMeasuredHeight();
            } else {
                measuredHeight = this.LLILLJJLI.getMeasuredHeight();
            }
            float f = measuredHeight;
            if (!Intrinsics.LJFF(c150f2.LIZIZ, c150f.LIZIZ)) {
                C786410Ut5.nd(this.LLILLJJLI, 0.0f);
                arrayList.add(C519880KaA.LIZ(this.LLILLJJLI, LinearLayout.TRANSLATION_Y, new float[]{0.0f, f * (-1.0f)}));
                C150E c150e = c150f.LIZIZ;
                if (c150e != null) {
                    LJI(this.LLILZ, c150e);
                }
                C786410Ut5.LLJJIJIL(this.LLILZ, 0);
                C786410Ut5.nd(this.LLILZ, f);
                final ObjectAnimator objectAnimatorLIZ = C519880KaA.LIZ(this.LLILZ, LinearLayout.TRANSLATION_Y, new float[]{f, 0.0f});
                objectAnimatorLIZ.addListener(new C464420IJc() { // from class: X.150I
                    @Override // X.C464420IJc, android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator) {
                        objectAnimatorLIZ.removeAllListeners();
                        C150E c150e2 = c150f.LIZIZ;
                        if (c150e2 != null) {
                            C150H c150h = this;
                            c150h.LJI(c150h.LLILLJJLI, c150e2);
                        }
                        C786410Ut5.nd(this.LLILLJJLI, 0.0f);
                        C786410Ut5.LLJJIJIL(this.LLILZ, 8);
                    }
                });
                arrayList.add(objectAnimatorLIZ);
            }
            ObjectAnimator objectAnimatorLIZ2 = C519880KaA.LIZ(this.LLILLL, LinearLayout.TRANSLATION_Y, new float[]{0.0f, (-1.0f) * f});
            C786410Ut5.LLIL(this.LLILZIL, 0);
            this.LLILZIL.setText(c150f.LIZJ);
            C786410Ut5.cd(f, this.LLILZIL);
            final ObjectAnimator objectAnimatorLIZ3 = C519880KaA.LIZ(this.LLILZIL, LinearLayout.TRANSLATION_Y, new float[]{f, 0.0f});
            objectAnimatorLIZ3.addListener(new C464420IJc() { // from class: X.150K
                @Override // X.C464420IJc, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    objectAnimatorLIZ3.removeAllListeners();
                    C786410Ut5.LLIL(this.LLILZIL, 8);
                    C150H.LJFF(this, c150f);
                }
            });
            arrayList.add(objectAnimatorLIZ2);
            arrayList.add(objectAnimatorLIZ3);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            animatorSet.start();
            this.LLIZLLLIL = c150f;
            return;
        }
        if (c150f.LIZ.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C786410Ut5.LLIL(this.LL, 8);
        } else if (c150f.LIZJ.length() == 0) {
            this.LL.setGravity(16);
            TextView textView = this.LL;
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -1;
            C786410Ut5.g6(textView, layoutParams);
        } else {
            this.LL.setGravity(8388659);
            TextView textView2 = this.LL;
            ViewGroup.LayoutParams layoutParams2 = textView2.getLayoutParams();
            layoutParams2.width = -2;
            layoutParams2.height = -2;
            C786410Ut5.g6(textView2, layoutParams2);
        }
        this.LL.setText(c150f.LIZ);
        if (c150f.LIZIZ == null) {
            C786410Ut5.LLJJIJIL(this.LLILLJJLI, 8);
        } else {
            C786410Ut5.LLJJIJIL(this.LLILLJJLI, 0);
            LJI(this.LLILLJJLI, c150f.LIZIZ);
        }
        if (c150f.LIZJ.length() == 0) {
            C786410Ut5.LLIL(this.LLILLL, 8);
        } else {
            C786410Ut5.LLIL(this.LLILLL, 0);
        }
        this.LLIZLLLIL = c150f;
        LJFF(this, c150f);
    }

    public final void setContentTextSize(int i) {
        float f = i;
        this.LLILLL.setTextSize(f);
        this.LLILZIL.setTextSize(f);
    }

    public final void setCurIndex(int i) {
        this.LLJILJIL = i;
    }

    public final void setTitleTextSize(int i) {
        this.LL.setTextSize(i);
    }

    public C150H(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILZLL = new ArrayList<>();
        this.LLJ = Mp4ScreenVideoLoadTimeout.CONTROL;
        this.LLJIJIL = true;
        setOrientation(1);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.ha6, this, true);
        this.LL = (TextView) findViewById(R.id.tv_title);
        this.LLILLJJLI = (LiveIconView) findViewById(R.id.lkw);
        this.LLILLL = (TextView) findViewById(R.id.zf0);
        this.LLILZ = (LiveIconView) findViewById(R.id.ll1);
        this.LLILZIL = (TextView) findViewById(R.id.zf4);
    }

    public static final void LJFF(C150H c150h, C150F c150f) {
        C786410Ut5.cd(0.0f, c150h.LLILLL);
        c150h.LLILLL.setText(c150f.LIZJ);
        if (c150h.LLJIJIL && c150f.LIZLLL) {
            c150h.setAnimation(c150h.LLILLL);
        }
    }

    public final void LJI(LiveIconView liveIconView, C150E c150e) {
        if (c150e.LIZLLL != null) {
            int i = C992480bvy.LIZ[c150e.LJ.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    liveIconView.setIconTint(c150e.LIZLLL.intValue());
                }
            } else {
                liveIconView.setIconTintAttr(c150e.LIZLLL.intValue());
            }
        } else {
            liveIconView.setIconTintList(null);
        }
        EnumC20439114yL enumC20439114yL = c150e.LIZIZ;
        if (enumC20439114yL == EnumC20439114yL.ATTR_TYPE) {
            Integer numLJIIJJI = C2095008Iq.LJIIJJI(c150e.LIZ);
            if (numLJIIJJI != null) {
                liveIconView.setIconAttr(numLJIIJJI.intValue());
                return;
            }
            return;
        }
        if (enumC20439114yL == EnumC20439114yL.RES_TYPE) {
            Integer numLJIIJJI2 = C2095008Iq.LJIIJJI(c150e.LIZ);
            if (numLJIIJJI2 == null) {
                return;
            }
            liveIconView.setImageResource(numLJIIJJI2.intValue());
            return;
        }
        if (enumC20439114yL != EnumC20439114yL.GECKO) {
            return;
        }
        if (!this.LLJIJIL) {
            C11NZ.LJIJJLI(new C534980KyW(c150e.LIZ)).LJIILIIL(new C0UO0()).LJJLL(new AfS200S0100000_31(liveIconView, 2), new C09JN() { // from class: X.150G
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("BoardChildViewNew@e50f.updateIconRes$4");
                    C1C7U.LIZIZ("BoardChildViewNew@e50f.updateIconRes$4");
                }
            });
        }
        C1143680frq.LJI(liveIconView, c150e.LIZ, null, true);
    }

    public final void LIZIZ(boolean z, boolean z2, Long l, List list) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("injectData boardDataNewList.size:");
        sbLIZ.append(list.size());
        sbLIZ.append(" autoStart:");
        sbLIZ.append(z);
        LIZJ(C2188811AlT.LIZIZ(sbLIZ));
        this.LLILZLL.clear();
        this.LLILZLL.addAll(list);
        this.LLJILJIL = 0;
        this.LLIZLLLIL = null;
        LIZ();
        this.LLJIJIL = z2;
        if (l != null) {
            this.LLJ = l.longValue();
        }
        Iterator it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (((C150F) next).LIZJ.length() > 0) {
                if (next != null) {
                    TextView textView = this.LL;
                    ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                    layoutParams.height = C439101nJ.LIZ(12);
                    C786410Ut5.g6(textView, layoutParams);
                }
            }
        }
        TextView textView2 = this.LL;
        ViewGroup.LayoutParams layoutParams2 = textView2.getLayoutParams();
        layoutParams2.height = -2;
        C786410Ut5.g6(textView2, layoutParams2);
        if (z) {
            LIZJ("startRolling");
            if (this.LLILZLL.isEmpty()) {
                LIZJ("startRolling return");
                return;
            }
            if (this.LLILZLL.size() == 1) {
                LIZLLL();
                return;
            } else {
                if (this.LLIZ != null) {
                    LIZJ("startRolling return as isRunning");
                    return;
                }
                LIZLLL();
                long j = this.LLJ;
                this.LLIZ = (C11JF) C11NZ.LJJJJJL(j, j, TimeUnit.MILLISECONDS).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS200S0100000_31(this, 19));
                return;
            }
        }
        LIZLLL();
    }
}
