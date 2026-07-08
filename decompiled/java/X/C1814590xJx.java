package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.assems.viewmodel.LiveBoardsPageViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0xJx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.assems.viewmodel.LiveBoardsPageViewModel$deleteBoards$1", f = "LiveBoardsPageViewModel.kt", l = {337, 339}, m = "invokeSuspend")
public final class C1814590xJx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ LiveBoardsPageViewModel LLILLL;
    public final /* synthetic */ AbstractC1814790xKH LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1814590xJx(LiveBoardsPageViewModel liveBoardsPageViewModel, AbstractC1814790xKH abstractC1814790xKH, InterfaceC1364105Vn<? super C1814590xJx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = liveBoardsPageViewModel;
        this.LLILZ = abstractC1814790xKH;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1814590xJx c1814590xJx = new C1814590xJx(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c1814590xJx.LLILLJJLI = obj;
        return c1814590xJx;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("LiveBoardsPageViewModel@b609.deleteBoards$1");
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
                    c098200Yq = this.LLILLJJLI;
                    C155000ia.LIZIZ(obj);
                    C189200o6.m5exceptionOrNullimpl(c098200Yq);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("LiveBoardsPageViewModel@b609.deleteBoards$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            LiveBoardsPageViewModel liveBoardsPageViewModel = this.LLILLL;
            AbstractC1814790xKH abstractC1814790xKH = this.LLILZ;
            InterfaceC1813970xIx interfaceC1813970xIx = (InterfaceC1813970xIx) liveBoardsPageViewModel.LLILZIL.getValue().getOperator();
            long j = abstractC1814790xKH.LIZ().id;
            this.LL = 1;
            obj = interfaceC1813970xIx.LJJZ(j, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("LiveBoardsPageViewModel@b609.deleteBoards$1");
                return objLJFF;
            }
        }
        c098200Yq = (C470590Icr) obj;
        C189200o6.m2constructorimpl(c098200Yq);
        LiveBoardsPageViewModel liveBoardsPageViewModel2 = this.LLILLL;
        AbstractC1814790xKH abstractC1814790xKH2 = this.LLILZ;
        if (C189200o6.m8isSuccessimpl(c098200Yq)) {
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C1814600xJy c1814600xJy = new C1814600xJy(liveBoardsPageViewModel2, abstractC1814790xKH2, null);
            this.LLILLJJLI = c098200Yq;
            this.LL = 2;
            if (C23250099c.LJI(this, abstractC2238408pq, c1814600xJy) == objLJFF) {
                C1C7U.LIZIZ("LiveBoardsPageViewModel@b609.deleteBoards$1");
                return objLJFF;
            }
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("LiveBoardsPageViewModel@b609.deleteBoards$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
