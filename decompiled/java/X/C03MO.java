package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommerce.core.ab.OspPreviewConfigModel;

/* JADX INFO: renamed from: X.03MO, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03MO {
    public static final OspPreviewConfigModel LIZ = new OspPreviewConfigModel(null);

    public static final OspPreviewConfigModel LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        OspPreviewConfigModel ospPreviewConfigModel = LIZ;
        OspPreviewConfigModel ospPreviewConfigModel2 = (OspPreviewConfigModel) settingsManagerLIZLLL.LJIIIIZZ("osp_preview_config", OspPreviewConfigModel.class, ospPreviewConfigModel);
        return ospPreviewConfigModel2 != null ? ospPreviewConfigModel2 : ospPreviewConfigModel;
    }
}
