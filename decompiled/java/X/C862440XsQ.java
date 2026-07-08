package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0XsQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.DefaultIMUseCaseCenter$recallSentMessage$1", f = "DefaultIMUseCaseCenter.kt", l = {606}, m = "invokeSuspend")
public final class C862440XsQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C863650XuN LLILLJJLI;
    public final /* synthetic */ C869590Y9l LLILLL;
    public final /* synthetic */ InterfaceC863600XuI<C869590Y9l> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C862440XsQ(C863650XuN c863650XuN, C869590Y9l c869590Y9l, InterfaceC863600XuI<C869590Y9l> interfaceC863600XuI, InterfaceC1364105Vn<? super C862440XsQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c863650XuN;
        this.LLILLL = c869590Y9l;
        this.LLILZ = interfaceC863600XuI;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C862440XsQ(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DefaultIMUseCaseCenter@568c.recallSentMessage$1");
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
            C0Y3S c0y3sLJIILIIL = this.LLILLJJLI.LLILZIL.LJIILIIL();
            C869590Y9l c869590Y9l = this.LLILLL;
            InterfaceC863600XuI<C869590Y9l> interfaceC863600XuI = this.LLILZ;
            this.LL = 1;
            if (c0y3sLJIILIIL.LJFF(interfaceC863600XuI, c869590Y9l, this) == objLJFF) {
                C1C7U.LIZIZ("DefaultIMUseCaseCenter@568c.recallSentMessage$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DefaultIMUseCaseCenter@568c.recallSentMessage$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
