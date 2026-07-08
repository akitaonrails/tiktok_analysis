package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.text.TextUtils;
import android.text.style.ReplacementSpan;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.zhiliaoapp.musically.R;
import kotlin.text.u;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0Grf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C428810Grf extends ReplacementSpan {
    public final Context LL;
    public final float LLILLJJLI;
    public final int LLILLL;
    public final TextExtraStruct LLILZ;
    public final int LLILZIL;
    public final float LLILZLL;
    public String LLIZ;
    public String LLIZLLLIL;
    public int LLJ;
    public final float LLJI;
    public final float LLJIJIL;
    public final float LLJILJIL;
    public final float LLJILJILJ;

    public C428810Grf(Context context, float f, int i, TextExtraStruct textExtraStruct, int i2) {
        int i3;
        if ((i2 & 16) != 0) {
            i3 = R.raw.icon_live_wave_fill;
        } else {
            i3 = 0;
        }
        this.LL = context;
        this.LLILLJJLI = f;
        this.LLILLL = i;
        this.LLILZ = textExtraStruct;
        this.LLILZIL = i3;
        this.LLILZLL = 0.0f;
        this.LLIZ = "";
        this.LLIZLLLIL = "";
        this.LLJI = C418440Gaw.LIZIZ(12);
        this.LLJIJIL = C418440Gaw.LIZIZ(2);
        this.LLJILJIL = C418440Gaw.LIZIZ(2);
        this.LLJILJILJ = C418440Gaw.LIZIZ(2);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        boolean z;
        String string;
        boolean z2;
        int i3;
        boolean z3;
        if (i >= i2) {
            return 0;
        }
        if (this.LLIZ.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        String strLIZIZ = "";
        if (z) {
            if (charSequence == null || (string = charSequence.toString()) == null) {
                string = "";
            }
        } else {
            string = this.LLIZ;
        }
        if (string.length() == 0 || string.length() < i2) {
            return 0;
        }
        String strSubstring = string.substring(i, i2);
        if (Build.VERSION.SDK_INT <= 28) {
            int length = strSubstring.length() - 1;
            int i4 = 0;
            boolean z4 = false;
            while (i4 <= length) {
                if (!z4) {
                    i3 = i4;
                } else {
                    i3 = length;
                }
                if (strSubstring.charAt(i3) == 65279) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!z4) {
                    if (!z3) {
                        z4 = true;
                    } else {
                        i4++;
                    }
                } else {
                    if (!z3) {
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
        if (u.LJJIIJZLJL(strSubstring, e3.g, false) && strSubstring.length() > 1) {
            strSubstring = strSubstring.substring(1);
        }
        C444890HcV c444890HcV = new C444890HcV();
        c444890HcV.LIZ(51);
        paint.setTypeface(c444890HcV.getTypeface());
        float f = this.LLILLJJLI;
        float f2 = this.LLJIJIL + this.LLJI + this.LLJILJILJ + this.LLJILJIL + this.LLILZLL;
        float f3 = f - f2;
        if (f3 >= 0.0f && f3 > 0.0f) {
            if (paint.measureText(strSubstring) <= f3) {
                strLIZIZ = strSubstring;
            } else {
                while (true) {
                    if (strSubstring.length() > 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                        break;
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(strSubstring);
                    sbLIZ.append("…");
                    if (paint.measureText(C2188811AlT.LIZIZ(sbLIZ)) <= f3) {
                        break;
                    }
                    int length2 = strSubstring.length() - 1;
                    if (length2 > 0 && Character.isHighSurrogate(strSubstring.charAt(length2))) {
                        strSubstring = strSubstring.substring(0, length2 - 1);
                    } else {
                        strSubstring = strSubstring.substring(0, length2);
                    }
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(strSubstring);
                sbLIZ2.append("…");
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            }
        }
        this.LLIZLLLIL = strLIZIZ;
        int iMeasureText = (int) (f2 + paint.measureText(strLIZIZ));
        this.LLJ = iMeasureText;
        return iMeasureText;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Character chLJLLJ;
        if ((Build.VERSION.SDK_INT <= 28 && charSequence != null && (chLJLLJ = C13LN.LJLLJ(i, charSequence)) != null && chLJLLJ.charValue() == 65279) || i >= i2) {
            return;
        }
        paint.setColor(this.LLILLL);
        C444890HcV c444890HcV = new C444890HcV();
        c444890HcV.LIZ(51);
        paint.setTypeface(c444890HcV.getTypeface());
        float f2 = this.LLJ + f;
        float f3 = this.LLILLJJLI;
        if (f2 > f3 && f3 > 0.0f) {
            this.LLILZ.setClickable(false);
            canvas.drawText("…", f, i4, paint);
            return;
        }
        this.LLILZ.setClickable(true);
        float f4 = i4;
        float f5 = 2;
        float f6 = (((paint.getFontMetrics().ascent + f4) + (paint.getFontMetrics().descent + f4)) - this.LLJI) / f5;
        float f7 = f + this.LLJIJIL + (this.LLILZLL / f5);
        C419910GdJ c419910GdJ = new C419910GdJ();
        int i6 = (int) this.LLJI;
        c419910GdJ.LIZIZ = i6;
        c419910GdJ.LIZJ = i6;
        c419910GdJ.LIZ = this.LLILZIL;
        c419910GdJ.LJFF = true;
        c419910GdJ.LIZLLL = Integer.valueOf(paint.getColor());
        TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(this.LL);
        float f8 = this.LLJI;
        tuxIconDrawableLIZ.setBounds((int) f7, (int) f6, (int) (f7 + f8), (int) (f6 + f8));
        tuxIconDrawableLIZ.draw(canvas);
        float f9 = f7 + this.LLJI + this.LLJILJILJ;
        if (!TextUtils.isEmpty(this.LLIZLLLIL)) {
            canvas.drawText(this.LLIZLLLIL, f9, f4, paint);
        }
    }
}
