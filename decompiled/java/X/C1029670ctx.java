package X;

import android.content.Context;
import android.os.Bundle;
import com.ss.android.ugc.aweme.spark.AdSparkContext;
import com.ss.android.ugc.aweme.spark.AdSparkUtils;
import com.ss.android.ugc.aweme.spark.IAdSparkUtils;

/* JADX INFO: renamed from: X.0ctx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1029670ctx {
    public final Context LIZ;
    public final String LIZIZ;

    public C1029670ctx(Context context, String str) {
        this.LIZ = context;
        this.LIZIZ = str;
    }

    public final SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LIZ(String str, Bundle bundle, AbstractC1024610cln abstractC1024610cln, boolean z) {
        AdSparkContext adSparkContextLIZJ;
        IAdSparkUtils iAdSparkUtilsLJFF = AdSparkUtils.LJFF();
        if (iAdSparkUtilsLJFF != null && (adSparkContextLIZJ = iAdSparkUtilsLJFF.LIZJ(this.LIZ, str, bundle, null, false)) != null) {
            if (z) {
                adSparkContextLIZJ.LJJL("use_forest", true);
            }
            IAdSparkUtils iAdSparkUtilsLJFF2 = AdSparkUtils.LJFF();
            if (iAdSparkUtilsLJFF2 != null) {
                iAdSparkUtilsLJFF2.LIZLLL(adSparkContextLIZJ, this.LIZIZ);
            }
            adSparkContextLIZJ.LJJLJ(abstractC1024610cln);
            C1537900q7g c1537900q7g = C1541950qED.LIZJ;
            Context context = this.LIZ;
            c1537900q7g.getClass();
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ = new C1541950qED(context, adSparkContextLIZJ).LIZ(false);
            adSparkContextLIZJ.LJJ(C1029700cu0.class, new C1029700cu0(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ));
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ.LJJIJ(adSparkContextLIZJ);
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ.LJIIIIZZ();
            return sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ;
        }
        return null;
    }
}
