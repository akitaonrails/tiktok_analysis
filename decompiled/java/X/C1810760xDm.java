package X;

import android.util.SparseLongArray;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import webcast.api.ranklist_class.LeagueMatchBannerInfo;

/* JADX INFO: renamed from: X.0xDm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1810760xDm implements InterfaceC1811020xEC {
    public final DataChannel LIZ;

    public C1810760xDm(DataChannel dataChannel) {
        this.LIZ = dataChannel;
    }

    @Override // X.InterfaceC1811020xEC
    public final void LIZ(LeagueMatchBannerInfo leagueMatchBannerInfo, boolean z) {
        SparseLongArray sparseLongArray = C1810700xDg.LIZ;
        C1810700xDg.LJFF(RankTypeV2.LJJIIZI.type, leagueMatchBannerInfo.rank, false);
        boolean zLJIIZILJ = C500260Jjc.LJIIZILJ(this.LIZ);
        int i = leagueMatchBannerInfo.stage;
        if (zLJIIZILJ && C1810700xDg.LIZ() != i) {
            InterfaceC1094280eaA.xd.LIZJ(String.valueOf(i));
        }
        C1810700xDg.LJIIIIZZ = i;
        if (zLJIIZILJ && C1810700xDg.LIZJ() != z) {
            InterfaceC1094280eaA.wd.LIZJ(Boolean.valueOf(z));
        }
        C1810700xDg.LJIIIZ = z;
        String strValueOf = String.valueOf(leagueMatchBannerInfo.endTimestampSec);
        C0JT6<String> c0jt6 = InterfaceC1094280eaA.f143yd;
        String strLIZ = c0jt6.LIZ();
        if (strLIZ == null) {
            strLIZ = CardStruct.IStatusCode.DEFAULT;
        }
        if (strValueOf.compareTo(strLIZ) > 0) {
            c0jt6.LIZJ(strValueOf);
        }
    }
}
