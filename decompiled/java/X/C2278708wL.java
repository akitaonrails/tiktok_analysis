package X;

import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.gamora.editor.mixediting.resource.feature.cache.AlgorithmResult;
import java.util.HashMap;

/* JADX INFO: renamed from: X.08wL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2278708wL {
    public final HashMap<String, AlgorithmResult> LIZ = new HashMap<>();
    public final C13SF LIZIZ = new C13SF(C0CHQ.LIZ().LJJIIJZLJL().getPathService().LJIIL(new CreativeInfo("featureExtraction", 0, null, 6, null), C0MI0.FEATURE_EXTRACTION_RESULT, "bachCache", false).getAbsolutePath(), ((IMainService) ServiceManager.get().getService(IMainService.class)).getAppVersionCode(), 1, (C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_bach_result_cache_max_count", true) * 1024) * 1024, null, false, null);
}
