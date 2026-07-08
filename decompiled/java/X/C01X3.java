package X;

import com.bytedance.android.livesdk.comp.api.pcs.ui.decoration.LiveBoardApi;
import com.bytedance.android.livesdk.model.Board;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import tikcast.api.anchor.MigrateBoardReq;

/* JADX INFO: renamed from: X.01X3, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.dsl.BoardDslMigrator$uploadMigratedBoard$1", f = "BoardDslMigrator.kt", l = {109}, m = "invokeSuspend")
public final class C01X3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Board LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01X3(Board board, InterfaceC1364105Vn<? super C01X3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = board;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01X3(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BoardDslMigrator@ec3f.uploadMigratedBoard$1");
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
                C480460Ism.LIZ().getClass();
                LiveBoardApi liveBoardApi = (LiveBoardApi) C480460Ism.LIZLLL(LiveBoardApi.class);
                MigrateBoardReq migrateBoardReq = new MigrateBoardReq();
                migrateBoardReq.board = this.LLILLJJLI;
                migrateBoardReq.supportedDslVersion = C1152620g6G.LIZJ();
                this.LL = 1;
                obj = liveBoardApi.boardMigrate(migrateBoardReq, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("BoardDslMigrator@ec3f.uploadMigratedBoard$1");
                    return objLJFF;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("server migrate failed: ");
            sbLIZ.append(e.getMessage());
            C20441214yg.LJ("BoardDslMigrator", C2188811AlT.LIZIZ(sbLIZ));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BoardDslMigrator@ec3f.uploadMigratedBoard$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
