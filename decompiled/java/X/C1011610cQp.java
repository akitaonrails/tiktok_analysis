package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.RepeatOnLifecycleKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0cQp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.SearchAdStateBridge$subscribe$1", f = "SearchAdStateBridge.kt", l = {63}, m = "invokeSuspend")
public final class C1011610cQp extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1011580cQm LLILLJJLI;
    public final /* synthetic */ EnumC1011130cQ3 LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1011610cQp(C1011580cQm c1011580cQm, EnumC1011130cQ3 enumC1011130cQ3, Function0<Unit> function0, InterfaceC1364105Vn<? super C1011610cQp> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1011580cQm;
        this.LLILLL = enumC1011130cQ3;
        this.LLILZ = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1011610cQp(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchAdStateBridge@1a5c.subscribe$1");
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
            C1011580cQm c1011580cQm = this.LLILLJJLI;
            LifecycleOwner lifecycleOwner = c1011580cQm.LIZ;
            Lifecycle.State state = Lifecycle.State.STARTED;
            C1011620cQq c1011620cQq = new C1011620cQq(c1011580cQm, this.LLILLL, this.LLILZ, null);
            this.LL = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(lifecycleOwner, state, c1011620cQq, this) == objLJFF) {
                C1C7U.LIZIZ("SearchAdStateBridge@1a5c.subscribe$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchAdStateBridge@1a5c.subscribe$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
