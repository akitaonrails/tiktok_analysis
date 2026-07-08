package X;

import Y.AObjectS108S0000000_2;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.feed.bridge.legacy.banner.IStandardBannerWList;
import com.ss.android.ugc.feed.funnel.api.FunnelContext;
import com.ss.android.ugc.tiktok.fcpbusiness.funnel.DecisionPair;
import com.ss.android.ugc.tiktok.fcpbusiness.funnel.FunnelNode;
import com.ss.android.ugc.tiktok.fcpbusiness.funnel.PriorityAvoidDetail;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS26S0001000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RpG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C707600RpG {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(272));

    public static C2344009Gk LIZ(FunnelContext.Info info, Map map) {
        List<String> listLIZ;
        PriorityAvoidDetail priorityAvoidDetail;
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (((FunnelNode) entry.getValue()).getInFunnel() || Intrinsics.LJFF(((FunnelNode) entry.getValue()).isStandardize(), Boolean.TRUE)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
        LinkedHashSet linkedHashSet4 = new LinkedHashSet();
        LinkedHashSet linkedHashSet5 = new LinkedHashSet();
        LinkedHashSet linkedHashSet6 = new LinkedHashSet();
        LinkedHashSet linkedHashSet7 = new LinkedHashSet();
        LinkedHashSet linkedHashSet8 = new LinkedHashSet();
        LinkedHashSet linkedHashSet9 = new LinkedHashSet();
        LinkedHashSet linkedHashSet10 = new LinkedHashSet();
        LinkedHashSet linkedHashSet11 = new LinkedHashSet();
        LinkedHashSet linkedHashSet12 = new LinkedHashSet();
        LinkedHashSet linkedHashSet13 = new LinkedHashSet();
        LinkedHashSet linkedHashSet14 = new LinkedHashSet();
        LinkedHashSet linkedHashSet15 = new LinkedHashSet();
        LinkedHashSet linkedHashSet16 = new LinkedHashSet();
        LinkedHashSet linkedHashSet17 = new LinkedHashSet();
        LinkedHashSet linkedHashSet18 = new LinkedHashSet();
        IStandardBannerWList iStandardBannerWList = (IStandardBannerWList) LIZ.getValue();
        if (iStandardBannerWList == null || (listLIZ = iStandardBannerWList.LIZ()) == null) {
            listLIZ = C13BV.INSTANCE;
        }
        for (FunnelNode funnelNode : linkedHashMap.values()) {
            if (!funnelNode.decisionPairs.isEmpty()) {
                for (DecisionPair decisionPair : funnelNode.decisionPairs) {
                    EnumC707820Rpc enumC707820Rpc = decisionPair.scope;
                    if (enumC707820Rpc != null) {
                        int i = C707830Rpd.LIZ[enumC707820Rpc.ordinal()];
                        if (i != 1) {
                            if (i != 2) {
                                if (i == 3 && ((str = decisionPair.decisionMakerKey) != null || (str = funnelNode.componentKey) != null)) {
                                    Object arrayList2 = linkedHashMap2.get(str);
                                    if (arrayList2 == null) {
                                        arrayList2 = new ArrayList();
                                        linkedHashMap2.put(str, arrayList2);
                                    }
                                    ((List) arrayList2).add(decisionPair);
                                }
                            } else {
                                String str2 = decisionPair.decisionMakerKey;
                                if (str2 != null || (str2 = funnelNode.componentKey) != null) {
                                    Object arrayList3 = linkedHashMap3.get(str2);
                                    if (arrayList3 == null) {
                                        arrayList3 = new ArrayList();
                                        linkedHashMap3.put(str2, arrayList3);
                                    }
                                    ((List) arrayList3).add(decisionPair);
                                }
                            }
                        } else {
                            arrayList.add(decisionPair);
                        }
                    }
                }
            }
            if (funnelNode.componentKey != null) {
                Boolean boolIsStandardize = funnelNode.isStandardize();
                Boolean bool = Boolean.TRUE;
                if (Intrinsics.LJFF(boolIsStandardize, bool) || listLIZ.contains(funnelNode.componentKey)) {
                    linkedHashSet5.add(funnelNode.componentKey);
                }
                if (funnelNode.getInFunnel()) {
                    if (Intrinsics.LJFF(funnelNode.isSkipAvoidStrategy(), bool)) {
                        linkedHashSet16.add(funnelNode.componentKey);
                    } else {
                        linkedHashSet.add(funnelNode.componentKey);
                    }
                }
                EnumC707850Rpf enumC707850Rpf = funnelNode.state;
                if (enumC707850Rpf != null) {
                    switch (C707830Rpd.LIZIZ[enumC707850Rpf.ordinal()]) {
                        case 2:
                            if (Intrinsics.LJFF(funnelNode.isStandardize(), bool)) {
                                linkedHashSet6.add(funnelNode.componentKey);
                                linkedHashSet12.add(funnelNode.componentKey);
                            }
                            break;
                        case 3:
                            linkedHashSet8.add(funnelNode.componentKey);
                            linkedHashSet12.add(funnelNode.componentKey);
                            break;
                        case 4:
                            linkedHashSet9.add(funnelNode.componentKey);
                            linkedHashSet12.add(funnelNode.componentKey);
                            break;
                        case 5:
                            linkedHashSet10.add(funnelNode.componentKey);
                            linkedHashSet12.add(funnelNode.componentKey);
                            break;
                        case 6:
                            if (Intrinsics.LJFF(funnelNode.isStandardize(), bool)) {
                                linkedHashSet4.add(funnelNode.componentKey);
                                linkedHashSet.remove(funnelNode.componentKey);
                            } else {
                                linkedHashSet11.add(funnelNode.componentKey);
                            }
                            linkedHashSet12.add(funnelNode.componentKey);
                            break;
                        case 7:
                            if (Intrinsics.LJFF(funnelNode.isStandardize(), bool)) {
                                linkedHashSet7.add(funnelNode.componentKey);
                                linkedHashSet.remove(funnelNode.componentKey);
                            }
                            linkedHashSet12.add(funnelNode.componentKey);
                            break;
                        case 8:
                            linkedHashSet13.add(funnelNode.componentKey);
                            linkedHashSet12.add(funnelNode.componentKey);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            linkedHashSet15.add(funnelNode.componentKey);
                            linkedHashSet12.add(funnelNode.componentKey);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            linkedHashSet11.add(funnelNode.componentKey);
                            linkedHashSet12.add(funnelNode.componentKey);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            linkedHashSet14.add(funnelNode.componentKey);
                            linkedHashSet12.add(funnelNode.componentKey);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            if (Intrinsics.LJFF(funnelNode.isSkipAvoidStrategy(), bool)) {
                                linkedHashSet17.add(funnelNode.componentKey);
                            } else {
                                linkedHashSet2.add(funnelNode.componentKey);
                            }
                            if (Intrinsics.LJFF(funnelNode.isMustShowStrategy(), bool)) {
                                linkedHashSet18.add(funnelNode.componentKey);
                            }
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            if (Intrinsics.LJFF(funnelNode.isSkipAvoidStrategy(), bool)) {
                                linkedHashSet17.add(funnelNode.componentKey);
                            } else {
                                linkedHashSet2.add(funnelNode.componentKey);
                                String str3 = funnelNode.realComponentKey;
                                if (str3 == null) {
                                    str3 = funnelNode.componentKey;
                                }
                                linkedHashSet3.add(str3);
                            }
                            if (Intrinsics.LJFF(funnelNode.isMustShowStrategy(), bool)) {
                                linkedHashSet18.add(funnelNode.componentKey);
                            }
                            break;
                    }
                }
            }
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("request_display_component_ids", C13LP.LJJLIIIJ(linkedHashSet, ",", null, null, 0, null, null, 62));
        c2344009Gk.LJIIIIZZ("display_component_ids", C13LP.LJJLIIIJ(linkedHashSet2, ",", null, null, 0, null, null, 62));
        c2344009Gk.LJIIIIZZ("visible_component_ids", C13LP.LJJLIIIJ(linkedHashSet3, ",", null, null, 0, null, null, 62));
        c2344009Gk.LJIIIIZZ("request_display_unrestricted_component_ids", C13LP.LJJLIIIJ(linkedHashSet16, ",", null, null, 0, null, null, 62));
        c2344009Gk.LJIIIIZZ("display_unrestricted_component_ids", C13LP.LJJLIIIJ(linkedHashSet17, ",", null, null, 0, null, null, 62));
        c2344009Gk.LJIIIIZZ("must_display_component_ids", C13LP.LJJLIIIJ(linkedHashSet18, ",", null, null, 0, null, null, 62));
        c2344009Gk.LJIIIIZZ("standard_enable_avoid_component_ids", C13LP.LJJLIIIJ(linkedHashSet4, ",", null, null, 0, null, null, 62));
        c2344009Gk.LJIIIIZZ("server_standard_request_display_component_ids", C13LP.LJJLIIIJ(linkedHashSet5, ",", null, null, 0, null, null, 62));
        c2344009Gk.LJIIIIZZ("standard_data_avoid_component_ids", C13LP.LJJLIIIJ(linkedHashSet6, ",", null, null, 0, null, null, 62));
        c2344009Gk.LJIIIIZZ("standard_priority_avoid_component_ids", C13LP.LJJLIIIJ(linkedHashSet7, ",", null, null, 0, null, null, 62));
        c2344009Gk.LJIIIIZZ("frequency_avoid_component_ids", C13LP.LJJLIIIJ(linkedHashSet8, ",", null, null, 0, null, null, 62));
        c2344009Gk.LJIIIIZZ("exit_avoid_component_ids", C13LP.LJJLIIIJ(linkedHashSet9, ",", null, null, 0, null, null, 62));
        c2344009Gk.LJIIIIZZ("dispersion_avoid_component_ids", C13LP.LJJLIIIJ(linkedHashSet10, ",", null, null, 0, null, null, 62));
        c2344009Gk.LJIIIIZZ("client_final_filter_avoid_component_ids", C13LP.LJJLIIIJ(linkedHashSet15, ",", null, null, 0, null, null, 62));
        c2344009Gk.LJIIIIZZ("container_avoid_component_ids", C13LP.LJJLIIIJ(linkedHashSet13, ",", null, null, 0, null, null, 62));
        c2344009Gk.LJIIIIZZ("global_avoid_component_ids", C13LP.LJJLIIIJ(linkedHashSet14, ",", null, null, 0, null, null, 62));
        c2344009Gk.LJIIIIZZ("enable_avoid_component_ids", C13LP.LJJLIIIJ(linkedHashSet11, ",", null, null, 0, null, null, 62));
        c2344009Gk.LJIIIIZZ("avoid_component_ids", C13LP.LJJLIIIJ(linkedHashSet12, ",", null, null, 0, null, null, 62));
        ArrayList arrayList4 = new ArrayList();
        if (!linkedHashSet8.isEmpty()) {
            arrayList4.add("frequency_avoid_component_ids");
        }
        if (!linkedHashSet9.isEmpty()) {
            arrayList4.add("exit_avoid_component_ids");
        }
        if (!linkedHashSet10.isEmpty()) {
            arrayList4.add("dispersion_avoid_component_ids");
        }
        if (!linkedHashSet15.isEmpty()) {
            arrayList4.add("client_final_filter_avoid_component_ids");
        }
        if (!linkedHashSet13.isEmpty()) {
            arrayList4.add("container_avoid_component_ids");
        }
        if (!linkedHashSet14.isEmpty()) {
            arrayList4.add("global_avoid_component_ids");
        }
        if (!linkedHashSet11.isEmpty()) {
            arrayList4.add("enable_avoid_component_ids");
        }
        if (!linkedHashSet4.isEmpty()) {
            arrayList4.add("standard_enable_avoid_component_ids");
        }
        if (!linkedHashSet7.isEmpty()) {
            arrayList4.add("standard_priority_avoid_component_ids");
        }
        if (!linkedHashSet6.isEmpty()) {
            arrayList4.add("standard_data_avoid_component_ids");
        }
        c2344009Gk.LJFF("client_funnel_keys", C13LP.LJJLIIIJ(arrayList4, ",", null, null, 0, null, null, 62));
        c2344009Gk.LJFF("main_anchor_component_id", info.mainAnchor);
        c2344009Gk.LJFF("highest_anchor_component_id", info.highestAnchor);
        int i2 = info.globalShowLimit;
        String strLJIILLIIL = C09RB.LJIILLIIL(C09R4.LIZLLL(new C1939607ik(linkedHashMap2.values()), new AObjectS108S0000000_2(0)), ";", null, null, AFwS243S0000000_11.get$arr$(688), 30);
        String strLJIILLIIL2 = C09RB.LJIILLIIL(C09R4.LIZLLL(new C1939607ik(linkedHashMap3.values()), new AObjectS108S0000000_2(0)), ";", null, null, AFwS243S0000000_11.get$arr$(687), 30);
        String strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList, ";", null, null, 0, null, new AwS26S0001000_11(i2, 4), 30);
        if (strLJIILLIIL2.length() == 0 && strLJJLIIIJ.length() == 0 && strLJIILLIIL.length() == 0) {
            priorityAvoidDetail = null;
        } else {
            priorityAvoidDetail = new PriorityAvoidDetail(strLJJLIIIJ, strLJIILLIIL2, strLJIILLIIL);
        }
        c2344009Gk.LJFF("avoid_relation_detail", GsonProtectorUtils.toJson(C08JS.LIZIZ(), priorityAvoidDetail));
        return c2344009Gk;
    }
}
