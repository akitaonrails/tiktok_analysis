package X;

import com.bytedance.android.live.NativeDecorationOperationEvent;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.assems.viewmodel.LiveBoardsPageViewModel;
import com.bytedance.android.livesdk.model.Board;
import com.bytedance.android.livesdk.model.RecommendBoardInfo;
import com.bytedance.android.livesdk.model.SourcePB;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0xK0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1814620xK0 extends C09AY implements Function1<Boolean, Unit> {
    public final /* synthetic */ LiveBoardsPageViewModel LL;
    public final /* synthetic */ C1814780xKG LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1814620xK0(LiveBoardsPageViewModel liveBoardsPageViewModel, C1814780xKG c1814780xKG) {
        super(1);
        this.LL = liveBoardsPageViewModel;
        this.LLILLJJLI = c1814780xKG;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        DataChannel dataChannel;
        String string;
        String string2;
        String string3;
        String string4;
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
        String string5;
        String string6;
        C1814780xKG c1814780xKG;
        C1814780xKG c1814780xKGLIZLLL;
        C1814780xKG c1814780xKGLIZLLL2;
        boolean zBooleanValue = bool.booleanValue();
        if (zBooleanValue) {
            LiveBoardsPageViewModel liveBoardsPageViewModel = this.LL;
            if (!liveBoardsPageViewModel.LLILLJJLI) {
                C1814780xKG c1814780xKG2 = this.LLILLJJLI;
                List<ITEM> listListGetAll = liveBoardsPageViewModel.listGetAll();
                String str4 = CardStruct.IStatusCode.DEFAULT;
                if (listListGetAll != 0) {
                    ArrayList arrayList = new ArrayList();
                    for (ITEM item : listListGetAll) {
                        if (item instanceof AbstractC1814790xKH) {
                            AbstractC1814790xKH abstractC1814790xKH = (AbstractC1814790xKH) item;
                            if (abstractC1814790xKH.LIZIZ()) {
                                if ((item instanceof C1814780xKG) && (c1814780xKG = (C1814780xKG) item) != null && (c1814780xKGLIZLLL = C1814780xKG.LIZLLL(c1814780xKG, null, false, 0, 27)) != null) {
                                    arrayList.add(c1814780xKGLIZLLL);
                                }
                                Board boardLIZ = abstractC1814790xKH.LIZ();
                                DataChannel dataChannel2 = liveBoardsPageViewModel.LLILLL;
                                if (dataChannel2 == null || (string6 = Long.valueOf(C500260Jjc.LJJLIIIJ(dataChannel2)).toString()) == null) {
                                    string6 = CardStruct.IStatusCode.DEFAULT;
                                }
                                DataChannel dataChannel3 = liveBoardsPageViewModel.LLILLL;
                                if (dataChannel3 != null) {
                                    dataChannel3.LC0(NativeDecorationOperationEvent.class, new C443120HZe(boardLIZ, string6, 3));
                                }
                            } else if (Intrinsics.LJFF(item, c1814780xKG2)) {
                                if ((c1814780xKG2 instanceof C1814780xKG) && c1814780xKG2 != null && (c1814780xKGLIZLLL2 = C1814780xKG.LIZLLL(c1814780xKG2, null, true, 0, 27)) != null) {
                                    arrayList.add(c1814780xKGLIZLLL2);
                                }
                            }
                        }
                        arrayList.add(item);
                    }
                    liveBoardsPageViewModel.listSetItems(arrayList);
                    liveBoardsPageViewModel.setState(new C1815010xKd(c1814780xKG2));
                    liveBoardsPageViewModel.CQ2(c1814780xKG2, "display");
                }
                Board board = c1814780xKG2.LLILLL;
                if (liveBoardsPageViewModel.zQ2().LLILLJJLI && board != null && (dataChannel = liveBoardsPageViewModel.LLILLL) != null) {
                    HashMap map = new HashMap();
                    map.put("smb_previous_page", "board_management");
                    map.put("board_set_id", String.valueOf(board.id));
                    RecommendBoardInfo recommendBoardInfo = board.recommendBoardInfo;
                    if (recommendBoardInfo != null && (string5 = Integer.valueOf(recommendBoardInfo.boardSource).toString()) != null) {
                        str4 = string5;
                    }
                    map.put("board_source", str4);
                    map.put("board_type", "decoration");
                    RecommendBoardInfo recommendBoardInfo2 = board.recommendBoardInfo;
                    String str5 = "";
                    if (recommendBoardInfo2 == null || (sourcePB7 = recommendBoardInfo2.sourcePb) == null || (string = Long.valueOf(sourcePB7.strategyBoardValue).toString()) == null) {
                        string = "";
                    }
                    map.put("strategy_board_value", string);
                    RecommendBoardInfo recommendBoardInfo3 = board.recommendBoardInfo;
                    if (recommendBoardInfo3 == null || (sourcePB6 = recommendBoardInfo3.sourcePb) == null || (string2 = Long.valueOf(sourcePB6.strategyLiveType).toString()) == null) {
                        string2 = "";
                    }
                    map.put("strategy_live_type", string2);
                    RecommendBoardInfo recommendBoardInfo4 = board.recommendBoardInfo;
                    if (recommendBoardInfo4 == null || (sourcePB5 = recommendBoardInfo4.sourcePb) == null || (string3 = Long.valueOf(sourcePB5.strategyBoardContentType).toString()) == null) {
                        string3 = "";
                    }
                    map.put("strategy_board_content", string3);
                    RecommendBoardInfo recommendBoardInfo5 = board.recommendBoardInfo;
                    if (recommendBoardInfo5 == null || (sourcePB4 = recommendBoardInfo5.sourcePb) == null || (string4 = Long.valueOf(sourcePB4.industryId).toString()) == null) {
                        string4 = "";
                    }
                    map.put("strategy_industry_code", string4);
                    RecommendBoardInfo recommendBoardInfo6 = board.recommendBoardInfo;
                    if (recommendBoardInfo6 == null || (sourcePB3 = recommendBoardInfo6.sourcePb) == null || (str = sourcePB3.promptVersion) == null) {
                        str = "";
                    }
                    map.put("prompt_version", str);
                    RecommendBoardInfo recommendBoardInfo7 = board.recommendBoardInfo;
                    if (recommendBoardInfo7 == null || (sourcePB2 = recommendBoardInfo7.sourcePb) == null || (str2 = sourcePB2.industryName) == null) {
                        str2 = "";
                    }
                    map.put("industry_name", str2);
                    RecommendBoardInfo recommendBoardInfo8 = board.recommendBoardInfo;
                    if (recommendBoardInfo8 != null && (sourcePB = recommendBoardInfo8.sourcePb) != null && (str3 = sourcePB.generateVersion) != null) {
                        str5 = str3;
                    }
                    map.put("generate_version", str5);
                    dataChannel.SX0(C772010UQd.class, map);
                }
            }
        }
        this.LL.setState(new C1815040xKg(zBooleanValue));
        return Unit.LIZ;
    }
}
