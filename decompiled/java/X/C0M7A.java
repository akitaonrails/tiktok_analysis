package X;

import com.ss.android.ugc.airemix.api.service.cameocheck.IAIRemixCameoPermissionService;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsBizPluginService;
import java.util.List;

/* JADX INFO: renamed from: X.0M7A, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0M7A {
    public static final /* synthetic */ C0M7A LIZ = new C0M7A();

    public static IAIRemixCameoPermissionService LIZ() {
        CreativeToolsBizPluginService.LIZ.getClass();
        CreativeToolsBizPluginService creativeToolsBizPluginServiceLIZ = C0LOV.LIZ();
        if (creativeToolsBizPluginServiceLIZ != null && !creativeToolsBizPluginServiceLIZ.LIZ()) {
            return new IAIRemixCameoPermissionService() { // from class: X.0M7F
                @Override // com.ss.android.ugc.airemix.api.service.cameocheck.IAIRemixCameoPermissionService
                public final C0M7D LIZ(String str, String str2, List list) {
                    C0M7D.LIZ.getClass();
                    return C0M7E.LIZ(list);
                }
            };
        }
        IAIRemixCameoPermissionService iAIRemixCameoPermissionService = (IAIRemixCameoPermissionService) C0WYG.LIZ(IAIRemixCameoPermissionService.class, "com.ss.android.ugc.airemix.impl.service.cameocheck.AIRemixCameoPermissionServiceImpl");
        return iAIRemixCameoPermissionService == null ? new IAIRemixCameoPermissionService() { // from class: X.0M7F
            @Override // com.ss.android.ugc.airemix.api.service.cameocheck.IAIRemixCameoPermissionService
            public final C0M7D LIZ(String str, String str2, List list) {
                C0M7D.LIZ.getClass();
                return C0M7E.LIZ(list);
            }
        } : iAIRemixCameoPermissionService;
    }
}
