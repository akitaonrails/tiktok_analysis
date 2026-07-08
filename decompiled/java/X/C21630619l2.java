package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import com.ss.android.ugc.aweme.app.R$styleable;
import java.util.Arrays;

/* JADX INFO: renamed from: X.19l2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21630619l2 extends View {
    public static final String[] LLJJIJI = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
    public String[] LL;
    public int LLILLJJLI;
    public float LLILLL;
    public C444890HcV LLILZ;
    public int LLILZIL;
    public float LLILZLL;
    public float LLIZ;
    public float LLIZLLLIL;
    public final RectF LLJ;
    public float LLJI;
    public float LLJIJIL;
    public boolean LLJILJIL;
    public boolean LLJILJILJ;
    public int LLJILLL;
    public int LLJJ;
    public InterfaceC1726220v1Q LLJJI;
    public float LLJJIII;

    public String[] getDefaultIndexItems() {
        return LLJJIJI;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float fMax;
        float width;
        float f;
        float paddingLeft;
        float f2;
        super.onDraw(canvas);
        int length = this.LL.length;
        int i = 0;
        while (true) {
            int i2 = 255;
            if (i < length) {
                float f3 = this.LLJJIII;
                float f4 = this.LLIZ;
                float f5 = i;
                float f6 = f3 + (f4 * f5);
                float f7 = 0.0f;
                if (this.LLILLJJLI != -1) {
                    float fAbs = Math.abs(this.LLILLL - ((f5 * f4) + (f4 / 2.0f))) / this.LLIZ;
                    fMax = Math.max(1.0f - ((fAbs * fAbs) / 16.0f), 0.0f);
                } else {
                    fMax = 0.0f;
                }
                if (i != this.LLILLJJLI) {
                    i2 = (int) ((1.0f - fMax) * 255.0f);
                }
                this.LLILZ.setAlpha(i2);
                C444890HcV c444890HcV = this.LLILZ;
                float f8 = this.LLILZLL;
                c444890HcV.setTextSize(f8 + (f8 * fMax));
                if (this.LLJILLL == 1) {
                    int i3 = this.LLJJ;
                    if (i3 != 0) {
                        if (i3 != 1) {
                            if (i3 == 2) {
                                paddingLeft = getPaddingLeft() + this.LLJIJIL;
                                f2 = this.LLIZLLLIL;
                            }
                        } else {
                            paddingLeft = getPaddingLeft();
                            f2 = this.LLIZLLLIL;
                        }
                    } else {
                        paddingLeft = getPaddingLeft() + (this.LLJIJIL / 2.0f);
                        f2 = this.LLIZLLLIL;
                    }
                    f7 = paddingLeft + (f2 * fMax);
                } else {
                    int i4 = this.LLJJ;
                    if (i4 != 0) {
                        if (i4 != 1) {
                            if (i4 == 2) {
                                width = getWidth() - getPaddingRight();
                                f = this.LLIZLLLIL;
                            }
                        } else {
                            width = (getWidth() - getPaddingRight()) - this.LLJIJIL;
                            f = this.LLIZLLLIL;
                        }
                    } else {
                        width = (getWidth() - getPaddingRight()) - (this.LLJIJIL / 2.0f);
                        f = this.LLIZLLLIL;
                    }
                    f7 = width - (f * fMax);
                }
                canvas.drawText(this.LL[i], f7, f6, this.LLILZ);
                i++;
            } else {
                this.LLILZ.setAlpha(255);
                this.LLILZ.setTextSize(this.LLILZLL);
                return;
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int length;
        InterfaceC1726220v1Q interfaceC1726220v1Q;
        InterfaceC1726220v1Q interfaceC1726220v1Q2;
        InterfaceC1726220v1Q interfaceC1726220v1Q3;
        if (this.LL.length == 0) {
            return super.onTouchEvent(motionEvent);
        }
        float y = motionEvent.getY();
        float x = motionEvent.getX();
        float height = y - ((getHeight() / 2) - (this.LLJI / 2.0f));
        this.LLILLL = height;
        if (height <= 0.0f) {
            length = 0;
        } else {
            length = (int) (height / this.LLIZ);
            String[] strArr = this.LL;
            if (length >= strArr.length) {
                length = strArr.length - 1;
            }
        }
        this.LLILLJJLI = length;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        return super.onTouchEvent(motionEvent);
                    }
                } else {
                    if (this.LLJILJIL && !this.LLJILJILJ && (interfaceC1726220v1Q3 = this.LLJJI) != null) {
                        ((C1713190ugP) interfaceC1726220v1Q3).LIZ(this.LL[this.LLILLJJLI]);
                    }
                    invalidate();
                    return true;
                }
            }
            if (this.LLJILJILJ && (interfaceC1726220v1Q2 = this.LLJJI) != null) {
                ((C1713190ugP) interfaceC1726220v1Q2).LIZ(this.LL[this.LLILLJJLI]);
            }
            this.LLILLJJLI = -1;
            this.LLJILJIL = false;
            invalidate();
            return true;
        }
        if (this.LLJ.contains(x, y)) {
            this.LLJILJIL = true;
            if (!this.LLJILJILJ && (interfaceC1726220v1Q = this.LLJJI) != null) {
                ((C1713190ugP) interfaceC1726220v1Q).LIZ(this.LL[this.LLILLJJLI]);
            }
            invalidate();
            return true;
        }
        this.LLILLJJLI = -1;
        return false;
    }

    public void setIndexItems(String... strArr) {
        this.LL = (String[]) Arrays.copyOf(strArr, strArr.length);
        requestLayout();
    }

    public void setLazyRespond(boolean z) {
        this.LLJILJILJ = z;
    }

    public void setMaxOffset(int i) {
        this.LLIZLLLIL = i;
        invalidate();
    }

    public void setOnSelectIndexItemListener(InterfaceC1726220v1Q interfaceC1726220v1Q) {
        this.LLJJI = interfaceC1726220v1Q;
    }

    public void setPosition(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("the position must be POSITION_RIGHT or POSITION_LEFT");
        }
        this.LLJILLL = i;
        requestLayout();
    }

    public void setTextAlign(int i) {
        if (this.LLJJ == i) {
            return;
        }
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    this.LLILZ.setTextAlign(Paint.Align.RIGHT);
                } else {
                    throw new IllegalArgumentException("the alignment must be TEXT_ALIGN_CENTER, TEXT_ALIGN_LEFT or TEXT_ALIGN_RIGHT");
                }
            } else {
                this.LLILZ.setTextAlign(Paint.Align.LEFT);
            }
        } else {
            this.LLILZ.setTextAlign(Paint.Align.CENTER);
        }
        this.LLJJ = i;
        invalidate();
    }

    public void setTextColor(int i) {
        this.LLILZIL = i;
        this.LLILZ.setColor(i);
        invalidate();
    }

    public void setTextSize(float f) {
        if (this.LLILZLL == f) {
            return;
        }
        this.LLILZLL = f;
        this.LLILZ.setTextSize(f);
        invalidate();
    }

    public C21630619l2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILLJJLI = -1;
        this.LLILLL = -1.0f;
        this.LLJ = new RectF();
        this.LLJILJIL = false;
        this.LLJILJILJ = false;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.WaveSideBar);
        this.LLJILJILJ = typedArrayObtainStyledAttributes.getBoolean(R$styleable.WaveSideBar_sidebar_lazy_respond, false);
        this.LLILZIL = typedArrayObtainStyledAttributes.getColor(R$styleable.WaveSideBar_sidebar_text_color, -7829368);
        this.LLILZLL = typedArrayObtainStyledAttributes.getDimension(R$styleable.WaveSideBar_sidebar_text_size, TypedValue.applyDimension(2, 14, displayMetrics));
        this.LLIZLLLIL = typedArrayObtainStyledAttributes.getDimension(R$styleable.WaveSideBar_sidebar_max_offset, TypedValue.applyDimension(1, 80, displayMetrics));
        this.LLJILLL = typedArrayObtainStyledAttributes.getInt(R$styleable.WaveSideBar_sidebar_position, 0);
        this.LLJJ = typedArrayObtainStyledAttributes.getInt(R$styleable.WaveSideBar_sidebar_text_alignment, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.LL = getDefaultIndexItems();
        C444890HcV c444890HcV = new C444890HcV();
        this.LLILZ = c444890HcV;
        c444890HcV.setAntiAlias(true);
        this.LLILZ.setColor(this.LLILZIL);
        this.LLILZ.setTextSize(this.LLILZLL);
        this.LLILZ.LIZ(72);
        int i = this.LLJJ;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    this.LLILZ.setTextAlign(Paint.Align.RIGHT);
                    return;
                }
                return;
            }
            this.LLILZ.setTextAlign(Paint.Align.LEFT);
            return;
        }
        this.LLILZ.setTextAlign(Paint.Align.CENTER);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        float paddingRight;
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i);
        Paint.FontMetrics fontMetrics = this.LLILZ.getFontMetrics();
        float f = fontMetrics.bottom - fontMetrics.top;
        this.LLIZ = f;
        String[] strArr = this.LL;
        this.LLJI = strArr.length * f;
        for (String str : strArr) {
            this.LLJIJIL = Math.max(this.LLJIJIL, this.LLILZ.measureText(str));
        }
        if (this.LLJILLL == 1) {
            paddingRight = 0.0f;
        } else {
            paddingRight = (size2 - this.LLJIJIL) - getPaddingRight();
        }
        float paddingLeft = this.LLJILLL == 1 ? getPaddingLeft() + paddingRight + this.LLJIJIL : size2;
        float f2 = size / 2;
        float f3 = this.LLJI;
        float f4 = f2 - (f3 / 2.0f);
        this.LLJ.set(paddingRight, f4, paddingLeft, f3 + f4);
        float length = this.LL.length;
        float f5 = this.LLIZ;
        float f6 = f2 - ((length * f5) / 2.0f);
        float f7 = fontMetrics.descent;
        float f8 = fontMetrics.ascent;
        this.LLJJIII = (f6 + ((f5 / 2.0f) - ((f7 - f8) / 2.0f))) - f8;
    }
}
