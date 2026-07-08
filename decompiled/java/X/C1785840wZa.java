package X;

import com.bytedance.android.live.rank.impl.page.ui.CreatorRankingSubPageFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0wZa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1785840wZa extends C09AY implements Function1<Long, Unit> {
    public final /* synthetic */ CreatorRankingSubPageFragment LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ C1777420wM0 LLILLL;
    public final /* synthetic */ InterfaceC1785410wYt LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1785840wZa(CreatorRankingSubPageFragment creatorRankingSubPageFragment, int i, C1777420wM0 c1777420wM0, InterfaceC1785410wYt interfaceC1785410wYt) {
        super(1);
        this.LL = creatorRankingSubPageFragment;
        this.LLILLJJLI = i;
        this.LLILLL = c1777420wM0;
        this.LLILZ = interfaceC1785410wYt;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Long l) {
        long j;
        int iIntValue;
        long jLongValue = l.longValue();
        C1786010wZr c1786010wZrTw = this.LL.MR().tw();
        int i = this.LLILLJJLI;
        if (!c1786010wZrTw.LJFF.contains(Integer.valueOf(i))) {
            c1786010wZrTw.LIZLLL = Integer.valueOf(i);
            Integer num = c1786010wZrTw.LJ.get(Integer.valueOf(i));
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            c1786010wZrTw.LJ.put(Integer.valueOf(i), Integer.valueOf(Math.max(iIntValue, (int) jLongValue)));
        }
        C1777430wM1 c1777430wM1 = this.LLILLL.LIZJ;
        if (c1777430wM1 != null && c1777430wM1.LIZ) {
            C1786010wZr c1786010wZrTw2 = this.LL.MR().tw();
            int i2 = this.LLILLJJLI;
            C1777420wM0 c1777420wM0 = this.LLILLL;
            long j2 = c1777420wM0.LIZ;
            C1780260wQa c1780260wQa = c1777420wM0.LIZIZ.LJII;
            if (c1780260wQa != null) {
                j = c1780260wQa.LIZJ;
            } else {
                j = 0;
            }
            boolean z = !c1777430wM1.LIZJ;
            boolean z2 = ((C1785390wYr) this.LLILZ).LIZ;
            c1786010wZrTw2.getClass();
            if (!z2) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(i2);
                sbLIZ.append('|');
                sbLIZ.append(j2);
                if (c1786010wZrTw2.LJII.add(C2188811AlT.LIZIZ(sbLIZ))) {
                    if (c1786010wZrTw2.LIZ.LLIL()) {
                        C1810690xDf c1810690xDf = C1810690xDf.LIZ;
                        DataChannel dataChannel = c1786010wZrTw2.LIZ.getDataChannel();
                        c1810690xDf.getClass();
                        C1810690xDf.LJIL(dataChannel, "friends_ranking_quick_match", "rank_entrance", z);
                        C1810690xDf.LJIJJLI(c1786010wZrTw2.LIZ.getDataChannel(), "friends_ranking_quick_match", "rank_entrance", z);
                        C1810690xDf.LJIJJ(c1786010wZrTw2.LIZ.getDataChannel(), "friends_ranking_quick_match", z);
                    } else {
                        C1810690xDf c1810690xDf2 = C1810690xDf.LIZ;
                        DataChannel dataChannel2 = c1786010wZrTw2.LIZ.getDataChannel();
                        c1810690xDf2.getClass();
                        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_suggest_creator_invite_show");
                        c474500IjALIZ.LJIJJLI(dataChannel2);
                        C1810690xDf.LIZ(c474500IjALIZ, dataChannel2);
                        c474500IjALIZ.LJJII(Long.valueOf(j2), "suggest_anchor_id");
                        c474500IjALIZ.LJJII(Long.valueOf(j), "suggested_num");
                        c474500IjALIZ.LJJII("rank_entrance", "enter_from");
                        c474500IjALIZ.LJJII("friends_ranking", "page_type");
                        c474500IjALIZ.LJJII("quick_match", "suggestion_type");
                        c474500IjALIZ.LIZ();
                    }
                }
            }
        }
        return Unit.LIZ;
    }
}
