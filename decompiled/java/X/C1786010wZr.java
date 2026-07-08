package X;

import android.os.BaseBundle;
import android.util.SparseLongArray;
import com.bytedance.android.live.rank.impl.page.ui.CreatorRankingPageDialogFragment;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.bytedance.android.livesdk.rank.model.RankTabInfo;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: renamed from: X.0wZr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1786010wZr {
    public static final /* synthetic */ int LJIIIIZZ = 0;
    public final InterfaceC1786180wa8 LIZ;
    public String LIZIZ;
    public boolean LIZJ;
    public Integer LIZLLL;
    public final LinkedHashMap<Integer, Integer> LJ = new LinkedHashMap<>();
    public final LinkedHashSet<Integer> LJFF = new LinkedHashSet<>();
    public final LinkedHashSet<Integer> LJI = new LinkedHashSet<>();
    public final LinkedHashSet<String> LJII = new LinkedHashSet<>();

    public final List<RankTabInfo> LIZ() {
        C1785460wYy c1785460wYy = (C1785460wYy) this.LIZ.YI().LLILLJJLI.getValue();
        List<C1779500wPM> list = c1785460wYy.LIZIZ.LIZ;
        List<C1779500wPM> list2 = c1785460wYy.LIZJ.LIZ;
        ArrayList arrayList = new ArrayList(list.size() + list2.size());
        for (C1779500wPM c1779500wPM : list) {
            RankTabInfo rankTabInfo = new RankTabInfo();
            rankTabInfo.rankType = c1779500wPM.LIZ;
            rankTabInfo.LIZ = c1779500wPM.LIZIZ;
            rankTabInfo.LIZIZ = 0;
            arrayList.add(rankTabInfo);
        }
        for (C1779500wPM c1779500wPM2 : list2) {
            RankTabInfo rankTabInfo2 = new RankTabInfo();
            rankTabInfo2.rankType = c1779500wPM2.LIZ;
            rankTabInfo2.LIZ = c1779500wPM2.LIZIZ;
            rankTabInfo2.LIZIZ = 0;
            arrayList.add(rankTabInfo2);
        }
        return arrayList;
    }

    public final void LIZJ() {
        Integer num;
        Integer num2;
        int iIntValue;
        C1785320wYk c1785320wYk;
        Integer num3 = this.LIZLLL;
        if (num3 != null) {
            int iIntValue2 = num3.intValue();
            if (!this.LIZJ || (num = this.LIZLLL) == null || num.intValue() != iIntValue2 || this.LJFF.contains(Integer.valueOf(iIntValue2)) || (num2 = this.LJ.get(Integer.valueOf(iIntValue2))) == null || (iIntValue = num2.intValue()) <= 0 || (c1785320wYk = ((C1785460wYy) this.LIZ.YI().LLILLJJLI.getValue()).LJ) == null || c1785320wYk.LIZ.LIZ.type != iIntValue2 || !(c1785320wYk.LIZIZ instanceof C1785390wYr)) {
                return;
            }
            C1810690xDf c1810690xDf = C1810690xDf.LIZ;
            DataChannel dataChannel = this.LIZ.getDataChannel();
            RankTypeV2 rankTypeV2 = c1785320wYk.LIZ.LIZ;
            c1810690xDf.getClass();
            SparseLongArray sparseLongArray = C1810700xDg.LIZ;
            long jLIZIZ = C1810700xDg.LIZIZ(rankTypeV2.type, false);
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_hourly_user_rank_swipe_to_end");
            c474500IjALIZ.LJIJJLI(dataChannel);
            C1810690xDf.LIZ(c474500IjALIZ, dataChannel);
            c474500IjALIZ.LJJII(rankTypeV2.rankName, "rank_type");
            c474500IjALIZ.LJJII("rank", "page_type");
            c474500IjALIZ.LJJII(Integer.valueOf(iIntValue), "last_user_rank");
            c474500IjALIZ.LJJII((1 > jLIZIZ || jLIZIZ >= 100) ? CardStruct.IStatusCode.DEFAULT : "1", "anchor_rank");
            c474500IjALIZ.LJJII(Long.valueOf(jLIZIZ), "anchor_rank_index");
            c474500IjALIZ.LIZ();
            this.LJFF.add(Integer.valueOf(iIntValue2));
        }
    }

    public final String LIZLLL() {
        BaseBundle baseBundle;
        String string;
        DataChannel dataChannel = this.LIZ.getDataChannel();
        return (dataChannel == null || (baseBundle = (BaseBundle) dataChannel.gg0(C168C.class)) == null || (string = baseBundle.getString("source")) == null || string.length() <= 0) ? C1810210xCt.LJIIIZ : string;
    }

    public C1786010wZr(CreatorRankingPageDialogFragment creatorRankingPageDialogFragment) {
        this.LIZ = creatorRankingPageDialogFragment;
    }

    public static C1810410xDD LIZIZ(C1157760gEY c1157760gEY, int i) {
        int iIntValue;
        boolean z;
        Integer num = c1157760gEY.LIZLLL;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = i;
        }
        EnumC1811400xEo enumC1811400xEo = c1157760gEY.LIZIZ;
        int i2 = c1157760gEY.LIZJ;
        if (c1157760gEY.LJ == -1) {
            z = true;
        } else {
            z = false;
        }
        return new C1810410xDD(enumC1811400xEo, i, iIntValue, i2, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00d8 A[PHI: r13
      0x00d8: PHI (r13v1 long) = (r13v0 long), (r13v3 long) binds: [B:40:0x00d5, B:35:0x0091] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(com.bytedance.android.livesdk.rank.list.model.RankListV2Response.RankInfo r20, java.lang.String r21, long[] r22) {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1786010wZr.LJ(com.bytedance.android.livesdk.rank.list.model.RankListV2Response$RankInfo, java.lang.String, long[]):void");
    }
}
