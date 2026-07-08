package X;

import com.bytedance.android.livesdk.broadcast.preview.widget.boards.LiveBoardsWidget;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01QJ, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.livesdk.broadcast.preview.widget.boards.LiveBoardsWidget$appealStatusRefresh$1", f = "LiveBoardsWidget.kt", l = {385}, m = "invokeSuspend")
public final class C01QJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ LiveBoardsWidget LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01QJ(long j, LiveBoardsWidget liveBoardsWidget, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = liveBoardsWidget;
        this.LLILLL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01QJ(this.LLILLL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveBoardsWidget@32f5.appealStatusRefresh$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            long j = this.LLILLJJLI.LLJI;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("LiveBoardsWidget@32f5.appealStatusRefresh$1");
                return objLJFF;
            }
        }
        LiveBoardsWidget liveBoardsWidget = this.LLILLJJLI;
        C23250099c.LIZLLL(liveBoardsWidget.LLIZLLLIL, C0PEM.LIZJ, null, new C01QI(this.LLILLL, liveBoardsWidget, null), 2);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveBoardsWidget@32f5.appealStatusRefresh$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
