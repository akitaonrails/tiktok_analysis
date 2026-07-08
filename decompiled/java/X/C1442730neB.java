package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.property.bytebench.FuncSwitchByteBenchStrategy;

/* JADX INFO: renamed from: X.0neB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1442730neB implements InterfaceC1442780neG {
    public static final /* synthetic */ C1442730neB LJIILLIIL = new C1442730neB();
    public final /* synthetic */ InterfaceC1442780neG LJIILL;

    @Override // X.InterfaceC1442780neG
    public final boolean enableDefaultOpenHDSwitch() {
        return this.LJIILL.enableDefaultOpenHDSwitch();
    }

    @Override // X.InterfaceC1442780neG
    public final boolean enableImportHD() {
        return this.LJIILL.enableImportHD();
    }

    @Override // X.InterfaceC1442780neG
    public final boolean enableRecordHD() {
        return this.LJIILL.enableRecordHD();
    }

    @Override // X.InterfaceC1442780neG
    public final boolean showHDButton() {
        return this.LJIILL.showHDButton();
    }

    public C1442730neB() {
        InterfaceC1442780neG interfaceC1442780neG;
        C212350188e c212350188eLIZJ = C212350188e.LIZJ();
        C844470XAv.LIZ.getClass();
        C09GA c09gaLIZIZ = c212350188eLIZJ.LIZIZ(C844470XAv.LJIIJ);
        this.LJIILL = (c09gaLIZIZ == null || (interfaceC1442780neG = (InterfaceC1442780neG) c09gaLIZIZ.LJII(FuncSwitchByteBenchStrategy.class)) == null) ? new InterfaceC1442780neG() { // from class: X.0neE
            static {
                C1440300naG.LIZ("FuncSwitchByteBenchApi -> use DefaultApi");
            }

            @Override // X.InterfaceC1442780neG
            public final boolean enableDefaultOpenHDSwitch() {
                SettingsManager.LIZLLL().getClass();
                return SettingsManager.LIZ("enable_default_open_hd_video_switch", false);
            }

            @Override // X.InterfaceC1442780neG
            public final boolean enableImportHD() {
                SettingsManager.LIZLLL().getClass();
                return SettingsManager.LIZ("avtools_enable_hd_import_resolution", false);
            }

            @Override // X.InterfaceC1442780neG
            public final boolean enableRecordHD() {
                SettingsManager.LIZLLL().getClass();
                return SettingsManager.LIZ("avtools_enable_hd_record_resolution", false);
            }

            @Override // X.InterfaceC1442780neG
            public final boolean showHDButton() {
                SettingsManager.LIZLLL().getClass();
                return SettingsManager.LIZ("enable_high_quality_video", false);
            }
        } : interfaceC1442780neG;
    }
}
