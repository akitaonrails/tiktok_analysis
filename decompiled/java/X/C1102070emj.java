package X;

import Y.AComparatorS36S0000000_17;
import android.os.SystemClock;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.comp.api.logger.service.ILoggerService;
import com.bytedance.android.livesdk.dataChannel.PIPStatusData;
import com.bytedance.android.livesdk.dataChannel.RoomUserChannel;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveEffectNotifyAvoidControlSetting;
import com.bytedance.android.livesdk.model.UserAttr;
import com.bytedance.android.livesdkapi.avoidance.IBusinessAvoidanceService;
import com.bytedance.android.livesdkapi.avoidance.setting.LiveNotifySlardarSampleRateSetting;
import com.bytedance.android.livesdkapi.depend.model.live.MsgNotifyComponentAvoidRuleV2;
import com.bytedance.android.livesdkapi.depend.model.live.NotifyAvoidRule;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.AFwS205S0000000_17;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0emj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1102070emj {
    public static List<MsgNotifyComponentAvoidRuleV2> LJI;
    public static final C1102070emj LIZ = new C1102070emj();
    public static final Map<DataChannel, Map<String, C1102080emk>> LIZIZ = new LinkedHashMap();
    public static final Map<DataChannel, Queue<C1102080emk>> LIZJ = new LinkedHashMap();
    public static final Map<DataChannel, Boolean> LIZLLL = new LinkedHashMap();
    public static final Map<DataChannel, C1097740efk> LJ = new LinkedHashMap();
    public static final C01GW LJFF = C292401Bi.LIZ(AFwS205S0000000_17.get$arr$(100));
    public static final boolean LJII = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isLocalTest();

    public static Map LIZJ(List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            MsgNotifyComponentAvoidRuleV2 msgNotifyComponentAvoidRuleV2 = (MsgNotifyComponentAvoidRuleV2) it2.next();
            Map linkedHashMap2 = (Map) linkedHashMap.get(Integer.valueOf(msgNotifyComponentAvoidRuleV2.componentType));
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
                linkedHashMap.put(Integer.valueOf(msgNotifyComponentAvoidRuleV2.componentType), linkedHashMap2);
            }
            linkedHashMap2.put(Integer.valueOf(msgNotifyComponentAvoidRuleV2.subComponentType), msgNotifyComponentAvoidRuleV2);
        }
        return linkedHashMap;
    }

    public static long LIZLLL(DataChannel dataChannel) {
        C1097740efk c1097740efk;
        Long lValueOf;
        if (dataChannel != null && (c1097740efk = (C1097740efk) ((LinkedHashMap) LJ).get(dataChannel)) != null && (lValueOf = Long.valueOf(c1097740efk.LJII)) != null) {
            return lValueOf.longValue();
        }
        return 0L;
    }

    public static String LJ(DataChannel dataChannel) {
        UserAttr userAttr;
        if (dataChannel != null) {
            if (C500260Jjc.LJIIZILJ(dataChannel)) {
                return "anchor";
            }
            User user = (User) dataChannel.gg0(RoomUserChannel.class);
            if (user != null && (userAttr = user.getUserAttr()) != null && userAttr.isAdmin) {
                return "admin";
            }
            return "viewer";
        }
        return "viewer";
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIIJ(com.bytedance.ies.sdk.datachannel.DataChannel r25) {
        /*
            Method dump skipped, instruction units count: 726
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1102070emj.LJJIIJ(com.bytedance.ies.sdk.datachannel.DataChannel):void");
    }

    public static void LIZIZ(InterfaceC1102120emo interfaceC1102120emo, String str) {
        if (interfaceC1102120emo != null && !interfaceC1102120emo.LJIIJJI()) {
            return;
        }
        C20441214yg.LJ("MsgNotifyLifecycleManager", str);
    }

    public static void LJII(DataChannel dataChannel, InterfaceC1631630sYr interfaceC1631630sYr) throws JSONException {
        C1102250en1.LIZ.getClass();
        List list = (List) ((LinkedHashMap) C1102250en1.LJII).get(dataChannel);
        if (list != null) {
            ArrayList<C1102260en2> arrayList = new ArrayList();
            for (Object obj : list) {
                C1102260en2 c1102260en2 = (C1102260en2) obj;
                if (((Boolean) interfaceC1631630sYr.invoke(Integer.valueOf(c1102260en2.LJIIIIZZ), Integer.valueOf(c1102260en2.LJIIJ), Integer.valueOf(c1102260en2.LJIIL), Integer.valueOf(c1102260en2.LJ))).booleanValue()) {
                    arrayList.add(obj);
                }
            }
            for (C1102260en2 c1102260en22 : arrayList) {
                C1102250en1.LIZ.getClass();
                c1102260en22.LJJI = true;
                C1102250en1.LJIJ("inactivate", c1102260en22);
                c1102260en22.LIZIZ.Yc();
            }
        }
    }

    public static boolean LJIIIZ(DataChannel dataChannel, InterfaceC1631630sYr interfaceC1631630sYr) {
        C1102250en1.LIZ.getClass();
        List<C1102260en2> list = (List) ((LinkedHashMap) C1102250en1.LJII).get(dataChannel);
        if (list == null || list.isEmpty()) {
            return false;
        }
        for (C1102260en2 c1102260en2 : list) {
            if (((Boolean) interfaceC1631630sYr.invoke(Integer.valueOf(c1102260en2.LJIIIIZZ), Integer.valueOf(c1102260en2.LJIIJ), Integer.valueOf(c1102260en2.LJIIL), Integer.valueOf(c1102260en2.LJ))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static void LJIL(DataChannel dataChannel, String str) {
        List list;
        Object next;
        C1102250en1.LIZ.getClass();
        if (dataChannel != null && str != null && (list = (List) ((LinkedHashMap) C1102250en1.LJII).get(dataChannel)) != null) {
            Iterator it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(((C1102260en2) next).LIZ, str)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            C1102260en2 c1102260en2 = (C1102260en2) next;
            if (c1102260en2 != null) {
                c1102260en2.LJJJI++;
                C1102100emm.LIZJ(dataChannel, C1102250en1.LJIIJJI(dataChannel), c1102260en2, "manually_route", null, null);
                C1102250en1.LJIJ("click", c1102260en2);
            }
        }
    }

    public static void LJIIL(DataChannel dataChannel, int i, String str) {
        C1102250en1 c1102250en1 = C1102250en1.LIZ;
        EnumC1097810efr enumC1097810efr = EnumC1097810efr.BIZ;
        c1102250en1.getClass();
        C1102250en1.LJIJJ(dataChannel, str, new C1097750efl(i), enumC1097810efr);
    }

    public static void LJIILLIIL(DataChannel dataChannel, InterfaceC1102150emr interfaceC1102150emr, InterfaceC1102120emo interfaceC1102120emo) {
        Map map;
        C1102080emk c1102080emk;
        if (dataChannel != null && interfaceC1102120emo != null && (map = (Map) ((LinkedHashMap) LIZIZ).get(dataChannel)) != null && (c1102080emk = (C1102080emk) map.get(interfaceC1102120emo.getId())) != null) {
            c1102080emk.LJJI();
            c1102080emk.LJIILLIIL = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x014c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJJIII(com.bytedance.ies.sdk.datachannel.DataChannel r10, X.InterfaceC1102150emr r11, X.InterfaceC1102120emo r12) {
        /*
            Method dump skipped, instruction units count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1102070emj.LJJIII(com.bytedance.ies.sdk.datachannel.DataChannel, X.0emr, X.0emo):void");
    }

    public static List LJJIIJZLJL(DataChannel dataChannel, InterfaceC1631630sYr interfaceC1631630sYr, List list) {
        Iterable<C1102270en3> iterable;
        C1102250en1.LIZ.getClass();
        if (dataChannel != null && (iterable = (Iterable) ((LinkedHashMap) C1102250en1.LJ).get(dataChannel)) != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            List list2 = (List) ((LinkedHashMap) C1102250en1.LJII).get(dataChannel);
            if (list2 != null) {
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((C1102270en3) it2.next()).LJJJIL);
                }
            }
            for (C1102270en3 c1102270en3 : iterable) {
                C1102250en1 c1102250en1 = C1102250en1.LIZ;
                NotifyAvoidRule notifyAvoidRule = c1102270en3.LJJJIL;
                c1102250en1.getClass();
                if (C1102250en1.LIZJ(dataChannel, arrayList2, notifyAvoidRule, interfaceC1631630sYr, list).LIZ && C1102250en1.LJ(dataChannel, c1102270en3.LJJJIL) <= 0) {
                    arrayList.add(new C1088780eRI(c1102270en3.LIZ, c1102270en3.LJIIIIZZ, c1102270en3.LJIIJ, c1102270en3.LJIIL));
                    arrayList2.add(c1102270en3.LJJJIL);
                }
            }
            return arrayList;
        }
        return null;
    }

    public final void LJIIZILJ(DataChannel dataChannel, InterfaceC1102150emr interfaceC1102150emr, InterfaceC1102120emo interfaceC1102120emo) {
        Map map;
        C1102080emk c1102080emk;
        if (dataChannel == null || interfaceC1102150emr == null || interfaceC1102120emo == null || (map = (Map) ((LinkedHashMap) LIZIZ).get(dataChannel)) == null || (c1102080emk = (C1102080emk) map.get(interfaceC1102120emo.getId())) == null || c1102080emk.LJJIII()) {
            return;
        }
        c1102080emk.LJJIIJ();
        LJJIIJ(dataChannel);
    }

    public static void LIZ(DataChannel dataChannel, int i, int i2, InterfaceC1102350enB interfaceC1102350enB) {
        C1102250en1.LIZ.getClass();
        if (dataChannel != null) {
            Map<DataChannel, Map<String, CopyOnWriteArraySet<InterfaceC1102350enB>>> map = C1102250en1.LIZLLL;
            Map<String, CopyOnWriteArraySet<InterfaceC1102350enB>> linkedHashMap = (Map) ((LinkedHashMap) map).get(dataChannel);
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap<>();
                map.put(dataChannel, linkedHashMap);
            }
            String strLJIIIIZZ = C1102250en1.LJIIIIZZ(i, i2);
            CopyOnWriteArraySet<InterfaceC1102350enB> copyOnWriteArraySet = linkedHashMap.get(strLJIIIIZZ);
            if (copyOnWriteArraySet == null) {
                copyOnWriteArraySet = new CopyOnWriteArraySet<>();
                linkedHashMap.put(strLJIIIIZZ, copyOnWriteArraySet);
            }
            copyOnWriteArraySet.add(interfaceC1102350enB);
        }
    }

    public static boolean LJFF(DataChannel dataChannel, int i, int i2, int i3) throws JSONException {
        NotifyAvoidRule notifyAvoidRuleLJIILIIL;
        ArrayList arrayList;
        C1102250en1.LIZ.getClass();
        if (dataChannel == null || (notifyAvoidRuleLJIILIIL = C1102250en1.LJIILIIL(dataChannel, i, i2, i3)) == null) {
            return false;
        }
        if (!notifyAvoidRuleLJIILIIL.timely) {
            if (((List) ((LinkedHashMap) C1102250en1.LJII).get(dataChannel)) != null && (!r0.isEmpty())) {
                C1102250en1.LJIIZILJ(i, i2, i3, dataChannel, "conflict_check", "record_showing");
            } else {
                Iterable iterable = (Iterable) ((LinkedHashMap) C1102250en1.LJ).get(dataChannel);
                if (iterable != null) {
                    for (Object obj : iterable) {
                        C1102270en3 c1102270en3 = (C1102270en3) obj;
                        if (c1102270en3.LIZLLL || c1102270en3.LJJJJ >= notifyAvoidRuleLJIILIIL.priority) {
                            if (obj != null) {
                                C1102250en1.LJIIZILJ(i, i2, i3, dataChannel, "conflict_check", "timely_record_or_higher_or_same_priority_record");
                            }
                        }
                    }
                }
                if (C1102250en1.LJ(dataChannel, notifyAvoidRuleLJIILIIL) > 0) {
                    C1102250en1.LJIIZILJ(i, i2, i3, dataChannel, "conflict_check", "anim_delay");
                }
            }
            return true;
        }
        List list = (List) ((LinkedHashMap) C1102250en1.LJII).get(dataChannel);
        if (list != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(((C1102270en3) it2.next()).LJJJIL);
            }
        } else {
            arrayList = null;
        }
        C1102250en1.LJIIZILJ(i, i2, i3, dataChannel, "conflict_check", C1102250en1.LJFF(C1102250en1.LIZJ(dataChannel, arrayList, notifyAvoidRuleLJIILIIL, null, null).LIZIZ));
        return !r1.LIZ;
    }

    public static boolean LJI(DataChannel dataChannel, int i, int i2, int i3) {
        C1102250en1.LIZ.getClass();
        if (dataChannel != null && C1102250en1.LJIILIIL(dataChannel, i, i2, i3) != null) {
            return true;
        }
        return false;
    }

    public static boolean LJIIIIZZ(DataChannel dataChannel, int i, int i2, int i3) throws JSONException {
        String str;
        C1102250en1.LIZ.getClass();
        boolean z = false;
        if (dataChannel != null) {
            if (!LiveEffectNotifyAvoidControlSetting.enable()) {
                str = "live_effect_notify_avoid_control_enabled is false";
            } else if (C1102250en1.LJIILIIL(dataChannel, i, i2, i3) == null) {
                str = "rule is null";
            } else {
                z = true;
                str = "";
            }
            C1102250en1.LJIIZILJ(i, i2, i3, dataChannel, "availability_check", str);
        }
        return z;
    }

    public static boolean LJJ(DataChannel dataChannel, InterfaceC1102300en6 interfaceC1102300en6, boolean z, InterfaceC1102220emy interfaceC1102220emy) {
        String string;
        String string2;
        String strLIZ;
        C1102250en1.LIZ.getClass();
        if (dataChannel == null) {
            C1102250en1.LIZ(interfaceC1102300en6, dataChannel, "DataChannel is null");
            return true;
        }
        C1097740efk c1097740efkLJIIJJI = C1102250en1.LJIIJJI(dataChannel);
        if (c1097740efkLJIIJJI == null) {
            C1102250en1.LIZ(interfaceC1102300en6, dataChannel, "LiveNotifyContext is null");
            return true;
        }
        if (!LiveEffectNotifyAvoidControlSetting.enable()) {
            C1102250en1.LIZ(interfaceC1102300en6, dataChannel, "switch turned off, live_main_framework_update is false or live_effect_notify_avoid_control_enabled is false");
            return true;
        }
        NotifyAvoidRule notifyAvoidRuleLJIILIIL = C1102250en1.LJIILIIL(dataChannel, interfaceC1102300en6.LJIILJJIL(), interfaceC1102300en6.getBiz(), interfaceC1102300en6.getScene());
        if (notifyAvoidRuleLJIILIIL == null) {
            if (!z) {
                C1102250en1.LIZ(interfaceC1102300en6, dataChannel, "rule is not found from server config or setting");
                return true;
            }
            if (interfaceC1102300en6 instanceof InterfaceC1102060emi) {
                string2 = ((InterfaceC1102060emi) interfaceC1102300en6).getId();
            } else {
                string2 = UUID.randomUUID().toString();
            }
            C1102260en2 c1102260en2 = new C1102260en2(string2, interfaceC1102300en6, dataChannel, c1097740efkLJIIJJI.LJI, true, 0, new ArrayList());
            C1102250en1.LJIJI(dataChannel, c1102260en2);
            C1102250en1.LJIL(dataChannel, c1102260en2);
            if (interfaceC1102220emy != null && (strLIZ = interfaceC1102220emy.LIZ()) != null) {
                C1102330en9 c1102330en9 = new C1102330en9(0, strLIZ, 10);
                EnumC1097810efr enumC1097810efr = EnumC1097810efr.BIZ;
                c1102260en2.LJJIIZI = c1102330en9;
                interfaceC1102300en6.Zc(c1102330en9.LIZIZ);
                C1102250en1.LJIJJ(dataChannel, string2, new C1102180emu(c1102330en9), enumC1097810efr);
                return false;
            }
            C1102250en1.LIZIZ(dataChannel, c1102260en2);
            if (c1102260en2.LJIJI != 0) {
                return true;
            }
            return false;
        }
        if (interfaceC1102300en6 instanceof InterfaceC1102060emi) {
            string = ((InterfaceC1102060emi) interfaceC1102300en6).getId();
        } else {
            string = UUID.randomUUID().toString();
        }
        C1102270en3 c1102270en3 = new C1102270en3(string, interfaceC1102300en6, dataChannel, notifyAvoidRuleLJIILIIL, c1097740efkLJIIJJI.LJI);
        C1102250en1.LJIJI(dataChannel, c1102270en3);
        if (c1102270en3.LJIJ != 0) {
            C1102250en1.LJIJ("duplicate_ready", c1102270en3);
        } else {
            C1102250en1.LJIL(dataChannel, c1102270en3);
            boolean z2 = C1102370enD.LIZ;
            C1102330en9 c1102330en9LIZIZ = C1102370enD.LIZIZ(dataChannel, c1102270en3.LJIIIIZZ, c1102270en3.LJIIJ, c1102270en3.LJIIL);
            if (!c1102330en9LIZIZ.LIZ) {
                EnumC1097810efr enumC1097810efr2 = EnumC1097810efr.FC;
                c1102270en3.LJJIIZI = c1102330en9LIZIZ;
                interfaceC1102300en6.Zc(c1102330en9LIZIZ.LIZIZ);
                C1102250en1.LJIJJ(dataChannel, string, new C1102180emu(c1102330en9LIZIZ), enumC1097810efr2);
            }
            if (c1102330en9LIZIZ.LIZ) {
                Map<DataChannel, Queue<C1102270en3>> map = C1102250en1.LJ;
                Queue<C1102270en3> priorityQueue = (Queue) ((LinkedHashMap) map).get(dataChannel);
                if (priorityQueue == null) {
                    priorityQueue = new PriorityQueue<>(11, new AComparatorS36S0000000_17(7));
                    map.put(dataChannel, priorityQueue);
                }
                priorityQueue.offer(c1102270en3);
                C1102250en1.LJJ(dataChannel);
            } else {
                return false;
            }
        }
        if (c1102270en3.LJIJI != 0) {
            return true;
        }
        return false;
    }

    public static void LJJIIZ(DataChannel dataChannel, int i, int i2, InterfaceC1102350enB interfaceC1102350enB) {
        CopyOnWriteArraySet copyOnWriteArraySet;
        C1102250en1.LIZ.getClass();
        Map map = (Map) ((LinkedHashMap) C1102250en1.LIZLLL).get(dataChannel);
        if (map != null && (copyOnWriteArraySet = (CopyOnWriteArraySet) map.get(C1102250en1.LJIIIIZZ(i, i2))) != null) {
            copyOnWriteArraySet.remove(interfaceC1102350enB);
        }
    }

    public final boolean LJIIJ(DataChannel dataChannel, InterfaceC1102150emr interfaceC1102150emr, InterfaceC1102120emo interfaceC1102120emo, Map<String, String> map) {
        Map map2;
        C1102080emk c1102080emk;
        C1CC3 c1cc3MN2;
        boolean z;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        InterfaceC1102170emt interfaceC1102170emt;
        InterfaceC1102170emt interfaceC1102170emt2;
        if (dataChannel == null || interfaceC1102150emr == null || interfaceC1102120emo == null || (map2 = (Map) ((LinkedHashMap) LIZIZ).get(dataChannel)) == null || (c1102080emk = (C1102080emk) map2.get(interfaceC1102120emo.getId())) == null || c1102080emk.LJJII()) {
            return false;
        }
        boolean zLJJIII = c1102080emk.LJJIII();
        c1102080emk.LJIIZILJ = zLJJIII;
        if (zLJJIII) {
            c1102080emk.LJIJJLI++;
        }
        if (c1102080emk.LJIILJJIL == 0) {
            c1102080emk.LJIILL++;
            c1102080emk.LJIILJJIL = SystemClock.uptimeMillis();
        }
        c1102080emk.LJIILLIIL = false;
        if (c1102080emk.LJIIL != 0) {
            long jUptimeMillis = SystemClock.uptimeMillis() - c1102080emk.LJIIL;
            c1102080emk.LJIILIIL = jUptimeMillis;
            c1102080emk.LJIIJJI += jUptimeMillis;
            c1102080emk.LJIIL = 0L;
        }
        c1102080emk.LJJIFFI().clear();
        c1102080emk.LJJIIJZLJL = null;
        c1102080emk.LJJIIZ = null;
        LinkedHashMap linkedHashMap = (LinkedHashMap) LJ;
        C1102100emm.LIZLLL(dataChannel, (C1097740efk) linkedHashMap.get(dataChannel), c1102080emk, map);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Active ");
        sbLIZ.append(c1102080emk);
        sbLIZ.append('.');
        LIZIZ(interfaceC1102120emo, C2188811AlT.LIZIZ(sbLIZ));
        if (interfaceC1102120emo.LJFF() && AbstractC19994813Le.Default.nextDouble() < LiveNotifySlardarSampleRateSetting.getValue() && (c1cc3MN2 = ((ILoggerService) C1161920gLG.LIZJ(ILoggerService.class)).MN2()) != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("notify_type", c1102080emk.LIZIZ.getKey());
            jSONObject.put("component_type", c1102080emk.LIZJ.getKey());
            jSONObject.put("business_type", interfaceC1102120emo.getBusinessName());
            jSONObject.put("sub_business_type", interfaceC1102120emo.LIZIZ());
            jSONObject.put("component_id", interfaceC1102120emo.LJJJ());
            jSONObject.put("consume_type", interfaceC1102120emo.LIZLLL().getKey());
            LIZ.getClass();
            jSONObject.put("user_type", LJ(dataChannel));
            C1099880ejC c1099880ejCLJIIIZ = interfaceC1102120emo.LJIIIZ();
            if (c1099880ejCLJIIIZ != null && c1099880ejCLJIIIZ.LIZ) {
                z = true;
            } else {
                z = false;
            }
            String str = "1";
            if (z) {
                obj = "1";
            } else {
                obj = CardStruct.IStatusCode.DEFAULT;
            }
            jSONObject.put("has_window_focus", obj);
            jSONObject.put("real_visibility", interfaceC1102120emo.LJIIL());
            if (Intrinsics.LJFF(dataChannel.gg0(PIPStatusData.class), Boolean.TRUE)) {
                obj2 = "1";
            } else {
                obj2 = CardStruct.IStatusCode.DEFAULT;
            }
            jSONObject.put("pip_mode", obj2);
            if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isAppForeground()) {
                obj3 = "1";
            } else {
                obj3 = CardStruct.IStatusCode.DEFAULT;
            }
            jSONObject.put("app_foreground", obj3);
            if (interfaceC1102120emo.LIZJ()) {
                obj4 = "1";
            } else {
                obj4 = CardStruct.IStatusCode.DEFAULT;
            }
            jSONObject.put("is_consume_repeatable", obj4);
            C1107690evn c1107690evn = C464800IKo.LIZ;
            if (c1107690evn.LJI > 0 || c1107690evn.LJIIIIZZ() || c1107690evn.LJFF > 0 || c1107690evn.LJIIIZ()) {
                obj5 = "1";
            } else {
                obj5 = CardStruct.IStatusCode.DEFAULT;
            }
            jSONObject.put("is_sheet_or_popup_showing", obj5);
            C1097740efk c1097740efk = (C1097740efk) linkedHashMap.get(dataChannel);
            if (c1097740efk != null && (interfaceC1102170emt2 = c1097740efk.LIZLLL) != null && interfaceC1102170emt2.LIZ(dataChannel)) {
                obj6 = "1";
            } else {
                obj6 = CardStruct.IStatusCode.DEFAULT;
            }
            jSONObject.put("is_liking", obj6);
            C1097740efk c1097740efk2 = (C1097740efk) linkedHashMap.get(dataChannel);
            if (c1097740efk2 == null || (interfaceC1102170emt = c1097740efk2.LIZLLL) == null || !interfaceC1102170emt.LJ(dataChannel)) {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            jSONObject.put("is_scroll_state_idle", str);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("issue_timestamp", interfaceC1102120emo.LJIIJ());
            jSONObject2.put("duration_from_issue_ms", c1102080emk.LJIIJJI());
            jSONObject2.put("duration_from_enter_ms", c1102080emk.LJIIZILJ());
            jSONObject2.put("avoid_count", c1102080emk.LJIIJ);
            jSONObject2.put("active_count", c1102080emk.LJIILL);
            jSONObject2.put("avoid_duration_ms", c1102080emk.LJIILIIL);
            c1cc3MN2.LJIL("notify_component", "ttlive_livesdk_notify_component_show", jSONObject, jSONObject2, new JSONObject());
        }
        LJJIIJ(dataChannel);
        return true;
    }

    public final void LJIILL(DataChannel dataChannel, InterfaceC1102150emr interfaceC1102150emr, InterfaceC1102120emo interfaceC1102120emo, Set set) {
        Object obj;
        if (dataChannel == null || interfaceC1102150emr == null || interfaceC1102120emo == null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Frequency Controlled ");
        Map map = (Map) ((LinkedHashMap) LIZIZ).get(dataChannel);
        if (map != null) {
            obj = map.get(interfaceC1102120emo.getId());
        } else {
            obj = null;
        }
        sbLIZ.append(obj);
        sbLIZ.append('.');
        LIZIZ(interfaceC1102120emo, C2188811AlT.LIZIZ(sbLIZ));
        LJIILJJIL(this, dataChannel, interfaceC1102150emr, interfaceC1102120emo, C0KAJ.AUTO_CONTROL, null, set, 48);
    }

    public final void LJIJJLI(DataChannel dataChannel, InterfaceC1102150emr interfaceC1102150emr, C1121440fHy c1121440fHy, List list) {
        Map map;
        C1102080emk c1102080emk;
        if (dataChannel != null && interfaceC1102150emr != null && c1121440fHy != null && (map = (Map) ((LinkedHashMap) LIZIZ).get(dataChannel)) != null && (c1102080emk = (C1102080emk) map.get(c1121440fHy.getId())) != null) {
            c1102080emk.LJJIII = list;
            LJIJ(dataChannel, interfaceC1102150emr, c1121440fHy, list, true, null, null, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0131  */
    /* JADX WARN: Type inference failed for: r11v0, types: [X.0emq, X.0evu] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJJI(final com.bytedance.ies.sdk.datachannel.DataChannel r16, X.InterfaceC1102150emr r17, X.InterfaceC1102120emo r18, java.util.Map<java.lang.String, java.lang.String> r19) {
        /*
            Method dump skipped, instruction units count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1102070emj.LJJI(com.bytedance.ies.sdk.datachannel.DataChannel, X.0emr, X.0emo, java.util.Map):boolean");
    }

    public static void LJIJI(C1102070emj c1102070emj, DataChannel dataChannel, InterfaceC1102150emr interfaceC1102150emr, InterfaceC1102120emo interfaceC1102120emo, InterfaceC1096630edx interfaceC1096630edx) {
        C1097740efk c1097740efk;
        List<String> arrayList;
        ArrayList arrayList2;
        Iterable iterableLLIIII;
        c1102070emj.getClass();
        if (dataChannel != null && interfaceC1102150emr != null && interfaceC1102120emo != null && interfaceC1096630edx != null && (c1097740efk = (C1097740efk) ((LinkedHashMap) LJ).get(dataChannel)) != null) {
            Map mapOY1 = ((IBusinessAvoidanceService) C1161920gLG.LIZJ(IBusinessAvoidanceService.class)).oY1(interfaceC1096630edx, dataChannel);
            if (mapOY1 != null) {
                arrayList = new ArrayList<>();
                Iterator it2 = mapOY1.entrySet().iterator();
                while (it2.hasNext()) {
                    Set set = (Set) ((Map.Entry) it2.next()).getValue();
                    if (set == null || (iterableLLIIII = C13LP.LLIIII(set)) == null) {
                        iterableLLIIII = C13BV.INSTANCE;
                    }
                    C19719612Di.LJJI(iterableLLIIII, arrayList);
                }
            } else {
                arrayList = C13BV.INSTANCE;
            }
            List<String> listInvoke = c1097740efk.LIZIZ.invoke(arrayList);
            if (listInvoke != null) {
                arrayList2 = new ArrayList(listInvoke);
                C1107810evz c1107810evz = C1107810evz.LJJIIJZLJL;
                if (arrayList.contains(c1107810evz.LIZ) && arrayList2.contains("LIVE_BOTTOM_SHEET") && C473050Igp.LIZIZ().LIZJ) {
                    ListProtector.set(arrayList2, arrayList2.indexOf("LIVE_BOTTOM_SHEET"), c1107810evz.LIZ);
                }
            } else {
                arrayList2 = null;
            }
            c1102070emj.LJIJ(dataChannel, interfaceC1102150emr, interfaceC1102120emo, arrayList2, false, null, null, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean LJIILJJIL(C1102070emj c1102070emj, DataChannel dataChannel, InterfaceC1102150emr interfaceC1102150emr, InterfaceC1102120emo interfaceC1102120emo, C0KAJ c0kaj, Map map, Set set, int i) {
        boolean z;
        EnumC1100250ejn enumC1100250ejnM;
        Set set2 = set;
        Map map2 = map;
        EnumC1107830ew1 enumC1107830ew1LJIIL = null;
        if ((i & 16) != 0) {
            map2 = null;
        }
        if ((i & 32) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 64) != 0) {
            set2 = null;
        }
        c1102070emj.getClass();
        if (LJII && c0kaj == C0KAJ.AUTO_CONTROL && (set2 == null || set2.isEmpty())) {
            throw new IllegalArgumentException("You must pass frequency control reasons, if it's frequency controlled.");
        }
        if (interfaceC1102150emr != null) {
            enumC1100250ejnM = interfaceC1102150emr.m();
            enumC1107830ew1LJIIL = interfaceC1102150emr.LJIIL();
        } else {
            enumC1100250ejnM = null;
        }
        return c1102070emj.LJIILIIL(dataChannel, enumC1100250ejnM, enumC1107830ew1LJIIL, interfaceC1102120emo, c0kaj, map2, z, set2);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIILIIL(com.bytedance.ies.sdk.datachannel.DataChannel r22, X.EnumC1100250ejn r23, X.EnumC1107830ew1 r24, X.InterfaceC1102120emo r25, X.C0KAJ r26, java.util.Map<java.lang.String, java.lang.String> r27, boolean r28, java.util.Set<java.lang.String> r29) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 623
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1102070emj.LJIILIIL(com.bytedance.ies.sdk.datachannel.DataChannel, X.0ejn, X.0ew1, X.0emo, X.0KAJ, java.util.Map, boolean, java.util.Set):boolean");
    }

    public final void LJIJ(DataChannel dataChannel, InterfaceC1102150emr interfaceC1102150emr, InterfaceC1102120emo interfaceC1102120emo, List<String> list, boolean z, Map<String, String> map, String str, Integer num) {
        Map map2;
        C1102080emk c1102080emk;
        if (dataChannel != null && interfaceC1102150emr != null && interfaceC1102120emo != null && list != null && (map2 = (Map) ((LinkedHashMap) LIZIZ).get(dataChannel)) != null && (c1102080emk = (C1102080emk) map2.get(interfaceC1102120emo.getId())) != null) {
            if (!c1102080emk.LJJIII() || z) {
                c1102080emk.LJJIIJ();
                if (z) {
                    c1102080emk.LJJIFFI().clear();
                    c1102080emk.LJJIIJZLJL = null;
                    c1102080emk.LJJIIZ = null;
                    c1102080emk.LJJIFFI().addAll(list);
                    C08XD.LJIL(c1102080emk.LJJIFFI());
                    c1102080emk.LJJIIJZLJL = str;
                    c1102080emk.LJJIIZ = num;
                }
                C1102100emm.LIZIZ(dataChannel, (C1097740efk) ((LinkedHashMap) LJ).get(dataChannel), c1102080emk, map);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Inactive ");
                sbLIZ.append(c1102080emk);
                sbLIZ.append('.');
                LIZIZ(interfaceC1102120emo, C2188811AlT.LIZIZ(sbLIZ));
                LJJIIJ(dataChannel);
            }
        }
    }
}
