package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.chatroom.model.interact.CohostABInfo;
import com.bytedance.android.livesdk.livesetting.linkmic.EnableSpecificGiftEntranceOptimizeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveMatchTakeStageOptSetting;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common.TextPiece;
import com.bytedance.android.livesdk.model.message.common.TextPieceImage;
import com.bytedance.android.livesdkapi.depend.model.live.match.GiftMode;
import com.bytedance.android.livesdkapi.depend.model.live.match.LeagueScoreInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.MultiMatchPrepareResponse;
import com.bytedance.android.livesdkapi.host.IHostFrescoHelper;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS129S1100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: renamed from: X.0bRN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C973510bRN implements InterfaceC973490bRL {
    public static final C973510bRN LIZ = new C973510bRN();
    public static List<Long> LIZIZ = C13BV.INSTANCE;

    @Override // X.InterfaceC973490bRL
    public final void onFail() {
    }

    public static boolean LIZIZ() {
        if (!LiveMatchTakeStageOptSetting.INSTANCE.isEnableOptRedundantApi()) {
            return false;
        }
        List<C954460awe> listLJIJJ = C915980Zwa.LJII().LJIJJ();
        if (listLJIJJ.size() < 2) {
            return false;
        }
        for (C954460awe c954460awe : listLJIJJ) {
            if (c954460awe.LJ != C950220apo.LJ()) {
                CohostABInfo cohostABInfoLJII = C915980Zwa.LJI().LJIIIZ().LJII(c954460awe.LJ);
                if (!C500260Jjc.LJJJI(cohostABInfoLJII != null ? Boolean.valueOf(cohostABInfoLJII.liveMatchButtonOpt) : null)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void LIZJ(MultiMatchPrepareResponse multiMatchPrepareResponse) {
        int size;
        boolean z;
        DataChannel dataChannel;
        String str;
        String str2;
        List<TextPiece> list;
        int i;
        String str3;
        TextPieceImage textPieceImage;
        ImageModel imageModel;
        List<String> listLIZ;
        List<TextPiece> list2;
        InterfaceC975810bV5 interfaceC975810bV5LIZLLL;
        InterfaceC975810bV5 interfaceC975810bV5LIZLLL2;
        if (!LiveMatchTakeStageOptSetting.INSTANCE.isEnableOptRedundantApi()) {
            return;
        }
        C973890bRz.LJIIIZ(multiMatchPrepareResponse);
        InterfaceC975870bVB interfaceC975870bVBLJFF = C915980Zwa.LJI().LJFF();
        if (interfaceC975870bVBLJFF != null) {
            interfaceC975870bVBLJFF.LJIIIIZZ(multiMatchPrepareResponse.matchPlaybooks);
        }
        List<GiftMode> list3 = multiMatchPrepareResponse.giftMode;
        if (list3 != null && (interfaceC975810bV5LIZLLL2 = C915980Zwa.LJI().LIZLLL()) != null) {
            interfaceC975810bV5LIZLLL2.LJJIIJ(list3);
        }
        Text text = multiMatchPrepareResponse.giftEventDesc;
        if (text != null && (interfaceC975810bV5LIZLLL = C915980Zwa.LJI().LIZLLL()) != null) {
            interfaceC975810bV5LIZLLL.LJFF(text);
        }
        InterfaceC978510bZR interfaceC978510bZRLJI = C915980Zwa.LJI().LJI();
        interfaceC978510bZRLJI.LJIIJ(multiMatchPrepareResponse.giftMode);
        interfaceC978510bZRLJI.LJFF(multiMatchPrepareResponse.giftEventDesc);
        ArrayList arrayList = new ArrayList();
        Map<Long, Integer> map = multiMatchPrepareResponse.anchorsPermission;
        if (map != null) {
            Iterator<Map.Entry<Long, Integer>> it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().getKey());
            }
        }
        LIZIZ = arrayList;
        if (EnableSpecificGiftEntranceOptimizeSetting.INSTANCE.getValue()) {
            C973890bRz.LJFF();
        }
        Text text2 = multiMatchPrepareResponse.giftEventDesc;
        if (text2 != null && (list2 = text2.pieces) != null) {
            size = list2.size();
        } else {
            size = 0;
        }
        if (size > 0 && text2 != null && (list = text2.pieces) != null) {
            for (TextPiece textPiece : list) {
                if (textPiece != null) {
                    i = textPiece.type;
                } else {
                    i = 0;
                }
                if (i == EnumC1133850fbz.IMAGE.getPieceType()) {
                    IHostFrescoHelper iHostFrescoHelper = (IHostFrescoHelper) C1161920gLG.LIZJ(IHostFrescoHelper.class);
                    if (textPiece == null || (textPieceImage = textPiece.imageValue) == null || (imageModel = textPieceImage.imageModel) == null || (listLIZ = C842240X2g.LIZ(imageModel)) == null || (str3 = (String) C13LP.LJJJLZIJ(0, listLIZ)) == null) {
                        str3 = "";
                    }
                    iHostFrescoHelper.my0(str3);
                }
            }
        }
        List<GiftMode> list4 = multiMatchPrepareResponse.giftMode;
        if (list4 != null) {
            for (GiftMode giftMode : list4) {
                ImageModel imageModel2 = giftMode.giftIconImage;
                if (imageModel2 != null) {
                    List<String> listLIZ2 = C842240X2g.LIZ(imageModel2);
                    if (listLIZ2 == null || (str2 = (String) C13LP.LJJJLZIJ(0, listLIZ2)) == null) {
                        str2 = "";
                    }
                    C1143680frq.LJJIII(str2);
                }
                ImageModel imageModel3 = giftMode.eventIconImage;
                if (imageModel3 != null) {
                    List<String> listLIZ3 = C842240X2g.LIZ(imageModel3);
                    if (listLIZ3 == null || (str = (String) C13LP.LJJJLZIJ(0, listLIZ3)) == null) {
                        str = "";
                    }
                    C1143680frq.LJJIII(str);
                }
            }
        }
        C973520bRO.LIZ = multiMatchPrepareResponse.anchorsPermission;
        C973520bRO.LIZIZ = multiMatchPrepareResponse.abTestSettings;
        long jLJ = C950220apo.LJ();
        ArrayList arrayList2 = new ArrayList();
        Map<Long, Integer> map2 = multiMatchPrepareResponse.anchorsPermission;
        if (map2 != null) {
            for (Map.Entry<Long, Integer> entry : map2.entrySet()) {
                if (entry.getValue().intValue() == EnumC308780C8m.NoGiftPermission.getState() || entry.getValue().intValue() == EnumC308780C8m.UnknownType.getState()) {
                    arrayList2.add(entry.getKey());
                }
                if (entry.getKey().longValue() == jLJ && (dataChannel = C915980Zwa.LJII().getDataChannel()) != null) {
                    dataChannel.SX0(C963610bBP.class, entry.getValue());
                }
            }
        }
        List<C954460awe> listLLILZLL = C915980Zwa.LJII().LLILZLL(true);
        if (!multiMatchPrepareResponse.leagueInfoMap.isEmpty()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("update league info ");
            sbLIZ.append(multiMatchPrepareResponse.leagueInfoMap);
            C20441214yg.LJIIIZ("MatchPrepareDataManager", C2188811AlT.LIZIZ(sbLIZ));
            for (C954460awe c954460awe : listLLILZLL) {
                c954460awe.LJJIII = multiMatchPrepareResponse.leagueInfoMap.get(Long.valueOf(c954460awe.LJ));
                if (c954460awe.LJJIIJ == null) {
                    c954460awe.LJJIIJ = new LeagueScoreInfo();
                }
                LeagueScoreInfo leagueScoreInfo = c954460awe.LJJIIJ;
                if (leagueScoreInfo != null) {
                    if (c954460awe.LJJIII == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    leagueScoreInfo.classOptOut = z;
                }
            }
            return;
        }
        for (C954460awe c954460awe2 : listLLILZLL) {
            if (c954460awe2.LJJIIJ == null) {
                c954460awe2.LJJIIJ = new LeagueScoreInfo();
            }
            LeagueScoreInfo leagueScoreInfo2 = c954460awe2.LJJIIJ;
            if (leagueScoreInfo2 != null) {
                leagueScoreInfo2.classOptOut = true;
            }
        }
    }

    @Override // X.InterfaceC973490bRL
    public final void LIZ(MultiMatchPrepareResponse multiMatchPrepareResponse) {
        LIZJ(multiMatchPrepareResponse);
    }

    public static void LIZLLL(String str, C973500bRM c973500bRM, boolean z, int i) {
        Integer numValueOf = null;
        if ((i & 2) != 0) {
            c973500bRM = null;
        }
        boolean z2 = false;
        if ((i & 4) != 0) {
            z = false;
        }
        if (!LIZIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("tryLoadPrepareData");
            sbLIZ.append(", source=");
            sbLIZ.append(str);
            sbLIZ.append(", currentUserIsAnchor=");
            sbLIZ.append(C950220apo.LJI());
            sbLIZ.append(", isAllUserOptEnable=false");
            C20441214yg.LIZIZ("MatchPrepareDataManager", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        EnumC950120ape enumC950120apeLLI = C915980Zwa.LJII().LLI();
        if (enumC950120apeLLI.isLinked() && C950220apo.LJI()) {
            if (z && LiveMatchTakeStageOptSetting.INSTANCE.isEnableOptRedundantApi()) {
                LIZIZ = C13BV.INSTANCE;
            }
            int size = C915980Zwa.LJII().LLILZLL(true).size();
            if (C973890bRz.LJIIJJI != null && LIZIZ.size() > 1) {
                List<C954460awe> listLLILZLL = C915980Zwa.LJII().LLILZLL(true);
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLLILZLL, 10));
                Iterator<C954460awe> it2 = listLLILZLL.iterator();
                while (it2.hasNext()) {
                    arrayList.add(Long.valueOf(it2.next().LJ));
                }
                if (arrayList.size() > 1 && C973560bRS.LIZ(LIZIZ, arrayList) && LIZIZ.size() == arrayList.size()) {
                    z2 = true;
                }
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("tryLoadPrepareData");
            sbLIZ2.append(", source=");
            sbLIZ2.append(str);
            sbLIZ2.append(", isForce=");
            sbLIZ2.append(z);
            sbLIZ2.append(", callback=");
            if (c973500bRM != null) {
                numValueOf = Integer.valueOf(c973500bRM.hashCode());
            }
            sbLIZ2.append(numValueOf);
            sbLIZ2.append(", isCacheDataValid=");
            sbLIZ2.append(z2);
            sbLIZ2.append(", uidListSize=");
            sbLIZ2.append(size);
            C20441214yg.LIZIZ("MatchPrepareDataManager", C2188811AlT.LIZIZ(sbLIZ2));
            C01GW c01gw = C973470bRJ.LIZ;
            C973470bRJ.LIZJ = LIZ;
            if (z2) {
                MultiMatchPrepareResponse multiMatchPrepareResponse = C973890bRz.LJIIJJI;
                if (multiMatchPrepareResponse == null || c973500bRM == null) {
                    return;
                }
                c973500bRM.LIZIZ(multiMatchPrepareResponse, true);
                return;
            }
            if (c973500bRM != null) {
                C973470bRJ.LIZ(C915980Zwa.LJII().getChannelId(), new AwS594S0100000_15(c973500bRM, 602), new AwS129S1100000_15(c973500bRM, str, 7), true);
                return;
            } else {
                C973470bRJ.LIZIZ(str);
                return;
            }
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("tryLoadPrepareData");
        sbLIZ3.append(", source=");
        sbLIZ3.append(str);
        sbLIZ3.append(", cohostState=");
        sbLIZ3.append(enumC950120apeLLI);
        sbLIZ3.append(", currentUserIsAnchor=");
        sbLIZ3.append(C950220apo.LJI());
        C20441214yg.LIZIZ("MatchPrepareDataManager", C2188811AlT.LIZIZ(sbLIZ3));
        if (c973500bRM == null) {
            return;
        }
        c973500bRM.LIZ(new Exception("tryLoadPrepareData_cohost_not_linked"));
    }
}
