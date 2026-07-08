package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.03mk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.payment.base.input.InputFormViewController$sendEvent$1", f = "InputFormViewController.kt", l = {98}, m = "invokeSuspend")
public final class C945203mk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C945103mj LLILLJJLI;
    public final /* synthetic */ AbstractC944703mf LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C945203mk(C945103mj c945103mj, AbstractC944703mf abstractC944703mf, InterfaceC1364105Vn<? super C945203mk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c945103mj;
        this.LLILLL = abstractC944703mf;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C945203mk(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InputFormViewController@7bed.sendEvent$1");
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
            C2252331DDr c2252331DDr = this.LLILLJJLI.LLIZLLLIL;
            AbstractC944703mf abstractC944703mf = this.LLILLL;
            this.LL = 1;
            if (c2252331DDr.emit(abstractC944703mf, this) == objLJFF) {
                C1C7U.LIZIZ("InputFormViewController@7bed.sendEvent$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("InputFormViewController@7bed.sendEvent$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
