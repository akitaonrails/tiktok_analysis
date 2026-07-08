package X;

import com.bytedance.android.live.broadcast.api.UpsertIntelligentBoardSuccessEvent;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardsdisplay.intelligent.IntelligentBoardSaveAssem;
import com.bytedance.android.livesdk.model.Board;
import com.bytedance.android.livesdk.model.RecommendBoardInfo;
import com.bytedance.android.livesdk.model.SourcePB;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0xJm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1814480xJm extends C09AY implements Function1<C1814370xJb, Unit> {
    public final /* synthetic */ IntelligentBoardSaveAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1814480xJm(IntelligentBoardSaveAssem intelligentBoardSaveAssem) {
        super(1);
        this.LL = intelligentBoardSaveAssem;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1814370xJb c1814370xJb) {
        long jLongValue;
        DataChannel dataChannel;
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        String str;
        SourcePB sourcePB;
        String str2;
        SourcePB sourcePB2;
        SourcePB sourcePB3;
        SourcePB sourcePB4;
        SourcePB sourcePB5;
        SourcePB sourcePB6;
        C1814370xJb c1814370xJb2 = c1814370xJb;
        this.LL.LLIZLLLIL = false;
        DialogC19728412Gs dialogC19728412Gs = (DialogC19728412Gs) this.LL.LLJIJIL.getValue();
        if (dialogC19728412Gs != null) {
            C0FNV.LIZIZ(dialogC19728412Gs);
        }
        DataChannel dataChannel2 = this.LL.Go().LLILLJJLI;
        if (dataChannel2 != null) {
            dataChannel2.LC0(UpsertIntelligentBoardSuccessEvent.class, Boolean.TRUE);
        }
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        Long l = (Long) dataChannelGlobal.gg0(AnonymousClass1687.class);
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        dataChannelGlobal.JQ2(AnonymousClass1687.class, Long.valueOf(jLongValue + 1));
        Board board = c1814370xJb2.LIZ;
        if (C500260Jjc.LJJLIIIJ(this.LL.Go().LLILLJJLI) == 0 && board != null && (dataChannel = this.LL.Go().LLILLJJLI) != null) {
            HashMap map = new HashMap();
            map.put("smb_previous_page", "board_rec_template_card");
            map.put("board_set_id", String.valueOf(board.id));
            RecommendBoardInfo recommendBoardInfo = board.recommendBoardInfo;
            if (recommendBoardInfo == null || (string = Integer.valueOf(recommendBoardInfo.boardSource).toString()) == null) {
                string = CardStruct.IStatusCode.DEFAULT;
            }
            map.put("board_source", string);
            map.put("board_type", "rich_text_decoration");
            RecommendBoardInfo recommendBoardInfo2 = board.recommendBoardInfo;
            String str3 = "";
            if (recommendBoardInfo2 == null || (sourcePB6 = recommendBoardInfo2.sourcePb) == null || (string2 = Long.valueOf(sourcePB6.strategyBoardValue).toString()) == null) {
                string2 = "";
            }
            map.put("strategy_board_value", string2);
            RecommendBoardInfo recommendBoardInfo3 = board.recommendBoardInfo;
            if (recommendBoardInfo3 == null || (sourcePB5 = recommendBoardInfo3.sourcePb) == null || (string3 = Long.valueOf(sourcePB5.strategyLiveType).toString()) == null) {
                string3 = "";
            }
            map.put("strategy_live_type", string3);
            RecommendBoardInfo recommendBoardInfo4 = board.recommendBoardInfo;
            if (recommendBoardInfo4 == null || (sourcePB4 = recommendBoardInfo4.sourcePb) == null || (string4 = Long.valueOf(sourcePB4.strategyBoardContentType).toString()) == null) {
                string4 = "";
            }
            map.put("strategy_board_content", string4);
            RecommendBoardInfo recommendBoardInfo5 = board.recommendBoardInfo;
            if (recommendBoardInfo5 == null || (sourcePB3 = recommendBoardInfo5.sourcePb) == null || (string5 = Long.valueOf(sourcePB3.industryId).toString()) == null) {
                string5 = "";
            }
            map.put("strategy_industry_code", string5);
            RecommendBoardInfo recommendBoardInfo6 = board.recommendBoardInfo;
            if (recommendBoardInfo6 == null || (sourcePB2 = recommendBoardInfo6.sourcePb) == null || (str = sourcePB2.promptVersion) == null) {
                str = "";
            }
            map.put("prompt_version", str);
            RecommendBoardInfo recommendBoardInfo7 = board.recommendBoardInfo;
            if (recommendBoardInfo7 != null && (sourcePB = recommendBoardInfo7.sourcePb) != null && (str2 = sourcePB.industryName) != null) {
                str3 = str2;
            }
            map.put("industry_name", str3);
            dataChannel.SX0(C772010UQd.class, map);
        }
        C0U4R c0u4r = new C0U4R();
        IntelligentBoardSaveAssem intelligentBoardSaveAssem = this.LL;
        c0u4r.LIZ = intelligentBoardSaveAssem.getContext();
        c0u4r.LIZLLL = 2131851183;
        c0u4r.LIZJ = "ttlive_aiBorads_goLive_savedToast";
        c0u4r.LJII = intelligentBoardSaveAssem.Go().LLILLJJLI;
        c0u4r.LJFF = true;
        C766270U4b.LJIIJ(c0u4r);
        return Unit.LIZ;
    }
}
