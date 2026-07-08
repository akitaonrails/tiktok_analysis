package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.ml.infra.FeatureNegFeedBackConfig;
import com.ss.android.ugc.aweme.ml.infra.InputFeaturesConfig;
import com.ss.android.ugc.aweme.ml.infra.SmartSceneConfig;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0pNS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1509240pNS extends C1509180pNM {
    public static final C1509240pNS LIZ = new C1509240pNS();
    public static final ConcurrentHashMap<String, Pair<Aweme, Map<String, Float>>> LIZIZ = new ConcurrentHashMap<>();

    /* JADX WARN: Removed duplicated region for block: B:44:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d7 A[PHI: r4
      0x00d7: PHI (r4v3 float) = (r4v5 float), (r4v6 float) binds: [B:40:0x00a2, B:38:0x009e] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.C1509180pNM
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(X.C1510230pP3 r19, X.C1509310pNZ r20) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1509240pNS.LIZIZ(X.0pP3, X.0pNZ):void");
    }

    public static void LIZJ(C1510230pP3 c1510230pP3, String str, Aweme aweme, C1512100pS4 c1512100pS4) {
        SmartSceneConfig smartSceneConfig;
        InputFeaturesConfig features;
        FeatureNegFeedBackConfig fNegFeedBack;
        Map<String, Float> map;
        if (c1510230pP3 != null && (smartSceneConfig = c1510230pP3.LIZIZ) != null && (features = smartSceneConfig.getFeatures()) != null && (fNegFeedBack = features.getFNegFeedBack()) != null && fNegFeedBack.getEnable()) {
            ConcurrentHashMap<String, Pair<Aweme, Map<String, Float>>> concurrentHashMap = LIZIZ;
            if (aweme != null && c1512100pS4 != null && (map = c1512100pS4.LIZJ) != null) {
                concurrentHashMap.put(str, new Pair<>(aweme, map));
            }
        }
    }
}
