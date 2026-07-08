package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.legoImp.task.region.RegionSdkConfigModel;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0wtO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1798120wtO extends C09AY implements Function0<RegionSdkConfigModel> {
    public C1798120wtO() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.legoImp.task.region.RegionSdkConfigModel, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final RegionSdkConfigModel invoke() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        RegionSdkConfigModel regionSdkConfigModel = C1798110wtN.LIZ;
        ?? LJIIIIZZ = settingsManagerLIZLLL.LJIIIIZZ("region_sdk_config", RegionSdkConfigModel.class, regionSdkConfigModel);
        return LJIIIIZZ != 0 ? LJIIIIZZ : regionSdkConfigModel;
    }
}
