package X;

import com.bytedance.android.live.PreviewBoardRenderDoneEvent;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.comp.api.pcs.data.setting.SmbLiveKickstarterSetting;
import com.bytedance.android.livesdk.comp.api.pcs.ui.decoration.LiveBoardApi;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardsdisplay.BoardsDisplayViewModel;
import com.bytedance.android.livesdk.model.Board;
import com.bytedance.android.livesdk.model.LastUsedLiveBoardsModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS237S0000000_7;
import njp.a;
import tikcast.api.anchor.GetBoardResponse;

/* JADX INFO: renamed from: X.0xJt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardsdisplay.BoardsDisplayViewModel$loadLastUsedBoard$1", f = "BoardsDisplayViewModel.kt", l = {227}, m = "invokeSuspend")
public final class C1814550xJt extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public LastUsedLiveBoardsModel LL;
    public long LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ BoardsDisplayViewModel LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ DataChannel LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1814550xJt(BoardsDisplayViewModel boardsDisplayViewModel, boolean z, DataChannel dataChannel, InterfaceC1364105Vn<? super C1814550xJt> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = boardsDisplayViewModel;
        this.LLILZIL = z;
        this.LLILZLL = dataChannel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1814550xJt(this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v19, types: [T, com.bytedance.android.livesdk.model.Board] */
    /* JADX WARN: Type inference failed for: r6v0, types: [T, com.bytedance.android.livesdk.model.Board] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        LastUsedLiveBoardsModel lastUsedLiveBoardsModelLIZIZ;
        long jCurrentTimeMillis;
        Board board;
        ?? LIZ;
        C1C7U.LIZ("BoardsDisplayViewModel@4c6d.loadLastUsedBoard$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLL;
        if (i != 0) {
            if (i == 1) {
                jCurrentTimeMillis = this.LLILLJJLI;
                lastUsedLiveBoardsModelLIZIZ = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            this.LLILZ.getClass();
            lastUsedLiveBoardsModelLIZIZ = C0KPJ.pf.LIZIZ();
            if (this.LLILZIL) {
                jCurrentTimeMillis = System.currentTimeMillis();
                LiveBoardApi liveBoardApi = this.LLILZ.LL;
                long j = lastUsedLiveBoardsModelLIZIZ.boardId;
                long jLIZJ = C1152620g6G.LIZJ();
                this.LL = lastUsedLiveBoardsModelLIZIZ;
                this.LLILLJJLI = jCurrentTimeMillis;
                this.LLILLL = 1;
                obj = liveBoardApi.getBoard(j, jLIZJ, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("BoardsDisplayViewModel@4c6d.loadLastUsedBoard$1");
                    return objLJFF;
                }
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("BoardsDisplayViewModel@4c6d.loadLastUsedBoard$1");
            return unit;
        }
        GetBoardResponse.ResponseData responseData = (GetBoardResponse.ResponseData) ((BaseResponse) obj).data;
        if (responseData != null && (board = responseData.board) != null && (LIZ = C125700dr.LIZ(board)) != 0) {
            if (C1152620g6G.LIZ(LIZ) && C1152620g6G.LIZIZ(LIZ)) {
                C259800zU c259800zU = new C259800zU();
                c259800zU.element = LIZ;
                if (C1152620g6G.LIZLLL(LIZ)) {
                    AbstractC481901uD abstractC481901uDLIZIZ = C481401u8.LIZIZ(LIZ);
                    if (abstractC481901uDLIZIZ instanceof C481501u9) {
                        c259800zU.element = ((C481501u9) abstractC481901uDLIZIZ).LIZ;
                    } else {
                        if (abstractC481901uDLIZIZ instanceof C481601uA) {
                            this.LLILZLL.LC0(PreviewBoardRenderDoneEvent.class, true);
                            Unit unit2 = Unit.LIZ;
                            C1C7U.LIZIZ("BoardsDisplayViewModel@4c6d.loadLastUsedBoard$1");
                            return unit2;
                        }
                        if (abstractC481901uDLIZIZ instanceof C482001uE) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("Migration failed at ");
                            C482001uE c482001uE = (C482001uE) abstractC481901uDLIZIZ;
                            sbLIZ.append(c482001uE.LIZ);
                            sbLIZ.append("->");
                            sbLIZ.append(c482001uE.LIZIZ);
                            sbLIZ.append(": ");
                            sbLIZ.append(c482001uE.LIZJ.getMessage());
                            C20441214yg.LJ("board_dsl", C2188811AlT.LIZIZ(sbLIZ));
                            this.LLILZLL.LC0(PreviewBoardRenderDoneEvent.class, true);
                            Unit unit3 = Unit.LIZ;
                            C1C7U.LIZIZ("BoardsDisplayViewModel@4c6d.loadLastUsedBoard$1");
                            return unit3;
                        }
                        throw new C1954807lC();
                    }
                }
                C1790620whI c1790620whI = C1790620whI.LIZ;
                c1790620whI.LIZ(System.currentTimeMillis() - jCurrentTimeMillis);
                C1790620whI.LJIILIIL(EnumC1154390g97.BOARD_APPLY, ((Board) c259800zU.element).id);
                c1790620whI.LIZLLL(EnumC1779720wPi.AUTO_APPLY_LAST_USED_BOARD);
                InterfaceC1814530xJr interfaceC1814530xJr = this.LLILZ.LLILLJJLI;
                if (interfaceC1814530xJr != null) {
                    interfaceC1814530xJr.LJIIIZ((Board) c259800zU.element, true, AFwS237S0000000_7.get$arr$(365), null);
                }
                C500260Jjc.LJJLIIIJJIZ(new C1814460xJk(this.LLILZLL, LIZ, c259800zU));
                Unit unit4 = Unit.LIZ;
                C1C7U.LIZIZ("BoardsDisplayViewModel@4c6d.loadLastUsedBoard$1");
                return unit4;
            }
            InterfaceC1814530xJr interfaceC1814530xJr2 = this.LLILZ.LLILLJJLI;
            if (interfaceC1814530xJr2 != null) {
                interfaceC1814530xJr2.LJIIJJI();
            }
            this.LLILZ.LLIZLLLIL = lastUsedLiveBoardsModelLIZIZ.boardId;
            C500260Jjc.LJJLIIIJJIZ(new C1814470xJl(this.LLILZLL));
            this.LLILZLL.LC0(PreviewBoardRenderDoneEvent.class, true);
            Unit unit5 = Unit.LIZ;
            C1C7U.LIZIZ("BoardsDisplayViewModel@4c6d.loadLastUsedBoard$1");
            return unit5;
        }
        if (SmbLiveKickstarterSetting.INSTANCE.isEnabled()) {
            this.LLILZ.LLIZLLLIL = lastUsedLiveBoardsModelLIZIZ.boardId;
            this.LLILZLL.LC0(PreviewBoardRenderDoneEvent.class, true);
        }
        Unit unit6 = Unit.LIZ;
        C1C7U.LIZIZ("BoardsDisplayViewModel@4c6d.loadLastUsedBoard$1");
        return unit6;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
