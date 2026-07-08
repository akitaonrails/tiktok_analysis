package X;

import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.tiktok.kmp.live.socialgamebusinessapi.event.MultiLetsDanceDataEvent;
import com.tiktok.kmp.live.socialgamebusinessapi.event.MultiLetsDanceSongNameChannel;
import com.tiktok.kmp.live.socialgamebusinessapi.service.ILiveDanceService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import tikcast.linkmic.common.MultiGuestLayoutExtra;
import tikcast.linkmic.common.MultiGuestLayoutNonSeiExtra;
import tikcast.linkmic.common.PosIdentity;
import tikcast.linkmic.common.SocialGameLayoutExtra;
import tikcast.linkmic.common.SocialGameLayoutNonSeiExtra;

/* JADX INFO: renamed from: X.0alJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C947430alJ {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(C942080acg c942080acg, DataChannel dataChannel) {
        C947420alI c947420alI;
        C947420alI c947420alILJII;
        MultiGuestLayoutExtra multiGuestLayoutExtraLJFF;
        MultiGuestLayoutNonSeiExtra multiGuestLayoutNonSeiExtraLJI;
        SocialGameLayoutExtra socialGameLayoutExtra;
        String str;
        EnumC947450alL enumC947450alL;
        EnumC947440alK next;
        String str2;
        SocialGameLayoutNonSeiExtra socialGameLayoutNonSeiExtra;
        String str3;
        String str4;
        if (C942160aco.LIZ()) {
            float f = C942200acs.LIZ;
            C947470alN c947470alN = c942080acg.LIZ;
            try {
                C955300ay0 c955300ay0 = c947470alN.LJ;
                if (c955300ay0 != null && (str4 = c955300ay0.LIZ) != null) {
                    multiGuestLayoutExtraLJFF = C942200acs.LJFF(str4);
                } else {
                    multiGuestLayoutExtraLJFF = null;
                }
                C955300ay0 c955300ay02 = c947470alN.LJ;
                if (c955300ay02 != null && (str3 = c955300ay02.LIZJ) != null) {
                    multiGuestLayoutNonSeiExtraLJI = C942200acs.LJI(str3);
                } else {
                    multiGuestLayoutNonSeiExtraLJI = null;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("MultiGuestLayoutUtils nonSeiExtra=");
                sbLIZ.append(C2348809Ig.LJIIIIZZ(multiGuestLayoutNonSeiExtraLJI));
                sbLIZ.append(", layoutExtra=");
                sbLIZ.append(C2348809Ig.LJIIIIZZ(multiGuestLayoutExtraLJFF));
                C20441214yg.LIZIZ("MultiGuestLayoutUtils", C2188811AlT.LIZIZ(sbLIZ));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("toGameSnapshot exception: ");
                sbLIZ2.append(e.getMessage());
                C20441214yg.LJ("MultiGuestLayoutUtils", C2188811AlT.LIZIZ(sbLIZ2));
            }
            if (multiGuestLayoutExtraLJFF != null && (socialGameLayoutExtra = multiGuestLayoutExtraLJFF.socialGame) != null) {
                if (socialGameLayoutExtra.gameJustDanceStatus == 99) {
                    C20441214yg.LJIIL("MultiGuestLayoutUtils", "MultiGuestLayoutUtils gameJustDanceStatus invalid!");
                    c947420alI = null;
                } else {
                    if (dataChannel == null || (str = (String) dataChannel.gg0(MultiLetsDanceSongNameChannel.class)) == null) {
                        str = "";
                    }
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("MultiGuestLayoutUtils socialGame=");
                    sbLIZ3.append(C2348809Ig.LJIIIIZZ(socialGameLayoutExtra));
                    C20441214yg.LIZIZ("MultiGuestLayoutUtils", C2188811AlT.LIZIZ(sbLIZ3));
                    C947490alP c947490alP = EnumC947450alL.Companion;
                    int i = socialGameLayoutExtra.gameId;
                    c947490alP.getClass();
                    EnumC947450alL[] enumC947450alLArrValues = EnumC947450alL.values();
                    int length = enumC947450alLArrValues.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 < length) {
                            enumC947450alL = enumC947450alLArrValues[i2];
                            if (enumC947450alL.getValue() == i) {
                                break;
                            } else {
                                i2++;
                            }
                        } else {
                            enumC947450alL = EnumC947450alL.SOCIAL_GAME_TYPE_NONE;
                            break;
                        }
                    }
                    long j = socialGameLayoutExtra.gameSessionId;
                    C947480alO c947480alO = EnumC947440alK.Companion;
                    int i3 = socialGameLayoutExtra.gameJustDanceStatus;
                    c947480alO.getClass();
                    Iterator<EnumC947440alK> it2 = EnumC947440alK.getEntries().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next = it2.next();
                            if (next.getValue() == i3) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    EnumC947440alK enumC947440alK = next;
                    if (enumC947440alK == null) {
                        enumC947440alK = EnumC947440alK.NONE;
                    }
                    Long lValueOf = Long.valueOf(socialGameLayoutExtra.gameStartPlayMs);
                    String str5 = socialGameLayoutExtra.lokiPanelName;
                    C947500alQ c947500alQ = new C947500alQ(str5, socialGameLayoutExtra.requiredLokiResourceId);
                    C947500alQ c947500alQ2 = new C947500alQ(str5, socialGameLayoutExtra.optionalLokiResourceId);
                    Long lValueOf2 = Long.valueOf(socialGameLayoutExtra.gameOptionId);
                    if (multiGuestLayoutNonSeiExtraLJI == null || (socialGameLayoutNonSeiExtra = multiGuestLayoutNonSeiExtraLJI.socialGame) == null || (str2 = socialGameLayoutNonSeiExtra.justDanceSongTitle) == null) {
                        str2 = str;
                    }
                    List<C957020b0m> list = c947470alN.LIZLLL;
                    ArrayList arrayList = new ArrayList();
                    for (C957020b0m c957020b0m : list) {
                        PosIdentity posIdentity = c957020b0m.getPosIdentity();
                        if (posIdentity != null && posIdentity.type == 1) {
                            arrayList.add(new Pair(posIdentity.value, C942200acs.LJII(c957020b0m)));
                        }
                    }
                    c947420alI = new C947420alI(enumC947450alL, j, enumC947440alK, lValueOf, c947500alQ, c947500alQ2, lValueOf2, str2, C2097608Jq.LJIILLIIL(arrayList), C2097608Jq.LJ());
                }
            } else {
                c947420alI = null;
            }
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("handleLetsDance gameSnapshot=");
            sbLIZ4.append(c947420alI);
            C937310aUz.LJII("LetsDanceLayoutUtils", C2188811AlT.LIZIZ(sbLIZ4));
            if (c947420alI != null) {
                C937310aUz.LJII("LetsDanceLayoutUtils", "onLayoutPipelineEndSuccess receive gameSnapshot");
                dataChannel.LC0(MultiLetsDanceDataEvent.class, c947420alI);
                return;
            }
            C949060anw c949060anwYo1 = ((ILiveDanceService) C1161920gLG.LIZJ(ILiveDanceService.class)).Yo1();
            if (c949060anwYo1 == null || (c947420alILJII = c949060anwYo1.LJII()) == null || c947420alILJII.LIZJ == null) {
                return;
            }
            C937310aUz.LJII("LetsDanceLayoutUtils", "onLayoutPipelineEndSuccess receive gameSnapshot, Quit Game");
            dataChannel.LC0(MultiLetsDanceDataEvent.class, C947420alI.LIZ(c947420alILJII, EnumC947440alK.NONE, null, null, null, null, null, null, null, 1019));
        }
    }
}
