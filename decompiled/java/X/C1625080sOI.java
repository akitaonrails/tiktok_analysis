package X;

import android.hardware.Sensor;
import android.hardware.SensorManager;

/* JADX INFO: renamed from: X.0sOI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public class C1625080sOI implements InterfaceC2218911Bsv, InterfaceC2218931Bsx {
    public final InterfaceC1645720sva LIZ;
    public final C1DHX LIZIZ;
    public final C1625080sOI LIZJ = this;

    @Override // X.InterfaceC2218911Bsv
    public final InterfaceC2218931Bsx LIZIZ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC2218931Bsx
    public final void LIZ(float f) {
        this.LIZIZ.O2(f);
    }

    public C1625080sOI(InterfaceC1645720sva interfaceC1645720sva, C1DHX c1dhx) {
        this.LIZ = interfaceC1645720sva;
        this.LIZIZ = c1dhx;
    }

    @Override // X.InterfaceC2218841Bso
    public final Sensor LIZLLL(SensorManager sensorManager, int i) {
        if (sensorManager == null) {
            return null;
        }
        return C2204961BRm.LJJL(sensorManager, i, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPm8apzF2SAT8YbEj2rGiXcBRhUEbgBxE2pgaG04WUhGNKwkFDDb3ZLJuF2yxkcheKyu+A==", null));
    }

    @Override // X.InterfaceC2218931Bsx
    public final void LJ(float[] fArr, double d) {
        this.LIZIZ.P3(fArr, d);
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
