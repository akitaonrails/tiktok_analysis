package X;

import com.ss.android.ttve.model.VETrackParams;
import com.ss.android.vesdk.VEReactSettings;
import com.ss.android.vesdk.VESize;
import com.ss.android.vesdk.filterparam.VECanvasFilterParam;
import com.ss.android.vesdk.filterparam.VEVideoTransformFilterParam;
import com.ss.android.vesdk.k;
import com.ss.android.vesdk.proxy.TEDuetProxy;

/* JADX INFO: renamed from: X.1DLl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2254351DLl extends TEDuetProxy {
    public static final String LJIILIIL = TEDuetProxy.class.getSimpleName();
    public final VEReactSettings LJIIL = null;

    @Override // com.ss.android.vesdk.proxy.TEDuetProxy
    public final int[] LJFF() {
        return new int[]{2, 1, 0};
    }

    @Override // com.ss.android.vesdk.proxy.TEDuetProxy
    public final void LJIIIZ() {
        VEVideoTransformFilterParam vEVideoTransformFilterParam = new VEVideoTransformFilterParam();
        vEVideoTransformFilterParam.filterName = "canvas blend";
        vEVideoTransformFilterParam.scaleFactor = 1.0f;
        vEVideoTransformFilterParam.transX = 0.0f;
        vEVideoTransformFilterParam.alpha = 1.0f;
        int i = this.LJIIIZ;
        if (i >= 0) {
            this.LIZIZ.LJJIZ.updateTrackFilterParam(i, vEVideoTransformFilterParam);
        } else {
            this.LJIIIZ = this.LIZIZ.LJJIZ.addTrackFilter(0, 0, vEVideoTransformFilterParam, -1, -1);
        }
        VECanvasFilterParam vECanvasFilterParam = new VECanvasFilterParam();
        vECanvasFilterParam.filterName = "canvas wrap";
        VESize vESize = this.LJ;
        vECanvasFilterParam.width = vESize.width;
        vECanvasFilterParam.height = vESize.height;
        vECanvasFilterParam.color = -65536;
        vECanvasFilterParam.sourceType = VECanvasFilterParam.SourceType.VIDEOFRAME.ordinal();
        int i2 = this.LJIIIIZZ;
        if (i2 >= 0) {
            this.LIZIZ.LJJIZ.updateTrackFilterParam(i2, vECanvasFilterParam);
        } else {
            this.LJIIIIZZ = this.LIZIZ.LJJIZ.addTrackFilter(0, 0, vECanvasFilterParam, -1, -1);
        }
    }

    @Override // com.ss.android.vesdk.proxy.TEDuetProxy
    public final void LJII() {
        this.LIZIZ.LIZ(this);
        k kVar = this.LIZIZ;
        VESize vESize = this.LJ;
        kVar.LJIIJJI(vESize.width, vESize.height);
        String reactAudioPath = this.LJIIL.getReactAudioPath();
        C2254451DLv c2254451DLv = new C2254451DLv();
        c2254451DLv.LIZ(reactAudioPath);
        c2254451DLv.LIZLLL();
        c2254451DLv.LJ(0);
        c2254451DLv.LJFF(-1);
        C1D40 c1d40 = C1D40.External;
        VETrackParams vETrackParams = c2254451DLv.LIZ;
        vETrackParams.trackPriority = c1d40;
        int iLJII = this.LIZIZ.LJII(1, vETrackParams, true);
        this.LJI = iLJII;
        this.LIZIZ.LJJIIJZLJL(iLJII, 1, 0L);
        String str = LJIILIIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("add aTrack: ");
        sbLIZ.append(this.LJI);
        C2484209oO.LJI(str, C2188811AlT.LIZIZ(sbLIZ));
        String reactVideoPath = this.LJIIL.getReactVideoPath();
        C2254451DLv c2254451DLv2 = new C2254451DLv();
        c2254451DLv2.LIZ(reactVideoPath);
        c2254451DLv2.LIZLLL();
        c2254451DLv2.LJ(0);
        c2254451DLv2.LJFF(-1);
        int i = LJFF()[1];
        VETrackParams vETrackParams2 = c2254451DLv2.LIZ;
        vETrackParams2.layer = i;
        vETrackParams2.trackPriority = c1d40;
        int iLJII2 = this.LIZIZ.LJII(0, vETrackParams2, true);
        this.LJII = iLJII2;
        this.LIZIZ.LJJIIJZLJL(iLJII2, 0, 0L);
        LJIIJ(this.LJII);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("add vTrack: ");
        sbLIZ2.append(this.LJII);
        C2484209oO.LJI(str, C2188811AlT.LIZIZ(sbLIZ2));
        LJIIJJI();
        LJIIL();
    }

    @Override // com.ss.android.vesdk.proxy.TEDuetProxy
    public final void LJIIJ(int i) {
        VEVideoTransformFilterParam vEVideoTransformFilterParam = new VEVideoTransformFilterParam();
        vEVideoTransformFilterParam.filterName = "canvas blend";
        vEVideoTransformFilterParam.scaleFactor = 0.35f;
        vEVideoTransformFilterParam.transX = -0.23f;
        vEVideoTransformFilterParam.transY = -0.23f;
        vEVideoTransformFilterParam.alpha = 1.0f;
        int i2 = this.LJIIJ;
        if (i2 >= 0) {
            this.LIZIZ.LJJIZ.updateTrackFilterParam(i2, vEVideoTransformFilterParam);
        } else {
            this.LJIIJ = this.LIZIZ.LJJIZ.addTrackFilter(0, i, vEVideoTransformFilterParam, -1, -1);
        }
    }

    public C2254351DLl(k kVar, VESize vESize) {
        this.LIZIZ = kVar;
        this.LIZLLL = vESize;
        this.LJ = vESize;
    }
}
