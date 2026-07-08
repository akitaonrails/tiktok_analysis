package X;

import com.ss.android.ugc.aweme.search.pages.result.common.reflist.core.model.ReferenceItemBridge;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.TakoEditAskInfo;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.TakoReferenceAskInfo;
import com.ss.android.ugc.aweme.tako.ccl.model.api.SubConversationConfig;
import com.ss.android.ugc.aweme.tako.model.SearchBingItem;
import com.ss.android.ugc.aweme.tako.model.SearchVideoItem;
import com.ss.android.ugc.aweme.tako.model.TakoEnterParams;
import com.ss.android.ugc.aweme.tako.model.TakoImageItem;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yXR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1861390yXR {
    public static C1862770yZf LIZ;
    public static C1855520yNy LIZIZ = new C1855520yNy(null, 0, 0, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, 524287);
    public static String LIZJ = "";
    public static EnumC1778520wNm LIZLLL = EnumC1778520wNm.NEW;
    public static EnumC320480ChK LJ = EnumC320480ChK.NEW;
    public static final HashMap<String, Boolean> LJFF = new HashMap<>();
    public static final HashMap<String, Boolean> LJI = new HashMap<>();

    public static boolean LIZLLL() {
        return LIZLLL == EnumC1778520wNm.NEW;
    }

    public static boolean LJ() {
        return LIZLLL == EnumC1778520wNm.KEEP_LAST_STATE;
    }

    public static boolean LJIIIIZZ() {
        C07QF.LIZ.getClass();
        return C07QF.LIZ() && LJ();
    }

    public static boolean LJIIIZ() {
        C07QF.LIZ.getClass();
        return C07QF.LIZ() && LJ();
    }

    public static boolean LIZIZ(String str) {
        if (!Intrinsics.LJFF(str, "click_bottom_bar") && !Intrinsics.LJFF(str, "click_bottom_bar_v2") && !Intrinsics.LJFF(str, "click_comment_related_word") && !Intrinsics.LJFF(str, "click_icon")) {
            return false;
        }
        return true;
    }

    public static Integer LIZJ(TakoEnterParams takoEnterParams) {
        String autoSendMsgContent;
        String carriedSendAnswerContent;
        List<SearchVideoItem> carriedSendAnswerVideo;
        List<SearchBingItem> carriedBingList;
        List<TakoImageItem> carriedImageList;
        List<TakoImageItem> carriedSendImageList;
        List<String> carriedSugList;
        List<ReferenceItemBridge> carriedReferenceList;
        if (takoEnterParams != null) {
            autoSendMsgContent = takoEnterParams.getAutoSendMsgContent();
        } else {
            autoSendMsgContent = null;
        }
        if (!C123100dR.LIZ(autoSendMsgContent)) {
            if (takoEnterParams == null) {
                return null;
            }
            if ((takoEnterParams.getCarriedPlaceholders() == null || !(!r0.isEmpty())) && (((carriedSendAnswerContent = takoEnterParams.getCarriedSendAnswerContent()) == null || !C123100dR.LIZ(carriedSendAnswerContent)) && (((carriedSendAnswerVideo = takoEnterParams.getCarriedSendAnswerVideo()) == null || !(!carriedSendAnswerVideo.isEmpty())) && (((carriedBingList = takoEnterParams.getCarriedBingList()) == null || !(!carriedBingList.isEmpty())) && (((carriedImageList = takoEnterParams.getCarriedImageList()) == null || !(!carriedImageList.isEmpty())) && (((carriedSendImageList = takoEnterParams.getCarriedSendImageList()) == null || !(!carriedSendImageList.isEmpty())) && (((carriedSugList = takoEnterParams.getCarriedSugList()) == null || !(!carriedSugList.isEmpty())) && (((carriedReferenceList = takoEnterParams.getCarriedReferenceList()) == null || !(!carriedReferenceList.isEmpty())) && takoEnterParams.getNimbleParams() == null && C1859740yUm.LIZ(takoEnterParams.getEnterSearchId()) == null)))))))) {
                return null;
            }
        }
        return Integer.valueOf(LIZLLL() ? 1 : 0);
    }

    public static boolean LJFF(TakoEnterParams takoEnterParams) {
        long jLongValue;
        Long l = takoEnterParams.enterStartTime;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        long j = jLongValue - LIZIZ.LIZIZ;
        C1153140g76.LIZ.getClass();
        if (j < ((Number) C1153140g76.LIZJ.getValue()).longValue()) {
            return true;
        }
        return false;
    }

    public static boolean LJI(TakoEnterParams takoEnterParams) {
        long jLongValue;
        Long l = takoEnterParams.enterStartTime;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        long j = jLongValue - LIZIZ.LIZIZ;
        C1153140g76.LIZ.getClass();
        long jLongValue2 = ((Number) C1153140g76.LIZJ.getValue()).longValue();
        C1153160g78.LIZ.getClass();
        if (j < ((Number) C1153160g78.LIZJ.getValue()).longValue() && jLongValue2 <= j) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x014d A[PHI: r2
      0x014d: PHI (r2v4 boolean) = (r2v3 boolean), (r2v6 boolean) binds: [B:116:0x014a, B:108:0x013e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJII(com.ss.android.ugc.aweme.tako.model.TakoEnterParams r6) {
        /*
            Method dump skipped, instruction units count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1861390yXR.LJII(com.ss.android.ugc.aweme.tako.model.TakoEnterParams):boolean");
    }

    public static boolean LJIIJ(TakoEnterParams takoEnterParams) {
        String carriedSendAnswerContent;
        List<SearchVideoItem> carriedSendAnswerVideo;
        List<SearchBingItem> carriedBingList;
        List<TakoImageItem> carriedImageList;
        List<String> carriedSugList;
        List<ReferenceItemBridge> carriedReferenceList;
        String autoSendMsgContent;
        String carriedSendAnswerContent2;
        List<SearchVideoItem> carriedSendAnswerVideo2;
        List<SearchBingItem> carriedBingList2;
        List<TakoImageItem> carriedImageList2;
        List<TakoImageItem> carriedSendImageList;
        List<String> carriedSugList2;
        List<ReferenceItemBridge> carriedReferenceList2;
        List<String> carriedSugList3;
        if (LIZLLL()) {
            if ((takoEnterParams.getCarriedPlaceholders() != null && (!r0.isEmpty())) || (((carriedSendAnswerContent2 = takoEnterParams.getCarriedSendAnswerContent()) != null && C123100dR.LIZ(carriedSendAnswerContent2)) || (((carriedSendAnswerVideo2 = takoEnterParams.getCarriedSendAnswerVideo()) != null && (!carriedSendAnswerVideo2.isEmpty())) || (((carriedBingList2 = takoEnterParams.getCarriedBingList()) != null && (!carriedBingList2.isEmpty())) || (((carriedImageList2 = takoEnterParams.getCarriedImageList()) != null && (!carriedImageList2.isEmpty())) || (((carriedSendImageList = takoEnterParams.getCarriedSendImageList()) != null && (!carriedSendImageList.isEmpty())) || (((carriedSugList2 = takoEnterParams.getCarriedSugList()) != null && (!carriedSugList2.isEmpty())) || (((carriedReferenceList2 = takoEnterParams.getCarriedReferenceList()) != null && (!carriedReferenceList2.isEmpty())) || takoEnterParams.getNimbleParams() != null || C1859740yUm.LIZ(takoEnterParams.getEnterSearchId()) != null)))))))) {
                C1855840yOU.LIZ.getClass();
                if (!C1855840yOU.LIZ()) {
                    return false;
                }
                Map<String, String> carriedPlaceholders = takoEnterParams.getCarriedPlaceholders();
                if (carriedPlaceholders != null && !carriedPlaceholders.isEmpty()) {
                    return false;
                }
                String carriedSendAnswerContent3 = takoEnterParams.getCarriedSendAnswerContent();
                if (carriedSendAnswerContent3 != null && carriedSendAnswerContent3.length() != 0) {
                    return false;
                }
                List<SearchVideoItem> carriedSendAnswerVideo3 = takoEnterParams.getCarriedSendAnswerVideo();
                if (carriedSendAnswerVideo3 != null && !carriedSendAnswerVideo3.isEmpty()) {
                    return false;
                }
                List<SearchBingItem> carriedBingList3 = takoEnterParams.getCarriedBingList();
                if (carriedBingList3 != null && !carriedBingList3.isEmpty()) {
                    return false;
                }
                List<TakoImageItem> carriedImageList3 = takoEnterParams.getCarriedImageList();
                if ((carriedImageList3 != null && !carriedImageList3.isEmpty()) || (carriedSugList3 = takoEnterParams.getCarriedSugList()) == null || !(!carriedSugList3.isEmpty())) {
                    return false;
                }
                List<ReferenceItemBridge> carriedReferenceList3 = takoEnterParams.getCarriedReferenceList();
                if (carriedReferenceList3 != null && !carriedReferenceList3.isEmpty()) {
                    return false;
                }
                String autoSendMsgContent2 = takoEnterParams.getAutoSendMsgContent();
                if ((autoSendMsgContent2 != null && autoSendMsgContent2.length() != 0) || takoEnterParams.getNimbleParams() != null || C1859740yUm.LIZ(takoEnterParams.getEnterSearchId()) != null) {
                    return false;
                }
                return true;
            }
            String inputContent = takoEnterParams.getInputContent();
            if (inputContent != null && inputContent.length() != 0) {
                return true;
            }
            String autoSendMsgContent3 = takoEnterParams.getAutoSendMsgContent();
            if (autoSendMsgContent3 != null && autoSendMsgContent3.length() != 0) {
                return true;
            }
            C1855840yOU.LIZ.getClass();
            return C1855840yOU.LIZ();
        }
        if (LJ()) {
            if (LIZIZ.LIZLLL != EnumC1991107r3.WORD_INPUT_KEYBOARD) {
                return false;
            }
            return true;
        }
        if (LIZLLL == EnumC1778520wNm.READ_LAST_ANSWER) {
            Map<String, String> carriedPlaceholders2 = takoEnterParams.getCarriedPlaceholders();
            if ((carriedPlaceholders2 != null && !carriedPlaceholders2.isEmpty()) || (((carriedSendAnswerContent = takoEnterParams.getCarriedSendAnswerContent()) != null && carriedSendAnswerContent.length() != 0) || (((carriedSendAnswerVideo = takoEnterParams.getCarriedSendAnswerVideo()) != null && !carriedSendAnswerVideo.isEmpty()) || (((carriedBingList = takoEnterParams.getCarriedBingList()) != null && !carriedBingList.isEmpty()) || (((carriedImageList = takoEnterParams.getCarriedImageList()) != null && !carriedImageList.isEmpty()) || (carriedSugList = takoEnterParams.getCarriedSugList()) == null || !(!carriedSugList.isEmpty()) || (((carriedReferenceList = takoEnterParams.getCarriedReferenceList()) != null && !carriedReferenceList.isEmpty()) || (((autoSendMsgContent = takoEnterParams.getAutoSendMsgContent()) != null && autoSendMsgContent.length() != 0) || takoEnterParams.getNimbleParams() != null || C1859740yUm.LIZ(takoEnterParams.getEnterSearchId()) != null))))))) {
                return false;
            }
            C1855840yOU.LIZ.getClass();
            return C1855840yOU.LIZ();
        }
        if (LIZLLL != EnumC1778520wNm.READ_LAST_ANSWER_5_60) {
            return true;
        }
        C1855840yOU.LIZ.getClass();
        return C1855840yOU.LIZ();
    }

    public static void LIZ(String str, int i, EnumC1991107r3 enumC1991107r3, String str2, List list, String str3, Boolean bool, C1854790yMn c1854790yMn, C1854150yLl c1854150yLl, C1861290yXH c1861290yXH, TakoReferenceAskInfo takoReferenceAskInfo, TakoEditAskInfo takoEditAskInfo, List list2, SubConversationConfig subConversationConfig, boolean z) {
        EnumC1854550yMP enumC1854550yMP;
        boolean z2;
        EnumC1854550yMP enumC1854550yMP2;
        C1854540yMO c1854540yMO;
        ArrayList arrayList;
        C326960Crm c326960Crm;
        C1854540yMO c1854540yMO2;
        EnumC1991107r3 enumC1991107r32 = enumC1991107r3;
        if (c1854790yMn == null || (c1854540yMO2 = c1854790yMn.LIZ) == null || (enumC1854550yMP = c1854540yMO2.LIZ) == null) {
            enumC1854550yMP = EnumC1854550yMP.NONE;
        }
        if (enumC1854550yMP != EnumC1854550yMP.NONE) {
            z2 = true;
        } else {
            z2 = false;
        }
        C1861290yXH c1861290yXH2 = null;
        if (C123100dR.LIZ(str2) || C695930RRn.LIZLLL(list) || z2) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("inputContent: ");
            sbLIZ.append(str2);
            sbLIZ.append(", inputImageList: ");
            sbLIZ.append(list);
            sbLIZ.append(", skillLabel: ");
            if (c1854790yMn != null && (c1854540yMO = c1854790yMn.LIZ) != null) {
                enumC1854550yMP2 = c1854540yMO.LIZ;
            } else {
                enumC1854550yMP2 = null;
            }
            sbLIZ.append(enumC1854550yMP2);
            C2188811AlT.LIZIZ(sbLIZ);
            LJFF.put(str, Boolean.TRUE);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (enumC1991107r32 == null) {
            enumC1991107r32 = EnumC1991107r3.DEFAULT;
        }
        if (list != null) {
            arrayList = new ArrayList(list);
        } else {
            arrayList = null;
        }
        if (c1861290yXH != null) {
            Object obj = c1861290yXH.LIZJ;
            if (!(obj instanceof C326960Crm) || (c326960Crm = (C326960Crm) obj) == null || (c326960Crm.LL == null && c326960Crm.LLILLL == null)) {
                c1861290yXH2 = c1861290yXH;
            } else {
                c1861290yXH2 = new C1861290yXH(c1861290yXH.LIZ, c1861290yXH.LIZIZ, new C326960Crm(null, c326960Crm.LLILLJJLI, null));
            }
        }
        ArrayList arrayList2 = new ArrayList(list2);
        Boolean bool2 = LJFF.get(str);
        Boolean bool3 = Boolean.TRUE;
        LIZIZ = new C1855520yNy(str, jCurrentTimeMillis, i, enumC1991107r32, bool, str2, arrayList, str3, c1854790yMn, c1854150yLl, c1861290yXH2, takoReferenceAskInfo, takoEditAskInfo, arrayList2, subConversationConfig, Intrinsics.LJFF(bool2, bool3), Intrinsics.LJFF(LJI.get(str), bool3), z, 512);
    }
}
