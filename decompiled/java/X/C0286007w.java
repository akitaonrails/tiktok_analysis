package X;

import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchCoreScenariosMetricsSetting;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleInfoResponse;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleUserInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.CommonCardInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.CriticalStrikeCardInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.EffectingCard;
import com.bytedance.android.livesdkapi.depend.model.live.match.ExtraTimeCardInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.SmokeCardInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.SpecialEffectCardInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.Top2CardInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.Top3CardInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.VaultGloveCardInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: renamed from: X.007w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0286007w {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(int i) {
        String label;
        EnumC0287007x.Companion.getClass();
        EnumC0287007x enumC0287007x = EnumC0287007x.byRawType.get(Integer.valueOf(i));
        if (enumC0287007x == null || (label = enumC0287007x.getLabel()) == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("msg_type_");
            sbLIZ.append(i);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return label;
    }

    public static C1144660ftQ LIZJ(CriticalStrikeCardInfo criticalStrikeCardInfo) {
        BattleUserInfo battleUserInfo;
        long j;
        long j2;
        long j3;
        UUID uuidRandomUUID = UUID.randomUUID();
        if (criticalStrikeCardInfo != null) {
            battleUserInfo = criticalStrikeCardInfo.sendUser;
        } else {
            battleUserInfo = null;
        }
        long j4 = 0;
        if (criticalStrikeCardInfo != null) {
            j = criticalStrikeCardInfo.sendTimeSec;
            j2 = criticalStrikeCardInfo.toAnchorId;
            j3 = criticalStrikeCardInfo.effectTimeSec;
            j4 = criticalStrikeCardInfo.effectLastDuration;
        } else {
            j = 0;
            j2 = 0;
            j3 = 0;
        }
        return new C1144660ftQ(uuidRandomUUID, 1, battleUserInfo, j, j2, j3, j4);
    }

    public static C1144660ftQ LIZLLL(ExtraTimeCardInfo extraTimeCardInfo) {
        BattleUserInfo battleUserInfo;
        long j;
        long j2;
        long j3;
        UUID uuidRandomUUID = UUID.randomUUID();
        if (extraTimeCardInfo != null) {
            battleUserInfo = extraTimeCardInfo.sendUser;
        } else {
            battleUserInfo = null;
        }
        long j4 = 0;
        if (extraTimeCardInfo != null) {
            j = extraTimeCardInfo.sendTimeSec;
            j2 = extraTimeCardInfo.toAnchorId;
            j3 = extraTimeCardInfo.effectTimeSec;
            j4 = extraTimeCardInfo.effectLastDuration;
        } else {
            j = 0;
            j2 = 0;
            j3 = 0;
        }
        return new C1144660ftQ(uuidRandomUUID, 3, battleUserInfo, j, j2, j3, j4);
    }

    public static C1144660ftQ LJ(SmokeCardInfo smokeCardInfo) {
        BattleUserInfo battleUserInfo;
        long j;
        long j2;
        long j3;
        UUID uuidRandomUUID = UUID.randomUUID();
        if (smokeCardInfo != null) {
            battleUserInfo = smokeCardInfo.sendUser;
        } else {
            battleUserInfo = null;
        }
        long j4 = 0;
        if (smokeCardInfo != null) {
            j = smokeCardInfo.sendTimeSec;
            j2 = smokeCardInfo.toAnchorId;
            j3 = smokeCardInfo.effectTimeSec;
            j4 = smokeCardInfo.effectLastDuration;
        } else {
            j = 0;
            j2 = 0;
            j3 = 0;
        }
        return new C1144660ftQ(uuidRandomUUID, 2, battleUserInfo, j, j2, j3, j4);
    }

    public static C1144660ftQ LJFF(SpecialEffectCardInfo specialEffectCardInfo) {
        BattleUserInfo battleUserInfo;
        long j;
        long j2;
        long j3;
        UUID uuidRandomUUID = UUID.randomUUID();
        if (specialEffectCardInfo != null) {
            battleUserInfo = specialEffectCardInfo.sendUser;
        } else {
            battleUserInfo = null;
        }
        long j4 = 0;
        if (specialEffectCardInfo != null) {
            j = specialEffectCardInfo.sendTimeSec;
            j2 = specialEffectCardInfo.toAnchorId;
            j3 = specialEffectCardInfo.effectTimeSec;
            j4 = specialEffectCardInfo.effectLastDuration;
        } else {
            j = 0;
            j2 = 0;
            j3 = 0;
        }
        return new C1144660ftQ(uuidRandomUUID, 4, battleUserInfo, j, j2, j3, j4);
    }

    public static C1144660ftQ LJI(Top2CardInfo top2CardInfo) {
        CommonCardInfo commonCardInfo;
        long j;
        long j2;
        long j3;
        BattleUserInfo battleUserInfo = null;
        if (top2CardInfo != null) {
            commonCardInfo = top2CardInfo.common;
        } else {
            commonCardInfo = null;
        }
        UUID uuidRandomUUID = UUID.randomUUID();
        if (commonCardInfo != null) {
            battleUserInfo = commonCardInfo.sendUser;
        }
        long j4 = 0;
        if (commonCardInfo != null) {
            j = commonCardInfo.sendTimeSec;
            j2 = commonCardInfo.toAnchorId;
            j3 = commonCardInfo.effectTimeSec;
            j4 = commonCardInfo.effectLastDuration;
        } else {
            j = 0;
            j2 = 0;
            j3 = 0;
        }
        return new C1144660ftQ(uuidRandomUUID, 7, battleUserInfo, j, j2, j3, j4);
    }

    public static C1144660ftQ LJII(Top3CardInfo top3CardInfo) {
        CommonCardInfo commonCardInfo;
        long j;
        long j2;
        long j3;
        BattleUserInfo battleUserInfo = null;
        if (top3CardInfo != null) {
            commonCardInfo = top3CardInfo.common;
        } else {
            commonCardInfo = null;
        }
        UUID uuidRandomUUID = UUID.randomUUID();
        if (commonCardInfo != null) {
            battleUserInfo = commonCardInfo.sendUser;
        }
        long j4 = 0;
        if (commonCardInfo != null) {
            j = commonCardInfo.sendTimeSec;
            j2 = commonCardInfo.toAnchorId;
            j3 = commonCardInfo.effectTimeSec;
            j4 = commonCardInfo.effectLastDuration;
        } else {
            j = 0;
            j2 = 0;
            j3 = 0;
        }
        return new C1144660ftQ(uuidRandomUUID, 8, battleUserInfo, j, j2, j3, j4);
    }

    public static C1144660ftQ LJIIIIZZ(VaultGloveCardInfo vaultGloveCardInfo) {
        CommonCardInfo commonCardInfo;
        long j;
        long j2;
        long j3;
        BattleUserInfo battleUserInfo = null;
        if (vaultGloveCardInfo != null) {
            commonCardInfo = vaultGloveCardInfo.common;
        } else {
            commonCardInfo = null;
        }
        UUID uuidRandomUUID = UUID.randomUUID();
        if (commonCardInfo != null) {
            battleUserInfo = commonCardInfo.sendUser;
        }
        long j4 = 0;
        if (commonCardInfo != null) {
            j = commonCardInfo.sendTimeSec;
            j2 = commonCardInfo.toAnchorId;
            j3 = commonCardInfo.effectTimeSec;
            j4 = commonCardInfo.effectLastDuration;
        } else {
            j = 0;
            j2 = 0;
            j3 = 0;
        }
        return new C1144660ftQ(uuidRandomUUID, 9, battleUserInfo, j, j2, j3, j4);
    }

    public static C178500mN LIZIZ(boolean z, boolean z2, BattleInfoResponse battleInfoResponse) {
        ArrayList arrayList;
        long jLJLIIL;
        long jLJLIIIL;
        if (z2) {
            arrayList = new ArrayList();
            for (Map.Entry<Long, EffectingCard> entry : battleInfoResponse.teamBattleItemCards.entrySet()) {
                entry.getKey().longValue();
                EffectingCard value = entry.getValue();
                if (value != null) {
                    List<CriticalStrikeCardInfo> list = value.criticalStrikeCards;
                    if (list != null) {
                        Iterator it2 = ((ArrayList) C13LP.LJJJJLI(list)).iterator();
                        while (it2.hasNext()) {
                            arrayList.add(LIZJ((CriticalStrikeCardInfo) it2.next()));
                        }
                    }
                    List<SmokeCardInfo> list2 = value.smokeCards;
                    if (list2 != null) {
                        Iterator it3 = ((ArrayList) C13LP.LJJJJLI(list2)).iterator();
                        while (it3.hasNext()) {
                            arrayList.add(LJ((SmokeCardInfo) it3.next()));
                        }
                    }
                    List<ExtraTimeCardInfo> list3 = value.extraTimeCards;
                    if (list3 != null) {
                        Iterator it4 = ((ArrayList) C13LP.LJJJJLI(list3)).iterator();
                        while (it4.hasNext()) {
                            arrayList.add(LIZLLL((ExtraTimeCardInfo) it4.next()));
                        }
                    }
                    List<SpecialEffectCardInfo> list4 = value.specialEffectCards;
                    if (list4 != null) {
                        Iterator it5 = ((ArrayList) C13LP.LJJJJLI(list4)).iterator();
                        while (it5.hasNext()) {
                            arrayList.add(LJFF((SpecialEffectCardInfo) it5.next()));
                        }
                    }
                }
                if (LiveMatchCoreScenariosMetricsSetting.INSTANCE.enablePowerupTrack() && value != null) {
                    List<Top2CardInfo> list5 = value.top2Cards;
                    if (list5 != null) {
                        Iterator it6 = ((ArrayList) C13LP.LJJJJLI(list5)).iterator();
                        while (it6.hasNext()) {
                            arrayList.add(LJI((Top2CardInfo) it6.next()));
                        }
                    }
                    List<Top3CardInfo> list6 = value.top3Cards;
                    if (list6 != null) {
                        Iterator it7 = ((ArrayList) C13LP.LJJJJLI(list6)).iterator();
                        while (it7.hasNext()) {
                            arrayList.add(LJII((Top3CardInfo) it7.next()));
                        }
                    }
                }
            }
        } else {
            arrayList = new ArrayList();
            Map<Long, EffectingCard> map = battleInfoResponse.battleItemCards;
            if (map != null) {
                for (Map.Entry<Long, EffectingCard> entry2 : map.entrySet()) {
                    entry2.getKey().longValue();
                    EffectingCard value2 = entry2.getValue();
                    if (value2 != null) {
                        List<CriticalStrikeCardInfo> list7 = value2.criticalStrikeCards;
                        if (list7 != null) {
                            Iterator it8 = ((ArrayList) C13LP.LJJJJLI(list7)).iterator();
                            while (it8.hasNext()) {
                                arrayList.add(LIZJ((CriticalStrikeCardInfo) it8.next()));
                            }
                        }
                        List<SmokeCardInfo> list8 = value2.smokeCards;
                        if (list8 != null) {
                            Iterator it9 = ((ArrayList) C13LP.LJJJJLI(list8)).iterator();
                            while (it9.hasNext()) {
                                arrayList.add(LJ((SmokeCardInfo) it9.next()));
                            }
                        }
                        List<ExtraTimeCardInfo> list9 = value2.extraTimeCards;
                        if (list9 != null) {
                            Iterator it10 = ((ArrayList) C13LP.LJJJJLI(list9)).iterator();
                            while (it10.hasNext()) {
                                arrayList.add(LIZLLL((ExtraTimeCardInfo) it10.next()));
                            }
                        }
                        List<SpecialEffectCardInfo> list10 = value2.specialEffectCards;
                        if (list10 != null) {
                            Iterator it11 = ((ArrayList) C13LP.LJJJJLI(list10)).iterator();
                            while (it11.hasNext()) {
                                arrayList.add(LJFF((SpecialEffectCardInfo) it11.next()));
                            }
                        }
                    }
                    if (LiveMatchCoreScenariosMetricsSetting.INSTANCE.enablePowerupTrack() && value2 != null) {
                        List<Top2CardInfo> list11 = value2.top2Cards;
                        if (list11 != null) {
                            Iterator it12 = ((ArrayList) C13LP.LJJJJLI(list11)).iterator();
                            while (it12.hasNext()) {
                                arrayList.add(LJI((Top2CardInfo) it12.next()));
                            }
                        }
                        List<Top3CardInfo> list12 = value2.top3Cards;
                        if (list12 != null) {
                            Iterator it13 = ((ArrayList) C13LP.LJJJJLI(list12)).iterator();
                            while (it13.hasNext()) {
                                arrayList.add(LJII((Top3CardInfo) it13.next()));
                            }
                        }
                    }
                }
            }
        }
        EnumC0300008k enumC0300008k = EnumC0300008k.BATTLE_INFO_RESPONSE;
        Long l = battleInfoResponse.channelId;
        if (l != null) {
            jLJLIIL = l.longValue();
        } else {
            jLJLIIL = C973890bRz.LIZ.LJLIIL();
        }
        Long l2 = battleInfoResponse.battleId;
        if (l2 != null) {
            jLJLIIIL = l2.longValue();
        } else {
            jLJLIIIL = C973890bRz.LIZ.LJLIIIL();
        }
        return new C178500mN(arrayList, new C1144670ftR(enumC0300008k, jLJLIIL, jLJLIIIL, null, null, null, null), z);
    }
}
