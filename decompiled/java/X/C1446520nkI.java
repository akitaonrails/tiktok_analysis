package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.commerce.InteractiveBrandedEffectInfo;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;

/* JADX INFO: renamed from: X.0nkI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1446520nkI {
    public static final C1446520nkI LIZ = new C1446520nkI();

    public static InteractiveBrandedEffectInfo LIZ(TimeSpeedModelExtension timeSpeedModelExtension) {
        try {
            return (InteractiveBrandedEffectInfo) C0CHQ.LIZ().getNetworkService().getRetrofitFactoryGson().LJIIIIZZ((String) timeSpeedModelExtension.getFromRecordExtras("extra_key_ibe_info"), new TypeToken<InteractiveBrandedEffectInfo>() { // from class: X.0nkJ
            }.getType());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
