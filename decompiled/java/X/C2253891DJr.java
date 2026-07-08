package X;

import android.view.Surface;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.vesdk.VEAudioEncodeSettings;
import com.ss.android.vesdk.VEInfo;
import com.ss.android.vesdk.VEPreviewSettings;
import com.ss.android.vesdk.VEVideoEncodeSettings;

/* JADX INFO: renamed from: X.1DJr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2253891DJr implements InterfaceC2253911DJt {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LJIIJ;
    public final C2253901DJs LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public volatile InterfaceC1625060sOG LIZLLL;
    public volatile C1AWA LJ;
    public volatile InterfaceC2219621Bu4 LJFF;
    public volatile InterfaceC1650240t2s LJI;
    public volatile C1DK3 LJII;
    public volatile C1ATX LJIIIIZZ;
    public volatile C1DK1 LJIIIZ;

    @Override // X.InterfaceC2253911DJt
    public final C1AWA LJFF() {
        this.LIZIZ = true;
        return LJIIJJI();
    }

    public final InterfaceC2219621Bu4 LJIIJ() {
        InterfaceC2219621Bu4 interfaceC2219621Bu4 = this.LJFF;
        if (interfaceC2219621Bu4 == null) {
            synchronized (this) {
                interfaceC2219621Bu4 = this.LJFF;
                if (interfaceC2219621Bu4 == null) {
                    InterfaceC2219621Bu4 interfaceC2219621Bu4LIZ = this.LIZ.LIZ();
                    this.LJFF = interfaceC2219621Bu4LIZ;
                    return interfaceC2219621Bu4LIZ;
                }
            }
        }
        return interfaceC2219621Bu4;
    }

    public final C1AWA LJIIJJI() {
        C1AWA c1awa = this.LJ;
        if (c1awa == null) {
            synchronized (this) {
                c1awa = this.LJ;
                if (c1awa == null) {
                    C1AWA c1awaLIZJ = this.LIZ.LIZJ();
                    this.LJ = c1awaLIZJ;
                    return c1awaLIZJ;
                }
            }
        }
        return c1awa;
    }

    public final C1DK1 LJIIL() {
        C1DK1 c1dk1 = this.LJIIIZ;
        if (c1dk1 == null) {
            synchronized (this) {
                c1dk1 = this.LJIIIZ;
                if (c1dk1 == null) {
                    C1DK1 c1dk1LJFF = this.LIZ.LJFF();
                    this.LJIIIZ = c1dk1LJFF;
                    return c1dk1LJFF;
                }
            }
        }
        return c1dk1;
    }

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C2253891DJr.class, "effectsRender", "getEffectsRender()Lcom/ss/android/ugc/aweme/camera/core/api/effect/IIMEffectRender;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C2253891DJr.class, "cameraCapture", "getCameraCapture()Lcom/ss/android/ugc/aweme/camera/core/api/preview/IIMCameraCapture;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C2253891DJr.class, "audioCapture", "getAudioCapture()Lcom/ss/android/ugc/aweme/camera/core/api/audio/IIMAudioCapture;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C2253891DJr.class, "recorderWrapper", "getRecorderWrapper()Lcom/ss/android/ugc/aweme/camera/core/api/record/IIMRecorder;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C2253891DJr.class, "recordConfigProvider", "getRecordConfigProvider()Lcom/ss/android/ugc/aweme/camera/core/api/config/IIMRecordConfigProvider;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C2253891DJr.class, "coreScheduler", "getCoreScheduler()Lcom/ss/android/ugc/aweme/im/creative/camera/core/scheduler/IMCameraCoreScheduler;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(C2253891DJr.class, "takePhotoProcessor", "getTakePhotoProcessor()Lcom/ss/android/ugc/aweme/camera/core/api/image/IMTakePhotoProcessor;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS8 = new C2217381BqS(C2253891DJr.class, "veRecorder", "getVeRecorder()Lcom/ss/android/ugc/aweme/im/creative/camera/core/IMVERecorder;", 0);
        c09r3.getClass();
        LJIIJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7, c2217381BqS8};
    }

    @Override // X.InterfaceC2253911DJt
    public final C1ATX LJI() {
        C1ATX c1atx = this.LJIIIIZZ;
        if (c1atx == null) {
            synchronized (this) {
                c1atx = this.LJIIIIZZ;
                if (c1atx == null) {
                    C1ATX c1atxLJIIIZ = this.LIZ.LJIIIZ();
                    this.LJIIIIZZ = c1atxLJIIIZ;
                    return c1atxLJIIIZ;
                }
            }
        }
        return c1atx;
    }

    @Override // X.InterfaceC2253911DJt
    public final InterfaceC1650240t2s LJIIIIZZ() {
        InterfaceC1650240t2s interfaceC1650240t2s = this.LJI;
        if (interfaceC1650240t2s == null) {
            synchronized (this) {
                interfaceC1650240t2s = this.LJI;
                if (interfaceC1650240t2s == null) {
                    InterfaceC1650240t2s interfaceC1650240t2sLJIIIIZZ = this.LIZ.LJIIIIZZ();
                    this.LJI = interfaceC1650240t2sLJIIIIZZ;
                    return interfaceC1650240t2sLJIIIIZZ;
                }
            }
        }
        return interfaceC1650240t2s;
    }

    public final C1DK3 LJIIIZ() {
        C1DK3 c1dk3 = this.LJII;
        if (c1dk3 == null) {
            synchronized (this) {
                c1dk3 = this.LJII;
                if (c1dk3 == null) {
                    C1DK3 c1dk32 = new C1DK3();
                    this.LJII = c1dk32;
                    return c1dk32;
                }
            }
        }
        return c1dk3;
    }

    @Override // X.InterfaceC2253911DJt
    public final void release() {
        if (this.LIZJ) {
            LJIIJ().release();
        }
        if (this.LIZIZ) {
            LJIIJJI().release();
        }
        C1DK1 c1dk1LJIIL = LJIIL();
        synchronized (c1dk1LJIIL) {
            if (c1dk1LJIIL.LJIIJJI) {
                if (!c1dk1LJIIL.LJIIL) {
                    c1dk1LJIIL.LIZIZ().LIZIZ.LJJJ.LJIJI(false);
                    c1dk1LJIIL.LIZIZ().LJIILJJIL();
                    c1dk1LJIIL.LJIIL = true;
                }
            }
        }
        C23118094a.LJ(((InterfaceC497601wk) this.LIZ.LIZ.getValue()).getCoroutineContext());
    }

    @Override // X.InterfaceC2253911DJt
    public final InterfaceC2219621Bu4 LIZJ() {
        if (C296250BjL.LIZIZ()) {
            this.LIZJ = true;
        }
        return LJIIJ();
    }

    @Override // X.InterfaceC2253911DJt
    public final InterfaceC1625060sOG LJII() {
        LJIIIIZZ().LJI();
        InterfaceC1625060sOG interfaceC1625060sOG = this.LIZLLL;
        if (interfaceC1625060sOG == null) {
            synchronized (this) {
                interfaceC1625060sOG = this.LIZLLL;
                if (interfaceC1625060sOG == null) {
                    InterfaceC1625060sOG interfaceC1625060sOGLJ = this.LIZ.LJ();
                    this.LIZLLL = interfaceC1625060sOGLJ;
                    return interfaceC1625060sOGLJ;
                }
            }
        }
        return interfaceC1625060sOG;
    }

    public C2253891DJr(C2253901DJs c2253901DJs) {
        this.LIZ = c2253901DJs;
    }

    @Override // X.InterfaceC2253911DJt
    public final void LIZIZ(InterfaceC2253641DIs interfaceC2253641DIs) {
        this.LIZ.LIZIZ().LIZ.add(interfaceC2253641DIs);
    }

    @Override // X.InterfaceC2253911DJt
    public final void LIZLLL(InterfaceC2253641DIs interfaceC2253641DIs) {
        this.LIZ.LIZIZ().LIZ.remove(interfaceC2253641DIs);
    }

    @Override // X.InterfaceC2253911DJt
    public final void LJLJLLL(Surface surface) {
        LJIIIIZZ().LJLJLLL(surface);
    }

    @Override // X.InterfaceC2253911DJt
    public final void LIZ(int i, int i2) {
        LJIIIIZZ().LIZ(i, i2);
    }

    @Override // X.InterfaceC2253911DJt
    public final void LJ(String str, boolean z, boolean z2, C1867970yi3 c1867970yi3) {
        this.LIZ.LJIIJ().setCreationId(str);
        final C1DK1 c1dk1LJIIL = LJIIL();
        synchronized (c1dk1LJIIL) {
            if (c1dk1LJIIL.LJIIJJI) {
                return;
            }
            c1dk1LJIIL.LIZIZ().LIZ(new InterfaceC1464200oCo() { // from class: X.1DIw
                @Override // X.InterfaceC1464200oCo
                public final void onCallback(int i, int i2, float f, String str2) {
                    if (i == 1000) {
                        C1783850wWN c1783850wWN = c1dk1LJIIL.LIZIZ;
                        C23250099c.LIZLLL(c1783850wWN.LIZ, null, null, new C1783800wWI(c1783850wWN, C0N6K.RENDER_CREATED, EnumC1778630wNx.SUCCESS, null), 3);
                        c1dk1LJIIL.LIZIZ().LJJIZ(c1dk1LJIIL.LJI);
                        return;
                    }
                    if (i == 1001) {
                        C1783850wWN c1783850wWN2 = c1dk1LJIIL.LIZIZ;
                        C23250099c.LIZLLL(c1783850wWN2.LIZ, null, null, new C1783810wWJ(c1783850wWN2, C0N6K.RENDER_CREATED, null), 3);
                        return;
                    }
                    if (i == VEInfo.TE_RECORD_INFO_ENGINE_START) {
                        c1dk1LJIIL.LIZIZ().LJIIL().LJIJJ();
                        c1dk1LJIIL.LIZIZ().LJIIL().LJJ("CreationID", ((InterfaceC2253701DIy) c1dk1LJIIL.LJ.getValue()).getCreationId());
                        C1783850wWN c1783850wWN3 = c1dk1LJIIL.LIZIZ;
                        C23250099c.LIZLLL(c1783850wWN3.LIZ, null, null, new C1783800wWI(c1783850wWN3, C0N6K.PREVIEW_STARTED, EnumC1778630wNx.SUCCESS, null), 3);
                        c1dk1LJIIL.LJIIIIZZ.setValue(Boolean.TRUE);
                        return;
                    }
                    if (i != VEInfo.TE_RECORD_INFO_ENGINE_PAUSE && i != VEInfo.TE_RECORD_INFO_ENGINE_STOP) {
                        if (i == VEInfo.TE_INFO_PREVIEW_FIRST_FRAME_SCREEN) {
                            c1dk1LJIIL.LIZLLL.onEvent(C2253481DIc.LIZ);
                            return;
                        } else {
                            if (i != 1050) {
                                return;
                            }
                            c1dk1LJIIL.LIZLLL.onEvent(new AbstractC2253581DIm() { // from class: X.1DIr
                            });
                            return;
                        }
                    }
                    C1783850wWN c1783850wWN4 = c1dk1LJIIL.LIZIZ;
                    C23250099c.LIZLLL(c1783850wWN4.LIZ, null, null, new C1783810wWJ(c1783850wWN4, C0N6K.PREVIEW_STARTED, null), 3);
                    c1dk1LJIIL.LJIIIIZZ.setValue(Boolean.FALSE);
                }
            });
            Float fInvoke = c1867970yi3.LIZ.invoke();
            int[] iArrInvoke = c1867970yi3.LIZIZ.invoke();
            boolean zBooleanValue = c1867970yi3.LIZJ.invoke().booleanValue();
            VEVideoEncodeSettings vEVideoEncodeSettingsLIZJ = c1dk1LJIIL.LIZJ(z2, fInvoke, iArrInvoke);
            VEPreviewSettings vEPreviewSettingsLIZ = c1dk1LJIIL.LIZJ.LIZ(zBooleanValue);
            if (!((Boolean) C280560Az8.LIZ.getValue()).booleanValue()) {
                c1dk1LJIIL.LIZIZ().LJIIL().LJII();
            }
            c1dk1LJIIL.LIZIZ().LIZIZ.LJJIJIL = true;
            C2484209oO.LJI("TERecorderBase", "attach VEAudioCapture from other");
            c1dk1LJIIL.LIZIZ().LJJIIZ(new InterfaceC1464200oCo() { // from class: X.144C
                @Override // X.InterfaceC1464200oCo
                public final void onCallback(int i, int i2, float f, String str2) {
                    if (i == VEInfo.TE_RECORD_INFO_RECORDING_CLIP_TIMESTAMP) {
                        long j = (long) (f / LSPassThroughRecordSizeConfig.DEFAULT);
                        AnonymousClass1446 anonymousClass1446 = c1dk1LJIIL.LJIIJ;
                        if (anonymousClass1446 != null) {
                            anonymousClass1446.LIZJ(j);
                        }
                    }
                }
            });
            c1dk1LJIIL.LIZIZ().LJIILIIL(null, vEVideoEncodeSettingsLIZJ, new VEAudioEncodeSettings.Builder().Build(), vEPreviewSettingsLIZ, false);
            c1dk1LJIIL.LIZIZ().LJIIL().LJI(true);
            c1dk1LJIIL.LJIIJJI = true;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("enableAudioCapture=");
            sbLIZ.append(z);
            sbLIZ.append(" enable1V1PreviewSize=");
            sbLIZ.append(z2);
            c1dk1LJIIL.LJ("init", C2188811AlT.LIZIZ(sbLIZ));
        }
    }
}
