package X;

import android.os.CountDownTimer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.03MX, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03MX {
    public CountDownTimer LIZ;

    public final void LIZ() {
        CountDownTimer countDownTimer = this.LIZ;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.LIZ = null;
    }

    public final void LIZIZ(final long j, final Function0 function0, final Function1 function1) {
        CountDownTimer countDownTimer = this.LIZ;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        final long j2 = j + ((long) 100000);
        try {
            this.LIZ = new CountDownTimer(j2) { // from class: X.03Mb
                @Override // android.os.CountDownTimer
                public final void onFinish() {
                    this.LIZ = null;
                }

                @Override // android.os.CountDownTimer
                public final void onTick(long j3) {
                    long jCurrentTimeMillis = j - System.currentTimeMillis();
                    if (jCurrentTimeMillis > 0) {
                        Function1<Long, Unit> function12 = function1;
                        if (function12 != null) {
                            function12.invoke(Long.valueOf(jCurrentTimeMillis));
                            return;
                        }
                        return;
                    }
                    CountDownTimer countDownTimer2 = this.LIZ;
                    if (countDownTimer2 != null) {
                        countDownTimer2.cancel();
                    }
                    Function0<Unit> function02 = function0;
                    if (function02 != null) {
                        function02.invoke();
                    }
                }
            }.start();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            EnumC1014603xw enumC1014603xw = EnumC1014603xw.ERR98;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("CountDownTimer Exception: ");
            sbLIZ.append(e.getMessage());
            C1019103yf.LIZ(enumC1014603xw, new RuntimeException(C2188811AlT.LIZIZ(sbLIZ)), null);
        }
    }
}
