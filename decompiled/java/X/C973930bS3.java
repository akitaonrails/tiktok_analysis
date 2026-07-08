package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bS3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C973930bS3 {
    public static final /* synthetic */ int LIZ = 0;

    public static EnumC973870bRx LIZJ() {
        C981500beG c981500beG;
        int i = C982890bgV.LIZIZ[C915980Zwa.LIZIZ().JV1(false).ordinal()];
        Boolean boolValueOf = null;
        if (i != 1) {
            if (i == 2 || i == 3) {
                return EnumC973870bRx.VICTORY_LAP;
            }
            return null;
        }
        C981480beE c981480beEM91 = C915980Zwa.LIZIZ().M91(false);
        if (c981480beEM91 != null && (c981500beG = c981480beEM91.LJJIJIIJI) != null) {
            boolValueOf = Boolean.valueOf(c981500beG.LJIILIIL);
        }
        return C500260Jjc.LJJJI(boolValueOf) ? EnumC973870bRx.FINAL_CALL : EnumC973870bRx.PERFORMANCE;
    }

    public static long LIZLLL() {
        C981500beG c981500beG;
        List<Long> list;
        Long l;
        C981480beE c981480beEM91 = C915980Zwa.LIZIZ().M91(false);
        if (c981480beEM91 == null || (c981500beG = c981480beEM91.LJJIJIIJI) == null || (list = c981500beG.LJI) == null || (l = (Long) C13LP.LJJJLZIJ(0, list)) == null) {
            return 0L;
        }
        return l.longValue();
    }

    public static boolean LJ() {
        C981500beG c981500beG;
        if (C982890bgV.LIZIZ[C915980Zwa.LIZIZ().JV1(false).ordinal()] != 1) {
            return false;
        }
        C981480beE c981480beEM91 = C915980Zwa.LIZIZ().M91(false);
        return !C500260Jjc.LJJJI((c981480beEM91 == null || (c981500beG = c981480beEM91.LJJIJIIJI) == null) ? null : Boolean.valueOf(c981500beG.LJIILIIL));
    }

    public static void LIZ(Map map) {
        C973690bRf.LIZIZ(map, false);
        map.put("sub_match_type", "take_stage");
        C973660bRc c973660bRc = C973660bRc.LIZ;
        map.put("anchor_id", String.valueOf(C973660bRc.LJJIJLIJ()));
        List<C954460awe> listLLILZLL = C915980Zwa.LJII().LLILZLL(true);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLLILZLL, 10));
        Iterator<C954460awe> it2 = listLLILZLL.iterator();
        while (it2.hasNext()) {
            arrayList.add(Long.valueOf(it2.next().LJ));
        }
        map.put("uid_list", arrayList.toString());
        map.put("invitee_list", C955410ayB.LIZJ(C915980Zwa.LJI().LIZ().LJIILLIIL()));
        C973690bRf.LIZ(map);
    }

    public static void LJFF(String str) {
        String string;
        long jLongValue;
        String str2;
        C981500beG c981500beG;
        List<Long> list;
        Long l;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C981480beE c981480beEM91 = C915980Zwa.LIZIZ().M91(false);
        if (c981480beEM91 == null || (string = Long.valueOf(c981480beEM91.LJIIIZ).toString()) == null) {
            string = "";
        }
        linkedHashMap.put("pk_id", string);
        C981480beE c981480beEM912 = C915980Zwa.LIZIZ().M91(false);
        if (c981480beEM912 != null && (c981500beG = c981480beEM912.LJJIJIIJI) != null && (list = c981500beG.LJI) != null && (l = (Long) C13LP.LJJJLZIJ(0, list)) != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        if (jLongValue == C950220apo.LJ()) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_current_performer", str2);
        linkedHashMap.put("selection", str);
        LIZIZ(linkedHashMap, false);
        C973690bRf.LJJIJIIJIL(12, C973690bRf.LIZ, "livesdk_takestage_final_call_popup_click", linkedHashMap, false);
    }

    public static void LJI(String str) {
        String string;
        Boolean boolValueOf;
        long jLongValue;
        C981500beG c981500beG;
        List<Long> list;
        Long l;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C981480beE c981480beEM91 = C915980Zwa.LIZIZ().M91(false);
        if (c981480beEM91 == null || (string = Long.valueOf(c981480beEM91.LJIIIZ).toString()) == null) {
            string = "";
        }
        linkedHashMap.put("pk_id", string);
        EnumC973950bS5 enumC973950bS5 = EnumC973950bS5.INFO_BAR;
        if (Intrinsics.LJFF(enumC973950bS5.getValue(), str)) {
            linkedHashMap.put("click_area", enumC973950bS5.getValue());
        } else {
            linkedHashMap.put("click_area", EnumC973950bS5.SWITCH_ICON.getValue());
        }
        EnumC973870bRx enumC973870bRxLIZJ = LIZJ();
        if (enumC973870bRxLIZJ != null) {
            linkedHashMap.put("click_period", enumC973870bRxLIZJ.getValue());
            boolValueOf = Boolean.valueOf(enumC973870bRxLIZJ.isPerformance());
        } else {
            boolValueOf = null;
        }
        boolean zLJJJI = C500260Jjc.LJJJI(boolValueOf);
        String str2 = CardStruct.IStatusCode.DEFAULT;
        if (zLJJJI) {
            C981480beE c981480beEM912 = C915980Zwa.LIZIZ().M91(false);
            if (c981480beEM912 != null && (c981500beG = c981480beEM912.LJJIJIIJI) != null && (list = c981500beG.LJI) != null && (l = (Long) C13LP.LJJJLZIJ(0, list)) != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            if (jLongValue == C950220apo.LJ()) {
                str2 = "1";
            }
            linkedHashMap.put("is_performer", str2);
            linkedHashMap.put("performer_anchor_id", String.valueOf(jLongValue));
        } else {
            linkedHashMap.put("is_performer", CardStruct.IStatusCode.DEFAULT);
        }
        LIZIZ(linkedHashMap, false);
        C973690bRf.LJJIJIIJIL(12, C973690bRf.LIZ, "livesdk_takestage_management_panel_show", linkedHashMap, false);
    }

    public static void LJIIIIZZ(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("action_type", str);
        LIZ(linkedHashMap);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_pk_mode_time_setting_entrance");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJIIZI(linkedHashMap);
        c474500IjALIZ.LIZ();
    }

    public static void LJIIIZ(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("action_type", str);
        LIZ(linkedHashMap);
        linkedHashMap.put("setting_result", InterfaceC1106030et7.o9.LIZIZ().toString());
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_pk_mode_time_setting");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJIIZI(linkedHashMap);
        c474500IjALIZ.LIZ();
    }

    public static void LIZIZ(Map map, boolean z) {
        map.put("time_setting", String.valueOf(C972470bPh.LIZIZ(z)));
    }

    public static void LJII(EnumC982900bgW enumC982900bgW, boolean z) {
        String string;
        List<Long> list;
        List<C954460awe> list2;
        long jLongValue;
        String str;
        Object obj;
        Object obj2;
        Object obj3;
        int size;
        int size2;
        C974430bSr c974430bSr;
        Long l;
        Long l2;
        C981500beG c981500beG;
        C974430bSr c974430bSr2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C981480beE c981480beEM91 = C915980Zwa.LIZIZ().M91(false);
        if (c981480beEM91 == null || (string = Long.valueOf(c981480beEM91.LJIIIZ).toString()) == null) {
            string = "";
        }
        linkedHashMap.put("pk_id", string);
        C981480beE c981480beEM912 = C915980Zwa.LIZIZ().M91(false);
        List<Long> list3 = null;
        if (c981480beEM912 != null && (c974430bSr2 = c981480beEM912.LJJIJIIJIL) != null) {
            list = c974430bSr2.LIZIZ;
        } else {
            list = null;
        }
        C981480beE c981480beEM913 = C915980Zwa.LIZIZ().M91(false);
        if (c981480beEM913 != null && (c981500beG = c981480beEM913.LJJIJIIJI) != null) {
            list3 = c981500beG.LJI;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("logSwitchSuccess, previousPerformUidList=");
        sbLIZ.append(list);
        sbLIZ.append(", newPerformerUidList=");
        sbLIZ.append(list3);
        C20441214yg.LJ("TakeStageTrackingUtil", C2188811AlT.LIZIZ(sbLIZ));
        if (C973560bRS.LIZJ(list, list3)) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("logSwitchSuccess, return by listIsSameWithSequence, previousPerformUidList=");
            sbLIZ2.append(list);
            C20441214yg.LJ("TakeStageTrackingUtil", C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        C981480beE c981480beEM914 = C915980Zwa.LIZIZ().M91(false);
        if (c981480beEM914 != null && (list2 = c981480beEM914.LJI) != null && list2.size() > 1) {
            long jLongValue2 = 0;
            if (list != null && (l2 = (Long) C13LP.LJJJLZIJ(0, list)) != null) {
                jLongValue = l2.longValue();
            } else {
                jLongValue = 0;
            }
            if (list3 != null && (l = (Long) C13LP.LJJJLZIJ(0, list3)) != null) {
                jLongValue2 = l.longValue();
            }
            int i = C982890bgV.LIZ[enumC982900bgW.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3 && i != 4) {
                        throw new C1954807lC();
                    }
                    if (jLongValue == jLongValue2) {
                        str = "others_quit";
                    } else {
                        str = "performer_quit";
                    }
                } else {
                    str = "auto_switch";
                }
            } else {
                str = "switch";
            }
            linkedHashMap.put("switch_reason", str);
            String str2 = "1";
            if (z) {
                obj = "1";
            } else {
                obj = CardStruct.IStatusCode.DEFAULT;
            }
            linkedHashMap.put("is_initiator", obj);
            if (jLongValue == C950220apo.LJ()) {
                obj2 = "1";
            } else {
                obj2 = CardStruct.IStatusCode.DEFAULT;
            }
            linkedHashMap.put("is_performer", obj2);
            linkedHashMap.put("performer_anchor_id", String.valueOf(jLongValue));
            if (jLongValue == C950220apo.LJ()) {
                obj3 = "1";
            } else {
                obj3 = CardStruct.IStatusCode.DEFAULT;
            }
            linkedHashMap.put("is_previous_performer", obj3);
            if (jLongValue2 != C950220apo.LJ()) {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            linkedHashMap.put("is_current_performer", str2);
            linkedHashMap.put("current_performer_id", String.valueOf(jLongValue2));
            LIZIZ(linkedHashMap, false);
            C973690bRf.LJJIJIIJIL(12, C973690bRf.LIZ, "livesdk_connection_switch_success", linkedHashMap, false);
            C974560bT4 c974560bT4 = new C974560bT4();
            int iLJIL = C950220apo.LJIL((String) linkedHashMap.get("is_previous_performer"));
            int iLJIL2 = C950220apo.LJIL((String) linkedHashMap.get("is_current_performer"));
            int iLJIL3 = C950220apo.LJIL((String) linkedHashMap.get("is_initiator"));
            if (list != null) {
                size = list.size();
            } else {
                size = 0;
            }
            if (list3 != null) {
                size2 = list3.size();
            } else {
                size2 = 0;
            }
            c974560bT4.LJIIL(str, "switch_reason", true);
            c974560bT4.LJIIL(Integer.valueOf(iLJIL), "is_previous_performer", true);
            c974560bT4.LJIIL(Integer.valueOf(iLJIL2), "is_current_performer", true);
            c974560bT4.LJIIL(Integer.valueOf(iLJIL3), "is_initiator", true);
            c974560bT4.LJIIL(Integer.valueOf(size), "previous_host_count", true);
            c974560bT4.LJIIL(Integer.valueOf(size2), "current_host_count", true);
            AbstractC962030b8r.LJIIJ(c974560bT4.LIZLLL, "current_performer_id", Long.valueOf(jLongValue2), true);
            c974560bT4.LJIJJLI("performance_order_changed");
            C981480beE c981480beEM915 = C915980Zwa.LIZIZ().M91(false);
            if (c981480beEM915 != null && (c974430bSr = c981480beEM915.LJJIJIIJIL) != null) {
                c974430bSr.LIZIZ = c974430bSr.LIZ.LJJIJIIJI.LJI;
                return;
            }
            return;
        }
        C20441214yg.LJ("TakeStageTrackingUtil", "logSwitchSuccess, return by linkedHostList <= 1");
    }
}
