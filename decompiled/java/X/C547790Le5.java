package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.portrait.service.IAIPortraitFeatureService;
import com.ss.android.ugc.aweme.portrait.service.dummy.DummyAIPortraitFeatureServiceImpl;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsBizPluginService;

/* JADX INFO: renamed from: X.0Le5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C547790Le5 {
    public static final /* synthetic */ C547790Le5 LIZ = new C547790Le5();

    public static IAIPortraitFeatureService LIZ() {
        CreativeToolsBizPluginService.LIZ.getClass();
        CreativeToolsBizPluginService creativeToolsBizPluginServiceLIZ = C0LOV.LIZ();
        return (creativeToolsBizPluginServiceLIZ == null || creativeToolsBizPluginServiceLIZ.LIZ()) ? (IAIPortraitFeatureService) PluggableExtentionKt.pluggableSpiForReal(IAIPortraitFeatureService.class) : DummyAIPortraitFeatureServiceImpl.LJIIIZ;
    }
}
