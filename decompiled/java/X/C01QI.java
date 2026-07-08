package X;

import com.bytedance.android.livesdk.broadcast.preview.widget.boards.LiveBoardsWidget;
import com.bytedance.android.livesdk.comp.api.pcs.ui.decoration.LiveBoardApi;
import com.bytedance.android.livesdk.model.Board;
import com.bytedance.common.utility.Logger;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import tikcast.api.anchor.GetBoardResponse;

/* JADX INFO: renamed from: X.01QI, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.livesdk.broadcast.preview.widget.boards.LiveBoardsWidget$appealStatusRefresh$1$1", f = "LiveBoardsWidget.kt", l = {389}, m = "invokeSuspend")
public final class C01QI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ LiveBoardsWidget LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01QI(long j, LiveBoardsWidget liveBoardsWidget, InterfaceC1364105Vn<? super C01QI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = j;
        this.LLILZ = liveBoardsWidget;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C01QI c01qi = new C01QI(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c01qi.LLILLJJLI = obj;
        return c01qi;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        boolean z;
        boolean z2;
        Board board;
        C1C7U.LIZ("LiveBoardsWidget@32f5.appealStatusRefresh$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        boolean z3 = true;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                long j = this.LLILLL;
                C01GW<C0UVW> c01gw = C0UVW.LIZIZ;
                C0UVW c0uvwLIZ = C01QD.LIZ();
                c0uvwLIZ.getClass();
                LiveBoardApi liveBoardApi = (LiveBoardApi) c0uvwLIZ.LIZJ(LiveBoardApi.class);
                long jLIZJ = C1152620g6G.LIZJ();
                this.LL = 1;
                obj = liveBoardApi.getBoard(j, jLIZJ, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("LiveBoardsWidget@32f5.appealStatusRefresh$1$1");
                    return objLJFF;
                }
            }
            GetBoardResponse.ResponseData responseData = (GetBoardResponse.ResponseData) ((C470590Icr) obj).data;
            if (responseData != null && (board = responseData.board) != null && board.status == 2) {
                z = true;
            } else {
                z = false;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("check status ");
            if (z) {
                z2 = true;
            } else {
                z2 = false;
            }
            sbLIZ.append(z2);
            Logger.i("board_feature", C2188811AlT.LIZIZ(sbLIZ));
            if (!z) {
                z3 = false;
            }
            c098200Yq = Boolean.valueOf(z3);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        LiveBoardsWidget liveBoardsWidget = this.LLILZ;
        if (C189200o6.m8isSuccessimpl(c098200Yq)) {
            C500260Jjc.LJJLIIIJJIZ(new C01QK(((Boolean) c098200Yq).booleanValue(), liveBoardsWidget));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveBoardsWidget@32f5.appealStatusRefresh$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
