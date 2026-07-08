package Y;

import X.C09JN;
import X.C0K04;
import X.C1144530ftD;
import X.C1144550ftF;
import X.C1144590ftJ;
import X.C1144630ftN;
import X.C1144640ftO;
import X.C13BV;
import X.C1697810uHb;
import X.C1C7U;
import X.C20441214yg;
import X.C2188811AlT;
import X.C915980Zwa;
import X.C917350Zyn;
import X.C970370bMJ;
import X.C973660bRc;
import X.EnumC1144570ftH;
import X.EnumC919170a1j;
import X.InterfaceC500940Jki;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multimatch.matchitem.component.awardcard.MatchItemAwardCardViewModel;
import com.bytedance.android.live.liveinteract.multimatch.matchitem.model.ItemInfo4FE;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchCoreScenariosMetricsSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.match.CriticalStrikeCardInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.ExtraTimeCardInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.SmokeCardInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.SpecialEffectCardInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.Top2CardInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.Top3CardInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.VaultGloveCardInfo;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import webcast.api.battle.BattleAwardItemCardResponse;

/* JADX INFO: loaded from: classes18.dex */
public class AfS2S0101200_17 implements C09JN {
    public final int $t;
    public int i1;
    public long j2;
    public long j3;
    public Object l0;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$0(AfS2S0101200_17 afS2S0101200_17, Object obj) {
        int i;
        String str;
        boolean z;
        Object objLIZJ;
        String string;
        Object obj2;
        EnumC1144570ftH enumC1144570ftH;
        List<BattleAwardItemCardResponse.BattleAwardedItemCard> list;
        List<BattleAwardItemCardResponse.BattleAwardedItemCard> list2;
        BattleAwardItemCardResponse.BattleAwardedItemCard battleAwardedItemCard;
        CriticalStrikeCardInfo criticalStrikeCardInfo;
        List<BattleAwardItemCardResponse.BattleAwardedItemCard> list3;
        BattleAwardItemCardResponse.BattleAwardedItemCard battleAwardedItemCard2;
        SmokeCardInfo smokeCardInfo;
        List<BattleAwardItemCardResponse.BattleAwardedItemCard> list4;
        BattleAwardItemCardResponse.BattleAwardedItemCard battleAwardedItemCard3;
        ExtraTimeCardInfo extraTimeCardInfo;
        List<BattleAwardItemCardResponse.BattleAwardedItemCard> list5;
        BattleAwardItemCardResponse.BattleAwardedItemCard battleAwardedItemCard4;
        SpecialEffectCardInfo specialEffectCardInfo;
        List<BattleAwardItemCardResponse.BattleAwardedItemCard> list6;
        BattleAwardItemCardResponse.BattleAwardedItemCard battleAwardedItemCard5;
        Top2CardInfo top2CardInfo;
        List<BattleAwardItemCardResponse.BattleAwardedItemCard> list7;
        BattleAwardItemCardResponse.BattleAwardedItemCard battleAwardedItemCard6;
        Top3CardInfo top3CardInfo;
        List<BattleAwardItemCardResponse.BattleAwardedItemCard> list8;
        BattleAwardItemCardResponse.BattleAwardedItemCard battleAwardedItemCard7;
        VaultGloveCardInfo vaultGloveCardInfo;
        C1C7U.LIZ("MatchItemAwardCardViewModel@785e.mvpAwardCardRequest$1");
        BaseResponse baseResponse = (BaseResponse) obj;
        MatchItemAwardCardViewModel matchItemAwardCardViewModel = (MatchItemAwardCardViewModel) afS2S0101200_17.l0;
        matchItemAwardCardViewModel.LLJI = false;
        if (baseResponse != null && baseResponse.data != 0) {
            UUID.randomUUID();
            boolean zLJIIIIZZ = C970370bMJ.LJIIIIZZ();
            ArrayList arrayList = new ArrayList(C13BV.INSTANCE);
            ArrayList arrayList2 = new ArrayList();
            BattleAwardItemCardResponse.ResponseData responseData = (BattleAwardItemCardResponse.ResponseData) baseResponse.data;
            if (responseData != null && (list = responseData.cards) != null) {
                MatchItemAwardCardViewModel matchItemAwardCardViewModel2 = (MatchItemAwardCardViewModel) afS2S0101200_17.l0;
                int i2 = 0;
                i = 0;
                for (BattleAwardItemCardResponse.BattleAwardedItemCard battleAwardedItemCard8 : list) {
                    int i3 = i2 + 1;
                    ItemInfo4FE itemInfo4FELIZ = null;
                    if (i2 >= 0) {
                        int i4 = battleAwardedItemCard8.cardType;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("mvp award a match item card type = ");
                        sbLIZ.append(i4);
                        C20441214yg.LJIIIZ("MatchItemAwardVM", C2188811AlT.LIZIZ(sbLIZ));
                        UUID uuidRandomUUID = UUID.randomUUID();
                        matchItemAwardCardViewModel2.getClass();
                        if (i4 != 0) {
                            if (i4 != 1) {
                                if (i4 != 2) {
                                    if (i4 != 3) {
                                        if (i4 != 4) {
                                            if (i4 != 7) {
                                                if (i4 != 8) {
                                                    if (i4 != 9) {
                                                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                                        sbLIZ2.append("Unknown cardType = ");
                                                        sbLIZ2.append(i4);
                                                        C20441214yg.LJ("MatchItemAwardVM", C2188811AlT.LIZIZ(sbLIZ2));
                                                    } else {
                                                        BattleAwardItemCardResponse.ResponseData responseData2 = (BattleAwardItemCardResponse.ResponseData) baseResponse.data;
                                                        if (responseData2 != null && (list8 = responseData2.cards) != null && (battleAwardedItemCard7 = (BattleAwardItemCardResponse.BattleAwardedItemCard) ListProtector.get(list8, i2)) != null && (vaultGloveCardInfo = battleAwardedItemCard7.vaultGlovesCard) != null) {
                                                            itemInfo4FELIZ = C1144640ftO.LJIIJ(uuidRandomUUID, vaultGloveCardInfo, zLJIIIIZZ, true, false);
                                                        }
                                                    }
                                                } else {
                                                    BattleAwardItemCardResponse.ResponseData responseData3 = (BattleAwardItemCardResponse.ResponseData) baseResponse.data;
                                                    if (responseData3 != null && (list7 = responseData3.cards) != null && (battleAwardedItemCard6 = (BattleAwardItemCardResponse.BattleAwardedItemCard) ListProtector.get(list7, i2)) != null && (top3CardInfo = battleAwardedItemCard6.top3Card) != null) {
                                                        itemInfo4FELIZ = C1144640ftO.LJIIIZ(uuidRandomUUID, top3CardInfo, zLJIIIIZZ, true, false);
                                                    }
                                                }
                                            } else {
                                                BattleAwardItemCardResponse.ResponseData responseData4 = (BattleAwardItemCardResponse.ResponseData) baseResponse.data;
                                                if (responseData4 != null && (list6 = responseData4.cards) != null && (battleAwardedItemCard5 = (BattleAwardItemCardResponse.BattleAwardedItemCard) ListProtector.get(list6, i2)) != null && (top2CardInfo = battleAwardedItemCard5.top2Card) != null) {
                                                    itemInfo4FELIZ = C1144640ftO.LJIIIIZZ(uuidRandomUUID, top2CardInfo, zLJIIIIZZ, true, false);
                                                }
                                            }
                                        } else {
                                            BattleAwardItemCardResponse.ResponseData responseData5 = (BattleAwardItemCardResponse.ResponseData) baseResponse.data;
                                            if (responseData5 != null && (list5 = responseData5.cards) != null && (battleAwardedItemCard4 = (BattleAwardItemCardResponse.BattleAwardedItemCard) ListProtector.get(list5, i2)) != null && (specialEffectCardInfo = battleAwardedItemCard4.specialEffectCard) != null) {
                                                itemInfo4FELIZ = C1144640ftO.LJI(uuidRandomUUID, specialEffectCardInfo, zLJIIIIZZ, true, false, null, 0, null, "");
                                            }
                                        }
                                    } else {
                                        BattleAwardItemCardResponse.ResponseData responseData6 = (BattleAwardItemCardResponse.ResponseData) baseResponse.data;
                                        if (responseData6 != null && (list4 = responseData6.cards) != null && (battleAwardedItemCard3 = (BattleAwardItemCardResponse.BattleAwardedItemCard) ListProtector.get(list4, i2)) != null && (extraTimeCardInfo = battleAwardedItemCard3.extraTimeCard) != null) {
                                            i4 = 3;
                                            itemInfo4FELIZ = C1144640ftO.LIZIZ(uuidRandomUUID, extraTimeCardInfo, zLJIIIIZZ, true, false, 0L, null);
                                        }
                                    }
                                } else {
                                    i4 = 2;
                                    BattleAwardItemCardResponse.ResponseData responseData7 = (BattleAwardItemCardResponse.ResponseData) baseResponse.data;
                                    if (responseData7 != null && (list3 = responseData7.cards) != null && (battleAwardedItemCard2 = (BattleAwardItemCardResponse.BattleAwardedItemCard) ListProtector.get(list3, i2)) != null && (smokeCardInfo = battleAwardedItemCard2.smokeCard) != null) {
                                        itemInfo4FELIZ = C1144640ftO.LJFF(uuidRandomUUID, smokeCardInfo, zLJIIIIZZ, true, false);
                                    }
                                }
                            } else {
                                i4 = 1;
                                BattleAwardItemCardResponse.ResponseData responseData8 = (BattleAwardItemCardResponse.ResponseData) baseResponse.data;
                                if (responseData8 != null && (list2 = responseData8.cards) != null && (battleAwardedItemCard = (BattleAwardItemCardResponse.BattleAwardedItemCard) ListProtector.get(list2, i2)) != null && (criticalStrikeCardInfo = battleAwardedItemCard.criticalStrikeCard) != null) {
                                    itemInfo4FELIZ = C1144640ftO.LIZ(uuidRandomUUID, criticalStrikeCardInfo, zLJIIIIZZ, true, false);
                                }
                            }
                        } else {
                            i4 = 0;
                            C20441214yg.LJIIIZ("MatchItemAwardVM", "mvp not award any item card");
                        }
                        arrayList.add(itemInfo4FELIZ);
                        arrayList2.add(Integer.valueOf(i4));
                        i++;
                        i2 = i3;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
            } else {
                i = 0;
            }
            if (!arrayList.isEmpty()) {
                ((MatchItemAwardCardViewModel) afS2S0101200_17.l0).setState(new C1144550ftF(afS2S0101200_17.j2, afS2S0101200_17.i1, afS2S0101200_17.j3, arrayList));
                C973660bRc c973660bRc = C973660bRc.LIZ;
                long j = afS2S0101200_17.j2;
                long j2 = afS2S0101200_17.j3;
                int i5 = ((MatchItemAwardCardViewModel) afS2S0101200_17.l0).LLJIJIL;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                C973660bRc.LJIIZILJ(c973660bRc, linkedHashMap, false, false, null, 14);
                C973660bRc.LJJIIJZLJL(linkedHashMap);
                linkedHashMap.put(C973660bRc.LJJ, String.valueOf(C973660bRc.LJJIJLIJ()));
                String str2 = C973660bRc.LJJII;
                if (C973660bRc.LJLLLL()) {
                    str = "anchor";
                } else {
                    str = "user";
                }
                linkedHashMap.put(str2, str);
                if (i == 1 && (!arrayList2.isEmpty())) {
                    z = false;
                    objLIZJ = C1144530ftD.LIZIZ(((Number) ListProtector.get(arrayList2, 0)).intValue());
                } else {
                    z = false;
                    objLIZJ = C1144530ftD.LIZJ(arrayList2);
                }
                linkedHashMap.put("match_item_type", String.valueOf(objLIZJ));
                linkedHashMap.put("pk_id", String.valueOf(j));
                linkedHashMap.put("channel_id", String.valueOf(j2));
                linkedHashMap.put("mvp_ranking", String.valueOf(i5));
                InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
                if (interfaceC500940JkiUser == null || (string = Long.valueOf(interfaceC500940JkiUser.getCurrentUserId()).toString()) == null) {
                    string = "";
                }
                linkedHashMap.put("user_id", string);
                User.EnigmaInfo enigmaInfo = UserService.getInstance().user().LJIJJLI().enigmaInfo;
                if (enigmaInfo != null && enigmaInfo.isEnigmaMaskOn) {
                    z = true;
                }
                String str3 = "1";
                if (z) {
                    obj2 = "1";
                } else {
                    obj2 = CardStruct.IStatusCode.DEFAULT;
                }
                linkedHashMap.put("is_enigma", obj2);
                linkedHashMap.put("match_item_type_list", C1144530ftD.LIZJ(arrayList2).toString());
                linkedHashMap.put("match_item_cnts", String.valueOf(i));
                C1144530ftD.LIZ(c973660bRc, linkedHashMap);
                if (!C915980Zwa.LIZLLL().L6()) {
                    str3 = CardStruct.IStatusCode.DEFAULT;
                }
                linkedHashMap.put("is_enlarge_mode", str3);
                String strLIZIZ = (String) ((LinkedHashMap) C973660bRc.LJLJLLL).get("sub_match_type");
                if (strLIZIZ == null) {
                    C917350Zyn c917350Zyn = EnumC919170a1j.Companion;
                    EnumC919170a1j enumC919170a1jXB0 = C915980Zwa.LJFF().xB0();
                    int size = C915980Zwa.LJII().LLILZLL(true).size();
                    c917350Zyn.getClass();
                    strLIZIZ = C917350Zyn.LIZIZ(enumC919170a1jXB0, size);
                }
                if (C970370bMJ.LJII()) {
                    C973660bRc.LJZ(c973660bRc, "livesdk_match_item_occur", linkedHashMap, strLIZIZ);
                } else {
                    C973660bRc.LJZI(c973660bRc, "livesdk_match_item_occur", linkedHashMap, strLIZIZ);
                }
                long j3 = afS2S0101200_17.j3;
                long j4 = afS2S0101200_17.j2;
                int i6 = afS2S0101200_17.i1;
                String str4 = baseResponse.LIZIZ;
                long jCurrentTimeMillis = System.currentTimeMillis() - ((MatchItemAwardCardViewModel) afS2S0101200_17.l0).LLIZLLLIL;
                C1144590ftJ c1144590ftJLJJ = C1144630ftN.LJJ();
                C1144630ftN.LJIILL(c1144590ftJLJJ, j3, j4);
                C0K04.LJFF("log_id", str4, c1144590ftJLJJ.LIZIZ);
                C0K04.LJ("cost", jCurrentTimeMillis, c1144590ftJLJJ.LIZIZ);
                C0K04.LIZLLL(i6, "ranking", c1144590ftJLJJ.LIZIZ);
                C1144630ftN.LJIJI(c1144590ftJLJJ, arrayList2, i);
                if (LiveMatchCoreScenariosMetricsSetting.INSTANCE.enablePowerupTrack()) {
                    enumC1144570ftH = EnumC1144570ftH.AUDIENCE_SENDER;
                } else {
                    enumC1144570ftH = EnumC1144570ftH.AUDIENCE;
                }
                C1144630ftN.LJJIJIIJIL(enumC1144570ftH, "award_match_item_succeed", c1144590ftJLJJ);
            } else if (LiveMatchCoreScenariosMetricsSetting.INSTANCE.enablePowerupTrack()) {
                C1144630ftN.LIZ.LJJIIJZLJL(afS2S0101200_17.i1, afS2S0101200_17.j3, afS2S0101200_17.j2, System.currentTimeMillis() - ((MatchItemAwardCardViewModel) afS2S0101200_17.l0).LLIZLLLIL, new Throwable("award_cards_empty"));
            }
        } else {
            long j5 = afS2S0101200_17.j3;
            long j6 = afS2S0101200_17.j2;
            int i7 = afS2S0101200_17.i1;
            if (LiveMatchCoreScenariosMetricsSetting.INSTANCE.enablePowerupTrack()) {
                C1144630ftN.LIZ.LJJIIJZLJL(i7, j5, j6, System.currentTimeMillis() - matchItemAwardCardViewModel.LLIZLLLIL, new Throwable("response_data_null"));
            }
        }
        C1C7U.LIZIZ("MatchItemAwardCardViewModel@785e.mvpAwardCardRequest$1");
    }

    public static final void accept$1(AfS2S0101200_17 afS2S0101200_17, Object obj) {
        C1C7U.LIZ("MatchItemAwardCardViewModel@785e.mvpAwardCardRequest$2");
        Throwable th = (Throwable) obj;
        ((MatchItemAwardCardViewModel) afS2S0101200_17.l0).LLJI = false;
        C20441214yg.LJFF("MatchItemAwardVM", "request awardCard", th);
        C1144630ftN.LIZ.LJJIIJZLJL(afS2S0101200_17.i1, afS2S0101200_17.j2, afS2S0101200_17.j3, System.currentTimeMillis() - ((MatchItemAwardCardViewModel) afS2S0101200_17.l0).LLIZLLLIL, th);
        C1C7U.LIZIZ("MatchItemAwardCardViewModel@785e.mvpAwardCardRequest$2");
    }

    public AfS2S0101200_17(MatchItemAwardCardViewModel matchItemAwardCardViewModel, long j, long j2, int i, int i2) {
        this.$t = i2;
        this.l0 = matchItemAwardCardViewModel;
        this.j2 = j;
        this.j3 = j2;
        this.i1 = i;
    }
}
