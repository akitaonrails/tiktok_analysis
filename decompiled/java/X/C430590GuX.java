package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.text.style.ReplacementSpan;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.text.CharsKt__CharJVMKt;

/* JADX INFO: renamed from: X.0GuX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C430590GuX {
    public static final /* synthetic */ int LIZ = 0;

    public static CharSequence LIZ(int i, String str) {
        CharsKt__CharJVMKt.checkRadix(2);
        String string = C13LN.LJLZ(Integer.toString(i, 2)).toString();
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            int length = string.length();
            int i2 = 1;
            for (int i3 = 0; i3 < length; i3++) {
                char cCharAt = string.charAt(i3);
                while (true) {
                    if (spannableStringBuilder.charAt(i2) != ' ' && spannableStringBuilder.charAt(i2) != '.') {
                        break;
                    }
                    i2++;
                }
                if (cCharAt != '0') {
                    if (cCharAt == '1') {
                        final float f = 0.7f;
                        C786410Ut5.o2(spannableStringBuilder, new ReplacementSpan(f) { // from class: X.0GVO
                            public final float LL;

                            {
                                this.LL = f;
                            }

                            @Override // android.text.style.ReplacementSpan
                            public final int getSize(Paint paint, CharSequence charSequence, int i4, int i5, Paint.FontMetricsInt fontMetricsInt) {
                                return C814420VxA.LIZIZ(paint.measureText(charSequence, i4, i5));
                            }

                            @Override // android.text.style.ReplacementSpan
                            public final void draw(Canvas canvas, CharSequence charSequence, int i4, int i5, float f2, int i6, int i7, int i8, Paint paint) {
                                canvas.drawText(charSequence, i4, i5, f2, i7 - this.LL, paint);
                            }
                        }, i2, i2 + 1, 17);
                    }
                } else {
                    final float f2 = -0.7f;
                    C786410Ut5.o2(spannableStringBuilder, new ReplacementSpan(f2) { // from class: X.0GVO
                        public final float LL;

                        {
                            this.LL = f2;
                        }

                        @Override // android.text.style.ReplacementSpan
                        public final int getSize(Paint paint, CharSequence charSequence, int i4, int i5, Paint.FontMetricsInt fontMetricsInt) {
                            return C814420VxA.LIZIZ(paint.measureText(charSequence, i4, i5));
                        }

                        @Override // android.text.style.ReplacementSpan
                        public final void draw(Canvas canvas, CharSequence charSequence, int i4, int i5, float f22, int i6, int i7, int i8, Paint paint) {
                            canvas.drawText(charSequence, i4, i5, f22, i7 - this.LL, paint);
                        }
                    }, i2, i2 + 1, 17);
                }
                i2++;
            }
            return spannableStringBuilder;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return str;
        }
    }
}
