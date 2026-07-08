package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.property.bytebench.ExternalSettingByteBenchStrategy;

/* JADX INFO: renamed from: X.0neC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1442740neC implements InterfaceC1442790neH {
    public static final /* synthetic */ C1442740neC LJIILLIIL = new C1442740neC();
    public final /* synthetic */ InterfaceC1442790neH LJIILL;

    @Override // X.InterfaceC1442790neH
    public final String compileExternalSettings() {
        return this.LJIILL.compileExternalSettings();
    }

    @Override // X.InterfaceC1442790neH
    public final String hdCompileExternalSettings() {
        return this.LJIILL.hdCompileExternalSettings();
    }

    @Override // X.InterfaceC1442790neH
    public final String importExternalSettings() {
        return this.LJIILL.importExternalSettings();
    }

    public C1442740neC() {
        InterfaceC1442790neH interfaceC1442790neH;
        C212350188e c212350188eLIZJ = C212350188e.LIZJ();
        C844470XAv.LIZ.getClass();
        C09GA c09gaLIZIZ = c212350188eLIZJ.LIZIZ(C844470XAv.LJIIJ);
        this.LJIILL = (c09gaLIZIZ == null || (interfaceC1442790neH = (InterfaceC1442790neH) c09gaLIZIZ.LJII(ExternalSettingByteBenchStrategy.class)) == null) ? new InterfaceC1442790neH() { // from class: X.0neD
            static {
                C1440300naG.LIZ("ExternalSettingByteBenchApi -> use DefaultApi");
            }

            @Override // X.InterfaceC1442790neH
            public final String compileExternalSettings() {
                return C0C64.LJIILLIIL().LJJ(31744, "ve_synthesis_settings", "", true);
            }

            @Override // X.InterfaceC1442790neH
            public final String hdCompileExternalSettings() {
                SettingsManager.LIZLLL().getClass();
                return SettingsManager.LJI("high_quality_ve_synthesis_settings", "");
            }

            @Override // X.InterfaceC1442790neH
            public final String importExternalSettings() {
                SettingsManager.LIZLLL().getClass();
                return SettingsManager.LJI("import_compile_external_settings", "");
            }
        } : interfaceC1442790neH;
    }
}
