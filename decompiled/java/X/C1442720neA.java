package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.property.bytebench.PhotoMVByteBenchStrategy;

/* JADX INFO: renamed from: X.0neA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1442720neA implements InterfaceC1442770neF {
    public static final /* synthetic */ C1442720neA LJIILLIIL = new C1442720neA();
    public final /* synthetic */ InterfaceC1442770neF LJIILL;

    @Override // X.InterfaceC1442770neF
    public final boolean enableMvBindingHDSwitch() {
        return this.LJIILL.enableMvBindingHDSwitch();
    }

    @Override // X.InterfaceC1442770neF
    public final boolean enableSynthesisMvTo1080p() {
        return this.LJIILL.enableSynthesisMvTo1080p();
    }

    @Override // X.InterfaceC1442770neF
    public final int mvDynamicResolutionStrategy() {
        return this.LJIILL.mvDynamicResolutionStrategy();
    }

    @Override // X.InterfaceC1442770neF
    public final int mvFastImportStrategy() {
        return this.LJIILL.mvFastImportStrategy();
    }

    @Override // X.InterfaceC1442770neF
    public final String mvSynthesisSettingsFor1080p() {
        return this.LJIILL.mvSynthesisSettingsFor1080p();
    }

    public C1442720neA() {
        InterfaceC1442770neF interfaceC1442770neF;
        C212350188e c212350188eLIZJ = C212350188e.LIZJ();
        C844470XAv.LIZ.getClass();
        C09GA c09gaLIZIZ = c212350188eLIZJ.LIZIZ(C844470XAv.LJIIJ);
        this.LJIILL = (c09gaLIZIZ == null || (interfaceC1442770neF = (InterfaceC1442770neF) c09gaLIZIZ.LJII(PhotoMVByteBenchStrategy.class)) == null) ? new InterfaceC1442770neF() { // from class: X.0ne9
            static {
                C1440300naG.LIZ("MvAndCanvasByteBenchApi -> use DefaultApi");
            }

            @Override // X.InterfaceC1442770neF
            public final boolean enableMvBindingHDSwitch() {
                return C0C64.LJIILLIIL().LJIIIZ(31744, "mv_enable_binding_hd_switch", true, false);
            }

            @Override // X.InterfaceC1442770neF
            public final boolean enableSynthesisMvTo1080p() {
                SettingsManager.LIZLLL().getClass();
                return SettingsManager.LIZ("enable_1080p_photo_to_video", false);
            }

            @Override // X.InterfaceC1442770neF
            public final int mvDynamicResolutionStrategy() {
                return C0C64.LJIILLIIL().LJIJ(31744, 0, "tool_photo_to_video_resolution_strategy", true);
            }

            @Override // X.InterfaceC1442770neF
            public final int mvFastImportStrategy() {
                return C0C64.LJIILLIIL().LJIJ(31744, 0, "mv_photo_resize_strategy", true);
            }

            @Override // X.InterfaceC1442770neF
            public final String mvSynthesisSettingsFor1080p() {
                SettingsManager.LIZLLL().getClass();
                return SettingsManager.LJI("avtools_1080p_mv_photo_ve_synthesis_settings", "");
            }
        } : interfaceC1442770neF;
    }
}
