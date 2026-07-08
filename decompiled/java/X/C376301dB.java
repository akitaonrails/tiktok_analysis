package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01dB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.iap.component.impl.PgcPaymentServiceImpl$fetchOrSingle$2", f = "PgcPaymentServiceImpl.kt", l = {230, 231}, m = "invokeSuspend")
public final class C376301dB extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<Object>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ Function1<InterfaceC1364105Vn<Object>, Object> LLILLL;
    public final /* synthetic */ C1616850sB1 LLILZ;
    public final /* synthetic */ C1616880sB4 LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C376301dB(Function1<? super InterfaceC1364105Vn<Object>, ? extends Object> function1, C1616850sB1 c1616850sB1, C1616880sB4 c1616880sB4, InterfaceC1364105Vn<? super C376301dB> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = function1;
        this.LLILZ = c1616850sB1;
        this.LLILZIL = c1616880sB4;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C376301dB c376301dB = new C376301dB(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c376301dB.LLILLJJLI = obj;
        return c376301dB;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        AnonymousClass0957 anonymousClass0957LIZIZ;
        Object obj2;
        C1C7U.LIZ("PgcPaymentServiceImpl@624d.fetchOrSingle$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    obj2 = this.LLILLJJLI;
                    C155000ia.LIZIZ(obj);
                    C1C7U.LIZIZ("PgcPaymentServiceImpl@624d.fetchOrSingle$2");
                    return obj2;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            anonymousClass0957LIZIZ = (AnonymousClass0957) this.LLILLJJLI;
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            C099G c099gLIZIZ = C23250099c.LIZIZ(interfaceC497601wk, null, null, new C376201dA(this.LLILLL, null), 3);
            anonymousClass0957LIZIZ = C23250099c.LIZIZ(interfaceC497601wk, null, null, new C376401dC(this.LLILZ, this.LLILZIL, null), 3);
            this.LLILLJJLI = anonymousClass0957LIZIZ;
            this.LL = 1;
            obj = c099gLIZIZ.LJLIIIL(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("PgcPaymentServiceImpl@624d.fetchOrSingle$2");
                return objLJFF;
            }
        }
        this.LLILLJJLI = obj;
        this.LL = 2;
        if (anonymousClass0957LIZIZ.LJLIIIL(this) == objLJFF) {
            C1C7U.LIZIZ("PgcPaymentServiceImpl@624d.fetchOrSingle$2");
            return objLJFF;
        }
        obj2 = obj;
        C1C7U.LIZIZ("PgcPaymentServiceImpl@624d.fetchOrSingle$2");
        return obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<Object> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
