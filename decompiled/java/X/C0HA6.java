package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HA6, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HA6 extends View {
    public final Paint LL;
    public final Paint LLILLJJLI;
    public final Paint LLILLL;
    public final Paint LLILZ;
    public final float LLILZIL;
    public final float LLILZLL;
    public final float LLIZ;
    public final float LLIZLLLIL;
    public final float LLJ;
    public final RectF LLJI;
    public float LLJIJIL;
    public List<C0HA9> LLJILJIL;
    public C0HA9 LLJILJILJ;
    public C0HA8 LLJILLL;
    public Function1<? super Integer, Unit> LLJJ;

    private final int getSelectedIndex() {
        return this.LLJILJIL.indexOf(this.LLJILJILJ);
    }

    public final C0HA8 getMode() {
        return this.LLJILLL;
    }

    private final void setProgress(float f) {
        this.LLJIJIL = C13LZ.LIZLLL(f, 0.0f, 100.0f);
        invalidate();
    }

    public final void LIZ(int i) {
        if (i >= 0 && i < ((ArrayList) this.LLJILJIL).size() && i != getSelectedIndex()) {
            int i2 = C0HA7.LIZ[this.LLJILLL.ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    LIZIZ(((C0HA9) ListProtector.get(this.LLJILJIL, i)).LIZ);
                    return;
                }
                throw new C1954807lC();
            }
            this.LLJILJILJ = (C0HA9) ListProtector.get(this.LLJILJIL, i);
            Function1<? super Integer, Unit> function1 = this.LLJJ;
            if (function1 != null) {
                function1.invoke(Integer.valueOf(i));
            }
            LIZIZ(0.0f);
        }
    }

    public final void LIZIZ(float f) {
        setProgress(f);
        invalidate();
        if (this.LLJILLL == C0HA8.SINGLE_VIDEO) {
            Iterator it2 = ((ArrayList) this.LLJILJIL).iterator();
            C0HA9 c0ha9 = null;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                C0HA9 c0ha92 = (C0HA9) it2.next();
                float f2 = c0ha92.LIZ;
                if (f >= f2) {
                    c0ha9 = c0ha92;
                } else if (f2 > f && f2 - f <= 0.05d) {
                    c0ha9 = c0ha92;
                    break;
                }
            }
            if (!Intrinsics.LJFF(c0ha9, this.LLJILJILJ)) {
                this.LLJILJILJ = c0ha9;
                Function1<? super Integer, Unit> function1 = this.LLJJ;
                if (function1 != null) {
                    function1.invoke(Integer.valueOf(getSelectedIndex()));
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("updateProgress selectedIndex=");
                sbLIZ.append(getSelectedIndex());
                sbLIZ.append(", progress=");
                sbLIZ.append(f);
                C1022620cia.LIZIZ("MultiVideoProgressBar", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        super.onDraw(canvas);
        float measuredWidth = getMeasuredWidth();
        float f2 = 2;
        float measuredHeight = getMeasuredHeight() / f2;
        RectF rectF = this.LLJI;
        float f3 = this.LLILZIL;
        rectF.set(0.0f, measuredHeight - (f3 / f2), measuredWidth, (f3 / f2) + measuredHeight);
        RectF rectF2 = this.LLJI;
        float f4 = this.LLILZLL;
        canvas.drawRoundRect(rectF2, f4, f4, this.LL);
        float f5 = this.LLJIJIL;
        if (this.LLJILLL == C0HA8.MULTI_VIDEO && getSelectedIndex() >= 0 && ((ArrayList) this.LLJILJIL).size() > getSelectedIndex()) {
            float f6 = ((C0HA9) ListProtector.get(this.LLJILJIL, getSelectedIndex())).LIZ;
            if (getSelectedIndex() == ((ArrayList) this.LLJILJIL).size() - 1) {
                f = 100.0f;
            } else {
                f = ((C0HA9) ListProtector.get(this.LLJILJIL, getSelectedIndex() + 1)).LIZ;
            }
            f5 = f6 + ((f - f6) * (this.LLJIJIL / 100));
        }
        float f7 = 100;
        float f8 = (f5 * measuredWidth) / f7;
        RectF rectF3 = this.LLJI;
        float f9 = this.LLILZIL;
        rectF3.set(0.0f, measuredHeight - (f9 / f2), f8, (f9 / f2) + measuredHeight);
        RectF rectF4 = this.LLJI;
        float f10 = this.LLILZLL;
        canvas.drawRoundRect(rectF4, f10, f10, this.LLILLJJLI);
        Iterator it2 = ((ArrayList) this.LLJILJIL).iterator();
        while (it2.hasNext()) {
            float f11 = (((C0HA9) it2.next()).LIZ * measuredWidth) / f7;
            float f12 = this.LLIZLLLIL;
            float f13 = f11 - (f12 / f2);
            RectF rectF5 = this.LLJI;
            float f14 = this.LLILZIL;
            rectF5.set(f13, measuredHeight - (f14 / f2), f12 + f13, (f14 / f2) + measuredHeight);
            RectF rectF6 = this.LLJI;
            float f15 = this.LLJ;
            canvas.drawRoundRect(rectF6, f15, f15, this.LLILZ);
        }
        canvas.drawCircle(f8, measuredHeight, this.LLIZ, this.LLILLL);
    }

    public final void setIndexNodes(List<C0HA9> list) {
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<C0HA9> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(new C0HA9(C13LZ.LIZLLL(it2.next().LIZ, 0.0f, 100.0f)));
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        this.LLJILJIL = arrayList2;
        this.LLJILJILJ = (C0HA9) C13LP.LJJJLL(arrayList2);
        invalidate();
    }

    public final void setMode(C0HA8 c0ha8) {
        this.LLJILLL = c0ha8;
        invalidate();
    }

    public final void setOnNodeSwitchListener(Function1<? super Integer, Unit> function1) {
        this.LLJJ = function1;
    }

    public C0HA6(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Paint paint = new Paint(1);
        paint.setColor(872415231);
        paint.setStyle(Paint.Style.FILL);
        this.LL = paint;
        Paint paint2 = new Paint(1);
        paint2.setColor(-1);
        paint2.setStyle(Paint.Style.FILL);
        this.LLILLJJLI = paint2;
        Paint paint3 = new Paint(1);
        paint3.setColor(-1);
        paint3.setStyle(Paint.Style.FILL);
        this.LLILLL = paint3;
        Paint paint4 = new Paint(1);
        paint4.setColor(1728053247);
        paint4.setStyle(Paint.Style.FILL);
        this.LLILZ = paint4;
        this.LLILZIL = C339190DRl.LIZ(4.0f);
        this.LLILZLL = C339190DRl.LIZ(4.0f);
        this.LLIZ = C339190DRl.LIZ(4.0f);
        this.LLIZLLLIL = C339190DRl.LIZ(2.0f);
        this.LLJ = C339190DRl.LIZ(1.0f);
        this.LLJI = new RectF();
        this.LLJILJIL = new ArrayList();
        this.LLJILLL = C0HA8.MULTI_VIDEO;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.resolveSize((int) Math.max(this.LLILZIL, 2 * this.LLIZ), i2));
    }
}
