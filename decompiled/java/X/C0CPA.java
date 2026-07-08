package X;

import android.text.TextUtils;
import com.bytedance.keva.KevaImpl;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.setting.hateful.HateFulConfig;

/* JADX INFO: renamed from: X.0CPA, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CPA {
    static {
        C844470XAv.LIZ.getClass();
        C844470XAv.LIZ().getString(2131847197);
        C844470XAv.LIZ().getString(2131847198);
    }

    public static void LIZ(HateFulConfig hateFulConfig) {
        if (hateFulConfig == null) {
            return;
        }
        try {
            if (!TextUtils.isEmpty(hateFulConfig.hateSpeech) && !TextUtils.isEmpty(hateFulConfig.link)) {
                String str = hateFulConfig.hateSpeech;
                C844470XAv c844470XAv = C844470XAv.LIZ;
                c844470XAv.getClass();
                KevaImpl.getRepoFromSp(C844470XAv.LIZ(), "HateFulPreferences", 0).storeString("hate_speech", str);
                String str2 = hateFulConfig.link;
                c844470XAv.getClass();
                KevaImpl.getRepoFromSp(C844470XAv.LIZ(), "HateFulPreferences", 0).storeString("hate_link", str2);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("HateFulPreferences getSP failed ");
            sbLIZ.append(th.getMessage());
            C2344809Gs.LJ(C2188811AlT.LIZIZ(sbLIZ));
        }
    }
}
