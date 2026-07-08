package X;

import Y.AgS289S0100000_8;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0L1V, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.editcut.TemplateMediaChosenHandler$resolveMedia$2$applyProgressCollectJob$1", f = "TemplateMediaChosenHandler.kt", l = {253}, m = "invokeSuspend")
public final class C0L1V extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C532520KuY LLILLJJLI;
    public final /* synthetic */ C536210L1f LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0L1V(C532520KuY c532520KuY, C536210L1f c536210L1f, InterfaceC1364105Vn<? super C0L1V> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c532520KuY;
        this.LLILLL = c536210L1f;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0L1V(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TemplateMediaChosenHandler@d239.resolveMedia$2$applyProgressCollectJob$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            AnonymousClass0951 anonymousClass0951 = this.LLILLJJLI.LIZIZ;
            AgS289S0100000_8 agS289S0100000_8 = new AgS289S0100000_8(this.LLILLL, 20);
            this.LL = 1;
            if (anonymousClass0951.collect(agS289S0100000_8, this) == objLJFF) {
                C1C7U.LIZIZ("TemplateMediaChosenHandler@d239.resolveMedia$2$applyProgressCollectJob$1");
                return objLJFF;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
