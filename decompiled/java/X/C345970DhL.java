package X;

import Y.AgS285S0100000_4;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0DhL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1", f = "SnapshotFlow.kt", l = {67, 68}, m = "invokeSuspend")
public final class C345970DhL extends C09AX implements Function2<InterfaceC345960DhK<Object>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ CoroutineContext LLILLL;
    public final /* synthetic */ InterfaceC346201Wa<Object> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C345970DhL(CoroutineContext coroutineContext, InterfaceC346201Wa<Object> interfaceC346201Wa, InterfaceC1364105Vn<? super C345970DhL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = coroutineContext;
        this.LLILZ = interfaceC346201Wa;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C345970DhL c345970DhL = new C345970DhL(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c345970DhL.LLILLJJLI = obj;
        return c345970DhL;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC345960DhK interfaceC345960DhK = (InterfaceC345960DhK) this.LLILLJJLI;
            if (Intrinsics.LJFF(this.LLILLL, C23271099x.INSTANCE)) {
                InterfaceC346201Wa<Object> interfaceC346201Wa = this.LLILZ;
                AgS285S0100000_4 agS285S0100000_4 = new AgS285S0100000_4(interfaceC345960DhK, 1);
                this.LL = 1;
                if (interfaceC346201Wa.collect(agS285S0100000_4, this) == objLJFF) {
                    return objLJFF;
                }
            } else {
                CoroutineContext coroutineContext = this.LLILLL;
                C345980DhM c345980DhM = new C345980DhM(this.LLILZ, interfaceC345960DhK, null);
                this.LL = 2;
                if (C23250099c.LJI(this, coroutineContext, c345980DhM) == objLJFF) {
                    return objLJFF;
                }
            }
        }
        return Unit.LIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC345960DhK<Object> interfaceC345960DhK, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC345960DhK, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
