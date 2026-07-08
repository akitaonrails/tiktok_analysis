package X;

import Y.ARunnableS25S1100000_20;
import android.media.MediaCodec;
import android.view.Surface;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.animax.player.VideoAsset;
import com.lynx.animax.util.AnimaXLog;

/* JADX INFO: renamed from: X.0jYm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1285620jYm {
    public MediaCodec LIZ;
    public String LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public int LJ;
    public int LJFF;
    public int LJI;
    public int LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public int LJIIJ;
    public long LJIIJJI;
    public InterfaceC1285660jYq LJIIL;
    public VideoAsset LJIILIIL;
    public Surface LJIILJJIL;

    /* JADX WARN: Code restructure failed: missing block: B:90:0x0030, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ() {
        /*
            Method dump skipped, instruction units count: 461
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1285620jYm.LIZ():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZIZ() {
        /*
            Method dump skipped, instruction units count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1285620jYm.LIZIZ():boolean");
    }

    public final void LIZJ() {
        if (this.LIZ == null) {
            return;
        }
        AnimaXLog.LIZIZ("CodecManager", "releaseDecoder");
        try {
            this.LIZ.stop();
        } catch (IllegalArgumentException | IllegalStateException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("stopDecoder Exception: ");
            sbLIZ.append(e.getMessage());
            C2188811AlT.LIZIZ(sbLIZ);
        }
        this.LIZJ = false;
        this.LIZ.release();
        this.LIZ = null;
        this.LJIIIZ = 0;
        LJ();
        this.LJ = -1;
        this.LJII = 0;
        this.LJFF = 0;
        this.LJI = -1;
    }

    public final void LJ() {
        if (this.LJIIIZ < 0) {
            this.LJIIIZ = 0;
        }
        int i = this.LJIIIZ;
        if (i > 1) {
            this.LJIIIIZZ = Math.min(20, i + 5);
        } else {
            this.LJIIIIZZ = Math.min(20, (i * 3) + 3);
        }
    }

    public C1285620jYm(C1285630jYn c1285630jYn) {
        this.LJIIL = c1285630jYn;
    }

    public final void LIZLLL(String str) {
        InterfaceC1285660jYq interfaceC1285660jYq = this.LJIIL;
        if (interfaceC1285660jYq != null) {
            C1285630jYn c1285630jYn = (C1285630jYn) interfaceC1285660jYq;
            c1285630jYn.getClass();
            c1285630jYn.LJI(new ARunnableS25S1100000_20(c1285630jYn, str, 29));
        }
    }
}
