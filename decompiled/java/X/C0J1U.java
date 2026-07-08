package X;

import Y.AkS156S0000000_7;
import android.util.Pair;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: renamed from: X.0J1U, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0J1U<K, V> implements InterfaceC470710Id3<K, V> {
    public final InterfaceC1487280oo2<K, Integer> LIZ;
    public final InterfaceC500500Jk0<K, V, Boolean> LIZIZ;
    public final InterfaceC953020auK<K, V, Long, Boolean> LIZJ;
    public final InterfaceC500500Jk0<V, V, V> LIZLLL;
    public final Map<Integer, Pair<V, Long>> LJ;
    public final ConcurrentMap<Integer, C11PR<V>> LJFF;

    public C0J1U() {
        InterfaceC500500Jk0<K, V, Boolean> interfaceC500500Jk0 = new InterfaceC500500Jk0() { // from class: X.0J1W
            @Override // X.InterfaceC500500Jk0
            public final Object apply(Object obj, Object obj2) {
                return Boolean.FALSE;
            }
        };
        AkS156S0000000_7 akS156S0000000_7 = new AkS156S0000000_7(0);
        InterfaceC953020auK<K, V, Long, Boolean> interfaceC953020auK = new InterfaceC953020auK() { // from class: X.0J1V
            public final /* synthetic */ long LIZ = Long.MAX_VALUE;

            @Override // X.InterfaceC953020auK
            public final Object LIZ(Object obj, Object obj2, Object obj3) {
                boolean z;
                Long l = (Long) obj3;
                if (System.currentTimeMillis() - l.longValue() <= this.LIZ && System.currentTimeMillis() >= l.longValue()) {
                    z = false;
                } else {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        };
        InterfaceC500500Jk0<V, V, V> interfaceC500500Jk02 = new InterfaceC500500Jk0() { // from class: X.0J1X
            @Override // X.InterfaceC500500Jk0
            public final Object apply(Object obj, Object obj2) {
                return obj2;
            }
        };
        this.LJ = new ConcurrentHashMap();
        this.LJFF = new ConcurrentHashMap(20, 0.75f, 4);
        this.LIZ = akS156S0000000_7;
        this.LIZIZ = interfaceC500500Jk0;
        this.LIZJ = interfaceC953020auK;
        this.LIZLLL = interfaceC500500Jk02;
    }

    @Override // X.InterfaceC470710Id3
    public final C11NZ LLLLLLIL() {
        int iIntValue = ((Integer) C0J1R.LIZ(this.LIZ, "live")).intValue();
        ((ConcurrentHashMap) this.LJFF).putIfAbsent(Integer.valueOf(iIntValue), new C11RK());
        return (C11NZ) ((ConcurrentHashMap) this.LJFF).get(Integer.valueOf(iIntValue));
    }

    @Override // X.InterfaceC470710Id3
    public final void LIZ(K k) {
        ((ConcurrentHashMap) this.LJ).remove(C0J1R.LIZ(this.LIZ, k));
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // X.InterfaceC470710Id3
    public final V get(K k) {
        Pair pair = (Pair) ((ConcurrentHashMap) this.LJ).get(C0J1R.LIZ(this.LIZ, k));
        if (pair != null) {
            try {
                if (!this.LIZJ.LIZ(k, (V) pair.first, (Long) pair.second).booleanValue()) {
                    return pair.first;
                }
                return null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw C11QG.LIZIZ(th);
            }
        }
        return null;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.InterfaceC470710Id3
    public final void put(K k, V v) throws Throwable {
        RuntimeException runtimeExceptionLIZIZ;
        RuntimeException runtimeExceptionLIZIZ2;
        RuntimeException runtimeExceptionLIZIZ3;
        try {
            if (this.LIZIZ.apply(k, v).booleanValue()) {
                return;
            }
            int iIntValue = ((Integer) C0J1R.LIZ(this.LIZ, k)).intValue();
            Pair pair = (Pair) ((ConcurrentHashMap) this.LJ).get(Integer.valueOf(iIntValue));
            if (pair != null) {
                try {
                    if (!((Boolean) this.LIZJ.LIZ(k, (V) pair.first, (Long) pair.second)).booleanValue()) {
                        Object obj = ((Pair) ((ConcurrentHashMap) this.LJ).get(Integer.valueOf(iIntValue))).first;
                        if (!v.equals(obj)) {
                            try {
                                v = (V) this.LIZLLL.apply((V) obj, v);
                                if (v.equals(obj)) {
                                    return;
                                }
                            } finally {
                            }
                        } else {
                            return;
                        }
                    }
                } finally {
                }
            }
            ((ConcurrentHashMap) this.LJ).put(Integer.valueOf(iIntValue), new Pair(v, Long.valueOf(System.currentTimeMillis())));
            if (((ConcurrentHashMap) this.LJFF).containsKey(Integer.valueOf(iIntValue))) {
                ((C11PR) ((ConcurrentHashMap) this.LJFF).get(Integer.valueOf(iIntValue))).onNext(v);
            }
        } finally {
        }
    }
}
