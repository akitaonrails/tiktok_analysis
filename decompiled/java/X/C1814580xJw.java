package X;

import com.bytedance.android.livesdk.comp.api.pcs.ui.decoration.LiveBoardApi;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.assems.viewmodel.LiveBoardsPageViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0xJw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.assems.viewmodel.LiveBoardsPageViewModel$refreshCompensationCombinationBoard$1$1", f = "LiveBoardsPageViewModel.kt", l = {756}, m = "invokeSuspend")
public final class C1814580xJw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1814370xJb LLILLL;
    public final /* synthetic */ LiveBoardsPageViewModel LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1814580xJw(C1814370xJb c1814370xJb, LiveBoardsPageViewModel liveBoardsPageViewModel, InterfaceC1364105Vn<? super C1814580xJw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1814370xJb;
        this.LLILZ = liveBoardsPageViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1814580xJw c1814580xJw = new C1814580xJw(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c1814580xJw.LLILLJJLI = obj;
        return c1814580xJw;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("LiveBoardsPageViewModel@b609.refreshCompensationCombinationBoard$1$1");
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
                C1814370xJb c1814370xJb = this.LLILLL;
                C480460Ism.LIZ().getClass();
                LiveBoardApi liveBoardApi = (LiveBoardApi) C480460Ism.LIZLLL(LiveBoardApi.class);
                long j = c1814370xJb.LIZ.id;
                long jLIZJ = C1152620g6G.LIZJ();
                this.LL = 1;
                obj = liveBoardApi.getBoard(j, jLIZJ, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("LiveBoardsPageViewModel@b609.refreshCompensationCombinationBoard$1$1");
                    return objLJFF;
                }
            }
            c098200Yq = (C470590Icr) obj;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        LiveBoardsPageViewModel liveBoardsPageViewModel = this.LLILZ;
        if (C189200o6.m8isSuccessimpl(c098200Yq)) {
            C500260Jjc.LJJLIIIJJIZ(new C1814610xJz((C470590Icr) c098200Yq, liveBoardsPageViewModel));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveBoardsPageViewModel@b609.refreshCompensationCombinationBoard$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
