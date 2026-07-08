package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.property.bytebench.ResolutionByteBenchStrategy;

/* JADX INFO: renamed from: X.0ndn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1442490ndn implements InterfaceC1442520ndq {
    public static final /* synthetic */ C1442490ndn LJIILLIIL = new C1442490ndn();
    public final /* synthetic */ InterfaceC1442520ndq LJIILL;

    @Override // X.InterfaceC1442520ndq
    public final int compileVideoSizeIndex() {
        return this.LJIILL.compileVideoSizeIndex();
    }

    @Override // X.InterfaceC1442520ndq
    public final int hdCompileVideoSizeIndex() {
        return this.LJIILL.hdCompileVideoSizeIndex();
    }

    @Override // X.InterfaceC1442520ndq
    public final String previewDowngradeSupportTab() {
        return this.LJIILL.previewDowngradeSupportTab();
    }

    @Override // X.InterfaceC1442520ndq
    public final int staticVideoSizeIndex() {
        return this.LJIILL.staticVideoSizeIndex();
    }

    @Override // X.InterfaceC1442520ndq
    public final int uploadVideoSizeIndex() {
        return this.LJIILL.uploadVideoSizeIndex();
    }

    @Override // X.InterfaceC1442520ndq
    public final String veCameraPreviewSize() {
        return this.LJIILL.veCameraPreviewSize();
    }

    @Override // X.InterfaceC1442520ndq
    public final int videoSizeIndex() {
        return this.LJIILL.videoSizeIndex();
    }

    public C1442490ndn() {
        InterfaceC1442520ndq interfaceC1442520ndq;
        C212350188e c212350188eLIZJ = C212350188e.LIZJ();
        C844470XAv.LIZ.getClass();
        C09GA c09gaLIZIZ = c212350188eLIZJ.LIZIZ(C844470XAv.LJIIJ);
        this.LJIILL = (c09gaLIZIZ == null || (interfaceC1442520ndq = (InterfaceC1442520ndq) c09gaLIZIZ.LJII(ResolutionByteBenchStrategy.class)) == null) ? new InterfaceC1442520ndq() { // from class: X.0ndT
            @Override // X.InterfaceC1442520ndq
            public final String previewDowngradeSupportTab() {
                return null;
            }

            static {
                C1440300naG.LIZ("ResolutionByteBenchApi -> use DefaultApi");
            }

            @Override // X.InterfaceC1442520ndq
            public final int compileVideoSizeIndex() {
                return C0C64.LJIILLIIL().LJIJ(31744, 99, "compile_video_size_index", true);
            }

            @Override // X.InterfaceC1442520ndq
            public final int hdCompileVideoSizeIndex() {
                SettingsManager.LIZLLL().getClass();
                return SettingsManager.LJ("high_quality_compile_video_size_index", 99);
            }

            @Override // X.InterfaceC1442520ndq
            public final int staticVideoSizeIndex() {
                return C0C64.LJIILLIIL().LJIJ(31744, 0, "video_size_index", true);
            }

            @Override // X.InterfaceC1442520ndq
            public final int uploadVideoSizeIndex() {
                return C0C64.LJIILLIIL().LJIJ(31744, 0, "upload_video_size_index", true);
            }

            @Override // X.InterfaceC1442520ndq
            public final String veCameraPreviewSize() {
                return C0C64.LJIILLIIL().LJJ(31744, "ve_camera_preview_size", "", true);
            }

            @Override // X.InterfaceC1442520ndq
            public final int videoSizeIndex() {
                return C0C64.LJIILLIIL().LJIJ(31744, 0, "video_size_index", true);
            }
        } : interfaceC1442520ndq;
    }
}
