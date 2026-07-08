package X;

import Y.AAListenerS143S0300000_31;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.159w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C204750159w extends C16FV implements C15AJ {
    public ViewGroup LLILZIL;
    public String LLILZLL;
    public final boolean LLIZ;
    public C20476015Ag LLIZLLLIL;
    public Animator LLJ;
    public C1782400wU2 LLJI;

    @Override // X.C15AJ
    public final void g() {
        C500260Jjc.LJLJLJ(this, true);
        if (Intrinsics.LJFF(getParent(), getRoot())) {
            return;
        }
        C15AI.LJII(this);
        getRoot().addView(this);
    }

    public final void LIZLLL() {
        Animator animator = this.LLJ;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.LLJ;
        if (animator2 != null) {
            animator2.removeAllListeners();
        }
        setAnimator(null);
    }

    @Override // X.C15AJ
    public final boolean LLIIII() {
        return getParent() != null;
    }

    @Override // android.view.View, X.C15AJ
    public String getTag() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ImageGeniusView_");
        sbLIZ.append(getGeniusId());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        LIZLLL();
        C20597815iq.LIZ(this);
    }

    @Override // X.C15AJ
    public final void LJIIJ() {
        C15AI.LJII(this);
    }

    @Override // X.C15AJ
    public final void LLLIILIL() {
        C15AI.LIZ(this);
    }

    @Override // X.C15AJ
    public final boolean LLZZLLIL() {
        return this.LLIZ;
    }

    @Override // X.C15AJ
    public String getGeniusId() {
        return this.LLILZLL;
    }

    @Override // X.C15AJ
    public ViewGroup getRoot() {
        return this.LLILZIL;
    }

    @Override // X.C15AJ
    public C20476015Ag getGeniusModel() {
        return this.LLIZLLLIL;
    }

    private final void setAnimator(Animator animator) {
        this.LLJ = animator;
        if (animator == null) {
            this.LLJI = null;
        }
    }

    @Override // X.C15AJ
    public final ViewGroup.LayoutParams LLIIIZ(Rect rect) {
        return C15AI.LIZIZ(this, rect);
    }

    @Override // X.C15AJ
    public final void LLIIL(View view) {
        C15AI.LJIIIIZZ(this, view);
    }

    @Override // X.C15AJ
    public final void W(InterfaceC20476615Am interfaceC20476615Am) {
        C15AI.LJ(this, interfaceC20476615Am);
        C500260Jjc.LJLJLJ(this, false);
    }

    @Override // X.C15AJ
    public final void log(String str) {
        C15AI.LJFF(this, str);
    }

    @Override // X.C16FV, X.C16FY, androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    public void setGeniusId(String str) {
        this.LLILZLL = str;
    }

    @Override // X.C15AJ
    public void setRoot(ViewGroup viewGroup) {
        this.LLILZIL = viewGroup;
    }

    @Override // X.C15AJ
    public void setGeniusModel(C20476015Ag c20476015Ag) {
        this.LLIZLLLIL = c20476015Ag;
    }

    public C204750159w(ViewGroup viewGroup, String str, boolean z) {
        super(viewGroup.getContext());
        this.LLILZIL = viewGroup;
        this.LLILZLL = str;
        this.LLIZ = z;
        setScaleType(ImageView.ScaleType.CENTER_CROP);
        ViewGroup.LayoutParams layoutParamsLLIIIZ = LLIIIZ(new Rect());
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParamsLLIIIZ);
    }

    @Override // X.C15AJ
    public final void LJLL(List list, InterfaceC20476615Am interfaceC20476615Am, Function2 function2) {
        C15AI.LJIIIZ(this, list, interfaceC20476615Am, function2);
    }

    @Override // X.C15AJ
    public final void LLJJIJIL(List list, InterfaceC20476615Am interfaceC20476615Am, Function2 function2) {
        C15AG c15ag;
        ObjectAnimator objectAnimatorOfPropertyValuesHolder;
        float translationZ;
        ObjectAnimator objectAnimatorOfPropertyValuesHolder2;
        ObjectAnimator objectAnimatorOfFloat;
        C20476115Ah c20476115Ah;
        Animator animator = this.LLJ;
        if (animator != null) {
            animator.cancel();
        }
        setAnimator(null);
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C15AK c15ak = (C15AK) it2.next();
            if (c15ak != null && (c15ag = c15ak.LIZLLL) != null) {
                int i = C15AB.LIZ[c15ag.ordinal()];
                if (i != 1) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                T t = c15ak.LJ;
                                if (t instanceof C1782410wU3) {
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("TranslateAnimationConfig cur.x:");
                                    sbLIZ.append(getX());
                                    sbLIZ.append(" cur.y:");
                                    sbLIZ.append(getY());
                                    sbLIZ.append(" x:");
                                    C1782410wU3 c1782410wU3 = (C1782410wU3) t;
                                    sbLIZ.append(c1782410wU3.LIZ);
                                    sbLIZ.append(" y:");
                                    sbLIZ.append(c1782410wU3.LIZIZ);
                                    C15AI.LJFF(this, C2188811AlT.LIZIZ(sbLIZ));
                                    Float f = c1782410wU3.LIZJ;
                                    if (f != null && c1782410wU3.LIZLLL != null) {
                                        objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofFloat((Property<?, Float>) View.X, f.floatValue(), c1782410wU3.LIZ), PropertyValuesHolder.ofFloat((Property<?, Float>) View.Y, c1782410wU3.LIZLLL.floatValue(), c1782410wU3.LIZIZ));
                                    } else {
                                        objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofFloat((Property<?, Float>) View.X, c1782410wU3.LIZ), PropertyValuesHolder.ofFloat((Property<?, Float>) View.Y, c1782410wU3.LIZIZ));
                                    }
                                    C15AI.LIZLLL(objectAnimatorOfPropertyValuesHolder, c15ak);
                                    arrayList.add(objectAnimatorOfPropertyValuesHolder);
                                }
                            }
                        } else {
                            T t2 = c15ak.LJ;
                            if (t2 instanceof C15A5) {
                                Property property = View.TRANSLATION_Z;
                                float[] fArr = new float[2];
                                C15A5 c15a5 = (C15A5) t2;
                                Float f2 = c15a5.LIZIZ;
                                if (f2 != null) {
                                    translationZ = f2.floatValue();
                                } else {
                                    translationZ = getTranslationZ();
                                }
                                fArr[0] = translationZ;
                                fArr[1] = c15a5.LIZ;
                                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, (Property<C204750159w, Float>) property, fArr);
                                C15AI.LIZLLL(objectAnimatorOfFloat2, c15ak);
                                arrayList.add(objectAnimatorOfFloat2);
                            }
                        }
                    } else {
                        T t3 = c15ak.LJ;
                        if (t3 instanceof C15A2) {
                            C15A2 c15a2 = (C15A2) t3;
                            if (c15a2 != null) {
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("ScaleAnimationConfig:");
                                sbLIZ2.append(c15ak.LJ);
                                C15AI.LJFF(this, C2188811AlT.LIZIZ(sbLIZ2));
                                Pair<Float, Float> pair = c15a2.LIZIZ;
                                if (pair != null) {
                                    objectAnimatorOfPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, pair.getFirst().floatValue(), c15a2.LIZ.getFirst().floatValue()), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, c15a2.LIZIZ.getSecond().floatValue(), c15a2.LIZ.getSecond().floatValue()));
                                } else {
                                    objectAnimatorOfPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, c15a2.LIZ.getFirst().floatValue()), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, c15a2.LIZ.getSecond().floatValue()));
                                }
                                C15AI.LIZLLL(objectAnimatorOfPropertyValuesHolder2, c15ak);
                                arrayList.add(objectAnimatorOfPropertyValuesHolder2);
                            } else {
                                return;
                            }
                        } else {
                            continue;
                        }
                    }
                } else {
                    C1782400wU2 c1782400wU2 = (C1782400wU2) c15ak.LJ;
                    C20476015Ag geniusModel = getGeniusModel();
                    if (geniusModel != null && (c20476115Ah = geniusModel.LIZ) != null) {
                        c20476115Ah.LJ = c1782400wU2.LIZ;
                    }
                    if (c1782400wU2.LIZIZ != null) {
                        objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<C204750159w, Float>) View.ALPHA, getAlpha(), c1782400wU2.LIZIZ.floatValue(), c1782400wU2.LIZ);
                    } else {
                        objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<C204750159w, Float>) View.ALPHA, getAlpha(), c1782400wU2.LIZ);
                    }
                    C15AI.LIZLLL(objectAnimatorOfFloat, c15ak);
                    arrayList.add(objectAnimatorOfFloat);
                }
            }
        }
        animatorSet.addListener(new AAListenerS143S0300000_31(this, animatorSet, function2, 1));
        if (!arrayList.isEmpty()) {
            C15AI.LJFF(this, "readyPlayAnimationList.isNotEmpty()");
            setAnimator(animatorSet);
            animatorSet.playTogether(arrayList);
            animatorSet.start();
            return;
        }
        C15AI.LJFF(this, "readyPlayAnimationList.isEmpty() update model directly");
        if (interfaceC20476615Am != null) {
            LLLZZIL(interfaceC20476615Am, "no animation", false, null);
        }
        if (function2 == null) {
            return;
        }
        function2.invoke(Boolean.TRUE, null);
    }

    @Override // X.C15AJ
    public final void LLJLILLLLZIIL(InterfaceC20476615Am interfaceC20476615Am, String str, Function2 function2) {
        C15AI.LJI(this, interfaceC20476615Am, str, function2);
    }

    @Override // X.C15AJ
    public final void LLLZZIL(InterfaceC20476615Am interfaceC20476615Am, String str, boolean z, Function2 function2) {
        C204752159y c204752159y;
        C15AK<? extends C15A8> c15ak;
        float alpha;
        C20476015Ag c20476015Ag = (C20476015Ag) interfaceC20476615Am;
        C15AI.LJIIJ(this, c20476015Ag, str, z, function2);
        float f = c20476015Ag.LIZ.LJFF;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setScaleX(f);
        float f2 = c20476015Ag.LIZ.LJI;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setScaleY(f2);
        float f3 = c20476015Ag.LIZ.LIZ;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setX(f3);
        float f4 = c20476015Ag.LIZ.LIZIZ;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setY(f4);
        setZ(c20476015Ag.LIZ.LJII);
        float f5 = c20476015Ag.LIZ.LJ;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setAlpha(f5);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        C20476115Ah c20476115Ah = c20476015Ag.LIZ;
        layoutParams.width = c20476115Ah.LIZJ;
        layoutParams.height = c20476115Ah.LIZLLL;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
        C20476115Ah c20476115Ah2 = c20476015Ag.LIZ;
        layoutParams2.width = c20476115Ah2.LIZJ;
        layoutParams2.height = c20476115Ah2.LIZLLL;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams2);
        InterfaceC20477315At interfaceC20477315At = c20476015Ag.LIZJ;
        if (interfaceC20477315At instanceof C204752159y) {
            c204752159y = (C204752159y) interfaceC20477315At;
        } else {
            c204752159y = null;
        }
        if (c204752159y != null && c204752159y.LJFF) {
            int i = C15AB.LIZIZ[c204752159y.LIZ.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            Integer numLJIIJJI = C2095008Iq.LJIIJJI(c204752159y.LIZIZ);
                            if (numLJIIJJI != null) {
                                setImageResource(C20736316Cj.LJ(numLJIIJJI.intValue(), getContext()));
                            }
                        } else {
                            throw new IllegalArgumentException("not support res type yet!");
                        }
                    } else {
                        Integer numLJIIJJI2 = C2095008Iq.LJIIJJI(c204752159y.LIZIZ);
                        if (numLJIIJJI2 != null) {
                            setImageResource(numLJIIJJI2.intValue());
                        }
                    }
                } else {
                    throw new IllegalArgumentException("not support url type yet!");
                }
            } else {
                C1143680frq.LJI(this, c204752159y.LIZIZ, null, true);
            }
            if (this.LLIZ && (c15ak = c204752159y.LIZJ) != null) {
                T t = c15ak.LJ;
                if (t instanceof C1782400wU2) {
                    if (Intrinsics.LJFF(this.LLJI, t)) {
                        C15AI.LJFF(this, "alphaAnimationConfig is the same");
                        return;
                    }
                    C1782400wU2 c1782400wU2 = (C1782400wU2) c204752159y.LIZJ.LJ;
                    this.LLJI = c1782400wU2;
                    Property property = View.ALPHA;
                    float[] fArr = new float[2];
                    Float f6 = c1782400wU2.LIZIZ;
                    if (f6 != null) {
                        alpha = f6.floatValue();
                    } else {
                        alpha = getAlpha();
                    }
                    fArr[0] = alpha;
                    fArr[1] = ((C1782400wU2) c204752159y.LIZJ.LJ).LIZ;
                    ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<C204750159w, Float>) property, fArr);
                    objectAnimatorOfFloat.setStartDelay(c204752159y.LIZJ.LIZ);
                    objectAnimatorOfFloat.setDuration(c204752159y.LIZJ.LIZIZ);
                    objectAnimatorOfFloat.setInterpolator(c204752159y.LIZJ.LIZJ);
                    objectAnimatorOfFloat.setRepeatCount(c204752159y.LIZLLL);
                    objectAnimatorOfFloat.setRepeatMode(c204752159y.LJ);
                    C786410Ut5.Pd(objectAnimatorOfFloat);
                    setAnimator(objectAnimatorOfFloat);
                    return;
                }
            }
            LIZLLL();
            return;
        }
        LIZLLL();
        C500260Jjc.LJLJLJ(this, false);
    }
}
