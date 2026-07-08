package X;

import androidx.work.CoroutineWorker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Vhy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "androidx.work.CoroutineWorker$getForegroundInfoAsync$1", f = "CoroutineWorker.kt", l = {134}, m = "invokeSuspend")
public final class C805000Vhy extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C805010Vhz LL;
    public int LLILLJJLI;
    public final /* synthetic */ C805010Vhz<C788790Uwv> LLILLL;
    public final /* synthetic */ CoroutineWorker LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C805000Vhy(C805010Vhz<C788790Uwv> c805010Vhz, CoroutineWorker coroutineWorker, InterfaceC1364105Vn<? super C805000Vhy> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c805010Vhz;
        this.LLILZ = coroutineWorker;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C805000Vhy(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                C805010Vhz c805010Vhz = this.LL;
                C155000ia.LIZIZ(obj);
                c805010Vhz.LLILLJJLI.LJIIIZ((R) obj);
                return Unit.LIZ;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C155000ia.LIZIZ(obj);
        C805010Vhz<C788790Uwv> c805010Vhz2 = this.LLILLL;
        CoroutineWorker coroutineWorker = this.LLILZ;
        this.LL = c805010Vhz2;
        this.LLILLJJLI = 1;
        coroutineWorker.getClass();
        throw new IllegalStateException("Not implemented");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
