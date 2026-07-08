package X;

import Y.AfS196S0100000_27;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.rank.impl.list.RankLeagueListDialog;
import com.bytedance.android.live.rank.impl.list.RankListDialog;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.bytedance.android.livesdk.rank.impl.api.RankApi;
import com.bytedance.android.livesdk.rank.model.RankTabInfo;
import java.util.List;

/* JADX INFO: renamed from: X.0xCu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1810220xCu {
    public static RankListDialog LIZ(C1810340xD6 c1810340xD6, LifecycleOwner lifecycleOwner, boolean z, boolean z2, String str) {
        RankListDialog rankListDialog;
        long j;
        List<RankTabInfo> list = c1810340xD6.LIZJ;
        if (list != null && list.size() != 0) {
            C1810210xCt.LJIIIIZZ();
            RankTypeV2 rankTypeV2 = c1810340xD6.LJFF;
            C1810210xCt.LJFF(rankTypeV2.type, rankTypeV2.rankPhase, true);
            C1810210xCt.LJIIIZ = str;
            int i = c1810340xD6.LJFF.style;
            RankTypeV2 rankTypeV22 = RankTypeV2.LJIILLIIL;
            if (i == rankTypeV22.style && !z) {
                rankListDialog = new RankLeagueListDialog();
            } else {
                rankListDialog = new RankListDialog();
            }
            rankListDialog.LLJLILLLLZIIL = c1810340xD6;
            rankListDialog.LLJJLIIIJLLLLLLLZ = z;
            rankListDialog.LLJL = z2;
            EnumC1811400xEo enumC1811400xEo = c1810340xD6.LJI;
            RankTypeV2 rankTypeV23 = c1810340xD6.LJFF;
            rankListDialog.LLJZ = new C1810410xDD(enumC1811400xEo, rankTypeV23, rankTypeV23, c1810340xD6.LJ, z);
            rankListDialog.LLLFF = lifecycleOwner;
            if (rankTypeV23.style == rankTypeV22.style) {
                C1810080xCg c1810080xCg = new C1810080xCg();
                long j2 = c1810340xD6.LIZ;
                long j3 = c1810340xD6.LIZIZ;
                RankTypeV2 rankTypeV24 = c1810340xD6.LJFF;
                C1810210xCt.LIZLLL(rankTypeV24.type, rankTypeV24.rankPhase);
                c1810080xCg.LIZLLL = rankTypeV24;
                C480460Ism.LIZ().getClass();
                RankApi rankApi = (RankApi) C480460Ism.LIZLLL(RankApi.class);
                String strValueOf = String.valueOf(rankTypeV24.type);
                if (z) {
                    j = -1;
                } else {
                    j = 0;
                }
                ((C0J1N) rankApi.getRankListV2(j2, j3, strValueOf, 1, j, true, rankTypeV24.rankPhase).LJIILIIL(new C0UO0()).LIZJ(C11RD.LJ(lifecycleOwner))).LIZ(new AfS196S0100000_27(c1810080xCg, 1), new AfS196S0100000_27(c1810080xCg, 2));
                rankListDialog.LLJLLIL = c1810080xCg;
            }
            return rankListDialog;
        }
        return null;
    }
}
