package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.theater.downgrade.AITheaterPluginNotInstalledFeatureServiceImpl;
import com.ss.android.ugc.aweme.theater.service.IAITheaterFeatureService;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsBizPluginService;

/* JADX INFO: renamed from: X.0LhC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C549720LhC {
    public static final /* synthetic */ C549720LhC LIZ = new C549720LhC();

    public static IAITheaterFeatureService LIZ() {
        CreativeToolsBizPluginService.LIZ.getClass();
        CreativeToolsBizPluginService creativeToolsBizPluginServiceLIZ = C0LOV.LIZ();
        return (creativeToolsBizPluginServiceLIZ == null || creativeToolsBizPluginServiceLIZ.LIZ()) ? (IAITheaterFeatureService) PluggableExtentionKt.pluggableSpiForReal(IAITheaterFeatureService.class) : AITheaterPluginNotInstalledFeatureServiceImpl.LJFF;
    }
}
