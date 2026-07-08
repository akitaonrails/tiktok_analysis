package X;

import android.os.CountDownTimer;
import android.os.SystemClock;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchCountDownOptSetting;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS57S0100100_26;

/* JADX INFO: renamed from: X.0uKg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1699720uKg {
    public InterfaceC1699740uKi LIZ;
    public CountDownTimer LIZIZ;
    public C1699700uKe LIZJ;

    public final void LIZ() {
        C20441214yg.LJ("MultiMatchUtils", "MatchCountDownTimer cancel: ");
        CountDownTimer countDownTimer = this.LIZIZ;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        C1699700uKe c1699700uKe = this.LIZJ;
        if (c1699700uKe != null) {
            c1699700uKe.LJ = false;
            C1699700uKe.LJII.getValue().removeCallbacks(c1699700uKe.LJFF);
        }
        this.LIZ = null;
    }

    public final void LIZIZ(final long j, final long j2) {
        C1699700uKe c1699700uKe = this.LIZJ;
        if (c1699700uKe != null) {
            c1699700uKe.LJ = false;
            C1699700uKe.LJII.getValue().removeCallbacks(c1699700uKe.LJFF);
        }
        CountDownTimer countDownTimer = this.LIZIZ;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        if (LiveMatchCountDownOptSetting.INSTANCE.isEnable() && j2 > 200) {
            long j3 = 1000 * j;
            C1699700uKe c1699700uKe2 = new C1699700uKe(j3, j2, new AwS57S0100100_26(this, j, 4), new AwS570S0100000_26(this, 1322));
            this.LIZJ = c1699700uKe2;
            if (!c1699700uKe2.LJ) {
                c1699700uKe2.LJ = true;
                c1699700uKe2.LIZLLL = SystemClock.elapsedRealtime() + j3;
                C786410Ut5.LJJZZIII(C1699700uKe.LJII.getValue(), c1699700uKe2.LJFF);
                return;
            }
            return;
        }
        final long j4 = j * 1000;
        this.LIZIZ = new CountDownTimer(j2, j4) { // from class: X.0uKh
            @Override // android.os.CountDownTimer
            public final void onFinish() {
                C20441214yg.LJ("MultiMatchUtils", "countDownTimer: onFinish");
                InterfaceC1699740uKi interfaceC1699740uKi = this.LIZ;
                if (interfaceC1699740uKi != null) {
                    interfaceC1699740uKi.LIZLLL();
                }
            }

            @Override // android.os.CountDownTimer
            public final void onTick(long j5) {
                InterfaceC1699740uKi interfaceC1699740uKi;
                this.getClass();
                long j6 = j5 / 1000;
                if (j5 - (1000 * j6) > 600) {
                    j6++;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("countDownTimer onTick: millisUntilFinished ");
                sbLIZ.append(j5);
                sbLIZ.append(", second ");
                sbLIZ.append(j6);
                sbLIZ.append(", countInSecs ");
                sbLIZ.append(j);
                C20441214yg.LJ("MultiMatchUtils", C2188811AlT.LIZIZ(sbLIZ));
                if (j6 != j && (interfaceC1699740uKi = this.LIZ) != null) {
                    interfaceC1699740uKi.LJJI(j6);
                }
            }
        }.start();
    }
}
