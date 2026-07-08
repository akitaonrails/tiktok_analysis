package X;

import android.os.CountDownTimer;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import android.widget.TextView;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.03B0, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03B0 {
    public static final /* synthetic */ int LJ = 0;
    public final TextView LIZ;
    public final String LIZIZ;
    public final SpannableStringBuilder LIZJ = new SpannableStringBuilder();
    public CountDownTimer LIZLLL;

    public C03B0(TextView textView, String str) {
        this.LIZ = textView;
        this.LIZIZ = str;
    }

    public final void LIZIZ(C038M c038m, long j) {
        int currentTextColor;
        SpannableStringBuilder spannableStringBuilder = this.LIZJ;
        TextView textView = this.LIZ;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long j2 = 60;
        String strJ4 = C786410Ut5.j4("%02d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(timeUnit.toHours(j)), Long.valueOf(timeUnit.toMinutes(j) % j2), Long.valueOf(timeUnit.toSeconds(j) % j2)}, 3));
        if (c038m.LIZJ >= 0 && c038m.LIZLLL < spannableStringBuilder.length()) {
            spannableStringBuilder.replace(c038m.LIZJ, c038m.LIZLLL, (CharSequence) strJ4);
        }
        int length = c038m.LIZJ + strJ4.length();
        c038m.LIZLLL = length;
        if (length <= spannableStringBuilder.length()) {
            int i = c038m.LIZJ;
            int i2 = c038m.LIZLLL;
            Integer num = c038m.LIZ;
            if (num != null) {
                C786410Ut5.q2(spannableStringBuilder, new C444920HcY(num.intValue(), false), i, i2, 33);
            }
            Integer num2 = c038m.LIZIZ;
            if (num2 != null) {
                currentTextColor = num2.intValue();
            } else {
                currentTextColor = textView.getCurrentTextColor();
            }
            C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(currentTextColor), i, i2, 33);
            C786410Ut5.q2(spannableStringBuilder, new TypefaceSpan("monospace"), i, i2, 33);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:268:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x04f2  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x05aa  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e5 A[PHI: r11
      0x00e5: PHI (r11v3 java.util.List) = (r11v2 java.util.List), (r11v4 java.util.List) binds: [B:59:0x00e3, B:55:0x00d0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x015c  */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v27 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(final X.C03B0 r43, com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText r44, X.InterfaceC1631620sYq r45, X.C800103Ap r46, boolean r47, X.C19EG r48, android.text.method.MovementMethod r49, int r50) {
        /*
            Method dump skipped, instruction units count: 1497
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03B0.LIZ(X.03B0, com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText, X.0sYq, X.03Ap, boolean, X.19EG, android.text.method.MovementMethod, int):void");
    }
}
