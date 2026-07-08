package X;

import Y.AAListenerS325S0100000_14;
import android.animation.ValueAnimator;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0ZYZ, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZYZ implements InterfaceC901440ZXy {
    public static final C1231704rr LJFF = new C1231704rr("text_highlight", null, 6);
    public final long LIZIZ;
    public final String LIZJ;
    public boolean LIZLLL;
    public boolean LJ;

    public C0ZYZ(long j, String str) {
        this.LIZIZ = j;
        this.LIZJ = str;
        Color.argb(87, 255, 255, 255);
        Color.argb(87, 255, 255, 255);
        Color.argb(87, 255, 255, 255);
        Color.argb(77, 16, 162, 197);
        C1BNE.LIZ(new C0ZY1());
        C1231704rr c1231704rr = LJFF;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("targetMsgId ");
        sbLIZ.append(j);
        sbLIZ.append(" matchText ");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        c1231704rr.LIZIZ();
    }

    @Override // X.InterfaceC901440ZXy
    public final void LIZ(final C21416018rW c21416018rW, C869590Y9l c869590Y9l, final CharSequence charSequence, final int i, final int i2) {
        final EnumC901470ZYb enumC901470ZYb;
        C1231704rr c1231704rr = LJFF;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("bind msg index ");
        sbLIZ.append(c869590Y9l.getIndex());
        C2188811AlT.LIZIZ(sbLIZ);
        c1231704rr.getClass();
        if (c869590Y9l.getIndex() != this.LIZIZ) {
            return;
        }
        boolean zLIZIZ = C960203pA.LIZIZ(c21416018rW.getContext());
        boolean zLJJJJIZL = C0ZDX.LJJJJIZL(c869590Y9l);
        if (zLIZIZ) {
            if (zLJJJJIZL) {
                enumC901470ZYb = EnumC901470ZYb.LLILZIL;
            } else {
                enumC901470ZYb = EnumC901470ZYb.LLILZLL;
            }
        } else if (zLJJJJIZL) {
            enumC901470ZYb = EnumC901470ZYb.LLIZ;
        } else {
            enumC901470ZYb = EnumC901470ZYb.LLIZLLLIL;
        }
        String string = charSequence.toString();
        final int iLJJJ = a0.LJJJ(string, this.LIZJ, 0, true, 2);
        final int length = this.LIZJ.length() + iLJJJ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("startIndex ");
        sbLIZ2.append(iLJJJ);
        sbLIZ2.append(", endIndex ");
        sbLIZ2.append(length);
        C2188811AlT.LIZIZ(sbLIZ2);
        if (iLJJJ != -1 && iLJJJ < string.length() && length <= string.length()) {
            if (this.LJ) {
                c21416018rW.setTextLayout(C0H96.LIZ(i, i2, Integer.MAX_VALUE, charSequence));
                return;
            }
            if (!this.LIZLLL) {
                this.LIZLLL = true;
                SpannableString spannableString = new SpannableString(charSequence);
                C786410Ut5.p2(spannableString, new BackgroundColorSpan(Color.argb(enumC901470ZYb.LLILZ, enumC901470ZYb.LL, enumC901470ZYb.LLILLJJLI, enumC901470ZYb.LLILLL)), iLJJJ, length, 33);
                c21416018rW.setTextLayout(C0H96.LIZ(i, i2, Integer.MAX_VALUE, spannableString));
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(enumC901470ZYb.LLILZ, 0);
                valueAnimatorOfInt.setStartDelay(3000L);
                valueAnimatorOfInt.setDuration(300L);
                valueAnimatorOfInt.setInterpolator(C1619980sG4.LIZLLL());
                valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0ZYa
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        int iIntValue;
                        Integer num;
                        Object animatedValue = valueAnimator.getAnimatedValue();
                        if ((animatedValue instanceof Integer) && (num = (Integer) animatedValue) != null) {
                            iIntValue = num.intValue();
                        } else {
                            iIntValue = 0;
                        }
                        EnumC901470ZYb enumC901470ZYb2 = enumC901470ZYb;
                        BackgroundColorSpan backgroundColorSpan = new BackgroundColorSpan(Color.argb(iIntValue, enumC901470ZYb2.LL, enumC901470ZYb2.LLILLJJLI, enumC901470ZYb2.LLILLL));
                        SpannableString spannableString2 = new SpannableString(charSequence);
                        C786410Ut5.p2(spannableString2, backgroundColorSpan, iLJJJ, length, 33);
                        c21416018rW.setTextLayout(C0H96.LIZ(i, i2, Integer.MAX_VALUE, spannableString2));
                    }
                });
                valueAnimatorOfInt.addListener(new AAListenerS325S0100000_14(this, 38));
                valueAnimatorOfInt.start();
                return;
            }
            SpannableString spannableString2 = new SpannableString(charSequence);
            C786410Ut5.p2(spannableString2, new BackgroundColorSpan(Color.argb(enumC901470ZYb.LLILZ, enumC901470ZYb.LL, enumC901470ZYb.LLILLJJLI, enumC901470ZYb.LLILLL)), iLJJJ, length, 33);
            c21416018rW.setTextLayout(C0H96.LIZ(i, i2, Integer.MAX_VALUE, spannableString2));
            return;
        }
        c1231704rr.LIZIZ();
    }
}
