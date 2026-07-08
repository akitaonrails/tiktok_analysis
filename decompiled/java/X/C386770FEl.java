package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import java.util.ArrayList;
import java.util.Collections;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0FEl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C386770FEl extends C21410318qb implements InterfaceC19592111l1<TextStickerModel> {
    public C1664680tQA<TextStickerModel> LLIZ;
    public LifecycleOwner LLIZLLLIL;
    public Function1<? super String, ? extends Typeface> LLJ;
    public final int LLJI;
    public final int LLJIJIL;
    public final int LLJILJIL;
    public final int LLJILJILJ;
    public Paint LLJILLL;
    public Path LLJJ;
    public Path LLJJI;
    public Bitmap LLJJIII;
    public Rect LLJJIJI;
    public RectF LLJJIJIIJIL;
    public Paint LLJJIJIL;
    public final float LLJJJ;
    public final float LLJJJIL;
    public C0FK0 LLJJJJ;
    public final int LLJJJJJIL;
    public boolean LLJJJJLIIL;

    @Override // X.InterfaceC19592111l1
    public final void LIZJ(InteractStickerStruct interactStickerStruct, StickerModel stickerModel) {
    }

    @Override // X.InterfaceC19592111l1
    public final void LJIIZILJ() {
    }

    @Override // X.InterfaceC19592111l1
    public final void LJIJJLI() {
    }

    @Override // X.InterfaceC19592111l1
    public final void destroy() {
    }

    @Override // X.InterfaceC19592111l1
    public View getView() {
        return this;
    }

    public final RectF getDeleteIconRect() {
        C1664680tQA<TextStickerModel> c1664680tQA = this.LLIZ;
        if (c1664680tQA == null) {
            c1664680tQA = null;
        }
        float scale = c1664680tQA.LIZ.getBaseStickerModel().getScale();
        C1664680tQA<TextStickerModel> c1664680tQA2 = this.LLIZ;
        RectF visibleRectWithoutRotation = (c1664680tQA2 != null ? c1664680tQA2 : null).LIZ.getBaseModel().getVisibleRectWithoutRotation();
        float f = visibleRectWithoutRotation.left;
        float f2 = visibleRectWithoutRotation.top;
        float f3 = this.LLJJJIL;
        float f4 = 2;
        RectF rectF = new RectF(f, f2, (f3 * scale * f4) + f, (f3 * scale * f4) + f2);
        Matrix matrix = new Matrix();
        matrix.postRotate(getRotation(), visibleRectWithoutRotation.centerX(), visibleRectWithoutRotation.centerY());
        matrix.mapRect(rectF);
        return rectF;
    }

    public C386770FEl(Context context) {
        super(context, null, 0);
        this.LLJI = C1919207fS.LJIIIZ();
        this.LLJIJIL = C1919207fS.LJII();
        this.LLJILJIL = C1919207fS.LIZIZ() * 2;
        this.LLJILJILJ = C1919207fS.LJIIJJI();
        this.LLJILLL = new Paint();
        this.LLJJ = new Path();
        new TextPaint();
        this.LLJJJ = C418440Gaw.LIZIZ(12);
        this.LLJJJIL = C418440Gaw.LIZIZ(9);
        this.LLJJJJJIL = C1919207fS.LIZLLL();
    }

    private final void setFontService(Function1<? super String, ? extends Typeface> function1) {
        this.LLJ = function1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) throws Throwable {
        C21410318qb c21410318qb;
        Object text;
        Object obj;
        float lineBottom;
        C0WZX c0wzx = new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6nbJPdkiEQrAYo38If7d/GKSULBhVsNHdcN/GI7yuRLjISMUZoqFrvow==", null);
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()Landroid/text/Editable;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(998, "com/ss/android/ugc/aweme/tools/sticker/core/text/view/TextGuideView", "getText", this, objArr, "android.text.Editable", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(998, "com/ss/android/ugc/aweme/tools/sticker/core/text/view/TextGuideView", "getText", null, objArr, this, c0wzw, false);
            text = c0wsuLIZIZ.LIZIZ;
        } else {
            Object[] objArr2 = c0wsuLIZIZ.LIZJ;
            if (objArr2 != null && (obj = objArr2[0]) != null) {
                c21410318qb = (C21410318qb) obj;
            } else {
                c21410318qb = this;
            }
            text = c21410318qb.getText();
            c0wst.LIZ(998, "com/ss/android/ugc/aweme/tools/sticker/core/text/view/TextGuideView", "getText", text, objArr, c21410318qb, c0wzw, true);
        }
        if (String.valueOf(text).length() != 0 && getLayout() != null) {
            float f = getPaint().getFontMetrics().ascent - getPaint().getFontMetrics().top;
            float f2 = this.LLJJJ + this.LLJJJIL;
            ArrayList arrayList = new ArrayList();
            ArrayList<PointF> arrayList2 = new ArrayList();
            int lineCount = getLayout().getLineCount();
            float f3 = 0.0f;
            float fMin = 0.0f;
            float fMax = 0.0f;
            float fMax2 = 0.0f;
            for (int i = 0; i < lineCount; i++) {
                if (i == 0) {
                    lineBottom = getLayout().getLineTop(i) + f2;
                } else {
                    lineBottom = getLayout().getLineBottom(i - 1) + f + this.LLJJJJJIL;
                }
                float lineBottom2 = getLayout().getLineBottom(i) + f;
                if (i == getLayout().getLineCount() - 1) {
                    lineBottom2 += this.LLJILJILJ + f2 + this.LLJJJJJIL;
                }
                float lineLeft = getLayout().getLineLeft(i) - (this.LLJILJIL / 2);
                float lineRight = getLayout().getLineRight(i) + (this.LLJILJIL / 2);
                PointF pointF = new PointF(lineLeft, lineBottom);
                PointF pointF2 = new PointF(lineRight, lineBottom);
                PointF pointF3 = new PointF(lineLeft, lineBottom2);
                PointF pointF4 = new PointF(lineRight, lineBottom2);
                if (!Intrinsics.LJFF(pointF, C13LP.LJJLIIIJL(arrayList))) {
                    arrayList.add(pointF);
                }
                if (!Intrinsics.LJFF(pointF3, C13LP.LJJLIIIJJI(arrayList))) {
                    arrayList.add(pointF3);
                }
                if (!Intrinsics.LJFF(pointF2, C13LP.LJJLIIIJL(arrayList2))) {
                    arrayList2.add(pointF2);
                }
                if (!Intrinsics.LJFF(pointF4, C13LP.LJJLIIIJJI(arrayList2))) {
                    arrayList2.add(pointF4);
                }
                if (f3 != 0.0f) {
                    lineLeft = Math.min(lineLeft, f3);
                }
                f3 = lineLeft;
                if (fMin == 0.0f) {
                    fMin = lineBottom;
                } else {
                    fMin = Math.min(lineBottom, fMin);
                }
                if (fMax == 0.0f) {
                    fMax = lineRight;
                } else {
                    fMax = Math.max(lineRight, fMax);
                }
                if (fMax2 == 0.0f) {
                    fMax2 = lineBottom2;
                } else {
                    fMax2 = Math.max(lineBottom2, fMax2);
                }
            }
            this.LLJJ.reset();
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (i2 == 0) {
                    this.LLJJ.moveTo(((PointF) ListProtector.get(arrayList, i2)).x, ((PointF) ListProtector.get(arrayList, i2)).y);
                } else {
                    this.LLJJ.lineTo(((PointF) ListProtector.get(arrayList, i2)).x, ((PointF) ListProtector.get(arrayList, i2)).y);
                }
            }
            Collections.reverse(arrayList2);
            for (PointF pointF5 : arrayList2) {
                this.LLJJ.lineTo(pointF5.x, pointF5.y);
            }
            this.LLJJ.lineTo(((PointF) ListProtector.get(arrayList, 0)).x, ((PointF) ListProtector.get(arrayList, 0)).y);
            this.LLJJ.close();
            C1664680tQA<TextStickerModel> c1664680tQA = this.LLIZ;
            if (c1664680tQA == null) {
                c1664680tQA = null;
            }
            if (c1664680tQA.LIZ.getGuideType() != C0FVR.LANDSCAPE_VIDEO) {
                canvas.drawPath(this.LLJJ, this.LLJILLL);
            }
            RectF rectF = new RectF(f3, fMin, fMax, fMax2);
            float f4 = rectF.left;
            float f5 = this.LLJJJ;
            float f6 = f4 - f5;
            float f7 = rectF.right + f5;
            float f8 = rectF.top - f5;
            float f9 = rectF.bottom + f5;
            Path path = this.LLJJI;
            if (path == null) {
                path = null;
            }
            path.reset();
            path.moveTo(f6, f8);
            path.lineTo(f7, f8);
            path.lineTo(f7, f9);
            path.lineTo(f6, f9);
            path.lineTo(f6, f8);
            float f10 = this.LLJJJIL;
            this.LLJJIJIIJIL = new RectF(f6 - f10, f8 - f10, f6 + f10, f8 + f10);
        }
        if (!this.LLJJJJLIIL) {
            canvas.save();
            Path path2 = this.LLJJI;
            if (path2 == null) {
                path2 = null;
            }
            Paint paint = this.LLJJIJIL;
            if (paint == null) {
                paint = null;
            }
            canvas.drawPath(path2, paint);
            Bitmap bitmap = this.LLJJIII;
            if (bitmap == null) {
                bitmap = null;
            }
            Rect rect = this.LLJJIJI;
            if (rect == null) {
                rect = null;
            }
            RectF rectF2 = this.LLJJIJIIJIL;
            if (rectF2 == null) {
                rectF2 = null;
            }
            Paint paint2 = this.LLJJIJIL;
            if (paint2 == null) {
                paint2 = null;
            }
            canvas.drawBitmap(bitmap, rect, rectF2, paint2);
            canvas.restore();
        }
        super.onDraw(canvas);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C1664680tQA<TextStickerModel> c1664680tQA = this.LLIZ;
        if (c1664680tQA == null) {
            c1664680tQA = null;
        }
        if (!c1664680tQA.LIZ.getClickable()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setFontType(Typeface typeface) {
        setTypeface(typeface);
        setLineSpacing(getLineSpacingExtra() + this.LLJJJJJIL, getLineSpacingMultiplier());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        float f = 2;
        setMeasuredDimension((int) (getMeasuredWidth() + ((this.LLJJJ + this.LLJJJIL) * f) + this.LLJILJIL), (int) (getMeasuredHeight() + ((this.LLJJJ + this.LLJJJIL + this.LLJILJILJ) * f) + this.LLJJJJJIL));
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x01c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ(X.C1664680tQA<com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel> r11, androidx.lifecycle.LifecycleOwner r12, X.C0FK0 r13, kotlin.jvm.functions.Function1<? super java.lang.String, ? extends android.graphics.Typeface> r14) {
        /*
            Method dump skipped, instruction units count: 465
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C386770FEl.LJIIIIZZ(X.0tQA, androidx.lifecycle.LifecycleOwner, X.0FK0, kotlin.jvm.functions.Function1):void");
    }
}
