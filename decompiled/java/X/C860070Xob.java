package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Xob, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.player.SearchAdPlayerModule$setState$1", f = "SearchAdPlayerModule.kt", l = {244}, m = "invokeSuspend")
public final class C860070Xob extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1010790cPV LLILLJJLI;
    public final /* synthetic */ AbstractC1010890cPf LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C860070Xob(C1010790cPV c1010790cPV, AbstractC1010890cPf abstractC1010890cPf, InterfaceC1364105Vn<? super C860070Xob> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1010790cPV;
        this.LLILLL = abstractC1010890cPf;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C860070Xob(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchAdPlayerModule@3d3c.setState$1");
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
            C1010800cPW c1010800cPW = this.LLILLJJLI.LLIZ;
            AbstractC1010890cPf abstractC1010890cPf = this.LLILLL;
            this.LL = 1;
            if (c1010800cPW.LIZ(abstractC1010890cPf, this) == objLJFF) {
                C1C7U.LIZIZ("SearchAdPlayerModule@3d3c.setState$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchAdPlayerModule@3d3c.setState$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
