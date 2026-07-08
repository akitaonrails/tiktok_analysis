package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.tools.draft.ab.DraftManagementConfigModel;

/* JADX INFO: renamed from: X.0M1h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C561710M1h {
    public static final DraftManagementConfigModel LIZ = new DraftManagementConfigModel(100, 10, 3, 1, 5, 3, 500, 3, 10);

    public static final DraftManagementConfigModel LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        DraftManagementConfigModel draftManagementConfigModel = LIZ;
        DraftManagementConfigModel draftManagementConfigModel2 = (DraftManagementConfigModel) settingsManagerLIZLLL.LJIIIIZZ("studio_draft_management_config", DraftManagementConfigModel.class, draftManagementConfigModel);
        return draftManagementConfigModel2 != null ? draftManagementConfigModel2 : draftManagementConfigModel;
    }
}
