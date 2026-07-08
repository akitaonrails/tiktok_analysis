package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import com.ss.android.ttvecamera.TECameraFrame;
import com.ss.android.ttvecamera.TEFrameSizei;
import java.util.UUID;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.1DJM, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public class C1DJM {
    public final boolean LIZ;
    public final TEFrameSizei LIZIZ;
    public final C1DJX LIZJ;
    public final SurfaceTexture LIZLLL;
    public int LJ;
    public final int LJFF;
    public final Surface LJI;
    public final EnumC2186171AhD LJII;
    public final Surface LJIIIIZZ;
    public final TECameraFrame.ETEPixelFormat LJIIIZ;
    public UUID LJIIJ;
    public boolean LJIIJJI;
    public boolean LJIIL;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProviderSettings: [mIsPreview = ");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", mSize = ");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", mListener = ");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", mSurfaceTexture = ");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", mTextureOES = ");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", mImageReaderCount = ");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", mPrimary=");
        sbLIZ.append(this.LJIIJJI);
        sbLIZ.append(", mUUID=");
        sbLIZ.append(this.LJIIJ);
        sbLIZ.append(", mIsPreviewStopped =");
        sbLIZ.append(this.LJIIL);
        sbLIZ.append(e3.f);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1DJM(C1DJM c1djm) {
        this.LIZ = true;
        this.LJII = EnumC2186171AhD.NONE;
        this.LJIIIZ = TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_Count;
        this.LJIIJJI = true;
        this.LIZ = c1djm.LIZ;
        this.LIZIZ = c1djm.LIZIZ;
        this.LIZJ = c1djm.LIZJ;
        this.LIZLLL = c1djm.LIZLLL;
        this.LJ = c1djm.LJ;
        this.LJFF = c1djm.LJFF;
    }

    public final boolean LIZ(C1DJM c1djm) {
        if (c1djm != null && this.LIZ == c1djm.LIZ) {
            TEFrameSizei tEFrameSizei = this.LIZIZ;
            int i = tEFrameSizei.width;
            TEFrameSizei tEFrameSizei2 = c1djm.LIZIZ;
            if (i == tEFrameSizei2.width && tEFrameSizei.height == tEFrameSizei2.height && this.LIZJ == c1djm.LIZJ && this.LIZLLL == c1djm.LIZLLL && this.LJ == c1djm.LJ && this.LJFF == c1djm.LJFF && this.LJIIJJI == c1djm.LJIIJJI) {
                return true;
            }
            return false;
        }
        return false;
    }

    public C1DJM(TEFrameSizei tEFrameSizei, InterfaceC1283630jVZ interfaceC1283630jVZ, boolean z, SurfaceTexture surfaceTexture, int i) {
        this.LIZ = true;
        this.LJII = EnumC2186171AhD.NONE;
        this.LJIIIZ = TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_Count;
        this.LJIIJJI = true;
        this.LIZIZ = tEFrameSizei;
        this.LIZJ = interfaceC1283630jVZ;
        this.LIZLLL = surfaceTexture;
        this.LJ = i;
        this.LIZ = z;
        this.LJIIIZ = TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_OpenGL_OES;
        this.LJI = null;
    }

    public C1DJM(TEFrameSizei tEFrameSizei, InterfaceC1283630jVZ interfaceC1283630jVZ, boolean z, TECameraFrame.ETEPixelFormat eTEPixelFormat, Surface surface) {
        this.LIZ = true;
        this.LJII = EnumC2186171AhD.NONE;
        this.LJIIIZ = TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_Count;
        this.LJIIJJI = true;
        this.LIZIZ = tEFrameSizei;
        this.LIZJ = interfaceC1283630jVZ;
        this.LJIIIZ = eTEPixelFormat;
        this.LIZ = z;
        if (eTEPixelFormat == TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_Recorder) {
            this.LJI = surface;
        } else {
            this.LJIIIIZZ = surface;
        }
    }

    public C1DJM(TEFrameSizei tEFrameSizei, C1DJX c1djx, boolean z, SurfaceTexture surfaceTexture, int i) {
        this.LIZ = true;
        this.LJII = EnumC2186171AhD.NONE;
        this.LJIIIZ = TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_Count;
        this.LJIIJJI = true;
        this.LIZIZ = tEFrameSizei;
        this.LIZJ = c1djx;
        this.LIZLLL = surfaceTexture;
        this.LJ = i;
        this.LIZ = z;
        this.LJIIIZ = TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_OpenGL_OES;
    }

    public C1DJM(TEFrameSizei tEFrameSizei, InterfaceC1283630jVZ interfaceC1283630jVZ, boolean z, SurfaceTexture surfaceTexture, TECameraFrame.ETEPixelFormat eTEPixelFormat, int i) {
        this.LIZ = true;
        this.LJII = EnumC2186171AhD.NONE;
        this.LJIIIZ = TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_Count;
        this.LJIIJJI = true;
        this.LIZIZ = tEFrameSizei;
        this.LIZJ = interfaceC1283630jVZ;
        this.LIZLLL = surfaceTexture;
        this.LIZ = z;
        this.LJIIIZ = eTEPixelFormat;
        this.LJFF = i;
    }
}
