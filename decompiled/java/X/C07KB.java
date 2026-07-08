package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ab.ECSearchMixOptConfig;

/* JADX INFO: renamed from: X.07KB, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07KB {
    public static final ECSearchMixOptConfig LIZ = new ECSearchMixOptConfig(0, 0, 0, 0, 0, Boolean.FALSE, Boolean.FALSE);

    public static ECSearchMixOptConfig LIZ() {
        Object c098200Yq;
        try {
            c098200Yq = (ECSearchMixOptConfig) C0C64.LJIILLIIL().LJJII(ECSearchMixOptConfig.class, LIZ, "ec_mix_shop_search_opt_config", true);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        ECSearchMixOptConfig eCSearchMixOptConfig = (ECSearchMixOptConfig) c098200Yq;
        return eCSearchMixOptConfig == null ? LIZ : eCSearchMixOptConfig;
    }
}
