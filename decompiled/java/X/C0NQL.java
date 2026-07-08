package X;

import Y.AgS303S0100000_22;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NQL, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.mixediting.ui.MaterialSceneViewDelegate$initView$1$10$1$1", f = "MaterialSceneViewDelegate.kt", l = {215}, m = "invokeSuspend")
public final class C0NQL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC346201Wa<EnumC578300MmC> LLILLJJLI;
    public final /* synthetic */ C1414130mu3 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0NQL(InterfaceC346201Wa<? extends EnumC578300MmC> interfaceC346201Wa, C1414130mu3 c1414130mu3, InterfaceC1364105Vn<? super C0NQL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC346201Wa;
        this.LLILLL = c1414130mu3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NQL(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MaterialSceneViewDelegate@699f.initView$1$10$1$1");
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
            InterfaceC346201Wa<EnumC578300MmC> interfaceC346201Wa = this.LLILLJJLI;
            AgS303S0100000_22 agS303S0100000_22 = new AgS303S0100000_22(this.LLILLL, 10);
            this.LL = 1;
            if (interfaceC346201Wa.collect(agS303S0100000_22, this) == objLJFF) {
                C1C7U.LIZIZ("MaterialSceneViewDelegate@699f.initView$1$10$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MaterialSceneViewDelegate@699f.initView$1$10$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
