package X;

import Y.ARunnableS92S0200000_23;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;

/* JADX INFO: renamed from: X.0oHL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1467010oHL {
    public final C1467480oI6 LIZ;
    public final C1467480oI6 LIZIZ;
    public final C1467480oI6 LIZJ;
    public final C1467480oI6 LIZLLL;
    public final C1468040oJ0 LJ;
    public volatile boolean LJFF;
    public boolean LJI;
    public final C1467490oI7 LJII;
    public final C1467220oHg LJIIIIZZ;

    public final void LIZ() {
        this.LIZ.LIZ();
        this.LIZIZ.LIZ();
        this.LIZJ.LIZ();
        this.LIZLLL.LIZ();
        C1467490oI7 c1467490oI7 = this.LJII;
        if (c1467490oI7 == null || c1467490oI7.LIZJ == 0) {
            return;
        }
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("this:");
        sbLIZ.append(c1467490oI7);
        sbLIZ.append(",clear");
        TTVideoEngineLog.d("VodQualityHelper", C2188811AlT.LIZIZ(sbLIZ));
        c1467490oI7.LIZ.LIZ();
        c1467490oI7.LIZLLL.clear();
        c1467490oI7.LJ = 0;
        c1467490oI7.LJFF = 0;
    }

    public final int LIZIZ() {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getAudioPlayDuration: ");
        sbLIZ.append(this.LIZIZ.LIZIZ());
        TTVideoEngineLog.d("BackGroundAudioPlayLog", C2188811AlT.LIZIZ(sbLIZ));
        return this.LIZIZ.LIZIZ();
    }

    public final void LIZJ() {
        if (this.LJFF) {
            int i = C2187451AjH.LIZ;
            C1471660oOq.LIZJ("PlayDurationManager", "Already started");
            return;
        }
        this.LJFF = true;
        this.LIZ.LIZLLL();
        if (this.LJI) {
            this.LIZIZ.LIZLLL();
        }
        if (this.LJ.LIZIZ()) {
            this.LIZJ.LIZLLL();
        } else if (this.LJ.LIZJ()) {
            this.LIZLLL.LIZLLL();
        }
        int i2 = C2187451AjH.LIZ;
        TTVideoEngineLog.d("PlayDurationManager", "start play");
        C1467490oI7 c1467490oI7 = this.LJII;
        if (c1467490oI7 == null || c1467490oI7.LIZJ == 0) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("this:");
        sbLIZ.append(c1467490oI7);
        sbLIZ.append(",start");
        TTVideoEngineLog.d("VodQualityHelper", C2188811AlT.LIZIZ(sbLIZ));
        c1467490oI7.LIZ.LIZLLL();
    }

    public final void LIZLLL() {
        if (!this.LJFF) {
            int i = C2187451AjH.LIZ;
            C1471660oOq.LIZJ("PlayDurationManager", "Already stopped");
            return;
        }
        this.LJFF = false;
        this.LIZ.LJ();
        if (this.LJI) {
            this.LIZIZ.LJ();
        }
        if (this.LJ.LIZIZ()) {
            this.LIZJ.LJ();
        }
        if (this.LJ.LIZJ()) {
            this.LIZLLL.LJ();
        }
        int i2 = C2187451AjH.LIZ;
        TTVideoEngineLog.d("PlayDurationManager", C786410Ut5.j4("stop: play duration: %s, wiredDuration: %s, wirelessDuration: %s", new Object[]{Integer.valueOf(this.LIZ.LIZIZ()), Integer.valueOf(this.LIZIZ.LIZIZ()), Integer.valueOf(this.LIZJ.LIZIZ()), Integer.valueOf(this.LIZLLL.LIZIZ())}));
        C1467490oI7 c1467490oI7 = this.LJII;
        if (c1467490oI7 == null || c1467490oI7.LIZJ == 0) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("this:");
        sbLIZ.append(c1467490oI7);
        sbLIZ.append(",stop");
        TTVideoEngineLog.d("VodQualityHelper", C2188811AlT.LIZIZ(sbLIZ));
        c1467490oI7.LIZ.LJ();
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.0oHg, java.lang.Object] */
    public C1467010oHL(C1468040oJ0 c1468040oJ0) {
        ?? r3 = new InterfaceC1468050oJ1() { // from class: X.0oHg
            @Override // X.InterfaceC1468050oJ1
            public final void LIZ(boolean z, boolean z2) {
                int i = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onHeadsetStateChanged: ");
                sbLIZ.append(z);
                sbLIZ.append(", ");
                sbLIZ.append(z2);
                TTVideoEngineLog.d("PlayDurationManager", C2188811AlT.LIZIZ(sbLIZ));
                if (!z) {
                    this.LIZ.LIZJ.LJ();
                    this.LIZ.LIZLLL.LJ();
                } else if (z2) {
                    if (this.LIZ.LJFF) {
                        this.LIZ.LIZLLL.LIZLLL();
                        this.LIZ.LIZJ.LJ();
                    }
                } else if (this.LIZ.LJFF) {
                    this.LIZ.LIZJ.LIZLLL();
                    this.LIZ.LIZLLL.LJ();
                }
                TTVideoEngineLog.d("PlayDurationManager", C786410Ut5.j4("wiredDuration: %s, wirelessDuration: %s", new Object[]{Integer.valueOf(this.LIZ.LIZJ.LIZIZ()), Integer.valueOf(this.LIZ.LIZLLL.LIZIZ())}));
            }
        };
        this.LJIIIIZZ = r3;
        this.LJ = c1468040oJ0;
        this.LIZ = new C1467480oI6();
        this.LIZIZ = new C1467480oI6();
        this.LIZJ = new C1467480oI6();
        this.LIZLLL = new C1467480oI6();
        C1468040oJ0.LJI(c1468040oJ0.LIZIZ, new ARunnableS92S0200000_23(c1468040oJ0, (Object) r3, 83));
    }

    public C1467010oHL(C1468040oJ0 c1468040oJ0, C1467490oI7 c1467490oI7) {
        this(c1468040oJ0);
        this.LJII = c1467490oI7;
    }
}
