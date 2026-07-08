package X;

import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.pns.universalpopup.core.model.UniversalPopupAction;
import com.ss.android.ugc.tiktok.ban.IUserBanDepService;
import com.ss.android.ugc.tiktok.ban.UserBanAppealStatusResponse;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS156S0400000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zzo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1917420zzo implements InterfaceC1519250pdb {
    public static final C1917420zzo LIZ = new C1917420zzo();
    public static Map<String, ? extends Object> LIZIZ;
    public static Map<String, String> LIZJ;
    public static Map<String, String> LIZLLL;
    public static List<? extends Map<String, String>> LJ;
    public static boolean LJFF;
    public static long LJI;

    static {
        new UserBanAppealStatusResponse(-1, -1, 0L, -1, null, null, null, null, null, null, "");
        LIZIZ = C2097608Jq.LJ();
        LIZJ = C2097608Jq.LJ();
        LIZLLL = C2097608Jq.LJ();
        LJ = C13BV.INSTANCE;
    }

    @Override // X.InterfaceC1519250pdb
    public final InterfaceC1519200pdW LIZ() {
        return new InterfaceC1519200pdW() { // from class: X.0zuX
            @Override // X.InterfaceC1519200pdW
            public final void LIZ() {
            }

            @Override // X.InterfaceC1519200pdW
            public final void LIZIZ(Map map, AwS156S0400000_28 awS156S0400000_28) {
                awS156S0400000_28.invoke();
            }
        };
    }

    @Override // X.InterfaceC1519250pdb
    public final InterfaceC1914220zue LIZJ() {
        return new InterfaceC1914220zue() { // from class: X.0zzp
            @Override // X.InterfaceC1914220zue
            public final void LIZIZ(String str, C1519370pdn c1519370pdn) {
            }

            @Override // X.InterfaceC1914220zue
            public final void LIZJ(Boolean bool, String str) {
            }

            @Override // X.InterfaceC1914220zue
            public final void LIZLLL() {
                PopupManager.LIZJ(C1917410zzn.class);
                IUserBanDepService.LIZ.getClass();
                if (C1519390pdp.LIZ().LIZ()) {
                    C100C c100c = C100C.LIZ;
                    c100c.LJI().LJFF();
                    c100c.LJI().LIZIZ();
                }
                C1917420zzo.LJFF = false;
            }

            @Override // X.InterfaceC1914220zue
            public final void LIZ(C1519370pdn c1519370pdn) {
                if (!C1917420zzo.LJFF) {
                    return;
                }
                C1917420zzo.LJFF = false;
                AnonymousClass1000 anonymousClass1000LIZ = AnonymousClass1006.LIZ();
                InterfaceC1917440zzq interfaceC1917440zzq = anonymousClass1000LIZ.LIZJ;
                if (interfaceC1917440zzq != null) {
                    interfaceC1917440zzq.onDismiss();
                }
                ((LinkedHashMap) anonymousClass1000LIZ.LIZLLL).clear();
                ((LinkedHashMap) anonymousClass1000LIZ.LJ).clear();
                IUserBanDepService.LIZ.getClass();
                C1519390pdp.LIZ().logout();
            }

            @Override // X.InterfaceC1914220zue
            public final void LJFF(C1519370pdn c1519370pdn) {
                C1917420zzo.LJFF = true;
                C1917420zzo.LJI = System.currentTimeMillis();
                Map<String, String> map = C1917420zzo.LIZJ;
                InterfaceC1519030pdF interfaceC1519030pdFLIZ = C1876900ywS.LIZ();
                if (interfaceC1519030pdFLIZ != null) {
                    interfaceC1519030pdFLIZ.LIZ("pns_ban_show", map);
                }
                Map<String, String> map2 = C1917420zzo.LIZLLL;
                InterfaceC1519030pdF interfaceC1519030pdFLIZ2 = C1876900ywS.LIZ();
                if (interfaceC1519030pdFLIZ2 != null) {
                    interfaceC1519030pdFLIZ2.LIZJ("pns_ban_show", null, map2, map2);
                }
                for (Map<String, String> map3 : C1917420zzo.LJ) {
                    InterfaceC1519030pdF interfaceC1519030pdFLIZ3 = C1876900ywS.LIZ();
                    if (interfaceC1519030pdFLIZ3 != null) {
                        interfaceC1519030pdFLIZ3.LIZ("pns_ban_action_show", map3);
                    }
                }
                IUserBanDepService.LIZ.getClass();
                if (C1519390pdp.LIZ().LIZ() && Intrinsics.LJFF(C1917420zzo.LIZJ.get("ban_type"), "ban_type_session_ban")) {
                    C1518580pcW c1518580pcW = C1518580pcW.LIZ;
                    C100C c100c = C100C.LIZ;
                    c100c.LJI().LIZLLL();
                    c100c.LJI().LIZ(c1518580pcW);
                }
            }

            @Override // X.InterfaceC1914220zue
            public final void LJ(UniversalPopupAction universalPopupAction, C1519370pdn c1519370pdn) {
                try {
                    IUserBanDepService.LIZ.getClass();
                    LinkedHashMap linkedHashMap = new LinkedHashMap((Map) C1519390pdp.LIZ().getGson().LJIIIIZZ(universalPopupAction.extra, Map.class));
                    linkedHashMap.put("stay_time", String.valueOf(System.currentTimeMillis() - C1917420zzo.LJI));
                    InterfaceC1519030pdF interfaceC1519030pdFLIZ = C1876900ywS.LIZ();
                    if (interfaceC1519030pdFLIZ != null) {
                        interfaceC1519030pdFLIZ.LIZ("pns_ban_action_click", linkedHashMap);
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        };
    }

    @Override // X.InterfaceC1519250pdb
    public final Map<String, String> LIZIZ() {
        return C2097608Jq.LJ();
    }
}
