package X;

import com.bytedance.android.livesdk.comp.api.network.INetworkService;
import com.bytedance.android.livesdk.internal.Live;
import java.util.Map;

/* JADX INFO: renamed from: X.14db, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public class C20310514db {
    public static final C20310614dc LIZ = new InterfaceC486620J6m() { // from class: X.14dc
        @Override // X.InterfaceC486620J6m
        public final boolean LJIIJJI() {
            String strI0 = i0();
            if ("live_tab_single".equals(strI0) || "live_tab_double".equals(strI0) || Live.getLiteService() == null) {
                return false;
            }
            return Live.getLiteService().Eo();
        }

        @Override // X.InterfaceC486620J6m
        public final void LJIIL() {
            if (Live.getLiteService() == null) {
                return;
            }
            Live.getLiteService().Zg();
        }

        @Override // X.InterfaceC486620J6m
        public final void P4() {
            if (Live.getLiteService() == null) {
                return;
            }
            Live.getLiteService().P4();
        }

        @Override // X.InterfaceC486620J6m
        public final String i0() {
            return Live.getLiteService() == null ? "" : Live.getLiteService().i0();
        }

        @Override // X.InterfaceC486620J6m
        public final void v3() {
            if (Live.getLiteService() == null) {
                return;
            }
            Live.getLiteService().v3();
        }

        @Override // X.InterfaceC486620J6m
        public final void LJIIJ(Map<String, String> map) {
            INetworkService iNetworkService = (INetworkService) C1161920gLG.LIZJ(INetworkService.class);
            if (iNetworkService != null) {
                iNetworkService.Co1(map);
            }
        }
    };
}
