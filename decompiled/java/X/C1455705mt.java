package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.lazyload.LazyLoadManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05mt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.lazyload.LazyLoadManager$scheduleDelay$1", f = "LazyLoadManager.kt", l = {151}, m = "invokeSuspend")
public final class C1455705mt extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ LazyLoadManager LLILLL;
    public final /* synthetic */ C1456005mw LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1455705mt(long j, LazyLoadManager lazyLoadManager, C1456005mw c1456005mw, InterfaceC1364105Vn<? super C1455705mt> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = j;
        this.LLILLL = lazyLoadManager;
        this.LLILZ = c1456005mw;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1455705mt(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LazyLoadManager@8fc5.scheduleDelay$1");
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
            long j = this.LLILLJJLI * 1000;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("LazyLoadManager@8fc5.scheduleDelay$1");
                return objLJFF;
            }
        }
        C1326490kch.LIZ.getClass();
        C1326490kch.LIZ("scheduleDelay, triggering fetch");
        this.LLILLL.m182do(this.LLILZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LazyLoadManager@8fc5.scheduleDelay$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
