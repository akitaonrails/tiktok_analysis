package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.smartcheck.core.SmartCheckSettingModel;

/* JADX INFO: renamed from: X.17vn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21187717vn {
    public static final SmartCheckSettingModel LIZ = new SmartCheckSettingModel(C1697810uHb.LJIILJJIL("/api/v1/shop/product_info/get"), new SmartCheckSettingModel.DebugConfig("c_a0f8c6f5459d42a18fb6", "e579d7bcd2fe481c9fc03a268aaedfd9", false, false, "oc_8a173bae70bf1b98f6be393b830260f0", 50, EnumC21187117vh.WARNING.getValue(), false), false, C1697810uHb.LJIILJJIL("://ec/"), C1697810uHb.LJIILJJIL("ec/pdp"));

    public static final SmartCheckSettingModel LIZ() {
        try {
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            SmartCheckSettingModel smartCheckSettingModel = LIZ;
            SmartCheckSettingModel smartCheckSettingModel2 = (SmartCheckSettingModel) settingsManagerLIZLLL.LJIIIIZZ("smart_check_setting", SmartCheckSettingModel.class, smartCheckSettingModel);
            return smartCheckSettingModel2 != null ? smartCheckSettingModel2 : smartCheckSettingModel;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C21187917vp c21187917vp = C21187917vp.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setting: ");
            sbLIZ.append(th);
            C2188811AlT.LIZIZ(sbLIZ);
            C21187917vp.LIZ(c21187917vp, null, 6);
            return LIZ;
        }
    }
}
