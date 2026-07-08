package X;

import com.ss.android.ugc.aweme.experiment.PhotoModePhotoBackgroundGradientConfig;

/* JADX INFO: renamed from: X.12CN, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12CN extends C12CL {
    public static final C12CN LIZ = new C12CN();

    @Override // X.C12CL
    public final void LIZ(C204674156y c204674156y) {
        PhotoModePhotoBackgroundGradientConfig photoModePhotoBackgroundGradientConfigLIZ;
        if ((!C0SKM.LJFF() && !C0SKM.LIZJ()) || (photoModePhotoBackgroundGradientConfigLIZ = C0SKM.LJIIIIZZ().colorConfig) == null) {
            photoModePhotoBackgroundGradientConfigLIZ = C0SKP.LIZ();
        }
        c204674156y.LJFF(photoModePhotoBackgroundGradientConfigLIZ.mergingTolerance);
        c204674156y.LJI(photoModePhotoBackgroundGradientConfigLIZ.lightnessAddition);
        c204674156y.LJ(photoModePhotoBackgroundGradientConfigLIZ.cLeft, photoModePhotoBackgroundGradientConfigLIZ.cRight, photoModePhotoBackgroundGradientConfigLIZ.iLeft, photoModePhotoBackgroundGradientConfigLIZ.iRight, photoModePhotoBackgroundGradientConfigLIZ.strategyThreshold);
    }
}
