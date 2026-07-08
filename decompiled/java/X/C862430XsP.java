package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0XsP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.DefaultIMUseCaseCenter$recallReceivedMessage$1", f = "DefaultIMUseCaseCenter.kt", l = {616}, m = "invokeSuspend")
public final class C862430XsP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C863650XuN LLILLJJLI;
    public final /* synthetic */ C869590Y9l LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ Function1<C0Y7K, Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C862430XsP(C863650XuN c863650XuN, C869590Y9l c869590Y9l, String str, Function1<? super C0Y7K, Unit> function1, InterfaceC1364105Vn<? super C862430XsP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c863650XuN;
        this.LLILLL = c869590Y9l;
        this.LLILZ = str;
        this.LLILZIL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C862430XsP(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DefaultIMUseCaseCenter@568c.recallReceivedMessage$1");
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
            String str = this.LLILZ;
            this.LL = 1;
            obj = c0y3sLJIILIIL.LJ(c869590Y9l, str, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("DefaultIMUseCaseCenter@568c.recallReceivedMessage$1");
                return objLJFF;
            }
        }
        Function1<C0Y7K, Unit> function1 = this.LLILZIL;
        if (function1 != null) {
            function1.invoke((C0Y7K) obj);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DefaultIMUseCaseCenter@568c.recallReceivedMessage$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
