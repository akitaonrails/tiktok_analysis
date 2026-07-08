package X;

import android.os.CountDownTimer;
import kotlin.jvm.internal.AFwS261S0000000_22;

/* JADX INFO: renamed from: X.0oGZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public class CountDownTimerC1466530oGZ extends CountDownTimer {
    public final int $t;
    public Object l0;

    public static final void onTick$0(CountDownTimerC1466530oGZ countDownTimerC1466530oGZ, long j) {
    }

    public static final void onTick$1(CountDownTimerC1466530oGZ countDownTimerC1466530oGZ, long j) {
    }

    public static final void onTick$2(CountDownTimerC1466530oGZ countDownTimerC1466530oGZ, long j) {
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        switch (this.$t) {
            case 0:
                onFinish$0(this);
                break;
            case 1:
                onFinish$1(this);
                break;
            case 2:
                onFinish$2(this);
                break;
            default:
                super.onFinish();
                break;
        }
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        switch (this.$t) {
            case 0:
                onTick$0(this, j);
                break;
            case 1:
                onTick$1(this, j);
                break;
            case 2:
                onTick$2(this, j);
                break;
            default:
                super.onTick(j);
                break;
        }
    }

    public static final void onFinish$0(CountDownTimerC1466530oGZ countDownTimerC1466530oGZ) {
        ((C1459970o5z) countDownTimerC1466530oGZ.l0).LLLLJI().LJI(1105, AFwS261S0000000_22.get$arr$(228));
    }

    public static final void onFinish$1(CountDownTimerC1466530oGZ countDownTimerC1466530oGZ) {
        ((InterfaceC1433580nPQ) countDownTimerC1466530oGZ.l0).LJIILL(new C1433230nOr("time out", null, 6));
    }

    public static final void onFinish$2(CountDownTimerC1466530oGZ countDownTimerC1466530oGZ) {
        ((InterfaceC1433580nPQ) countDownTimerC1466530oGZ.l0).LJIILL(new C1433230nOr("time out", null, 6));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountDownTimerC1466530oGZ(C1459970o5z c1459970o5z, int i) {
        super(3000L, 1000L);
        this.$t = i;
        this.l0 = c1459970o5z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountDownTimerC1466530oGZ(InterfaceC1433580nPQ interfaceC1433580nPQ, int i) {
        super(15000L, 15000L);
        this.$t = i;
        this.l0 = interfaceC1433580nPQ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountDownTimerC1466530oGZ(long j, InterfaceC1433580nPQ interfaceC1433580nPQ, int i) {
        super(j, j);
        this.$t = i;
        this.l0 = interfaceC1433580nPQ;
    }
}
