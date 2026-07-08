package X;

import android.os.CountDownTimer;

/* JADX INFO: renamed from: X.0xFU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class CountDownTimerC1811820xFU extends CountDownTimer {
    public InterfaceC1811830xFV LIZ;
    public boolean LIZIZ;

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        this.LIZIZ = true;
        InterfaceC1811830xFV interfaceC1811830xFV = this.LIZ;
        if (interfaceC1811830xFV != null) {
            interfaceC1811830xFV.LIZLLL();
        }
    }

    public CountDownTimerC1811820xFU(long j) {
        super(j, 1000L);
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        InterfaceC1811830xFV interfaceC1811830xFV = this.LIZ;
        if (interfaceC1811830xFV != null) {
            interfaceC1811830xFV.LJJI(j);
        }
    }
}
