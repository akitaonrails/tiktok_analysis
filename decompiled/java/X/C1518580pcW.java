package X;

import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0pcW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1518580pcW implements InterfaceC1519080pdK, InterfaceC160100jP {
    public static final C1518580pcW LIZ = new C1518580pcW();
    public static final String[] LIZIZ = {"app_log", "app_log_test", "monitor/collect", "monitor/appmonitor", "/src/server/v5", "/gkx/api/resource/v6", "/gkx/api/combine/v3", "/gurd/api/settings", "gecko", "src/server/v2/combine/check", "/obj/tiktok-teko-sg", "/teko/api/settings/v1"};

    @Override // X.InterfaceC160100jP
    public final void LIZJ(C159800jM c159800jM) {
    }

    @Override // X.InterfaceC1519080pdK
    public final void LIZIZ(String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str != null) {
            linkedHashMap.put("page_name", str);
        }
        if (str2 != null) {
            linkedHashMap.put("page_url", str2);
        }
        C100C.LIZ.LIZJ().LIZ("tns_ban_ui_transition_monitor_event", linkedHashMap);
    }

    @Override // X.InterfaceC160100jP
    public final void LIZ(C159800jM c159800jM, C112500bj c112500bj, Throwable th) {
        String str = c159800jM.LIZ;
        for (String str2 : LIZIZ) {
            if (!(true ^ a0.LJJIIZI(str, str2, false))) {
                return;
            }
        }
        C100C.LIZ.LIZJ().LIZ("tns_ban_network_monitor_event", C2097908Jt.LIZJ(new Pair("url", str)));
    }
}
