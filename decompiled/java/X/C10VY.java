package X;

import com.bytedance.keva.KevaImpl;
import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;

/* JADX INFO: renamed from: X.10VY, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10VY implements InterfaceC19256010Va {
    public final /* synthetic */ InterfaceC19256010Va LIZ;

    @Override // X.InterfaceC19256010Va
    public final void LIZIZ() {
    }

    public C10VY(C0X53 c0x53) {
        this.LIZ = c0x53;
    }

    @Override // X.InterfaceC19256010Va
    public final void LIZ(String str, boolean z) {
        IComplianceSettingsService iComplianceSettingsService = (IComplianceSettingsService) PluggableExtentionKt.pluggableSpi$default(IComplianceSettingsService.class, false, false, false, 14, null);
        if (iComplianceSettingsService != null) {
            iComplianceSettingsService.LJJI(true);
        }
        PopupManager.LIZJ(C1917070zzF.class);
        InterfaceC19256010Va interfaceC19256010Va = this.LIZ;
        if (interfaceC19256010Va != null) {
            interfaceC19256010Va.LIZ(str, z);
        }
        KevaImpl.getRepo("age_gate", 1).storeInt("age_gate_status", EnumC1778640wNy.COMPLETED.ordinal());
    }
}
