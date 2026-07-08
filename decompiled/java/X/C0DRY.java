package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.history.model.AdWebHistorySettingModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DRY, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DRY {
    public static final /* synthetic */ int LIZ = 0;

    public static int LIZ(String str) {
        Integer num;
        SettingsManager.LIZLLL().getClass();
        String strLJI = SettingsManager.LJI("iab_history_record_count", "{\"ad\": 1,\"history\": 1}");
        try {
            C1227904rF.LIZ.getClass();
            AdWebHistorySettingModel adWebHistorySettingModel = (AdWebHistorySettingModel) C1227904rF.LIZIZ(strLJI, AdWebHistorySettingModel.class);
            if (Intrinsics.LJFF(str, "ad")) {
                Integer num2 = adWebHistorySettingModel.ad;
                if (num2 != null) {
                    return num2.intValue();
                }
                return 1;
            }
            if (Intrinsics.LJFF(str, "history") && (num = adWebHistorySettingModel.history) != null) {
                return num.intValue();
            }
            return 1;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
            return 1;
        }
    }
}
