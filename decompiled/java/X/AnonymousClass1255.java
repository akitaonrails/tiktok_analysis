package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.ss.android.ugc.aweme.live.livehostimpl.edit.text.bean.InteractTextStructWrap;
import java.util.List;

/* JADX INFO: renamed from: X.1255, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public class AnonymousClass1255 extends C21410318qb {
    public static final /* synthetic */ int LLJJJ = 0;
    public int LLIZ;
    public Paint LLIZLLLIL;
    public TextPaint LLJ;
    public Path LLJI;
    public int LLJIJIL;
    public int LLJILJIL;
    public int LLJILJILJ;
    public int LLJILLL;
    public int LLJJ;
    public int LLJJI;
    public boolean LLJJIII;
    public int LLJJIJI;
    public int LLJJIJIIJIL;
    public List<InteractTextStructWrap> LLJJIJIL;

    public int getScene() {
        return 0;
    }

    private String[] getTextStr() {
        if (TextUtils.isEmpty(C2204961BRm.LLZZZZ(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOahdZqA0DsPdiyW4HErLsm6UD8n4bHwAom1oFIf0L5Un2ObuK4AgD8ijyjC46yQ", null)))) {
            return null;
        }
        Layout layout = getLayout();
        String string = C2204961BRm.LLZZZZ(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOahdZqA0DsPdiyW4HErLsm6UD8n4bHwAom1oFIf0L5Un2ObuK4AgD8ijyjC46yQ", null)).toString();
        String[] strArr = new String[getLineCount()];
        int i = 0;
        int i2 = 0;
        while (i < getLineCount()) {
            int lineEnd = layout.getLineEnd(i);
            strArr[i] = string.substring(i2, lineEnd);
            layout.getLineBounds(i, new Rect());
            i++;
            i2 = lineEnd;
        }
        return strArr;
    }

    public int getAlign() {
        return this.LLJILJILJ;
    }

    public int getBgColor() {
        return this.LLJJIJIIJIL;
    }

    public int getBgColorMode() {
        return this.LLJJIJI;
    }

    public List<InteractTextStructWrap> getTextStructWrapList() {
        return this.LLJJIJIL;
    }

    private void setMaskBlurColor(int i) {
        setTextColor(-1);
        setShadowLayer(12.0f, 0.0f, 0.0f, i);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        char c;
        char c2;
        int i;
        int i2 = this.LLJILJIL;
        int i3 = 1;
        if (i2 != 1 && i2 != 4 && !TextUtils.isEmpty(C2204961BRm.LLZZZZ(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOahdZqA0DsPdiyW4HErLsm6UD8n4bHwAom1oFIf0L5Un2ObuK4AgD8ijyjC46yQ", null)).toString())) {
            this.LLIZLLLIL.setColor(this.LLJIJIL);
            String[] textStr = getTextStr();
            if (textStr != null && textStr.length != 0) {
                int length = textStr.length;
                Point[][] pointArr = new Point[length][];
                Paint.FontMetrics fontMetrics = getPaint().getFontMetrics();
                int iCeil = (int) Math.ceil(fontMetrics.descent - fontMetrics.ascent);
                int textSize = ((int) getTextSize()) / 4;
                if (this.LLJILJILJ == 1) {
                    this.LLJILLL = getPaddingLeft();
                }
                if (this.LLJILJILJ == 3) {
                    this.LLJILLL = getMeasuredWidth() - getPaddingRight();
                }
                if (this.LLJILJILJ == 2) {
                    this.LLJILLL = getMeasuredWidth() / 2;
                }
                int iMeasureText = -1;
                int iMeasureText2 = -1;
                int i4 = 0;
                int i5 = 0;
                int i6 = 0;
                int i7 = 0;
                int i8 = 0;
                int i9 = 0;
                while (i4 < length) {
                    int iMeasureText3 = (int) getPaint().measureText(textStr[i4]);
                    int i10 = this.LLJILLL;
                    int i11 = iMeasureText3 / 2;
                    int i12 = this.LLIZ * 2;
                    int i13 = (i10 - i11) - i12;
                    int measuredWidth = i10 + i11 + i12;
                    int i14 = this.LLJILJILJ;
                    if (i14 == i3) {
                        i13 = i10 - i12;
                        measuredWidth = i10 + iMeasureText3 + i12;
                    } else if (i14 == 3) {
                        i13 = (i10 - iMeasureText3) - i12;
                        measuredWidth = i10 + i12;
                    }
                    if (TextUtils.isEmpty(textStr[i4]) || textStr[i4].trim().length() == 0) {
                        measuredWidth = getMeasuredWidth() / 2;
                        int i15 = this.LLJILJILJ;
                        if (i15 == 1 || i15 == 3) {
                            measuredWidth = this.LLJILLL;
                        }
                        i13 = measuredWidth;
                    }
                    if (Math.abs(iMeasureText3 - i5) >= textSize || ((i = this.LLJILJILJ) != 1 ? i != 3 ? i != 2 || i7 <= 0 : i7 <= 0 : i6 <= 0)) {
                        i6 = measuredWidth;
                        i7 = i13;
                    }
                    if (i4 == 0) {
                        C196986125g c196986125gLJFF = C196986125g.LJFF();
                        int scene = getScene();
                        c196986125gLJFF.getClass();
                        String[] strArr = C196986125g.LJI;
                        int length2 = strArr.length;
                        int i16 = 0;
                        while (true) {
                            if (i16 < length2) {
                                if (strArr[i16].equals(C196986125g.LJFF().LIZLLL(scene))) {
                                    i8 = this.LLJJ;
                                    break;
                                }
                                i16++;
                            } else {
                                i8 = this.LLJJ - this.LLIZ;
                                break;
                            }
                        }
                    }
                    int i17 = i8 + iCeil;
                    if (length > 1) {
                        if (i4 > 0) {
                            iMeasureText = (int) getPaint().measureText(textStr[i4 - 1]);
                        }
                        if (i4 < length - 1) {
                            iMeasureText2 = (int) getPaint().measureText(textStr[i4 + 1]);
                        }
                    }
                    if (iMeasureText > 0 && iMeasureText3 >= iMeasureText) {
                        i17 += this.LLIZ;
                    }
                    if (iMeasureText2 > 0 && iMeasureText3 > iMeasureText2) {
                        i17 += this.LLIZ;
                    }
                    if (i4 == 0) {
                        i8 -= this.LLIZ;
                    }
                    if (i4 == length - 1) {
                        i17 += this.LLIZ;
                    }
                    pointArr[i4] = new Point[]{new Point(i7, i8), new Point(i6, i8), new Point(i6, i17), new Point(i7, i17)};
                    if (iMeasureText3 > i9) {
                        i9 = iMeasureText3;
                    }
                    i4++;
                    i5 = iMeasureText3;
                    i8 = i17;
                    i3 = 1;
                }
                this.LLJI.reset();
                for (int i18 = 0; i18 < length; i18++) {
                    if (i18 == 0) {
                        Path path = this.LLJI;
                        Point point = pointArr[i18][0];
                        path.moveTo(point.x, point.y);
                    }
                    Path path2 = this.LLJI;
                    Point point2 = pointArr[i18][1];
                    path2.lineTo(point2.x, point2.y);
                    Point[] pointArr2 = pointArr[i18];
                    int i19 = pointArr2[0].x;
                    int i20 = pointArr2[1].x;
                    if (i19 == i20) {
                        this.LLJI.lineTo(i20, r3.y);
                        Path path3 = this.LLJI;
                        c2 = 2;
                        Point point3 = pointArr[i18][2];
                        path3.lineTo(point3.x, point3.y);
                    } else {
                        c2 = 2;
                    }
                    Path path4 = this.LLJI;
                    Point point4 = pointArr[i18][c2];
                    path4.lineTo(point4.x, point4.y);
                }
                char c3 = 1;
                int i21 = length - 1;
                while (i21 >= 0) {
                    Point[] pointArr3 = pointArr[i21];
                    if (pointArr3[0].x == pointArr3[c3].x) {
                        Path path5 = this.LLJI;
                        c = 3;
                        Point point5 = pointArr3[3];
                        path5.lineTo(point5.x, point5.y);
                    } else {
                        c = 3;
                    }
                    Path path6 = this.LLJI;
                    Point point6 = pointArr[i21][c];
                    path6.lineTo(point6.x, point6.y);
                    Point[] pointArr4 = pointArr[i21];
                    int i22 = pointArr4[0].x;
                    if (i22 == pointArr4[1].x) {
                        this.LLJI.lineTo(i22, r3.y);
                    }
                    Path path7 = this.LLJI;
                    Point point7 = pointArr[i21][0];
                    path7.lineTo(point7.x, point7.y);
                    i21--;
                    c3 = 1;
                }
                Path path8 = this.LLJI;
                Point point8 = pointArr[0][1];
                path8.lineTo(point8.x, point8.y);
                canvas.drawPath(this.LLJI, this.LLIZLLLIL);
            }
        }
        if (this.LLJILJIL == 4) {
            TextPaint paint = getPaint();
            Paint.Cap strokeCap = paint.getStrokeCap();
            paint.setStrokeCap(Paint.Cap.ROUND);
            Paint.Join strokeJoin = paint.getStrokeJoin();
            paint.setStrokeJoin(Paint.Join.ROUND);
            Paint.Style style = paint.getStyle();
            paint.setStyle(Paint.Style.FILL_AND_STROKE);
            float strokeWidth = paint.getStrokeWidth();
            Context context = getContext();
            paint.setStrokeWidth((C11VU.LIZIZ(4.0f, context) / TypedValue.applyDimension(2, 64.0f, context.getResources().getDisplayMetrics())) * getTextSize());
            super.onDraw(canvas);
            canvas.drawRect(0.0f, 0.0f, Math.max(getLayout().getWidth(), getWidth()) * 1.5f, Math.max(getLayout().getHeight(), getHeight()) * 1.5f, this.LLJ);
            paint.setStrokeCap(strokeCap);
            paint.setStrokeJoin(strokeJoin);
            paint.setStyle(style);
            paint.setStrokeWidth(strokeWidth);
        }
        super.onDraw(canvas);
    }

    public void setAligin(int i) {
        this.LLJILJILJ = i;
        if (i == 1) {
            setGravity(8388611);
        } else if (i == 2) {
            setGravity(17);
        } else {
            if (i != 3) {
                return;
            }
            setGravity(8388613);
        }
    }

    public void setFontSize(int i) {
        float f = i;
        float f2 = f / 28.0f;
        this.LLIZ = (int) (C11VU.LIZIZ(6.0f, getContext()) * f2);
        this.LLJJI = (int) (C11VU.LIZIZ(5.0f, getContext()) * f2);
        this.LLIZLLLIL.setPathEffect(new CornerPathEffect(this.LLJJI));
        setLineSpacing(this.LLIZ, getLineSpacingMultiplier());
        setTextSize(f);
    }

    public void setFontType(Typeface typeface) {
        if (getTypeface() != typeface) {
            setTypeface(typeface);
            if (this.LLJ.getTypeface() != typeface) {
                this.LLJ.setTypeface(typeface);
            }
        }
        C196986125g c196986125gLJFF = C196986125g.LJFF();
        int scene = getScene();
        boolean z = false;
        if (c196986125gLJFF.LIZJ(scene) != null && c196986125gLJFF.LIZJ(scene).enableMaskBlurLightColor == 1) {
            z = true;
        }
        this.LLJJIII = z;
        if (z) {
            setMaskBlurColor(getCurrentTextColor());
        }
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i) {
        if (i > 0) {
            super.setMaxWidth(i);
        }
    }

    public void setMode(int i) {
        this.LLJILJIL = i;
    }

    public void setTextStructWrapList(List<InteractTextStructWrap> list) {
        this.LLJJIJIL = list;
    }

    public AnonymousClass1255(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLJIJIL = -1;
        this.LLJILJIL = 1;
        this.LLJILJILJ = 2;
        this.LLIZ = (int) C11VU.LIZIZ(6.0f, context);
        this.LLJJI = (int) C11VU.LIZIZ(5.0f, context);
        Paint paint = new Paint();
        this.LLIZLLLIL = paint;
        paint.setColor(this.LLJIJIL);
        this.LLIZLLLIL.setStyle(Paint.Style.FILL);
        this.LLIZLLLIL.setAntiAlias(true);
        this.LLIZLLLIL.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        this.LLIZLLLIL.setPathEffect(new CornerPathEffect(this.LLJJI));
        this.LLJI = new Path();
        setLayerType(1, null);
        setLineSpacing(this.LLIZ, getLineSpacingMultiplier());
        TextPaint textPaint = new TextPaint();
        this.LLJ = textPaint;
        textPaint.set(getPaint());
        this.LLJ.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        this.LLJ.setStyle(Paint.Style.FILL);
    }

    public final void LJIIIIZZ(int i, int i2) {
        this.LLJJIJI = i;
        this.LLJJIJIIJIL = i2;
        if (this.LLJJIII) {
            setMaskBlurColor(i2);
            this.LLJILJIL = 1;
            return;
        }
        setShadowLayer(0.0f, 0.0f, 0.0f, i2);
        if (i == 1) {
            this.LLJILJIL = 1;
            this.LLJIJIL = i2;
            setBackground(null);
            setTextColor(i2);
            return;
        }
        if (i == 4) {
            this.LLJILJIL = 4;
            this.LLJIJIL = i2;
            this.LLJ.setColor(AnonymousClass1256.LIZ(i2));
            setBackground(null);
            setTextColor(i2);
            setShadowLayer(12.0f, 0.0f, 0.0f, 0);
            if (Build.VERSION.SDK_INT < 28) {
                return;
            }
            setFallbackLineSpacing(false);
            return;
        }
        if (i == 2) {
            this.LLJILJIL = 2;
            this.LLJIJIL = i2;
            if (i2 == -1) {
                setTextColor(-16777216);
                return;
            } else {
                setTextColor(-1);
                return;
            }
        }
        if (i != 3) {
            return;
        }
        this.LLJILJIL = 3;
        this.LLJIJIL = Color.argb(153, (16711680 & i2) >> 16, (65280 & i2) >> 8, i2 & 255);
        setTextColor(-1);
    }

    public final void LJIIIZ(int i, String str) {
        setText(str);
        setSelection(Math.min(i, C2204961BRm.LLZZZZ(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOahdZqA0DsPdiyW4HErLsm6UD8n4bHwAom1oFIf0L5Un2ObuK4AgD8ijyjC46yQ", null)).toString().length()));
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.LLJILLL = getMeasuredWidth() / 2;
        this.LLJJ = (getLineHeight() - this.LLIZ) / 2;
    }

    @Override // android.widget.TextView
    public final void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        if (C2204961BRm.LLZZZZ(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOahdZqA0DsPdiyW4HErLsm6UD8n4bHwAom1oFIf0L5Un2ObuK4AgD8ijyjC46yQ", null)) != null && i == i2) {
            if (AnonymousClass1258.LIZLLL(C2204961BRm.LLZZZZ(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOahdZqA0DsPdiyW4HErLsm6UD8n4bHwAom1oFIf0L5Un2ObuK4AgD8ijyjC46yQ", null)).length(), this.LLJJIJIL)) {
                for (InteractTextStructWrap interactTextStructWrap : this.LLJJIJIL) {
                    if (i > interactTextStructWrap.getRange().getStart() && i < interactTextStructWrap.getRange().getEnd()) {
                        setSelection(Math.min(interactTextStructWrap.getRange().getEnd(), C2204961BRm.LLZZZZ(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOahdZqA0DsPdiyW4HErLsm6UD8n4bHwAom1oFIf0L5Un2ObuK4AgD8ijyjC46yQ", null)).toString().length()));
                        return;
                    }
                }
            }
        }
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        float lineSpacingExtra = getLineSpacingExtra();
        float lineSpacingMultiplier = getLineSpacingMultiplier();
        setLineSpacing(0.0f, 1.0f);
        setLineSpacing(lineSpacingExtra, lineSpacingMultiplier);
        if (getLineCount() > 20) {
            C2204961BRm.LLZZZZ(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOahdZqA0DsPdiyW4HErLsm6UD8n4bHwAom1oFIf0L5Un2ObuK4AgD8ijyjC46yQ", null)).toString().substring(0, r2.length() - 1);
        }
    }
}
