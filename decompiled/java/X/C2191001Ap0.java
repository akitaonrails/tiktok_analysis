package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS435S0200000_34;
import kotlin.jvm.internal.AwS578S0100000_34;
import njp.a;

/* JADX INFO: renamed from: X.1Ap0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.chunk.ChunkPreloadCacheManager$wrapChunkStream$8", f = "ChunkPreloadCacheManager.kt", l = {}, m = "invokeSuspend")
public final class C2191001Ap0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1515820pY4<Object> LL;
    public final /* synthetic */ C2190961Aow<Object> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2191001Ap0(C1515820pY4<Object> c1515820pY4, C2190961Aow<Object> c2190961Aow, InterfaceC1364105Vn<? super C2191001Ap0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1515820pY4;
        this.LLILLJJLI = c2190961Aow;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2191001Ap0(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ChunkPreloadCacheManager@55.wrapChunkStream$8");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        final C118300cf c118300cf = new C118300cf();
        try {
            C034X.LIZIZ();
            C1515820pY4<Object> c1515820pY4 = this.LL;
            final C2190961Aow<Object> c2190961Aow = this.LLILLJJLI;
            c1515820pY4.LIZLLL(new C0POE<Object>() { // from class: X.1Aoq
                @Override // X.C0POE
                public final void onComplete() {
                    C2190961Aow<Object> c2190961Aow2 = c2190961Aow;
                    synchronized (c2190961Aow2) {
                        try {
                            if (c2190961Aow2.LIZJ) {
                                return;
                            }
                            ((ArrayList) c2190961Aow2.LIZ).add(C2190951Aov.LIZ);
                            c2190961Aow2.LIZJ = true;
                            new AwS578S0100000_34(c2190961Aow2, (C2190961Aow<Object>) 195);
                            C034X.LIZIZ();
                            Iterator it2 = ((ArrayList) c2190961Aow2.LIZIZ).iterator();
                            while (it2.hasNext()) {
                                ((C0POE) it2.next()).onComplete();
                            }
                            ((ArrayList) c2190961Aow2.LIZIZ).clear();
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }

                @Override // X.C0POE
                public final void onFailed(Throwable th) {
                    C2190961Aow<Object> c2190961Aow2 = c2190961Aow;
                    synchronized (c2190961Aow2) {
                        try {
                            if (c2190961Aow2.LIZJ) {
                                return;
                            }
                            ((ArrayList) c2190961Aow2.LIZ).add(new C2190941Aou(th));
                            c2190961Aow2.LIZJ = true;
                            new AwS435S0200000_34(th, (Throwable) c2190961Aow2, (C2190961Aow<Object>) 25);
                            C034X.LIZIZ();
                            Iterator it2 = ((ArrayList) c2190961Aow2.LIZIZ).iterator();
                            while (it2.hasNext()) {
                                ((C0POE) it2.next()).onFailed(th);
                            }
                            ((ArrayList) c2190961Aow2.LIZIZ).clear();
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                            throw th2;
                        }
                    }
                }

                @Override // X.C0POE
                public final void onNext(Object obj2) {
                    C118300cf c118300cf2 = c118300cf;
                    int i = c118300cf2.element + 1;
                    c118300cf2.element = i;
                    if (i == 1) {
                        C034X.LIZIZ();
                    }
                    C2190961Aow<Object> c2190961Aow2 = c2190961Aow;
                    synchronized (c2190961Aow2) {
                        try {
                            if (c2190961Aow2.LIZJ) {
                                return;
                            }
                            ((ArrayList) c2190961Aow2.LIZ).add(new C2190931Aot(obj2));
                            Iterator it2 = ((ArrayList) c2190961Aow2.LIZIZ).iterator();
                            while (it2.hasNext()) {
                                ((C0POE) it2.next()).onNext(obj2);
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }
            });
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C2190961Aow<Object> c2190961Aow2 = this.LLILLJJLI;
            synchronized (c2190961Aow2) {
                try {
                    if (!c2190961Aow2.LIZJ) {
                        ((ArrayList) c2190961Aow2.LIZ).add(new C2190941Aou(th));
                        c2190961Aow2.LIZJ = true;
                        new AwS435S0200000_34(th, (Throwable) c2190961Aow2, (C2190961Aow<Object>) 26);
                        C034X.LIZIZ();
                        Iterator it2 = ((ArrayList) c2190961Aow2.LIZIZ).iterator();
                        while (it2.hasNext()) {
                            ((C0POE) it2.next()).onFailed(th);
                        }
                        ((ArrayList) c2190961Aow2.LIZIZ).clear();
                    }
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    throw th2;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ChunkPreloadCacheManager@55.wrapChunkStream$8");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
