package X;

import com.ss.android.ugc.asve.context.PreviewSize;

/* JADX INFO: renamed from: X.1DKA, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DKA {
    public final Integer LIZ;
    public final PreviewSize LIZIZ;
    public final PreviewSize LIZJ;
    public final PreviewSize LIZLLL;
    public final EnumC1403300mca LJ;
    public final EnumC1778840wOI LJFF;
    public final Integer LJI;
    public final Integer LJII;
    public final Boolean LJIIIIZZ;
    public final Float LJIIIZ;
    public final Integer LJIIJ;

    public final String toString() {
        return "ICaptureSessionContext(initCameraFacing=" + this.LIZ + ", outputSize=" + this.LIZIZ + ", previewSize=" + this.LIZJ + ", renderSize=" + this.LIZLLL + ", previewRatio=" + this.LJ + ", fitMode=" + this.LJFF + ", fpsMin=" + this.LJI + ", fpsMax=" + this.LJII + ", cameraAntiShake=" + this.LJIIIIZZ + ", encodeBitrate=" + this.LJIIIZ + ", softEncodeQP=" + this.LJIIJ + ')';
    }

    public C1DKA(Integer num, PreviewSize previewSize, PreviewSize previewSize2, PreviewSize previewSize3, EnumC1403300mca enumC1403300mca, EnumC1778840wOI enumC1778840wOI, Integer num2, Integer num3, Boolean bool, Float f, Integer num4) {
        this.LIZ = num;
        this.LIZIZ = previewSize;
        this.LIZJ = previewSize2;
        this.LIZLLL = previewSize3;
        this.LJ = enumC1403300mca;
        this.LJFF = enumC1778840wOI;
        this.LJI = num2;
        this.LJII = num3;
        this.LJIIIIZZ = bool;
        this.LJIIIZ = f;
        this.LJIIJ = num4;
    }
}
