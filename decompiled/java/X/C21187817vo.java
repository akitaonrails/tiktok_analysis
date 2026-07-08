package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommerce.ab.SmartCheckSettingModelV2;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.17vo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21187817vo {
    public static final SmartCheckSettingModelV2 LIZ = new SmartCheckSettingModelV2(new SmartCheckSettingModelV2.SmartCheckSwitch(false, false, false), C1697810uHb.LJIILJJIL("/api/v1/shop/product_info/get"), new SmartCheckSettingModelV2.SchemaConfig(new ArrayList(), new ArrayList()), new SmartCheckSettingModelV2.RuleConfig(""), new SmartCheckSettingModelV2.VmSdkConfig(null, null, null, null), new SmartCheckSettingModelV2.PlatformConfig("c_a0f8c6f5459d42a18fb6", "e579d7bcd2fe481c9fc03a268aaedfd9", false, false), new SmartCheckSettingModelV2.DebugConfig(false, true, false, true, "oc_8a173bae70bf1b98f6be393b830260f0", 50), C1697810uHb.LJIILJJIL("://ec/"));

    public static final SmartCheckSettingModelV2 LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        SmartCheckSettingModelV2 smartCheckSettingModelV2 = LIZ;
        SmartCheckSettingModelV2 smartCheckSettingModelV22 = (SmartCheckSettingModelV2) settingsManagerLIZLLL.LJIIIIZZ("smart_check_setting_merge", SmartCheckSettingModelV2.class, smartCheckSettingModelV2);
        return smartCheckSettingModelV22 != null ? smartCheckSettingModelV22 : smartCheckSettingModelV2;
    }
}
