package X;

import Y.AObjectS282S0200000_3;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08jp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "androidx.lifecycle.viewmodel.compose.EventFlowKt$eventFlow$1", f = "EventFlow.kt", l = {22}, m = "invokeSuspend")
public final class C2201108jp extends C09AX implements Function2<C094D<? super Lifecycle.Event>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ Lifecycle LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2201108jp(Lifecycle lifecycle, InterfaceC1364105Vn<? super C2201108jp> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = lifecycle;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C2201108jp c2201108jp = new C2201108jp(this.LLILLL, interfaceC1364105Vn);
        c2201108jp.LLILLJJLI = obj;
        return c2201108jp;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
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
            final C094D c094d = (C094D) this.LLILLJJLI;
            LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: X.08jq
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    c094d.LJIIIIZZ(event);
                }
            };
            this.LLILLL.addObserver(lifecycleEventObserver);
            AObjectS282S0200000_3 aObjectS282S0200000_3 = new AObjectS282S0200000_3(this.LLILLL, lifecycleEventObserver, 1);
            this.LL = 1;
            if (C23128094k.LIZ(c094d, aObjectS282S0200000_3, this) == objLJFF) {
                return objLJFF;
            }
        }
        return Unit.LIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C094D<? super Lifecycle.Event> c094d, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c094d, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
