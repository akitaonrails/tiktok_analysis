package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;

/* JADX INFO: renamed from: X.15Ku, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20503415Ku extends View {
    public final Paint LL;
    public final C20503615Kw LLILLJJLI;
    public float LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public MusicWaveBean LLILZLL;
    public final RectF LLIZ;
    public final C20503515Kv LLIZLLLIL;

    public C20503415Ku(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.save();
        C20503615Kw c20503615Kw = this.LLILLJJLI;
        int i = this.LLILZ;
        int i2 = this.LLILZIL;
        int length = c20503615Kw.LJII.length;
        int i3 = 0;
        int i4 = 0;
        while (i4 < length) {
            float f = c20503615Kw.LJII[i4];
            int i5 = c20503615Kw.LJFF;
            int i6 = (int) (f * i5);
            int i7 = c20503615Kw.LIZLLL;
            if (i6 < i7) {
                i6 = i7;
            }
            i4++;
            int i8 = c20503615Kw.LIZIZ;
            int i9 = (c20503615Kw.LIZ + i8) * i4;
            int i10 = ((i5 - i6) / 2) + c20503615Kw.LIZJ;
            int i11 = i8 + i9;
            int i12 = i6 + i10;
            if (i9 >= i) {
                if (i11 > i2) {
                    break;
                }
                RectF rectF = new RectF(i9, i10, i11, i12);
                float f2 = c20503615Kw.LJ;
                canvas.drawRoundRect(rectF, f2, f2, c20503615Kw.LJI);
            }
        }
        canvas.restore();
        canvas.save();
        if (this.LLILLL * getWidth() > 0.0f) {
            this.LLIZ.set(0.0f, 0.0f, this.LLILLL * getWidth(), getHeight());
            canvas.clipRect(this.LLIZ);
            C20503615Kw c20503615Kw2 = this.LLILLJJLI;
            Paint paint = this.LL;
            int i13 = this.LLILZ;
            int i14 = this.LLILZIL;
            int length2 = c20503615Kw2.LJII.length;
            while (i3 < length2) {
                float f3 = c20503615Kw2.LJII[i3];
                int i15 = c20503615Kw2.LJFF;
                int i16 = (int) (f3 * i15);
                int i17 = c20503615Kw2.LIZLLL;
                if (i16 < i17) {
                    i16 = i17;
                }
                i3++;
                int i18 = c20503615Kw2.LIZIZ;
                int i19 = (c20503615Kw2.LIZ + i18) * i3;
                int i20 = ((i15 - i16) / 2) + c20503615Kw2.LIZJ;
                int i21 = i18 + i19;
                int i22 = i16 + i20;
                if (i19 >= i13) {
                    if (i21 <= i14) {
                        RectF rectF2 = new RectF(i19, i20, i21, i22);
                        float f4 = c20503615Kw2.LJ;
                        canvas.drawRoundRect(rectF2, f4, f4, paint);
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final void setAlpha(int i) {
        this.LLILLJJLI.LJI.setAlpha(i);
        invalidate();
    }

    public final void setAudioWaveViewData(MusicWaveBean musicWaveBean) {
        float[] fArrCopyOf;
        if (musicWaveBean != null) {
            this.LLILZLL = musicWaveBean;
            C20503615Kw c20503615Kw = this.LLILLJJLI;
            float[] musicWavePointArray = musicWaveBean.getMusicWavePointArray();
            c20503615Kw.getClass();
            if (C15KF.LJI(musicWavePointArray)) {
                if (musicWavePointArray == null || (fArrCopyOf = Arrays.copyOf(musicWavePointArray, musicWavePointArray.length)) == null) {
                    fArrCopyOf = new float[0];
                }
                c20503615Kw.LJII = fArrCopyOf;
            }
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        float[] musicWavePointArray;
        MusicWaveBean musicWaveBean = this.LLILZLL;
        if (musicWaveBean != null && (musicWavePointArray = musicWaveBean.getMusicWavePointArray()) != null && musicWavePointArray.length != 0) {
            int i3 = this.LLILZIL;
            C20503615Kw c20503615Kw = this.LLILLJJLI;
            C20503515Kv c20503515Kv = this.LLIZLLLIL;
            int i4 = c20503515Kv.LJ;
            c20503615Kw.LIZJ = i4;
            setMeasuredDimension(i3, c20503515Kv.LIZJ + (i4 * 2));
            C20503615Kw c20503615Kw2 = this.LLILLJJLI;
            C20503515Kv c20503515Kv2 = this.LLIZLLLIL;
            c20503615Kw2.LJFF = (c20503515Kv2.LIZJ + (c20503515Kv2.LJ * 2)) - (c20503615Kw2.LIZJ * 2);
            return;
        }
        super.onMeasure(i, i2);
    }

    public C20503415Ku(Context context, AttributeSet attributeSet, int i) {
        int iIntValue;
        super(context, attributeSet, 0);
        this.LLIZ = new RectF();
        C20503715Kx c20503715Kx = new C20503715Kx();
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a04, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1h, context);
        int iIntValue2 = numLIZJ2 != null ? numLIZJ2.intValue() : 0;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(iIntValue);
        this.LL = paint;
        C20503515Kv c20503515Kv = new C20503515Kv(context, c20503715Kx);
        this.LLIZLLLIL = c20503515Kv;
        C20503615Kw c20503615Kw = new C20503615Kw();
        c20503615Kw.LJI.setColor(c20503615Kw.LJIIIIZZ);
        c20503615Kw.LJI.setStyle(Paint.Style.FILL);
        c20503615Kw.LJI.setAntiAlias(true);
        c20503615Kw.LJIIIIZZ = iIntValue2;
        c20503615Kw.LJI.setColor(iIntValue2);
        c20503615Kw.LIZ = c20503515Kv.LIZ;
        c20503615Kw.LIZIZ = c20503515Kv.LIZIZ;
        c20503615Kw.LJ = c20503515Kv.LJFF;
        c20503615Kw.LIZLLL = c20503515Kv.LIZLLL;
        c20503615Kw.LIZJ = c20503515Kv.LJ;
        this.LLILLJJLI = c20503615Kw;
    }
}
