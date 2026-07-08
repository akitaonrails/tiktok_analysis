package X;

import Y.ARunnableS32S0201000_27;
import android.content.Context;
import android.view.View;
import com.bytedance.android.live.rank.impl.page.ui.CreatorRankingSubPageFragment;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.bytedance.android.livesdk.rank.list.model.RankListV2Response;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS108S0201000_27;
import kotlin.jvm.internal.AwS393S0200000_27;
import kotlin.jvm.internal.AwS44S0310000_27;
import njp.a;

/* JADX INFO: renamed from: X.0wZb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.android.live.rank.impl.page.ui.CreatorRankingSubPageFragment$onViewCreated$2$1$2", f = "CreatorRankingSubPageFragment.kt", l = {}, m = "invokeSuspend")
public final class C1785850wZb extends C09AX implements Function2<C867230Y0j, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ CreatorRankingSubPageFragment LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1785850wZb(CreatorRankingSubPageFragment creatorRankingSubPageFragment, int i, InterfaceC1364105Vn<? super C1785850wZb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = creatorRankingSubPageFragment;
        this.LLILLL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1785850wZb c1785850wZb = new C1785850wZb(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        c1785850wZb.LL = obj;
        return c1785850wZb;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C867230Y0j c867230Y0j, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c867230Y0j, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        RankListV2Response.RankView rankView;
        String str;
        C1777970wMt c1777970wMt;
        C1777960wMs c1777960wMs;
        C20600815jK<InterfaceC1891350zJl> state;
        C1C7U.LIZ("CreatorRankingSubPageFragment@9b06.onViewCreated$2$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C867230Y0j c867230Y0j = (C867230Y0j) this.LL;
        if (c867230Y0j == null) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("CreatorRankingSubPageFragment@9b06.onViewCreated$2$1$2");
            return unit;
        }
        C1785320wYk c1785320wYk = c867230Y0j.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("render content=");
        sbLIZ.append(c1785320wYk.LIZIZ);
        C20441214yg.LIZIZ("CreatorRankingSubPageFragment", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC1785410wYt interfaceC1785410wYt = c1785320wYk.LIZIZ;
        boolean z = false;
        if (interfaceC1785410wYt instanceof C1785910wZh) {
            C1786010wZr c1786010wZrTw = this.LLILLJJLI.MR().tw();
            int i = this.LLILLL;
            if (!c1786010wZrTw.LJFF.contains(Integer.valueOf(i))) {
                c1786010wZrTw.LJ.put(Integer.valueOf(i), 0);
                Integer num = c1786010wZrTw.LIZLLL;
                if (num != null && num.intValue() == i) {
                    c1786010wZrTw.LIZLLL = Integer.valueOf(i);
                }
            }
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLILLJJLI.LLILLL;
            if (viewOnAttachStateChangeListenerC20604515jv != null) {
                C786410Ut5.LJLLLLLL(8, viewOnAttachStateChangeListenerC20604515jv);
            }
            CreatorRankingSubPageFragment creatorRankingSubPageFragment = this.LLILLJJLI;
            C1749280vcc c1749280vcc = creatorRankingSubPageFragment.LLILZ;
            if (c1749280vcc != null) {
                int i2 = this.LLILLL;
                C1786390waT c1786390waT = C1786390waT.LIZ;
                Context contextRequireContext = creatorRankingSubPageFragment.requireContext();
                C1785910wZh c1785910wZh = (C1785910wZh) interfaceC1785410wYt;
                C1785870wZd c1785870wZd = c1785910wZh.LIZ;
                AwS108S0201000_27 awS108S0201000_27 = new AwS108S0201000_27(i2, creatorRankingSubPageFragment, interfaceC1785410wYt, 0);
                c1786390waT.getClass();
                C1786390waT.LIZIZ(c1749280vcc, contextRequireContext, c1785870wZd, awS108S0201000_27);
                C1785870wZd c1785870wZd2 = c1785910wZh.LIZ;
                if (c1785870wZd2.LIZ == EnumC1785890wZf.FRIEND_RANKING_EMPTY && (c1785870wZd2.LIZIZ instanceof C1556350qbR)) {
                    C1786010wZr c1786010wZrTw2 = creatorRankingSubPageFragment.MR().tw();
                    c1786010wZrTw2.getClass();
                    C1810690xDf c1810690xDf = C1810690xDf.LIZ;
                    DataChannel dataChannel = c1786010wZrTw2.LIZ.getDataChannel();
                    String strLIZLLL = c1786010wZrTw2.LIZLLL();
                    c1810690xDf.getClass();
                    C1810690xDf.LJIJ(dataChannel, strLIZLLL);
                }
            }
        } else if (interfaceC1785410wYt instanceof C1785390wYr) {
            C1749280vcc c1749280vcc2 = this.LLILLJJLI.LLILZ;
            if (c1749280vcc2 != null) {
                C1786390waT.LIZ.getClass();
                View viewFindViewWithTag = c1749280vcc2.findViewWithTag("creator_ranking_fallback_loading");
                if (viewFindViewWithTag != null) {
                    C786410Ut5.LJLLLLLL(8, viewFindViewWithTag);
                }
                c1749280vcc2.LLJJJJLIIL = C618310OMz.LIZ;
                C786410Ut5.LJLLLLLL(8, c1749280vcc2);
            }
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LLILLJJLI.LLILLL;
            if (viewOnAttachStateChangeListenerC20604515jv2 != null) {
                C786410Ut5.LJLLLLLL(0, viewOnAttachStateChangeListenerC20604515jv2);
            }
            C1786010wZr c1786010wZrTw3 = this.LLILLJJLI.MR().tw();
            int i3 = this.LLILLL;
            c1786010wZrTw3.LIZLLL = Integer.valueOf(i3);
            if (!c1786010wZrTw3.LJ.containsKey(Integer.valueOf(i3))) {
                c1786010wZrTw3.LJ.put(Integer.valueOf(i3), 0);
            }
            C1786010wZr c1786010wZrTw4 = this.LLILLJJLI.MR().tw();
            int i4 = this.LLILLL;
            C1785390wYr c1785390wYr = (C1785390wYr) interfaceC1785410wYt;
            C1785380wYq c1785380wYq = c1785390wYr.LIZIZ;
            if (c1785390wYr.LIZ) {
                c1786010wZrTw4.getClass();
            } else {
                C1157760gEY c1157760gEY = (C1157760gEY) c1786010wZrTw4.LIZ.YI().LLJILJILJ.getValue();
                if (c1157760gEY != null && (rankView = c1785380wYq.LIZLLL) != null && c1786010wZrTw4.LJI.add(Integer.valueOf(i4))) {
                    C1810410xDD c1810410xDDLIZIZ = C1786010wZr.LIZIZ(c1157760gEY, i4);
                    if (!c1786010wZrTw4.LIZ.LLIL() && i4 == RankTypeV2.LJJIIZ.type) {
                        C1810690xDf c1810690xDf2 = C1810690xDf.LIZ;
                        DataChannel dataChannel2 = c1786010wZrTw4.LIZ.getDataChannel();
                        c1810690xDf2.getClass();
                        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_suggest_creator_list_show");
                        c474500IjALIZ.LJIJJLI(dataChannel2);
                        C1810690xDf.LIZ(c474500IjALIZ, dataChannel2);
                        c474500IjALIZ.LJJII("rank_entrance", "enter_from");
                        c474500IjALIZ.LJJII("friends_ranking", "page_type");
                        c474500IjALIZ.LJJII("quick_match", "suggestion_type");
                        c474500IjALIZ.LIZ();
                    }
                    C1810690xDf c1810690xDf3 = C1810690xDf.LIZ;
                    DataChannel dataChannel3 = c1786010wZrTw4.LIZ.getDataChannel();
                    C1785370wYp c1785370wYp = c1785380wYq.LIZJ.LIZ;
                    if (c1785370wYp == null || (c1777970wMt = c1785370wYp.LJIIJ) == null || (c1777960wMs = c1777970wMt.LIZLLL) == null || (str = c1777960wMs.LIZLLL) == null) {
                        str = "";
                    }
                    C1810690xDf.LJJIFFI(c1810690xDf3, dataChannel3, rankView, c1810410xDDLIZIZ, false, str, c1786010wZrTw4.LIZ.o5(), 24);
                    C1810690xDf.LJJIJIIJI(rankView, c1810410xDDLIZIZ, c1786010wZrTw4.LIZ.LLIL(), c1786010wZrTw4.LIZ.getDataChannel());
                }
            }
            boolean zLLIL = this.LLILLJJLI.MR().LLIL();
            DataChannel dataChannel4 = this.LLILLJJLI.MR().getDataChannel();
            C861890XrX c861890XrX = c1785320wYk.LIZ;
            RankTypeV2 rankTypeV2 = c861890XrX.LIZ;
            if (c861890XrX.LIZIZ == -1) {
                z = true;
            }
            List<C1777420wM0> list = c867230Y0j.LIZIZ;
            CreatorRankingSubPageFragment creatorRankingSubPageFragment2 = this.LLILLJJLI;
            int i5 = this.LLILLL;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            for (C1777420wM0 c1777420wM0 : list) {
                RankTypeV2 rankTypeV22 = rankTypeV2;
                arrayList.add(new C1777580wMG(c1777420wM0.LIZ, c1777420wM0, rankTypeV22, z, dataChannel4, new AwS44S0310000_27(creatorRankingSubPageFragment2, rankTypeV2, c1777420wM0, zLLIL, 2), new AwS393S0200000_27(creatorRankingSubPageFragment2, rankTypeV2, 23), new C1785840wZa(creatorRankingSubPageFragment2, i5, c1777420wM0, interfaceC1785410wYt)));
                rankTypeV2 = rankTypeV22;
            }
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv3 = this.LLILLJJLI.LLILLL;
            if (viewOnAttachStateChangeListenerC20604515jv3 != null && (state = viewOnAttachStateChangeListenerC20604515jv3.getState()) != null) {
                state.LJIILL(arrayList, new ARunnableS32S0201000_27(this.LLILLL, this.LLILLJJLI, c1785320wYk, 0));
            }
        } else {
            throw new C1954807lC();
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("CreatorRankingSubPageFragment@9b06.onViewCreated$2$1$2");
        return unit2;
    }
}
