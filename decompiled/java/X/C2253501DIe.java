package X;

import com.bytedance.bpea.basics.Cert;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.ss.android.ttve.model.VEFrame;
import com.ss.android.ugc.asve.context.PreviewSize;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.vesdk.VECameraCapture;
import com.ss.android.vesdk.VECameraSettings;
import com.ss.android.vesdk.VEFocusSettings;
import com.ss.android.vesdk.VERecorder;
import com.ss.android.vesdk.k;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AwS579S0100000_35;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1DIe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2253501DIe implements C1AWA {
    public final C1DK1 LIZ;
    public final InterfaceC2253611DIp LIZIZ;
    public final C2253571DIl LIZJ;
    public VECameraSettings LIZLLL = new VECameraSettings.Builder().build();
    public final VECameraCapture LJ = new VECameraCapture();
    public final C01GW LJFF = C452501pT.LIZIZ(new AwS579S0100000_35(this, 386));
    public final C2252331DDr LJI;
    public final C2252331DDr LJII;
    public final C2252331DDr LJIIIIZZ;
    public final C2252331DDr LJIIIZ;

    @Override // X.C1AWA
    public final void LIZ() {
        C1DK1 c1dk1 = this.LIZ;
        synchronized (c1dk1) {
            c1dk1.LIZIZ().LJJJI(null, new InterfaceC2183551Acz() { // from class: X.1DIu
                @Override // X.InterfaceC2183551Acz
                public final void onDone(int i) {
                }
            });
        }
    }

    @Override // X.C1AWA
    public final float LIZLLL() {
        return this.LJ.LJJIJLIJ(false);
    }

    @Override // X.C1AWA
    public final void LJIIJ() {
        this.LIZJ.onEvent(new AbstractC2253581DIm() { // from class: X.1DIo
        });
        VERecorder vERecorderLIZIZ = this.LIZ.LIZIZ();
        C2253671DIv c2253671DIv = new InterfaceC2183551Acz() { // from class: X.1DIv
            @Override // X.InterfaceC2183551Acz
            public final void onDone(int i) {
            }
        };
        vERecorderLIZIZ.getClass();
        C2484209oO.LJI("VERecorder", "stopPreviewAsync");
        k kVar = vERecorderLIZIZ.LIZIZ;
        kVar.LJJLI = c2253671DIv;
        kVar.LJJJJ(true);
    }

    public final C2253461DIa LJIIL() {
        return (C2253461DIa) this.LJFF.getValue();
    }

    @Override // X.C1AWA
    public final int LJLJJLL() {
        return this.LIZLLL.getCameraFacing().ordinal();
    }

    @Override // X.C1AWA
    public final void release() {
        this.LJ.LJJ(this.LIZIZ.LIZ(EnumC2253551DIj.CLOSE_CAMERA_ON_PAUSE));
        this.LJ.LLIZLLLIL = null;
        if (C296250BjL.LIZIZ()) {
            this.LJ.LLIZ = null;
        }
    }

    @Override // X.C1AWA
    public final InterfaceC346201Wa<Boolean> LJFF() {
        return this.LJIIIZ;
    }

    @Override // X.C1AWA
    public final InterfaceC346201Wa<Integer> LJIIJJI() {
        return this.LJII;
    }

    @Override // X.C1AWA
    public final boolean LIZIZ(float f) {
        boolean z;
        C2253461DIa c2253461DIaLJIIL = LJIIL();
        if (c2253461DIaLJIIL.LIZ.LL.getCameraType() == VECameraSettings.CAMERA_TYPE.TYPE_CamKit) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            float f2 = 1;
            float f3 = c2253461DIaLJIIL.LIZJ - f2;
            if (c2253461DIaLJIIL.LJ <= 0.0f) {
                c2253461DIaLJIIL.LJ = 1.0f;
            }
            if (f <= 0.0f) {
                return false;
            }
            float f4 = (f - c2253461DIaLJIIL.LJFF) * f3;
            float f5 = c2253461DIaLJIIL.LJ;
            float f6 = f2 + (f4 / f5);
            c2253461DIaLJIIL.LJFF = f;
            c2253461DIaLJIIL.LJ = f5 * f6;
            VECameraCapture vECameraCapture = c2253461DIaLJIIL.LIZ;
            vECameraCapture.LLJILJIL.zoomV2(f6, vECameraCapture);
            return true;
        }
        if (f <= 0.05d) {
            f /= 4.0f;
        }
        float fMax = Math.max(0.0f, ((f - c2253461DIaLJIIL.LJFF) * c2253461DIaLJIIL.LIZJ) + c2253461DIaLJIIL.LIZLLL);
        c2253461DIaLJIIL.LJFF = f;
        return c2253461DIaLJIIL.LIZ(fMax);
    }

    @Override // X.C1AWA
    public final void LIZJ(VEFocusSettings vEFocusSettings) {
        this.LJ.LJJIIJ(vEFocusSettings);
    }

    @Override // X.C1AWA
    public final void LJ(Cert cert) {
        if (this.LJ.LJJIJIIJI() == 0) {
            this.LJ.LJ(cert);
        }
    }

    @Override // X.C1AWA
    public final void LJI(Cert cert) {
        int iLJJIJIIJI = this.LJ.LJJIJIIJI();
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "dm_camera_simplified_lifecycle", true, true)) {
            this.LIZJ.onEvent(new AbstractC2253581DIm() { // from class: X.1DIn
            });
            this.LJ.LJJI(false, cert);
        } else {
            if (iLJJIJIIJI == 0 || iLJJIJIIJI == 4) {
                return;
            }
            this.LIZJ.onEvent(new AbstractC2253581DIm() { // from class: X.1DIn
            });
            this.LJ.LJJI(false, cert);
        }
    }

    @Override // X.C1AWA
    public final void LJIIIIZZ(C1DJ0 c1dj0) {
        int i;
        Cert certLIZ;
        if (LJLJJLL() == 0) {
            i = 1;
        } else {
            i = 0;
        }
        if (C1A84.LIZ(i) != this.LIZLLL.getCameraFacing()) {
            VECameraSettings.Builder builder = new VECameraSettings.Builder(this.LIZLLL);
            builder.setCameraFacing(C1A84.LIZ(i));
            VECameraSettings vECameraSettingsBuild = builder.build();
            switch (C2253711DIz.LIZ[c1dj0.ordinal()]) {
                case 1:
                    certLIZ = this.LIZIZ.LIZ(EnumC2253551DIj.SWITCH_CAMERA_DOUBLE_TAP_CAMERA_VIEW);
                    break;
                case 2:
                    certLIZ = this.LIZIZ.LIZ(EnumC2253551DIj.SWITCH_CAMERA_TOOL_BAR);
                    break;
                case 3:
                    certLIZ = this.LIZIZ.LIZ(EnumC2253551DIj.SWITCH_CAMERA_PROP_FRONT);
                    break;
                case 4:
                    certLIZ = this.LIZIZ.LIZ(EnumC2253551DIj.SWITCH_CAMERA_PROP_REAR);
                    break;
                case 5:
                    certLIZ = this.LIZIZ.LIZ(EnumC2253551DIj.SWITCH_CAMERA_AR_PROP_REAR);
                    break;
                case 6:
                    certLIZ = this.LIZIZ.LIZ(EnumC2253551DIj.OPEN_CAMERA_PROP_CANCEL);
                    break;
                default:
                    throw new C1954807lC();
            }
            this.LJ.LJJLI(vECameraSettingsBuild, certLIZ);
            this.LIZLLL = vECameraSettingsBuild;
            this.LJI.LIZJ(Integer.valueOf(i));
        }
    }

    @Override // X.C1AWA
    public final void enableFlash(boolean z) {
        VECameraSettings.CAMERA_FLASH_MODE camera_flash_mode;
        VECameraCapture vECameraCapture = this.LJ;
        if (z) {
            camera_flash_mode = VECameraSettings.CAMERA_FLASH_MODE.CAMERA_FLASH_TORCH;
        } else {
            camera_flash_mode = VECameraSettings.CAMERA_FLASH_MODE.CAMERA_FLASH_OFF;
        }
        vECameraCapture.LJJLIIIIJ(camera_flash_mode);
    }

    @Override // X.C1AWA
    public final boolean LJII(float f, float f2) {
        C2253461DIa c2253461DIaLJIIL = LJIIL();
        if (c2253461DIaLJIIL.LIZJ == -1.0f) {
            return false;
        }
        if (c2253461DIaLJIIL.LIZ.LL.getCameraType() == VECameraSettings.CAMERA_TYPE.TYPE_CamKit) {
            return c2253461DIaLJIIL.LIZ(Math.max(0.0f, ((c2253461DIaLJIIL.LIZJ / LSPassThroughRecordSizeConfig.DEFAULT) * f) + c2253461DIaLJIIL.LIZLLL));
        }
        VECameraCapture vECameraCapture = c2253461DIaLJIIL.LIZ;
        vECameraCapture.LLJILJIL.zoomV2(f2, vECameraCapture);
        return true;
    }

    @Override // X.C1AWA
    public final void LJIIIZ(InterfaceC2253521DIg interfaceC2253521DIg, boolean z) {
        VECameraSettings.Builder builder = new VECameraSettings.Builder();
        builder.setIsUseNewCameraTypeStrategy(true);
        builder.setDontUseVendorCameraType(interfaceC2253521DIg.LJIJJ());
        builder.setCameraFacing(C1D3R.LIZ(interfaceC2253521DIg.LIZ()));
        builder.setOptionFlag(interfaceC2253521DIg.LJI());
        builder.setRetryCnt(interfaceC2253521DIg.LJIJI());
        builder.setRetryStartPreviewCnt(interfaceC2253521DIg.LJIILLIIL());
        int[] iArrLIZIZ = interfaceC2253521DIg.LIZIZ();
        if (iArrLIZIZ.length >= 2) {
            if (z) {
                int i = iArrLIZIZ[0];
                builder.setPreviewSize(i, i);
            } else {
                builder.setPreviewSize(iArrLIZIZ[0], iArrLIZIZ[1]);
            }
        } else {
            C2216191BoX.LIZ.getClass();
            PreviewSize previewSizeLIZLLL = ((C2208821Bce) C2216191BoX.LIZIZ()).LIZLLL();
            if (previewSizeLIZLLL != null) {
                if (z) {
                    int i2 = previewSizeLIZLLL.width;
                    builder.setPreviewSize(i2, i2);
                } else {
                    builder.setPreviewSize(previewSizeLIZLLL.width, previewSizeLIZLLL.height);
                }
            }
        }
        if (((Boolean) C1866520yfi.LIZ.getValue()).booleanValue()) {
            int[] iArrLJ = interfaceC2253521DIg.LJ();
            if (iArrLJ.length >= 2) {
                if (z) {
                    int i3 = iArrLJ[0];
                    builder.setSecondaryPreviewSize(i3, i3);
                } else {
                    builder.setSecondaryPreviewSize(iArrLJ[0], iArrLJ[1]);
                }
            }
        }
        int[] iArrLJIIJ = interfaceC2253521DIg.LJIIJ();
        if (iArrLJIIJ != null && iArrLJIIJ.length >= 2) {
            builder.setFpsRange(iArrLJIIJ);
        }
        Boolean boolLJFF = interfaceC2253521DIg.LJFF();
        if (boolLJFF != null) {
            builder.setCameraAntiShake(boolLJFF.booleanValue());
        }
        builder.setCameraModeType(interfaceC2253521DIg.LIZJ());
        builder.enableShutterSound(interfaceC2253521DIg.LJIIL());
        HashMap<EnumC1270990jBB, Cert> map = new HashMap<>();
        Cert cert = C1DI4.LJIIIZ;
        if (cert != null) {
            map.put(EnumC1270990jBB.REGISTER_SENSOR, cert);
        }
        Cert cert2 = C1DI4.LJIIJ;
        if (cert2 != null) {
            map.put(EnumC1270990jBB.UNREGISTER_SENSOR, cert2);
        }
        map.put(EnumC1270990jBB.EXCEPTION_CLOSE_CAMERA, CertProviderManagerKt.findCert("bpea-exception_close_camera", 1476788485));
        builder.setCameraPrivacyCertMap(map);
        builder.setDefaultZoomUsingZoomV2(true);
        VECameraSettings vECameraSettingsBuild = builder.build();
        vECameraSettingsBuild.enableManualReleaseCaptureResult(interfaceC2253521DIg.LIZLLL());
        this.LIZLLL = vECameraSettingsBuild;
        this.LJI.LIZJ(Integer.valueOf(vECameraSettingsBuild.getCameraFacing().ordinal()));
        VECameraCapture vECameraCapture = this.LJ;
        vECameraCapture.LJIIL(C2213981Bky.LIZIZ.getApplicationContext(), this.LIZLLL);
        vECameraCapture.LLIZLLLIL = new InterfaceC2186091Ah5() { // from class: X.1DIY
            @Override // X.InterfaceC2186111Ah7
            public final void LIZIZ() {
                this.LIZ.LJIIL().LIZLLL = 1.0f;
                this.LIZ.LJIIIIZZ.LIZJ(Boolean.TRUE);
            }

            @Override // X.InterfaceC2186111Ah7
            public final void LIZ(int i4) {
                this.LIZ.LJIIIIZZ.LIZJ(Boolean.FALSE);
                this.LIZ.LJIIL().LIZLLL = 1.0f;
            }

            @Override // X.InterfaceC2186091Ah5
            public final void onError(int i4, String str) {
                this.LIZ.LJIIL().LIZLLL = 1.0f;
            }

            @Override // X.InterfaceC2186091Ah5
            public final void onInfo(int i4, int i5, String str) {
                boolean z2 = false;
                if (i4 != 2) {
                    if (i4 == 3) {
                        VECameraCapture vECameraCapture2 = this.LIZ.LJIIL().LIZ;
                        if (vECameraCapture2.LL.getCameraType() == VECameraSettings.CAMERA_TYPE.TYPE_CamKit) {
                            z2 = true;
                        }
                        vECameraCapture2.LLJILJIL.queryZoomAbility(vECameraCapture2, !z2);
                        return;
                    }
                    return;
                }
                this.LIZ.LJIIL().LIZLLL = 1.0f;
                VECameraCapture vECameraCapture3 = this.LIZ.LJIIL().LIZ;
                if (vECameraCapture3.LL.getCameraType() == VECameraSettings.CAMERA_TYPE.TYPE_CamKit) {
                    z2 = true;
                }
                vECameraCapture3.LLJILJIL.queryZoomAbility(vECameraCapture3, !z2);
            }
        };
        C1DK1 c1dk1 = this.LIZ;
        synchronized (c1dk1) {
            c1dk1.LJI = vECameraCapture;
        }
        C2253571DIl c2253571DIl = this.LIZJ;
        c2253571DIl.LIZ.add(new InterfaceC2253641DIs() { // from class: X.1DIb
            @Override // X.InterfaceC2253641DIs
            public void onEvent(AbstractC2253581DIm abstractC2253581DIm) {
                boolean z2;
                if (Intrinsics.LJFF(abstractC2253581DIm, C2253481DIc.LIZ)) {
                    C2253461DIa c2253461DIaLJIIL = this.LIZ.LJIIL();
                    c2253461DIaLJIIL.LIZ.LLIZ = (C1DIZ) c2253461DIaLJIIL.LJI.getValue();
                    VECameraCapture vECameraCapture2 = c2253461DIaLJIIL.LIZ;
                    if (vECameraCapture2.LL.getCameraType() == VECameraSettings.CAMERA_TYPE.TYPE_CamKit) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    vECameraCapture2.LLJILJIL.queryZoomAbility(vECameraCapture2, !z2);
                }
            }
        });
    }

    @Override // X.C1AWA
    public final int LJJZ(String str, String str2) {
        return this.LIZ.LIZ().LIZJ(str, str2);
    }

    @Override // X.C1AWA
    public final void Rn(String str, String str2) {
        C1DK1 c1dk1 = this.LIZ;
        synchronized (c1dk1) {
            c1dk1.LIZIZ().LJIL(str, str2);
        }
    }

    @Override // X.C1AWA
    public final int Sn(List<String> list, List<? extends VEFrame> list2) {
        return this.LIZ.LIZ().LIZLLL(list, list2);
    }

    public C2253501DIe(C1DK1 c1dk1, InterfaceC2253611DIp interfaceC2253611DIp, C2253571DIl c2253571DIl) {
        this.LIZ = c1dk1;
        this.LIZIZ = interfaceC2253611DIp;
        this.LIZJ = c2253571DIl;
        C2252331DDr c2252331DDrLIZIZ = C09IR.LIZIZ(1, 0, null, 6);
        this.LJI = c2252331DDrLIZIZ;
        this.LJII = c2252331DDrLIZIZ;
        C2252331DDr c2252331DDrLIZIZ2 = C09IR.LIZIZ(1, 0, null, 6);
        this.LJIIIIZZ = c2252331DDrLIZIZ2;
        this.LJIIIZ = c2252331DDrLIZIZ2;
    }

    @Override // X.C1AWA
    public final void LJLJL(int i, int i2, InterfaceC2173471A4j interfaceC2173471A4j) {
        C1DK1 c1dk1 = this.LIZ;
        synchronized (c1dk1) {
            c1dk1.LIZIZ().LJJIJIIJI(i, i2, false, true, interfaceC2173471A4j, false);
        }
    }

    @Override // X.C1AWA
    public final void Qn(String str, String str2, String str3) {
        C1DK1 c1dk1 = this.LIZ;
        synchronized (c1dk1) {
            c1dk1.LIZIZ().LJJ(str, str2, str3);
        }
    }
}
