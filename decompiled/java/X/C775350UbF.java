package X;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: renamed from: X.0UbF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C775350UbF extends ConstraintLayout {
    public static final int LLJJ = C439101nJ.LIZ(100);
    public static final int LLJJI = C439101nJ.LIZ(80);
    public float LL;
    public float LLILLJJLI;
    public float LLILLL;
    public float LLILZ;
    public float LLILZIL;
    public float LLILZLL;
    public float LLIZ;
    public final int LLIZLLLIL;
    public boolean LLJ;
    public ObjectAnimator LLJI;
    public final Interpolator LLJIJIL;
    public InterfaceC775360UbG LLJILJIL;
    public boolean LLJILJILJ;
    public final C01GW LLJILLL;

    private final int getExpandWidth() {
        InterfaceC775360UbG interfaceC775360UbG = this.LLJILJIL;
        if (interfaceC775360UbG != null) {
            Integer numValueOf = Integer.valueOf(interfaceC775360UbG.getExpandWidth());
            if (numValueOf.intValue() > 0) {
                return numValueOf.intValue();
            }
        }
        return getMeasuredWidth();
    }

    private final int getHeightPaddingValue() {
        return ((Number) this.LLJILLL.getValue()).intValue();
    }

    public final void e0() {
        View view;
        C19ME c19me;
        View view2;
        C19ME c19me2;
        C19ME c19me3 = null;
        if (getX() + ((float) (getWidth() / 2)) <= ((float) (C497740JfY.LJIIZILJ() / 2))) {
            Object obj = this.LLJILJIL;
            if ((obj instanceof View) && (view2 = (View) obj) != null) {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if ((layoutParams instanceof C19ME) && (c19me2 = (C19ME) layoutParams) != null) {
                    c19me2.startToStart = C497740JfY.LJJ() ? -1 : 0;
                    c19me2.endToEnd = C497740JfY.LJJ() ? 0 : -1;
                    c19me3 = c19me2;
                }
                C786410Ut5.W5(view2, c19me3);
            }
            InterfaceC775360UbG interfaceC775360UbG = this.LLJILJIL;
            if (interfaceC775360UbG != null) {
                interfaceC775360UbG.LIZIZ(0);
            }
            Property property = ViewGroup.TRANSLATION_X;
            float[] fArr = new float[2];
            fArr[0] = getTranslationX();
            fArr[1] = C497740JfY.LJJ() ? getExpandWidth() - C497740JfY.LJIIZILJ() : 0.0f;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<C775350UbF, Float>) property, fArr);
            objectAnimatorOfFloat.setDuration(200L);
            objectAnimatorOfFloat.setInterpolator(this.LLJIJIL);
            this.LLJI = objectAnimatorOfFloat;
        } else {
            Object obj2 = this.LLJILJIL;
            if ((obj2 instanceof View) && (view = (View) obj2) != null) {
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                if ((layoutParams2 instanceof C19ME) && (c19me = (C19ME) layoutParams2) != null) {
                    c19me.startToStart = C497740JfY.LJJ() ? 0 : -1;
                    c19me.endToEnd = C497740JfY.LJJ() ? -1 : 0;
                    c19me3 = c19me;
                }
                C786410Ut5.W5(view, c19me3);
            }
            InterfaceC775360UbG interfaceC775360UbG2 = this.LLJILJIL;
            if (interfaceC775360UbG2 != null) {
                interfaceC775360UbG2.LIZIZ(1);
            }
            Property property2 = ViewGroup.TRANSLATION_X;
            float[] fArr2 = new float[2];
            fArr2[0] = getTranslationX();
            fArr2[1] = C497740JfY.LJJ() ? 0.0f : C497740JfY.LJIIZILJ() - getExpandWidth();
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, (Property<C775350UbF, Float>) property2, fArr2);
            objectAnimatorOfFloat2.setDuration(200L);
            objectAnimatorOfFloat2.setInterpolator(this.LLJIJIL);
            this.LLJI = objectAnimatorOfFloat2;
        }
        ObjectAnimator objectAnimator = this.LLJI;
        if (objectAnimator != null) {
            C786410Ut5.Pd(objectAnimator);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int iLJIILLIIL;
        View view;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action == 3) {
                        C20441214yg.LIZIZ("RecordDragContainer", "ACTION_CANCEL");
                        if (this.LLJ) {
                            this.LLJ = false;
                            e0();
                            InterfaceC775360UbG interfaceC775360UbG = this.LLJILJIL;
                            if (interfaceC775360UbG != null) {
                                interfaceC775360UbG.LIZJ();
                            }
                            this.LLJILJILJ = true;
                            return true;
                        }
                        requestDisallowInterceptTouchEvent(false);
                    }
                } else {
                    C20441214yg.LIZIZ("RecordDragContainer", "ACTION_MOVE");
                    this.LLIZ = Math.abs(motionEvent.getRawX() - this.LLILLL);
                    float fAbs = Math.abs(motionEvent.getRawY() - this.LLILZ);
                    float f = this.LLIZ;
                    float f2 = this.LLIZLLLIL;
                    if (f > f2 || fAbs > f2) {
                        this.LLJ = true;
                        this.LLILZIL = motionEvent.getRawX() - this.LL;
                        this.LLILZLL = motionEvent.getRawY() - this.LLILLJJLI;
                        if (getX() + this.LLILZIL >= 0.0f && getX() + this.LLILZIL + getExpandWidth() <= C497740JfY.LJIIZILJ()) {
                            this.LL = motionEvent.getRawX();
                            float x = getX() + this.LLILZIL;
                            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
                            setX(x);
                        }
                        if (getY() + this.LLILZLL >= C497740JfY.LJIJ() - getHeightPaddingValue()) {
                            float y = ((getY() + this.LLILZLL) + getMeasuredHeight()) - getHeightPaddingValue();
                            Object parent = getParent();
                            if ((parent instanceof ViewGroup) && (view = (View) parent) != null) {
                                iLJIILLIIL = view.getMeasuredHeight();
                            } else {
                                iLJIILLIIL = C497740JfY.LJIILLIIL();
                            }
                            if (y <= iLJIILLIIL) {
                                this.LLILLJJLI = motionEvent.getRawY();
                                float y2 = getY() + this.LLILZLL;
                                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
                                setY(y2);
                            }
                        }
                        if (this.LLJILJILJ) {
                            InterfaceC775360UbG interfaceC775360UbG2 = this.LLJILJIL;
                            if (interfaceC775360UbG2 != null) {
                                interfaceC775360UbG2.LJJJJ();
                            }
                            this.LLJILJILJ = false;
                        }
                    }
                    if (this.LLJ) {
                        return true;
                    }
                }
            } else {
                C20441214yg.LIZIZ("RecordDragContainer", "ACTION_UP");
                if (this.LLJ) {
                    this.LLJ = false;
                    e0();
                    InterfaceC775360UbG interfaceC775360UbG3 = this.LLJILJIL;
                    if (interfaceC775360UbG3 != null) {
                        interfaceC775360UbG3.LIZLLL();
                    }
                    this.LLJILJILJ = true;
                    return true;
                }
                requestDisallowInterceptTouchEvent(false);
            }
        } else {
            C20441214yg.LIZIZ("RecordDragContainer", "ACTION_DOWN");
            getTranslationX();
            getTranslationY();
            this.LL = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            this.LLILLJJLI = rawY;
            this.LLILLL = this.LL;
            this.LLILZ = rawY;
            requestDisallowInterceptTouchEvent(true);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Boolean boolValueOf;
        ObjectAnimator objectAnimator;
        InterfaceC775360UbG interfaceC775360UbG = this.LLJILJIL;
        if (interfaceC775360UbG != null) {
            boolValueOf = Boolean.valueOf(interfaceC775360UbG.LIZ());
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJJI(boolValueOf) && (objectAnimator = this.LLJI) != null && !objectAnimator.isRunning()) {
            return true;
        }
        if (motionEvent != null && motionEvent.getAction() == 0) {
            return true;
        }
        return false;
    }

    public final void setDragView(InterfaceC775360UbG interfaceC775360UbG) {
        this.LLJILJIL = interfaceC775360UbG;
    }

    public C775350UbF(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLJIJIL = C0GY9.LIZIZ(0.32f, 0.94f, 0.6f, 1.0f);
        this.LLJILJILJ = true;
        this.LLJILLL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 957));
        setMinWidth(LLJJ);
        setMinHeight(LLJJI);
        this.LLIZLLLIL = ViewConfiguration.get(context).getScaledTouchSlop();
    }
}
