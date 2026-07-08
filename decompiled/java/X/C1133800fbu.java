package X;

import android.os.CountDownTimer;
import android.text.SpannableStringBuilder;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0fbu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1133800fbu {
    public SpannableStringBuilder LIZ;
    public CountDownTimer LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public float LJ;

    public final void LIZ(final C16F5 c16f5, final C1133790fbt c1133790fbt) {
        CountDownTimer countDownTimer = this.LIZIZ;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.LIZ = new SpannableStringBuilder(c16f5.getText());
        long j = c1133790fbt.LIZJ;
        if (j != 0) {
            final long jCurrentTimeMillis = (j * 1000) - System.currentTimeMillis();
            long hours = TimeUnit.MILLISECONDS.toHours(jCurrentTimeMillis);
            if (jCurrentTimeMillis < 0) {
                LIZIZ(c16f5, c1133790fbt, 0L);
                Function0<Unit> function0 = c1133790fbt.LIZLLL;
                if (function0 != null) {
                    function0.invoke();
                }
            } else {
                LIZIZ(c16f5, c1133790fbt, jCurrentTimeMillis);
            }
            if (hours < 24 && c1133790fbt.LIZ) {
                this.LIZIZ = new CountDownTimer(jCurrentTimeMillis) { // from class: X.0fbv
                    @Override // android.os.CountDownTimer
                    public final void onFinish() {
                        CountDownTimer countDownTimer2 = this.LIZIZ;
                        if (countDownTimer2 != null) {
                            countDownTimer2.cancel();
                        }
                        this.LIZIZ = null;
                        Function0<Unit> function02 = c1133790fbt.LIZLLL;
                        if (function02 != null) {
                            function02.invoke();
                        }
                    }

                    @Override // android.os.CountDownTimer
                    public final void onTick(long j2) {
                        if (j2 >= 0) {
                            C1133800fbu c1133800fbu = this;
                            SpannableStringBuilder spannableStringBuilder = c1133800fbu.LIZ;
                            if (spannableStringBuilder != null) {
                                c1133800fbu.LIZJ(spannableStringBuilder, c16f5, c1133800fbu.LIZJ, c1133800fbu.LIZLLL, j2, c1133790fbt);
                            }
                            c16f5.setText(this.LIZ);
                            return;
                        }
                        CountDownTimer countDownTimer2 = this.LIZIZ;
                        if (countDownTimer2 == null) {
                            return;
                        }
                        countDownTimer2.cancel();
                    }
                }.start();
            }
        }
        c16f5.setText(this.LIZ);
    }

    public final void LIZIZ(C16F5 c16f5, C1133790fbt c1133790fbt, long j) {
        CharSequence text = c16f5.getText();
        int iLJJJ = a0.LJJJ(text, c1133790fbt.LIZIZ, 0, true, 2);
        if (iLJJJ >= 0 && iLJJJ < text.length()) {
            int length = iLJJJ + c1133790fbt.LIZIZ.length();
            SpannableStringBuilder spannableStringBuilder = this.LIZ;
            if (spannableStringBuilder != null) {
                LIZJ(spannableStringBuilder, c16f5, iLJJJ, length, j, c1133790fbt);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(android.text.SpannableStringBuilder r19, X.C16F5 r20, int r21, int r22, long r23, X.C1133790fbt r25) {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1133800fbu.LIZJ(android.text.SpannableStringBuilder, X.16F5, int, int, long, X.0fbt):void");
    }
}
