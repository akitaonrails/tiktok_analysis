package X;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS212S0000000_23;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qCS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1540860qCS {
    public static ConcurrentHashMap<C1540860qCS, Boolean> LJII = new ConcurrentHashMap<>();
    public final String LIZ;
    public final boolean LIZIZ;
    public final String LIZJ;
    public final HashMap<C1541070qCn<?, ?>, C1541020qCi> LIZLLL = new HashMap<>();
    public final ConcurrentHashMap<C1540930qCZ, WeakReference<C1541080qCo<?>>> LJ;
    public volatile boolean LJFF;
    public volatile long LJI;

    static {
        C1532960pzi.LIZJ(400000L, new Runnable() { // from class: X.0qCd
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("PrefetchGroup$Companion@b720.1");
                try {
                    if (C1540860qCS.LJII != null) {
                        C1532960pzi.LJ(AFwS212S0000000_23.get$arr$(160));
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("PrefetchGroup$Companion@b720.1");
            }
        });
    }

    public Map<C1541070qCn<?, ?>, C1541020qCi> LJFF(String str, boolean z) {
        C1541020qCi c1541020qCi;
        EnumC1533170q03 enumC1533170q03;
        if (this.LJFF) {
            return this.LIZLLL;
        }
        C1532930pzf.LIZJ.LIZJ(AFwS212S0000000_23.get$arr$(159));
        this.LJFF = true;
        ConcurrentHashMap<C1540930qCZ, WeakReference<C1541080qCo<?>>> concurrentHashMap = this.LJ;
        if (concurrentHashMap != null) {
            for (Map.Entry<C1540930qCZ, WeakReference<C1541080qCo<?>>> entry : concurrentHashMap.entrySet()) {
                if (entry.getKey().LIZ) {
                    C1535940q4W c1535940q4W = entry.getKey().LIZJ;
                    if (c1535940q4W != null && (!c1535940q4W.LIZ || z || c1535940q4W.LJ != EnumC1533170q03.KEEP_ALIVE)) {
                        C1541080qCo<?> c1541080qCo = entry.getValue().get();
                        if (c1541080qCo != null && c1541080qCo.LJII(EnumC1541150qCv.GROUP_DESTROYED) && c1541080qCo.LJFF <= 0 && (c1541020qCi = this.LIZLLL.get(entry.getKey().LJ)) != null) {
                            c1541020qCi.LJFF++;
                        }
                    }
                } else {
                    if (!z) {
                        C1535940q4W c1535940q4W2 = entry.getKey().LIZJ;
                        if (c1535940q4W2 != null) {
                            enumC1533170q03 = c1535940q4W2.LJ;
                        } else {
                            enumC1533170q03 = null;
                        }
                        if (enumC1533170q03 != EnumC1533170q03.KEEP_ALIVE) {
                        }
                    }
                    C1541080qCo<?> c1541080qCo2 = entry.getValue().get();
                    if (c1541080qCo2 != null) {
                        c1541080qCo2.LJIILL(null, EnumC1541150qCv.GROUP_DESTROYED);
                    }
                }
            }
        }
        ConcurrentHashMap<C1540860qCS, Boolean> concurrentHashMap2 = LJII;
        if (concurrentHashMap2 != null) {
            concurrentHashMap2.remove(this);
        }
        ConcurrentHashMap<C1540930qCZ, WeakReference<C1541080qCo<?>>> concurrentHashMap3 = this.LJ;
        if (concurrentHashMap3 != null) {
            concurrentHashMap3.clear();
        }
        Iterator<Map.Entry<C1541070qCn<?, ?>, C1541020qCi>> it2 = this.LIZLLL.entrySet().iterator();
        while (it2.hasNext()) {
            C1541020qCi value = it2.next().getValue();
            Integer numValueOf = Integer.valueOf(value.LIZIZ);
            if (numValueOf.intValue() > 0) {
                float fIntValue = numValueOf.intValue();
                if (Integer.valueOf(value.LIZ).intValue() > 0) {
                    value.LJII = value.LIZLLL / r1.intValue();
                }
                value.LJIIIIZZ = value.LJFF / fIntValue;
                value.LJIIIZ = (value.LIZJ + value.LIZLLL) / fIntValue;
            }
        }
        InterfaceC1532860pzY.LIZ.getClass();
        InterfaceC1532860pzY interfaceC1532860pzY = C1532910pzd.LIZJ;
        if (interfaceC1532860pzY != null) {
            interfaceC1532860pzY.LJIIZILJ(this.LIZ, str, this.LIZJ, this.LIZLLL);
        }
        return this.LIZLLL;
    }

    public C1540860qCS(String str, boolean z, boolean z2, String str2) {
        ConcurrentHashMap<C1540930qCZ, WeakReference<C1541080qCo<?>>> concurrentHashMap;
        this.LIZ = str;
        this.LIZIZ = z;
        this.LIZJ = str2;
        InterfaceC1532860pzY.LIZ.getClass();
        if (!C1532910pzd.LIZLLL && !z2 && !Intrinsics.LJFF(str, "LiveResourceGroup")) {
            concurrentHashMap = null;
        } else {
            concurrentHashMap = new ConcurrentHashMap<>();
        }
        this.LJ = concurrentHashMap;
        this.LJI = System.currentTimeMillis();
        ConcurrentHashMap<C1540860qCS, Boolean> concurrentHashMap2 = LJII;
        if (concurrentHashMap2 != null) {
            concurrentHashMap2.put(this, Boolean.FALSE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <Input, Result extends InterfaceC1541240qD4> C1541080qCo<Result> LJ(Input input, C1541070qCn<Input, Result> c1541070qCn, String str, C1535940q4W c1535940q4W, Function1<? super Result, Unit> function1) {
        long jCurrentTimeMillis;
        if (this.LJFF) {
            C1532930pzf.LIZJ.LIZJ(AFwS212S0000000_23.get$arr$(158));
            return null;
        }
        if (str == null) {
            str = this.LIZ;
        }
        C1541080qCo<Result> c1541080qCo = (C1541080qCo<Result>) c1541070qCn.LIZJ(input, str, c1535940q4W, function1);
        if (c1541080qCo == null) {
            return null;
        }
        C443120HZe c443120HZe = (C443120HZe) C13LP.LJJLIIIJL(c1541080qCo.LJIIL.LIZJ);
        if (c443120HZe != null) {
            jCurrentTimeMillis = ((Number) c443120HZe.getSecond()).longValue();
        } else {
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        this.LJI = jCurrentTimeMillis;
        C1540930qCZ c1540930qCZ = c1541080qCo.LIZ;
        HashMap<C1541070qCn<?, ?>, C1541020qCi> map = this.LIZLLL;
        C1541020qCi c1541020qCi = map.get(c1541070qCn);
        if (c1541020qCi == null) {
            c1541020qCi = new C1541020qCi(0);
            map.put(c1541070qCn, c1541020qCi);
        }
        c1540930qCZ.getClass();
        c1540930qCZ.LJFF = new WeakReference<>(this);
        c1540930qCZ.LJIIIZ = c1541020qCi;
        return c1541080qCo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <Input, Result extends InterfaceC1541240qD4> C1541080qCo<Result> LIZLLL(Input input, C1541070qCn<Input, Result> c1541070qCn, String str, Long l, C1535940q4W c1535940q4W, Function1<? super Result, Unit> function1) {
        long jCurrentTimeMillis;
        String str2 = str;
        if (str2 == null) {
            str2 = this.LIZ;
        }
        C1541080qCo<Result> c1541080qCo = (C1541080qCo<Result>) c1541070qCn.LIZ(input, str2, l, c1535940q4W, function1);
        if (c1541080qCo == null) {
            return null;
        }
        C443120HZe c443120HZe = (C443120HZe) C13LP.LJJLIIIJL(c1541080qCo.LJIIL.LIZJ);
        if (c443120HZe != null) {
            jCurrentTimeMillis = ((Number) c443120HZe.getSecond()).longValue();
        } else {
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        this.LJI = jCurrentTimeMillis;
        C1540930qCZ c1540930qCZ = c1541080qCo.LIZ;
        HashMap<C1541070qCn<?, ?>, C1541020qCi> map = this.LIZLLL;
        C1541020qCi c1541020qCi = map.get(c1541070qCn);
        if (c1541020qCi == null) {
            c1541020qCi = new C1541020qCi(0);
            map.put(c1541070qCn, c1541020qCi);
        }
        c1540930qCZ.getClass();
        c1540930qCZ.LJFF = new WeakReference<>(this);
        c1540930qCZ.LJIIIZ = c1541020qCi;
        return c1541080qCo;
    }
}
