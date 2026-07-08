package X;

import android.graphics.Bitmap;
import com.ss.android.vesdk.VERecorder;
import com.ss.android.vesdk.VESize;

/* JADX INFO: renamed from: X.1AO5, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AO5 {
    public VESize LIZ;
    public boolean LIZIZ;
    public String LIZJ;
    public boolean LIZLLL;
    public Bitmap.CompressFormat LJ;
    public boolean LJFF;
    public final String LJI = "";
    public InterfaceC2178571ANz LJII;
    public InterfaceC2173471A4j LJIIIIZZ;
    public VERecorder.IVEFrameShotScreenCallback LJIIIZ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VEShotScreenSettings{mTargetResolution=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", mNeedEffect=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", mFileName='");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append('\'');
        sbLIZ.append(", mNeedPreviewAfterShotScreen=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", mFormat=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", mNeedOriginPic=");
        sbLIZ.append(false);
        sbLIZ.append(", mShotScreenInHD=");
        sbLIZ.append(false);
        sbLIZ.append(", mIsTakePicture=");
        sbLIZ.append(false);
        sbLIZ.append(", mNeedDelay=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", mGetFrameWithTexture=");
        sbLIZ.append(false);
        sbLIZ.append(", mPathOfTexture=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", mEnableUpscaleShot=");
        sbLIZ.append(false);
        sbLIZ.append(", mRequestTwoFrame=");
        sbLIZ.append(false);
        sbLIZ.append(", mScreenCallback=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", mOnInfoCallback=");
        sbLIZ.append((Object) null);
        sbLIZ.append(", mBitmapCallback=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", mFrameCallback=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C1AO5)) {
            return false;
        }
        C1AO5 c1ao5 = (C1AO5) obj;
        if (this.LIZIZ != c1ao5.LIZIZ || !this.LIZJ.equals(c1ao5.LIZJ) || this.LIZLLL != c1ao5.LIZLLL || this.LJ != c1ao5.LJ || !this.LIZ.equals(c1ao5.LIZ) || this.LJFF != c1ao5.LJFF || !this.LJI.equals(c1ao5.LJI)) {
            return false;
        }
        return true;
    }
}
