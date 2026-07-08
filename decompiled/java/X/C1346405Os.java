package X;

import Y.AgS193S0200000_2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Os, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.graph.plugin.GeneralStateExtsKt$toNodeStateChangeEvents$1", f = "GeneralStateExts.kt", l = {26}, m = "invokeSuspend")
public final class C1346405Os extends C09AX implements Function2<InterfaceC346701Wf<? super C443120HZe<? extends String, ? extends AbstractC1406905f1, ? extends AbstractC1406905f1>>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ InterfaceC346201Wa<C1346605Ou> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1346405Os(InterfaceC346201Wa<C1346605Ou> interfaceC346201Wa, InterfaceC1364105Vn<? super C1346405Os> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = interfaceC346201Wa;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1346405Os c1346405Os = new C1346405Os(this.LLILLL, interfaceC1364105Vn);
        c1346405Os.LLILLJJLI = obj;
        return c1346405Os;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.util.Map] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GeneralStateExtsKt@65.toNodeStateChangeEvents$1");
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
            InterfaceC346701Wf interfaceC346701Wf = (InterfaceC346701Wf) this.LLILLJJLI;
            C259800zU c259800zU = new C259800zU();
            c259800zU.element = C2097608Jq.LJ();
            InterfaceC346201Wa<C1346605Ou> interfaceC346201Wa = this.LLILLL;
            AgS193S0200000_2 agS193S0200000_2 = new AgS193S0200000_2(c259800zU, interfaceC346701Wf, 24);
            this.LL = 1;
            if (interfaceC346201Wa.collect(agS193S0200000_2, this) == objLJFF) {
                C1C7U.LIZIZ("GeneralStateExtsKt@65.toNodeStateChangeEvents$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GeneralStateExtsKt@65.toNodeStateChangeEvents$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC346701Wf<? super C443120HZe<? extends String, ? extends AbstractC1406905f1, ? extends AbstractC1406905f1>> interfaceC346701Wf, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC346701Wf, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
