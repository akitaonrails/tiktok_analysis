package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0GjO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C423680GjO extends View {
    public static final float LLJIJIL = C418440Gaw.LIZIZ(Double.valueOf(5.5d));
    public static final float LLJILJIL = C418440Gaw.LIZIZ(Double.valueOf(2.5d));
    public final Paint LL;
    public final Paint LLILLJJLI;
    public final Paint LLILLL;
    public Bitmap LLILZ;
    public Canvas LLILZIL;
    public final List<Float> LLILZLL;
    public final List<Float> LLIZ;
    public float LLIZLLLIL;
    public int LLJ;
    public int LLJI;

    public C423680GjO(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final void LIZ() {
        setProgress(1.0f);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        List<Float> listSingletonList;
        if (getWidth() != this.LLJI || getHeight() != this.LLJ) {
            this.LLJI = getWidth();
            this.LLJ = getHeight();
            Bitmap bitmap = this.LLILZ;
            if (bitmap != null) {
                bitmap.recycle();
                BitmapCrashChecker.recordBitmapRecyclePoint(bitmap);
            }
            if (getWidth() != 0 && getHeight() != 0) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
                this.LLILZ = bitmapCreateBitmap;
                this.LLILZIL = new Canvas(bitmapCreateBitmap);
                Paint paint = this.LL;
                Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                paint.setShader(new BitmapShader(bitmapCreateBitmap, tileMode, tileMode));
                ((ArrayList) this.LLIZ).clear();
            } else {
                return;
            }
        }
        int i = 0;
        if (((ArrayList) this.LLIZ).isEmpty() && (!this.LLILZLL.isEmpty())) {
            int width = (int) (getWidth() / LLJIJIL);
            List<Float> list = this.LLIZ;
            float[] fArrLLI = C13LP.LLI(this.LLILZLL);
            if (fArrLLI.length <= 1) {
                listSingletonList = C13LQ.LJJLIL(fArrLLI);
            } else if (width <= 1) {
                listSingletonList = Collections.singletonList(Float.valueOf(C13LQ.LJIJJ(fArrLLI)));
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Float.valueOf(C13LQ.LJIJJ(fArrLLI)));
                float length = 1.0f / (fArrLLI.length - 1);
                int i2 = width - 1;
                int i3 = 1;
                while (true) {
                    float f = 0.0f;
                    if (i3 >= i2) {
                        break;
                    }
                    float f2 = i3 / i2;
                    int iLJ = C13LZ.LJ((int) (f2 / length), 0, fArrLLI.length - 2);
                    float f3 = f2 - (iLJ * length);
                    if (f3 >= 0.0f) {
                        f = f3;
                    }
                    float f4 = fArrLLI[iLJ];
                    arrayList.add(Float.valueOf(f4 + ((f / length) * (fArrLLI[iLJ + 1] - f4))));
                    i3++;
                }
                arrayList.add(Float.valueOf(C13LQ.LJJJI(fArrLLI)));
                float fMax = Math.max(0.0f, Math.min(1.0f, 0.5f));
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(Float.valueOf(0.0f));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(Float.valueOf((((Number) it2.next()).floatValue() * fMax) + ((1 - fMax) * ((Number) ListProtector.get(arrayList2, arrayList2.size() - 1)).floatValue())));
                }
                C19719612Di.LJJIIZ(arrayList2);
                listSingletonList = arrayList2;
            }
            ((ArrayList) list).addAll(listSingletonList);
        }
        Canvas canvas2 = this.LLILZIL;
        if (canvas2 != null) {
            canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.LLILLL);
            canvas2.drawRect(0.0f, 0.0f, getWidth() * this.LLIZLLLIL, getHeight(), this.LLILLJJLI);
        }
        getWidth();
        for (Float f5 : this.LLIZ) {
            int i4 = i + 1;
            if (i >= 0) {
                float fFloatValue = f5.floatValue();
                float height = getHeight();
                float f6 = LLJILJIL;
                float f7 = fFloatValue * (height - f6);
                float fLIZIZ = C418440Gaw.LIZIZ(2);
                if (f7 < fLIZIZ) {
                    f7 = fLIZIZ;
                }
                float f8 = (i + 0.5f) * LLJIJIL;
                float height2 = (f6 / 2) + (((canvas.getHeight() - f6) - f7) / 2.0f);
                canvas.drawLine(f8, height2, f8, height2 + f7, this.LL);
                i = i4;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }

    public final void set(List<Float> list) {
        ((ArrayList) this.LLILZLL).clear();
        ((ArrayList) this.LLILZLL).addAll(list);
        ((ArrayList) this.LLIZ).clear();
        invalidate();
    }

    public final void setProgress(float f) {
        this.LLIZLLLIL = f;
        invalidate();
    }

    public C423680GjO(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        Paint paint = new Paint();
        paint.setStrokeWidth(LLJILJIL);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        this.LL = paint;
        Paint paint2 = new Paint();
        paint2.setColor(-16777216);
        paint2.setAntiAlias(true);
        paint2.setStyle(Paint.Style.FILL);
        this.LLILLJJLI = paint2;
        Paint paint3 = new Paint();
        paint3.setColor(-1);
        paint3.setAntiAlias(true);
        paint3.setStyle(Paint.Style.FILL);
        this.LLILLL = paint3;
        this.LLILZLL = new ArrayList();
        this.LLIZ = new ArrayList();
        this.LLIZLLLIL = 1.0f;
    }
}
