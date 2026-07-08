package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.text.TextUtils;
import android.text.style.ReplacementSpan;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0Grh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C428830Grh extends ReplacementSpan {
    public final boolean LL;
    public final Integer LLILLJJLI;
    public final boolean LLILLL;
    public final boolean LLILZ;
    public final Integer LLILZIL;
    public final TextExtraStruct LLILZLL;
    public final int LLIZ;
    public boolean LLIZLLLIL;
    public final int LLJ;
    public final float LLJI;
    public final Context LLJIJIL;
    public float LLJILJIL;
    public float LLJILJILJ;
    public float LLJILLL;
    public float LLJJ;
    public int LLJJI;
    public boolean LLJJIII;
    public boolean LLJJIJI;
    public String LLJJIJIIJIL;
    public float LLJJIJIL;
    public final int LLJJJ;
    public final Bitmap LLJJJIL;
    public final Rect LLJJJJ;
    public Paint LLJJJJJIL;
    public String LLJJJJLIIL;
    public boolean LLJJL;
    public final float LLJJLIIIJLLLLLLLZ;
    public final TuxIconDrawable LLJL;
    public final float LLJLIL;

    public static boolean LIZ(CharSequence charSequence) {
        String string;
        String string2;
        String strLJJIFFI;
        boolean z = false;
        if (charSequence != null && (string = charSequence.toString()) != null && (string2 = a0.LJLIIIL(string).toString()) != null && (strLJJIFFI = u.LJJIFFI(string2, "\ufeff", "", false)) != null && u.LJIIZILJ(strLJJIFFI, "…", false)) {
            z = true;
        }
        return !z;
    }

    public final void LIZJ(Paint paint) {
        if (!this.LLIZLLLIL) {
            return;
        }
        paint.setTypeface(C1697580uHE.LIZIZ(0.0f, 400, 17.0f, 0.0f, Float.valueOf(16.0f), 0.0f, 0, null, 224));
    }

    public final String LIZIZ(String str, float f, float f2, Paint paint) {
        int iMeasureText = (int) (paint.measureText(str) + f2);
        if (f != 0.0f && iMeasureText > f) {
            if (f > C12ES.LIZJ(5.0f, this.LLJIJIL)) {
                f -= C12ES.LIZJ(5.0f, this.LLJIJIL);
            }
            while (true) {
                str = a0.LJJJJZI(str.length() - 1, str.length(), str).toString();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append("…");
                if (((int) (paint.measureText(C2188811AlT.LIZIZ(sbLIZ)) + f2)) <= f && !Character.isHighSurrogate(str.charAt(str.length() - 1))) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(str);
                    sbLIZ2.append("…");
                    return C2188811AlT.LIZIZ(sbLIZ2);
                }
            }
        } else {
            return str;
        }
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        float f;
        String strValueOf;
        String awemeId;
        int i3;
        boolean z;
        if (i + 1 >= i2) {
            return 0;
        }
        float f2 = this.LLJILJIL;
        if (f2 != -1.0f) {
            paint.setTextSize(f2);
        }
        LIZJ(paint);
        if (this.LLILZ) {
            float f3 = C715390S4j.LIZ;
            f = ((C715390S4j.LIZ + this.LLJILLL) - this.LLJJLIIIJLLLLLLLZ) - this.LLJLIL;
        } else {
            f = this.LLJI;
        }
        if (this.LLJJJJLIIL.length() == 0) {
            strValueOf = String.valueOf(charSequence);
        } else {
            strValueOf = this.LLJJJJLIIL;
        }
        if (strValueOf.length() >= i2 && strValueOf.length() != 0) {
            String strSubstring = strValueOf.substring(i, i2);
            if (Build.VERSION.SDK_INT <= 28) {
                int length = strSubstring.length() - 1;
                int i4 = 0;
                boolean z2 = false;
                while (i4 <= length) {
                    if (!z2) {
                        i3 = i4;
                    } else {
                        i3 = length;
                    }
                    if (strSubstring.charAt(i3) == 65279) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z2) {
                        if (!z) {
                            z2 = true;
                        } else {
                            i4++;
                        }
                    } else {
                        if (!z) {
                            break;
                        }
                        length--;
                    }
                }
                strSubstring = strSubstring.subSequence(i4, length + 1).toString();
                if (strSubstring.length() == 0) {
                    return 0;
                }
            }
            if (this.LLILZ && C123100dR.LIZ(strSubstring) && strSubstring.charAt(0) == '@') {
                String strSubstring2 = strSubstring.substring(1, strSubstring.length());
                float f4 = this.LLJI;
                if (f4 <= f) {
                    f = f4;
                }
                String strLIZIZ = LIZIZ(strSubstring2, f, this.LLJILLL, paint);
                this.LLJJIJIIJIL = strLIZIZ;
                this.LLJJI = (int) (paint.measureText(strLIZIZ) + this.LLJILLL + this.LLJJLIIIJLLLLLLLZ + this.LLJLIL);
                char cCharAt = strSubstring.charAt(0);
                String str = this.LLJJIJIIJIL;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(cCharAt);
                sbLIZ.append(str);
                this.LLJJIJIIJIL = C2188811AlT.LIZIZ(sbLIZ);
            } else {
                String strLIZIZ2 = LIZIZ(strSubstring, this.LLJI, this.LLJILLL, paint);
                this.LLJJIJIIJIL = strLIZIZ2;
                this.LLJJI = (int) (paint.measureText(strLIZIZ2) + this.LLJILLL);
            }
            return this.LLJJI;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("original text: ");
        sbLIZ2.append(this.LLJJJJLIIL);
        sbLIZ2.append("; span text: ");
        sbLIZ2.append((Object) charSequence);
        sbLIZ2.append("; aid: ");
        TextExtraStruct textExtraStruct = this.LLILZLL;
        if (textExtraStruct != null) {
            awemeId = textExtraStruct.getAwemeId();
        } else {
            awemeId = null;
        }
        sbLIZ2.append(awemeId);
        C2344809Gs.LIZLLL(6, "RoundBackgroundSpan", C2188811AlT.LIZIZ(sbLIZ2));
        return 0;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        boolean z;
        float fLIZIZ;
        float f2;
        float fLIZIZ2;
        float f3;
        int color;
        float fMeasureText;
        int i6 = Build.VERSION.SDK_INT;
        if (i6 <= 28 && charSequence != null && charSequence.charAt(i) == 65279) {
            return;
        }
        if (this.LLJJJJJIL == null) {
            Paint paint2 = new Paint(paint);
            paint2.clearShadowLayer();
            this.LLJJJJJIL = paint2;
            if (this.LLJJIII) {
                paint2.setTextSize(this.LLJILJILJ);
            }
        }
        if (i + 1 >= i2) {
            return;
        }
        paint.setColor(this.LLJ);
        if (this.LLJJI + f > this.LLJI && !this.LLJJIJI) {
            this.LLILZLL.setClickable(false);
            if (i6 <= 28) {
                if (LIZ(charSequence)) {
                    canvas.drawText("…", f, i4, paint);
                    return;
                }
                return;
            }
            canvas.drawText("…", f, i4, paint);
            return;
        }
        if (charSequence != null && charSequence.length() != 0 && charSequence.length() > i && charSequence.charAt(i) == 8230) {
            this.LLILZLL.setClickable(false);
            if (i6 <= 28) {
                if (LIZ(charSequence)) {
                    canvas.drawText("…", f, i4, paint);
                    return;
                }
                return;
            }
            canvas.drawText("…", f, i4, paint);
            return;
        }
        this.LLILZLL.setClickable(true);
        LIZJ(paint);
        float f4 = this.LLJILJIL;
        if (f4 != -1.0f) {
            paint.setTextSize(f4);
        }
        Paint paint3 = this.LLJJJJJIL;
        if (paint3 == null) {
            paint3 = paint;
        }
        if (this.LLJJIII && this.LLJILJILJ > 0.0f) {
            z = true;
        } else {
            z = false;
        }
        float f5 = i4;
        if (z) {
            f2 = paint3.getFontMetrics().ascent + f5;
            fLIZIZ = C418440Gaw.LIZIZ(1);
        } else {
            fLIZIZ = paint.getFontMetrics().ascent;
            f2 = f5;
        }
        float f6 = f2 + fLIZIZ;
        if (z) {
            f3 = paint3.getFontMetrics().descent + f5;
            fLIZIZ2 = C418440Gaw.LIZIZ(1);
        } else {
            fLIZIZ2 = paint.getFontMetrics().descent;
            f3 = f5;
        }
        float f7 = f3 + fLIZIZ2;
        paint.setColor(this.LLIZ);
        paint3.setColor(this.LLIZ);
        RectF rectF = new RectF(f, f6, this.LLJJI + f, f7);
        float f8 = this.LLJJ;
        canvas.drawRoundRect(rectF, f8, f8, paint3);
        boolean zLIZ = C123100dR.LIZ(this.LLJJIJIIJIL);
        if (zLIZ && this.LLJJIJIIJIL.charAt(0) == '@') {
            if (this.LLILZ) {
                fMeasureText = this.LLJJLIIIJLLLLLLLZ + this.LLJLIL;
            } else {
                fMeasureText = paint.measureText(String.valueOf(this.LLJJIJIIJIL.charAt(0)));
            }
            this.LLJJIJIL = fMeasureText;
            String str = this.LLJJIJIIJIL;
            this.LLJJIJIIJIL = str.substring(1, str.length());
        }
        if (this.LLJJIJI && this.LLJJIJIIJIL.charAt(0) == '\n') {
            String str2 = this.LLJJIJIIJIL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('\n');
            sbLIZ.append(str2);
            this.LLJJIJIIJIL = C2188811AlT.LIZIZ(sbLIZ);
        }
        C1360520lVa c1360520lVa = new C1360520lVa();
        c1360520lVa.LIZ.append((CharSequence) this.LLJJIJIIJIL);
        this.LLJJIJIIJIL = c1360520lVa.LIZ.toString();
        paint.setColor(this.LLJ);
        if (zLIZ) {
            if (this.LLILZ) {
                canvas.drawText(this.LLJJIJIIJIL, (this.LLJILLL / 2.0f) + f + this.LLJJIJIL, f5, paint);
            } else if (this.LLILLL) {
                float f9 = 2;
                canvas.drawText(this.LLJJIJIIJIL, (this.LLJILLL / 2.0f) + f + this.LLJJIJIL, (Math.abs(paint.descent() + paint.ascent()) / f9) + ((f7 + f6) / f9), paint);
            } else {
                canvas.drawText(this.LLJJIJIIJIL, (this.LLJILLL / 2.0f) + f + this.LLJJIJIL, f5 - C12ES.LIZJ(1.0f, this.LLJIJIL), paint);
            }
        }
        int i7 = this.LLJJJ;
        if (i7 != -1) {
            int i8 = (int) f6;
            int i9 = (int) f7;
            if (i7 != -1) {
                if (this.LLILZ) {
                    float f10 = i9 - i8;
                    float f11 = this.LLJJLIIIJLLLLLLLZ;
                    if (f10 >= f11) {
                        float f12 = 2;
                        float f13 = i8 + i9;
                        float f14 = (f13 - f11) / f12;
                        float f15 = (f13 + f11) / f12;
                        int i10 = (int) (f + ((int) (this.LLJILLL / f12)));
                        TuxIconDrawable tuxIconDrawable = this.LLJL;
                        if (tuxIconDrawable != null) {
                            tuxIconDrawable.setBounds(i10, (int) f14, ((int) f11) + i10, (int) f15);
                        }
                        TuxIconDrawable tuxIconDrawable2 = this.LLJL;
                        if (tuxIconDrawable2 != null) {
                            tuxIconDrawable2.draw(canvas);
                            return;
                        }
                        return;
                    }
                    return;
                }
                Bitmap bitmap = this.LLJJJIL;
                if (bitmap == null) {
                    return;
                }
                int i11 = i9 - i8;
                int i12 = i11 / 4;
                int i13 = i11 / 5;
                int i14 = i8 + i13;
                int i15 = i9 - i13;
                int i16 = (int) (f + i12);
                this.LLJJJJ.set(i16, i14, (i16 + i15) - i14, i15);
                canvas.drawBitmap(bitmap, (Rect) null, this.LLJJJJ, paint);
                return;
            }
            return;
        }
        if (TextUtils.isEmpty(this.LLILZLL.getAwemeId())) {
            return;
        }
        int i17 = (int) f6;
        int i18 = (int) f7;
        if (Intrinsics.LJFF(Boolean.valueOf(this.LL), Boolean.TRUE)) {
            paint.setColor(-16777216);
        } else {
            paint.setColor(-1);
        }
        Integer num = this.LLILZIL;
        if (num != null) {
            paint.setColor(num.intValue());
        }
        Integer num2 = this.LLILLJJLI;
        if (num2 != null) {
            Integer numLIZJ = C1308910kAL.LIZJ(num2.intValue(), this.LLJIJIL);
            if (numLIZJ != null) {
                color = numLIZJ.intValue();
            } else {
                color = paint.getColor();
            }
            paint.setColor(color);
        }
        paint.setPathEffect(new CornerPathEffect(C12ES.LIZJ(2.0f, this.LLJIJIL)));
        Path path = new Path();
        float fLIZJ = C12ES.LIZJ(10.0f, this.LLJIJIL);
        float f16 = (i18 + i17) / 2.0f;
        float fSqrt = (float) Math.sqrt((Math.pow(fLIZJ, 2.0d) * ((double) 3)) / ((double) 4));
        float f18 = fLIZJ / 2.0f;
        path.moveTo((this.LLJILLL / 2.0f) + f, f16 + f18);
        path.lineTo((this.LLJILLL / 2.0f) + f + fSqrt, f16);
        path.lineTo(f + (this.LLJILLL / 2.0f), f16 - f18);
        path.close();
        canvas.drawPath(path, paint);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C428830Grh(android.content.Context r9, float r10, int r11, int r12, com.ss.android.ugc.aweme.model.TextExtraStruct r13, boolean r14, java.lang.Integer r15, boolean r16, boolean r17, java.lang.Integer r18, int r19) {
        /*
            Method dump skipped, instruction units count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C428830Grh.<init>(android.content.Context, float, int, int, com.ss.android.ugc.aweme.model.TextExtraStruct, boolean, java.lang.Integer, boolean, boolean, java.lang.Integer, int):void");
    }
}
