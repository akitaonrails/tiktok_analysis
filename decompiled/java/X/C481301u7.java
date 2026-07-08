package X;

import com.bytedance.android.livesdk.comp.api.pcs.ui.decoration.LiveBoardApi;
import com.bytedance.android.livesdk.model.Board;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import tikcast.api.anchor.BatchMigrateBoardReq;

/* JADX INFO: renamed from: X.01u7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.dsl.BoardDslMigrator$batchMigrate$1", f = "BoardDslMigrator.kt", l = {64}, m = "invokeSuspend")
public final class C481301u7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ List<Board> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C481301u7(List<Board> list, InterfaceC1364105Vn<? super C481301u7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C481301u7(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C481501u9 c481501u9;
        C1C7U.LIZ("BoardDslMigrator@ec3f.batchMigrate$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                List<Board> list = this.LLILLJJLI;
                ArrayList arrayList = new ArrayList();
                Iterator<Board> it2 = list.iterator();
                while (it2.hasNext()) {
                    AbstractC481901uD abstractC481901uDLIZJ = C481401u8.LIZJ(it2.next());
                    Board board = null;
                    if (abstractC481901uDLIZJ instanceof C481501u9) {
                        c481501u9 = (C481501u9) abstractC481901uDLIZJ;
                    } else {
                        c481501u9 = null;
                    }
                    if (c481501u9 != null) {
                        board = c481501u9.LIZ;
                    }
                    if (board != null) {
                        arrayList.add(board);
                    }
                }
                if (arrayList.isEmpty()) {
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("BoardDslMigrator@ec3f.batchMigrate$1");
                    return unit;
                }
                C480460Ism.LIZ().getClass();
                LiveBoardApi liveBoardApi = (LiveBoardApi) C480460Ism.LIZLLL(LiveBoardApi.class);
                BatchMigrateBoardReq batchMigrateBoardReq = new BatchMigrateBoardReq();
                batchMigrateBoardReq.boards = new ArrayList(arrayList);
                batchMigrateBoardReq.supportedDslVersion = C1152620g6G.LIZJ();
                this.LL = 1;
                obj = liveBoardApi.boardBatchMigrate(batchMigrateBoardReq, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("BoardDslMigrator@ec3f.batchMigrate$1");
                    return objLJFF;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("server batch migrate failed: ");
            sbLIZ.append(e.getMessage());
            C20441214yg.LJ("BoardDslMigrator", C2188811AlT.LIZIZ(sbLIZ));
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("BoardDslMigrator@ec3f.batchMigrate$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
