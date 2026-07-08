package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.touchpoint.api.model.ActivityTask;
import com.bytedance.touchpoint.api.model.Bubble;
import com.bytedance.touchpoint.api.model.ProgressInfo;
import com.bytedance.touchpoint.api.model.ReportInstruction;
import com.bytedance.touchpoint.api.model.TaskEvent;
import com.bytedance.touchpoint.api.model.TouchPoint;
import com.bytedance.touchpoint.core.pendant.base.BaseTaskEventTimerPendantManager;
import com.bytedance.touchpoint.core.pendant.base.BaseTimerPendantManager;
import com.bytedance.touchpoint.core.pendant.manager.SpecActPendantManager;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AwS151S0101000_11;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0zSu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1897020zSu {
    public static final C1897020zSu LIZ = new C1897020zSu();
    public static final ArrayList<InterfaceC1896760zSU> LIZIZ = C1697810uHb.LJ(new C1897130zT5(), new C1897150zT7(), new C1897120zT4(), new C1897100zT2(), new C1897140zT6(), new C1897090zT1(), new C1897110zT3());
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(521));
    public static List<Bubble> LIZLLL = new ArrayList();

    public static void LJFF() {
        HashMap<Integer, Bubble> map = new HashMap<>();
        C01GW<C1894700zPA> c01gw = C1894700zPA.LJIJ;
        List<Bubble> listLJFF = C2178808gE.LIZ().LJFF(7);
        ArrayList arrayList = new ArrayList();
        if (listLJFF != null && !listLJFF.isEmpty()) {
            for (Bubble bubble : listLJFF) {
                if (C1896970zSp.LIZ(bubble)) {
                    arrayList.add(bubble);
                } else {
                    map.put(Integer.valueOf(bubble.bubbleType), bubble);
                }
            }
        }
        Iterator<InterfaceC1896760zSU> it2 = LIZIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZIZ(map);
        }
        ((C1897160zT8) LIZJ.getValue()).LIZIZ(map);
        LIZLLL = arrayList;
    }

    public static void LIZJ(Bubble bubble, boolean z) {
        String str;
        String strLJIJJ;
        Object obj;
        Object obj2;
        Object obj3;
        String str2;
        if (bubble != null && (str = bubble.LIZIZ) != null && str.length() != 0) {
            C1894320zOY c1894320zOY = C1894320zOY.LIZ;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String strValueOf = String.valueOf(bubble.bubbleType);
            String str3 = "";
            if (strValueOf == null) {
                strValueOf = "";
            }
            linkedHashMap.put("sub_type", strValueOf);
            linkedHashMap.put("click_position", "ok");
            C01GW<SpecActPendantManager> c01gw = SpecActPendantManager.LLJJIJIIJIL;
            linkedHashMap.put("vv_cnt", String.valueOf(C1894330zOZ.LIZ().LJIILJJIL()));
            String str4 = bubble.taskKey;
            if (str4 != null) {
                str3 = str4;
            }
            linkedHashMap.put("task_key", str3);
            if (z && (str2 = bubble.notificationName) != null && str2.length() != 0) {
                linkedHashMap.put("type", bubble.notificationName);
            }
            c1894320zOY.getClass();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.put("touch_point_id", String.valueOf(bubble.LIZ));
            linkedHashMap2.put("touch_point_name", bubble.LIZIZ);
            linkedHashMap2.put("launch_plan_id", String.valueOf(bubble.LIZJ));
            linkedHashMap2.put("touch_point_ab_versions", String.valueOf(bubble.LIZLLL));
            C1619720sFe c1619720sFe = C1619720sFe.LIZ;
            AbstractC1896090zRP abstractC1896090zRP = (AbstractC1896090zRP) c1619720sFe.LIZ(0);
            if (abstractC1896090zRP != null) {
                strLJIJJ = abstractC1896090zRP.LJIJJ();
            } else {
                strLJIJJ = null;
            }
            linkedHashMap2.put("region", strLJIJJ);
            linkedHashMap2.put("cold_start_cnt", String.valueOf(C1895930zR9.LIZJ));
            String str5 = "1";
            if (C1894310zOX.LIZIZ()) {
                obj = "1";
            } else {
                obj = CardStruct.IStatusCode.DEFAULT;
            }
            linkedHashMap2.put("is_login", obj);
            Map<String, String> map = bubble.LJ;
            if (map != null) {
                linkedHashMap2.putAll(map);
            }
            if (C1064720doU.LIZ()) {
                obj2 = "1";
            } else {
                obj2 = CardStruct.IStatusCode.DEFAULT;
            }
            linkedHashMap2.put("webview_has_warm_up", obj2);
            C1893370zN1 c1893370zN1 = (C1893370zN1) c1619720sFe.LIZ(1003);
            if (c1893370zN1 != null && c1893370zN1.LJIIJ()) {
                obj3 = "1";
            } else {
                obj3 = CardStruct.IStatusCode.DEFAULT;
            }
            linkedHashMap2.put("webview_start_chromium_task_finished", obj3);
            C1893370zN1 c1893370zN12 = (C1893370zN1) c1619720sFe.LIZ(1003);
            if (c1893370zN12 == null || !c1893370zN12.LJIIJJI()) {
                str5 = CardStruct.IStatusCode.DEFAULT;
            }
            linkedHashMap2.put("webview_warm_up_task_finished", str5);
            linkedHashMap2.putAll(linkedHashMap);
            InterfaceC1897260zTI interfaceC1897260zTILIZIZ = c1619720sFe.LIZIZ();
            if (interfaceC1897260zTILIZIZ != null) {
                interfaceC1897260zTILIZIZ.LIZ("touch_point_click", linkedHashMap2);
            }
            C01GW<C1894700zPA> c01gw2 = C1894700zPA.LJIJ;
            TouchPoint touchPointLIZJ = C2178808gE.LIZ().LIZJ(bubble.LIZ, bubble.LIZJ);
            if (touchPointLIZJ != null) {
                C1893680zNW c1893680zNW = C1893680zNW.LIZ;
                String strValueOf2 = String.valueOf(linkedHashMap.get("click_position"));
                c1893680zNW.getClass();
                C1893680zNW.LJ(touchPointLIZJ, strValueOf2);
            }
        }
    }

    public static void LIZLLL(Bubble bubble, int i) {
        C01U6.LIZIZ(new AwS151S0101000_11(bubble, i, 4));
    }

    public static Bubble LIZ(int i, String str, Bubble bubble) {
        List<Integer> listLJIJ;
        boolean zContains = false;
        AbstractC1896090zRP abstractC1896090zRP = (AbstractC1896090zRP) C1619720sFe.LIZ.LIZ(0);
        if (abstractC1896090zRP != null && (listLJIJ = abstractC1896090zRP.LJIJ()) != null) {
            zContains = listLJIJ.contains(Integer.valueOf(i));
        }
        switch (i) {
            case 7:
            case 8:
            case BdTuring.TYPE_ECAF /* 9 */:
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
            case 14:
            case 15:
            case 16:
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
            case 22:
            case 23:
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                if (bubble != null) {
                    if (zContains) {
                        if (bubble.bubbleType == i && Intrinsics.LJFF(bubble.taskKey, str)) {
                            return bubble;
                        }
                    } else if (bubble.bubbleType == i) {
                        return bubble;
                    }
                    return null;
                }
                for (Bubble bubble2 : LIZLLL) {
                    if (zContains) {
                        if (bubble2.bubbleType == i && Intrinsics.LJFF(bubble2.taskKey, str)) {
                            return bubble2;
                        }
                    } else if (bubble2.bubbleType == i) {
                        return bubble2;
                    }
                }
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
            case 19:
            case 21:
            default:
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZIZ(BaseTaskEventTimerPendantManager baseTaskEventTimerPendantManager, int i, TaskEvent taskEvent) {
        C443120HZe c443120HZe;
        String string;
        Integer num;
        String string2;
        Integer num2;
        String str;
        String str2;
        String string3;
        String string4;
        boolean z = false;
        if (baseTaskEventTimerPendantManager.LJJ() && baseTaskEventTimerPendantManager.LJJJJJ() && baseTaskEventTimerPendantManager.LLJ != 1) {
            if (taskEvent instanceof ActivityTask) {
                ActivityTask activityTask = (ActivityTask) taskEvent;
                String str3 = activityTask.taskKey;
                Integer num3 = activityTask.roundTime;
                if (num3 != null) {
                    string3 = num3.toString();
                } else {
                    string3 = null;
                }
                Integer num4 = activityTask.scoreAmount;
                if (num4 != null) {
                    string4 = num4.toString();
                } else {
                    string4 = null;
                }
                c443120HZe = new C443120HZe(str3, string3, string4);
            } else {
                String str4 = taskEvent.taskEventKey;
                Integer num5 = taskEvent.LIZ;
                if (num5 == null || (string = num5.toString()) == null) {
                    ReportInstruction reportInstruction = taskEvent.reportInstruction;
                    if (reportInstruction != null && (num = reportInstruction.reportBatch) != null) {
                        string = num.toString();
                    } else {
                        string = null;
                    }
                }
                Integer num6 = taskEvent.LIZIZ;
                if (num6 == null || (string2 = num6.toString()) == null) {
                    ProgressInfo progressInfo = taskEvent.progressInfo;
                    if (progressInfo != null && (num2 = progressInfo.awardAmount) != null) {
                        string2 = num2.toString();
                    } else {
                        string2 = null;
                    }
                }
                c443120HZe = new C443120HZe(str4, string, string2);
            }
            String str5 = (String) c443120HZe.getFirst();
            String str6 = (String) c443120HZe.getSecond();
            String str7 = (String) c443120HZe.getThird();
            if (str5 == null) {
                str = "";
            } else {
                str = str5;
            }
            Bubble bubbleLIZ = LIZ(i, str, null);
            if (bubbleLIZ != null && bubbleLIZ.bubbleType == 17 && (str2 = bubbleLIZ.longContent) != null) {
                if (str6 == null) {
                    str6 = "20";
                }
                String strLJJIFFI = u.LJJIFFI(str2, "{countDown}", str6, false);
                if (strLJJIFFI != null) {
                    if (str7 == null) {
                        str7 = CardStruct.IStatusCode.DEFAULT;
                    }
                    bubbleLIZ.LJII = u.LJJIFFI(strLJJIFFI, "{number}", str7, false);
                    baseTaskEventTimerPendantManager.LJJJLIIL(bubbleLIZ, false);
                    C1894320zOY c1894320zOY = C1894320zOY.LIZ;
                    int i2 = bubbleLIZ.LIZ;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("sub_type", String.valueOf(bubbleLIZ.bubbleType));
                    C01GW<SpecActPendantManager> c01gw = SpecActPendantManager.LLJJIJIIJIL;
                    linkedHashMap.put("vv_cnt", String.valueOf(C1894330zOZ.LIZ().LJIILJJIL()));
                    if (str5 == null) {
                        str5 = "";
                    }
                    linkedHashMap.put("task_key", str5);
                    Integer num7 = bubbleLIZ.LIZJ;
                    c1894320zOY.getClass();
                    C1894320zOY.LJIJJ(i2, linkedHashMap, num7, null, null, "");
                    return;
                }
                return;
            }
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("widget status does not match(isBound:");
        sbLIZ.append(Boolean.valueOf(baseTaskEventTimerPendantManager.LJJ()));
        sbLIZ.append(", isShowing:");
        sbLIZ.append(Boolean.valueOf(baseTaskEventTimerPendantManager.LJJJJJ()));
        sbLIZ.append(", isShrink:");
        if (baseTaskEventTimerPendantManager.LLJ == 1) {
            z = true;
        }
        sbLIZ.append(Boolean.valueOf(z));
        sbLIZ.append("), return.");
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LJ(BaseTimerPendantManager baseTimerPendantManager, int i, String str, String str2, String str3, boolean z, boolean z2) {
        C01U6.LIZLLL(new C1898250zUt(i, null, null, baseTimerPendantManager, str, str2, str3, z2, z));
    }
}
