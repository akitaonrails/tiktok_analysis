package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathDashPathEffect;
import android.os.Build;
import android.text.TextUtils;
import android.text.style.ReplacementSpan;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.zhiliaoapp.musically.R;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0Grg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C428820Grg extends ReplacementSpan {
    public final Context LL;
    public final float LLILLJJLI;
    public final int LLILLL;
    public final int LLILZ;
    public final TextExtraStruct LLILZIL;
    public final Integer LLIZLLLIL;
    public float LLJIJIL;
    public int LLJILJIL;
    public float LLJJ;
    public int LLJJI;
    public PathDashPathEffect LLJJIJIL;
    public float LLJJJ;
    public float LLJJJIL;
    public Paint LLJJJJ;
    public final boolean LLILZLL = false;
    public final Integer LLIZ = null;
    public float LLJ = -1.0f;
    public float LLJI = -1.0f;
    public String LLJILJILJ = "";
    public String LLJILLL = "";
    public final Paint LLJJIII = new Paint();
    public final Path LLJJIJI = new Path();
    public final Path LLJJIJIIJIL = new Path();
    public final float LLJJJJJIL = C418440Gaw.LIZIZ(12);
    public final float LLJJJJLIIL = C418440Gaw.LIZIZ(2);

    public final void LIZJ(float f, float f2) {
        boolean z;
        if (this.LLJJJ == f) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            this.LLJJIJI.reset();
            this.LLJJIJI.addCircle(0.0f, 0.0f, f, Path.Direction.CW);
            this.LLJJJ = f;
        }
        if (this.LLJJJIL != f2) {
            this.LLJJJIL = f2;
        }
        this.LLJJIJIL = new PathDashPathEffect(this.LLJJIJI, this.LLJJJIL, 0.0f, PathDashPathEffect.Style.ROTATE);
    }

    public static String LIZIZ(String str, float f, float f2, Paint paint) {
        int iMeasureText = (int) (paint.measureText(str) + f2);
        if (f != 0.0f && iMeasureText > f) {
            if (f > C418440Gaw.LIZIZ(5)) {
                f -= C418440Gaw.LIZIZ(5);
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

    public final void LIZ(Canvas canvas, float f, int i, int i2) {
        TuxIconDrawable tuxIconDrawableLIZ;
        int i3;
        if (this.LLJJI == -1) {
            return;
        }
        float f2 = i2 - i;
        float f3 = this.LLJJJJJIL;
        if (f2 < f3) {
            return;
        }
        float f4 = 2;
        float f5 = i + i2;
        float f6 = (f5 - f3) / f4;
        float f7 = (f5 + f3) / f4;
        int i4 = (int) (f + ((int) (this.LLJIJIL / f4)));
        if (this.LLIZLLLIL == null) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            int i5 = (int) this.LLJJJJJIL;
            c419910GdJ.LIZIZ = i5;
            c419910GdJ.LIZJ = i5;
            c419910GdJ.LIZ = this.LLJJI;
            c419910GdJ.LJFF = true;
            Integer numValueOf = this.LLIZ;
            if (numValueOf == null) {
                if (this.LLILZLL) {
                    i3 = R.attr.e1;
                } else {
                    i3 = R.attr.ee;
                }
                numValueOf = Integer.valueOf(i3);
            }
            c419910GdJ.LJ = numValueOf;
            tuxIconDrawableLIZ = c419910GdJ.LIZ(this.LL);
        } else {
            C419910GdJ c419910GdJ2 = new C419910GdJ();
            int i6 = (int) this.LLJJJJJIL;
            c419910GdJ2.LIZIZ = i6;
            c419910GdJ2.LIZJ = i6;
            c419910GdJ2.LIZ = this.LLJJI;
            c419910GdJ2.LJFF = true;
            c419910GdJ2.LIZLLL = this.LLIZLLLIL;
            tuxIconDrawableLIZ = c419910GdJ2.LIZ(this.LL);
        }
        tuxIconDrawableLIZ.setBounds(i4, (int) f6, ((int) this.LLJJJJJIL) + i4, (int) f7);
        tuxIconDrawableLIZ.draw(canvas);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        String strValueOf;
        String awemeId;
        int i3;
        boolean z;
        if (i + 1 >= i2) {
            return 0;
        }
        float f = this.LLJ;
        if (f != -1.0f) {
            paint.setTextSize(f);
        }
        if (this.LLJJJJ == null) {
            Paint paint2 = new Paint(paint);
            this.LLJJJJ = paint2;
            paint2.setTextSize(this.LLJI);
        }
        C444890HcV c444890HcV = new C444890HcV();
        c444890HcV.LIZ(52);
        paint.setTypeface(c444890HcV.getTypeface());
        float f2 = ((C715390S4j.LIZ + this.LLJIJIL) - this.LLJJJJJIL) - this.LLJJJJLIIL;
        if (this.LLJILJILJ.length() == 0) {
            strValueOf = String.valueOf(charSequence);
        } else {
            strValueOf = this.LLJILJILJ;
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
            if (C123100dR.LIZ(strSubstring) && strSubstring.charAt(0) == '@') {
                String strSubstring2 = strSubstring.substring(1, strSubstring.length());
                float f3 = this.LLILLJJLI;
                if (f3 <= f2) {
                    f2 = f3;
                }
                String strLIZIZ = LIZIZ(strSubstring2, f2, this.LLJIJIL, paint);
                this.LLJILLL = strLIZIZ;
                this.LLJILJIL = (int) (paint.measureText(strLIZIZ) + this.LLJIJIL + this.LLJJJJJIL + this.LLJJJJLIIL);
                char cCharAt = strSubstring.charAt(0);
                String str = this.LLJILLL;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(cCharAt);
                sbLIZ.append(str);
                this.LLJILLL = C2188811AlT.LIZIZ(sbLIZ);
            } else {
                String strLIZIZ2 = LIZIZ(strSubstring, this.LLILLJJLI, this.LLJIJIL, paint);
                this.LLJILLL = strLIZIZ2;
                this.LLJILJIL = (int) (paint.measureText(strLIZIZ2) + this.LLJIJIL);
            }
            return this.LLJILJIL;
        }
        C2276411E8h c2276411E8h = C2276411E8h.LIZIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("original text: ");
        sbLIZ2.append(this.LLJILJILJ);
        sbLIZ2.append("; span text: ");
        sbLIZ2.append((Object) charSequence);
        sbLIZ2.append("; aid: ");
        TextExtraStruct textExtraStruct = this.LLILZIL;
        if (textExtraStruct != null) {
            awemeId = textExtraStruct.getAwemeId();
        } else {
            awemeId = null;
        }
        sbLIZ2.append(awemeId);
        c2276411E8h.LIZJ("common_feed", 6, "RoundBackgroundSpan", C2188811AlT.LIZIZ(sbLIZ2));
        return 0;
    }

    public C428820Grg(Context context, float f, int i, int i2, TextExtraStruct textExtraStruct, Integer num) {
        int i3;
        this.LL = context;
        this.LLILLJJLI = f;
        this.LLILLL = i;
        this.LLILZ = i2;
        this.LLILZIL = textExtraStruct;
        this.LLIZLLLIL = num;
        this.LLJJI = -1;
        int subtype = textExtraStruct.getSubtype();
        if (subtype != 2) {
            if (subtype != 3 && (subtype == 4 || (subtype != 5 && subtype != 7))) {
                i3 = R.raw.icon_play_circle_fill;
            } else {
                i3 = R.raw.icon_qa_fill_ltr;
            }
        } else {
            i3 = R.raw.icon_message_fill;
        }
        this.LLJJI = i3;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        String string;
        String strLJJIFFI;
        Paint paint2 = paint;
        int i6 = Build.VERSION.SDK_INT;
        if ((i6 <= 28 && charSequence != null && charSequence.charAt(i) == 65279) || i + 1 >= i2) {
            return;
        }
        paint2.setColor(this.LLILZ);
        if (this.LLJILJIL + f > this.LLILLJJLI) {
            this.LLILZIL.setClickable(false);
            canvas.drawText("…", f, i4, paint2);
            return;
        }
        if (this.LLJJJJ == null) {
            Paint paint3 = new Paint(paint2);
            this.LLJJJJ = paint3;
            paint3.setTextSize(this.LLJI);
        }
        if (charSequence != null && charSequence.length() != 0 && charSequence.length() > i && charSequence.charAt(i) == 8230) {
            this.LLILZIL.setClickable(false);
            if (i6 <= 28) {
                String string2 = charSequence.toString();
                if (string2 != null && (string = a0.LJLIIIL(string2).toString()) != null && (strLJJIFFI = u.LJJIFFI(string, "\ufeff", "", false)) != null && u.LJIIZILJ(strLJJIFFI, "…", false)) {
                    return;
                }
                canvas.drawText("…", f, i4, paint2);
                return;
            }
            canvas.drawText("…", f, i4, paint2);
            return;
        }
        this.LLILZIL.setClickable(true);
        C444890HcV c444890HcV = new C444890HcV();
        c444890HcV.LIZ(52);
        paint2.setTypeface(c444890HcV.getTypeface());
        float f2 = this.LLJ;
        if (f2 != -1.0f) {
            paint2.setTextSize(f2);
        }
        float f3 = i4;
        float f4 = paint2.getFontMetrics().ascent + f3;
        float f5 = paint2.getFontMetrics().descent + f3;
        if (this.LLJILLL.charAt(0) == '@') {
            this.LLJJ = this.LLJJJJJIL + this.LLJJJJLIIL;
            String str = this.LLJILLL;
            this.LLJILLL = str.substring(1, str.length());
        }
        paint2.setColor(this.LLILZ);
        canvas.drawText(this.LLJILLL, (this.LLJIJIL / 2.0f) + f + this.LLJJ, f3, paint2);
        if (this.LLJJI != -1) {
            LIZ(canvas, f, (int) f4, (int) f5);
        } else if (!TextUtils.isEmpty(this.LLILZIL.getAwemeId())) {
            this.LLJJI = R.raw.icon_play_fill;
            LIZ(canvas, f, (int) f4, (int) f5);
        }
        Paint paint4 = this.LLJJJJ;
        if (paint4 != null) {
            paint2 = paint4;
        }
        float f6 = this.LLJIJIL / 2;
        float fLIZIZ = ((this.LLJILJIL + f) - f6) + C418440Gaw.LIZIZ(Double.valueOf(1.5d));
        float fLIZIZ2 = i5 - C418440Gaw.LIZIZ(Double.valueOf(0.75d));
        this.LLJJIII.set(paint2);
        this.LLJJIII.setColor(this.LLILLL);
        this.LLJJIII.setStyle(Paint.Style.FILL_AND_STROKE);
        this.LLJJIII.setPathEffect(this.LLJJIJIL);
        this.LLJJIJIIJIL.reset();
        this.LLJJIJIIJIL.moveTo(f6 + f, fLIZIZ2);
        this.LLJJIJIIJIL.lineTo(fLIZIZ, fLIZIZ2);
        canvas.drawPath(this.LLJJIJIIJIL, this.LLJJIII);
    }
}
