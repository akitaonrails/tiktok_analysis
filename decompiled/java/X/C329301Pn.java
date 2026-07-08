package X;

import com.bytedance.android.livesdk.comp.api.pcs.ui.decoration.LiveBoardApi;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.PreviewBulletinEditWidget;
import com.bytedance.android.livesdk.model.Board;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import tikcast.api.anchor.GetBoardResponse;

/* JADX INFO: renamed from: X.01Pn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.PreviewBulletinEditWidget$enterDecorationEditFromScheme$1$1", f = "PreviewBulletinEditWidget.kt", l = {314, 320}, m = "invokeSuspend")
public final class C329301Pn extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ PreviewBulletinEditWidget LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C329301Pn(long j, PreviewBulletinEditWidget previewBulletinEditWidget, String str, InterfaceC1364105Vn<? super C329301Pn> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = j;
        this.LLILZ = previewBulletinEditWidget;
        this.LLILZIL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C329301Pn c329301Pn = new C329301Pn(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c329301Pn.LLILLJJLI = obj;
        return c329301Pn;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        Board board;
        Object board2 = obj;
        C1C7U.LIZ("PreviewBulletinEditWidget@2c55.enterDecorationEditFromScheme$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(board2);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("PreviewBulletinEditWidget@2c55.enterDecorationEditFromScheme$1$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(board2);
        } else {
            C155000ia.LIZIZ(board2);
            long j = this.LLILLL;
            C480460Ism.LIZ().getClass();
            LiveBoardApi liveBoardApi = (LiveBoardApi) C480460Ism.LIZLLL(LiveBoardApi.class);
            long jLIZJ = C1152620g6G.LIZJ();
            this.LL = 1;
            board2 = liveBoardApi.getBoard(j, jLIZJ, this);
            if (board2 == objLJFF) {
                C1C7U.LIZIZ("PreviewBulletinEditWidget@2c55.enterDecorationEditFromScheme$1$1");
                return objLJFF;
            }
        }
        GetBoardResponse.ResponseData responseData = (GetBoardResponse.ResponseData) ((C470590Icr) board2).data;
        if (responseData != null && (board = responseData.board) != null) {
            c098200Yq = C125700dr.LIZ(board);
        } else {
            c098200Yq = null;
        }
        C189200o6.m2constructorimpl(c098200Yq);
        PreviewBulletinEditWidget previewBulletinEditWidget = this.LLILZ;
        String str = this.LLILZIL;
        if (C189200o6.m8isSuccessimpl(c098200Yq)) {
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C329101Pl c329101Pl = new C329101Pl((Board) c098200Yq, previewBulletinEditWidget, str, null);
            this.LLILLJJLI = c098200Yq;
            this.LL = 2;
            if (C23250099c.LJI(this, abstractC2238408pq, c329101Pl) == objLJFF) {
                C1C7U.LIZIZ("PreviewBulletinEditWidget@2c55.enterDecorationEditFromScheme$1$1");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("PreviewBulletinEditWidget@2c55.enterDecorationEditFromScheme$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
