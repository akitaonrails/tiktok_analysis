package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.13vx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "com.ss.android.ugc.aweme.task.SocialAsyncTaskScheduler$start$runTasks$job$1", f = "SocialAsyncTaskScheduler.kt", l = {173, 175, 200, 200, 200}, m = "invokeSuspend")
public final class C20169513vx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public long LL;
    public Object LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ C20169913w1<Object> LLILZ;
    public final /* synthetic */ Function1<C20168613vo, Unit> LLILZIL;
    public final /* synthetic */ C20170113w3<Object> LLILZLL;
    public final /* synthetic */ Object LLIZ;
    public final /* synthetic */ Function1<C20170413w6, Unit> LLIZLLLIL;
    public final /* synthetic */ InterfaceC383701eN LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C20169513vx(C20169913w1<Object> c20169913w1, Function1<? super C20168613vo, Unit> function1, C20170113w3<Object> c20170113w3, Object obj, Function1<? super C20170413w6, Unit> function12, InterfaceC383701eN interfaceC383701eN, InterfaceC1364105Vn<? super C20169513vx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = c20169913w1;
        this.LLILZIL = function1;
        this.LLILZLL = c20170113w3;
        this.LLIZ = obj;
        this.LLIZLLLIL = function12;
        this.LLJ = interfaceC383701eN;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C20169513vx(this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i;
        long j;
        C20170413w6 c20170413w6;
        long j2;
        Object objLJ = obj;
        C1C7U.LIZ("SocialAsyncTaskScheduler@5632.start$runTasks$job$1");
        Object objLJFF = C099R.LJFF();
        int i2 = this.LLILLL;
        int i3 = -1;
        try {
        } catch (Throwable th) {
            try {
                TryCatchGuardChecker.doCheck(th);
                ConcurrentHashMap<C20168613vo, EnumC20169713vz> concurrentHashMap = this.LLILZLL.LJI;
                C20168613vo c20168613voLIZIZ = this.LLILZ.LIZIZ();
                EnumC20169713vz enumC20169713vz = EnumC20169713vz.FAILED;
                concurrentHashMap.put(c20168613voLIZIZ, enumC20169713vz);
                this.LLILZLL.LJII.put(this.LLILZ.LIZIZ(), th);
                if (th instanceof C094W) {
                    i = 1001;
                } else {
                    i = 1002;
                }
                C20170413w6 c20170413w62 = new C20170413w6(this.LLILZ.LIZIZ(), enumC20169713vz, 0L, th, C2286608xc.LJ(i), false, false, 0, 228);
                c20170413w62.LIZJ = System.currentTimeMillis() - i2;
                EnumC20169713vz enumC20169713vz2 = this.LLILZLL.LJI.get(this.LLILZ.LIZIZ());
                if (enumC20169713vz2 != null) {
                    i3 = C20169613vy.LIZ[enumC20169713vz2.ordinal()];
                }
                if (i3 == 1) {
                    Function1<C20170413w6, Unit> function1 = this.LLIZLLLIL;
                    InterfaceC383701eN interfaceC383701eN = this.LLJ;
                    C20170113w3<Object> c20170113w3 = this.LLILZLL;
                    this.LLILLL = 4;
                    if (C20170113w3.LJFF(function1, interfaceC383701eN, c20170113w3, c20170413w62, this) == objLJFF) {
                        C1C7U.LIZIZ("SocialAsyncTaskScheduler@5632.start$runTasks$job$1");
                        return objLJFF;
                    }
                } else {
                    C20170113w3.LJ(this.LLILZLL, this.LLIZLLLIL, c20170413w62);
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                System.currentTimeMillis();
                EnumC20169713vz enumC20169713vz3 = this.LLILZLL.LJI.get(this.LLILZ.LIZIZ());
                if (enumC20169713vz3 != null) {
                    i3 = C20169613vy.LIZ[enumC20169713vz3.ordinal()];
                }
                if (i3 == 1) {
                    Function1<C20170413w6, Unit> function12 = this.LLIZLLLIL;
                    InterfaceC383701eN interfaceC383701eN2 = this.LLJ;
                    C20170113w3<Object> c20170113w32 = this.LLILZLL;
                    C20170413w6 c20170413w63 = new C20170413w6(this.LLILZ.LIZIZ(), EnumC20169713vz.SUCCESS, 0L, null, null, false, false, 0, 252);
                    this.LLILLJJLI = th2;
                    this.LLILLL = 5;
                    if (C20170113w3.LJFF(function12, interfaceC383701eN2, c20170113w32, c20170413w63, this) == objLJFF) {
                        C1C7U.LIZIZ("SocialAsyncTaskScheduler@5632.start$runTasks$job$1");
                        return objLJFF;
                    }
                } else {
                    C20170113w3.LJ(this.LLILZLL, this.LLIZLLLIL, new C20170413w6(this.LLILZ.LIZIZ(), EnumC20169713vz.FAILED, 0L, null, null, false, false, 0, 252));
                }
                throw th2;
            }
        }
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3 && i2 != 4) {
                        if (i2 != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Throwable th3 = (Throwable) this.LLILLJJLI;
                        C155000ia.LIZIZ(objLJ);
                        throw th3;
                    }
                    C155000ia.LIZIZ(objLJ);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("SocialAsyncTaskScheduler@5632.start$runTasks$job$1");
                    return unit;
                }
                long j3 = this.LL;
                C155000ia.LIZIZ(objLJ);
                j2 = j3;
                c20170413w6 = (C20170413w6) objLJ;
                i2 = j2;
            } else {
                long j4 = this.LL;
                C155000ia.LIZIZ(objLJ);
                j = j4;
                c20170413w6 = (C20170413w6) objLJ;
                i2 = j;
            }
        } else {
            C155000ia.LIZIZ(objLJ);
            Function1<C20168613vo, Unit> function13 = this.LLILZIL;
            if (function13 != null) {
                function13.invoke(this.LLILZ.LIZIZ());
            }
            this.LLILZLL.LJI.put(this.LLILZ.LIZIZ(), EnumC20169713vz.RUNNING);
            C20169813w0<Object> c20169813w0 = new C20169813w0<>(this.LLIZ, this.LLILZLL.LIZ);
            long jCurrentTimeMillis = System.currentTimeMillis();
            Long lLIZLLL = this.LLILZ.LIZLLL();
            if (lLIZLLL != null && lLIZLLL.longValue() > 0) {
                long jLongValue = lLIZLLL.longValue();
                C20169413vw c20169413vw = new C20169413vw(this.LLILZ, c20169813w0, null);
                this.LL = jCurrentTimeMillis;
                this.LLILLL = 1;
                objLJ = C099A.LIZIZ(jLongValue, c20169413vw, this);
                j = jCurrentTimeMillis;
                if (objLJ == objLJFF) {
                    C1C7U.LIZIZ("SocialAsyncTaskScheduler@5632.start$runTasks$job$1");
                    return objLJFF;
                }
                c20170413w6 = (C20170413w6) objLJ;
                i2 = j;
            } else {
                C20169913w1<Object> c20169913w1 = this.LLILZ;
                this.LL = jCurrentTimeMillis;
                this.LLILLL = 2;
                objLJ = c20169913w1.LJ(c20169813w0, this);
                j2 = jCurrentTimeMillis;
                if (objLJ == objLJFF) {
                    C1C7U.LIZIZ("SocialAsyncTaskScheduler@5632.start$runTasks$job$1");
                    return objLJFF;
                }
                c20170413w6 = (C20170413w6) objLJ;
                i2 = j2;
            }
        }
        this.LLILZLL.LJI.put(this.LLILZ.LIZIZ(), c20170413w6.LIZIZ);
        c20170413w6.LIZJ = System.currentTimeMillis() - i2;
        EnumC20169713vz enumC20169713vz4 = this.LLILZLL.LJI.get(this.LLILZ.LIZIZ());
        if (enumC20169713vz4 != null) {
            i3 = C20169613vy.LIZ[enumC20169713vz4.ordinal()];
        }
        if (i3 == 1) {
            Function1<C20170413w6, Unit> function14 = this.LLIZLLLIL;
            InterfaceC383701eN interfaceC383701eN3 = this.LLJ;
            C20170113w3<Object> c20170113w33 = this.LLILZLL;
            this.LLILLL = 3;
            if (C20170113w3.LJFF(function14, interfaceC383701eN3, c20170113w33, c20170413w6, this) == objLJFF) {
                C1C7U.LIZIZ("SocialAsyncTaskScheduler@5632.start$runTasks$job$1");
                return objLJFF;
            }
        } else {
            C20170113w3.LJ(this.LLILZLL, this.LLIZLLLIL, c20170413w6);
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("SocialAsyncTaskScheduler@5632.start$runTasks$job$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
