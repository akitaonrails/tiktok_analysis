package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;

/* JADX INFO: renamed from: X.041W, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C041W {
    public int LIZJ;
    public Integer LJI;
    public boolean LJIIIIZZ;
    public String LIZ = "";
    public String LIZIZ = "";
    public String LIZLLL = "";
    public int LJ = -1;
    public int LJFF = -1;
    public int LJII = -1;

    public final CharSequence LIZIZ(Context context) {
        int iIntValue;
        if (this.LJII < 0) {
            this.LJII = R.attr.a1h;
        }
        if (this.LJFF < 0) {
            this.LJFF = 13;
        }
        if (this.LJ < 0) {
            this.LJ = 33;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (this.LIZ.length() != 0 && this.LIZIZ.length() != 0) {
            if (this.LIZJ == 0) {
                LIZ(spannableStringBuilder, this.LIZIZ, this.LJ);
                if (this.LIZLLL.length() > 0) {
                    LIZ(spannableStringBuilder, this.LIZLLL, this.LJFF);
                }
                LIZ(spannableStringBuilder, this.LIZ, this.LJFF);
            } else {
                LIZ(spannableStringBuilder, this.LIZ, this.LJFF);
                if (this.LIZLLL.length() > 0) {
                    LIZ(spannableStringBuilder, this.LIZLLL, this.LJFF);
                }
                LIZ(spannableStringBuilder, this.LIZIZ, this.LJ);
            }
            Integer num = this.LJI;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                Integer numLIZJ = C1308910kAL.LIZJ(this.LJII, context);
                if (numLIZJ != null) {
                    iIntValue = numLIZJ.intValue();
                } else {
                    iIntValue = 0;
                }
            }
            C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(iIntValue), 0, spannableStringBuilder.length(), 17);
            if (this.LJIIIIZZ) {
                C786410Ut5.q2(spannableStringBuilder, new StrikethroughSpan(), 0, spannableStringBuilder.length(), 17);
            }
        }
        return spannableStringBuilder;
    }

    public final void LIZLLL(int i) {
        Pair pair;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            pair = new Pair(33, 13);
                        } else {
                            pair = new Pair(92, 62);
                        }
                    } else {
                        pair = new Pair(82, 42);
                    }
                } else {
                    pair = new Pair(72, 32);
                }
            } else {
                pair = new Pair(52, 22);
            }
        } else {
            pair = new Pair(33, 13);
        }
        int iIntValue = ((Number) pair.getFirst()).intValue();
        int iIntValue2 = ((Number) pair.getSecond()).intValue();
        this.LJ = iIntValue;
        this.LJFF = iIntValue2;
    }

    public static void LIZ(SpannableStringBuilder spannableStringBuilder, String str, int i) {
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) str);
        C786410Ut5.q2(spannableStringBuilder, new C444920HcY(i, false), length, spannableStringBuilder.length(), 17);
    }

    public final void LIZJ(int i, String str, String str2, String str3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = i;
        this.LIZLLL = str3;
    }
}
