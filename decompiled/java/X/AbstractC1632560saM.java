package X;

import Y.AfS194S0100000_25;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: renamed from: X.0saM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public abstract class AbstractC1632560saM<KEY, RESULT, INFO> implements InterfaceC1632590saP<KEY, RESULT, INFO> {
    public static final /* synthetic */ int LJIIJ = 0;
    public final int LIZ;
    public final int LJFF;
    public final C11PR<C1632580saO<KEY, RESULT>> LIZIZ = (C11PR<C1632580saO<KEY, RESULT>>) new C11RK().LJLLLL();
    public final ConcurrentHashMap<String, RunnableC1632570saN<KEY, RESULT>> LIZJ = new ConcurrentHashMap<>();
    public final AtomicInteger LIZLLL = new AtomicInteger(0);
    public final C01GW LJ = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(557));
    public final C01GW LJI = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(556));
    public final C01GW LJII = C452501pT.LIZIZ(new AwS569S0100000_25(this, 1085));
    public final C01GW LJIIIIZZ = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(558));
    public final Set<EnumC1641380soa> LJIIIZ = C13LQ.LJLIIL(new EnumC1641380soa[]{EnumC1641380soa.SUCCESS, EnumC1641380soa.FAILED});

    public abstract void LJFF(Object obj, C1632710sab c1632710sab);

    public abstract Void LJI();

    public abstract String LJII(KEY key);

    @Override // X.InterfaceC1632590saP
    public final C19475711Hn LJ() {
        C11PR<C1632580saO<KEY, RESULT>> c11pr = this.LIZIZ;
        c11pr.getClass();
        return new C19475711Hn(c11pr);
    }

    public AbstractC1632560saM(int i) {
        this.LIZ = i;
        this.LJFF = Math.min((Runtime.getRuntime().availableProcessors() * 2) + 1, i);
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [T, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.util.List] */
    @Override // X.InterfaceC1632590saP
    public void LIZJ(boolean z) {
        C259800zU c259800zU = new C259800zU();
        synchronized (this.LIZJ) {
            try {
                if (z) {
                    Collection<RunnableC1632570saN<KEY, RESULT>> collectionValues = this.LIZJ.values();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : collectionValues) {
                        if (!((RunnableC1632570saN) obj).LLILZ) {
                            arrayList.add(obj);
                        }
                    }
                    ?? LLIIII = C13LP.LLIIII(arrayList);
                    c259800zU.element = LLIIII;
                    Iterator it2 = LLIIII.iterator();
                    while (it2.hasNext()) {
                        this.LIZJ.remove(LJII(((RunnableC1632570saN) it2.next()).LL));
                    }
                } else {
                    c259800zU.element = C13LP.LLIIII(this.LIZJ.values());
                    this.LIZJ.clear();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        for (RunnableC1632570saN runnableC1632570saN : (Iterable) c259800zU.element) {
            runnableC1632570saN.LLILZIL.onNext(new C1632580saO<>(EnumC1641380soa.FAILED, runnableC1632570saN.LL, null, null));
            runnableC1632570saN.LLILZIL.onComplete();
            Future<?> future = runnableC1632570saN.LLILZLL;
            if (future != null) {
                future.cancel(true);
            }
        }
    }

    @Override // X.InterfaceC1632590saP
    public final Pair<EnumC1641380soa, Boolean> LIZLLL(KEY key) {
        RunnableC1632570saN<KEY, RESULT> runnableC1632570saN = this.LIZJ.get(LJII(key));
        EnumC1641380soa enumC1641380soa = null;
        if (runnableC1632570saN == null) {
            return null;
        }
        C1632580saO<KEY, RESULT> c1632580saOLJLZ = runnableC1632570saN.LLILZIL.LJLZ();
        if (c1632580saOLJLZ != null) {
            enumC1641380soa = c1632580saOLJLZ.LIZ;
        }
        return new Pair<>(enumC1641380soa, Boolean.valueOf(runnableC1632570saN.LLILZ));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [X.0sac] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // X.InterfaceC1632590saP
    public final C11PQ LIZIZ(Object obj, boolean z) {
        boolean z2;
        T t;
        C1632580saO<KEY, RESULT> c1632580saO;
        boolean zLJI = MethodIDManager.LJI(137849);
        C259800zU c259800zU = new C259800zU();
        synchronized (this.LIZJ) {
            try {
                ConcurrentHashMap<String, RunnableC1632570saN<KEY, RESULT>> concurrentHashMap = this.LIZJ;
                String strLJII = LJII(obj);
                RunnableC1632570saN<KEY, RESULT> runnableC1632570saN = concurrentHashMap.get(strLJII);
                if (runnableC1632570saN == false) {
                    final C11PQ c11pq = new C11PQ();
                    final C1632610saR c1632610saR = (C1632610saR) this.LJ.getValue();
                    RunnableC1632570saN<KEY, RESULT> runnableC1632570saN2 = new RunnableC1632570saN<>(obj, this.LIZLLL.getAndIncrement(), new InterfaceC500500Jk0() { // from class: X.0sac
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // X.InterfaceC500500Jk0
                        public final Object apply(final Object obj2, Object obj3) throws Exception {
                            InterfaceC1632630saT<Object, Object> interfaceC1632630saT;
                            ExecutorService executorService;
                            InterfaceC1632630saT<Object, Object> interfaceC1632630saT2;
                            C199494133s c199494133s = new C199494133s();
                            try {
                                this.LIZ.LJFF(obj2, new C1632710sab(c199494133s, c11pq, (Function1) obj3));
                                if (!C1632670saX.LIZ()) {
                                    C1632730sad c1632730sad = (C1632730sad) c199494133s.get();
                                    Object obj4 = c1632730sad.LIZ;
                                    RESULT result = c1632730sad.LIZIZ;
                                    boolean z3 = c1632730sad.LIZJ;
                                    Object obj5 = c1632730sad.LIZLLL;
                                    Long l = c1632730sad.LJ;
                                    final Exception exc = c1632730sad.LJFF;
                                    if (result == 0) {
                                        InterfaceC1632630saT<Object, Object> interfaceC1632630saT3 = c1632610saR;
                                        if (interfaceC1632630saT3 != null) {
                                            interfaceC1632630saT3.LIZJ(obj4, l, exc, obj5);
                                        }
                                        throw new Exception(exc) { // from class: X.0saf
                                        };
                                    }
                                    if (!z3 && (interfaceC1632630saT2 = c1632610saR) != null) {
                                        interfaceC1632630saT2.LIZ(l, obj4, obj5);
                                    }
                                    return result;
                                }
                                final InterfaceC1632630saT<Object, Object> interfaceC1632630saT4 = c1632610saR;
                                C11U6<C1632730sad<Object, Object, Object>> c11u6 = new C11U6<C1632730sad<Object, Object, Object>>() { // from class: X.0sae
                                    @Override // X.C11U6
                                    public final void onFailure(Throwable th) {
                                        InterfaceC1632630saT<Object, Object> interfaceC1632630saT5;
                                        if ((th instanceof Exception) && (interfaceC1632630saT5 = interfaceC1632630saT4) != null) {
                                            interfaceC1632630saT5.LIZJ(obj2, 0L, (Exception) th, null);
                                        }
                                    }

                                    @Override // X.C11U6
                                    public final void onSuccess(C1632730sad<Object, Object, Object> c1632730sad2) {
                                        InterfaceC1632630saT<Object, Object> interfaceC1632630saT5;
                                        C1632730sad<Object, Object, Object> c1632730sad3 = c1632730sad2;
                                        String.valueOf(c1632730sad3);
                                        if (c1632730sad3 != null) {
                                            if (c1632730sad3.LIZIZ == null) {
                                                InterfaceC1632630saT<Object, Object> interfaceC1632630saT6 = interfaceC1632630saT4;
                                                if (interfaceC1632630saT6 != null) {
                                                    interfaceC1632630saT6.LIZJ(c1632730sad3.LIZ, c1632730sad3.LJ, c1632730sad3.LJFF, c1632730sad3.LIZLLL);
                                                    return;
                                                }
                                                return;
                                            }
                                            if (c1632730sad3.LIZJ || (interfaceC1632630saT5 = interfaceC1632630saT4) == null) {
                                                return;
                                            }
                                            interfaceC1632630saT5.LIZ(c1632730sad3.LJ, c1632730sad3.LIZ, c1632730sad3.LIZLLL);
                                        }
                                    }
                                };
                                if (C2281551ESb.LIZIZ.LJIIIIZZ()) {
                                    executorService = (ExecutorService) this.LIZ.LJI.getValue();
                                } else {
                                    executorService = (ExecutorService) this.LIZ.LJII.getValue();
                                }
                                c199494133s.LJIIJJI(new C135Q(c199494133s, c11u6), executorService);
                                this.LIZ.LJI();
                                throw new C2197108jB();
                            } catch (InterruptedException e) {
                                TryCatchGuardChecker.doCheck(e);
                                throw e;
                            } catch (Exception e2) {
                                TryCatchGuardChecker.doCheck(e2);
                                if (!(e2 instanceof C1632750saf) && !(e2 instanceof InterruptedException) && (interfaceC1632630saT = c1632610saR) != null) {
                                    interfaceC1632630saT.LIZJ(obj2, 0L, e2, null);
                                }
                                throw e2;
                            }
                        }
                    }, z, c11pq);
                    RunnableC1632570saN<KEY, RESULT> runnableC1632570saNPutIfAbsent = concurrentHashMap.putIfAbsent(strLJII, runnableC1632570saN2);
                    RunnableC1632570saN<KEY, RESULT> runnableC1632570saN3 = runnableC1632570saN2;
                    if (runnableC1632570saNPutIfAbsent != null) {
                        runnableC1632570saN3 = runnableC1632570saNPutIfAbsent;
                    }
                    z2 = true;
                    t = runnableC1632570saN3;
                } else {
                    z2 = false;
                    t = runnableC1632570saN;
                }
                c259800zU.element = t;
                ((RunnableC1632570saN) t).LLILZ = z;
                c1632580saO = null;
                if ((z2 || ((RunnableC1632570saN) c259800zU.element).LLILZIL.LJLZ() == null) && z) {
                    ((RunnableC1632570saN) c259800zU.element).LLILZ = z;
                    c1632580saO = new C1632580saO<>(EnumC1641380soa.PENDING, obj, null, null);
                }
                ((C1632610saR) this.LJ.getValue()).LIZIZ(this.LIZJ.size(), this.LJFF, obj);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                if (zLJI) {
                    MethodIDManager.LJ();
                }
                throw th;
            }
        }
        if (c1632580saO != null) {
            ((RunnableC1632570saN) c259800zU.element).LLILZIL.onNext(c1632580saO);
        }
        if (z2) {
            RunnableC1632570saN runnableC1632570saN4 = (RunnableC1632570saN) c259800zU.element;
            runnableC1632570saN4.LLILZIL.LJJIL(new C1698300uIO(this, 5)).LJJJLZIJ(C11S5.LIZ()).LJJLL(new AfS194S0100000_25(this, 209), C09HN.LIZ);
            runnableC1632570saN4.LLILZLL = ((ExecutorService) this.LJII.getValue()).submit(runnableC1632570saN4);
        }
        C11PQ<C1632580saO<KEY, RESULT>> c11pq2 = ((RunnableC1632570saN) c259800zU.element).LLILZIL;
        if (zLJI) {
            MethodIDManager.LJ();
        }
        return c11pq2;
    }
}
