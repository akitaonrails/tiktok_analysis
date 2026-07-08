package X;

import Y.AgS172S0300000_25;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS569S0100000_25;
import njp.a;

/* JADX INFO: renamed from: X.0tjf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1", f = "AnimatedVisibility.kt", l = {739}, m = "invokeSuspend")
public final class C1676770tjf extends C09AX implements Function2<InterfaceC345960DhK<Boolean>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1676910tjt<EnumC1676720tja> LLILLL;
    public final /* synthetic */ C05P1<Function2<EnumC1676720tja, EnumC1676720tja, Boolean>> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1676770tjf(C1676910tjt<EnumC1676720tja> c1676910tjt, C05P1<? extends Function2<? super EnumC1676720tja, ? super EnumC1676720tja, Boolean>> c05p1, InterfaceC1364105Vn<? super C1676770tjf> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1676910tjt;
        this.LLILZ = c05p1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1676770tjf c1676770tjf = new C1676770tjf(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c1676770tjf.LLILLJJLI = obj;
        return c1676770tjf;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
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
            InterfaceC345960DhK interfaceC345960DhK = (InterfaceC345960DhK) this.LLILLJJLI;
            C095D c095dLJIIIZ = C20028913Yh.LJIIIZ(new AwS569S0100000_25(this.LLILLL, (C1676910tjt<EnumC1676720tja>) 780));
            AgS172S0300000_25 agS172S0300000_25 = new AgS172S0300000_25(interfaceC345960DhK, this.LLILLL, this.LLILZ, 2);
            this.LL = 1;
            if (c095dLJIIIZ.collect(agS172S0300000_25, this) == objLJFF) {
                return objLJFF;
            }
        }
        return Unit.LIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC345960DhK<Boolean> interfaceC345960DhK, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC345960DhK, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
