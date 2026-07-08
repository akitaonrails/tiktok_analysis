package X;

import com.ss.android.ttvecamera.cameraalgorithm.TEOneKeyProcessParams;

/* JADX INFO: renamed from: X.0jB5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1270930jB5 extends AbstractC1270970jB9 {
    public boolean LIZ = true;
    public boolean LIZIZ = false;
    public boolean LIZJ = false;
    public boolean LIZLLL = true;
    public boolean LJ = true;
    public boolean LJFF = true;
    public boolean LJI = true;
    public boolean LJII = false;
    public boolean LJIIIIZZ = true;
    public final int LJIIIZ = 3;
    public int LJIIJ = 0;
    public int LJIIJJI = 0;
    public int LJIIL = 0;
    public String LJIILIIL = "luminance_target_string=175,155\n      & contrast_factor_float=0.3f\n      & saturation_factor_float=0.3f\n      & amount_float=2.f\n      & ratio_float=0.02f\n      & noise_factor_float=1.f\n      & current_pixel_weight_float=0.5f\n      & hdr_version_int=4\n      & luma_trigger_float=37.8\n      & over_trigger_float=-1\n      & under_trigger_float=-1\n      & asf_scene_mode_int=5";
    public boolean LJIILJJIL = false;
    public String LJIILL = "";

    @Override // X.AbstractC1270970jB9
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final TEOneKeyProcessParams LIZ() {
        TEOneKeyProcessParams tEOneKeyProcessParams = new TEOneKeyProcessParams();
        tEOneKeyProcessParams.enableHDR = this.LIZ;
        tEOneKeyProcessParams.enableDenoise = this.LIZIZ;
        tEOneKeyProcessParams.enableAfs = this.LIZJ;
        tEOneKeyProcessParams.enableHdrV2 = this.LIZLLL;
        tEOneKeyProcessParams.enableAsyncProcess = this.LJ;
        tEOneKeyProcessParams.enableDayScene = this.LJFF;
        tEOneKeyProcessParams.enableNightScene = this.LJI;
        tEOneKeyProcessParams.algParams = this.LJIILIIL;
        tEOneKeyProcessParams.isFirstFrame = this.LJII;
        tEOneKeyProcessParams.enableAlgoConfig = this.LJIIIIZZ;
        tEOneKeyProcessParams.cvdetectFrames = this.LJIIIZ;
        tEOneKeyProcessParams.iso = this.LJIIJ;
        tEOneKeyProcessParams.maxIso = this.LJIIJJI;
        tEOneKeyProcessParams.minIso = this.LJIIL;
        tEOneKeyProcessParams.enableDetectAlgo = this.LJIILJJIL;
        tEOneKeyProcessParams.lutTablePath = this.LJIILL;
        return tEOneKeyProcessParams;
    }
}
