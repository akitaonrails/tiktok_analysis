package X;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.1D4w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2250041D4w {
    public C2249981D4q LIZIZ;
    public C1D47 LJIIIIZZ;
    public final Map<String, C1D54> LIZ = new HashMap();
    public C1D54 LIZJ = null;
    public C1D47 LIZLLL = null;
    public C1D47 LJ = null;
    public int LJFF = 3;
    public int LJI = 0;
    public boolean LJII = false;
    public boolean LJIIIZ = false;
    public int LJIIJ = -1;
    public final C1D5A LJIIJJI = new C1D5A();
    public EnumC2249781D3w LJIIL = EnumC2249781D3w.DEFAULT;
    public EnumC1283150jUn LJIILIIL = EnumC1283150jUn.DEFAULT;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1D54 LIZ(java.lang.String r9) {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2250041D4w.LIZ(java.lang.String):X.1D54");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1D47 LIZIZ(X.EnumC2249761D3u r10) {
        /*
            Method dump skipped, instruction units count: 554
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2250041D4w.LIZIZ(X.1D3u):X.1D47");
    }

    public final void LIZJ(C1D49 c1d49) {
        boolean z;
        if (c1d49 == null) {
            return;
        }
        this.LJIIJJI.LJFF = c1d49.LIZIZ();
        this.LJIIJJI.LIZ = this.LJIILIIL;
        if (this.LJII) {
            C1D54 c1d54LIZ = LIZ("probe");
            if (c1d54LIZ instanceof C1D52) {
                ((C1D52) c1d54LIZ).LIZJ(c1d49);
            } else {
                C1283420jVE.LJ("updateBandwidthResultLevel: failed ProbeStrategy not inited");
            }
            z = true;
        } else {
            z = false;
        }
        if (this.LJIIIZ) {
            C1D54 c1d54LIZ2 = LIZ("gearshift");
            if (c1d54LIZ2 instanceof C1D52) {
                ((C1D52) c1d54LIZ2).LIZJ(c1d49);
            } else {
                C1283420jVE.LJ("updateBandwidthResultLevel: failed GearShiftStrategy not inited");
            }
            z = true;
        }
        if (this.LJIILIIL == EnumC1283150jUn.GAME) {
            C1D54 c1d54LIZ3 = LIZ("business");
            if (c1d54LIZ3 instanceof C1D52) {
                ((C1D52) c1d54LIZ3).LIZJ(c1d49);
            } else {
                C1283420jVE.LJ("updateBandwidthResultLevel: failed BusinessStrategy not inited");
            }
        } else if (!z) {
            return;
        }
        this.LJFF |= 3;
    }
}
