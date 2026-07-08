package X;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0930, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1", f = "Combine.kt", l = {31}, m = "invokeSuspend")
public final class AnonymousClass0930 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC346201Wa<Object>[] LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ AtomicInteger LLILZ;
    public final /* synthetic */ C095E<IndexedValue<Object>> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass0930(InterfaceC346201Wa<Object>[] interfaceC346201WaArr, int i, AtomicInteger atomicInteger, C095E<IndexedValue<Object>> c095e, InterfaceC1364105Vn<? super AnonymousClass0930> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC346201WaArr;
        this.LLILLL = i;
        this.LLILZ = atomicInteger;
        this.LLILZIL = c095e;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new AnonymousClass0930(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        AtomicInteger atomicInteger;
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i == 1) {
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                InterfaceC346201Wa<Object>[] interfaceC346201WaArr = this.LLILLJJLI;
                int i2 = this.LLILLL;
                InterfaceC346201Wa<Object> interfaceC346201Wa = interfaceC346201WaArr[i2];
                AnonymousClass0932 anonymousClass0932 = new AnonymousClass0932(this.LLILZIL, i2);
                this.LL = 1;
                if (interfaceC346201Wa.collect(anonymousClass0932, this) == objLJFF) {
                    return objLJFF;
                }
            }
            if (atomicInteger.decrementAndGet() == 0) {
                this.LLILZIL.LJIIJJI(null);
            }
            return Unit.LIZ;
        } finally {
            if (this.LLILZ.decrementAndGet() == 0) {
                this.LLILZIL.LJIIJJI(null);
            }
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
