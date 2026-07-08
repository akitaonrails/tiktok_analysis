package X;

import android.hardware.Camera;
import oo5.b;

/* JADX INFO: renamed from: X.1AiD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2186791AiD {
    public Camera LIZ;
    public Camera.CameraInfo LIZIZ;
    public C2186801AiE LIZJ;
    public boolean LIZLLL;
    public String LJ;
    public C2186951AiT LJI;
    public C2186841AiI LJII;
    public C2186841AiI LJIIIIZZ;
    public long LJIIJ;
    public C2186981AiW LJFF = new C2186981AiW();
    public int LJIIIZ = -1;
    public float LJIIJJI = 1.0f;
    public final C2186751Ai9 LJIIL = new C2186751Ai9(this);

    /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0024 A[Catch: Exception -> 0x003b, TryCatch #1 {Exception -> 0x003b, blocks: (B:5:0x0006, B:16:0x001e, B:18:0x0024, B:19:0x002d, B:20:0x0033), top: B:39:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0033 A[Catch: Exception -> 0x003b, TRY_LEAVE, TryCatch #1 {Exception -> 0x003b, blocks: (B:5:0x0006, B:16:0x001e, B:18:0x0024, B:19:0x002d, B:20:0x0033), top: B:39:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ() {
        /*
            r6 = this;
            android.hardware.Camera r5 = r6.LIZ
            if (r5 == 0) goto L72
            r4 = 0
            r3 = 1
            X.1AiT r0 = r6.LJI     // Catch: java.lang.Exception -> L3b
            int r1 = r0.LIZIZ     // Catch: java.lang.Exception -> L3b
            if (r1 == 0) goto L1d
            if (r1 == r3) goto L1a
            r0 = 2
            if (r1 == r0) goto L17
            r0 = 3
            if (r1 != r0) goto L1d
            r2 = 270(0x10e, float:3.78E-43)
            goto L1e
        L17:
            r2 = 180(0xb4, float:2.52E-43)
            goto L1e
        L1a:
            r2 = 90
            goto L1e
        L1d:
            r2 = 0
        L1e:
            android.hardware.Camera$CameraInfo r1 = r6.LIZIZ     // Catch: java.lang.Exception -> L3b
            int r0 = r1.facing     // Catch: java.lang.Exception -> L3b
            if (r0 != r3) goto L33
            int r0 = r1.orientation     // Catch: java.lang.Exception -> L3b
            int r0 = r0 + r2
            int r0 = r0 % 360
            int r0 = 360 - r0
            int r0 = r0 % 360
        L2d:
            r6.LJIIIZ = r0     // Catch: java.lang.Exception -> L3b
            r5.setDisplayOrientation(r0)     // Catch: java.lang.Exception -> L3b
            goto L3f
        L33:
            int r0 = r1.orientation     // Catch: java.lang.Exception -> L3b
            int r0 = r0 - r2
            int r0 = r0 + 360
            int r0 = r0 % 360
            goto L2d
        L3b:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L3f:
            r6.LIZJ(r4)     // Catch: java.lang.Exception -> L43
            goto L4f
        L43:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r6.LIZJ(r3)     // Catch: java.lang.Exception -> L4b
            goto L4f
        L4b:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L4f:
            android.hardware.Camera r0 = r6.LIZ
            android.hardware.Camera$Parameters r0 = r0.getParameters()
            android.hardware.Camera$Size r0 = r0.getPreviewSize()
            if (r0 != 0) goto L66
            X.1AiI r0 = r6.LJII
            r6.LJIIIIZZ = r0
        L5f:
            X.1Ai9 r1 = r6.LJIIL
            X.1AiI r0 = r6.LJIIIIZZ
            r1.LLILLJJLI = r0
            return
        L66:
            X.1AiI r2 = new X.1AiI
            int r1 = r0.width
            int r0 = r0.height
            r2.<init>(r1, r0)
            r6.LJIIIIZZ = r2
            goto L5f
        L72:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r0 = "Camera not open"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2186791AiD.LIZ():void");
    }

    public final void LIZIZ() {
        Camera cameraLIZ;
        this.LJFF.getClass();
        int iLIZ = C1304420k36.LIZ();
        if (iLIZ == -1) {
            cameraLIZ = null;
        } else {
            b.LJIJJLI.getClass();
            cameraLIZ = C746740TQy.LIZ(iLIZ, b.LIZLLL().LJFF);
        }
        this.LIZ = cameraLIZ;
        if (cameraLIZ == null) {
            throw new RuntimeException("Failed to open camera");
        }
        this.LJFF.getClass();
        int iLIZ2 = C1304420k36.LIZ();
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        this.LIZIZ = cameraInfo;
        Camera.getCameraInfo(iLIZ2, cameraInfo);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:
    
        if (r1 == null) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d0 A[EDGE_INSN: B:78:0x00d0->B:45:0x00d0 BREAK  A[LOOP:0: B:36:0x00a5->B:81:0x00a5], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(boolean r11) {
        /*
            Method dump skipped, instruction units count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2186791AiD.LIZJ(boolean):void");
    }

    public final void LIZLLL(int i) {
        Camera camera = this.LIZ;
        if (camera == null) {
            return;
        }
        Camera.Parameters parameters = camera.getParameters();
        if (i >= 0 && i < parameters.getMaxZoom()) {
            C2186801AiE c2186801AiE = this.LIZJ;
            if (c2186801AiE != null) {
                c2186801AiE.LIZJ();
            }
            if (parameters.isSmoothZoomSupported()) {
                this.LIZ.startSmoothZoom(i);
            } else {
                int zoom = this.LIZ.getParameters().getZoom();
                if (zoom >= i) {
                    if (zoom > i) {
                        while (zoom >= i) {
                            parameters.setZoom(zoom);
                            this.LIZ.setParameters(parameters);
                            zoom--;
                        }
                    }
                } else {
                    while (zoom <= i) {
                        parameters.setZoom(zoom);
                        this.LIZ.setParameters(parameters);
                        zoom++;
                    }
                }
            }
            C2186801AiE c2186801AiE2 = this.LIZJ;
            if (c2186801AiE2 != null) {
                c2186801AiE2.LIZ = false;
                c2186801AiE2.LIZIZ();
            }
        }
    }
}
