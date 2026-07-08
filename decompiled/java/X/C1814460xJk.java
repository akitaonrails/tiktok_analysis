package X;

import com.bytedance.android.livesdk.model.Board;
import com.bytedance.android.livesdk.model.RecommendBoardInfo;
import com.bytedance.android.livesdk.model.SourcePB;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0xJk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1814460xJk extends C09AY implements Function0<Unit> {
    public final /* synthetic */ DataChannel LL;
    public final /* synthetic */ Board LLILLJJLI;
    public final /* synthetic */ C259800zU<Board> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1814460xJk(DataChannel dataChannel, Board board, C259800zU<Board> c259800zU) {
        super(0);
        this.LL = dataChannel;
        this.LLILLJJLI = board;
        this.LLILLL = c259800zU;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        String str;
        String str2;
        SourcePB sourcePB;
        String str3;
        SourcePB sourcePB2;
        SourcePB sourcePB3;
        SourcePB sourcePB4;
        SourcePB sourcePB5;
        SourcePB sourcePB6;
        SourcePB sourcePB7;
        DataChannel dataChannel = this.LL;
        HashMap map = new HashMap();
        Board board = this.LLILLJJLI;
        C259800zU<Board> c259800zU = this.LLILLL;
        map.put("smb_previous_page", "preset");
        map.put("board_set_id", String.valueOf(board.id));
        RecommendBoardInfo recommendBoardInfo = board.recommendBoardInfo;
        if (recommendBoardInfo == null || (string = Integer.valueOf(recommendBoardInfo.boardSource).toString()) == null) {
            string = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("board_source", string);
        map.put("board_type", "rich_text_decoration");
        RecommendBoardInfo recommendBoardInfo2 = c259800zU.element.recommendBoardInfo;
        String str4 = "";
        if (recommendBoardInfo2 == null || (sourcePB7 = recommendBoardInfo2.sourcePb) == null || (string2 = Long.valueOf(sourcePB7.strategyBoardValue).toString()) == null) {
            string2 = "";
        }
        map.put("strategy_board_value", string2);
        RecommendBoardInfo recommendBoardInfo3 = c259800zU.element.recommendBoardInfo;
        if (recommendBoardInfo3 == null || (sourcePB6 = recommendBoardInfo3.sourcePb) == null || (string3 = Long.valueOf(sourcePB6.strategyLiveType).toString()) == null) {
            string3 = "";
        }
        map.put("strategy_live_type", string3);
        RecommendBoardInfo recommendBoardInfo4 = c259800zU.element.recommendBoardInfo;
        if (recommendBoardInfo4 == null || (sourcePB5 = recommendBoardInfo4.sourcePb) == null || (string4 = Long.valueOf(sourcePB5.strategyBoardContentType).toString()) == null) {
            string4 = "";
        }
        map.put("strategy_board_content", string4);
        RecommendBoardInfo recommendBoardInfo5 = c259800zU.element.recommendBoardInfo;
        if (recommendBoardInfo5 == null || (sourcePB4 = recommendBoardInfo5.sourcePb) == null || (string5 = Long.valueOf(sourcePB4.industryId).toString()) == null) {
            string5 = "";
        }
        map.put("strategy_industry_code", string5);
        RecommendBoardInfo recommendBoardInfo6 = c259800zU.element.recommendBoardInfo;
        if (recommendBoardInfo6 == null || (sourcePB3 = recommendBoardInfo6.sourcePb) == null || (str = sourcePB3.promptVersion) == null) {
            str = "";
        }
        map.put("prompt_version", str);
        RecommendBoardInfo recommendBoardInfo7 = c259800zU.element.recommendBoardInfo;
        if (recommendBoardInfo7 == null || (sourcePB2 = recommendBoardInfo7.sourcePb) == null || (str2 = sourcePB2.industryName) == null) {
            str2 = "";
        }
        map.put("industry_name", str2);
        RecommendBoardInfo recommendBoardInfo8 = c259800zU.element.recommendBoardInfo;
        if (recommendBoardInfo8 != null && (sourcePB = recommendBoardInfo8.sourcePb) != null && (str3 = sourcePB.generateVersion) != null) {
            str4 = str3;
        }
        map.put("generate_version", str4);
        dataChannel.SX0(C772010UQd.class, map);
        return Unit.LIZ;
    }
}
