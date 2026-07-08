package X;

import Y.AObjectS241S0100000_8;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: renamed from: X.0LJm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.bytedance.als.FlowLiveStateKt$asFlow$1", f = "FlowLiveState.kt", l = {64, 67, 69}, m = "invokeSuspend")
public final class C540960LJm<T> extends C09AX implements Function2<C094D<? super T>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C385670FAf<T> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C540960LJm(C385670FAf<T> c385670FAf, InterfaceC1364105Vn<? super C540960LJm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c385670FAf;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C540960LJm c540960LJm = new C540960LJm(this.LLILLL, interfaceC1364105Vn);
        c540960LJm.LLILLJJLI = obj;
        return c540960LJm;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC1441305kZ aObjectS241S0100000_8;
        C1C7U.LIZ("FlowLiveStateKt@d878.asFlow$1");
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
                    aObjectS241S0100000_8 = (InterfaceC1441305kZ) this.LLILLJJLI;
                    C155000ia.LIZIZ(obj);
                    throw new C2197108jB();
                }
                aObjectS241S0100000_8 = (InterfaceC1441305kZ) this.LLILLJJLI;
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                aObjectS241S0100000_8 = new AObjectS241S0100000_8((C094D) this.LLILLJJLI, 1);
                C1DFH c1dfh = C0PEM.LIZ;
                AbstractC2238408pq abstractC2238408pqLLIILII = C2107308Nj.LIZ.LLIILII();
                C540940LJk c540940LJk = new C540940LJk(this.LLILLL, aObjectS241S0100000_8, null);
                this.LLILLJJLI = aObjectS241S0100000_8;
                this.LL = 1;
                if (C23250099c.LJI(this, abstractC2238408pqLLIILII, c540940LJk) == objLJFF) {
                    C1C7U.LIZIZ("FlowLiveStateKt@d878.asFlow$1");
                    return objLJFF;
                }
            }
            this.LLILLJJLI = aObjectS241S0100000_8;
            this.LL = 2;
            if (AnonymousClass0958.LIZ(this) == objLJFF) {
                C1C7U.LIZIZ("FlowLiveStateKt@d878.asFlow$1");
                return objLJFF;
            }
            throw new C2197108jB();
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C1DFH c1dfh2 = C0PEM.LIZ;
            CoroutineContext coroutineContextPlus = C2107308Nj.LIZ.LLIILII().plus(C09AM.LL);
            C540950LJl c540950LJl = new C540950LJl(this.LLILLL, aObjectS241S0100000_8, null);
            this.LLILLJJLI = th2;
            this.LL = 3;
            if (C23250099c.LJI(this, coroutineContextPlus, c540950LJl) == objLJFF) {
                C1C7U.LIZIZ("FlowLiveStateKt@d878.asFlow$1");
                return objLJFF;
            }
            throw th2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(obj, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
