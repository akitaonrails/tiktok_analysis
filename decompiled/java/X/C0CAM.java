package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.google.gson.k;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ml.model.PreloadStrategyV2Config;

/* JADX INFO: renamed from: X.0CAM, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CAM {
    public static boolean LIZ;
    public static PreloadStrategyV2Config LIZIZ;
    public static n LIZJ;

    public static PreloadStrategyV2Config LIZ() {
        if (!LIZ) {
            LIZ = true;
            n nVar = (n) C0C64.LJIILLIIL().LJJII(n.class, null, "smart_preload_strategy_v2", false);
            LIZJ = nVar;
            if (nVar != null) {
                LIZIZ = (PreloadStrategyV2Config) GsonProtectorUtils.fromJson(new Gson(), (k) LIZJ, PreloadStrategyV2Config.class);
            }
        }
        return LIZIZ;
    }
}
