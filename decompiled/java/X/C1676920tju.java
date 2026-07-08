package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS24S0100001_25;
import njp.a;

/* JADX INFO: renamed from: X.0tju, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "androidx.compose.animation.core.Transition$animateTo$1$1$1", f = "Transition.kt", l = {1192}, m = "invokeSuspend")
public final class C1676920tju extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public float LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C1676910tjt<Object> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1676920tju(C1676910tjt<Object> c1676910tjt, InterfaceC1364105Vn<? super C1676920tju> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = c1676910tjt;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1676920tju c1676920tju = new C1676920tju(this.LLILZ, interfaceC1364105Vn);
        c1676920tju.LLILLL = obj;
        return c1676920tju;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC497601wk interfaceC497601wk;
        float fLJII;
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                fLJII = this.LL;
                interfaceC497601wk = (InterfaceC497601wk) this.LLILLL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            interfaceC497601wk = (InterfaceC497601wk) this.LLILLL;
            fLJII = C1677810tlL.LJII(interfaceC497601wk.getCoroutineContext());
        }
        while (C2296808zG.LJI(interfaceC497601wk)) {
            AwS24S0100001_25 awS24S0100001_25 = new AwS24S0100001_25(this.LLILZ, (C1676910tjt<Object>) fLJII, 3);
            this.LLILLL = interfaceC497601wk;
            this.LL = fLJII;
            this.LLILLJJLI = 1;
            if (C1838620xwi.LIZIZ(this, awS24S0100001_25) == objLJFF) {
                return objLJFF;
            }
        }
        return Unit.LIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
