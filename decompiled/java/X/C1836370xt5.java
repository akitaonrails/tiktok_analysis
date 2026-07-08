package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.Editable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.cardview.widget.CardView;
import com.bytedance.android.live.design.widget.LiveEditText;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0xt5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1836370xt5 extends LiveEditText {
    public static final /* synthetic */ int LLJJLIIIJLLLLLLLZ = 0;
    public boolean LLJIJIL;
    public Function0<Integer> LLJILJIL;
    public boolean LLJILJILJ;
    public int LLJILLL;
    public int LLJJ;
    public int LLJJI;
    public boolean LLJJIII;
    public Function1<? super Integer, Unit> LLJJIJI;
    public int LLJJIJIIJIL;
    public int LLJJIJIL;
    public final Paint LLJJJ;
    public final Path LLJJJIL;
    public final TextPaint LLJJJJ;
    public int LLJJJJJIL;
    public int LLJJJJLIIL;
    public boolean LLJJL;

    private final int getHeadlineBottomPadding() {
        return this.LLJJIJIIJIL * 3;
    }

    private final int getHeadlineTopPadding() {
        return this.LLJJIJIIJIL * 2;
    }

    private final int getHorizontalPadding() {
        return this.LLJJIJIIJIL * 2;
    }

    public final String[] getTextInLines() {
        if (TextUtils.isEmpty(C2204961BRm.LLLIIIL(this, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6CV0TNJrjFT+VGtwrDPgFrNfxjCwZSeODpCZgAi+sxACTDGSjySpEBXETYFW6HJz8IX7dXItfrncbtCedtf5uC7mnQVOggE5DBr2G/XLFdWy3WIL28DuUkAzlc2EtNNmOYWLzOhf+mr/ENHO9fsp", null)))) {
            return null;
        }
        Layout layout = getLayout();
        String strValueOf = String.valueOf(C2204961BRm.LLLIIIL(this, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6CV0TNJrjFT+VGtwrDPgFrNfxjCwZSeODpCZgAi+sxACTDGSjySpEBXETYFW6HJz8IX7dXItfrncbtCedtf5uC7mnQVOggE5DBr2G/XLFdWy3WIL28DuUkAzlc2EtNNmOYWLzOhf+mr/ENHO9fsp", null)));
        String[] strArr = new String[getLineCount()];
        int lineCount = getLineCount();
        int i = 0;
        int i2 = 0;
        while (i < lineCount) {
            int lineEnd = layout.getLineEnd(i);
            strArr[i] = strValueOf.substring(i2, lineEnd);
            layout.getLineBounds(i, new Rect());
            i++;
            i2 = lineEnd;
        }
        return strArr;
    }

    public final int getCurrentAlignment() {
        return this.LLJJJJJIL;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int measuredWidth;
        int paddingLeft;
        int horizontalPadding;
        int horizontalPadding2;
        Point point;
        Point point2;
        Point point3;
        Point point4;
        Integer numValueOf;
        Integer numValueOf2;
        Integer numValueOf3;
        Integer numValueOf4;
        Point point5;
        Point point6;
        Point point7;
        Integer numValueOf5;
        Integer numValueOf6;
        int topPadding;
        int bottom;
        if (!TextUtils.isEmpty(String.valueOf(C2204961BRm.LLLIIIL(this, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6CV0TNJrjFT+VGtwrDPgFrNfxjCwZSeODpCZgAi+sxACTDGSjySpEBXETYFW6HJz8IX7dXItfrncbtCedtf5uC7mnQVOggE5DBr2G/XLFdWy3WIL28DuUkAzlc2EtNNmOYWLzOhf+mr/ENHO9fsp", null)))) && !this.LLJIJIL) {
            this.LLJJJ.setColor(this.LLJJIJIL);
            String[] textInLines = getTextInLines();
            if (textInLines != null && textInLines.length != 0) {
                int length = textInLines.length;
                Point[][] pointArr = new Point[length][];
                if (this.LLJIJIL && textInLines.length >= 2) {
                    measuredWidth = this.LLJILJIL.invoke().intValue();
                } else {
                    measuredWidth = getMeasuredWidth();
                }
                int i = this.LLJJJJJIL;
                if (i != 0) {
                    if (i != 2) {
                        paddingLeft = (((measuredWidth - getPaddingLeft()) - getPaddingRight()) / 2) + getPaddingLeft();
                    } else {
                        paddingLeft = measuredWidth - getPaddingRight();
                    }
                } else {
                    paddingLeft = getPaddingLeft();
                }
                if (this.LLJIJIL) {
                    ArrayList arrayList = new ArrayList();
                    for (String str : textInLines) {
                        if (str == null) {
                            str = "";
                        }
                        arrayList.add(Integer.valueOf((int) getPaint().measureText(str)));
                    }
                    Integer num = (Integer) C13LP.LJJLIIIJLJLI(arrayList);
                    if (num != null) {
                        measuredWidth = num.intValue();
                    } else {
                        measuredWidth = 0;
                    }
                }
                int i2 = this.LLJJJJJIL;
                if (i2 != 0) {
                    if (i2 != 2) {
                        int i3 = measuredWidth / 2;
                        horizontalPadding = (paddingLeft - i3) - getHorizontalPadding();
                        paddingLeft += i3;
                        horizontalPadding2 = getHorizontalPadding();
                    } else {
                        horizontalPadding = (paddingLeft - measuredWidth) - getHorizontalPadding();
                        horizontalPadding2 = getHorizontalPadding();
                    }
                } else {
                    horizontalPadding = paddingLeft - getHorizontalPadding();
                    paddingLeft += measuredWidth;
                    horizontalPadding2 = getHorizontalPadding();
                }
                int i4 = paddingLeft + horizontalPadding2;
                int i5 = 0;
                int paddingTop = 0;
                while (i5 < length) {
                    int lineBottom = (getLayout().getLineBottom(i5) - getLayout().getLineTop(i5)) - this.LLJJIJIIJIL;
                    if (i5 == 0) {
                        if (length != 1) {
                            topPadding = getLayout().getTopPadding();
                            lineBottom += topPadding;
                        }
                    } else if (i5 == length - 1) {
                        lineBottom -= getLayout().getBottomPadding();
                        topPadding = this.LLJJIJIIJIL;
                        lineBottom += topPadding;
                    }
                    if (this.LLJIJIL) {
                        if (i5 == 0) {
                            paddingTop = getPaddingTop() - getHeadlineTopPadding();
                        }
                        bottom = this.LLJJIJIIJIL + paddingTop + lineBottom;
                        if (i5 == length - 1) {
                            bottom += getHeadlineBottomPadding();
                        }
                    } else {
                        if (i5 == 0) {
                            paddingTop = 0;
                        }
                        if (i5 == length - 1) {
                            bottom = getBottom();
                        } else if (i5 == 0) {
                            int paddingTop2 = getPaddingTop();
                            int i6 = this.LLJJIJIIJIL;
                            bottom = (paddingTop2 - (i6 / 2)) + lineBottom + i6;
                        } else {
                            bottom = lineBottom + paddingTop + this.LLJJIJIIJIL;
                        }
                    }
                    pointArr[i5] = new Point[]{new Point(horizontalPadding, paddingTop), new Point(i4, paddingTop), new Point(i4, bottom), new Point(horizontalPadding, bottom)};
                    i5++;
                    paddingTop = bottom;
                }
                this.LLJJJIL.reset();
                int length2 = textInLines.length;
                for (int i7 = 0; i7 < length2; i7++) {
                    Point[] pointArr2 = pointArr[i7];
                    if (pointArr2 != null) {
                        point5 = (Point) C13LQ.LJJIIZ(0, pointArr2);
                    } else {
                        point5 = null;
                    }
                    if (i7 == 0 && point5 != null) {
                        this.LLJJJIL.moveTo(point5.x, point5.y);
                    }
                    Point[] pointArr3 = pointArr[i7];
                    if (pointArr3 != null) {
                        point6 = (Point) C13LQ.LJJIIZ(1, pointArr3);
                        if (point6 != null) {
                            this.LLJJJIL.lineTo(point6.x, point6.y);
                        }
                    } else {
                        point6 = null;
                    }
                    Point[] pointArr4 = pointArr[i7];
                    if (pointArr4 != null) {
                        point7 = (Point) C13LQ.LJJIIZ(2, pointArr4);
                    } else {
                        point7 = null;
                    }
                    if (point5 != null) {
                        numValueOf5 = Integer.valueOf(point5.x);
                    } else {
                        numValueOf5 = null;
                    }
                    if (point6 != null) {
                        numValueOf6 = Integer.valueOf(point6.x);
                    } else {
                        numValueOf6 = null;
                    }
                    if (Intrinsics.LJFF(numValueOf5, numValueOf6)) {
                        if (point6 != null) {
                            this.LLJJJIL.lineTo(point6.x, point6.y);
                        }
                        if (point7 != null) {
                            this.LLJJJIL.lineTo(point7.x, point7.y);
                            this.LLJJJIL.lineTo(point7.x, point7.y);
                        }
                    } else if (point7 != null) {
                        this.LLJJJIL.lineTo(point7.x, point7.y);
                    }
                }
                for (int i8 = length2 - 1; -1 < i8; i8--) {
                    Point[] pointArr5 = pointArr[i8];
                    if (pointArr5 != null) {
                        point2 = (Point) C13LQ.LJJIIZ(0, pointArr5);
                    } else {
                        point2 = null;
                    }
                    Point[] pointArr6 = pointArr[i8];
                    if (pointArr6 != null) {
                        point3 = (Point) C13LQ.LJJIIZ(1, pointArr6);
                    } else {
                        point3 = null;
                    }
                    Point[] pointArr7 = pointArr[i8];
                    if (pointArr7 != null) {
                        point4 = (Point) C13LQ.LJJIIZ(3, pointArr7);
                    } else {
                        point4 = null;
                    }
                    if (point2 != null) {
                        numValueOf = Integer.valueOf(point2.x);
                    } else {
                        numValueOf = null;
                    }
                    if (point3 != null) {
                        numValueOf2 = Integer.valueOf(point3.x);
                    } else {
                        numValueOf2 = null;
                    }
                    if (Intrinsics.LJFF(numValueOf, numValueOf2)) {
                        if (point4 != null) {
                            this.LLJJJIL.lineTo(point4.x, point4.y);
                            this.LLJJJIL.lineTo(point4.x, point4.y);
                        }
                    } else if (point4 != null) {
                        this.LLJJJIL.lineTo(point4.x, point4.y);
                    }
                    if (point2 != null) {
                        numValueOf3 = Integer.valueOf(point2.x);
                    } else {
                        numValueOf3 = null;
                    }
                    if (point3 != null) {
                        numValueOf4 = Integer.valueOf(point3.x);
                    } else {
                        numValueOf4 = null;
                    }
                    if (Intrinsics.LJFF(numValueOf3, numValueOf4)) {
                        if (point2 != null) {
                            this.LLJJJIL.lineTo(point2.x, point2.y);
                            this.LLJJJIL.lineTo(point2.x, point2.y);
                        }
                    } else if (point2 != null) {
                        this.LLJJJIL.lineTo(point2.x, point2.y);
                    }
                }
                Point[] pointArr8 = pointArr[0];
                if (pointArr8 != null && (point = (Point) C13LQ.LJJIIZ(1, pointArr8)) != null) {
                    this.LLJJJIL.lineTo(point.x, point.y);
                }
                canvas.drawPath(this.LLJJJIL, this.LLJJJ);
            }
        }
        super.onDraw(canvas);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.LLJILJILJ) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setCurrentAlignment(int i) {
        this.LLJJJJJIL = i;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    setGravity(5);
                    return;
                }
                return;
            }
            setGravity(49);
            return;
        }
        setGravity(3);
    }

    public final void setFontSize(int i) {
        int paddingTop;
        int paddingBottom;
        float f = i;
        int iLIZ = (int) (C416070GTd.LIZ(6.0d, getContext()) * (f / this.LLJILLL));
        this.LLJJIJIIJIL = iLIZ;
        setLineSpacing(iLIZ, getLineSpacingMultiplier());
        int horizontalPadding = getHorizontalPadding();
        if (this.LLJIJIL) {
            paddingTop = getHeadlineTopPadding();
        } else {
            paddingTop = getPaddingTop();
        }
        int horizontalPadding2 = getHorizontalPadding();
        if (this.LLJIJIL) {
            paddingBottom = getHeadlineBottomPadding();
        } else {
            paddingBottom = getPaddingBottom();
        }
        setPadding(horizontalPadding, paddingTop, horizontalPadding2, paddingBottom);
        setTextSize(f);
        this.LLJJ = i;
    }

    public final void setFontType(Typeface typeface) {
        if (typeface != null && !Intrinsics.LJFF(getTypeface(), typeface)) {
            setTypeface(typeface);
            if (!Intrinsics.LJFF(this.LLJJJJ.getTypeface(), typeface)) {
                this.LLJJJJ.setTypeface(typeface);
            }
        }
    }

    public C1836370xt5(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLJIJIL = true;
        this.LLJILJIL = new C1836380xt6(this);
        this.LLJILLL = 22;
        this.LLJJ = 22;
        this.LLJJI = 14;
        this.LLJJIJI = new C1836390xt7();
        this.LLJJIJIIJIL = C416070GTd.LIZ(6.0d, context);
        Paint paint = new Paint();
        paint.setColor(this.LLJJIJIL);
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        this.LLJJJ = paint;
        this.LLJJJIL = new Path();
        TextPaint textPaint = new TextPaint();
        textPaint.set(getPaint());
        textPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        textPaint.setStyle(Paint.Style.FILL);
        this.LLJJJJ = textPaint;
        setInputType(524288);
        setSingleLine(false);
        setCursorVisible(false);
        setLayerType(1, null);
        setLineSpacing(this.LLJJIJIIJIL, getLineSpacingMultiplier());
        this.LLJJJJLIIL = -1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        String[] textInLines = getTextInLines();
        if (textInLines != null && this.LLJIJIL && textInLines.length >= 2) {
            ArrayList arrayList = new ArrayList();
            int iIntValue = 0;
            for (String str : textInLines) {
                if (str == null) {
                    str = "";
                }
                arrayList.add(Integer.valueOf((int) getPaint().measureText(str)));
            }
            Integer num = (Integer) C13LP.LJJLIIIJLJLI(arrayList);
            if (num != null) {
                iIntValue = num.intValue();
            }
            setMeasuredDimension(iIntValue + getPaddingLeft() + getPaddingRight(), getMeasuredHeight());
        }
    }

    public final void LJIIIZ(int i, EnumC1826380xcy enumC1826380xcy, CardView cardView) {
        C1826410xd1 next;
        String str;
        Iterator<C1826410xd1> it2 = C1826400xd0.LIZ.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                Integer num = next.LIZLLL;
                if (num != null && num.intValue() == i) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C1826410xd1 c1826410xd1 = next;
        if (c1826410xd1 == null) {
            return;
        }
        setShadowLayer(0.0f, 0.0f, 0.0f, i);
        Integer num2 = c1826410xd1.LJ;
        if (num2 != null) {
            int iIntValue = num2.intValue();
            if (enumC1826380xcy == EnumC1826380xcy.PREVIEW_DISPLAY) {
                if (cardView != null) {
                    cardView.setCardBackgroundColor(iIntValue);
                }
            } else {
                setBackgroundColor(iIntValue);
            }
        }
        Integer numLIZ = c1826410xd1.LIZ(enumC1826380xcy);
        if (numLIZ != null) {
            this.LLJJIJIL = numLIZ.intValue();
        }
        int i2 = C1826390xcz.LIZ[enumC1826380xcy.ordinal()];
        if (i2 != 1 && i2 != 2) {
            if (i2 != 3) {
                if (i2 != 4) {
                    throw new C1954807lC();
                }
                str = c1826410xd1.LIZIZ;
            } else {
                str = c1826410xd1.LIZ;
            }
        } else {
            str = c1826410xd1.LIZIZ;
        }
        Integer numLJFF = C202500qF.LJFF(str);
        if (numLJFF != null) {
            setTextColor(numLJFF.intValue());
        }
    }

    public static void LJIIIIZZ(C1836370xt5 c1836370xt5, boolean z, boolean z2, int i) {
        C1836400xt8 c1836400xt8;
        if ((i & 2) != 0) {
            c1836400xt8 = new C1836400xt8(c1836370xt5);
        } else {
            c1836400xt8 = null;
        }
        int iLIZ = 0;
        if ((i & 4) != 0) {
            z2 = false;
        }
        c1836370xt5.LLJIJIL = z;
        c1836370xt5.LLJILJIL = c1836400xt8;
        c1836370xt5.LLJILJILJ = z2;
        c1836370xt5.LLJJIJI = new C07S5();
        if (z) {
            c1836370xt5.LLJILLL = 22;
            c1836370xt5.LLJJI = 20;
            c1836370xt5.LLJJIII = true;
        } else {
            c1836370xt5.LLJILLL = 14;
            c1836370xt5.LLJJI = 14;
            c1836370xt5.LLJJIII = false;
        }
        int i2 = c1836370xt5.LLJILLL;
        c1836370xt5.LLJJ = i2;
        c1836370xt5.setFontSize(i2);
        if (z) {
            iLIZ = C416070GTd.LIZ(12.0d, c1836370xt5.getContext());
        }
        c1836370xt5.LLJJJ.setPathEffect(new CornerPathEffect(iLIZ));
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        float lineSpacingExtra = getLineSpacingExtra();
        float lineSpacingMultiplier = getLineSpacingMultiplier();
        setLineSpacing(0.0f, 1.0f);
        setLineSpacing(lineSpacingExtra, lineSpacingMultiplier);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) throws Throwable {
        String[] textInLines;
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        if (this.LLJJIII && (textInLines = getTextInLines()) != null) {
            int length = textInLines.length;
            Editable editableLLLIIIL = C2204961BRm.LLLIIIL(this, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6CV0TNJrjFT+VGtwrDPgFrNfxjCwZSeODpCZgAi+sxACTDGSjySpEBXETYFW6HJz8IX7dXItfrncbtCedtf5uC7mnQVOggE5DBr2G/XLFdWy3WIL28DuUkAzlc2EtNNmOYWLzOhf+mr/ENHO9fsp", null));
            if (editableLLLIIIL != null) {
                int length2 = editableLLLIIIL.length();
                if (this.LLJJL) {
                    this.LLJJIJI.invoke(Integer.valueOf(this.LLJJ));
                    this.LLJJL = false;
                }
                if (length > 5) {
                    i5 = this.LLJJI;
                } else {
                    i5 = this.LLJILLL;
                }
                C1826430xd3 c1826430xd3 = new C1826430xd3(this, i5);
                int i6 = this.LLJJ;
                if (i5 < i6) {
                    this.LLJJJJLIIL = length2;
                    c1826430xd3.invoke();
                } else {
                    if (i5 <= i6 || this.LLJJJJLIIL <= length2) {
                        return;
                    }
                    c1826430xd3.invoke();
                }
            }
        }
    }
}
