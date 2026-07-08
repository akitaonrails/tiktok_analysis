package X;

import Y.AObjectS239S0100000_3;
import com.bytedance.als.LiveEvent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09Gf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.bytedance.als.FlowLiveEventKt$asFlow$1", f = "FlowLiveEvent.kt", l = {49, 52, 54}, m = "invokeSuspend")
public final class C2343509Gf extends C09AX implements Function2<C094D<Object>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ LiveEvent<Object> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2343509Gf(LiveEvent<Object> liveEvent, InterfaceC1364105Vn<? super C2343509Gf> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = liveEvent;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C2343509Gf c2343509Gf = new C2343509Gf(this.LLILLL, interfaceC1364105Vn);
        c2343509Gf.LLILLJJLI = obj;
        return c2343509Gf;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC1441305kZ aObjectS239S0100000_3;
        C1C7U.LIZ("FlowLiveEventKt@69a7.asFlow$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Throwable th = (Throwable) this.LLILLJJLI;
                        C155000ia.LIZIZ(obj);
                        throw th;
                    }
                    aObjectS239S0100000_3 = (InterfaceC1441305kZ) this.LLILLJJLI;
                    C155000ia.LIZIZ(obj);
                    throw new C2197108jB();
                }
                aObjectS239S0100000_3 = (InterfaceC1441305kZ) this.LLILLJJLI;
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                aObjectS239S0100000_3 = new AObjectS239S0100000_3((C094D) this.LLILLJJLI, 0);
                C1DFH c1dfh = C0PEM.LIZ;
                AbstractC2238408pq abstractC2238408pqLLIILII = C2107308Nj.LIZ.LLIILII();
                C2343609Gg c2343609Gg = new C2343609Gg(this.LLILLL, aObjectS239S0100000_3, null);
                this.LLILLJJLI = aObjectS239S0100000_3;
                this.LL = 1;
                if (C23250099c.LJI(this, abstractC2238408pqLLIILII, c2343609Gg) == objLJFF) {
                    C1C7U.LIZIZ("FlowLiveEventKt@69a7.asFlow$1");
                    return objLJFF;
                }
            }
            this.LLILLJJLI = aObjectS239S0100000_3;
            this.LL = 2;
            if (AnonymousClass0958.LIZ(this) == objLJFF) {
                C1C7U.LIZIZ("FlowLiveEventKt@69a7.asFlow$1");
                return objLJFF;
            }
            throw new C2197108jB();
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C1DFH c1dfh2 = C0PEM.LIZ;
            CoroutineContext coroutineContextPlus = C2107308Nj.LIZ.LLIILII().plus(C09AM.LL);
            C2343709Gh c2343709Gh = new C2343709Gh(this.LLILLL, aObjectS239S0100000_3, null);
            this.LLILLJJLI = th2;
            this.LL = 3;
            if (C23250099c.LJI(this, coroutineContextPlus, c2343709Gh) == objLJFF) {
                C1C7U.LIZIZ("FlowLiveEventKt@69a7.asFlow$1");
                return objLJFF;
            }
            throw th2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C094D<Object> c094d, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c094d, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
