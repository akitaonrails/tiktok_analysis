package X;

import Y.AgS284S0100000_3;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09HT, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.draftbox.data.DraftLoader$observeDraftWithAsyncTasks$1$2$1", f = "DraftLoader.kt", l = {495}, m = "invokeSuspend")
public final class C09HT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC346201Wa<C539070LCf> LLILLJJLI;
    public final /* synthetic */ C0M03 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C09HT(InterfaceC346201Wa<C539070LCf> interfaceC346201Wa, C0M03 c0m03, InterfaceC1364105Vn<? super C09HT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC346201Wa;
        this.LLILLL = c0m03;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C09HT(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DraftLoader@8d42.observeDraftWithAsyncTasks$1$2$1");
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
            InterfaceC346201Wa<C539070LCf> interfaceC346201Wa = this.LLILLJJLI;
            AgS284S0100000_3 agS284S0100000_3 = new AgS284S0100000_3(this.LLILLL, 1);
            this.LL = 1;
            if (interfaceC346201Wa.collect(agS284S0100000_3, this) == objLJFF) {
                C1C7U.LIZIZ("DraftLoader@8d42.observeDraftWithAsyncTasks$1$2$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DraftLoader@8d42.observeDraftWithAsyncTasks$1$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
