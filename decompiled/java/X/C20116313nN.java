package X;

import com.bytedance.ies.bullet.service.base.IResourceLoaderService;
import com.bytedance.ies.bullet.service.base.resourceloader.config.GeckoConfig;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.13nN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20116313nN {
    public static final /* synthetic */ int LIZJ = 0;
    public final C1533580q0i LIZ = new C1533580q0i(C1697810uHb.LJIILJJIL(""), new GeckoConfig("", "", new InterfaceC20117113nV() { // from class: X.13nQ
        @Override // X.InterfaceC20117113nV
        public final void LIZIZ() {
        }

        @Override // X.InterfaceC20117113nV
        public final void LIZJ() {
        }

        @Override // X.InterfaceC20117113nV
        public final void LIZLLL() {
        }
    }, true, false), new Object() { // from class: X.13nT
    });
    public final Map<IResourceLoaderService, C1533580q0i> LIZIZ = new LinkedHashMap();

    public final C1533580q0i LIZ(IResourceLoaderService iResourceLoaderService) {
        C1533580q0i c1533580q0i = (C1533580q0i) ((LinkedHashMap) this.LIZIZ).get(iResourceLoaderService);
        if (c1533580q0i == null) {
            return this.LIZ;
        }
        return c1533580q0i;
    }
}
