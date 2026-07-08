package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.RepeatOnLifecycleKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Xot, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.SearchAdAnoleModule$initObservers$1", f = "SearchAdAnoleModule.kt", l = {153}, m = "invokeSuspend")
public final class C860250Xot extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1010390cOr LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C860250Xot(C1010390cOr c1010390cOr, InterfaceC1364105Vn<? super C860250Xot> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1010390cOr;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C860250Xot(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchAdAnoleModule@4d89.initObservers$1");
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
            C1010390cOr c1010390cOr = this.LLILLJJLI;
            LifecycleOwner lifecycleOwner = c1010390cOr.LLILZLL;
            if (lifecycleOwner != null) {
                Lifecycle.State state = Lifecycle.State.STARTED;
                C860260Xou c860260Xou = new C860260Xou(c1010390cOr, null);
                this.LL = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(lifecycleOwner, state, c860260Xou, this) == objLJFF) {
                    C1C7U.LIZIZ("SearchAdAnoleModule@4d89.initObservers$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchAdAnoleModule@4d89.initObservers$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
