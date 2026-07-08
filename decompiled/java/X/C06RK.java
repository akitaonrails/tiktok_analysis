package X;

import com.ss.android.ugc.aweme.tako.otherpage.waiting.TakoWaitingListActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06RK, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.otherpage.waiting.TakoWaitingListActivity$initFinishedView$3", f = "TakoWaitingListActivity.kt", l = {164}, m = "invokeSuspend")
public final class C06RK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ TakoWaitingListActivity LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06RK(TakoWaitingListActivity takoWaitingListActivity, InterfaceC1364105Vn<? super C06RK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = takoWaitingListActivity;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C06RK(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoWaitingListActivity@aaf.initFinishedView$3");
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
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(3000L, this) == objLJFF) {
                C1C7U.LIZIZ("TakoWaitingListActivity@aaf.initFinishedView$3");
                return objLJFF;
            }
        }
        this.LLILLJJLI.finish();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoWaitingListActivity@aaf.initFinishedView$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
