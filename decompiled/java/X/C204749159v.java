package X;

import Y.AAListenerS277S0200000_31;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS640S0100000_26;
import kotlin.jvm.internal.AwS645S0100000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.159v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C204749159v extends FrameLayout implements C15AX, C15AU {
    public ViewGroup LL;
    public String LLILLJJLI;
    public final boolean LLILLL;
    public C20475415Aa LLILZ;
    public final C01GW LLILZIL;
    public C204746159s LLILZLL;
    public Function2<? super Boolean, ? super String, Unit> LLIZ;
    public Bitmap LLIZLLLIL;
    public Function2<? super Boolean, ? super String, Unit> LLJ;

    @Override // X.C15AJ
    public final void g() {
        C500260Jjc.LJLJLJ(this, true);
    }

    private final C1295960jpS getLottieView() {
        return (C1295960jpS) this.LLILZIL.getValue();
    }

    @Override // X.C15AX
    public final Bitmap LJJJJZI() {
        C1295950jpR c1295950jpR;
        Rect rect;
        if (getLottieView().getWidth() == 0 || getLottieView().getHeight() == 0) {
            return null;
        }
        Bitmap bitmap = this.LLIZLLLIL;
        if (bitmap != null) {
            return bitmap;
        }
        Drawable drawable = getLottieView().getDrawable();
        if (!(drawable instanceof C1295950jpR) || (c1295950jpR = (C1295950jpR) drawable) == null) {
            return null;
        }
        c1295950jpR.LJIILLIIL(0);
        C1294720jnS c1294720jnS = c1295950jpR.LL;
        if (c1294720jnS == null || (rect = c1294720jnS.LJIIIZ) == null) {
            return null;
        }
        int iWidth = rect.width();
        Rect rect2 = c1294720jnS.LJIIIZ;
        if (rect2 == null) {
            return null;
        }
        float f = iWidth;
        float fHeight = rect2.height();
        float fMin = Math.min(getLottieView().getWidth() / f, getLottieView().getHeight() / fHeight);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) (f * fMin), (int) (fHeight * fMin), Bitmap.Config.ARGB_8888);
        Matrix matrix = new Matrix();
        matrix.postScale(fMin, fMin);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.save();
        canvas.setMatrix(matrix);
        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
        c1295950jpR.draw(canvas);
        canvas.restore();
        this.LLIZLLLIL = bitmapCreateBitmap;
        return bitmapCreateBitmap;
    }

    @Override // X.C15AJ
    public final boolean LLIIII() {
        return getParent() != null;
    }

    @Override // android.view.View, X.C15AJ
    public String getTag() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LottieGenius");
        sbLIZ.append(!this.LLILLL ? "_screenshot" : "");
        sbLIZ.append('_');
        sbLIZ.append(getGeniusId());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C15AI.LJFF(this, "onDetachedFromWindow");
        getLottieView().removeAllAnimatorListeners();
        setActionSuccess(null);
        Bitmap bitmap = this.LLIZLLLIL;
        if (bitmap != null) {
            bitmap.recycle();
            BitmapCrashChecker.recordBitmapRecyclePoint(bitmap);
        }
        this.LLIZLLLIL = null;
        Function2<? super Boolean, ? super String, Unit> function2 = this.LLIZ;
        if (function2 != null) {
            Boolean bool = Boolean.FALSE;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(getGeniusId());
            sbLIZ.append("_onDetachedFromWindow");
            function2.invoke(bool, C2188811AlT.LIZIZ(sbLIZ));
        }
        this.LLIZ = null;
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
        return this.LLILLL;
    }

    @Override // X.C15AU
    public Function2<Boolean, String, Unit> getActionSuccess() {
        return this.LLJ;
    }

    @Override // X.C15AJ
    public String getGeniusId() {
        return this.LLILLJJLI;
    }

    @Override // X.C15AJ
    public ViewGroup getRoot() {
        return this.LL;
    }

    @Override // X.C15AJ
    public C20475415Aa getGeniusModel() {
        return this.LLILZ;
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

    @Override // X.C15AU
    public void setActionSuccess(Function2<? super Boolean, ? super String, Unit> function2) {
        this.LLJ = function2;
    }

    public void setGeniusId(String str) {
        this.LLILLJJLI = str;
    }

    @Override // X.C15AJ
    public void setRoot(ViewGroup viewGroup) {
        this.LL = viewGroup;
    }

    @Override // X.C15AJ
    public void setGeniusModel(C20475415Aa c20475415Aa) {
        this.LLILZ = c20475415Aa;
    }

    public C204749159v(ViewGroup viewGroup, String str, boolean z) {
        super(viewGroup.getContext());
        this.LL = viewGroup;
        this.LLILLJJLI = str;
        this.LLILLL = z;
        this.LLILZIL = C292401Bi.LIZ(new AwS575S0100000_31(this, 1373));
        ViewGroup.LayoutParams layoutParamsLLIIIZ = LLIIIZ(new Rect());
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParamsLLIIIZ);
    }

    @Override // X.C15AJ
    public final void LJLL(List list, InterfaceC20476615Am interfaceC20476615Am, Function2 function2) {
        this.LLIZ = function2;
        C15AI.LJIIIZ(this, list, interfaceC20476615Am, new AwS640S0100000_26(this, 97));
    }

    @Override // X.C15AJ
    public final void LLJJIJIL(List list, InterfaceC20476615Am interfaceC20476615Am, Function2 function2) {
        Object next;
        C15A6 c15a6;
        Object next2;
        C15AG c15ag;
        ObjectAnimator objectAnimatorOfPropertyValuesHolder;
        float translationZ;
        ObjectAnimator objectAnimatorOfPropertyValuesHolder2;
        ObjectAnimator objectAnimatorOfFloat;
        C20476115Ah c20476115Ah;
        C15AG c15ag2;
        C15AG c15ag3;
        Iterator it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                C15AK c15ak = (C15AK) next;
                if (c15ak != null) {
                    c15ag3 = c15ak.LIZLLL;
                } else {
                    c15ag3 = null;
                }
                if (c15ag3 == C15AG.LOTTIE) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C15AK c15ak2 = (C15AK) next;
        if (c15ak2 == null) {
            Iterator it3 = list.iterator();
            while (true) {
                if (it3.hasNext()) {
                    next2 = it3.next();
                    C15AK c15ak3 = (C15AK) next2;
                    if (c15ak3 != null) {
                        c15ag2 = c15ak3.LIZLLL;
                    } else {
                        c15ag2 = null;
                    }
                    if (c15ag2 == C15AG.NONE) {
                        break;
                    }
                } else {
                    next2 = null;
                    break;
                }
            }
            C15AK c15ak4 = (C15AK) next2;
            if (c15ak4 != null && interfaceC20476615Am != null) {
                HandlerHook.viewPostDelay(this, new RunnableC514801zW(function2, 114), c15ak4.LIZ);
                return;
            }
            ArrayList arrayList = new ArrayList();
            AnimatorSet animatorSet = new AnimatorSet();
            Iterator it4 = list.iterator();
            while (it4.hasNext()) {
                C15AK c15ak5 = (C15AK) it4.next();
                if (c15ak5 != null && (c15ag = c15ak5.LIZLLL) != null) {
                    int i = C15AF.LIZ[c15ag.ordinal()];
                    if (i != 1) {
                        if (i != 3) {
                            if (i != 4) {
                                if (i == 5) {
                                    T t = c15ak5.LJ;
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
                                        C15AI.LIZLLL(objectAnimatorOfPropertyValuesHolder, c15ak5);
                                        arrayList.add(objectAnimatorOfPropertyValuesHolder);
                                    }
                                }
                            } else {
                                T t2 = c15ak5.LJ;
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
                                    ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, (Property<C204749159v, Float>) property, fArr);
                                    C15AI.LIZLLL(objectAnimatorOfFloat2, c15ak5);
                                    arrayList.add(objectAnimatorOfFloat2);
                                }
                            }
                        } else {
                            T t3 = c15ak5.LJ;
                            if (t3 instanceof C15A2) {
                                C15A2 c15a2 = (C15A2) t3;
                                if (c15a2 == null) {
                                    return;
                                }
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("ScaleAnimationConfig:");
                                sbLIZ2.append(c15ak5.LJ);
                                C15AI.LJFF(this, C2188811AlT.LIZIZ(sbLIZ2));
                                Pair<Float, Float> pair = c15a2.LIZIZ;
                                if (pair != null) {
                                    objectAnimatorOfPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, pair.getFirst().floatValue(), c15a2.LIZ.getFirst().floatValue()), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, c15a2.LIZIZ.getSecond().floatValue(), c15a2.LIZ.getSecond().floatValue()));
                                } else {
                                    objectAnimatorOfPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, c15a2.LIZ.getFirst().floatValue()), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, c15a2.LIZ.getSecond().floatValue()));
                                }
                                C15AI.LIZLLL(objectAnimatorOfPropertyValuesHolder2, c15ak5);
                                arrayList.add(objectAnimatorOfPropertyValuesHolder2);
                            } else {
                                continue;
                            }
                        }
                    } else {
                        C1782400wU2 c1782400wU2 = (C1782400wU2) c15ak5.LJ;
                        C20475415Aa geniusModel = getGeniusModel();
                        if (geniusModel != null && (c20476115Ah = geniusModel.LIZ) != null) {
                            c20476115Ah.LJ = c1782400wU2.LIZ;
                        }
                        Float f3 = c1782400wU2.LIZIZ;
                        if (f3 != null) {
                            objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<C204749159v, Float>) View.ALPHA, f3.floatValue(), c1782400wU2.LIZ);
                        } else {
                            objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<C204749159v, Float>) View.ALPHA, getAlpha(), c1782400wU2.LIZ);
                        }
                        C15AI.LIZLLL(objectAnimatorOfFloat, c15ak5);
                        arrayList.add(objectAnimatorOfFloat);
                    }
                }
            }
            animatorSet.addListener(new AAListenerS277S0200000_31(this, function2, 2));
            if (!arrayList.isEmpty()) {
                C15AI.LJFF(this, "readyPlayAnimationList.isNotEmpty()");
                animatorSet.playTogether(arrayList);
                animatorSet.start();
                return;
            } else {
                C15AI.LJFF(this, "readyPlayAnimationList.isEmpty() update model directly");
                if (function2 == null) {
                    return;
                }
                function2.invoke(Boolean.TRUE, null);
                return;
            }
        }
        T t4 = c15ak2.LJ;
        if ((t4 instanceof C15A6) && (c15a6 = (C15A6) t4) != null) {
            C204746159s c204746159s = new C204746159s(c15a6.LIZ);
            C1294720jnS composition = getLottieView().getComposition();
            if (Intrinsics.LJFF(this.LLILZLL, c204746159s) && composition != null) {
                C15AI.LJFF(this, "play lottie not load res");
                C15AS.LIZIZ(this, function2, getLottieView(), c15a6.LIZ, composition);
                return;
            } else {
                this.LLILZLL = c204746159s;
                C15AS.LIZ(this, getLottieView(), c15a6.LIZ, true, new C5185020h(function2, (Function2<? super Boolean, ? super Throwable, Unit>) 31));
                return;
            }
        }
        if (function2 == null) {
            return;
        }
        function2.invoke(Boolean.FALSE, "lottieConfig is null");
    }

    @Override // X.C15AJ
    public final void LLJLILLLLZIIL(InterfaceC20476615Am interfaceC20476615Am, String str, Function2 function2) {
        C15AI.LJI(this, interfaceC20476615Am, str, function2);
    }

    @Override // X.C15AU
    public final void LIZ(Function2<? super Boolean, ? super String, Unit> function2, C1295960jpS c1295960jpS, C15AO c15ao, C1294720jnS c1294720jnS) {
        C15AS.LIZIZ(this, function2, c1295960jpS, c15ao, c1294720jnS);
    }

    @Override // X.C15AJ
    public final void LLLZZIL(InterfaceC20476615Am interfaceC20476615Am, String str, boolean z, Function2 function2) {
        C20475415Aa c20475415Aa = (C20475415Aa) interfaceC20476615Am;
        C15AI.LJIIJ(this, c20475415Aa, str, z, function2);
        C500260Jjc.LJLJLJ(this, true);
        float f = c20475415Aa.LIZ.LJFF;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setScaleX(f);
        float f2 = c20475415Aa.LIZ.LJI;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setScaleY(f2);
        float f3 = c20475415Aa.LIZ.LIZ;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setX(f3);
        float f4 = c20475415Aa.LIZ.LIZIZ;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setY(f4);
        setZ(c20475415Aa.LIZ.LJII);
        float f5 = c20475415Aa.LIZ.LJ;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setAlpha(f5);
        c20475415Aa.LJI();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        C20476115Ah c20476115Ah = c20475415Aa.LIZ;
        layoutParams.width = c20476115Ah.LIZJ;
        layoutParams.height = c20476115Ah.LIZLLL;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
        C1295960jpS lottieView = getLottieView();
        ViewGroup.LayoutParams layoutParams2 = getLottieView().getLayoutParams();
        C20476115Ah c20476115Ah2 = c20475415Aa.LIZ;
        layoutParams2.width = c20476115Ah2.LIZJ;
        layoutParams2.height = c20476115Ah2.LIZLLL;
        C786410Ut5.s6(lottieView, layoutParams2);
        if (getParent() != null && !z) {
            if (Intrinsics.LJFF(this.LLILZLL, c20475415Aa.LIZJ)) {
                C15AI.LJFF(this, "updateByGeniusModel curPlayLottieGeniusConfig is the same as geniusConfig");
            } else {
                C15AI.LJFF(this, "updateByGeniusModel play lottie");
                this.LLILZLL = c20475415Aa.LJI();
                C204746159s c204746159sLJI = c20475415Aa.LJI();
                if (c204746159sLJI != null) {
                    C15AS.LIZ(this, getLottieView(), c204746159sLJI.LIZ, this.LLILLL, new AwS645S0100000_31(this, 93));
                }
            }
        }
        invalidate();
    }
}
