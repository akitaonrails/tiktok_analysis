package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.bytedance.android.live.walletnew.RechargeDialogNew;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Rr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.bytedance.android.live.walletnew.RechargeDialogNew$initObservers$1", f = "RechargeDialogNew.kt", l = {454}, m = "invokeSuspend")
public final class C1354105Rr extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ RechargeDialogNew LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1354105Rr(RechargeDialogNew rechargeDialogNew, InterfaceC1364105Vn<? super C1354105Rr> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = rechargeDialogNew;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1354105Rr(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RechargeDialogNew@383d.initObservers$1");
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
            RechargeDialogNew rechargeDialogNew = this.LLILLJJLI;
            Lifecycle.State state = Lifecycle.State.STARTED;
            C1354205Rs c1354205Rs = new C1354205Rs(rechargeDialogNew, null);
            this.LL = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(rechargeDialogNew, state, c1354205Rs, this) == objLJFF) {
                C1C7U.LIZIZ("RechargeDialogNew@383d.initObservers$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RechargeDialogNew@383d.initObservers$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
