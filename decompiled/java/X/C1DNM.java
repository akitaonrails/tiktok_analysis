package X;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.view.Surface;
import com.ss.android.ttvecamera.TECameraFrame;
import com.ss.android.ttvecamera.TEFrameSizei;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

/* JADX INFO: renamed from: X.1DNM, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DNM {
    public final C1DNH LIZ;

    public final Surface LIZ() {
        return this.LIZ.LIZLLL();
    }

    public final C1DN3 LIZIZ() {
        return this.LIZ.LJII();
    }

    public final EnumC2186221AhI LIZJ() {
        return this.LIZ.LJIIJJI();
    }

    public final C1DN3[] LIZLLL() {
        return this.LIZ.LJIIL();
    }

    public final SurfaceTexture LJ() {
        return this.LIZ.LJIILIIL();
    }

    public C1DNM(boolean z) {
        if (z) {
            this.LIZ = new C1DNH() { // from class: X.1DN8
                public final List<C1DN3> LIZ = new LinkedList();

                @Override // X.C1DNH
                public final TEFrameSizei LIZJ() {
                    for (C1DN3 c1dn3 : this.LIZ) {
                        if (c1dn3.LIZJ && !c1dn3.LIZLLL) {
                            return c1dn3.LJFF;
                        }
                    }
                    return null;
                }

                @Override // X.C1DNH
                public final Surface LIZLLL() {
                    for (C1DN3 c1dn3 : this.LIZ) {
                        if (c1dn3.LIZJ && !c1dn3.LIZLLL) {
                            return c1dn3.LIZJ();
                        }
                    }
                    return null;
                }

                @Override // X.C1DNH
                public final C1DN3[] LJIIL() {
                    return (C1DN3[]) ((LinkedList) this.LIZ).toArray(new C1DN3[0]);
                }

                @Override // X.C1DNH
                public final void LJIILLIIL() {
                    Iterator<C1DN3> it2 = this.LIZ.iterator();
                    while (it2.hasNext()) {
                        it2.next().LJIIZILJ();
                    }
                }

                @Override // X.C1DNH
                public final void LJIIZILJ() {
                    Iterator<C1DN3> it2 = this.LIZ.iterator();
                    while (it2.hasNext()) {
                        it2.next().LJIILLIIL();
                    }
                    ((LinkedList) this.LIZ).clear();
                }

                @Override // X.C1DNH
                public final C1DN3 LJIIIIZZ(int i) {
                    for (C1DN3 c1dn3 : this.LIZ) {
                        if (c1dn3.LJIIJ() == i) {
                            return c1dn3;
                        }
                    }
                    return null;
                }

                @Override // X.C1DNH
                public final C1DN3 LJIIIZ(UUID uuid) {
                    for (C1DN3 c1dn3 : LJIIL()) {
                        if (c1dn3.LJ.equals(uuid)) {
                            return c1dn3;
                        }
                    }
                    return null;
                }

                @Override // X.C1DNH
                public final void LJIJ(InterfaceC1305790k5J interfaceC1305790k5J) {
                    Iterator<C1DN3> it2 = this.LIZ.iterator();
                    while (it2.hasNext()) {
                        it2.next().LJIIJ = interfaceC1305790k5J;
                    }
                }

                @Override // X.C1DNH
                public final void LJIJI(boolean z2) {
                    for (C1DN3 c1dn3 : this.LIZ) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("setPreviewStoppedState ");
                        sbLIZ.append(z2);
                        C1321640kUs.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                        c1dn3.LIZLLL = z2;
                        C1321640kUs.LIZIZ();
                    }
                }

                @Override // X.C1DNH
                public final void LIZ(C1DJM c1djm, C1DJK c1djk) {
                    C1DN3 c1dn5;
                    int i = C2187451AjH.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("createProvider ");
                    sbLIZ.append(c1djm);
                    C2183341Ace.LIZLLL("TEMultiCameraProviderManagerImpl", C2188811AlT.LIZIZ(sbLIZ));
                    TECameraFrame.ETEPixelFormat eTEPixelFormat = c1djm.LJIIIZ;
                    if (eTEPixelFormat == TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_OpenGL_OES) {
                        c1dn5 = new C1DN5(c1djm, c1djk);
                    } else if (eTEPixelFormat == TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_Recorder) {
                        c1dn5 = new C1DN9(c1djm, c1djk);
                    } else if (eTEPixelFormat == TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_BUFFER) {
                        c1dn5 = new C2189411AmR(c1djm, c1djk);
                    } else if (TECameraFrame.pixelFormat2ImageFormat(eTEPixelFormat) != 0) {
                        c1dn5 = new C1DNE(c1djm, c1djk);
                    } else {
                        c1dn5 = new C1DN5(c1djm, c1djk);
                    }
                    Iterator<C1DN3> it2 = this.LIZ.iterator();
                    while (it2.hasNext()) {
                        C1DN3 next = it2.next();
                        UUID uuid = next.LJ;
                        if (uuid != null && uuid.equals(c1dn5.LJ)) {
                            int i2 = C2187451AjH.LIZ;
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("remove provider");
                            sbLIZ2.append(next);
                            C2183341Ace.LIZLLL("TEMultiCameraProviderManagerImpl", C2188811AlT.LIZIZ(sbLIZ2));
                            it2.remove();
                        }
                    }
                    ((LinkedList) this.LIZ).add(c1dn5);
                }
            };
        } else {
            this.LIZ = new C1DNH() { // from class: X.1DN6
                public C1DN3 LIZ;
                public C1DJM LIZIZ;

                @Override // X.C1DNH
                public final TEFrameSizei LIZIZ() {
                    C1DN3 c1dn3 = this.LIZ;
                    return !c1dn3.LIZJ ? c1dn3.LJFF : new TEFrameSizei(1080, 1920);
                }

                @Override // X.C1DNH
                public final TEFrameSizei LIZJ() {
                    C1DN3 c1dn3 = this.LIZ;
                    if (c1dn3.LIZJ) {
                        return c1dn3.LJFF;
                    }
                    return null;
                }

                @Override // X.C1DNH
                public final Surface LIZLLL() {
                    C1DN3 c1dn3 = this.LIZ;
                    if (c1dn3 != null) {
                        return c1dn3.LIZJ();
                    }
                    return null;
                }

                @Override // X.C1DNH
                public final Surface[] LJFF() {
                    C1DN3 c1dn3 = this.LIZ;
                    if (c1dn3 != null) {
                        return c1dn3.LJIIIIZZ();
                    }
                    return null;
                }

                @Override // X.C1DNH
                public final EnumC2186221AhI LJIIJJI() {
                    C1DN3 c1dn3 = this.LIZ;
                    return c1dn3 != null ? c1dn3.LJIIJJI() : EnumC2186221AhI.PROVIDER_TYPE_UNKNOWN;
                }

                @Override // X.C1DNH
                public final SurfaceTexture LJIILIIL() {
                    C1DN3 c1dn3 = this.LIZ;
                    if (c1dn3 != null) {
                        return c1dn3.LJI();
                    }
                    return null;
                }

                @Override // X.C1DNH
                public final void LJIILLIIL() {
                    C1DN3 c1dn3 = this.LIZ;
                    if (c1dn3 != null) {
                        c1dn3.LJIIZILJ();
                    }
                }

                @Override // X.C1DNH
                public final void LJIIZILJ() {
                    C1DN3 c1dn3 = this.LIZ;
                    if (c1dn3 != null) {
                        c1dn3.LJIILLIIL();
                        this.LIZ = null;
                    }
                }

                @Override // X.C1DNH
                public final C1DN3 LJII() {
                    return this.LIZ;
                }

                @Override // X.C1DNH
                public final C1DJM LJIIJ() {
                    return this.LIZIZ;
                }

                @Override // X.C1DNH
                public final Surface LJ(int i) {
                    C1DN3 c1dn3 = this.LIZ;
                    if (c1dn3 != null) {
                        return c1dn3.LIZLLL(i);
                    }
                    return null;
                }

                @Override // X.C1DNH
                public final Surface[] LJI(int i) {
                    C1DN3 c1dn3 = this.LIZ;
                    if (c1dn3 != null) {
                        return c1dn3.LJIIIZ(i);
                    }
                    return null;
                }

                @Override // X.C1DNH
                public final C1DN3 LJIIIZ(UUID uuid) {
                    return this.LIZ;
                }

                @Override // X.C1DNH
                public final void LJIJ(InterfaceC1305790k5J interfaceC1305790k5J) {
                    C1DN3 c1dn3 = this.LIZ;
                    if (c1dn3 == null) {
                        int i = C2187451AjH.LIZ;
                        C2183341Ace.LIZIZ("TECameraProviderManager", "provider is null!");
                    } else {
                        c1dn3.LJIIJ = interfaceC1305790k5J;
                    }
                }

                @Override // X.C1DNH
                public final void LJIJI(boolean z2) {
                    if (this.LIZ == null) {
                        int i = C2187451AjH.LIZ;
                        C2183341Ace.LIZIZ("TECameraProviderManager", "setPreviewStoppedState: prodiver is null!");
                        return;
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("setPreviewStoppedState ");
                    sbLIZ.append(z2);
                    C1321640kUs.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                    this.LIZ.LIZLLL = z2;
                    C1321640kUs.LIZIZ();
                }

                @Override // X.C1DNH
                public final void LJIJJ(C1DJM c1djm) {
                    this.LIZIZ = c1djm;
                }

                /* JADX WARN: Removed duplicated region for block: B:31:0x0080  */
                @Override // X.C1DNH
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void LIZ(final X.C1DJM r4, final X.C1DJK r5) {
                    /*
                        r3 = this;
                        int r0 = X.C2187451AjH.LIZ
                        java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
                        java.lang.String r0 = "createProvider facing = "
                        r1.append(r0)
                        int r0 = r5.LJL()
                        r1.append(r0)
                        java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
                        java.lang.String r0 = "TECameraProviderManager"
                        X.C2183341Ace.LIZ(r0, r1)
                        int r1 = r5.LJL()
                        r0 = 7
                        if (r1 == r0) goto L5f
                        r3.LJIIZILJ()
                        com.ss.android.ttvecamera.TECameraFrame$ETEPixelFormat r1 = r4.LJIIIZ
                        com.ss.android.ttvecamera.TECameraFrame$ETEPixelFormat r0 = com.ss.android.ttvecamera.TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_Recorder
                        if (r1 != r0) goto L33
                        X.1DN9 r0 = new X.1DN9
                        r0.<init>(r4, r5)
                        r3.LIZ = r0
                        return
                    L33:
                        com.ss.android.ttvecamera.TECameraFrame$ETEPixelFormat r0 = com.ss.android.ttvecamera.TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_OpenGL_OES
                        if (r1 != r0) goto L3f
                        X.1DN5 r0 = new X.1DN5
                        r0.<init>(r4, r5)
                        r3.LIZ = r0
                        return
                    L3f:
                        boolean r0 = r5 instanceof X.C2254731DMx
                        if (r0 == 0) goto L57
                        int r0 = r4.LJFF
                        if (r0 <= 0) goto L4f
                        X.1DN7 r0 = new X.1DN7
                        r0.<init>(r4, r5)
                        r3.LIZ = r0
                        return
                    L4f:
                        X.1DNE r0 = new X.1DNE
                        r0.<init>(r4, r5)
                        r3.LIZ = r0
                        return
                    L57:
                        X.1AmR r0 = new X.1AmR
                        r0.<init>(r4, r5)
                        r3.LIZ = r0
                        return
                    L5f:
                        X.1DN3 r0 = r3.LIZ
                        if (r0 == 0) goto L6a
                        boolean r0 = r0 instanceof X.C1DN4
                        if (r0 != 0) goto L6a
                        r3.LJIIZILJ()
                    L6a:
                        X.1DN3 r0 = r3.LIZ
                        if (r0 == 0) goto L80
                        X.1DN4 r0 = (X.C1DN4) r0
                        java.util.Map<java.lang.Integer, android.graphics.SurfaceTexture> r1 = r0.LJIILIIL
                        int r0 = r0.LJIJI
                        java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                        java.util.HashMap r1 = (java.util.HashMap) r1
                        java.lang.Object r0 = r1.get(r0)
                        if (r0 == 0) goto L87
                    L80:
                        X.1DN4 r0 = new X.1DN4
                        r0.<init>(r4, r5)
                        r3.LIZ = r0
                    L87:
                        X.1DN3 r2 = r3.LIZ
                        android.graphics.SurfaceTexture r1 = r4.LIZLLL
                        int r0 = r4.LJ
                        r2.LJIL(r1, r0)
                        X.1DN3 r1 = r3.LIZ
                        X.1DJX r0 = r4.LIZJ
                        r1.LJIJJ(r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1DN6.LIZ(X.1DJM, X.1DJK):void");
                }

                @Override // X.C1DNH
                public final int LJIILJJIL(StreamConfigurationMap streamConfigurationMap, TEFrameSizei tEFrameSizei) {
                    C1DN3 c1dn3 = this.LIZ;
                    if (c1dn3 == null) {
                        return -112;
                    }
                    return c1dn3.LJIIL(streamConfigurationMap, tEFrameSizei);
                }

                @Override // X.C1DNH
                public final int LJIILL(List<TEFrameSizei> list, TEFrameSizei tEFrameSizei) {
                    C1DN3 c1dn3 = this.LIZ;
                    if (c1dn3 != null) {
                        c1dn3.LJIILIIL(list, tEFrameSizei);
                        return 0;
                    }
                    return -112;
                }
            };
        }
    }
}
