package X;

import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.api.BroadcastRoomApi;
import com.bytedance.android.livesdk.chatroom.model.AnchorFinishEncourageData;
import com.bytedance.android.livesdk.livesetting.broadcast.AnchorFinishEncourageABSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.AnchorFinishEncourageV2ABSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterMockToolSwitch;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import tikcast.api.anchor_data.FinishEncourageContainer;
import tikcast.api.anchor_data.FinishEncourageDecoupling;
import tikcast.api.anchor_data.FinishEncourageGiftGallery;
import tikcast.api.anchor_data.FinishEncourageLOP;
import tikcast.api.anchor_data.FinishEncourageLiveAchievement;
import tikcast.api.anchor_data.FinishEncourageLiveGoal;
import tikcast.api.anchor_data.FinishEncourageLiveJourney;
import tikcast.api.anchor_data.FinishEncourageRanking;
import tikcast.api.anchor_data.FinishEncourageStrongerContainer;
import tikcast.api.anchor_data.FinishEncourageTask;
import tikcast.api.anchor_data.FinishEncourageWeakContainer;

/* JADX INFO: renamed from: X.15CY, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15CY {
    public static int LIZ = -12703716;
    public static int LIZIZ = -12899817;
    public static int LIZJ;
    public static int LIZLLL;
    public static boolean LJ;
    public static boolean LJFF;
    public static List<FinishEncourageContainer> LJI;
    public static final ArrayList<C15CV> LJII;
    public static Long LJIIIIZZ;
    public static Long LJIIIZ;

    public static boolean LJJ() {
        return LIZJ == 2 && LJ && AnchorFinishEncourageABSetting.INSTANCE.isMatch();
    }

    public static boolean LJJI() {
        return LIZLLL == 2 && LJFF && AnchorFinishEncourageV2ABSetting.INSTANCE.isEnable();
    }

    static {
        new ArrayList();
        LJII = new ArrayList<>();
    }

    public static Integer LJFF(FinishEncourageLiveAchievement finishEncourageLiveAchievement) {
        List<FinishEncourageTask> list;
        FinishEncourageTask finishEncourageTask;
        if (finishEncourageLiveAchievement != null && (list = finishEncourageLiveAchievement.taskList) != null && (!list.isEmpty()) && (finishEncourageTask = (FinishEncourageTask) C13LP.LJJJLL(finishEncourageLiveAchievement.taskList)) != null) {
            return Integer.valueOf((int) finishEncourageTask.progress);
        }
        return null;
    }

    public static JSONObject LJII(AnchorFinishEncourageData anchorFinishEncourageData) throws JSONException {
        AnchorFinishEncourageData.LopInfo lopInfo;
        int i;
        int i2;
        Object obj;
        Long lValueOf;
        AnchorFinishEncourageData.LiveJourneyInfo liveJourneyInfo;
        AnchorFinishEncourageData.UpgradeLevelInfo upgradeLevelInfo;
        AnchorFinishEncourageData.LiveJourneyInfo liveJourneyInfo2;
        AnchorFinishEncourageData.UpgradeLevelInfo upgradeLevelInfo2;
        Long lValueOf2 = null;
        if (anchorFinishEncourageData != null) {
            lopInfo = anchorFinishEncourageData.lopInfo;
        } else {
            lopInfo = null;
        }
        int i3 = 1;
        if (lopInfo != null) {
            i = 1;
        } else {
            i = 0;
        }
        if (anchorFinishEncourageData != null && anchorFinishEncourageData.liveJourneyInfo != null) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        if (anchorFinishEncourageData == null || anchorFinishEncourageData.achievementInfo == null) {
            i3 = 0;
        }
        String str = "upgrade";
        if (LJIJI(anchorFinishEncourageData)) {
            obj = "upgrade";
        } else {
            obj = "others";
        }
        if (!LJIJ(anchorFinishEncourageData)) {
            str = "others";
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("anchor_id", LJIIIZ);
        jSONObject.put("room_id", LJIIIIZZ);
        jSONObject.put("has_lop", i);
        if (i != 0) {
            jSONObject.put("lop_trigger_type", obj);
        }
        jSONObject.put("has_live_journey", i2);
        if (i2 != 0) {
            jSONObject.put("live_journey_trigger_type", str);
            if (anchorFinishEncourageData != null && (liveJourneyInfo2 = anchorFinishEncourageData.liveJourneyInfo) != null && (upgradeLevelInfo2 = liveJourneyInfo2.upgradeLevelInfo) != null) {
                lValueOf = Long.valueOf(upgradeLevelInfo2.lastLevel);
            } else {
                lValueOf = null;
            }
            jSONObject.put("anchor_level_initial", lValueOf);
            if (anchorFinishEncourageData != null && (liveJourneyInfo = anchorFinishEncourageData.liveJourneyInfo) != null && (upgradeLevelInfo = liveJourneyInfo.upgradeLevelInfo) != null) {
                lValueOf2 = Long.valueOf(upgradeLevelInfo.currentLevel);
            }
            jSONObject.put("anchor_level_achieved", lValueOf2);
        }
        jSONObject.put("has_achievement", i3);
        return jSONObject;
    }

    public static JSONObject LJIIIIZZ(List list) throws JSONException {
        boolean z;
        int i;
        int iIntValue;
        List<Integer> list2;
        boolean z2;
        int i2;
        FinishEncourageWeakContainer finishEncourageWeakContainer;
        FinishEncourageRanking finishEncourageRanking;
        FinishEncourageRanking finishEncourageRanking2;
        FinishEncourageWeakContainer finishEncourageWeakContainer2;
        FinishEncourageLiveJourney finishEncourageLiveJourney;
        FinishEncourageLiveJourney finishEncourageLiveJourney2;
        Object obj;
        FinishEncourageWeakContainer finishEncourageWeakContainer3;
        FinishEncourageLOP finishEncourageLOP;
        FinishEncourageLOP finishEncourageLOP2;
        FinishEncourageWeakContainer finishEncourageWeakContainer4;
        List<Integer> list3;
        FinishEncourageWeakContainer finishEncourageWeakContainer5;
        FinishEncourageDecoupling finishEncourageDecoupling;
        FinishEncourageDecoupling finishEncourageDecoupling2;
        if (list != null && !list.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            i = 0;
        } else {
            C118300cf c118300cf = new C118300cf();
            int i3 = 0;
            for (Object obj2 : list) {
                int i4 = i3 + 1;
                if (i3 >= 0) {
                    FinishEncourageContainer finishEncourageContainer = (FinishEncourageContainer) obj2;
                    int i5 = finishEncourageContainer.containsType;
                    if (i5 == 1) {
                        c118300cf.element++;
                    } else if (i5 == 2) {
                        FinishEncourageWeakContainer finishEncourageWeakContainer6 = finishEncourageContainer.weakContainer;
                        if (finishEncourageWeakContainer6 != null && (list2 = finishEncourageWeakContainer6.type) != null) {
                            iIntValue = Integer.valueOf(c118300cf.element + list2.size()).intValue();
                        } else {
                            iIntValue = 0;
                        }
                        c118300cf.element = iIntValue;
                    }
                    i3 = i4;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            i = c118300cf.element;
        }
        boolean zLJIILL = LJIILL(1, list);
        boolean zLJIILL2 = LJIILL(2, list);
        boolean zLJIILL3 = LJIILL(7, list);
        boolean zLJIILL4 = LJIILL(3, list);
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                FinishEncourageContainer finishEncourageContainer2 = (FinishEncourageContainer) it2.next();
                int i6 = finishEncourageContainer2.containsType;
                if (i6 != 1) {
                    if (i6 == 2 && (finishEncourageWeakContainer4 = finishEncourageContainer2.weakContainer) != null && (list3 = finishEncourageWeakContainer4.type) != null && list3.contains(3) && (finishEncourageWeakContainer5 = finishEncourageContainer2.weakContainer) != null && (finishEncourageDecoupling = finishEncourageWeakContainer5.decoupling) != null && finishEncourageDecoupling.recvFirstGift) {
                        z2 = true;
                        break;
                    }
                } else {
                    FinishEncourageStrongerContainer finishEncourageStrongerContainer = finishEncourageContainer2.strongerContainer;
                    if (finishEncourageStrongerContainer != null && finishEncourageStrongerContainer.decoupling != null && finishEncourageStrongerContainer != null && (finishEncourageDecoupling2 = finishEncourageStrongerContainer.decoupling) != null && finishEncourageDecoupling2.recvFirstGift) {
                        z2 = true;
                        break;
                    }
                }
            }
            z2 = false;
        } else {
            z2 = false;
        }
        boolean zLJIILL5 = LJIILL(5, list);
        boolean zLJIILL6 = LJIILL(6, list);
        boolean zLJIILL7 = LJIILL(4, list);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("content_cnt", i);
        jSONObject.put("anchor_id", LJIIIZ);
        jSONObject.put("room_id", LJIIIIZZ);
        String str = "upgrade";
        if (zLJIILL) {
            jSONObject.put("has_lop", 1);
            if (list == null) {
                obj = "others";
                jSONObject.put("lop_trigger_type", obj);
            } else {
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    FinishEncourageContainer finishEncourageContainer3 = (FinishEncourageContainer) it3.next();
                    int i7 = finishEncourageContainer3.containsType;
                    if (i7 != 1) {
                        if (i7 == 2 && (finishEncourageWeakContainer3 = finishEncourageContainer3.weakContainer) != null && (finishEncourageLOP = finishEncourageWeakContainer3.lop) != null && finishEncourageLOP.isLevelUp) {
                            obj = "upgrade";
                            break;
                        }
                    } else {
                        FinishEncourageStrongerContainer finishEncourageStrongerContainer2 = finishEncourageContainer3.strongerContainer;
                        if (finishEncourageStrongerContainer2 != null && (finishEncourageLOP2 = finishEncourageStrongerContainer2.lop) != null && finishEncourageLOP2.isLevelUp) {
                            obj = "upgrade";
                            break;
                        }
                    }
                }
                obj = "others";
                jSONObject.put("lop_trigger_type", obj);
            }
        }
        if (zLJIILL2) {
            jSONObject.put("has_live_journey", 1);
            if (list == null) {
                str = "others";
                jSONObject.put("live_journey_trigger_type", str);
            } else {
                Iterator it4 = list.iterator();
                while (it4.hasNext()) {
                    FinishEncourageContainer finishEncourageContainer4 = (FinishEncourageContainer) it4.next();
                    int i8 = finishEncourageContainer4.containsType;
                    if (i8 != 1) {
                        if (i8 == 2 && (finishEncourageWeakContainer2 = finishEncourageContainer4.weakContainer) != null && (finishEncourageLiveJourney = finishEncourageWeakContainer2.liveJourney) != null && finishEncourageLiveJourney.isLevelUp) {
                            break;
                        }
                    } else {
                        FinishEncourageStrongerContainer finishEncourageStrongerContainer3 = finishEncourageContainer4.strongerContainer;
                        if (finishEncourageStrongerContainer3 != null && (finishEncourageLiveJourney2 = finishEncourageStrongerContainer3.liveJourney) != null && finishEncourageLiveJourney2.isLevelUp) {
                            break;
                        }
                    }
                }
                str = "others";
                jSONObject.put("live_journey_trigger_type", str);
            }
        }
        if (zLJIILL3) {
            jSONObject.put("has_achievement", 1);
        }
        if (zLJIILL6) {
            jSONObject.put("has_ranking", 1);
            if (list != null) {
                Iterator it5 = list.iterator();
                int i9 = 0;
                while (true) {
                    if (!it5.hasNext()) {
                        break;
                    }
                    Object next = it5.next();
                    int i10 = i9 + 1;
                    if (i9 >= 0) {
                        FinishEncourageContainer finishEncourageContainer5 = (FinishEncourageContainer) next;
                        int i11 = finishEncourageContainer5.containsType;
                        if (i11 == 1) {
                            FinishEncourageStrongerContainer finishEncourageStrongerContainer4 = finishEncourageContainer5.strongerContainer;
                            if (finishEncourageStrongerContainer4 != null && finishEncourageStrongerContainer4.type == 6 && finishEncourageStrongerContainer4.ranking != null) {
                                if (finishEncourageStrongerContainer4 == null || (finishEncourageRanking2 = finishEncourageStrongerContainer4.ranking) == null) {
                                    break;
                                }
                                i2 = finishEncourageRanking2.rankType;
                            } else {
                                i9 = i10;
                            }
                        } else if (i11 == 2 && (finishEncourageWeakContainer = finishEncourageContainer5.weakContainer) != null && finishEncourageWeakContainer.ranking != null) {
                            if (finishEncourageWeakContainer == null || (finishEncourageRanking = finishEncourageWeakContainer.ranking) == null) {
                                break;
                            }
                            i2 = finishEncourageRanking.rankType;
                        } else {
                            i9 = i10;
                        }
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
                i2 = 0;
                jSONObject.put("ranking_trigger_type", LJIIJJI(Integer.valueOf(i2)));
            } else {
                i2 = 0;
                jSONObject.put("ranking_trigger_type", LJIIJJI(Integer.valueOf(i2)));
            }
        }
        if (zLJIILL4) {
            jSONObject.put("has_slr", 1);
        }
        if (z2) {
            jSONObject.put("is_slr_first", 1);
        }
        if (zLJIILL5) {
            jSONObject.put("has_gift_gallery", 1);
        }
        if (zLJIILL7) {
            jSONObject.put("has_live_goal", 1);
        }
        return jSONObject;
    }

    public static ArrayList LJIIIZ(AnchorFinishEncourageData anchorFinishEncourageData) {
        ArrayList<C15CV> arrayList = LJII;
        arrayList.clear();
        if (anchorFinishEncourageData != null) {
            boolean zLJIJI = LJIJI(anchorFinishEncourageData);
            boolean zLJIJ = LJIJ(anchorFinishEncourageData);
            if (anchorFinishEncourageData.lopInfo != null && zLJIJI) {
                arrayList.add(C15CV.LOP);
            }
            if (anchorFinishEncourageData.liveJourneyInfo != null && zLJIJ) {
                arrayList.add(C15CV.LIVE_JOURNEY);
            }
            if (anchorFinishEncourageData.achievementInfo != null) {
                arrayList.add(C15CV.ACHIEVEMENT);
            }
            if (anchorFinishEncourageData.lopInfo != null && !zLJIJI) {
                arrayList.add(C15CV.LOP);
            }
            if (anchorFinishEncourageData.liveJourneyInfo != null && !zLJIJ) {
                arrayList.add(C15CV.LIVE_JOURNEY);
            }
        }
        return arrayList;
    }

    public static ArrayList LJIIJ(List list) {
        LJII.clear();
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                int i = ((FinishEncourageContainer) it2.next()).containsType;
                if (i != 1) {
                    if (i == 2) {
                        LJII.add(C15CV.WEAK_CONTAINER);
                    }
                } else {
                    LJII.add(C15CV.STRONG_CONTAINER);
                }
            }
        }
        return LJII;
    }

    public static String LJIIJJI(Integer num) {
        if (num != null) {
            if (num.intValue() == 9) {
                return "daily";
            }
            if (num.intValue() == 3) {
                return "weekly";
            }
            if (num.intValue() == 2) {
                return "hour";
            }
            if (num.intValue() == 19) {
                return "league";
            }
            return "";
        }
        return "";
    }

    public static boolean LJIILLIIL(AnchorFinishEncourageData anchorFinishEncourageData) {
        if (anchorFinishEncourageData != null && LJIIIZ(anchorFinishEncourageData).size() > 1) {
            return true;
        }
        return false;
    }

    public static boolean LJIJ(AnchorFinishEncourageData anchorFinishEncourageData) {
        AnchorFinishEncourageData.LiveJourneyInfo liveJourneyInfo;
        AnchorFinishEncourageData.UpgradeLevelInfo upgradeLevelInfo;
        AnchorFinishEncourageData.UpgradeLevelInfo upgradeLevelInfo2;
        if (anchorFinishEncourageData != null && (liveJourneyInfo = anchorFinishEncourageData.liveJourneyInfo) != null && (upgradeLevelInfo = liveJourneyInfo.upgradeLevelInfo) != null) {
            Long lValueOf = null;
            Long lValueOf2 = Long.valueOf(upgradeLevelInfo.lastLevel);
            AnchorFinishEncourageData.LiveJourneyInfo liveJourneyInfo2 = anchorFinishEncourageData.liveJourneyInfo;
            if (liveJourneyInfo2 != null && (upgradeLevelInfo2 = liveJourneyInfo2.upgradeLevelInfo) != null) {
                lValueOf = Long.valueOf(upgradeLevelInfo2.currentLevel);
            }
            return !Intrinsics.LJFF(lValueOf2, lValueOf);
        }
        return false;
    }

    public static boolean LJIJI(AnchorFinishEncourageData anchorFinishEncourageData) {
        AnchorFinishEncourageData.LopInfo lopInfo;
        AnchorFinishEncourageData.UpgradeLevelInfo upgradeLevelInfo;
        AnchorFinishEncourageData.UpgradeLevelInfo upgradeLevelInfo2;
        if (anchorFinishEncourageData != null && (lopInfo = anchorFinishEncourageData.lopInfo) != null && (upgradeLevelInfo = lopInfo.upgradeLevelInfo) != null) {
            Long lValueOf = null;
            Long lValueOf2 = Long.valueOf(upgradeLevelInfo.lastLevel);
            AnchorFinishEncourageData.LopInfo lopInfo2 = anchorFinishEncourageData.lopInfo;
            if (lopInfo2 != null && (upgradeLevelInfo2 = lopInfo2.upgradeLevelInfo) != null) {
                lValueOf = Long.valueOf(upgradeLevelInfo2.currentLevel);
            }
            return !Intrinsics.LJFF(lValueOf2, lValueOf);
        }
        return false;
    }

    public static void LJIJJLI(long j) {
        if (LIZJ != 1) {
            AnchorFinishEncourageABSetting anchorFinishEncourageABSetting = AnchorFinishEncourageABSetting.INSTANCE;
            if (anchorFinishEncourageABSetting.isMatch()) {
                LIZJ = 1;
                C480460Ism.LIZ().getClass();
                ((BroadcastRoomApi) C480460Ism.LIZLLL(BroadcastRoomApi.class)).getFinishEncourage(j, true, anchorFinishEncourageABSetting.getValue()).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: X.0UWx
                    @Override // X.C09JN
                    public final void accept(Object obj) {
                        C1C7U.LIZ("EndIncentiveSettlementHelper@916.preloadQueryFinishEncourage$1");
                        C15CY.LIZJ = 2;
                        T t = ((BaseResponse) obj).data;
                        if (t != null) {
                            C15CY.LJ = ((AnchorFinishEncourageData) t).showAnchorFinishEncouragePage;
                        } else {
                            C15CY.LJ = false;
                        }
                        C1C7U.LIZIZ("EndIncentiveSettlementHelper@916.preloadQueryFinishEncourage$1");
                    }
                }, new C09JN() { // from class: X.0UTa
                    @Override // X.C09JN
                    public final void accept(Object obj) {
                        C1C7U.LIZ("EndIncentiveSettlementHelper@916.preloadQueryFinishEncourage$2");
                        C15CY.LJ = false;
                        C15CY.LIZJ = 2;
                        C20441214yg.LJII((Throwable) obj);
                        C1C7U.LIZIZ("EndIncentiveSettlementHelper@916.preloadQueryFinishEncourage$2");
                    }
                });
            }
        }
    }

    public static void LIZIZ(AnchorFinishEncourageData anchorFinishEncourageData, String str) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_positive_feedback_click");
        c474500IjALIZ.LJJIIJZLJL(LJII(anchorFinishEncourageData));
        c474500IjALIZ.LJJII(str, "action_type");
        c474500IjALIZ.LIZ();
    }

    public static void LIZJ(String str, List list) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_positive_feedback_click");
        c474500IjALIZ.LJJIIJZLJL(LJIIIIZZ(list));
        c474500IjALIZ.LJJII(str, "action_type");
        c474500IjALIZ.LIZ();
    }

    public static String LJI(FinishEncourageLiveAchievement finishEncourageLiveAchievement, boolean z) {
        List<FinishEncourageTask> list;
        FinishEncourageTask finishEncourageTask;
        if (finishEncourageLiveAchievement != null && (list = finishEncourageLiveAchievement.taskList) != null && (finishEncourageTask = (FinishEncourageTask) C13LP.LJJJLL(list)) != null) {
            int i = finishEncourageLiveAchievement.achievementType;
            if (i == 1) {
                double d = finishEncourageTask.progress;
                if (d >= 1.0d && d < 5.0d) {
                    if (z) {
                        return "ttlive_finish_encourage_ach_minidiamondsfirst.zip";
                    }
                    return "ttlive_finish_encourage_ach_diamondfirst.zip";
                }
                if (d >= 5.0d) {
                    if (z) {
                        return "ttlive_finish_encourage_ach_minidiamonds.zip";
                    }
                    return "ttlive_finish_encourage_ach_diamonds.zip";
                }
            } else if (i == 5) {
                double d2 = finishEncourageTask.progress;
                if (d2 >= 2.0d) {
                    if (z) {
                        return "ttlive_finish_encourage_ach_miniduration.zip";
                    }
                    return "ttlive_finish_encourage_ach_duration.zip";
                }
                if (d2 >= 1.0d && d2 < 2.0d) {
                    if (z) {
                        return "ttlive_finish_encourage_ach_minidurationfirst.zip";
                    }
                    return "ttlive_finish_encourage_ach_durationfirst.zip";
                }
            }
            if (z) {
                return "ttlive_finish_encourage_ach_minidiamondsfirst.zip";
            }
            return "ttlive_finish_encourage_ach_diamondfirst.zip";
        }
        if (z) {
            return "ttlive_finish_encourage_ach_minidiamondsfirst.zip";
        }
        return "ttlive_finish_encourage_ach_diamondfirst.zip";
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x0007, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJIILL(int r6, java.util.List r7) {
        /*
            r5 = 0
            if (r7 == 0) goto L71
            java.util.Iterator r4 = r7.iterator()
        L7:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L71
            java.lang.Object r3 = r4.next()
            tikcast.api.anchor_data.FinishEncourageContainer r3 = (tikcast.api.anchor_data.FinishEncourageContainer) r3
            int r2 = r3.containsType
            r1 = 1
            if (r2 == r1) goto L2e
            r0 = 2
            if (r2 != r0) goto L7
            tikcast.api.anchor_data.FinishEncourageWeakContainer r0 = r3.weakContainer
            if (r0 == 0) goto L7
            java.util.List<java.lang.Integer> r2 = r0.type
            if (r2 == 0) goto L7
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            boolean r0 = r2.contains(r0)
            if (r0 != r1) goto L7
            return r1
        L2e:
            switch(r6) {
                case 1: goto L32;
                case 2: goto L3b;
                case 3: goto L44;
                case 4: goto L4d;
                case 5: goto L56;
                case 6: goto L5f;
                case 7: goto L68;
                default: goto L31;
            }
        L31:
            goto L7
        L32:
            tikcast.api.anchor_data.FinishEncourageStrongerContainer r0 = r3.strongerContainer
            if (r0 == 0) goto L7
            tikcast.api.anchor_data.FinishEncourageLOP r0 = r0.lop
            if (r0 == 0) goto L7
            return r1
        L3b:
            tikcast.api.anchor_data.FinishEncourageStrongerContainer r0 = r3.strongerContainer
            if (r0 == 0) goto L7
            tikcast.api.anchor_data.FinishEncourageLiveJourney r0 = r0.liveJourney
            if (r0 == 0) goto L7
            return r1
        L44:
            tikcast.api.anchor_data.FinishEncourageStrongerContainer r0 = r3.strongerContainer
            if (r0 == 0) goto L7
            tikcast.api.anchor_data.FinishEncourageDecoupling r0 = r0.decoupling
            if (r0 == 0) goto L7
            return r1
        L4d:
            tikcast.api.anchor_data.FinishEncourageStrongerContainer r0 = r3.strongerContainer
            if (r0 == 0) goto L7
            tikcast.api.anchor_data.FinishEncourageLiveGoal r0 = r0.liveGoal
            if (r0 == 0) goto L7
            return r1
        L56:
            tikcast.api.anchor_data.FinishEncourageStrongerContainer r0 = r3.strongerContainer
            if (r0 == 0) goto L7
            tikcast.api.anchor_data.FinishEncourageGiftGallery r0 = r0.giftGallery
            if (r0 == 0) goto L7
            return r1
        L5f:
            tikcast.api.anchor_data.FinishEncourageStrongerContainer r0 = r3.strongerContainer
            if (r0 == 0) goto L7
            tikcast.api.anchor_data.FinishEncourageRanking r0 = r0.ranking
            if (r0 == 0) goto L7
            return r1
        L68:
            tikcast.api.anchor_data.FinishEncourageStrongerContainer r0 = r3.strongerContainer
            if (r0 == 0) goto L7
            tikcast.api.anchor_data.FinishEncourageLiveAchievement r0 = r0.liveAchievement
            if (r0 == 0) goto L7
            return r1
        L71:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15CY.LJIILL(int, java.util.List):boolean");
    }

    public static final void LJIL(Integer num, Integer num2) {
        if (num != null && num2 != null) {
            if (num.intValue() == 0 && num2.intValue() == 0) {
                return;
            }
            LIZ = num.intValue();
            LIZIZ = num2.intValue();
        }
    }

    public static void LIZ(AnchorFinishEncourageData anchorFinishEncourageData, String str, int i) {
        Integer numValueOf;
        AnchorFinishEncourageData.AchievementInfo achievementInfo;
        AnchorFinishEncourageData.AchievementInfo achievementInfo2;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_achievement_positive_feedback_show");
        c474500IjALIZ.LJJII(LJIIIZ, "anchor_id");
        c474500IjALIZ.LJJII(LJIIIIZZ, "room_id");
        c474500IjALIZ.LJJII(str, "action_type");
        Long lValueOf = null;
        if (anchorFinishEncourageData != null && (achievementInfo2 = anchorFinishEncourageData.achievementInfo) != null) {
            numValueOf = Integer.valueOf(achievementInfo2.achievementType);
        } else {
            numValueOf = null;
        }
        c474500IjALIZ.LJJII(numValueOf, "node_type");
        if (anchorFinishEncourageData != null && (achievementInfo = anchorFinishEncourageData.achievementInfo) != null) {
            lValueOf = Long.valueOf(achievementInfo.value);
        }
        c474500IjALIZ.LJJII(lValueOf, "node_value");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "index");
        c474500IjALIZ.LIZ();
    }

    public static void LIZLLL(AnchorFinishEncourageData anchorFinishEncourageData, long j, int i) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_positive_feedback_page_play");
        c474500IjALIZ.LJJIIJZLJL(LJII(anchorFinishEncourageData));
        c474500IjALIZ.LJJII(Long.valueOf(j), "duration");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "has_succeed");
        c474500IjALIZ.LIZ();
    }

    public static void LJ(int i, long j, List list) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_positive_feedback_page_play");
        c474500IjALIZ.LJJIIJZLJL(LJIIIIZZ(list));
        c474500IjALIZ.LJJII(Long.valueOf(j), "duration");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "has_succeed");
        c474500IjALIZ.LIZ();
    }

    public static void LJIIZILJ(AnchorFinishEncourageData anchorFinishEncourageData, String str, int i) {
        String str2;
        Long lValueOf;
        AnchorFinishEncourageData.LiveJourneyInfo liveJourneyInfo;
        AnchorFinishEncourageData.UpgradeLevelInfo upgradeLevelInfo;
        AnchorFinishEncourageData.LiveJourneyInfo liveJourneyInfo2;
        AnchorFinishEncourageData.UpgradeLevelInfo upgradeLevelInfo2;
        AnchorFinishEncourageData.LiveJourneyInfo liveJourneyInfo3;
        List<AnchorFinishEncourageData.Task> list;
        if (LJIJ(anchorFinishEncourageData)) {
            str2 = "upgrade";
        } else {
            str2 = "others";
        }
        Long lValueOf2 = null;
        String strLIZIZ = "";
        if (anchorFinishEncourageData != null && (liveJourneyInfo3 = anchorFinishEncourageData.liveJourneyInfo) != null && (list = liveJourneyInfo3.taskList) != null) {
            int i2 = 0;
            for (AnchorFinishEncourageData.Task task : list) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    AnchorFinishEncourageData.Task task2 = task;
                    if (i2 == 0) {
                        strLIZIZ = task2.taskIdStr;
                    } else {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(strLIZIZ);
                        sbLIZ.append('_');
                        sbLIZ.append(task2.taskIdStr);
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    }
                    i2 = i3;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_livejourney_positive_feedback_show");
        c474500IjALIZ.LJJII(LJIIIZ, "anchor_id");
        c474500IjALIZ.LJJII(LJIIIIZZ, "room_id");
        c474500IjALIZ.LJJII(str, "action_type");
        c474500IjALIZ.LJJII(str2, "live_journey_trigger_type");
        if (anchorFinishEncourageData != null && (liveJourneyInfo2 = anchorFinishEncourageData.liveJourneyInfo) != null && (upgradeLevelInfo2 = liveJourneyInfo2.upgradeLevelInfo) != null) {
            lValueOf = Long.valueOf(upgradeLevelInfo2.lastLevel);
        } else {
            lValueOf = null;
        }
        c474500IjALIZ.LJJII(lValueOf, "anchor_level_initial");
        if (anchorFinishEncourageData != null && (liveJourneyInfo = anchorFinishEncourageData.liveJourneyInfo) != null && (upgradeLevelInfo = liveJourneyInfo.upgradeLevelInfo) != null) {
            lValueOf2 = Long.valueOf(upgradeLevelInfo.currentLevel);
        }
        c474500IjALIZ.LJJII(lValueOf2, "anchor_level_achieved");
        c474500IjALIZ.LJJII(strLIZIZ, "task_id");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "index");
        c474500IjALIZ.LIZ();
    }

    public static void LJIJJ(AnchorFinishEncourageData anchorFinishEncourageData, String str, int i) {
        String str2;
        AnchorFinishEncourageData.LopInfo lopInfo;
        List<AnchorFinishEncourageData.Task> list;
        if (LJIJI(anchorFinishEncourageData)) {
            str2 = "upgrade";
        } else {
            str2 = "others";
        }
        String strLIZIZ = "";
        if (anchorFinishEncourageData != null && (lopInfo = anchorFinishEncourageData.lopInfo) != null && (list = lopInfo.taskList) != null) {
            int i2 = 0;
            for (AnchorFinishEncourageData.Task task : list) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    AnchorFinishEncourageData.Task task2 = task;
                    if (i2 == 0) {
                        strLIZIZ = task2.taskIdStr;
                    } else {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(strLIZIZ);
                        sbLIZ.append('_');
                        sbLIZ.append(task2.taskIdStr);
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    }
                    i2 = i3;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_lop_positive_feedback_show");
        c474500IjALIZ.LJJII(LJIIIZ, "anchor_id");
        c474500IjALIZ.LJJII(LJIIIIZZ, "room_id");
        c474500IjALIZ.LJJII(str, "action_type");
        c474500IjALIZ.LJJII(str2, "lop_trigger_type");
        c474500IjALIZ.LJJII(strLIZIZ, "task_id");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "index");
        c474500IjALIZ.LIZ();
    }

    public static void LJIILIIL(long j, long j2, String str, String str2) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_positive_feedback_gif_finish");
        c474500IjALIZ.LJJII(LJIIIZ, "anchor_id");
        c474500IjALIZ.LJJII(LJIIIIZZ, "room_id");
        c474500IjALIZ.LJJII(str, "feedback_type");
        c474500IjALIZ.LJJII(str2, "start_type");
        c474500IjALIZ.LJJII(Long.valueOf(j), "design_duration");
        c474500IjALIZ.LJJII(Long.valueOf(j2), "real_duration");
        c474500IjALIZ.LIZ();
    }

    public static void LJIILJJIL(Object obj, long j, String str, int i, int i2) {
        String str2;
        Object obj2;
        Object obj3;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_positive_feedback_gif_finish");
        c474500IjALIZ.LJJII(LJIIIZ, "anchor_id");
        c474500IjALIZ.LJJII(LJIIIIZZ, "room_id");
        boolean z = obj instanceof FinishEncourageLOP;
        Integer numValueOf = null;
        if (z && obj != null) {
            str2 = LiveCenterMockToolSwitch.LOP;
        } else if ((obj instanceof FinishEncourageLiveJourney) && obj != null) {
            str2 = LiveCenterMockToolSwitch.LIVEJOURNEY;
        } else if ((obj instanceof FinishEncourageDecoupling) && obj != null) {
            str2 = "slr";
        } else if ((obj instanceof FinishEncourageLiveGoal) && obj != null) {
            str2 = "live_goal";
        } else if ((obj instanceof FinishEncourageGiftGallery) && obj != null) {
            str2 = "gift_gallery";
        } else if ((obj instanceof FinishEncourageRanking) && obj != null) {
            str2 = "ranking";
        } else if ((obj instanceof FinishEncourageLiveAchievement) && obj != null) {
            str2 = "achievement";
        } else {
            str2 = "";
        }
        c474500IjALIZ.LJJII(str2, "feedback_type");
        c474500IjALIZ.LJJII("auto", "start_type");
        c474500IjALIZ.LJJII(str, "end_type");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "page_pos");
        c474500IjALIZ.LJJII(Integer.valueOf(i2), "content_pos");
        c474500IjALIZ.LJJII(Long.valueOf(j), "real_duration");
        if (z) {
            obj2 = obj;
        } else {
            obj2 = null;
        }
        String str3 = "upgrade";
        if (obj2 != null) {
            if (((FinishEncourageLOP) obj).isLevelUp) {
                obj3 = "upgrade";
            } else {
                obj3 = "others";
            }
            c474500IjALIZ.LJJII(obj3, "lop_trigger_type");
        }
        if ((obj instanceof FinishEncourageLiveJourney) && obj != null) {
            if (!((FinishEncourageLiveJourney) obj).isLevelUp) {
                str3 = "others";
            }
            c474500IjALIZ.LJJII(str3, "live_journey_trigger_type");
        }
        if ((obj instanceof FinishEncourageRanking) && obj != null) {
            c474500IjALIZ.LJJII(LJIIJJI(Integer.valueOf(((FinishEncourageRanking) obj).rankType)), "ranking_trigger_type");
        }
        if ((obj instanceof FinishEncourageDecoupling) && obj != null && ((FinishEncourageDecoupling) obj).recvFirstGift) {
            c474500IjALIZ.LJJII(1, "is_slr_first");
        }
        if ((obj instanceof FinishEncourageLiveAchievement) && obj != null) {
            FinishEncourageLiveAchievement finishEncourageLiveAchievement = (FinishEncourageLiveAchievement) obj;
            c474500IjALIZ.LJJII(LJFF(finishEncourageLiveAchievement), "achievement_node_type");
            if (finishEncourageLiveAchievement != null) {
                numValueOf = Integer.valueOf(finishEncourageLiveAchievement.achievementType);
            }
            c474500IjALIZ.LJJII(numValueOf, "achievement_node_value");
        }
        c474500IjALIZ.LIZ();
    }

    /* JADX WARN: Code restructure failed: missing block: B:169:0x01d3, code lost:
    
        if (r15 != null) goto L170;
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0015  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0249 A[PHI: r10
      0x0249: PHI (r10v1 boolean) = (r10v0 boolean), (r10v7 boolean), (r10v7 boolean), (r10v7 boolean), (r10v7 boolean), (r10v7 boolean) binds: [B:210:0x0247, B:80:0x009e, B:81:0x00a0, B:203:0x023a, B:205:0x023e, B:207:0x0242] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x024c A[PHI: r9 r10
      0x024c: PHI (r9v1 boolean) = (r9v0 boolean), (r9v5 boolean), (r9v5 boolean), (r9v5 boolean), (r9v5 boolean), (r9v5 boolean) binds: [B:212:0x024a, B:90:0x00b3, B:91:0x00b5, B:196:0x022c, B:198:0x0230, B:200:0x0234] A[DONT_GENERATE, DONT_INLINE]
      0x024c: PHI (r10v2 boolean) = (r10v1 boolean), (r10v6 boolean), (r10v6 boolean), (r10v6 boolean), (r10v6 boolean), (r10v6 boolean) binds: [B:212:0x024a, B:90:0x00b3, B:91:0x00b5, B:196:0x022c, B:198:0x0230, B:200:0x0234] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:215:0x024f A[PHI: r8 r9 r10
      0x024f: PHI (r8v1 boolean) = (r8v0 boolean), (r8v3 boolean), (r8v3 boolean), (r8v3 boolean), (r8v3 boolean) binds: [B:214:0x024d, B:100:0x00c8, B:101:0x00ca, B:103:0x00ce, B:105:0x00d2] A[DONT_GENERATE, DONT_INLINE]
      0x024f: PHI (r9v2 boolean) = (r9v1 boolean), (r9v4 boolean), (r9v4 boolean), (r9v4 boolean), (r9v4 boolean) binds: [B:214:0x024d, B:100:0x00c8, B:101:0x00ca, B:103:0x00ce, B:105:0x00d2] A[DONT_GENERATE, DONT_INLINE]
      0x024f: PHI (r10v3 boolean) = (r10v2 boolean), (r10v5 boolean), (r10v5 boolean), (r10v5 boolean), (r10v5 boolean) binds: [B:214:0x024d, B:100:0x00c8, B:101:0x00ca, B:103:0x00ce, B:105:0x00d2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00c4 A[PHI: r8 r9 r10
      0x00c4: PHI (r8v3 boolean) = (r8v0 boolean), (r8v4 boolean) binds: [B:214:0x024d, B:98:0x00c3] A[DONT_GENERATE, DONT_INLINE]
      0x00c4: PHI (r9v4 boolean) = (r9v1 boolean), (r9v5 boolean) binds: [B:214:0x024d, B:98:0x00c3] A[DONT_GENERATE, DONT_INLINE]
      0x00c4: PHI (r10v5 boolean) = (r10v2 boolean), (r10v6 boolean) binds: [B:214:0x024d, B:98:0x00c3] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIL(tikcast.api.anchor_data.FinishEncourageContainer r15, java.lang.Integer r16, long r17, java.lang.String r19, int r20, int r21) {
        /*
            Method dump skipped, instruction units count: 606
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15CY.LJIIL(tikcast.api.anchor_data.FinishEncourageContainer, java.lang.Integer, long, java.lang.String, int, int):void");
    }
}
