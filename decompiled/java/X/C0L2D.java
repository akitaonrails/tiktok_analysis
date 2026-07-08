package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AwS188S0000000_3;

/* JADX INFO: renamed from: X.0L2D, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0L2D extends AbstractC2255721DQs<C05YF> implements C05YF, C0F1U, InterfaceC379610EuV {
    public static final C0L2E LLILZ = new Object() { // from class: X.0L2E
    };
    public static final AtomicBoolean LLILZIL = new AtomicBoolean(false);
    public static volatile C0L2D LLILZLL;
    public final C1DRG LL;
    public final C05YF LLILLJJLI = this;
    public final InterfaceC497601wk LLILLL = C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C0PEM.LIZJ));

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        if (LLILZLL == this) {
            LLILZLL = null;
        }
        super.onDestroy();
    }

    public final void W1() {
        if (C0L2G.LIZJ()) {
            C0L2G.LIZ.getClass();
            if (C0L2G.LIZIZ().preloadVeNleAfterAlbumFirstFrameEnabled && LLILZIL.compareAndSet(false, true)) {
                CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
                if (creativeToolsPluginService != null) {
                    C844470XAv.LIZ.getClass();
                    if (!creativeToolsPluginService.LJI(C844470XAv.LIZ())) {
                        return;
                    }
                }
                C01TT.LIZLLL(new AwS188S0000000_3(this, 0));
                C23250099c.LIZLLL(this.LLILLL, null, null, new C2194208ii(null), 3);
            }
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        LLILZLL = this;
    }

    @Override // X.AbstractC2255721DQs
    public C05YF getApiComponent() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C0L2D(C1DRG c1drg) {
        this.LL = c1drg;
    }
}
