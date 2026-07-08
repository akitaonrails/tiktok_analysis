package X;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.MediaRecorder;
import android.os.Build;
import android.os.Trace;
import android.util.Size;
import android.view.Surface;
import com.ss.android.ttvecamera.TECameraFrame;
import com.ss.android.ttvecamera.TEFrameSizei;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/* JADX INFO: renamed from: X.1DN5, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DN5 extends C1DN3 {
    public SurfaceTexture LJIILIIL;
    public SurfaceTexture LJIILJJIL;
    public Surface LJIILL;
    public Surface LJIILLIIL;
    public EnumC2186171AhD LJIIZILJ;
    public final float[] LJIJ;
    public int LJIJI;
    public boolean LJIJJ;
    public final Set<Integer> LJIJJLI;
    public final C1DNC LJIL;

    @Override // X.C1DN3
    public final Surface LIZJ() {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("get surface = ");
        sbLIZ.append(this.LJIILL);
        C2183341Ace.LIZLLL("TESurfaceTextureProvider", C2188811AlT.LIZIZ(sbLIZ));
        return this.LJIILL;
    }

    @Override // X.C1DN3
    public final Surface LJ() {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getSurface surface is ");
        sbLIZ.append(this.LJIILLIIL);
        C2183341Ace.LIZLLL("TESurfaceTextureProvider", C2188811AlT.LIZIZ(sbLIZ));
        return this.LJIILLIIL;
    }

    @Override // X.C1DN3
    public final EnumC2186171AhD LJFF() {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("get operation is ");
        sbLIZ.append(this.LJIIZILJ);
        sbLIZ.append(" ,this is");
        sbLIZ.append(this);
        C2183341Ace.LIZLLL("TESurfaceTextureProvider", C2188811AlT.LIZIZ(sbLIZ));
        return this.LJIIZILJ;
    }

    @Override // X.C1DN3
    public final SurfaceTexture LJII() {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("get surface texture is ");
        sbLIZ.append(this.LJIILJJIL);
        sbLIZ.append(" ,ooperation is ");
        sbLIZ.append(this.LJIIZILJ);
        sbLIZ.append(" ,this is");
        sbLIZ.append(this);
        C2183341Ace.LIZLLL("TESurfaceTextureProvider", C2188811AlT.LIZIZ(sbLIZ));
        return this.LJIILJJIL;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    @Override // X.C1DN3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILL() {
        /*
            r4 = this;
            android.view.Surface r0 = r4.LJIILL
            if (r0 == 0) goto L7
            r0.release()
        L7:
            android.graphics.SurfaceTexture r0 = r4.LJIILIIL
            if (r0 == 0) goto Le
            r0.release()
        Le:
            int r0 = r4.LJIJI
            r3 = 0
            if (r0 != 0) goto L38
            r2 = 1
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r1 < r0) goto L39
            android.graphics.SurfaceTexture r0 = new android.graphics.SurfaceTexture
            r0.<init>(r3)
            r4.LJIILIIL = r0
        L21:
            android.view.Surface r1 = new android.view.Surface
            android.graphics.SurfaceTexture r0 = r4.LJIILIIL
            r1.<init>(r0)
            r4.LJIILL = r1
            X.1DJX r1 = r4.LIZ
            boolean r0 = r1 instanceof X.C1DJQ
            if (r0 == 0) goto L37
            X.1DJQ r1 = (X.C1DJQ) r1
            android.graphics.SurfaceTexture r0 = r4.LJIILIIL
            r1.LIZJ(r0, r2)
        L37:
            return
        L38:
            r2 = 0
        L39:
            android.graphics.SurfaceTexture r1 = new android.graphics.SurfaceTexture
            int r0 = r4.LJIJI
            r1.<init>(r0)
            r4.LJIILIIL = r1
            if (r2 == 0) goto L21
            r1.detachFromGLContext()
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1DN5.LJIILL():void");
    }

    @Override // X.C1DN3
    public final void LJIIZILJ() {
        SurfaceTexture surfaceTexture = this.LJIILIIL;
        if (surfaceTexture == null || Build.VERSION.SDK_INT < 26 || surfaceTexture.isReleased()) {
            return;
        }
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("releaseSurfaceTexture, mSurfaceTexture = ");
        sbLIZ.append(this.LJIILIIL);
        C2183341Ace.LIZLLL("TESurfaceTextureProvider", C2188811AlT.LIZIZ(sbLIZ));
        this.LJIILIIL.release();
    }

    @Override // X.C1DN3
    public final void LJIJ() {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("removeSurface surface is ");
        sbLIZ.append(this.LJIILLIIL);
        C2183341Ace.LIZLLL("TESurfaceTextureProvider", C2188811AlT.LIZIZ(sbLIZ));
        this.LJIILLIIL = null;
        this.LJIIZILJ = EnumC2186171AhD.NONE;
    }

    @Override // X.C1DN3
    public final void LJIJI() {
        int i = C2187451AjH.LIZ;
        C2183341Ace.LIZLLL("TESurfaceTextureProvider", "remove surface texture");
        this.LJIILJJIL = null;
        this.LJIIZILJ = EnumC2186171AhD.NONE;
    }

    @Override // X.C1DN3
    public final void LJIILLIIL() {
        super.LJIILLIIL();
        Surface surface = this.LJIILL;
        if (surface != null) {
            surface.release();
            this.LJIILL = null;
        }
    }

    @Override // X.C1DN3
    public final SurfaceTexture LJI() {
        return this.LJIILIIL;
    }

    @Override // X.C1DN3
    public final int LJIIJ() {
        return this.LJIJI;
    }

    @Override // X.C1DN3
    public final EnumC2186221AhI LJIIJJI() {
        return EnumC2186221AhI.PROVIDER_TYPE_SURFACE_TEXTURE;
    }

    @Override // X.C1DN3
    public final void LJJI(int i) {
        this.LJIJI = i;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.1DNC] */
    public C1DN5(C1DJM c1djm, C1DJK c1djk) {
        super(c1djm, c1djk);
        this.LJIIZILJ = EnumC2186171AhD.NONE;
        this.LJIJ = new float[16];
        this.LJIJJ = true;
        this.LJIJJLI = new TreeSet();
        this.LJIL = new SurfaceTexture.OnFrameAvailableListener() { // from class: X.1DNC
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
                boolean z;
                long j;
                int dataSpace;
                C1DN5 c1dn5 = this.LL;
                if (c1dn5.LJI == null) {
                    return;
                }
                if (c1dn5.LIZLLL) {
                    C1321640kUs.LIZ("TESurfaceTexture-onFrameAvailable drop frame due to preview is stopped");
                    C1321640kUs.LIZIZ();
                    int i = C2187451AjH.LIZ;
                    C2183341Ace.LIZLLL("TESurfaceTextureProvider", "Drop frame due to preview is stopped");
                    z = true;
                } else {
                    z = false;
                }
                C1DJK c1djk2 = this.LL.LJI;
                c1djk2.LJJL(c1djk2.LJL());
                if (this.LL.LJIJJ) {
                    int i2 = C2187451AjH.LIZ;
                    C2183341Ace.LIZLLL("TESurfaceTextureProvider", "CAMERA_COST camera first frame callback");
                    this.LL.LJIJJ = false;
                    if (C1321640kUs.LIZ && Build.VERSION.SDK_INT >= 29) {
                        Trace.endAsyncSection("VECamera-TECamera1-camera-frame", 1);
                    }
                    if (C1321640kUs.LIZ && Build.VERSION.SDK_INT >= 29) {
                        Trace.endAsyncSection("VECamera-TECamera2-camera-frame", 2);
                    }
                }
                surfaceTexture.getTransformMatrix(this.LL.LJIJ);
                TEFrameSizei tEFrameSizei = this.LL.LJFF;
                TECameraFrame tECameraFrame = new TECameraFrame(tEFrameSizei.width, tEFrameSizei.height, surfaceTexture.getTimestamp());
                C1DN5 c1dn52 = this.LL;
                int i3 = c1dn52.LJIJI;
                int iLJIIZILJ = c1dn52.LJI.LJIIZILJ();
                C1DN5 c1dn53 = this.LL;
                tECameraFrame.initTextureFrame(i3, iLJIIZILJ, c1dn53.LJIJ, c1dn53.LIZIZ, c1dn53.LJI.LJL());
                tECameraFrame.setMetadata(this.LL.LJIIIZ);
                if (Build.VERSION.SDK_INT >= 33 && (dataSpace = surfaceTexture.getDataSpace()) != 142671872 && dataSpace != 146931712) {
                    if (dataSpace != 168165376 && dataSpace != 301989888 && dataSpace != 302383104) {
                        if (!((TreeSet) this.LL.LJIJJLI).contains(Integer.valueOf(dataSpace))) {
                            ((TreeSet) this.LL.LJIJJLI).add(Integer.valueOf(dataSpace));
                            int i4 = C2187451AjH.LIZ;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("HdrSurfaceTexture unknown dataSpace: ");
                            sbLIZ.append(dataSpace);
                            sbLIZ.append(" Please register!");
                            C2183341Ace.LIZLLL("TESurfaceTextureProvider", C2188811AlT.LIZIZ(sbLIZ));
                        }
                        j = 1;
                    } else {
                        j = 2;
                    }
                } else {
                    j = 1;
                }
                tECameraFrame.setDynamicRangeProfile(j);
                tECameraFrame.setCanDrop(z);
                this.LL.LJIILJJIL(tECameraFrame);
            }
        };
        SurfaceTexture surfaceTexture = c1djm.LIZLLL;
        this.LJIILIIL = surfaceTexture;
        if (surfaceTexture == null) {
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("only surface = ");
            sbLIZ.append(c1djm.LJI);
            C2183341Ace.LIZLLL("TESurfaceTextureProvider", C2188811AlT.LIZIZ(sbLIZ));
            this.LJIILL = c1djm.LJI;
            return;
        }
        this.LJIJI = c1djm.LJ;
        this.LJIILL = new Surface(this.LJIILIIL);
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("new surface = ");
        sbLIZ2.append(this.LJIILL);
        C2183341Ace.LIZLLL("TESurfaceTextureProvider", C2188811AlT.LIZIZ(sbLIZ2));
    }

    @Override // X.C1DN3
    public final int LJIIL(StreamConfigurationMap streamConfigurationMap, TEFrameSizei tEFrameSizei) {
        Size[] outputSizes = streamConfigurationMap.getOutputSizes(SurfaceTexture.class);
        if (this.LJI.LIZIZ().LLLLIILLL) {
            List<TEFrameSizei> listLIZ = C1DN3.LIZ(streamConfigurationMap.getOutputSizes(MediaRecorder.class));
            List<TEFrameSizei> listLIZ2 = C1DN3.LIZ(outputSizes);
            String str = C2183321Acc.LIZ;
            ArrayList arrayList = (ArrayList) listLIZ2;
            arrayList.retainAll(listLIZ);
            LJIILIIL(arrayList, tEFrameSizei);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LJFF.width);
            sbLIZ.append("*");
            sbLIZ.append(this.LJFF.height);
            C1305710k5B.LIZIZ("te_record_camera_output_size", C2188811AlT.LIZIZ(sbLIZ));
            return 0;
        }
        LJIILIIL(C1DN3.LIZ(outputSizes), tEFrameSizei);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(this.LJFF.width);
        sbLIZ2.append("*");
        sbLIZ2.append(this.LJFF.height);
        C1305710k5B.LIZIZ("te_record_camera_output_size", C2188811AlT.LIZIZ(sbLIZ2));
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0097  */
    @Override // X.C1DN3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILIIL(java.util.List r4, com.ss.android.ttvecamera.TEFrameSizei r5) {
        /*
            r3 = this;
            android.graphics.SurfaceTexture r0 = r3.LJIILIIL
            if (r0 == 0) goto L6b
            if (r4 == 0) goto L1e
            int r0 = r4.size()
            if (r0 <= 0) goto L1e
            X.0k5J r1 = r3.LJIIJ
            if (r1 == 0) goto L7f
            boolean r0 = r3.LIZLLL
            if (r0 != 0) goto L7f
            X.0k5I r1 = (X.C1305780k5I) r1
            com.ss.android.ttvecamera.TEFrameSizei r0 = r1.LIZ(r4)
            if (r0 == 0) goto L6c
            r3.LJFF = r0
        L1e:
            int r0 = X.C2187451AjH.LIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "previewSize = "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = " mSize = "
            r1.append(r0)
            com.ss.android.ttvecamera.TEFrameSizei r0 = r3.LJFF
            r1.append(r0)
            java.lang.String r0 = " mPreviewSizeCallback = "
            r1.append(r0)
            X.0k5J r0 = r3.LJIIJ
            r1.append(r0)
            java.lang.String r0 = " deviceSupportedSizes = "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "TESurfaceTextureProvider"
            X.C2183341Ace.LIZLLL(r0, r1)
            android.graphics.SurfaceTexture r2 = r3.LJIILIIL
            com.ss.android.ttvecamera.TEFrameSizei r0 = r3.LJFF
            int r1 = r0.width
            int r0 = r0.height
            r2.setDefaultBufferSize(r1, r0)
            X.1DNC r2 = r3.LJIL
            android.graphics.SurfaceTexture r1 = r3.LJIILIIL
            if (r1 == 0) goto L6b
            X.1DJK r0 = r3.LJI
            android.os.Handler r0 = r0.getHandler()
            r1.setOnFrameAvailableListener(r2, r0)
        L6b:
            return
        L6c:
            if (r5 != 0) goto L70
            com.ss.android.ttvecamera.TEFrameSizei r5 = r3.LJFF
        L70:
            X.1DJK r0 = r3.LJI
            X.1DJ6 r0 = r0.LIZIZ()
            X.1Acd r0 = r0.LLLZ
            com.ss.android.ttvecamera.TEFrameSizei r0 = X.C2183321Acc.LIZIZ(r4, r5, r0)
            r3.LJFF = r0
            goto L1e
        L7f:
            X.1DJK r0 = r3.LJI
            X.1DJ6 r0 = r0.LIZIZ()
            X.1Acd r1 = r0.LLLZ
            X.1Acd r0 = X.EnumC2183331Acd.MATCH_BY_PIXELS
            if (r1 != r0) goto L95
            if (r5 != 0) goto L99
            X.1DJK r0 = r3.LJI
            X.1DJ6 r0 = r0.LIZIZ()
            com.ss.android.ttvecamera.TEFrameSizei r5 = r0.LLJJJIL
        L95:
            if (r5 != 0) goto L99
            com.ss.android.ttvecamera.TEFrameSizei r5 = r3.LJFF
        L99:
            X.1DJK r0 = r3.LJI
            X.1DJ6 r0 = r0.LIZIZ()
            X.1Acd r0 = r0.LLLZ
            com.ss.android.ttvecamera.TEFrameSizei r0 = X.C2183321Acc.LIZIZ(r4, r5, r0)
            r3.LJFF = r0
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1DN5.LJIILIIL(java.util.List, com.ss.android.ttvecamera.TEFrameSizei):void");
    }

    @Override // X.C1DN3
    public final void LJIJJLI(Surface surface, EnumC2186171AhD enumC2186171AhD) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setSurface surface is ");
        sbLIZ.append(this.LJIILLIIL);
        C2183341Ace.LIZLLL("TESurfaceTextureProvider", C2188811AlT.LIZIZ(sbLIZ));
        this.LJIILLIIL = surface;
        this.LJIIZILJ = enumC2186171AhD;
    }

    @Override // X.C1DN3
    public final void LJJ(SurfaceTexture surfaceTexture, EnumC2186171AhD enumC2186171AhD) {
        this.LJIIZILJ = enumC2186171AhD;
        this.LJIILJJIL = surfaceTexture;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("set surface texture is ");
        sbLIZ.append(this.LJIILJJIL);
        sbLIZ.append(" ,ooperation is ");
        sbLIZ.append(this.LJIIZILJ);
        sbLIZ.append(" ,this is");
        sbLIZ.append(this);
        C2183341Ace.LIZLLL("TESurfaceTextureProvider", C2188811AlT.LIZIZ(sbLIZ));
    }
}
