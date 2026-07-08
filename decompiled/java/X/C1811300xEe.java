package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.rank.list.model.RankListV2Response;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastDoubleProtector;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0xEe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1811300xEe extends RecyclerView.ViewHolder {
    public final C1811280xEc LL;
    public final C1811280xEc LLILLJJLI;
    public final C1811280xEc LLILLL;

    public C1811300xEe(View view) {
        super(view);
        this.LL = (C1811280xEc) view.findViewById(R.id.yua);
        this.LLILLJJLI = (C1811280xEc) view.findViewById(R.id.yub);
        this.LLILLL = (C1811280xEc) view.findViewById(R.id.yuc);
    }

    public static final String L5(String str) {
        if (u.LJIIZILJ(str, "M", false)) {
            return String.valueOf((int) (CastDoubleProtector.parseDouble(C13LN.LJLL(1, str)) * ((double) 1000000)));
        }
        if (!u.LJIIZILJ(str, "K", false)) {
            return str;
        }
        return String.valueOf((int) (CastDoubleProtector.parseDouble(C13LN.LJLL(1, str)) * ((double) LSPassThroughRecordSizeConfig.DEFAULT)));
    }

    public final void I5(C1809930xCR c1809930xCR, boolean z, DataChannel dataChannel, InterfaceC1811380xEm interfaceC1811380xEm) {
        int i;
        int i2;
        int i3;
        Iterator<RankListV2Response.RankInfo> it2 = c1809930xCR.LIZ.iterator();
        while (it2.hasNext()) {
            interfaceC1811380xEm.LIZ(it2.next());
        }
        List<RankListV2Response.RankInfo> list = c1809930xCR.LIZ;
        this.LL.setBackground(C497740JfY.LJIIJ(R.drawable.ejn));
        this.LLILLJJLI.setBackground(C497740JfY.LJIIJ(R.drawable.ejo));
        this.LLILLL.setBackground(C497740JfY.LJIIJ(R.drawable.ejp));
        C1811280xEc c1811280xEc = this.LL;
        if (Intrinsics.LJFF(((RankListV2Response.RankInfo) ListProtector.get(list, 0)).scoreDescription, "1")) {
            i = 1;
        } else {
            i = 2;
        }
        c1811280xEc.setContentDescription(C497740JfY.LJIIL(2131755490, i, "1", C0KVU.LIZ(((RankListV2Response.RankInfo) ListProtector.get(list, 0)).user), L5(((RankListV2Response.RankInfo) ListProtector.get(list, 0)).scoreDescription)));
        C1811280xEc c1811280xEc2 = this.LLILLJJLI;
        if (Intrinsics.LJFF(((RankListV2Response.RankInfo) ListProtector.get(list, 1)).scoreDescription, "1")) {
            i2 = 1;
        } else {
            i2 = 2;
        }
        c1811280xEc2.setContentDescription(C497740JfY.LJIIL(2131755490, i2, "2", C0KVU.LIZ(((RankListV2Response.RankInfo) ListProtector.get(list, 1)).user), L5(((RankListV2Response.RankInfo) ListProtector.get(list, 1)).scoreDescription)));
        C1811280xEc c1811280xEc3 = this.LLILLL;
        if (Intrinsics.LJFF(((RankListV2Response.RankInfo) ListProtector.get(list, 2)).scoreDescription, "1")) {
            i3 = 1;
        } else {
            i3 = 2;
        }
        c1811280xEc3.setContentDescription(C497740JfY.LJIIL(2131755490, i3, "3", C0KVU.LIZ(((RankListV2Response.RankInfo) ListProtector.get(list, 2)).user), L5(((RankListV2Response.RankInfo) ListProtector.get(list, 2)).scoreDescription)));
        this.LL.LIZ(new C1811320xEg(c1809930xCR.LIZIZ.LIZIZ.rankName, dataChannel, (RankListV2Response.RankInfo) ListProtector.get(list, 0), true, new C1811330xEh(interfaceC1811380xEm), z, c1809930xCR.LIZIZ.LJ));
        this.LLILLJJLI.LIZ(new C1811320xEg(c1809930xCR.LIZIZ.LIZIZ.rankName, dataChannel, (RankListV2Response.RankInfo) ListProtector.get(list, 1), false, new C1811340xEi(interfaceC1811380xEm), z, c1809930xCR.LIZIZ.LJ));
        this.LLILLL.LIZ(new C1811320xEg(c1809930xCR.LIZIZ.LIZIZ.rankName, dataChannel, (RankListV2Response.RankInfo) ListProtector.get(list, 2), false, new C1811350xEj(interfaceC1811380xEm), z, c1809930xCR.LIZIZ.LJ));
        RankListV2Response.TeamRankExtra teamRankExtra = ((RankListV2Response.RankInfo) ListProtector.get(list, 0)).teamRankExtra;
        if (teamRankExtra != null && !Intrinsics.LJFF(teamRankExtra.clubName, "")) {
            this.LL.LJFF();
        }
        RankListV2Response.TeamRankExtra teamRankExtra2 = ((RankListV2Response.RankInfo) ListProtector.get(list, 1)).teamRankExtra;
        if (teamRankExtra2 != null && !Intrinsics.LJFF(teamRankExtra2.clubName, "")) {
            this.LLILLJJLI.LJFF();
        }
        RankListV2Response.TeamRankExtra teamRankExtra3 = ((RankListV2Response.RankInfo) ListProtector.get(list, 2)).teamRankExtra;
        if (teamRankExtra3 != null && !Intrinsics.LJFF(teamRankExtra3.clubName, "")) {
            this.LLILLL.LJFF();
        }
    }
}
