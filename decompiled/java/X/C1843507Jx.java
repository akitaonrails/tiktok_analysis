package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ab.ECSearchFypSeptupleConfig;

/* JADX INFO: renamed from: X.07Jx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1843507Jx {
    public static final ECSearchFypSeptupleConfig LIZ;
    public static final ECSearchFypSeptupleConfig LIZIZ;

    static {
        Object c098200Yq;
        ECSearchFypSeptupleConfig eCSearchFypSeptupleConfig = new ECSearchFypSeptupleConfig(4);
        LIZ = eCSearchFypSeptupleConfig;
        try {
            c098200Yq = (ECSearchFypSeptupleConfig) SettingsManager.LIZLLL().LJIIIIZZ("ecom_search_fyp_septuple", ECSearchFypSeptupleConfig.class, eCSearchFypSeptupleConfig);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        ECSearchFypSeptupleConfig eCSearchFypSeptupleConfig2 = (ECSearchFypSeptupleConfig) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq);
        if (eCSearchFypSeptupleConfig2 == null) {
            eCSearchFypSeptupleConfig2 = LIZ;
        }
        LIZIZ = eCSearchFypSeptupleConfig2;
    }
}
