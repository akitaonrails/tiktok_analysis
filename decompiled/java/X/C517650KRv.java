package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0KRv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.api.subscription.payment.v2.resubscribe.AbsResubscribeStrategy$resubscribe$1$recoverContract$1", f = "AbsResubscribeStrategy.kt", l = {23}, m = "invokeSuspend")
public final class C517650KRv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C470590Icr<Object>>, Object> {
    public int LL;
    public final /* synthetic */ C0KS6<Object, Object, C517680KRy> LLILLJJLI;
    public final /* synthetic */ C517680KRy LLILLL;
    public final /* synthetic */ Object LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C517650KRv(C0KS6<Object, Object, C517680KRy> c0ks6, C517680KRy c517680KRy, Object obj, InterfaceC1364105Vn<? super C517650KRv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0ks6;
        this.LLILLL = c517680KRy;
        this.LLILZ = obj;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C517650KRv(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AbsResubscribeStrategy@164.resubscribe$1$recoverContract$1");
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
            C0KS6<Object, Object, C517680KRy> c0ks6 = this.LLILLJJLI;
            C517680KRy c517680KRy = this.LLILLL;
            Object obj2 = this.LLILZ;
            this.LL = 1;
            C0KS3 c0ks3 = (C0KS3) c0ks6;
            c0ks3.getClass();
            obj = c0ks3.LIZIZ((C517690KRz) c517680KRy, (C0KSW) obj2, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("AbsResubscribeStrategy@164.resubscribe$1$recoverContract$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("AbsResubscribeStrategy@164.resubscribe$1$recoverContract$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C470590Icr<Object>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
