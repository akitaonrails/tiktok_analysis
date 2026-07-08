package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import u4.q0;

/* JADX INFO: renamed from: X.18qq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C21411818qq extends C21411718qp implements C0HZT {
    public final int LLLIIL;
    public final int LLLIILIL;
    public final int LLLIL;
    public C1856690yPr LLLILZ;
    public final String LLLILZJ;
    public final int LLLILZLLLI;
    public int LLLIZZ;
    public final boolean LLLJ;
    public Function0<Boolean> LLLJIL;
    public Function0<Unit> LLLJL;
    public AbstractC415360GQk LLLL;
    public int LLLLII;
    public final Rect LLLLIIIILLL;
    public final Rect LLLLIIL;
    public boolean LLLLIILL;
    public boolean LLLLIILLL;
    public CharSequence LLLLIL;

    public C21411818qq(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    @Override // X.C21411718qp, android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        if (this.LLLLIILLL) {
            return;
        }
        Function0<Boolean> function0 = this.LLLJIL;
        if (function0 == null || !function0.invoke().booleanValue()) {
            super.toggle();
        }
    }

    public final CharSequence getAccessibilityLabel() {
        return this.LLLLIL;
    }

    public final boolean getEnableTouch$tux_theme_release() {
        return this.LLLLIILL;
    }

    public final void LJI(int i) {
        int[] state;
        Drawable trackDrawable = getTrackDrawable();
        AbstractC415360GQk abstractC415360GQk = null;
        if (trackDrawable != null) {
            state = trackDrawable.getState();
        } else {
            state = null;
        }
        if (i != 0) {
            if (i == 1) {
                AbstractC415360GQk abstractC415360GQk2 = new AbstractC415360GQk() { // from class: X.0GHw
                    @Override // android.graphics.drawable.Drawable
                    public final int getIntrinsicHeight() {
                        return 22;
                    }

                    @Override // android.graphics.drawable.Drawable
                    public final int getIntrinsicWidth() {
                        return 38;
                    }

                    {
                        this.LIZJ.LJIIIZ(0.0f, 11.0f);
                        this.LIZJ.LJFF(0.0f, 4.92486f, 4.92486f, 0.0f, 11.0f, 0.0f);
                        this.LIZJ.LJII(27.0f);
                        this.LIZJ.LJFF(33.075f, 0.0f, 38.0f, 4.92486f, 38.0f, 11.0f);
                        this.LIZJ.LJIJI(11.0f);
                        this.LIZJ.LJFF(38.0f, 17.075f, 33.075f, 22.0f, 27.0f, 22.0f);
                        this.LIZJ.LJII(11.0f);
                        this.LIZJ.LJFF(4.92486f, 22.0f, 0.0f, 17.075f, 0.0f, 11.0f);
                        this.LIZJ.LJIJI(11.0f);
                        this.LIZJ.LJ();
                        this.LIZJ.LJIJ(Path.FillType.WINDING);
                        this.LIZIZ.setStyle(Paint.Style.FILL);
                        this.LIZIZ.setColor(-1);
                    }
                };
                if (state != null) {
                    abstractC415360GQk2.setState(state);
                }
                this.LLLL = abstractC415360GQk2;
                setThumbDrawable(C14MI.LIZ(getContext(), R.drawable.fg1));
                setSwitchMinWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(38)));
                this.LLLLII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1));
            }
        } else {
            AbstractC415360GQk abstractC415360GQk3 = new AbstractC415360GQk() { // from class: X.0GHv
                @Override // android.graphics.drawable.Drawable
                public final int getIntrinsicHeight() {
                    return 28;
                }

                @Override // android.graphics.drawable.Drawable
                public final int getIntrinsicWidth() {
                    return 48;
                }

                {
                    this.LIZJ.LJIIIZ(0.0f, 14.0f);
                    this.LIZJ.LJFF(0.0f, 6.26801f, 6.26801f, 0.0f, 14.0f, 0.0f);
                    this.LIZJ.LJII(34.0f);
                    this.LIZJ.LJFF(41.732f, 0.0f, 48.0f, 6.26801f, 48.0f, 14.0f);
                    this.LIZJ.LJIJI(14.0f);
                    this.LIZJ.LJFF(48.0f, 21.732f, 41.732f, 28.0f, 34.0f, 28.0f);
                    this.LIZJ.LJII(14.0f);
                    this.LIZJ.LJFF(6.26802f, 28.0f, 0.0f, 21.732f, 0.0f, 14.0f);
                    this.LIZJ.LJIJI(14.0f);
                    this.LIZJ.LJ();
                    this.LIZJ.LJIJ(Path.FillType.WINDING);
                    this.LIZIZ.setStyle(Paint.Style.FILL);
                    this.LIZIZ.setColor(-1);
                }
            };
            if (state != null) {
                abstractC415360GQk3.setState(state);
            }
            this.LLLL = abstractC415360GQk3;
            setThumbDrawable(C14MI.LIZ(getContext(), R.drawable.fg0));
            setSwitchMinWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48)));
            this.LLLLII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
        }
        AbstractC415360GQk abstractC415360GQk4 = this.LLLL;
        if (abstractC415360GQk4 != null) {
            abstractC415360GQk = abstractC415360GQk4;
        }
        setTrackDrawable(abstractC415360GQk);
    }

    @Override // X.C21411718qp, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        C1856690yPr c1856690yPr;
        super.onDraw(canvas);
        if (this.LLLLIILLL && (c1856690yPr = this.LLLILZ) != null) {
            this.LLLLIIL.set(getThumbDrawable().getBounds());
            if (!Intrinsics.LJFF(this.LLLLIIL, this.LLLLIIIILLL)) {
                this.LLLLIIIILLL.set(getThumbDrawable().getBounds());
                Rect rect = this.LLLLIIL;
                int i = this.LLLLII;
                rect.inset(i, i);
                C1856690yPr c1856690yPr2 = this.LLLILZ;
                if (c1856690yPr2 != null) {
                    c1856690yPr2.setBounds(this.LLLLIIL);
                }
            }
            c1856690yPr.draw(canvas);
        }
    }

    @Override // X.C21411718qp, android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Integer numValueOf;
        Function0<Unit> function0;
        if (!this.LLLLIILL) {
            if (this.LLLJL != null && !isEnabled()) {
                if (motionEvent != null && motionEvent.getAction() == 1 && (function0 = this.LLLJL) != null) {
                    function0.invoke();
                }
                return true;
            }
            if (isEnabled() && motionEvent != null && (numValueOf = Integer.valueOf(motionEvent.getAction())) != null) {
                if (numValueOf.intValue() == 0) {
                    setPressed(true);
                } else if (numValueOf.intValue() == 1) {
                    setPressed(false);
                }
            }
            return !isEnabled();
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setAccessibilityLabel(CharSequence charSequence) {
        this.LLLLIL = charSequence;
        setContentDescription(charSequence);
    }

    @Override // X.C21411718qp, android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        CharSequence textOff;
        super.setChecked(z);
        if (isChecked()) {
            textOff = getTextOn();
        } else {
            textOff = getTextOff();
        }
        q0.LJJIFFI(this, textOff);
    }

    public final void setDisableListener$tux_theme_release(Function0<Unit> function0) {
        this.LLLJL = function0;
    }

    public final void setEnableTouch$tux_theme_release(boolean z) {
        this.LLLLIILL = z;
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z) {
        float f;
        super.setEnabled(z);
        if (this.LLLJ) {
            if (isEnabled()) {
                f = 1.0f;
            } else {
                f = 0.34f;
            }
            C786410Ut5.z5(this, f);
        }
    }

    @Override // X.C0HZT
    public void setInterceptToggleListener(Function0<Boolean> function0) {
        this.LLLJIL = function0;
    }

    public final void setLoading(boolean z) {
        CharSequence textOff;
        if (z != this.LLLLIILLL) {
            this.LLLLIILLL = z;
            if (z) {
                if (this.LLLILZ == null) {
                    this.LLLILZ = new C1856690yPr(getContext(), this.LLLILZLLLI);
                }
                this.LLLLIIIILLL.set(0, 0, 0, 0);
                C1856690yPr c1856690yPr = this.LLLILZ;
                if (c1856690yPr != null) {
                    c1856690yPr.LJFF(this.LLLIL);
                }
                C1856690yPr c1856690yPr2 = this.LLLILZ;
                if (c1856690yPr2 != null) {
                    c1856690yPr2.setCallback(new Drawable.Callback() { // from class: X.18fw
                        @Override // android.graphics.drawable.Drawable.Callback
                        public final void invalidateDrawable(Drawable drawable) {
                            this.LL.invalidate();
                        }

                        @Override // android.graphics.drawable.Drawable.Callback
                        public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
                            this.LL.unscheduleDrawable(drawable, runnable);
                        }

                        @Override // android.graphics.drawable.Drawable.Callback
                        public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
                            this.LL.scheduleDrawable(drawable, runnable, j);
                        }
                    });
                }
                C1856690yPr c1856690yPr3 = this.LLLILZ;
                if (c1856690yPr3 != null) {
                    c1856690yPr3.LJIIIZ();
                }
                invalidate();
                q0.LJJIFFI(this, this.LLLILZJ);
                return;
            }
            C1856690yPr c1856690yPr4 = this.LLLILZ;
            if (c1856690yPr4 != null) {
                c1856690yPr4.LJIIJ();
            }
            C1856690yPr c1856690yPr5 = this.LLLILZ;
            if (c1856690yPr5 != null) {
                c1856690yPr5.setBounds(0, 0, 0, 0);
            }
            C1856690yPr c1856690yPr6 = this.LLLILZ;
            if (c1856690yPr6 != null) {
                c1856690yPr6.setCallback(null);
            }
            invalidate();
            if (isChecked()) {
                textOff = getTextOn();
            } else {
                textOff = getTextOff();
            }
            q0.LJJIFFI(this, textOff);
            this.LLLLIIL.set(0, 0, 0, 0);
        }
    }

    public final void setSizeVariant(int i) {
        this.LLLIZZ = i;
        LJI(i);
        LJFF(this.LLLIIL, this.LLLIILIL);
        C1856690yPr c1856690yPr = this.LLLILZ;
        if (c1856690yPr != null) {
            c1856690yPr.setBounds(0, 0, 0, 0);
        }
        invalidate();
    }

    public final void LJFF(int i, int i2) {
        int iLJIIJ;
        int iLJIIJ2;
        AbstractC415360GQk abstractC415360GQk = this.LLLL;
        if (abstractC415360GQk == null) {
            abstractC415360GQk = null;
        }
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.o_, getContext());
        if (numLIZJ != null) {
            iLJIIJ = C2441009hQ.LJIIJ(numLIZJ.intValue(), i);
        } else {
            iLJIIJ = i;
        }
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.o_, getContext());
        if (numLIZJ2 != null) {
            iLJIIJ2 = C2441009hQ.LJIIJ(numLIZJ2.intValue(), i2);
        } else {
            iLJIIJ2 = i2;
        }
        abstractC415360GQk.LJ = new ColorStateList(new int[][]{new int[]{android.R.attr.state_pressed, android.R.attr.state_checked}, new int[]{android.R.attr.state_pressed, -16842912}, new int[]{android.R.attr.state_checked}, new int[0]}, new int[]{iLJIIJ, iLJIIJ2, i, i2});
    }

    @Override // X.C21411718qp, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        AbstractC415360GQk abstractC415360GQk = this.LLLL;
        if (abstractC415360GQk == null) {
            abstractC415360GQk = null;
        }
        abstractC415360GQk.LJFF.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C21411818qq(Context context, AttributeSet attributeSet, int i) {
        int i2;
        float f;
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        if ((i & 4) != 0) {
            i2 = R.attr.yv;
        } else {
            i2 = 0;
        }
        super(context, attributeSet, i2);
        this.LLLLIIIILLL = new Rect();
        this.LLLLIIL = new Rect();
        this.LLLLIILL = true;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TuxSwitch, i2, 0);
        this.LLLIZZ = typedArrayObtainStyledAttributes.getInt(R$styleable.TuxSwitch_tux_switchSize, 0);
        int color = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxSwitch_tux_checkedTrackColor, 0);
        this.LLLIIL = color;
        int color2 = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxSwitch_tux_uncheckedTrackColor, 0);
        this.LLLIILIL = color2;
        this.LLLIL = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxSwitch_tux_loadingIconColor, 0);
        this.LLLILZLLLI = typedArrayObtainStyledAttributes.getResourceId(R$styleable.TuxSwitch_tux_loadingIcon, 0);
        String strXd = C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.TuxSwitch_tux_loadingState);
        this.LLLILZJ = strXd == null ? "" : strXd;
        typedArrayObtainStyledAttributes.recycle();
        this.LLLJ = true;
        LJI(this.LLLIZZ);
        if (isEnabled()) {
            f = 1.0f;
        } else {
            f = 0.34f;
        }
        C786410Ut5.z5(this, f);
        LJFF(color, color2);
        setBackgroundColor(0);
    }
}
