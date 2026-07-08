package X;

import Y.AAListenerS343S0100000_33;
import Y.ARunnableS133S0100000_33;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Animatable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.19oU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21652019oU extends FrameLayout {
    public final View LL;
    public final View LLILLJJLI;
    public final View LLILLL;
    public float LLILZ;
    public float LLILZIL;
    public boolean LLILZLL;
    public C21652119oV LLIZ;
    public int LLIZLLLIL;
    public Function2<? super Integer, ? super Integer, Unit> LLJ;
    public Function1<? super String, Unit> LLJI;

    public final Function1<String, Unit> getImgLoadFailedCallback() {
        return this.LLJI;
    }

    public final Function2<Integer, Integer, Unit> getShowIndexChangeListener() {
        return this.LLJ;
    }

    public final boolean LIZ(MotionEvent motionEvent) {
        if (Math.abs(motionEvent.getX() - this.LLILZ) > Math.abs(motionEvent.getY() - this.LLILZIL)) {
            return true;
        }
        return false;
    }

    public final void LIZLLL(boolean z) {
        int i;
        int i2;
        if (z) {
            C21652119oV c21652119oV = this.LLIZ;
            if (c21652119oV != null && !c21652119oV.LJIILIIL) {
                c21652119oV.LJIILIIL = true;
                AnimatorSet animatorSet = new AnimatorSet();
                View view = c21652119oV.LIZJ;
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "translationX", view.getTranslationX(), c21652119oV.LIZJ.getTranslationX() + c21652119oV.LJI);
                View view2 = c21652119oV.LIZJ;
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, "rotation", view2.getRotation(), 10.0f);
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.setDuration(50L);
                animatorSet2.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
                animatorSet2.addListener(new AAListenerS343S0100000_33(c21652119oV, 9));
                AnimatorSet.Builder builderPlay = animatorSet.play(animatorSet2);
                View view3 = c21652119oV.LIZJ;
                ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(view3, "scaleX", view3.getScaleX(), c21652119oV.LJ / c21652119oV.LIZJ.getWidth());
                View view4 = c21652119oV.LIZJ;
                ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(view4, "scaleY", view4.getScaleY(), c21652119oV.LJ / c21652119oV.LIZJ.getWidth());
                View view5 = c21652119oV.LIZJ;
                ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(view5, "translationX", view5.getTranslationX() + c21652119oV.LJI, (c21652119oV.LJIIIZ.getFirst().intValue() - c21652119oV.LIZJ.getLeft()) - ((c21652119oV.LIZJ.getWidth() - c21652119oV.LJIIL.getFirst().intValue()) / 2.0f));
                View view6 = c21652119oV.LIZJ;
                ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(view6, "translationY", view6.getTranslationY(), (c21652119oV.LJIIIZ.getSecond().intValue() - c21652119oV.LIZJ.getTop()) - ((c21652119oV.LIZJ.getHeight() - c21652119oV.LJIIL.getSecond().intValue()) / 2.0f));
                View view7 = c21652119oV.LIZLLL;
                ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(view7, "translationX", view7.getTranslationX(), (c21652119oV.LJII.getFirst().intValue() - c21652119oV.LIZLLL.getLeft()) - ((c21652119oV.LIZLLL.getWidth() - c21652119oV.LJIIJ.getFirst().intValue()) / 2.0f));
                View view8 = c21652119oV.LIZLLL;
                ObjectAnimator objectAnimatorOfFloat8 = ObjectAnimator.ofFloat(view8, "rotation", view8.getRotation(), -10.0f);
                View view9 = c21652119oV.LIZIZ;
                ObjectAnimator objectAnimatorOfFloat9 = ObjectAnimator.ofFloat(view9, "translationX", view9.getTranslationX(), (c21652119oV.LJIIIIZZ.getFirst().intValue() - c21652119oV.LIZIZ.getLeft()) - ((c21652119oV.LIZIZ.getWidth() - c21652119oV.LJIIJJI.getFirst().intValue()) / 2.0f));
                View view10 = c21652119oV.LIZIZ;
                ObjectAnimator objectAnimatorOfFloat10 = ObjectAnimator.ofFloat(view10, "translationY", view10.getTranslationY(), (c21652119oV.LJIIIIZZ.getSecond().intValue() - c21652119oV.LIZIZ.getTop()) - ((c21652119oV.LIZIZ.getHeight() - c21652119oV.LJIIJJI.getSecond().intValue()) / 2.0f));
                View view11 = c21652119oV.LIZIZ;
                ObjectAnimator objectAnimatorOfFloat11 = ObjectAnimator.ofFloat(view11, "rotation", view11.getRotation(), 0.0f);
                View view12 = c21652119oV.LIZIZ;
                ObjectAnimator objectAnimatorOfFloat12 = ObjectAnimator.ofFloat(view12, "scaleX", view12.getScaleX(), c21652119oV.LJFF / c21652119oV.LIZIZ.getWidth());
                View view13 = c21652119oV.LIZIZ;
                ObjectAnimator objectAnimatorOfFloat13 = ObjectAnimator.ofFloat(view13, "scaleY", view13.getScaleY(), c21652119oV.LJFF / c21652119oV.LIZIZ.getWidth());
                AnimatorSet animatorSet3 = new AnimatorSet();
                animatorSet3.setDuration(c21652119oV.LIZ);
                animatorSet3.playTogether(objectAnimatorOfFloat3, objectAnimatorOfFloat4, objectAnimatorOfFloat5, objectAnimatorOfFloat6, objectAnimatorOfFloat7, objectAnimatorOfFloat8, objectAnimatorOfFloat9, objectAnimatorOfFloat10, objectAnimatorOfFloat11, objectAnimatorOfFloat12, objectAnimatorOfFloat13);
                builderPlay.before(animatorSet3);
                animatorSet.addListener(new AAListenerS343S0100000_33(c21652119oV, 11));
                animatorSet.start();
            }
        } else {
            C21652119oV c21652119oV2 = this.LLIZ;
            if (c21652119oV2 != null && !c21652119oV2.LJIILIIL) {
                c21652119oV2.LJIILIIL = true;
                AnimatorSet animatorSet4 = new AnimatorSet();
                View view14 = c21652119oV2.LIZJ;
                ObjectAnimator objectAnimatorOfFloat14 = ObjectAnimator.ofFloat(view14, "translationX", view14.getTranslationX(), c21652119oV2.LIZJ.getTranslationX() - c21652119oV2.LJI);
                View view15 = c21652119oV2.LIZJ;
                ObjectAnimator objectAnimatorOfFloat15 = ObjectAnimator.ofFloat(view15, "rotation", view15.getRotation(), -10.0f);
                AnimatorSet animatorSet5 = new AnimatorSet();
                animatorSet5.setDuration(50L);
                animatorSet5.playTogether(objectAnimatorOfFloat14, objectAnimatorOfFloat15);
                animatorSet5.addListener(new AAListenerS343S0100000_33(c21652119oV2, 8));
                AnimatorSet.Builder builderPlay2 = animatorSet4.play(animatorSet5);
                View view16 = c21652119oV2.LIZJ;
                ObjectAnimator objectAnimatorOfFloat16 = ObjectAnimator.ofFloat(view16, "scaleX", view16.getScaleX(), c21652119oV2.LJ / c21652119oV2.LIZJ.getWidth());
                View view17 = c21652119oV2.LIZJ;
                ObjectAnimator objectAnimatorOfFloat17 = ObjectAnimator.ofFloat(view17, "scaleY", view17.getScaleY(), c21652119oV2.LJ / c21652119oV2.LIZJ.getWidth());
                View view18 = c21652119oV2.LIZJ;
                ObjectAnimator objectAnimatorOfFloat18 = ObjectAnimator.ofFloat(view18, "translationX", view18.getTranslationX() - c21652119oV2.LJI, (c21652119oV2.LJII.getFirst().intValue() - c21652119oV2.LIZJ.getLeft()) - ((c21652119oV2.LIZJ.getWidth() - c21652119oV2.LJIIJ.getFirst().intValue()) / 2.0f));
                View view19 = c21652119oV2.LIZJ;
                ObjectAnimator objectAnimatorOfFloat19 = ObjectAnimator.ofFloat(view19, "translationY", view19.getTranslationY(), (c21652119oV2.LJII.getSecond().intValue() - c21652119oV2.LIZJ.getTop()) - ((c21652119oV2.LIZJ.getHeight() - c21652119oV2.LJIIJ.getSecond().intValue()) / 2.0f));
                View view20 = c21652119oV2.LIZIZ;
                ObjectAnimator objectAnimatorOfFloat20 = ObjectAnimator.ofFloat(view20, "translationX", view20.getTranslationX(), (c21652119oV2.LJIIIZ.getFirst().intValue() - c21652119oV2.LIZIZ.getLeft()) - ((c21652119oV2.LIZIZ.getWidth() - c21652119oV2.LJIIL.getFirst().intValue()) / 2.0f));
                View view21 = c21652119oV2.LIZIZ;
                ObjectAnimator objectAnimatorOfFloat21 = ObjectAnimator.ofFloat(view21, "rotation", view21.getRotation(), 10.0f);
                View view22 = c21652119oV2.LIZLLL;
                ObjectAnimator objectAnimatorOfFloat22 = ObjectAnimator.ofFloat(view22, "translationX", view22.getTranslationX(), (c21652119oV2.LJIIIIZZ.getFirst().intValue() - c21652119oV2.LIZLLL.getLeft()) - ((c21652119oV2.LIZLLL.getWidth() - c21652119oV2.LJIIJJI.getFirst().intValue()) / 2.0f));
                View view23 = c21652119oV2.LIZLLL;
                ObjectAnimator objectAnimatorOfFloat23 = ObjectAnimator.ofFloat(view23, "translationY", view23.getTranslationY(), (c21652119oV2.LJIIIIZZ.getSecond().intValue() - c21652119oV2.LIZLLL.getTop()) - ((c21652119oV2.LIZLLL.getHeight() - c21652119oV2.LJIIJJI.getSecond().intValue()) / 2.0f));
                View view24 = c21652119oV2.LIZLLL;
                ObjectAnimator objectAnimatorOfFloat24 = ObjectAnimator.ofFloat(view24, "rotation", view24.getRotation(), 0.0f);
                View view25 = c21652119oV2.LIZLLL;
                ObjectAnimator objectAnimatorOfFloat25 = ObjectAnimator.ofFloat(view25, "scaleX", view25.getScaleX(), c21652119oV2.LJFF / c21652119oV2.LIZLLL.getWidth());
                View view26 = c21652119oV2.LIZLLL;
                ObjectAnimator objectAnimatorOfFloat26 = ObjectAnimator.ofFloat(view26, "scaleY", view26.getScaleY(), c21652119oV2.LJFF / c21652119oV2.LIZLLL.getWidth());
                AnimatorSet animatorSet6 = new AnimatorSet();
                animatorSet6.setDuration(c21652119oV2.LIZ);
                animatorSet6.playTogether(objectAnimatorOfFloat16, objectAnimatorOfFloat17, objectAnimatorOfFloat18, objectAnimatorOfFloat19, objectAnimatorOfFloat20, objectAnimatorOfFloat21, objectAnimatorOfFloat22, objectAnimatorOfFloat23, objectAnimatorOfFloat24, objectAnimatorOfFloat25, objectAnimatorOfFloat26);
                builderPlay2.before(animatorSet6);
                animatorSet4.addListener(new AAListenerS343S0100000_33(c21652119oV2, 10));
                animatorSet4.start();
            }
        }
        int i3 = this.LLIZLLLIL;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    this.LLIZLLLIL = z ? 1 : 0;
                }
            } else {
                if (z) {
                    i2 = 0;
                } else {
                    i2 = 2;
                }
                this.LLIZLLLIL = i2;
            }
        } else {
            if (z) {
                i = 2;
            } else {
                i = 1;
            }
            this.LLIZLLLIL = i;
        }
        Function2<? super Integer, ? super Integer, Unit> function2 = this.LLJ;
        if (function2 != null) {
            function2.invoke(Integer.valueOf(i3), Integer.valueOf(this.LLIZLLLIL));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean zDispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        int action = motionEvent.getAction();
        boolean z = true;
        if (action != 0) {
            if (action != 1) {
                if (action == 2 && ((motionEvent.getX() != this.LLILZ || motionEvent.getY() != this.LLILZIL) && !LIZ(motionEvent))) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                    C20441214yg.LIZIZ("PollingPhotosView", "cancel DisallowInterceptTouchEvent");
                    return zDispatchTouchEvent;
                }
            } else {
                getParent().requestDisallowInterceptTouchEvent(false);
                if (LIZ(motionEvent)) {
                    if (motionEvent.getX() <= this.LLILZ) {
                        z = false;
                    }
                    LIZLLL(z);
                    return zDispatchTouchEvent;
                }
            }
            return zDispatchTouchEvent;
        }
        this.LLILZ = motionEvent.getX();
        this.LLILZIL = motionEvent.getY();
        getParent().requestDisallowInterceptTouchEvent(true);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean zOnInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        if (motionEvent.getAction() == 2 && LIZ(motionEvent)) {
            return true;
        }
        return zOnInterceptTouchEvent;
    }

    public final void setImgLoadFailedCallback(Function1<? super String, Unit> function1) {
        this.LLJI = function1;
    }

    public final void setPhotos(List<String> list) {
        LIZJ(this.LLILLJJLI, (String) ListProtector.get(list, 0));
        LIZJ(this.LLILLL, (String) ListProtector.get(list, 1));
        LIZJ(this.LL, (String) ListProtector.get(list, 2));
    }

    public final void setShowIndexChangeListener(Function2<? super Integer, ? super Integer, Unit> function2) {
        this.LLJ = function2;
    }

    public C21652019oU(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setClipChildren(false);
        setClipToPadding(false);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.gu5, this, true);
        this.LL = findViewById(R.id.mkh);
        this.LLILLJJLI = findViewById(R.id.obj);
        this.LLILLL = findViewById(R.id.tlw);
    }

    public static void LIZIZ(View view, float f) {
        C786410Ut5.Ab(view, f);
        double dSin = (Math.sin(Math.abs(Math.toRadians(f))) * Math.sqrt((((double) view.getWidth()) * ((double) view.getWidth())) + (((double) view.getHeight()) * ((double) view.getHeight())))) / ((double) 2);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (f > 0.0f) {
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).setMarginEnd(Math.abs((int) dSin));
        } else {
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).setMarginStart(Math.abs((int) dSin));
        }
        C786410Ut5.W5(view, layoutParams);
    }

    public final void LIZJ(View view, String str) {
        C1324610kZf c1324610kZfLIZLLL = C1819620xS4.LIZ().LIZLLL(new InterfaceC1142670fqD() { // from class: X.19oW
            @Override // X.InterfaceC1142670fqD
            public final void LIZ() {
            }

            @Override // X.InterfaceC1142670fqD
            public final void LIZIZ(Animatable animatable) {
            }

            @Override // X.InterfaceC1142670fqD
            public final void LIZJ(int i, int i2, String str2) {
            }

            @Override // X.InterfaceC1142670fqD
            public final void LIZLLL(String str2, Exception exc) {
                Function1<String, Unit> imgLoadFailedCallback = this.LIZ.getImgLoadFailedCallback();
                if (imgLoadFailedCallback != null) {
                    imgLoadFailedCallback.invoke(str2);
                }
            }
        });
        c1324610kZfLIZLLL.setUrl(str);
        c1324610kZfLIZLLL.LJJI(view);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!this.LLILZLL) {
            this.LLILZLL = true;
            LIZIZ(this.LLILLL, 10.0f);
            LIZIZ(this.LL, -10.0f);
            HandlerHook.viewPost(this.LL, new ARunnableS133S0100000_33(this, 23));
        }
    }
}
