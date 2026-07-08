package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Np5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.datacenter.TaskScheduler$submit$1$job$1", f = "TaskScheduler.kt", l = {119}, m = "invokeSuspend")
public final class C605570Np5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ InterfaceC346201Wa<Boolean> LLILLL;
    public final /* synthetic */ InterfaceC332260D0u<EnumC605580Np6> LLILZ;
    public final /* synthetic */ C605550Np3 LLILZIL;
    public final /* synthetic */ AbstractC605390Non LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C605570Np5(InterfaceC346201Wa<Boolean> interfaceC346201Wa, InterfaceC332260D0u<EnumC605580Np6> interfaceC332260D0u, C605550Np3 c605550Np3, AbstractC605390Non abstractC605390Non, InterfaceC1364105Vn<? super C605570Np5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = interfaceC346201Wa;
        this.LLILZ = interfaceC332260D0u;
        this.LLILZIL = c605550Np3;
        this.LLILZLL = abstractC605390Non;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C605570Np5 c605570Np5 = new C605570Np5(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c605570Np5.LLILLJJLI = obj;
        return c605570Np5;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C09AE c09aeLIZLLL;
        C1C7U.LIZ("TaskScheduler@5940.submit$1$job$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i == 1) {
                    c09aeLIZLLL = (C09AE) this.LLILLJJLI;
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
                InterfaceC346201Wa<Boolean> interfaceC346201Wa = this.LLILLL;
                if (interfaceC346201Wa != null) {
                    c09aeLIZLLL = C23250099c.LIZLLL(interfaceC497601wk, null, null, new C605560Np4(interfaceC346201Wa, this.LLILZIL, this.LLILZLL, null), 3);
                } else {
                    c09aeLIZLLL = null;
                }
                try {
                    this.LLILZ.setValue(EnumC605580Np6.WAITING_ACTIVATION);
                    C605550Np3 c605550Np3 = this.LLILZIL;
                    AbstractC605390Non abstractC605390Non = this.LLILZLL;
                    String str = abstractC605390Non.LIZ;
                    this.LLILLJJLI = c09aeLIZLLL;
                    this.LL = 1;
                    if (c605550Np3.LIZJ(str, abstractC605390Non, this) == objLJFF) {
                        C1C7U.LIZIZ("TaskScheduler@5940.submit$1$job$1");
                        return objLJFF;
                    }
                } catch (Throwable th) {
                    th = th;
                    TryCatchGuardChecker.doCheck(th);
                    if (c09aeLIZLLL != null) {
                        c09aeLIZLLL.LIZIZ(null);
                    }
                    throw th;
                }
            }
            if (c09aeLIZLLL != null) {
                c09aeLIZLLL.LIZIZ(null);
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("TaskScheduler@5940.submit$1$job$1");
            return unit;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
