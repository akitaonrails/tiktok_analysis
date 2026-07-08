package X;

import android.util.SparseLongArray;
import com.bytedance.android.livesdk.livesetting.rank.LiveCreatorLeagueRankingIntegrationWithTilesFeatureConfig;
import com.bytedance.android.livesdk.livesetting.rank.LivePopularityRankingPerceptionImprovementSetting;
import com.bytedance.android.livesdk.model.message.RankAnimationInfo;
import com.bytedance.android.livesdk.model.message.RankUpdate;
import com.bytedance.android.livesdk.model.message.RankUpdateMessage;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.rank.api.RankAnimationType;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.bytedance.android.livesdk.rank.model.RankEntrance;
import com.bytedance.android.livesdk.rank.model.RankEntranceV3Response;
import com.bytedance.android.livesdk.rank.model.RankTabInfo;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS606S0100000_27;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0y2m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1842380y2m {
    public long LIZ = Long.MAX_VALUE;
    public EnumC1811400xEo LIZIZ = EnumC1811400xEo.DEFAULT;
    public List<C1842420y2q> LIZJ = new ArrayList();
    public List<List<RankTabInfo>> LIZLLL = new ArrayList();
    public int LJ;

    public final C1842380y2m LIZ() {
        C1842380y2m c1842380y2m = new C1842380y2m();
        c1842380y2m.LIZ = this.LIZ;
        c1842380y2m.LIZIZ = this.LIZIZ;
        c1842380y2m.LIZLLL = this.LIZLLL;
        c1842380y2m.LJ = this.LJ;
        List<C1842420y2q> list = this.LIZJ;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<C1842420y2q> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().LIZ());
        }
        c1842380y2m.LIZJ = C19719512Dh.LIZIZ(arrayList);
        return c1842380y2m;
    }

    public final void LIZIZ() {
        RankAnimationInfo rankAnimationInfo;
        if (LivePopularityRankingPerceptionImprovementSetting.INSTANCE.realtimeTopAnimOpt()) {
            int i = 0;
            for (Object obj : C13LP.LLIIII(this.LIZJ)) {
                int i2 = i + 1;
                if (i < 0) {
                    C1697810uHb.LJIJI();
                    throw null;
                }
                C1842420y2q c1842420y2q = (C1842420y2q) obj;
                SparseLongArray sparseLongArray = C1810700xDg.LIZ;
                int i3 = c1842420y2q.LIZ.LIZIZ.type;
                SparseLongArray sparseLongArray2 = C1810700xDg.LIZJ;
                long j = sparseLongArray2.indexOfKey(i3) >= 0 ? sparseLongArray2.get(i3) : -1L;
                long j2 = c1842420y2q.LJII;
                if (1 <= j2 && j2 < 11 && ((j <= 0 || j > 10) && (rankAnimationInfo = c1842420y2q.LJIIIIZZ) != null)) {
                    rankAnimationInfo.duration = 5L;
                    RankAnimationType rankAnimationType = RankAnimationType.LIZ;
                    rankAnimationInfo.type = RankAnimationType.LJIIIZ.type;
                    Text text = new Text();
                    text.defaultPattern = "Top 10 LIVE now";
                    text.key = "ttlive_popLIVESearchSpotlight_popNumBubble_text";
                    rankAnimationInfo.contentText = text;
                }
                sparseLongArray2.put(c1842420y2q.LIZ.LIZIZ.type, c1842420y2q.LJII);
                i = i2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF() {
        /*
            Method dump skipped, instruction units count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1842380y2m.LJFF():void");
    }

    public final void LJ(RankUpdateMessage rankUpdateMessage) {
        ArrayList arrayList = new ArrayList();
        List<RankUpdate> list = rankUpdateMessage.updates;
        if (list != null) {
            for (RankUpdate rankUpdate : list) {
                C1809330xBT.LIZ(this.LIZJ, new AwS606S0100000_27(rankUpdate, 490));
                SparseLongArray sparseLongArray = C1810700xDg.LIZ;
                C1810700xDg.LJFF(rankUpdate.rankType, rankUpdate.ownRank, false);
                C1811420xEq c1811420xEq = EnumC1811400xEo.Companion;
                RankTypeV2 rankTypeV2 = RankTypeV2.LIZ;
                int i = C235000vU.LIZ(rankUpdate.rankType, 0).group_type;
                c1811420xEq.getClass();
                arrayList.add(new C1842420y2q(rankUpdate, C1811420xEq.LIZ(i)));
            }
        }
        this.LIZJ.addAll(arrayList);
        LJFF();
        LIZIZ();
        List<RankTabInfo> list2 = rankUpdateMessage.tabs;
        if (list2 != null) {
            this.LIZLLL.add(list2);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof C1842380y2m)) {
            C1842380y2m c1842380y2m = (C1842380y2m) obj;
            if (this.LIZ == c1842380y2m.LIZ && this.LIZIZ == c1842380y2m.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1842380y2m.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1842380y2m.LIZLLL)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void LIZJ(EnumC1811400xEo enumC1811400xEo, List<RankEntranceV3Response.EntranceGroup> list) {
        List<RankTabInfo> list2;
        List<RankEntrance> list3;
        C20441214yg.LIZIZ("Ranking Entrance Unification", "updateFromAPIQueryForUnifiedEntrance");
        this.LIZ = Long.MAX_VALUE;
        this.LIZIZ = enumC1811400xEo;
        this.LIZJ.clear();
        this.LIZLLL.clear();
        for (RankEntranceV3Response.EntranceGroup entranceGroup : list) {
            RankEntranceV3Response.EntranceGroup.Data data = entranceGroup.data;
            if (data != null && (list3 = data.entrances) != null) {
                for (RankEntrance rankEntrance : list3) {
                    SparseLongArray sparseLongArray = C1810700xDg.LIZ;
                    C1810700xDg.LJFF(rankEntrance.rankType, rankEntrance.ownerRankIdx, false);
                    List<C1842420y2q> list4 = this.LIZJ;
                    C1811420xEq c1811420xEq = EnumC1811400xEo.Companion;
                    RankTypeV2 rankTypeV2 = RankTypeV2.LIZ;
                    int i = C235000vU.LIZ(rankEntrance.rankType, 0).group_type;
                    c1811420xEq.getClass();
                    list4.add(new C1842420y2q(rankEntrance, C1811420xEq.LIZ(i)));
                    if (rankEntrance.rankType == RankTypeV2.LJIILLIIL.type) {
                        List<List<RankTabInfo>> list5 = this.LIZLLL;
                        ArrayList arrayList = new ArrayList();
                        for (List<RankTabInfo> list6 : list5) {
                            if (!list6.isEmpty()) {
                                arrayList.add(list6);
                            }
                        }
                        Iterator it2 = arrayList.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                Iterator it3 = ((List) it2.next()).iterator();
                                while (it3.hasNext()) {
                                    if (((RankTabInfo) it3.next()).rankType == RankTypeV2.LJIILLIIL.type) {
                                        break;
                                    }
                                }
                            } else {
                                List<List<RankTabInfo>> list7 = this.LIZLLL;
                                ArrayList arrayList2 = new ArrayList();
                                RankTabInfo rankTabInfo = new RankTabInfo();
                                rankTabInfo.rankType = RankTypeV2.LJIILLIIL.type;
                                arrayList2.add(rankTabInfo);
                                list7.add(arrayList2);
                                break;
                            }
                        }
                    }
                }
            }
            RankEntranceV3Response.EntranceGroup.Data data2 = entranceGroup.data;
            if (data2 != null && (list2 = data2.tabs) != null) {
                this.LIZLLL.add(list2);
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Before update affiliated info: ");
        sbLIZ.append(this.LIZJ.size());
        C20441214yg.LIZIZ("Ranking Entrance Unification", C2188811AlT.LIZIZ(sbLIZ));
        LJFF();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("After update affiliated info: ");
        sbLIZ2.append(this.LIZJ.size());
        C20441214yg.LIZIZ("Ranking Entrance Unification", C2188811AlT.LIZIZ(sbLIZ2));
    }

    public final void LIZLLL(RankUpdateMessage rankUpdateMessage, EnumC1811400xEo enumC1811400xEo, DataChannel dataChannel) {
        Integer numValueOf;
        int i;
        List<Text> list;
        String str;
        C1811840xFW.LJII = rankUpdateMessage.getMessageId();
        this.LIZ = rankUpdateMessage.rankPriority;
        this.LIZIZ = enumC1811400xEo;
        this.LJ = rankUpdateMessage.opType;
        this.LIZJ.clear();
        List<RankUpdate> list2 = rankUpdateMessage.updates;
        if (list2 != null) {
            for (RankUpdate rankUpdate : list2) {
                SparseLongArray sparseLongArray = C1810700xDg.LIZ;
                C1810700xDg.LJFF(rankUpdate.rankType, rankUpdate.ownRank, false);
                List<C1842420y2q> list3 = this.LIZJ;
                C1811420xEq c1811420xEq = EnumC1811400xEo.Companion;
                RankTypeV2 rankTypeV2 = RankTypeV2.LIZ;
                int i2 = C235000vU.LIZ(rankUpdate.rankType, 0).group_type;
                c1811420xEq.getClass();
                list3.add(new C1842420y2q(rankUpdate, C1811420xEq.LIZ(i2)));
                Text text = rankUpdate.defaultContent;
                if (text == null || (str = text.key) == null || Intrinsics.LJFF(str, "")) {
                    C1811840xFW.LJFF(dataChannel, this.LIZIZ, RankTypeV2.LJJIJIIJI, EnumC1843350y4L.BAD_UPDATES, null, null);
                }
            }
        }
        if (this.LIZJ.size() <= 0) {
            C1811840xFW.LJFF(dataChannel, this.LIZIZ, RankTypeV2.LJJIJIIJI, EnumC1843350y4L.BAD_UPDATES, null, null);
        }
        LJFF();
        LIZIZ();
        C20441214yg.LIZIZ("Creator League Ranking And Tiles", "RankEntranceData#handleCreatorTilesAnimation");
        if (LiveCreatorLeagueRankingIntegrationWithTilesFeatureConfig.INSTANCE.rankingEntranceTilesAnimOpt()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("rankEntrances size before update: ");
            sbLIZ.append(this.LIZJ.size());
            C20441214yg.LIZIZ("Creator League Ranking And Tiles", C2188811AlT.LIZIZ(sbLIZ));
            ArrayList arrayList = new ArrayList();
            for (C1842420y2q c1842420y2q : this.LIZJ) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("rankEntranceData - rankType: ");
                sbLIZ2.append(c1842420y2q.LIZ.LIZIZ.type);
                sbLIZ2.append(", animationType: ");
                RankAnimationInfo rankAnimationInfo = c1842420y2q.LJIIIIZZ;
                Integer numValueOf2 = null;
                if (rankAnimationInfo != null) {
                    numValueOf = Integer.valueOf(rankAnimationInfo.type);
                } else {
                    numValueOf = null;
                }
                sbLIZ2.append(numValueOf);
                C20441214yg.LIZIZ("Creator League Ranking And Tiles", C2188811AlT.LIZIZ(sbLIZ2));
                RankAnimationInfo rankAnimationInfo2 = c1842420y2q.LJIIIIZZ;
                if (rankAnimationInfo2 != null && (list = rankAnimationInfo2.tileContent) != null) {
                    for (Text text2 : list) {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("update tile content delayed - ");
                        sbLIZ3.append((Object) C1133830fbx.LJIILIIL(text2, ""));
                        C20441214yg.LIZIZ("Creator League Ranking And Tiles", C2188811AlT.LIZIZ(sbLIZ3));
                        C1842420y2q c1842420y2qLIZ = c1842420y2q.LIZ();
                        RankAnimationInfo rankAnimationInfo3 = c1842420y2qLIZ.LJIIIIZZ;
                        if (rankAnimationInfo3 != null) {
                            rankAnimationInfo3.contentText = text2;
                        }
                        arrayList.add(c1842420y2qLIZ);
                    }
                }
                RankAnimationInfo rankAnimationInfo4 = c1842420y2q.LJIIIIZZ;
                if (rankAnimationInfo4 != null) {
                    numValueOf2 = Integer.valueOf(rankAnimationInfo4.type);
                }
                int i3 = RankAnimationType.LJIILLIIL.type;
                if (numValueOf2 != null && numValueOf2.intValue() == i3) {
                    i = RankAnimationType.LJIIIZ.type;
                } else {
                    int i4 = RankAnimationType.LJIIZILJ.type;
                    if (numValueOf2 != null && numValueOf2.intValue() == i4) {
                        i = RankAnimationType.LJIIJ.type;
                    } else {
                        RankAnimationInfo rankAnimationInfo5 = c1842420y2q.LJIIIIZZ;
                        if (rankAnimationInfo5 != null) {
                            i = rankAnimationInfo5.type;
                        } else {
                            i = 0;
                        }
                    }
                }
                RankAnimationInfo rankAnimationInfo6 = c1842420y2q.LJIIIIZZ;
                if (rankAnimationInfo6 != null) {
                    rankAnimationInfo6.type = i;
                }
            }
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("tileContentDataList size after update: ");
            sbLIZ4.append(arrayList.size());
            C20441214yg.LIZIZ("Creator League Ranking And Tiles", C2188811AlT.LIZIZ(sbLIZ4));
            this.LIZJ.addAll(arrayList);
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("rankEntrances size after update: ");
            sbLIZ5.append(this.LIZJ.size());
            C20441214yg.LIZIZ("Creator League Ranking And Tiles", C2188811AlT.LIZIZ(sbLIZ5));
        }
    }
}
