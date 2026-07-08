package X;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Size;
import android.view.Surface;
import com.ss.android.ttvecamera.TECameraFrame;
import com.ss.android.ttvecamera.TEFrameSizei;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* JADX INFO: renamed from: X.1DN3, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public abstract class C1DN3 {
    public C1DJX LIZ;
    public TECameraFrame.ETEPixelFormat LIZIZ;
    public final boolean LIZJ;
    public boolean LIZLLL;
    public final UUID LJ;
    public TEFrameSizei LJFF;
    public final C1DJK LJI;
    public final C1DJM LJII;
    public final int LJIIIIZZ;
    public TECameraFrame.Metadata LJIIIZ;
    public InterfaceC1305790k5J LJIIJ = null;
    public final C2254841DNi LJIIJJI = new C1DJX() { // from class: X.1DNi
        @Override // X.C1DJX
        public final void LJLLILLLL(SurfaceTexture surfaceTexture) {
        }

        @Override // X.C1DJX
        public final void LIZIZ(TECameraFrame tECameraFrame) {
            int i = C2187451AjH.LIZ;
            C2183341Ace.LJ("TECameraProvider", "empty listener onFrameCaptured");
        }
    };
    public final C2254851DNj LJIIL = new C1DJQ() { // from class: X.1DNj
        @Override // X.C1DJQ
        public final void LIZJ(SurfaceTexture surfaceTexture, boolean z) {
        }

        @Override // X.C1DJX
        public final void LJLLILLLL(SurfaceTexture surfaceTexture) {
        }

        @Override // X.C1DJX
        public final void LIZIZ(TECameraFrame tECameraFrame) {
            int i = C2187451AjH.LIZ;
            C2183341Ace.LJ("TECameraProvider", "empty listener onFrameCaptured");
        }
    };

    public Surface LIZIZ() {
        return null;
    }

    public abstract Surface LIZJ();

    public Surface LIZLLL(int i) {
        return null;
    }

    public Surface LJ() {
        return null;
    }

    public EnumC2186171AhD LJFF() {
        return null;
    }

    public abstract SurfaceTexture LJI();

    public SurfaceTexture LJII() {
        return null;
    }

    public Surface[] LJIIIIZZ() {
        return null;
    }

    public Surface[] LJIIIZ(int i) {
        return null;
    }

    public int LJIIJ() {
        return -1;
    }

    public abstract EnumC2186221AhI LJIIJJI();

    public int LJIIL(StreamConfigurationMap streamConfigurationMap, TEFrameSizei tEFrameSizei) {
        return -1;
    }

    public abstract void LJIILIIL(List list, TEFrameSizei tEFrameSizei);

    public abstract void LJIILL();

    public void LJIIZILJ() {
    }

    public void LJIJ() {
    }

    public void LJIJI() {
    }

    public void LJIJJLI(Surface surface, EnumC2186171AhD enumC2186171AhD) {
    }

    public void LJIL(SurfaceTexture surfaceTexture, int i) {
    }

    public void LJJ(SurfaceTexture surfaceTexture, EnumC2186171AhD enumC2186171AhD) {
    }

    public void LJJI(int i) {
    }

    public void LJIILLIIL() {
        if (this.LIZ instanceof C1DJQ) {
            this.LIZ = this.LJIIL;
        } else {
            this.LIZ = this.LJIIJJI;
        }
    }

    public static List<TEFrameSizei> LIZ(Size[] sizeArr) {
        if (sizeArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Size size : sizeArr) {
            arrayList.add(new TEFrameSizei(size.getWidth(), size.getHeight()));
        }
        return arrayList;
    }

    public final void LJIILJJIL(TECameraFrame tECameraFrame) {
        C1DJX c1djx = this.LIZ;
        if (c1djx != null) {
            c1djx.LIZIZ(tECameraFrame);
        } else {
            int i = C2187451AjH.LIZ;
            C2183341Ace.LJ("TECameraProvider", "mListener is null");
        }
    }

    public void LJIJJ(C1DJX c1djx) {
        this.LIZ = c1djx;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.1DNi] */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.1DNj] */
    public C1DN3(C1DJM c1djm, C1DJK c1djk) {
        this.LIZJ = true;
        this.LJFF = new TEFrameSizei();
        this.LJIIIIZZ = 1;
        this.LJII = c1djm;
        this.LIZIZ = c1djm.LJIIIZ;
        this.LIZ = c1djm.LIZJ;
        this.LJFF = c1djm.LIZIZ;
        this.LIZJ = c1djm.LIZ;
        this.LIZLLL = c1djm.LJIIL;
        this.LJ = c1djm.LJIIJ;
        this.LJI = c1djk;
        this.LJIIIIZZ = c1djm.LJFF;
    }
}
