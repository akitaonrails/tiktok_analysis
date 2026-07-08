package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.im.core.api.experiment.IMReadReceiptOptimizationSettingModel;

/* JADX INFO: renamed from: X.0YFf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C871090YFf {
    public static final IMReadReceiptOptimizationSettingModel LIZ = new IMReadReceiptOptimizationSettingModel(false, 3, 20, true, 20, 10, true);

    public static final IMReadReceiptOptimizationSettingModel LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        IMReadReceiptOptimizationSettingModel iMReadReceiptOptimizationSettingModel = LIZ;
        IMReadReceiptOptimizationSettingModel iMReadReceiptOptimizationSettingModel2 = (IMReadReceiptOptimizationSettingModel) settingsManagerLIZLLL.LJIIIIZZ("im_read_receipt_optimization_setting", IMReadReceiptOptimizationSettingModel.class, iMReadReceiptOptimizationSettingModel);
        return iMReadReceiptOptimizationSettingModel2 != null ? iMReadReceiptOptimizationSettingModel2 : iMReadReceiptOptimizationSettingModel;
    }
}
