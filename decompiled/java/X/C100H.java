package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.compliance.api.services.communication.TTKUserCommunicationService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.pns.gatekeeper.api.IGatekeeperService;
import com.ss.android.ugc.aweme.pns.gatekeeper.api.tools.PNSGKToolItem;
import com.ss.android.ugc.aweme.pns.usercommunication.api.NetworkUniversalPopupDispatchResponse;
import com.ss.android.ugc.aweme.pns.usercommunication.api.UserCommunicationProcessorModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Pair;
import kotlin.jvm.internal.AwS112S1000000_28;

/* JADX INFO: renamed from: X.100H, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C100H implements InterfaceC593820NQu {
    public static final C100H LIZ = new C100H();
    public static final ReentrantLock LIZIZ = new ReentrantLock();
    public static final Map<String, C100I> LIZJ = new LinkedHashMap();
    public static final Map<String, Object> LIZLLL = new LinkedHashMap();

    @Override // X.InterfaceC593820NQu
    public final void LIZIZ() {
    }

    @Override // X.InterfaceC593820NQu
    public final void onReset() {
        ReentrantLock reentrantLock = LIZIZ;
        reentrantLock.lock();
        try {
            LIZ.getClass();
            IGatekeeperService iGatekeeperService = (IGatekeeperService) ServiceManager.get().getService(IGatekeeperService.class);
            Map<String, C100I> map = LIZJ;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
                if (((C100I) entry.getValue()).LJFF == C100K.UID) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            Set setLLIIJI = C13LP.LLIIJI(linkedHashMap.keySet());
            Set setEntrySet = ((LinkedHashMap) LIZLLL).entrySet();
            ArrayList<Map.Entry> arrayList = new ArrayList();
            for (Object obj : setEntrySet) {
                if (setLLIIJI.contains(((Map.Entry) obj).getKey())) {
                    arrayList.add(obj);
                }
            }
            for (Map.Entry entry2 : arrayList) {
                if (iGatekeeperService != null) {
                    iGatekeeperService.LIZLLL(entry2.getValue());
                }
            }
            ((LinkedHashMap) LIZLLL).keySet().removeAll(setLLIIJI);
            Map<String, C100I> map2 = LIZJ;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry3 : ((LinkedHashMap) map2).entrySet()) {
                if (((C100I) entry3.getValue()).LJFF == C100K.DID) {
                    linkedHashMap2.put(entry3.getKey(), entry3.getValue());
                }
            }
            Map<String, C100I> map3 = LIZJ;
            int size = map3.size() - linkedHashMap2.size();
            ((LinkedHashMap) map3).clear();
            map3.putAll(linkedHashMap2);
            C100C.LIZ.LIZJ().LIZ("notification_tool_reset", C2097608Jq.LJIIIIZZ(new Pair("cleared", String.valueOf(size)), new Pair("kept_did", String.valueOf(linkedHashMap2.size())), new Pair("triggers_active", String.valueOf(LIZLLL.size()))));
            reentrantLock.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // X.InterfaceC593820NQu
    public final void LIZJ(List<PNSGKToolItem> list) {
        C1174004iY c1174004iYLJIIJ;
        ReentrantLock reentrantLock = LIZIZ;
        reentrantLock.lock();
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator<PNSGKToolItem> it2 = list.iterator();
            int i = 0;
            int i2 = 0;
            while (it2.hasNext()) {
                C100I c100iLIZ = C100J.LIZ(it2.next());
                if (c100iLIZ == null) {
                    i++;
                } else {
                    if (linkedHashMap.containsKey(c100iLIZ.LIZ)) {
                        C100C.LIZ.LIZJ().LIZ("notification_tool_dup_signal", C2097908Jt.LIZJ(new Pair("signal", c100iLIZ.LIZ)));
                    }
                    if (c100iLIZ.LJII) {
                        i2++;
                    }
                    linkedHashMap.put(c100iLIZ.LIZ, c100iLIZ);
                }
            }
            LIZ.getClass();
            IGatekeeperService iGatekeeperService = (IGatekeeperService) ServiceManager.get().getService(IGatekeeperService.class);
            for (Object obj : ((LinkedHashMap) LIZLLL).values()) {
                if (iGatekeeperService != null) {
                    iGatekeeperService.LIZLLL(obj);
                }
            }
            ((LinkedHashMap) LIZLLL).clear();
            Map<String, C100I> map = LIZJ;
            ((LinkedHashMap) map).clear();
            map.putAll(linkedHashMap);
            int i3 = 0;
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                String str = (String) entry.getKey();
                Map<String, Object> map2 = ((C100I) entry.getValue()).LJI;
                if (map2 != null && iGatekeeperService != null && (c1174004iYLJIIJ = iGatekeeperService.LJIIJ(map2, new AwS112S1000000_28(str, 11))) != null && LIZJ.containsKey(str)) {
                    LIZLLL.put(str, c1174004iYLJIIJ);
                    i3++;
                }
            }
            C100C.LIZ.LIZJ().LIZ("notification_tool_data_received", C2097608Jq.LJIIIIZZ(new Pair("received", String.valueOf(list.size())), new Pair("decoded", String.valueOf(linkedHashMap.size())), new Pair("decode_failed", String.valueOf(i)), new Pair("triggers_active", String.valueOf(LIZLLL.size())), new Pair("triggers_installed", String.valueOf(i3)), new Pair("dry_run_count", String.valueOf(i2))));
            reentrantLock.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // X.InterfaceC593820NQu
    public final void LIZ(String str, Map<String, ? extends Object> map) {
        Object obj;
        UserCommunicationProcessorModel userCommunicationProcessorModel;
        ReentrantLock reentrantLock = LIZIZ;
        reentrantLock.lock();
        try {
            Map<String, C100I> map2 = LIZJ;
            C100I c100i = (C100I) ((LinkedHashMap) map2).get(str);
            if (c100i != null && !c100i.LJ) {
                map2.remove(str);
                Object objRemove = LIZLLL.remove(str);
                if (objRemove != null) {
                    LIZ.getClass();
                    IGatekeeperService iGatekeeperService = (IGatekeeperService) ServiceManager.get().getService(IGatekeeperService.class);
                    if (iGatekeeperService != null) {
                        iGatekeeperService.LIZLLL(objRemove);
                    }
                }
            }
            reentrantLock.unlock();
            if (map != null) {
                obj = map.get("trigger_source");
            } else {
                obj = null;
            }
            if (!(obj instanceof String) || obj == null) {
                obj = "external";
            }
            if (c100i == null) {
                C100C.LIZ.LIZJ().LIZ("notification_tool_signal_miss", C2097608Jq.LJIIIIZZ(new Pair("signal", str), new Pair("trigger_source", obj)));
                return;
            }
            C100C c100c = C100C.LIZ;
            c100c.LIZJ().LIZ("notification_tool_signal_hit", C2097608Jq.LJIIIIZZ(new Pair("signal", str), new Pair("action_type", c100i.LIZIZ.getRaw()), new Pair("persistent", String.valueOf(c100i.LJ)), new Pair("scope", c100i.LJFF.getRaw()), new Pair("trigger_source", obj), new Pair("dry_run", String.valueOf(c100i.LJII))));
            int i = C100N.LIZ[c100i.LIZIZ.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    if (c100i.LJII) {
                        c100c.LIZJ().LIZ("notification_tool_dispatch_blocked", C2097608Jq.LJIIIIZZ(new Pair("signal", c100i.LIZ), new Pair("action_type", "toast"), new Pair("reason", "dry_run")));
                        return;
                    } else {
                        c100c.LIZJ().LIZ("notification_tool_toast_received", C2097908Jt.LIZJ(new Pair("signal", c100i.LIZ)));
                        return;
                    }
                }
                throw new C1954807lC();
            }
            int i2 = C100O.LIZ[c100i.LIZJ.ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    userCommunicationProcessorModel = new UserCommunicationProcessorModel("PopupAPIProcessor", c100i.LIZLLL, null);
                } else {
                    throw new C1954807lC();
                }
            } else {
                try {
                    C1227904rF.LIZ.getClass();
                    NetworkUniversalPopupDispatchResponse networkUniversalPopupDispatchResponse = (NetworkUniversalPopupDispatchResponse) C1227904rF.LIZLLL().LJII(c100i.LIZLLL, NetworkUniversalPopupDispatchResponse.class);
                    if (networkUniversalPopupDispatchResponse != null) {
                        userCommunicationProcessorModel = new UserCommunicationProcessorModel("PopupShowProcessorLocal", networkUniversalPopupDispatchResponse, null);
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                C100C.LIZ.LIZJ().LIZ("notification_tool_drop", C2097608Jq.LJIIIIZZ(new Pair("reason", "bad_inline_payload"), new Pair("signal", c100i.LIZ)));
                return;
            }
            C13DA c13da = new C13DA();
            if (map != null) {
                c13da.putAll(map);
            }
            c13da.put("enter_from", "notification_tool");
            c13da.put("signal", c100i.LIZ);
            Map mapBuild = c13da.build();
            if (c100i.LJII) {
                C100C.LIZ.LIZJ().LIZ("notification_tool_dispatch_blocked", C2097608Jq.LJIIIIZZ(new Pair("signal", c100i.LIZ), new Pair("action_type", "popup"), new Pair("params_type", c100i.LIZJ.getRaw()), new Pair("reason", "dry_run")));
                return;
            }
            TTKUserCommunicationService tTKUserCommunicationService = (TTKUserCommunicationService) ServiceManager.get().getService(TTKUserCommunicationService.class);
            if (tTKUserCommunicationService != null && tTKUserCommunicationService.LJI() != null) {
                C1518550pcT.LJI(userCommunicationProcessorModel, null, mapBuild);
            }
            C100C.LIZ.LIZJ().LIZ("notification_tool_popup_dispatched", C2097608Jq.LJIIIIZZ(new Pair("signal", c100i.LIZ), new Pair("mode", c100i.LIZJ.getRaw())));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            reentrantLock.unlock();
            throw th;
        }
    }
}
