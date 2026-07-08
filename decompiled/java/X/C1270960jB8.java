package X;

import com.ss.android.ttvecamera.cameraalgorithm.TECameraAlgorithmParam;
import com.ss.android.ttvecamera.cameraalgorithm.TERhythmicMotionParam;

/* JADX INFO: renamed from: X.0jB8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1270960jB8 extends AbstractC1270970jB9 {
    public final float[] LIZ = new float[3];
    public boolean LIZIZ;

    @Override // X.AbstractC1270970jB9
    public final TECameraAlgorithmParam LIZ() {
        TERhythmicMotionParam tERhythmicMotionParam = new TERhythmicMotionParam();
        tERhythmicMotionParam.cropList = this.LIZ;
        tERhythmicMotionParam.maxAlpha = 0.0f;
        tERhythmicMotionParam.maxVelocity = 0.0f;
        return tERhythmicMotionParam;
    }
}
