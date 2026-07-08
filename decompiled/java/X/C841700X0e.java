package X;

import com.bytedance.helios.api.config.AgControlConfig;
import com.bytedance.helios.api.config.NetworkConfig;
import com.bytedance.helios.api.config.SettingsModel;
import com.ss.android.ugc.aweme.legoImp.task.pumbaa.settings.AgConfig;
import com.ss.android.ugc.aweme.legoImp.task.pumbaa.settings.BostonConfig;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0X0e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C841700X0e extends C09AY implements Function0<SettingsModel> {
    public C841700X0e() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final SettingsModel invoke() {
        SettingsModel settingsModel = C840830Wyf.LIZ;
        SettingsModel settingsModel2 = C840830Wyf.LIZ;
        SettingsModel settingsModel3 = (SettingsModel) C308480C7i.LIZLLL(SettingsModel.class, "helios_settings", settingsModel2);
        if (settingsModel3 != null) {
            settingsModel2 = settingsModel3;
        }
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "pumbaa_use_oldarch_ag_control_obj_config", true, false)) {
            AgConfig agConfig = (AgConfig) C841720X0g.LIZIZ.getValue();
            AgConfig agConfig2 = (AgConfig) C841710X0f.LIZIZ.getValue();
            String str = agConfig2.version;
            if (str != null && Intrinsics.LJFF(str, agConfig.version)) {
                AgControlConfig agControlConfig = agConfig2.realConfig;
                AgControlConfig agControlConfig2 = agConfig.realConfig;
                agControlConfig.agControlEnable = agControlConfig2.agControlEnable;
                agControlConfig.reportOnlyWhenBlock = agControlConfig2.reportOnlyWhenBlock;
                agControlConfig.agControlStrategyEnable = agControlConfig2.agControlStrategyEnable;
                settingsModel2.networkConfig.agControlConfig = agControlConfig;
            }
        } else {
            settingsModel2.networkConfig.agControlConfig = (AgControlConfig) C841690X0d.LIZIZ.getValue();
        }
        BostonConfig bostonConfig = (BostonConfig) C841740X0i.LIZIZ.getValue();
        if (bostonConfig == null) {
            bostonConfig = C841740X0i.LIZ;
        }
        NetworkConfig networkConfig = settingsModel2.networkConfig;
        networkConfig.autoIsolateFor3rd = bostonConfig.autoIsolateFor3rd;
        networkConfig.autoIsolateForAll3rd = bostonConfig.autoIsolateForAll3rd;
        networkConfig.autoIsolateFor1stCDN = bostonConfig.autoIsolateFor1stCDN;
        return settingsModel2;
    }
}
