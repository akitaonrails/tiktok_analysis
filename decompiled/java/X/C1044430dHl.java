package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.aweme.commwecialize.ba.settings.LeadgenAioClientConfigModel;

/* JADX INFO: renamed from: X.0dHl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1044430dHl {
    public static final LeadgenAioClientConfigModel LIZ;

    static {
        new C1044430dHl();
        LIZ = new LeadgenAioClientConfigModel(false, "", "");
    }

    public static final LeadgenAioClientConfigModel LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        LeadgenAioClientConfigModel leadgenAioClientConfigModel = LIZ;
        LeadgenAioClientConfigModel leadgenAioClientConfigModel2 = (LeadgenAioClientConfigModel) settingsManagerLIZLLL.LJIIIIZZ("leadgen_aio_client_config", LeadgenAioClientConfigModel.class, leadgenAioClientConfigModel);
        return leadgenAioClientConfigModel2 != null ? leadgenAioClientConfigModel2 : leadgenAioClientConfigModel;
    }
}
