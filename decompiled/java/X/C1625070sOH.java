package X;

import android.hardware.Sensor;
import android.hardware.SensorManager;

/* JADX INFO: renamed from: X.0sOH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public class C1625070sOH implements InterfaceC2218911Bsv, InterfaceC2218931Bsx {
    public final InterfaceC1625060sOG LIZ;
    public final C1625070sOH LIZIZ = this;

    @Override // X.InterfaceC2218911Bsv
    public final InterfaceC2218931Bsx LIZIZ() {
        return this.LIZIZ;
    }

    public C1625070sOH(InterfaceC1625060sOG interfaceC1625060sOG) {
        this.LIZ = interfaceC1625060sOG;
    }

    @Override // X.InterfaceC2218931Bsx
    public final void LIZ(float f) {
        this.LIZ.O2(f);
    }

    @Override // X.InterfaceC2218841Bso
    public final Sensor LIZLLL(SensorManager sensorManager, int i) {
        if (sensorManager == null) {
            return null;
        }
        return C2204961BRm.LJJL(sensorManager, i, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOOlLZzc2TPTVoycpOlaAQkxanv9pZVhNE4iBT03iKKJUlCcqo/LBkKqTXbSbQ==", null));
    }

    @Override // X.InterfaceC2218931Bsx
    public final void LJ(float[] fArr, double d) {
        this.LIZ.P3(fArr, d);
    }

    @Override // X.InterfaceC2218911Bsv
    public final void LJLI(double d, double[] dArr) {
        this.LIZ.LJLI(d, dArr);
    }

    @Override // X.InterfaceC2218911Bsv
    public final void LJJZZIII(double d, double d2, double d3, double d4) {
        this.LIZ.LJJZZIII(d, d2, d3, d4);
    }

    @Override // X.InterfaceC2218911Bsv
    public final void LJLIIL(double d, double d2, double d3, double d4) {
        this.LIZ.LJLIIL(d, d2, d3, d4);
    }

    @Override // X.InterfaceC2218911Bsv
    public final void LJLIL(boolean z, boolean z2, boolean z3, boolean z4) {
        this.LIZ.LJLIL(z, z2, z3, z4);
    }

    @Override // X.InterfaceC2218911Bsv
    public final void LJLJI(double d, double d2, double d3, double d4) {
        this.LIZ.LJLJI(d, d2, d3, d4);
    }
}
