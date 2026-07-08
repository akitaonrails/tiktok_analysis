package X;

import com.ss.android.ugc.playerkit.radar.SimRadar;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0oRC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1473120oRC implements InterfaceC1473180oRI {
    public final C1473150oRF LIZ;
    public final String LIZJ;
    public final long LIZIZ = TimeUnit.SECONDS.toMillis(1);
    public String LIZLLL = "";

    @Override // X.InterfaceC1473180oRI
    public void LIZ() {
    }

    @Override // X.InterfaceC1473180oRI
    public final void LIZIZ() {
    }

    @Override // X.InterfaceC1473180oRI
    public void LIZJ() {
    }

    @Override // X.InterfaceC1473180oRI
    public void LIZLLL() {
    }

    @Override // X.InterfaceC1473180oRI
    public void LJ() {
    }

    @Override // X.InterfaceC1473180oRI
    public void LJFF() {
    }

    @Override // X.InterfaceC1473180oRI
    public void LJI() {
    }

    @Override // X.InterfaceC1473180oRI
    public void LJIIIIZZ() {
    }

    @Override // X.InterfaceC1473180oRI
    public final void LJIIIZ() {
    }

    @Override // X.InterfaceC1473180oRI
    public void LJIIJ() {
    }

    @Override // X.InterfaceC1473180oRI
    public void Ur() {
    }

    public C1473120oRC(C1473150oRF c1473150oRF) {
        this.LIZ = c1473150oRF;
        this.LIZJ = c1473150oRF.LIZ;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIL(java.lang.String r3, java.lang.String r4) {
        /*
            r2 = this;
            int r1 = X.C1473020oR2.LIZ(r4)
            java.lang.String r0 = r2.LIZLLL
            int r0 = X.C1473020oR2.LIZ(r0)
            if (r1 <= r0) goto L41
            r2.LIZLLL = r4
            X.0oRF r1 = r2.LIZ
            r1.LIZLLL = r4
            int r0 = r4.hashCode()
            switch(r0) {
                case -1472362992: goto L79;
                case -782671117: goto L6e;
                case -355504186: goto L63;
                case 16226426: goto L58;
                case 1503668517: goto L4d;
                case 1909244093: goto L42;
                default: goto L19;
            }
        L19:
            r0 = -1
        L1a:
            r1.LIZJ = r0
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "postTag:["
            r1.append(r0)
            r1.append(r4)
            r0 = 44
            r1.append(r0)
            r1.append(r3)
            r0 = 93
            r1.append(r0)
            X.C2188811AlT.LIZIZ(r1)
            com.ss.android.ugc.playerkit.radar.IRadarTransmitter r0 = X.C1475000oUE.LJIIIZ()
            if (r0 == 0) goto L41
            r0.tag(r4)
        L41:
            return
        L42:
            java.lang.String r0 = "IE-HideCoverTimeout"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L19
            r0 = 200(0xc8, float:2.8E-43)
            goto L1a
        L4d:
            java.lang.String r0 = "Short-Pause"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L19
            r0 = 103(0x67, float:1.44E-43)
            goto L1a
        L58:
            java.lang.String r0 = "Pause-B4-Render"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L19
            r0 = 100
            goto L1a
        L63:
            java.lang.String r0 = "Stop-B4-Render"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L19
            r0 = 101(0x65, float:1.42E-43)
            goto L1a
        L6e:
            java.lang.String r0 = "Short-Stop"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L19
            r0 = 102(0x66, float:1.43E-43)
            goto L1a
        L79:
            java.lang.String r0 = "Not-Render"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L19
            r0 = 104(0x68, float:1.46E-43)
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1473120oRC.LJIIL(java.lang.String, java.lang.String):void");
    }

    public static void LJIIJJI(String str, AbstractC1478150oZJ abstractC1478150oZJ, Object... objArr) {
        SimRadar.errorScan("Analyzer", str, abstractC1478150oZJ, Arrays.copyOf(objArr, objArr.length));
    }
}
