package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0qRu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1550440qRu extends C09AY implements Function2<Object, C1550500qS0<Object>, C1550500qS0<Object>> {
    public final /* synthetic */ C1550480qRy<Object, Object> LL;
    public final /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ Function1<Object, Unit> LLILLL;
    public final /* synthetic */ C259800zU<Runnable> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1550440qRu(C1550480qRy<Object, Object> c1550480qRy, Object obj, Function1<Object, Unit> function1, C259800zU<Runnable> c259800zU) {
        super(2);
        this.LL = c1550480qRy;
        this.LLILLJJLI = obj;
        this.LLILLL = function1;
        this.LLILZ = c259800zU;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v2, types: [X.0qS0<java.lang.Object>, java.lang.Object] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // kotlin.jvm.functions.Function2
    public final C1550500qS0<Object> invoke(Object obj, C1550500qS0<Object> c1550500qS0) {
        C1550500qS0<Object> c1550500qS02 = c1550500qS0;
        if (c1550500qS02 == null) {
            final C1550480qRy<Object, Object> c1550480qRy = this.LL;
            final Object obj2 = this.LLILLJJLI;
            Function1<Object, Unit> function1 = this.LLILLL;
            c1550480qRy.getClass();
            final C1550500qS0 c1550500qS03 = new C1550500qS0(0);
            c1550500qS03.LIZJ.add((Function1<R, Unit>) function1);
            Pair pair = new Pair(new Runnable() { // from class: X.0qRw
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("Deduplicate@5cf3.newSession$task$1");
                    try {
                        C1550480qRy<Object, Object> c1550480qRy2 = c1550480qRy;
                        Function2<Object, Function1<? super Object, Unit>, Unit> function2 = c1550480qRy2.LIZ;
                        Object obj3 = obj2;
                        function2.invoke(obj3, new C1550470qRx(c1550480qRy2, obj3, c1550500qS03));
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("Deduplicate@5cf3.newSession$task$1");
                }
            }, c1550500qS03);
            ?? first = pair.getFirst();
            ?? second = pair.getSecond();
            this.LLILZ.element = first;
            return second;
        }
        Object obj3 = c1550500qS02.LIZIZ;
        if (obj3 == null) {
            if (c1550500qS02.LIZ) {
                final C1550480qRy<Object, Object> c1550480qRy2 = this.LL;
                final Object obj4 = this.LLILLJJLI;
                Function1<Object, Unit> function12 = this.LLILLL;
                c1550480qRy2.getClass();
                final C1550500qS0 c1550500qS04 = new C1550500qS0(0);
                c1550500qS04.LIZJ.add((Function1<R, Unit>) function12);
                Pair pair2 = new Pair(new Runnable() { // from class: X.0qRw
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("Deduplicate@5cf3.newSession$task$1");
                        try {
                            C1550480qRy<Object, Object> c1550480qRy22 = c1550480qRy2;
                            Function2<Object, Function1<? super Object, Unit>, Unit> function2 = c1550480qRy22.LIZ;
                            Object obj32 = obj4;
                            function2.invoke(obj32, new C1550470qRx(c1550480qRy22, obj32, c1550500qS04));
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("Deduplicate@5cf3.newSession$task$1");
                    }
                }, c1550500qS04);
                ?? first2 = pair2.getFirst();
                C1550500qS0<Object> c1550500qS05 = (C1550500qS0) pair2.getSecond();
                this.LLILZ.element = first2;
                c1550500qS05.LIZJ.addAll(c1550500qS02.LIZJ);
                return c1550500qS05;
            }
            c1550500qS02.LIZJ.add(this.LLILLL);
            return c1550500qS02;
        }
        try {
            this.LLILLL.invoke(obj3);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return c1550500qS02;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return c1550500qS02;
        }
    }
}
