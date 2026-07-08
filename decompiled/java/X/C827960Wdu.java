package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Wdu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.bytedance.amg.minigameruntime.common.platform_misc.FilePlatformMiscMultithread$runAsyncCall$1", f = "FilePlatformMiscMultithread.kt", l = {337}, m = "invokeSuspend")
public final class C827960Wdu extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C2221081BwQ LL;
    public int LLILLJJLI;
    public final /* synthetic */ C2221081BwQ LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C827960Wdu(C2221081BwQ c2221081BwQ, Function0<Unit> function0, InterfaceC1364105Vn<? super C827960Wdu> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c2221081BwQ;
        this.LLILZ = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C827960Wdu(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C2221081BwQ c2221081BwQ;
        C1C7U.LIZ("FilePlatformMiscMultithread@6f22.runAsyncCall$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        try {
            try {
                if (i != 0) {
                    if (i == 1) {
                        c2221081BwQ = this.LL;
                        try {
                            C155000ia.LIZIZ(obj);
                        } catch (Throwable th) {
                            th = th;
                            TryCatchGuardChecker.doCheck(th);
                            c2221081BwQ.LJIIL.lock();
                            try {
                                if (c2221081BwQ.LJIIJJI.decrementAndGet() == 0) {
                                    c2221081BwQ.LJIILIIL.signalAll();
                                }
                                c2221081BwQ.LJIIL.unlock();
                                throw th;
                            } finally {
                            }
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    C155000ia.LIZIZ(obj);
                    c2221081BwQ = this.LLILLL;
                    Function0<Unit> function0 = this.LLILZ;
                    if (!c2221081BwQ.LJIIJ.get()) {
                        c2221081BwQ.LJIIJJI.incrementAndGet();
                        if (!c2221081BwQ.LJIIJ.get()) {
                            C1DFB c1dfb = C0PEM.LIZJ;
                            C445201oI c445201oI = new C445201oI(function0, null);
                            this.LL = c2221081BwQ;
                            this.LLILLJJLI = 1;
                            if (C23250099c.LJI(this, c1dfb, c445201oI) == objLJFF) {
                                C1C7U.LIZIZ("FilePlatformMiscMultithread@6f22.runAsyncCall$1");
                                return objLJFF;
                            }
                        } else {
                            throw new IllegalStateException("FileService closed");
                        }
                    } else {
                        throw new IllegalStateException("FileService closed");
                    }
                }
                c2221081BwQ.LJIIL.lock();
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
            }
            try {
                if (c2221081BwQ.LJIIJJI.decrementAndGet() == 0) {
                    c2221081BwQ.LJIILIIL.signalAll();
                }
                c2221081BwQ.LJIIL.unlock();
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("FilePlatformMiscMultithread@6f22.runAsyncCall$1");
                return unit;
            } finally {
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
