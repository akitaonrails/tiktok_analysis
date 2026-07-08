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

/* JADX INFO: renamed from: X.19l0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21630419l0 extends View {
    public static final String[] LLJJIJI = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
    public String[] LL;
    public int LLILLJJLI;
    public float LLILLL;
    public Paint LLILZ;
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
    public InterfaceC21630919l5 LLJJI;
    public float LLJJIII;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Paint paint;
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
            paint = null;
            if (i >= length) {
                break;
            }
            float f3 = this.LLJJIII;
            float f4 = this.LLIZ;
            float f5 = i;
            float f6 = f3 + (f4 * f5);
            float paddingLeft2 = 0.0f;
            if (this.LLILLJJLI != -1) {
                float fAbs = Math.abs(this.LLILLL - ((f5 * f4) + (f4 / 2))) / this.LLIZ;
                fMax = Math.max(1 - ((fAbs * fAbs) / 16), 0.0f);
            } else {
                fMax = 0.0f;
            }
            if (i != this.LLILLJJLI) {
                i2 = (int) (255 * (1 - fMax));
            }
            Paint paint2 = this.LLILZ;
            if (paint2 == null) {
                paint2 = null;
            }
            paint2.setAlpha(i2);
            Paint paint3 = this.LLILZ;
            if (paint3 == null) {
                paint3 = null;
            }
            float f7 = this.LLILZLL;
            paint3.setTextSize(f7 + (f7 * fMax));
            if (this.LLJILLL == 1) {
                int i3 = this.LLJJ;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 == 2) {
                            paddingLeft2 = getPaddingLeft() + this.LLJIJIL + (this.LLIZLLLIL * fMax);
                        }
                    } else {
                        paddingLeft = getPaddingLeft();
                        f2 = this.LLIZLLLIL;
                    }
                } else {
                    paddingLeft = getPaddingLeft() + (this.LLJIJIL / 2);
                    f2 = this.LLIZLLLIL;
                }
                paddingLeft2 = paddingLeft + (f2 * fMax);
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
                    width = (getWidth() - getPaddingRight()) - (this.LLJIJIL / 2);
                    f = this.LLIZLLLIL;
                }
                paddingLeft2 = width - (f * fMax);
            }
            String str = this.LL[i];
            Paint paint4 = this.LLILZ;
            if (paint4 != null) {
                paint = paint4;
            }
            canvas.drawText(str, paddingLeft2, f6, paint);
            i++;
        }
        Paint paint5 = this.LLILZ;
        if (paint5 == null) {
            paint5 = null;
        }
        paint5.setAlpha(255);
        Paint paint6 = this.LLILZ;
        if (paint6 != null) {
            paint = paint6;
        }
        paint.setTextSize(this.LLILZLL);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int length;
        InterfaceC21630919l5 interfaceC21630919l5;
        InterfaceC21630919l5 interfaceC21630919l52;
        InterfaceC21630919l5 interfaceC21630919l53;
        if (this.LL.length == 0) {
            return super.onTouchEvent(motionEvent);
        }
        float y = motionEvent.getY();
        float x = motionEvent.getX();
        float height = y - ((getHeight() / 2) - (this.LLJI / 2));
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
                    if (this.LLJILJIL && !this.LLJILJILJ && (interfaceC21630919l53 = this.LLJJI) != null) {
                        interfaceC21630919l53.LIZ(this.LL[this.LLILLJJLI]);
                    }
                    invalidate();
                    return true;
                }
            }
            if (this.LLJILJILJ && (interfaceC21630919l52 = this.LLJJI) != null) {
                interfaceC21630919l52.LIZ(this.LL[this.LLILLJJLI]);
            }
            this.LLILLJJLI = -1;
            this.LLJILJIL = false;
            invalidate();
            return true;
        }
        if (this.LLJ.contains(x, y)) {
            this.LLJILJIL = true;
            if (!this.LLJILJILJ && (interfaceC21630919l5 = this.LLJJI) != null) {
                interfaceC21630919l5.LIZ(this.LL[this.LLILLJJLI]);
            }
            invalidate();
            return true;
        }
        this.LLILLJJLI = -1;
        return false;
    }

    public final void setIndexItems(String... strArr) {
        this.LL = (String[]) Arrays.copyOf(strArr, strArr.length);
        requestLayout();
    }

    public final void setLazyRespond(boolean z) {
        this.LLJILJILJ = z;
    }

    public final void setMaxOffset(int i) {
        this.LLIZLLLIL = i;
        invalidate();
    }

    public final void setOnSelectIndexItemListener(InterfaceC21630919l5 interfaceC21630919l5) {
        this.LLJJI = interfaceC21630919l5;
    }

    public final void setPosition(int i) {
        if (i != 0 && i != 1) {
            "the position must be POSITION_RIGHT or POSITION_LEFT".toString();
            throw new IllegalArgumentException("the position must be POSITION_RIGHT or POSITION_LEFT");
        }
        this.LLJILLL = i;
        requestLayout();
    }

    public final void setSideBarPosition(int i) {
        if (this.LLJILLL == i) {
            return;
        }
        this.LLJILLL = i;
        invalidate();
    }

    public final void setTextAlign(int i) {
        if (this.LLJJ == i) {
            return;
        }
        Paint paint = null;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    Paint paint2 = this.LLILZ;
                    if (paint2 != null) {
                        paint = paint2;
                    }
                    paint.setTextAlign(Paint.Align.RIGHT);
                } else {
                    throw new IllegalArgumentException("the alignment must be TEXT_ALIGN_CENTER, TEXT_ALIGN_LEFT or TEXT_ALIGN_RIGHT");
                }
            } else {
                Paint paint3 = this.LLILZ;
                if (paint3 != null) {
                    paint = paint3;
                }
                paint.setTextAlign(Paint.Align.LEFT);
            }
        } else {
            Paint paint4 = this.LLILZ;
            if (paint4 != null) {
                paint = paint4;
            }
            paint.setTextAlign(Paint.Align.CENTER);
        }
        this.LLJJ = i;
        invalidate();
    }

    public final void setTextColor(int i) {
        this.LLILZIL = i;
        Paint paint = this.LLILZ;
        if (paint == null) {
            paint = null;
        }
        paint.setColor(i);
        invalidate();
    }

    public final void setTextSize(float f) {
        if (this.LLILZLL == f) {
            return;
        }
        this.LLILZLL = f;
        Paint paint = this.LLILZ;
        if (paint == null) {
            paint = null;
        }
        paint.setTextSize(f);
        invalidate();
    }

    public C21630419l0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILLJJLI = -1;
        this.LLILLL = -1.0f;
        this.LLJ = new RectF();
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.WaveSideBar);
        this.LLJILJILJ = typedArrayObtainStyledAttributes.getBoolean(R$styleable.WaveSideBar_sidebar_lazy_respond, false);
        this.LLILZIL = typedArrayObtainStyledAttributes.getColor(R$styleable.WaveSideBar_sidebar_text_color, 161823);
        this.LLILZLL = typedArrayObtainStyledAttributes.getDimension(R$styleable.WaveSideBar_sidebar_text_size, TypedValue.applyDimension(2, 14, displayMetrics));
        this.LLIZLLLIL = typedArrayObtainStyledAttributes.getDimension(R$styleable.WaveSideBar_sidebar_max_offset, TypedValue.applyDimension(1, 80, displayMetrics));
        this.LLJILLL = typedArrayObtainStyledAttributes.getInt(R$styleable.WaveSideBar_sidebar_position, 0);
        this.LLJJ = typedArrayObtainStyledAttributes.getInt(R$styleable.WaveSideBar_sidebar_text_alignment, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.LL = LLJJIJI;
        Paint paint = new Paint();
        this.LLILZ = paint;
        paint.setAntiAlias(true);
        Paint paint2 = this.LLILZ;
        (paint2 == null ? null : paint2).setColor(this.LLILZIL);
        Paint paint3 = this.LLILZ;
        (paint3 == null ? null : paint3).setTextSize(this.LLILZLL);
        Paint paint4 = this.LLILZ;
        (paint4 == null ? null : paint4).setTypeface(C1119920fFW.LIZJ(this.LLILZLL, 500, getContext()));
        int i = this.LLJJ;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    Paint paint5 = this.LLILZ;
                    (paint5 != null ? paint5 : null).setTextAlign(Paint.Align.RIGHT);
                    return;
                }
                return;
            }
            Paint paint6 = this.LLILZ;
            (paint6 != null ? paint6 : null).setTextAlign(Paint.Align.LEFT);
            return;
        }
        Paint paint7 = this.LLILZ;
        (paint7 != null ? paint7 : null).setTextAlign(Paint.Align.CENTER);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        float paddingRight;
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i);
        Paint paint = this.LLILZ;
        if (paint == null) {
            paint = null;
        }
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        float f = fontMetrics.bottom - fontMetrics.top;
        this.LLIZ = f;
        String[] strArr = this.LL;
        this.LLJI = strArr.length * f;
        for (String str : strArr) {
            float f2 = this.LLJIJIL;
            Paint paint2 = this.LLILZ;
            if (paint2 == null) {
                paint2 = null;
            }
            this.LLJIJIL = Math.max(f2, paint2.measureText(str));
        }
        if (this.LLJILLL == 1) {
            paddingRight = 0.0f;
        } else {
            paddingRight = (size2 - this.LLJIJIL) - getPaddingRight();
        }
        float paddingLeft = this.LLJILLL == 1 ? getPaddingLeft() + paddingRight + this.LLJIJIL : size2;
        float f3 = size / 2;
        float f4 = this.LLJI;
        float f5 = 2;
        float f6 = f3 - (f4 / f5);
        this.LLJ.set(paddingRight, f6, paddingLeft, f4 + f6);
        float length = this.LL.length;
        float f7 = this.LLIZ;
        float f8 = f3 - ((length * f7) / f5);
        float f9 = fontMetrics.descent;
        float f10 = fontMetrics.ascent;
        this.LLJJIII = (f8 + ((f7 / f5) - ((f9 - f10) / f5))) - f10;
    }
}
