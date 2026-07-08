package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.theater.downgrade.AITheaterProfilePluginNotInstalledServiceImpl;
import com.ss.android.ugc.aweme.theater.service.AITheaterProfileService;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsBizPluginService;

/* JADX INFO: renamed from: X.0M7j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C563290M7j {
    public static final /* synthetic */ C563290M7j LIZ = new C563290M7j();
    public static final C563310M7l LIZIZ = new InterfaceC563350M7p() { // from class: X.0M7l
        @Override // X.InterfaceC563350M7p
        public final String LIZ() {
            return null;
        }

        @Override // X.InterfaceC563350M7p
        public final String LIZIZ() {
            return null;
        }

        @Override // X.InterfaceC563350M7p
        public final boolean LIZJ() {
            return false;
        }

        @Override // X.InterfaceC563350M7p
        public final String LIZLLL() {
            return null;
        }
    };

    public static AITheaterProfileService LIZ() {
        CreativeToolsBizPluginService.LIZ.getClass();
        CreativeToolsBizPluginService creativeToolsBizPluginServiceLIZ = C0LOV.LIZ();
        return (creativeToolsBizPluginServiceLIZ == null || creativeToolsBizPluginServiceLIZ.LIZ()) ? (AITheaterProfileService) PluggableExtentionKt.pluggableSpiForReal(AITheaterProfileService.class) : AITheaterProfilePluginNotInstalledServiceImpl.LIZIZ;
    }
}
