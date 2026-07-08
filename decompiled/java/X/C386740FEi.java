package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.DashPathEffect;
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
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.als.ui.state.LiveState;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextFontModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0FEi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C386740FEi extends C21410318qb implements InterfaceC19592111l1<TextStickerModel> {
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
    public Paint LLJJIII;
    public final float LLJJIJI;
    public final float LLJJIJIIJIL;
    public C0FK0 LLJJIJIL;
    public final int LLJJJ;
    public boolean LLJJJIL;

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

    public final void LJIIIZ() {
        Paint paint = new Paint();
        this.LLJILLL = paint;
        paint.setColor(-1);
        this.LLJILLL.setStyle(Paint.Style.FILL);
        this.LLJILLL.setAntiAlias(true);
        this.LLJILLL.setPathEffect(new CornerPathEffect(this.LLJIJIL));
        this.LLJJ = new Path();
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
        float f3 = this.LLJJIJIIJIL;
        float f4 = 2;
        RectF rectF = new RectF(f, f2, (f3 * scale * f4) + f, (f3 * scale * f4) + f2);
        Matrix matrix = new Matrix();
        matrix.postRotate(getRotation(), visibleRectWithoutRotation.centerX(), visibleRectWithoutRotation.centerY());
        matrix.mapRect(rectF);
        return rectF;
    }

    public C386740FEi(Context context) {
        super(context, null, 0);
        this.LLJI = C1919207fS.LJIIIZ();
        this.LLJIJIL = C1919207fS.LJII();
        this.LLJILJIL = C1919207fS.LIZIZ() * 2;
        this.LLJILJILJ = C1919207fS.LJIIJJI();
        this.LLJILLL = new Paint();
        this.LLJJ = new Path();
        new TextPaint();
        this.LLJJIJI = C418440Gaw.LIZIZ(12);
        this.LLJJIJIIJIL = C418440Gaw.LIZIZ(9);
        this.LLJJJ = C1919207fS.LIZLLL();
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
        C0WZX c0wzx = new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6nbJPdkiEQrAYo38If7d/GKSULBhVsNHdcN/GI7yuRLiMIKHF5l/IAn5793fEn", null);
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()Landroid/text/Editable;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(998, "com/ss/android/ugc/aweme/tools/sticker/core/text/view/TextVopStickerView", "getText", this, objArr, "android.text.Editable", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(998, "com/ss/android/ugc/aweme/tools/sticker/core/text/view/TextVopStickerView", "getText", null, objArr, this, c0wzw, false);
            text = c0wsuLIZIZ.LIZIZ;
        } else {
            Object[] objArr2 = c0wsuLIZIZ.LIZJ;
            if (objArr2 != null && (obj = objArr2[0]) != null) {
                c21410318qb = (C21410318qb) obj;
            } else {
                c21410318qb = this;
            }
            text = c21410318qb.getText();
            c0wst.LIZ(998, "com/ss/android/ugc/aweme/tools/sticker/core/text/view/TextVopStickerView", "getText", text, objArr, c21410318qb, c0wzw, true);
        }
        if (String.valueOf(text).length() != 0 && getLayout() != null) {
            float f = getPaint().getFontMetrics().ascent - getPaint().getFontMetrics().top;
            float f2 = this.LLJJIJI + this.LLJJIJIIJIL;
            ArrayList arrayList = new ArrayList();
            ArrayList<PointF> arrayList2 = new ArrayList();
            int lineCount = getLayout().getLineCount();
            float fMin = 0.0f;
            float fMin2 = 0.0f;
            float fMax = 0.0f;
            float f3 = 0.0f;
            for (int i = 0; i < lineCount; i++) {
                if (i == 0) {
                    lineBottom = getLayout().getLineTop(i) + f2;
                } else {
                    lineBottom = this.LLJJJ + getLayout().getLineBottom(i - 1) + f;
                }
                float lineBottom2 = getLayout().getLineBottom(i) + f;
                if (i == getLayout().getLineCount() - 1) {
                    lineBottom2 += this.LLJILJILJ + f2 + this.LLJJJ;
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
                if (fMin == 0.0f) {
                    fMin = lineLeft;
                } else {
                    fMin = Math.min(lineLeft, fMin);
                }
                if (fMin2 == 0.0f) {
                    fMin2 = lineBottom;
                } else {
                    fMin2 = Math.min(lineBottom, fMin2);
                }
                if (fMax == 0.0f) {
                    fMax = lineRight;
                } else {
                    fMax = Math.max(lineRight, fMax);
                }
                if (f3 != 0.0f) {
                    lineBottom2 = Math.max(lineBottom2, f3);
                }
                f3 = lineBottom2;
            }
            C1664680tQA<TextStickerModel> c1664680tQA = this.LLIZ;
            if (c1664680tQA == null) {
                c1664680tQA = null;
            }
            int mode = c1664680tQA.LIZ.getMode();
            if (mode != 2 && mode != 3) {
                this.LLJILLL.setColor(0);
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
            canvas.drawPath(this.LLJJ, this.LLJILLL);
            RectF rectF = new RectF(fMin, fMin2, fMax, f3);
            float f4 = rectF.left;
            float f5 = this.LLJJIJI;
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
            float f10 = this.LLJJIJIIJIL;
            new RectF(f6 - f10, f8 - f10, f6 + f10, f8 + f10);
        }
        if (!this.LLJJJIL) {
            canvas.save();
            Path path2 = this.LLJJI;
            if (path2 == null) {
                path2 = null;
            }
            Paint paint = this.LLJJIII;
            if (paint == null) {
                paint = null;
            }
            canvas.drawPath(path2, paint);
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
        setLineSpacing(getLineSpacingExtra() + this.LLJJJ, getLineSpacingMultiplier());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        float f = 2;
        setMeasuredDimension((int) (getMeasuredWidth() + ((this.LLJJIJI + this.LLJJIJIIJIL) * f) + this.LLJILJIL), (int) (getMeasuredHeight() + ((this.LLJJIJI + this.LLJJIJIIJIL + this.LLJILJILJ) * f) + this.LLJJJ));
    }

    public final void LJIIIIZZ(C1664680tQA<TextStickerModel> c1664680tQA, LifecycleOwner lifecycleOwner, C0FK0 c0fk0, Function1<? super String, ? extends Typeface> function1) {
        setFontService(function1);
        this.LLJJIJIL = c0fk0;
        this.LLIZ = c1664680tQA;
        this.LLIZLLLIL = lifecycleOwner;
        LifecycleOwner lifecycleOwner2 = null;
        try {
            setLineSpacing(this.LLJI, getLineSpacingMultiplier());
            getPaint().setAntiAlias(true);
            setMaxLines(4);
            LJIIIZ();
            C0FK0 c0fk02 = this.LLJJIJIL;
            if (c0fk02 == null || !c0fk02.LJIILJJIL) {
                setLayerType(2, null);
            }
            C1664680tQA<TextStickerModel> c1664680tQA2 = this.LLIZ;
            if (c1664680tQA2 == null) {
                c1664680tQA2 = null;
            }
            setText(c1664680tQA2.LIZ.getTextStr());
            C1664680tQA<TextStickerModel> c1664680tQA3 = this.LLIZ;
            if (c1664680tQA3 == null) {
                c1664680tQA3 = null;
            }
            setSelection(Math.min(c1664680tQA3.LIZ.getTextStr().length(), length()));
            C1664680tQA<TextStickerModel> c1664680tQA4 = this.LLIZ;
            if (c1664680tQA4 == null) {
                c1664680tQA4 = null;
            }
            setTextSize(c1664680tQA4.LIZ.getFontModel().fontSize);
            setIncludeFontPadding(false);
            setGravity(17);
            C1664680tQA<TextStickerModel> c1664680tQA5 = this.LLIZ;
            if (c1664680tQA5 == null) {
                c1664680tQA5 = null;
            }
            int color = c1664680tQA5.LIZ.getColor();
            setShadowLayer(0.0f, 0.0f, 0.0f, color);
            this.LLJILLL.setColor(color);
            setTextColor(-1);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(getContext().getResources(), R.drawable.c3e);
        new Rect(0, 0, bitmapDecodeResource.getWidth(), bitmapDecodeResource.getHeight());
        Paint paint = new Paint();
        paint.setPathEffect(new DashPathEffect(new float[]{C418440Gaw.LIZIZ(6), C418440Gaw.LIZIZ(6)}, 0.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        paint.setStrokeWidth(C418440Gaw.LIZIZ(1));
        paint.setAntiAlias(true);
        this.LLJJIII = paint;
        this.LLJJI = new Path();
        C1664680tQA<TextStickerModel> c1664680tQA6 = this.LLIZ;
        if (c1664680tQA6 == null) {
            c1664680tQA6 = null;
        }
        LiveState<V> liveStateLIZ = c1664680tQA6.LIZ(new C2217371BqR() { // from class: X.0F8v
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((TextStickerModel) obj).getVisible());
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((TextStickerModel) obj).setVisible(((Boolean) obj2).booleanValue());
            }
        });
        LifecycleOwner lifecycleOwner3 = this.LLIZLLLIL;
        if (lifecycleOwner3 == null) {
            lifecycleOwner3 = null;
        }
        liveStateLIZ.LJIIIZ(lifecycleOwner3, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 995));
        C1664680tQA<TextStickerModel> c1664680tQA7 = this.LLIZ;
        if (c1664680tQA7 == null) {
            c1664680tQA7 = null;
        }
        LiveState liveStateLJIIIIZZ = c1664680tQA7.LIZ(new C2217371BqR() { // from class: X.0FEj
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((TextStickerModel) obj).getFontModel();
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((TextStickerModel) obj).setFontModel((TextFontModel) obj2);
            }
        }).LJIIIIZZ(new C2217381BqS() { // from class: X.0FEk
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((TextFontModel) obj).fileName;
            }
        });
        LifecycleOwner lifecycleOwner4 = this.LLIZLLLIL;
        if (lifecycleOwner4 == null) {
            lifecycleOwner4 = null;
        }
        liveStateLJIIIIZZ.LJIIIZ(lifecycleOwner4, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 997));
        C1664680tQA<TextStickerModel> c1664680tQA8 = this.LLIZ;
        if (c1664680tQA8 == null) {
            c1664680tQA8 = null;
        }
        LiveState<V> liveStateLIZ2 = c1664680tQA8.LIZ(new C2217381BqS() { // from class: X.0F9L
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((TextStickerModel) obj).getEditable());
            }
        });
        LifecycleOwner lifecycleOwner5 = this.LLIZLLLIL;
        if (lifecycleOwner5 != null) {
            lifecycleOwner2 = lifecycleOwner5;
        }
        liveStateLIZ2.LJIIIZ(lifecycleOwner2, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 999));
    }
}
