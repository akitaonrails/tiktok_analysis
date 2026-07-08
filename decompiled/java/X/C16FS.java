package X;

import Y.AUListenerS278S0100000_31;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.16FS, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public class C16FS extends C21538419Qw implements InterfaceC1834170xpX {
    public static final /* synthetic */ int LLJZ = 0;
    public C16F5 LLILZIL;
    public int LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;
    public int LLJ;
    public CharSequence LLJI;
    public Drawable LLJIJIL;
    public Drawable LLJILJIL;
    public ColorStateList LLJILJILJ;
    public final TextView.BufferType LLJILLL;
    public int LLJJ;
    public TextPaint LLJJI;
    public ValueAnimator LLJJIII;
    public boolean LLJJIJI;
    public Paint LLJJIJIIJIL;
    public int LLJJIJIL;
    public boolean LLJJJ;
    public Drawable LLJJJIL;
    public LiveIconView LLJJJJ;
    public boolean LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public int LLJJL;
    public C20743916Fh LLJJLIIIJLLLLLLLZ;
    public int LLJL;
    public int LLJLIL;
    public int LLJLILLLLZIIL;
    public int LLJLL;
    public int LLJLLIL;
    public boolean LLJLLL;

    public C16FS() {
        throw null;
    }

    private int getIconExtra() {
        if (this.LLJILJIL == null) {
            return 0;
        }
        return this.LLILZLL + this.LLJJ;
    }

    public final void LJ() {
        if (this.LLJJIJI) {
            return;
        }
        this.LLJL = this.LLJJJJ.getVisibility();
        this.LLJLIL = this.LLILZIL.getVisibility();
        if (this.LLJJJJ.getVisibility() == 0) {
            C786410Ut5.LLJJIJIL(this.LLJJJJ, 4);
        }
        if (this.LLILZIL.getVisibility() == 0) {
            C786410Ut5.LLJJJJ(this.LLILZIL, 4);
        }
        this.LLJJIJI = true;
        this.LLJJIII.start();
    }

    public final void LJIIL() {
        if (this.LLJJIJI) {
            C786410Ut5.LLJJIJIL(this.LLJJJJ, this.LLJL);
            C786410Ut5.LLJJJJ(this.LLILZIL, this.LLJLIL);
            this.LLJJIJI = false;
            this.LLJJIII.cancel();
            invalidate();
        }
    }

    public final void l0() {
        this.LLILZIL.setText(this.LLJI, this.LLJILLL);
        int i = TextUtils.isEmpty(this.LLJI) ? 8 : 0;
        if (this.LLJJIJI) {
            if (i == 8) {
                C786410Ut5.LLJJJJ(this.LLILZIL, 8);
            }
            this.LLJLIL = i;
        } else {
            C786410Ut5.LLJJJJ(this.LLILZIL, i);
        }
        requestLayout();
    }

    public final void n0() {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.LLILZIL.getLayoutParams();
        int maxWidth = ((((getMaxWidth() - getPaddingLeft()) - getPaddingRight()) - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin) - (this.LLJILJIL == null ? 0 : this.LLILZLL + this.LLJJ);
        this.LLJJL = maxWidth;
        this.LLILZIL.setMaxWidth(maxWidth);
    }

    @Override // X.C19XS, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.LLJJJIL;
        if (drawable != null) {
            drawable.setState(getDrawableState());
            this.LLJJJIL.invalidateSelf();
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LLJJIII.cancel();
    }

    public CharSequence getText() {
        return this.LLJI;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z = this.LLJJIJI;
        super.dispatchDraw(canvas);
        if (this.LLJJIJI && this.LLJJJIL != null) {
            getPaddingEnd();
            canvas.save();
            canvas.translate(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
            canvas.rotate(((Float) this.LLJJIII.getAnimatedValue()).floatValue());
            this.LLJJJIL.draw(canvas);
            canvas.restore();
        }
    }

    @Override // X.C21538419Qw, android.view.View
    public final void draw(Canvas canvas) {
        C20743916Fh c20743916Fh = this.LLJJLIIIJLLLLLLLZ;
        if (c20743916Fh == null) {
            super.draw(canvas);
            return;
        }
        boolean zLJFF = c20743916Fh.LLILLJJLI.LJFF(canvas);
        super.draw(canvas);
        this.LLJJLIIIJLLLLLLLZ.LLILLJJLI.getClass();
        if (!zLJFF) {
            return;
        }
        canvas.restore();
    }

    public final void i0(TypedArray typedArray) {
        ColorStateList colorStateList;
        int resourceId;
        ColorStateList colorStateList2;
        setMaxWidth(Integer.MAX_VALUE);
        int indexCount = typedArray.getIndexCount();
        int i = 0;
        while (true) {
            colorStateList = null;
            if (i >= indexCount) {
                break;
            }
            int index = typedArray.getIndex(i);
            int i2 = R$styleable.LiveButton_android_background;
            if (index == i2) {
                Drawable drawable = typedArray.getDrawable(i2);
                if (drawable != null) {
                    setBackground(drawable);
                }
            } else if (index == R$styleable.LiveButton_android_paddingLeft) {
                setPadding(typedArray.getDimensionPixelSize(index, 0), getPaddingTop(), getPaddingRight(), getPaddingBottom());
                n0();
            } else if (index == R$styleable.LiveButton_android_paddingRight) {
                setPadding(getPaddingLeft(), getPaddingTop(), typedArray.getDimensionPixelSize(index, 0), getPaddingBottom());
                n0();
            } else if (index == R$styleable.LiveButton_android_textAppearance) {
                int resourceId2 = typedArray.getResourceId(index, 0);
                if (resourceId2 != 0) {
                    this.LLILZIL.setTextAppearance(resourceId2);
                }
            } else if (index == R$styleable.LiveButton_android_text) {
                setText(C786410Ut5.Yd(typedArray, index));
            } else if (index == R$styleable.LiveButton_android_textColor) {
                ColorStateList colorStateListLIZ = C16F8.LIZ(getContext(), typedArray, index);
                if (colorStateListLIZ != null) {
                    this.LLILZIL.setTextColor(colorStateListLIZ);
                }
            } else if (index == R$styleable.LiveButton_android_enabled) {
                setEnabled(typedArray.getBoolean(index, isEnabled()));
            } else if (index == R$styleable.LiveButton_icon) {
                int iLJFF = C20736316Cj.LJFF(getContext(), typedArray, index);
                if (iLJFF != -1) {
                    setIcon(iLJFF);
                } else {
                    setIcon((Drawable) null);
                }
            } else if (index == R$styleable.LiveButton_iconTint) {
                ColorStateList colorStateListLIZ2 = C16F8.LIZ(getContext(), typedArray, index);
                this.LLJILJILJ = colorStateListLIZ2;
                if (colorStateListLIZ2 != null) {
                    this.LLJJJJ.setIconTintList(colorStateListLIZ2);
                    Drawable drawable2 = this.LLJJJIL;
                    if (drawable2 != null) {
                        C16GF.LJII(drawable2, this.LLJILJILJ);
                    }
                }
            } else if (index == R$styleable.LiveButton_iconSize) {
                setIconSize(typedArray.getDimensionPixelSize(index, 0));
            } else if (index == R$styleable.LiveButton_android_minHeight) {
                int dimensionPixelSize = typedArray.getDimensionPixelSize(index, 0);
                this.LLJLLIL = dimensionPixelSize;
                setMinHeight(dimensionPixelSize);
            } else if (index == R$styleable.LiveButton_android_minWidth) {
                int dimensionPixelSize2 = typedArray.getDimensionPixelSize(index, 0);
                this.LLJLL = dimensionPixelSize2;
                setMinWidth(dimensionPixelSize2);
            } else if (index == R$styleable.LiveButton_android_maxWidth) {
                setMaxWidth(typedArray.getDimensionPixelSize(index, Integer.MAX_VALUE));
            } else {
                int i3 = R$styleable.LiveButton_autoSizeMinTextSize;
                if (index == i3) {
                    this.LLIZ = typedArray.getDimensionPixelSize(i3, 0);
                } else {
                    int i4 = R$styleable.LiveButton_autoSizeMaxTextSize;
                    if (index == i4) {
                        this.LLIZLLLIL = typedArray.getDimensionPixelSize(i4, 0);
                    } else {
                        int i5 = R$styleable.LiveButton_autoSizeStepGranularity;
                        if (index == i5) {
                            this.LLJ = typedArray.getDimensionPixelSize(i5, 0);
                        } else {
                            int i6 = R$styleable.LiveButton_loadingIconSize;
                            if (index == i6) {
                                int dimensionPixelSize3 = typedArray.getDimensionPixelSize(i6, 0);
                                this.LLJJIJIL = dimensionPixelSize3;
                                int i7 = (-dimensionPixelSize3) / 2;
                                int i8 = dimensionPixelSize3 / 2;
                                this.LLJJJIL.setBounds(i7, i7, i8, i8);
                            } else {
                                int i9 = R$styleable.LiveButton_iconAutoMirrored;
                                if (index == i9) {
                                    setIconAutoMirrored(typedArray.getBoolean(i9, this.LLJJJJLIIL));
                                }
                            }
                        }
                    }
                }
            }
            i++;
        }
        if (typedArray.hasValue(R$styleable.LiveButton_applyRoundStyle) && typedArray.getBoolean(R$styleable.LiveButton_applyRoundStyle, false) && (resourceId = typedArray.getResourceId(R$styleable.LiveButton_roundAppearance, 0)) != 0) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(resourceId, R$styleable.RoundAppearance);
            if (typedArrayObtainStyledAttributes.hasValue(R$styleable.RoundAppearance_backgroundTint)) {
                int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(R$styleable.RoundAppearance_backgroundTint, 0);
                if (resourceId3 == 0 || (colorStateList2 = C838410Wul.LIZIZ(resourceId3, getContext())) == null) {
                    colorStateList2 = typedArrayObtainStyledAttributes.getColorStateList(R$styleable.RoundAppearance_backgroundTint);
                }
                C14K9.LJIILLIIL(this, colorStateList2);
            } else {
                C14K9.LJIILLIIL(this, null);
            }
            int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(R$styleable.RoundAppearance_strokeColor, 0);
            if (resourceId4 != 0) {
                colorStateList = C838410Wul.LIZIZ(resourceId4, getContext());
            } else if (typedArrayObtainStyledAttributes.hasValue(R$styleable.RoundAppearance_strokeColor)) {
                colorStateList = typedArrayObtainStyledAttributes.getColorStateList(R$styleable.RoundAppearance_strokeColor);
            }
            setStrokeColor(colorStateList);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public final void j0(int i) {
        if (this.LLJLILLLLZIIL != i) {
            this.LLJLILLLLZIIL = i;
            this.LLILLL.LJI(i);
            this.LLILZ.LJI(i);
            C20743916Fh c20743916Fh = this.LLJJLIIIJLLLLLLLZ;
            if (c20743916Fh != null) {
                c20743916Fh.LJI(i);
            }
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(i, R$styleable.LiveButton);
            i0(typedArrayObtainStyledAttributes);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.LLJLLL && !isEnabled() && isClickable() && motionEvent != null && motionEvent.getAction() == 1 && motionEvent.getX() <= getWidth() && motionEvent.getY() <= getHeight()) {
            performClick();
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // X.InterfaceC1834160xpW
    public void setAllowClickWhenDisabledCompat(boolean z) {
        this.LLJLLL = z;
    }

    public void setIcon(Drawable drawable) {
        int i;
        if (drawable instanceof C20743516Fd) {
            drawable = ((C16GB) drawable).LL;
        }
        if (this.LLJIJIL != drawable) {
            this.LLJIJIL = drawable;
            if (drawable != null) {
                this.LLJILJIL = drawable;
                this.LLJJJJ.setIcon(drawable);
                this.LLJJJJ.setIconTintList(this.LLJILJILJ);
                this.LLJJJJ.setIconAutoMirrored(this.LLJJJJLIIL);
                i = 0;
            } else {
                this.LLJILJIL = null;
                this.LLJJJJ.setIcon((Drawable) null);
                i = 8;
            }
            if (this.LLJJIJI) {
                if (i == 8) {
                    C786410Ut5.LLJJIJIL(this.LLJJJJ, 8);
                }
                this.LLJL = i;
            } else {
                C786410Ut5.LLJJIJIL(this.LLJJJJ, i);
            }
            n0();
            requestLayout();
        }
    }

    public void setIconAttr(int i) {
        setIcon(C20736316Cj.LJ(i, getContext()));
    }

    public void setIconAutoMirrored(boolean z) {
        if (this.LLJJJJLIIL != z) {
            this.LLJJJJLIIL = z;
            this.LLJJJJ.setIconAutoMirrored(z);
        }
    }

    public void setIconSize(int i) {
        if (i != this.LLILZLL) {
            this.LLILZLL = i;
            ViewGroup.LayoutParams layoutParams = this.LLJJJJ.getLayoutParams();
            layoutParams.width = i;
            layoutParams.height = i;
            C786410Ut5.w6(this.LLJJJJ, layoutParams);
            n0();
            requestLayout();
        }
    }

    @Override // X.C1091790eW9, android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        int i;
        super.setLayoutParams(layoutParams);
        if (layoutParams != null && (i = layoutParams.width) != -2 && i != -1) {
            super.setMinWidth(0);
        } else {
            super.setMinWidth(this.LLJLL);
            if (layoutParams != null) {
            }
            super.setMinHeight(this.LLJLLIL);
        }
        int i2 = layoutParams.height;
        if (i2 != -2 && i2 != -1) {
            super.setMinHeight(0);
            return;
        }
        super.setMinHeight(this.LLJLLIL);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        n0();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void setMinHeight(int i) {
        int i2;
        this.LLJLLIL = i;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null && (i2 = layoutParams.height) != -2 && i2 != -1) {
            super.setMinHeight(0);
        } else {
            super.setMinHeight(this.LLJLLIL);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void setMinWidth(int i) {
        int i2;
        this.LLJLL = i;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null && (i2 = layoutParams.width) != -2 && i2 != -1) {
            super.setMinWidth(0);
        } else {
            super.setMinWidth(this.LLJLL);
        }
    }

    public void setText(int i) {
        this.LLJI = getContext().getResources().getText(i);
        l0();
    }

    public void setTextColor(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.LLILZIL.setTextColor(colorStateList);
        }
    }

    public void setIcon(int i) {
        C783370UoB c783370UoB = C783380UoC.LIZ;
        Context context = getContext();
        c783370UoB.getClass();
        setIcon(C783370UoB.LIZ(i, context));
        setIconAutoMirrored(c783370UoB.LIZIZ(i, false));
    }

    public void setText(CharSequence charSequence) {
        this.LLJI = charSequence;
        l0();
    }

    public void setTextColor(int i) {
        this.LLILZIL.setTextColor(i);
    }

    public C16FS(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        LinearGradient linearGradient;
        int iMin;
        boolean z;
        int autoSizeTextType;
        int mode = View.MeasureSpec.getMode(i);
        boolean z2 = false;
        if (!TextUtils.isEmpty(this.LLJI)) {
            int size = View.MeasureSpec.getSize(i);
            C19ME c19me = (C19ME) this.LLILZIL.getLayoutParams();
            c19me.constrainedWidth = true;
            c19me.matchConstraintDefaultWidth = 1;
            TextPaint textPaint = this.LLJJI;
            if (textPaint == null) {
                this.LLJJI = new TextPaint();
            } else {
                textPaint.reset();
            }
            this.LLJJI.set(this.LLILZIL.getPaint());
            this.LLJJI.setTextSize(this.LLIZLLLIL);
            if (mode == Integer.MIN_VALUE) {
                iMin = Math.min(size, getMinWidth());
            } else {
                iMin = Math.min(size, getMaxWidth());
            }
            int paddingLeft = ((iMin - getPaddingLeft()) - getPaddingRight()) - getIconExtra();
            int paddingLeft2 = (paddingLeft - this.LLILZIL.getPaddingLeft()) - this.LLILZIL.getPaddingRight();
            if (paddingLeft2 > 0) {
                StaticLayout staticLayoutP0 = p0(paddingLeft2, this.LLJI);
                CharSequence charSequence = this.LLJI;
                if (staticLayoutP0.getLineCount() == 1 && staticLayoutP0.getLineEnd(staticLayoutP0.getLineCount() - 1) == charSequence.length()) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    this.LLJJI.setTextSize(this.LLIZ);
                    StaticLayout staticLayoutP02 = p0(paddingLeft2, this.LLJI);
                    CharSequence charSequence2 = this.LLJI;
                    if (staticLayoutP02.getLineCount() == 1 && staticLayoutP02.getLineEnd(staticLayoutP02.getLineCount() - 1) == charSequence2.length()) {
                        if (((ViewGroup.MarginLayoutParams) c19me).width != paddingLeft) {
                            ((ViewGroup.MarginLayoutParams) c19me).width = paddingLeft;
                            C786410Ut5.y6(this.LLILZIL, c19me);
                        }
                        if (this.LLJJJJJIL) {
                            this.LLILZIL.setSingleLine(false);
                            this.LLJJJJJIL = false;
                            this.LLILZIL.setLines(1);
                        }
                        if (this.LLIZ > 0 && this.LLIZLLLIL > 0 && this.LLJ > 0) {
                            C16F5 c16f5 = this.LLILZIL;
                            if (Build.VERSION.SDK_INT >= 27) {
                                autoSizeTextType = C20745716Fz.LJ(c16f5);
                            } else {
                                if (c16f5 instanceof InterfaceC20745616Fy) {
                                    autoSizeTextType = c16f5.getAutoSizeTextType();
                                }
                                C21382118m3.LIZIZ(this.LLILZIL, this.LLIZ, this.LLIZLLLIL, this.LLJ, 0);
                            }
                            if (autoSizeTextType != 1) {
                                C21382118m3.LIZIZ(this.LLILZIL, this.LLIZ, this.LLIZLLLIL, this.LLJ, 0);
                            }
                        }
                    } else {
                        C21382118m3.LIZJ(this.LLILZIL, 0);
                        float textSize = this.LLILZIL.getTextSize();
                        float f = this.LLIZ;
                        if (textSize != f) {
                            this.LLILZIL.setTextSize(0, f);
                        }
                        if (!this.LLJJJJJIL) {
                            this.LLILZIL.setSingleLine(true);
                            this.LLJJJJJIL = true;
                        }
                        int iMin2 = Math.min(this.LLJJL, ((size - getPaddingLeft()) - getPaddingRight()) - getIconExtra());
                        if (this.LLILZIL.getMaxWidth() != iMin2) {
                            this.LLILZIL.setMaxWidth(iMin2);
                        }
                        if (((ViewGroup.MarginLayoutParams) c19me).width != -2) {
                            ((ViewGroup.MarginLayoutParams) c19me).width = -2;
                            C786410Ut5.y6(this.LLILZIL, c19me);
                        }
                    }
                } else {
                    C21382118m3.LIZJ(this.LLILZIL, 0);
                    float textSize2 = this.LLILZIL.getTextSize();
                    float f2 = this.LLIZLLLIL;
                    if (textSize2 != f2) {
                        this.LLILZIL.setTextSize(0, f2);
                    }
                    if (((ViewGroup.MarginLayoutParams) c19me).width != -2) {
                        ((ViewGroup.MarginLayoutParams) c19me).width = -2;
                        C786410Ut5.y6(this.LLILZIL, c19me);
                    }
                    this.LLILZIL.setMaxWidth(((size - getPaddingLeft()) - getPaddingRight()) - getIconExtra());
                    if (!this.LLJJJJJIL) {
                        this.LLILZIL.setSingleLine(true);
                        this.LLJJJJJIL = true;
                    }
                }
            } else {
                C21382118m3.LIZJ(this.LLILZIL, 0);
            }
        } else {
            C21382118m3.LIZJ(this.LLILZIL, 0);
        }
        super.onMeasure(i, i2);
        if (getLayoutDirection() == 1) {
            z2 = true;
        }
        this.LLJJJ = z2;
        if (this.LLJJIJIIJIL == null) {
            Paint paint = new Paint(1);
            this.LLJJIJIIJIL = paint;
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        }
        if (this.LLJJJ) {
            linearGradient = new LinearGradient(getPaddingEnd(), 0.0f, getPaddingEnd() + (this.LLJJIJIL * 2), 0.0f, new int[]{-16777216, -16777216, 0}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP);
        } else {
            linearGradient = new LinearGradient((getMeasuredWidth() - getPaddingEnd()) - (this.LLJJIJIL * 2), 0.0f, getMeasuredWidth() - getPaddingEnd(), 0.0f, new int[]{0, -16777216, -16777216}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP);
        }
        this.LLJJIJIIJIL.setShader(linearGradient);
    }

    public final StaticLayout p0(int i, CharSequence charSequence) {
        return StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.LLJJI, i).setAlignment(Layout.Alignment.ALIGN_NORMAL).setLineSpacing(this.LLILZIL.getLineSpacingExtra(), this.LLILZIL.getLineSpacingMultiplier()).setIncludePad(this.LLILZIL.getIncludeFontPadding()).setBreakStrategy(this.LLILZIL.getBreakStrategy()).setHyphenationFrequency(this.LLILZIL.getHyphenationFrequency()).setMaxLines(this.LLILZIL.getMaxLines()).setTextDirection(TextDirectionHeuristics.FIRSTSTRONG_LTR).build();
    }

    public C16FS(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLIZ = -1;
        this.LLIZLLLIL = -1;
        this.LLJ = -1;
        this.LLJILLL = TextView.BufferType.NORMAL;
        this.LLJJJJLIIL = true;
        this.LLJJL = Integer.MAX_VALUE;
        this.LLJJ = context.getResources().getDimensionPixelSize(R.dimen.akq);
        ViewGroup.inflate(context, R.layout.gy7, this);
        LiveIconView liveIconView = (LiveIconView) findViewById(R.id.yrh);
        this.LLJJJJ = liveIconView;
        liveIconView.setCheckColorFilter(true);
        this.LLILZIL = (C16F5) findViewById(R.id.yvc);
        Drawable drawableLIZ = C14MI.LIZ(getContext(), R.drawable.eoj);
        if (drawableLIZ != null) {
            this.LLJJJIL = drawableLIZ;
            drawableLIZ.mutate();
            this.LLJJJIL.setState(getDrawableState());
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 360.0f);
        this.LLJJIII = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setRepeatCount(-1);
        this.LLJJIII.setDuration(1000L);
        this.LLJJIII.setInterpolator(new LinearInterpolator());
        this.LLJJIII.addUpdateListener(new AUListenerS278S0100000_31(this, 66));
        C20743916Fh c20743916Fh = new C20743916Fh(this);
        this.LLJJLIIIJLLLLLLLZ = c20743916Fh;
        c20743916Fh.LJII(attributeSet, i, 0);
        if (attributeSet != null) {
            this.LLJLILLLLZIIL = attributeSet.getAttributeResourceValue(null, "style", 0);
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.LiveButton, i, 0);
        i0(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
    }
}
