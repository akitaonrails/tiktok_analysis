package X;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import android.os.Handler;
import android.util.Range;
import android.view.Surface;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: X.1DMz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2254751DMz extends AbstractC2254741DMy {
    @Override // X.AbstractC2254741DMy
    public final int LJIJI() {
        return 3;
    }

    @Override // X.AbstractC2254741DMy
    public final int LJJ() {
        return this.LJII.LLLLIL;
    }

    @Override // X.AbstractC2254741DMy
    public final int LJJIL() throws CameraAccessException {
        C1DNM c1dnm = this.LJI.LJI;
        if (this.LJIIIZ == null || c1dnm == null) {
            int i = C2187451AjH.LIZ;
            C2183341Ace.LIZ("TEVideo2Mode", "CameraDevice or ProviderManager is null!");
            return -100;
        }
        int iLJJIJ = LJJIJ();
        if (iLJJIJ != 0) {
            return iLJJIJ;
        }
        C1DJ6 c1dj6 = this.LJII;
        if (!c1dj6.LLLLLJLJLL || this.LIZJ == null) {
            if (c1dj6.LLLF.getBoolean("enablePreviewTemplate")) {
                this.LIZJ = this.LJIIIZ.createCaptureRequest(1);
            } else {
                this.LIZJ = this.LJIIIZ.createCaptureRequest(3);
            }
        }
        ArrayList<Surface> arrayList = new ArrayList();
        if (this.LJII.LLJJIJI) {
            for (C1DN3 c1dn3 : c1dnm.LIZLLL()) {
                if (c1dn3.LIZJ && !c1dn3.LIZLLL) {
                    arrayList.add(c1dn3.LIZJ());
                }
            }
        } else {
            if (c1dnm.LIZIZ().LJIIJJI() == EnumC2186221AhI.PROVIDER_TYPE_SURFACE_AND_IMAGE) {
                arrayList.addAll(Arrays.asList(c1dnm.LIZ.LJFF()));
            } else if (c1dnm.LIZIZ().LJIIJJI() == EnumC2186221AhI.PROVIDER_TYPE_RECORDER) {
                arrayList.add(c1dnm.LIZ());
                arrayList.add(c1dnm.LIZIZ().LIZIZ());
            } else if (c1dnm.LIZIZ().LJIIJJI() == EnumC2186221AhI.PROVIDER_TYPE_MULTI_SURFACE_TEXTURE) {
                arrayList.add(c1dnm.LIZ.LJ(this.LJII.LLILZ));
            } else {
                arrayList.add(c1dnm.LIZ());
            }
            if (!this.LJII.LLLIIIL && c1dnm.LIZIZ().LJ() != null && c1dnm.LIZIZ().LJFF() == EnumC2186171AhD.ADD_SURFACE) {
                arrayList.add(c1dnm.LIZIZ().LJ());
            }
        }
        boolean z = false;
        for (Surface surface : arrayList) {
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("startPreview, add surface = ");
            sbLIZ.append(surface);
            C2183341Ace.LIZLLL("TEVideo2Mode", C2188811AlT.LIZIZ(sbLIZ));
            this.LIZJ.addTarget(surface);
            if (!surface.isValid()) {
                z = true;
            }
        }
        if (this.LJII.LLJJIJI) {
            C1DN3[] c1dn3ArrLIZLLL = c1dnm.LIZLLL();
            for (C1DN3 c1dn32 : c1dn3ArrLIZLLL) {
                if (c1dn32.LIZJ && c1dn32.LIZLLL) {
                    arrayList.add(c1dn32.LIZJ());
                }
            }
        }
        this.LIZJ.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, LJIIJ(new Range<>(Integer.valueOf(this.LJJII.min / this.LJII.LLILLL.fpsUnitFactor), Integer.valueOf(this.LJJII.max / this.LJII.LLILLL.fpsUnitFactor))));
        if (z) {
            int i3 = C2187451AjH.LIZ;
            C2183341Ace.LIZIZ("TEVideo2Mode", "start preview may be failed, surface invalid...");
        }
        this.LJJIJL = System.currentTimeMillis();
        Handler handlerLJIJ = this.LJII.LLJIJIL ? LJIJ() : this.LJIIJ;
        if (this.LJII.LLLLLJLJLL) {
            if (!((ArrayList) this.LJJJJZ).isEmpty() && !this.LJJJJLL) {
                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                    ((OutputConfiguration) ListProtector.get(this.LJJJJZ, i4)).addSurface((Surface) ListProtector.get(arrayList, i4));
                    this.LJJJJLL = true;
                }
            }
            if (Build.VERSION.SDK_INT >= 28 && this.LIZLLL != null) {
                this.LIZLLL.finalizeOutputConfigurations(this.LJJJJZ);
                this.LJJJJLI = true;
                int i5 = C2187451AjH.LIZ;
                C2183341Ace.LIZ("TEVideo2Mode", "finalizeOutputConfigurations in startPreview");
                LJJJJ();
            }
        } else {
            this.LIZLLL = null;
            LJIIL(arrayList, this.LJJJLL, handlerLJIJ);
        }
        if (this.LIZLLL == null) {
            LJJJJLL();
        }
        return 0;
    }

    @Override // X.AbstractC2254741DMy
    public final void LJJIZ() {
        super.LJJIZ();
    }

    @Override // X.AbstractC2254741DMy
    public final void LJJJ() {
        super.LJJJ();
    }

    @Override // X.C1DO4
    public final void LIZ(int i) {
        CaptureRequest.Builder builder = this.LIZJ;
        int i2 = 1;
        if (builder == null) {
            int i3 = C2187451AjH.LIZ;
            C2183341Ace.LIZIZ("TEVideo2Mode", "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -100. Reason: mCaptureRequestBuilder is null");
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("switchFlashMode: ");
            sbLIZ.append("CaptureRequest.Builder is null");
            C2183341Ace.LIZIZ("TEVideo2Mode", C2188811AlT.LIZIZ(sbLIZ));
            InterfaceC2254691DMt interfaceC2254691DMt = this.LJFF;
            int i4 = this.LJII.LLILLJJLI;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("switchFlashMode:");
            sbLIZ2.append("CaptureRequest.Builder is null");
            interfaceC2254691DMt.LIZJ(this.LJIIIZ, i4, -100, C2188811AlT.LIZIZ(sbLIZ2));
            InterfaceC2254691DMt interfaceC2254691DMt2 = this.LJFF;
            if (i == 0) {
                i2 = 0;
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("switchFlashMode:");
            sbLIZ3.append("CaptureRequest.Builder is null");
            interfaceC2254691DMt2.LJIIIZ(i2, C2188811AlT.LIZIZ(sbLIZ3));
            return;
        }
        if (i != 0) {
            if (i != 2) {
                if (i != 5) {
                    int i5 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -100. Reason: not support flash mode ");
                    sbLIZ4.append(i);
                    C2183341Ace.LIZIZ("TEVideo2Mode", C2188811AlT.LIZIZ(sbLIZ4));
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append("Video Mode not support this mode : ");
                    sbLIZ5.append(i);
                    C2183341Ace.LJ("TEVideo2Mode", C2188811AlT.LIZIZ(sbLIZ5));
                    InterfaceC2254691DMt interfaceC2254691DMt3 = this.LJFF;
                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                    sbLIZ6.append("Video Mode not support this mode : ");
                    sbLIZ6.append(i);
                    interfaceC2254691DMt3.LJIIIZ(-1, C2188811AlT.LIZIZ(sbLIZ6));
                    return;
                }
                if (Build.VERSION.SDK_INT >= 28) {
                    int[] iArr = (int[]) this.LIZ.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
                    if (iArr != null && Arrays.stream(iArr).anyMatch(new C1DO3())) {
                        int i6 = C2187451AjH.LIZ;
                        C2183341Ace.LIZLLL("TEVideo2Mode", "switchFlashMode ON_EXTERNAL_FLASH");
                        this.LIZJ.set(CaptureRequest.CONTROL_AE_MODE, 5);
                        this.LIZJ.set(CaptureRequest.FLASH_MODE, 0);
                    } else {
                        int i7 = C2187451AjH.LIZ;
                        C2183341Ace.LIZLLL("TEVideo2Mode", "switchFlashMode external flash is not supported");
                    }
                }
            } else {
                builder.set(CaptureRequest.CONTROL_AE_MODE, 1);
                this.LIZJ.set(CaptureRequest.FLASH_MODE, 2);
            }
        } else {
            builder.set(CaptureRequest.CONTROL_AE_MODE, 1);
            this.LIZJ.set(CaptureRequest.FLASH_MODE, 0);
        }
        this.LJII.LLLLIL = i;
        this.LJJIIZ = i;
        System.currentTimeMillis();
        InterfaceC2254691DMt interfaceC2254691DMt4 = this.LJFF;
        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
        sbLIZ7.append("camera2 will change flash mode ");
        sbLIZ7.append(i);
        interfaceC2254691DMt4.LJ(104, 0, C2188811AlT.LIZIZ(sbLIZ7));
        C1699800uKo c1699800uKoLJJJJJ = LJJJJJ(this.LIZJ);
        InterfaceC2254691DMt interfaceC2254691DMt5 = this.LJFF;
        StringBuilder sbLIZ8 = C2188811AlT.LIZ();
        sbLIZ8.append("camera2 did change flash mode ");
        sbLIZ8.append(i);
        interfaceC2254691DMt5.LJ(105, 0, C2188811AlT.LIZIZ(sbLIZ8));
        if (!c1699800uKoLJJJJJ.LIZ) {
            int i8 = C2187451AjH.LIZ;
            StringBuilder sbLIZ9 = C2188811AlT.LIZ();
            sbLIZ9.append("[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -418. Reason: ");
            sbLIZ9.append(c1699800uKoLJJJJJ.LIZIZ);
            C2183341Ace.LIZIZ("TEVideo2Mode", C2188811AlT.LIZIZ(sbLIZ9));
            InterfaceC2254691DMt interfaceC2254691DMt6 = this.LJFF;
            StringBuilder sbLIZ10 = C2188811AlT.LIZ();
            sbLIZ10.append("switch flash failed.");
            sbLIZ10.append(c1699800uKoLJJJJJ.LIZIZ);
            interfaceC2254691DMt6.LJ(-418, -418, C2188811AlT.LIZIZ(sbLIZ10));
            InterfaceC2254691DMt interfaceC2254691DMt7 = this.LJFF;
            if (i == 0) {
                i2 = 0;
            }
            StringBuilder sbLIZ11 = C2188811AlT.LIZ();
            sbLIZ11.append("switch flash failed.");
            sbLIZ11.append(c1699800uKoLJJJJJ.LIZIZ);
            interfaceC2254691DMt7.LJIIIZ(i2, C2188811AlT.LIZIZ(sbLIZ11));
            return;
        }
        InterfaceC2254691DMt interfaceC2254691DMt8 = this.LJFF;
        if (i == 0) {
            i2 = 0;
        }
        interfaceC2254691DMt8.LJIIIIZZ(i2, "torch success");
    }

    public C2254751DMz(C2254731DMx c2254731DMx, Context context, CameraManager cameraManager, Handler handler) {
        super(c2254731DMx, context, handler);
        this.LJ = cameraManager;
        if (this.LJII.LLJILJILJ) {
            this.LJIIIIZZ = new C1DNQ(this) { // from class: X.1DNh
                @Override // X.InterfaceC2254801DNe
                public final void LIZIZ(CaptureRequest.Builder builder) {
                    builder.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
                    builder.set(CaptureRequest.CONTROL_AF_MODE, 3);
                }
            };
        } else {
            this.LJIIIIZZ = new C1DNY(this);
        }
    }
}
