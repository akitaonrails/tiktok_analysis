package X;

import android.os.Bundle;
import com.bytedance.android.live.rank.impl.page.ui.CreatorRankingPageDialogFragment;

/* JADX INFO: renamed from: X.0wa3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1786130wa3 {
    public static CreatorRankingPageDialogFragment LIZ(long j, long j2, int i, Integer num, long j3, Long l, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("newInstance roomId=");
        sbLIZ.append(j);
        sbLIZ.append(" creatorId=");
        sbLIZ.append(j2);
        sbLIZ.append(" initialSubRankTypeV2=");
        sbLIZ.append(i);
        sbLIZ.append(" initialFirstRankTypeV2=");
        sbLIZ.append(num);
        sbLIZ.append(" period=");
        sbLIZ.append(j3);
        sbLIZ.append(" targetCreatorId=");
        sbLIZ.append(l);
        sbLIZ.append(" source=");
        sbLIZ.append(str);
        C20441214yg.LIZIZ("CreatorRankingPageDialogFragment", C2188811AlT.LIZIZ(sbLIZ));
        C1810210xCt.LJIIIZ = str;
        CreatorRankingPageDialogFragment creatorRankingPageDialogFragment = new CreatorRankingPageDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putLong("arg_room_id", j);
        bundle.putLong("arg_creator_id", j2);
        bundle.putInt("arg_initial_sub_rank_type_v2", i);
        if (num != null) {
            bundle.putInt("arg_initial_first_rank_type_v2", num.intValue());
        }
        bundle.putLong("arg_period", j3);
        C786410Ut5.LJJJI("arg_source", str, bundle);
        if (l != null) {
            bundle.putLong("arg_target_creator_id", l.longValue());
        }
        creatorRankingPageDialogFragment.setArguments(bundle);
        return creatorRankingPageDialogFragment;
    }
}
