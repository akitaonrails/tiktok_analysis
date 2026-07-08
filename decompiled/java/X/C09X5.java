package X;

import com.ss.android.ugc.aweme.tools.draft.DraftFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09X5, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.DraftFragment$initData$1$2", f = "DraftFragment.kt", l = {}, m = "invokeSuspend")
public final class C09X5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ DraftFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C09X5(DraftFragment draftFragment, InterfaceC1364105Vn<? super C09X5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = draftFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C09X5(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DraftFragment@975a.initData$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        DraftFragment draftFragment = this.LL;
        draftFragment.UR(draftFragment.PR().LLILZ);
        this.LL.PR().GQ2(true);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DraftFragment@975a.initData$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
