package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.airemix.api.ICreationAIRemixCardService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsBizPluginService;

/* JADX INFO: renamed from: X.15bL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20551315bL {
    public static final /* synthetic */ C20551315bL LIZ = new C20551315bL();

    public static ICreationAIRemixCardService LIZ() {
        CreativeToolsBizPluginService.LIZ.getClass();
        CreativeToolsBizPluginService creativeToolsBizPluginServiceLIZ = C0LOV.LIZ();
        if (creativeToolsBizPluginServiceLIZ != null && !creativeToolsBizPluginServiceLIZ.LIZ()) {
            return new ICreationAIRemixCardService() { // from class: X.14f6
                @Override // com.ss.android.ugc.airemix.api.ICreationAIRemixCardService
                public final C0TRR LIZ() {
                    return null;
                }

                @Override // com.ss.android.ugc.airemix.api.ICreationAIRemixCardService
                public final Object LIZJ(InterfaceC691450RAh interfaceC691450RAh) {
                    return null;
                }

                @Override // com.ss.android.ugc.airemix.api.ICreationAIRemixCardService
                public final View LIZIZ(Context context) {
                    return new View(context);
                }
            };
        }
        ICreationAIRemixCardService iCreationAIRemixCardService = (ICreationAIRemixCardService) PluggableExtentionKt.pluggableSpiForReal(ICreationAIRemixCardService.class);
        return iCreationAIRemixCardService == null ? new ICreationAIRemixCardService() { // from class: X.14f6
            @Override // com.ss.android.ugc.airemix.api.ICreationAIRemixCardService
            public final C0TRR LIZ() {
                return null;
            }

            @Override // com.ss.android.ugc.airemix.api.ICreationAIRemixCardService
            public final Object LIZJ(InterfaceC691450RAh interfaceC691450RAh) {
                return null;
            }

            @Override // com.ss.android.ugc.airemix.api.ICreationAIRemixCardService
            public final View LIZIZ(Context context) {
                return new View(context);
            }
        } : iCreationAIRemixCardService;
    }
}
