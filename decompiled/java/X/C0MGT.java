package X;

import com.ss.android.ugc.aweme.portrait.tab.AIPortraitTabFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0MGT, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.portrait.tab.AIPortraitTabFragment$bindViews$3$1$1", f = "AIPortraitTabFragment.kt", l = {}, m = "invokeSuspend")
public final class C0MGT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AIPortraitTabFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0MGT(AIPortraitTabFragment aIPortraitTabFragment, InterfaceC1364105Vn<? super C0MGT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = aIPortraitTabFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0MGT(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIPortraitTabFragment@e881.bindViews$3$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.PR().wQ2();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AIPortraitTabFragment@e881.bindViews$3$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
