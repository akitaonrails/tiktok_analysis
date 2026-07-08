package X;

import Y.ALAdapterS2S0100000_5;
import Y.AUListenerS255S0100000_5;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0Ebo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C368020Ebo extends AbstractC367990Ebl {
    public final C19EG LJIILLIIL;
    public float LJIIZILJ;
    public float LJIJ;
    public long LJIJI;
    public final Rect LJIJJ;
    public float LJIJJLI;
    public int LJIL;
    public final int LJJ;
    public float LJJI;
    public int LJJIFFI;
    public final int LJJII;
    public float LJJIII;
    public final int LJJIIJ;
    public boolean LJJIIJZLJL;
    public final Rect LJJIIZ;
    public final Rect LJJIIZI;
    public final Paint LJJIJ;
    public final Paint LJJIJIIJI;
    public final C01GW LJJIJIIJIL;
    public final C01GW LJJIJIL;
    public final ValueAnimator LJJIJL;
    public final C01GW LJJIJLIJ;
    public Function0<? extends InterfaceC367710EbJ> LJJIL;
    public InterfaceC367710EbJ LJJIZ;
    public boolean LJJJ;
    public List<Float> LJJJI;
    public final RectF LJJJIL;
    public final C01GW LJJJJ;

    @Override // X.InterfaceC369090EdX
    public final void onMove(int i, int i2, NLETrackSlot nLETrackSlot, long j, long j2, long j3, boolean z) {
    }

    public final C368380EcO LJIJ() {
        return (C368380EcO) this.LJJIJIL.getValue();
    }

    @Override // X.AbstractC367990Ebl
    public final void LIZLLL(Canvas canvas) {
        float fLJIIIIZZ;
        float f;
        float fLJIIIZ;
        float fLJIIIIZZ2;
        int iIntValue;
        float f2;
        int iLIZ;
        float fLIZIZ;
        Function0<? extends InterfaceC367710EbJ> function0;
        float measuredWidth;
        float measuredWidth2;
        List<Float> list = this.LJJJI;
        if (list != null && !list.isEmpty() && this.LJJJ) {
            int i = C368630Ecn.LLLLJI;
            float fLIZ = C369020EdQ.LIZ();
            if (LJIIJJI()) {
                fLJIIIIZZ = -LJIIIIZZ();
                f = this.LJIJI;
                fLJIIIZ = LJIIIZ();
            } else {
                fLJIIIIZZ = LJIIIIZZ();
                f = this.LJIJI;
                fLJIIIZ = LJIIIZ();
            }
            float f3 = fLJIIIIZZ - (f * fLJIIIZ);
            float fLJIIIZ2 = (this.LJIJI * LJIIIZ()) + fLIZ;
            if (LJIIJJI()) {
                float fLJIIIIZZ3 = fLIZ - LJIIIIZZ();
                if (Math.abs(LJIIIIZZ()) > fLJIIIZ2) {
                    measuredWidth = this.LIZ.getMeasuredWidth() - (Math.abs(LJIIIIZZ()) - fLJIIIZ2);
                } else {
                    measuredWidth = this.LIZ.getMeasuredWidth();
                }
                if (fLJIIIIZZ3 < f3) {
                    measuredWidth2 = this.LIZ.getMeasuredWidth() - fLJIIIIZZ3;
                } else {
                    measuredWidth2 = this.LIZ.getMeasuredWidth() - f3;
                }
                this.LJJJIL.set(measuredWidth2, 0.0f, measuredWidth, this.LJIIJJI);
            } else {
                float fLJIIIIZZ4 = LJIIIIZZ() + fLIZ;
                if (LJIIIIZZ() > fLJIIIZ2) {
                    fLJIIIIZZ2 = LJIIIIZZ() - fLJIIIZ2;
                } else {
                    fLJIIIIZZ2 = 0.0f;
                }
                if (fLJIIIIZZ4 < f3) {
                    f3 = fLJIIIIZZ4;
                }
                this.LJJJIL.set(fLJIIIIZZ2, 0.0f, f3, this.LJIIJJI);
            }
            canvas.save();
            if (LJIIJJI()) {
                canvas.translate(-(fLIZ + (this.LJIJI * LJIIIZ())), this.LJIJJLI);
            } else {
                canvas.translate(fLIZ + (this.LJIJI * LJIIIZ()), this.LJIJJLI);
            }
            Paint paint = this.LJJIJIIJI;
            Typeface typeface = C368130Ebz.LIZ;
            Integer numLIZIZ = C368130Ebz.LIZIZ(this.LIZIZ.getContext(), Integer.valueOf(R.attr.bq_));
            if (numLIZIZ != null) {
                iIntValue = numLIZIZ.intValue();
            } else {
                iIntValue = this.LJJIIJ;
            }
            paint.setColor(iIntValue);
            ((RectF) this.LJJJJ.getValue()).set(this.LJJJIL);
            if (this.LJJIIJZLJL) {
                ((RectF) this.LJJJJ.getValue()).left += C367650EbD.LLILZLL;
            }
            RectF rectF = (RectF) this.LJJJJ.getValue();
            float f4 = this.LJJIII;
            canvas.drawRoundRect(rectF, f4, f4, this.LJJIJIIJI);
            canvas.save();
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            for (Float f5 : list) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    arrayList.add(new Pair(Long.valueOf(i2 * 30), Float.valueOf(f5.floatValue() * 2)));
                    i2 = i3;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            boolean z = !arrayList.isEmpty();
            if (z) {
                canvas.getClipBounds(this.LJIJJ);
                if (this.LJJIZ == null && (function0 = this.LJJIL) != null) {
                    this.LJJIZ = function0.invoke();
                }
                InterfaceC367710EbJ interfaceC367710EbJ = this.LJJIZ;
                if (interfaceC367710EbJ != null) {
                    interfaceC367710EbJ.LIZLLL(canvas, this.LJJJIL, arrayList, LJIIIZ(), EnumC367660EbE.RECORD, this.LIZ.getMeasuredWidth());
                }
            }
            if (LJIIJ()) {
                int i4 = this.LJIIJJI;
                int i5 = AbstractC367990Ebl.LJIILJJIL;
                int i6 = i5 - 1;
                if (i4 > i6) {
                    fLIZIZ = C418440Gaw.LIZIZ(8);
                } else {
                    fLIZIZ = C418440Gaw.LIZIZ(8);
                }
                this.LJJIII = fLIZIZ;
                int i7 = this.LJIIJJI;
                if (i7 > i5 + 1) {
                    this.LJJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)) - LJIJ().LIZJ;
                    this.LJJIFFI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
                } else if (i7 > i6) {
                    this.LJJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)) - LJIJ().LIZJ;
                    this.LJJIFFI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                } else {
                    this.LJJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)) - LJIJ().LIZJ;
                    this.LJJIFFI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
                }
            }
            if (z) {
                int iLIZ2 = C446980Hfs.LIZ(this.LJIILLIIL, R.color.lz);
                int iLIZ3 = C446980Hfs.LIZ(this.LJIILLIIL, R.color.ly);
                RectF rectF2 = this.LJJJIL;
                this.LJJIJ.setShader(new LinearGradient(rectF2.left, 0.0f, rectF2.right, 0.0f, iLIZ2, iLIZ3, Shader.TileMode.CLAMP));
                if (this.LJJIII > 0.0f) {
                    RectF rectF3 = new RectF(this.LJJJIL);
                    float f6 = this.LJJIII;
                    canvas.drawRoundRect(rectF3, f6, f6, this.LJJIJ);
                } else {
                    canvas.drawRect(this.LJJJIL, this.LJJIJ);
                }
            }
            String str = LJIJ().LIZ;
            TextPaint textPaint = LJIJ().LJII;
            if (this.LJJIIZ.width() == 0) {
                LJIJ().LJII.getTextBounds(str, 0, str.length(), this.LJJIIZ);
            }
            if (LJIIJ()) {
                f2 = this.LJJJIL.top;
                iLIZ = (this.LJIIJJI - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18))) / 2;
            } else {
                f2 = this.LJJJIL.top;
                iLIZ = C0FU0.LIZ(8.5f);
            }
            float f7 = f2 + iLIZ;
            float f8 = this.LJJJIL.top + LJIJ().LJFF + LJIJ().LJ;
            if (LJIIJJI()) {
                LJIJ().LJI.set((((((this.LJJJIL.right - LJIJ().LJFF) - this.LJJI) - LJIJ().LIZLLL) - this.LJJIFFI) - this.LJJIIZ.width()) - this.LJJII, f7, this.LJJJIL.right - LJIJ().LJFF, f8);
            } else {
                LJIJ().LJI.set(this.LJJJIL.left + LJIJ().LJFF, f7, this.LJJJIL.left + LJIJ().LJFF + this.LJJI + LJIJ().LIZLLL + this.LJJIFFI + this.LJJIIZ.width() + this.LJJII, f8);
            }
            canvas.clipRect(this.LJJJIL);
            Drawable drawable = LJIJ().LIZIZ;
            if (drawable != null) {
                if (LJIIJJI()) {
                    this.LJJIIZI.set((int) ((LJIJ().LJI.right - this.LJJI) - LJIJ().LIZLLL), (int) (LJIJ().LJI.top + this.LJJ), (int) (LJIJ().LJI.right - this.LJJI), (int) (LJIJ().LJI.top + this.LJJ + LJIJ().LIZLLL));
                } else {
                    this.LJJIIZI.set((int) (LJIJ().LJI.left + this.LJJI), (int) (LJIJ().LJI.top + this.LJJ), (int) (LJIJ().LJI.left + this.LJJI + LJIJ().LIZLLL), (int) (LJIJ().LJI.top + this.LJJ + LJIJ().LIZLLL));
                }
                drawable.setBounds(this.LJJIIZI);
                drawable.draw(canvas);
            }
            float fCenterY = this.LJJJIL.centerY() - ((textPaint.descent() + textPaint.ascent()) / 2);
            if (LJIIJJI()) {
                canvas.drawText(str, ((this.LJJIIZI.right - LJIJ().LIZLLL) - this.LJJIFFI) - this.LJJIIZ.width(), fCenterY, textPaint);
            } else {
                canvas.drawText(str, this.LJJIIZI.left + LJIJ().LIZLLL + this.LJJIFFI, fCenterY, textPaint);
            }
            canvas.restore();
        }
    }

    @Override // X.AbstractC367990Ebl
    public final int LJFF(int i) {
        int i2;
        if (this.LJJJ) {
            i2 = this.LJIL;
        } else {
            i2 = -1;
        }
        if (i <= i2) {
            return super.LJFF(i) + this.LJIIJJI;
        }
        return super.LJFF(i);
    }

    @Override // X.InterfaceC369090EdX
    public final InterfaceC368720Ecw LIZ(int i, C368630Ecn c368630Ecn) {
        InterfaceC367710EbJ interfaceC367710EbJInvoke;
        C367650EbD c367650EbD = new C367650EbD(this.LJIILLIIL, this.LIZ.getTrackViewModelCompat());
        Function0<? extends InterfaceC367710EbJ> function0 = this.LJJIL;
        if (function0 != null && (interfaceC367710EbJInvoke = function0.invoke()) != null) {
            c367650EbD.LLILLL.setPainter(interfaceC367710EbJInvoke);
        }
        return c367650EbD;
    }

    @Override // X.AbstractC367990Ebl
    public final void LJIILLIIL(Pair<? extends NLETrackSlot, C369110EdZ> pair, boolean z) {
        super.LJIILLIIL(pair, z);
        if (!z) {
            LJIILL(pair);
        }
    }

    public C368020Ebo(C19EG c19eg, C368630Ecn c368630Ecn, C368680Ecs c368680Ecs, C369220Edk c369220Edk, C368450EcV c368450EcV) {
        super(c368630Ecn, c368680Ecs, c369220Edk, c368450EcV);
        this.LJIILLIIL = c19eg;
        this.LJIJJ = new Rect();
        this.LJJ = C0FU0.LIZ(1.5f);
        C0FU0.LIZ(1.0f);
        this.LJJI = C418440Gaw.LIZIZ(2);
        this.LJJIFFI = C0FU0.LIZ(2.0f);
        this.LJJII = C0FU0.LIZ(4.0f);
        C0FU0.LIZ(10.0f);
        this.LJJIII = C0FU0.LIZ(5.0f);
        this.LJJIIJ = -16777216;
        this.LJJIIZ = new Rect();
        this.LJJIIZI = new Rect();
        this.LJJIJ = new Paint();
        Paint paint = new Paint();
        this.LJJIJIIJI = paint;
        this.LJJIJIIJIL = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(6));
        this.LJJIJIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 5));
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.LJJIJL = valueAnimatorOfFloat;
        this.LJJIJLIJ = C452501pT.LIZIZ(new AwS549S0100000_5(c368630Ecn, 4));
        paint.setAntiAlias(true);
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.addListener(new ALAdapterS2S0100000_5(this, 0));
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS255S0100000_5(this, 0));
        this.LJJJIL = new RectF();
        this.LJJJJ = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(5));
    }
}
