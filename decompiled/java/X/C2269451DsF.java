package X;

import android.app.Application;
import com.bef.effectsdk.EffectSDKBuildConfig;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.modeo.IModeoInit;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import java.util.List;
import kotlin.jvm.functions.Function0;
import lth.o;

/* JADX INFO: renamed from: X.1DsF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2269451DsF extends C09AY implements Function0<C1465060oEC> {
    public C2269451DsF() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0oEC] */
    @Override // kotlin.jvm.functions.Function0
    public final C1465060oEC invoke() {
        return new InterfaceC194362112i() { // from class: X.0oEC
            @Override // X.InterfaceC194362112i
            public final C1455880nzO LIZ() {
                return new C1455880nzO(0);
            }

            @Override // X.InterfaceC194362112i
            public final int LIZIZ() {
                return C0CLW.LIZIZ.LIZ.getEditEffectAutoDownloadSize().intValue();
            }

            @Override // X.InterfaceC194362112i
            public final List<String> LIZJ() {
                return C0CLW.LIZIZ.LIZ.getFilterColors();
            }

            @Override // X.InterfaceC194362112i
            public final String LIZLLL() {
                Application application = o.LIZ;
                ((IModeoInit) ServiceManager.get().getService(IModeoInit.class)).LIZIZ();
                C0CHQ.LIZ().isDebugConfigOpen();
                return "142710f02c3a11e8b42429f14557854a";
            }

            @Override // X.InterfaceC194362112i
            public final String getEffectSDKVersion() {
                CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
                if (creativeToolsPluginService != null) {
                    C844470XAv.LIZ.getClass();
                    if (creativeToolsPluginService.LJI(C844470XAv.LIZ())) {
                        return o.LIZIZ();
                    }
                }
                return EffectSDKBuildConfig.getSdkVersion();
            }
        };
    }
}
