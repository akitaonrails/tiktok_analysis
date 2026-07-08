package X;

import Y.ARunnableS11S2100000_23;
import Y.ARunnableS123S0100000_23;
import Y.ARunnableS28S1100000_23;
import Y.ARunnableS8S0100002_23;
import Y.ARunnableS92S0200000_23;
import android.os.Handler;

/* JADX INFO: renamed from: X.0og3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1482330og3 extends C1482320og2 {
    public final InterfaceC1483670oiD LJ;
    public final C1482320og2 LJFF;
    public final Handler LJI;

    @Override // X.C1482320og2, X.InterfaceC1483810oiR
    public final void mute() {
        C786410Ut5.LJJZZIII(this.LJI, new ARunnableS123S0100000_23(this, 162));
    }

    @Override // X.C1482320og2, X.InterfaceC1483810oiR
    public final void unmute() {
        C786410Ut5.LJJZZIII(this.LJI, new ARunnableS123S0100000_23(this, 163));
    }

    public static void LJI(C1482330og3 c1482330og3) {
        C1C7U.LIZ("AsyncConfigSetter@da8d.mute$1L");
        super.mute();
        C1C7U.LIZIZ("AsyncConfigSetter@da8d.mute$1L");
    }

    public static void LJIIJ(C1482330og3 c1482330og3) {
        C1C7U.LIZ("AsyncConfigSetter@da8d.unmute$1L");
        super.unmute();
        C1C7U.LIZIZ("AsyncConfigSetter@da8d.unmute$1L");
    }

    @Override // X.C1482320og2, X.InterfaceC1483810oiR
    public final void LIZ(InterfaceC585470Mxl interfaceC585470Mxl) {
        C786410Ut5.LJJZZIII(this.LJI, new ARunnableS92S0200000_23(this, interfaceC585470Mxl, 101));
    }

    @Override // X.C1482320og2, X.InterfaceC1483810oiR
    public final void LIZIZ(InterfaceC1481780ofA interfaceC1481780ofA) {
        C786410Ut5.LJJZZIII(this.LJI, new ARunnableS92S0200000_23(this, interfaceC1481780ofA, 102));
    }

    @Override // X.C1482320og2, X.InterfaceC1483810oiR
    public final void LIZJ(String str) {
        C786410Ut5.LJJZZIII(this.LJI, new ARunnableS28S1100000_23(this, str, 32));
    }

    @Override // X.C1482320og2, X.InterfaceC1483810oiR
    public final void LJ(InterfaceC585470Mxl interfaceC585470Mxl) {
        C786410Ut5.LJJZZIII(this.LJI, new ARunnableS92S0200000_23(this, interfaceC585470Mxl, 103));
    }

    public static void LJFF(C1482330og3 c1482330og3, InterfaceC585470Mxl interfaceC585470Mxl) {
        C1C7U.LIZ("AsyncConfigSetter@da8d.clearSdkReporterListener$1L");
        super.LJ(interfaceC585470Mxl);
        c1482330og3.LJFF.LJ(interfaceC585470Mxl);
        C1C7U.LIZIZ("AsyncConfigSetter@da8d.clearSdkReporterListener$1L");
    }

    public static void LJII(C1482330og3 c1482330og3, String str) {
        C1C7U.LIZ("AsyncConfigSetter@da8d.setExternalLog$1L");
        super.LIZJ(str);
        c1482330og3.LJFF.LIZJ(str);
        C1C7U.LIZIZ("AsyncConfigSetter@da8d.setExternalLog$1L");
    }

    @Override // X.C1482320og2, X.InterfaceC1483810oiR
    public final void LIZLLL(String str, String str2) {
        C786410Ut5.LJJZZIII(this.LJI, new ARunnableS11S2100000_23(this, str2, 9));
    }

    @Override // X.C1482320og2, X.InterfaceC1483810oiR
    public final void LJIILLIIL(float f, float f2) {
        C786410Ut5.LJJZZIII(this.LJI, new ARunnableS8S0100002_23(this, f, f2, 1));
    }

    public static void LJIIIIZZ(C1482330og3 c1482330og3, String str, String str2) {
        C1C7U.LIZ("AsyncConfigSetter@da8d.setVodSceneTag$1L");
        super.LIZLLL(str, str2);
        C1C7U.LIZIZ("AsyncConfigSetter@da8d.setVodSceneTag$1L");
    }

    public static void LJIIIZ(C1482330og3 c1482330og3, float f, float f2) {
        C1C7U.LIZ("AsyncConfigSetter@da8d.setVolume$1L");
        super.LJIILLIIL(f, f2);
        C1C7U.LIZIZ("AsyncConfigSetter@da8d.setVolume$1L");
    }

    public C1482330og3(InterfaceC1479560oba interfaceC1479560oba, C1480620odI c1480620odI, C1482320og2 c1482320og2, Handler handler) {
        super(interfaceC1479560oba, c1480620odI);
        this.LJ = c1480620odI;
        this.LJFF = c1482320og2;
        this.LJI = handler;
    }
}
