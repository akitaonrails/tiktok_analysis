package X;

import android.os.SystemClock;

/* JADX INFO: renamed from: X.0IEV, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IEV {
    public static volatile long LIZ = -1;
    public static volatile long LIZIZ = -1;
    public static volatile String LIZJ = "none";
    public static volatile String LIZLLL = "";
    public static volatile String LJ = "";
    public static volatile long LJFF = -1;
    public static volatile long LJI = -1;
    public static volatile String LJII = "none";
    public static volatile String LJIIIIZZ = "";
    public static volatile String LJIIIZ = "";
    public static volatile long LJIIJ = -1;
    public static volatile long LJIIJJI;
    public static volatile long LJIIL;
    public static volatile C0IIQ LJIILIIL = C0IIQ.CLICK;
    public static volatile String LJIILJJIL = "";
    public static volatile String LJIILL = "";
    public static volatile String LJIILLIIL = "";
    public static final C463150IEf LJIIZILJ = new InterfaceC1107700evo() { // from class: X.0IEf
        @Override // X.InterfaceC1107700evo
        public final void LIZ(String str) {
            C0IEV.LJI = SystemClock.elapsedRealtime();
            C0IEV.LJII = "panel";
            C0IEV.LJIIIIZZ = "";
            if (str == null) {
                str = "";
            }
            C0IEV.LJIIIZ = str;
        }

        @Override // X.InterfaceC1107700evo
        public final void LIZIZ(String str) {
            C0IEV.LIZIZ = SystemClock.elapsedRealtime();
            C0IEV.LIZJ = "sheet";
            if (str == null) {
                str = "";
            }
            C0IEV.LIZLLL = str;
            C0IEV.LJ = "";
        }

        @Override // X.InterfaceC1107700evo
        public final void LIZJ(String str) {
            C0IEV.LJI = SystemClock.elapsedRealtime();
            C0IEV.LJII = "sheet";
            if (str == null) {
                str = "";
            }
            C0IEV.LJIIIIZZ = str;
            C0IEV.LJIIIZ = "";
        }

        @Override // X.InterfaceC1107700evo
        public final void LIZLLL(String str) {
            C0IEV.LIZIZ = SystemClock.elapsedRealtime();
            C0IEV.LIZJ = "panel";
            C0IEV.LIZLLL = "";
            if (str == null) {
                str = "";
            }
            C0IEV.LJ = str;
        }
    };
}
