package X;

import com.ss.android.ttve.model.VETrackParams;
import com.ss.android.vesdk.VEInfo;
import com.ss.android.vesdk.filterparam.VEVideoEffectStreamFilterParam;
import com.ss.android.vesdk.k;

/* JADX INFO: renamed from: X.1DLm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2254361DLm implements C1DMH, InterfaceC2254511DMb, InterfaceC1622650sKN {
    public final k LIZ;
    public String LIZIZ;
    public String LIZJ;
    public boolean LJ;
    public int LIZLLL = -1;
    public int LJFF = -1;

    @Override // X.InterfaceC1622650sKN
    public final void LIZ(boolean z) {
    }

    @Override // X.C1DMH
    public final void LIZIZ() {
    }

    @Override // X.C1DMH
    public final void LIZLLL() {
    }

    @Override // X.C1DMY
    public final void LJ(int i) {
    }

    @Override // X.InterfaceC1622650sKN
    public final void LJFF(C1622630sKL c1622630sKL) {
    }

    @Override // X.C1DMY
    public final void LJI(boolean z) {
    }

    public final synchronized void LJIIIZ() {
        LJII(this.LIZJ);
        if (!this.LJ) {
            this.LIZ.LJIIIIZZ(this.LIZLLL, 0, 0, 0);
            start();
        }
    }

    @Override // X.C1DMH
    public final void onDestroy() {
        int i = this.LIZLLL;
        if (i >= 0) {
            this.LIZ.LJJIIJ(0, i, true);
            this.LIZLLL = -1;
        }
        int i2 = this.LJFF;
        if (i2 != -1) {
            this.LIZ.LJJIZ.removeTrackFilter(i2);
            this.LJFF = -1;
        }
        this.LIZ.LIZLLL(this);
    }

    @Override // X.InterfaceC1622650sKN
    public final void pause() {
        this.LIZ.LJJIII(this.LIZLLL, 0);
    }

    @Override // X.InterfaceC1622650sKN
    public final void start() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("start play track ");
        sbLIZ.append(this.LIZLLL);
        C2484209oO.LJI("TEVideoGifBgProxy", C2188811AlT.LIZIZ(sbLIZ));
        int i = this.LIZLLL;
        if (i >= 0) {
            this.LIZ.LJJJ.LJJIIZI(i, 0, 0, -1, -1L, true);
        }
    }

    @Override // X.C1DMH
    public final void LJJIJIIJIL() {
        pause();
    }

    @Override // X.C1DMH
    public final void LIZJ(float f) {
        if (!this.LJ) {
            this.LJ = true;
            LJIIIIZZ(0L);
        }
        start();
    }

    public final void LJII(String str) {
        C2254451DLv c2254451DLv = new C2254451DLv();
        c2254451DLv.LIZ(str);
        c2254451DLv.LIZLLL();
        c2254451DLv.LJ(0);
        c2254451DLv.LJFF(-1);
        VETrackParams vETrackParams = c2254451DLv.LIZ;
        vETrackParams.layer = 1;
        vETrackParams.trackPriority = C1D40.External;
        int iLJII = this.LIZ.LJII(0, vETrackParams, true);
        this.LIZLLL = iLJII;
        this.LIZ.LJJIIJZLJL(iLJII, 0, 0L);
        int i = this.LIZLLL;
        VEVideoEffectStreamFilterParam vEVideoEffectStreamFilterParam = new VEVideoEffectStreamFilterParam();
        vEVideoEffectStreamFilterParam.streamFlags = 6;
        vEVideoEffectStreamFilterParam.extraString = this.LIZIZ;
        int i2 = this.LJFF;
        if (i2 >= 0) {
            this.LIZ.LJJIZ.updateTrackFilterParam(i2, vEVideoEffectStreamFilterParam);
        } else {
            this.LJFF = this.LIZ.LJJIZ.addTrackFilter(0, i, vEVideoEffectStreamFilterParam, -1, -1);
        }
    }

    public final void LJIIIIZZ(long j) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("seek ");
        sbLIZ.append(j);
        C2484209oO.LJI("TEVideoGifBgProxy", C2188811AlT.LIZIZ(sbLIZ));
        int i = this.LIZLLL;
        if (i >= 0) {
            this.LIZ.LJJIIJZLJL(i, 0, j);
        }
    }

    public C2254361DLm(k kVar, String str, String str2) {
        this.LIZ = kVar;
        this.LIZIZ = str;
        this.LIZJ = str2;
    }

    @Override // X.InterfaceC2254511DMb
    public final void onInfo(int i, int i2, String str) {
        if (i == VEInfo.TE_INFO_DELETE_LAST_FRAG_DONE_NOTIFY) {
            LJIIIIZZ(this.LIZ.LJIILL());
        }
    }
}
