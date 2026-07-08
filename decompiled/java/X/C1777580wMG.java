package X;

import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS393S0200000_27;
import kotlin.jvm.internal.AwS44S0310000_27;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wMG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1777580wMG implements InterfaceC1891350zJl {
    public final long LL;
    public final C1777420wM0 LLILLJJLI;
    public final RankTypeV2 LLILLL;
    public final boolean LLILZ;
    public final DataChannel LLILZIL;
    public final Function1<Long, Unit> LLILZLL;
    public final Function1<Long, Unit> LLIZ;
    public final Function1<Long, Unit> LLIZLLLIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1777580wMG)) {
            return false;
        }
        C1777580wMG c1777580wMG = (C1777580wMG) obj;
        return this.LL == c1777580wMG.LL && Intrinsics.LJFF(this.LLILLJJLI, c1777580wMG.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1777580wMG.LLILLL) && this.LLILZ == c1777580wMG.LLILZ && Intrinsics.LJFF(this.LLILZIL, c1777580wMG.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1777580wMG.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1777580wMG.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c1777580wMG.LLIZLLLIL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CreatorRankingRankItem(userId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", renderModel=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", rankType=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", isHistory=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", dataChannel=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", onRowClick=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", onMatchRecommendClick=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", onItemShown=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        int iY2 = ((((((C786410Ut5.Y2(this.LL) * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.type) * 31) + C786410Ut5.Z2(this.LLILZ)) * 31;
        DataChannel dataChannel = this.LLILZIL;
        return ((((((iY2 + (dataChannel == null ? 0 : dataChannel.hashCode())) * 31) + this.LLILZLL.hashCode()) * 31) + this.LLIZ.hashCode()) * 31) + this.LLIZLLLIL.hashCode();
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if ((interfaceC1891350zJl instanceof C1777580wMG) && Intrinsics.LJFF(this.LLILLJJLI, ((C1777580wMG) interfaceC1891350zJl).LLILLJJLI)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if ((interfaceC1891350zJl instanceof C1777580wMG) && this.LL == ((C1777580wMG) interfaceC1891350zJl).LL) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C1777580wMG) || !areItemTheSame(interfaceC1891350zJl)) {
            return null;
        }
        C1777420wM0 c1777420wM0 = ((C1777580wMG) interfaceC1891350zJl).LLILLJJLI;
        C1777420wM0 c1777420wM02 = this.LLILLJJLI;
        C1777430wM1 c1777430wM1 = c1777420wM0.LIZJ;
        long j = c1777420wM02.LIZ;
        C1785370wYp c1785370wYp = c1777420wM02.LIZIZ;
        boolean z = c1777420wM02.LIZLLL;
        c1777420wM02.getClass();
        if (!Intrinsics.LJFF(new C1777420wM0(j, c1785370wYp, c1777430wM1, z), c1777420wM0)) {
            return null;
        }
        return "payload_match_recommend";
    }

    public C1777580wMG(long j, C1777420wM0 c1777420wM0, RankTypeV2 rankTypeV2, boolean z, DataChannel dataChannel, AwS44S0310000_27 awS44S0310000_27, AwS393S0200000_27 awS393S0200000_27, C1785840wZa c1785840wZa) {
        this.LL = j;
        this.LLILLJJLI = c1777420wM0;
        this.LLILLL = rankTypeV2;
        this.LLILZ = z;
        this.LLILZIL = dataChannel;
        this.LLILZLL = awS44S0310000_27;
        this.LLIZ = awS393S0200000_27;
        this.LLIZLLLIL = c1785840wZa;
    }
}
