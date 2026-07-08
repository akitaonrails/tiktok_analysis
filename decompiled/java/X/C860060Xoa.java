package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Xoa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.SearchAdModuleExtKt$setStateWithCoroutine$1", f = "SearchAdModuleExt.kt", l = {93}, m = "invokeSuspend")
public final class C860060Xoa extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1010800cPW LLILLJJLI;
    public final /* synthetic */ AbstractC1010890cPf LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C860060Xoa(C1010800cPW c1010800cPW, AbstractC1010890cPf abstractC1010890cPf, InterfaceC1364105Vn<? super C860060Xoa> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1010800cPW;
        this.LLILLL = abstractC1010890cPf;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C860060Xoa(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchAdModuleExtKt@1f4b.setStateWithCoroutine$1");
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
            C1010800cPW c1010800cPW = this.LLILLJJLI;
            AbstractC1010890cPf abstractC1010890cPf = this.LLILLL;
            this.LL = 1;
            if (c1010800cPW.LIZ(abstractC1010890cPf, this) == objLJFF) {
                C1C7U.LIZIZ("SearchAdModuleExtKt@1f4b.setStateWithCoroutine$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchAdModuleExtKt@1f4b.setStateWithCoroutine$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
