package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ogccampaign.OgcLynxActivityItem;
import com.ss.android.ugc.aweme.ogccampaign.OgcLynxCache;
import com.ss.android.ugc.aweme.ogccampaign.OgcLynxConfig;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.01VO, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01VO extends AbstractC1538690q8x {
    public static volatile boolean LIZIZ;

    @Override // X.AbstractC1538690q8x
    public final String LJI() {
        return "ogc_lynx_initial_data_load_scene";
    }

    @Override // X.AbstractC1538690q8x
    public final void LJ(SparkContext sparkContext, String str) {
        Object c098200Yq;
        OgcLynxCache.CacheEntry cacheEntryLIZIZ;
        super.LJ(sparkContext, str);
        if (sparkContext.get("ogc_lynx_initial_data") != null || sparkContext.get("copyright_promotion_entity_info") != null) {
            return;
        }
        try {
            c098200Yq = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(sparkContext.LJIJI()), "activity_id");
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        OgcLynxActivityItem ogcLynxActivityItem = null;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        String str2 = (String) c098200Yq;
        int i = 0;
        if (str2 != null && !a0.LJJJIL(str2)) {
            Iterator<OgcLynxActivityItem> it2 = ((OgcLynxConfig) C01VR.LIZIZ.getValue()).lynxActivities.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                OgcLynxActivityItem next = it2.next();
                if (Intrinsics.LJFF(next.activityId, str2)) {
                    ogcLynxActivityItem = next;
                    break;
                }
            }
            OgcLynxActivityItem ogcLynxActivityItem2 = ogcLynxActivityItem;
            int iLIZ = C0XK4.LIZ();
            if (ogcLynxActivityItem2 != null) {
                if (ogcLynxActivityItem2.endTime <= iLIZ) {
                    return;
                } else {
                    i = ogcLynxActivityItem2.cacheTtl;
                }
            } else {
                OgcLynxCache.LIZ.getClass();
                OgcLynxCache.CacheEntry cacheEntryLIZIZ2 = OgcLynxCache.LIZIZ(str2);
                if (cacheEntryLIZIZ2 == null || cacheEntryLIZIZ2.cacheTtlSec == null) {
                    return;
                }
            }
            OgcLynxCache.LIZ.getClass();
            if (!OgcLynxCache.LIZLLL(i, str2) || (cacheEntryLIZIZ = OgcLynxCache.LIZIZ(str2)) == null) {
                return;
            }
            sparkContext.LJJLIIIJ(cacheEntryLIZIZ.responseJson, "ogc_lynx_initial_data");
            C01VP.LIZ.getClass();
            C20684815ws.LJIILLIIL("music_ogc_lynx_initial_data", C01VP.LIZ("data_injected", str2).LIZ);
        }
    }
}
