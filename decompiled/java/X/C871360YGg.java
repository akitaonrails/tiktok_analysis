package X;

import Y.ARunnableS83S0200000_14;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: X.0YGg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C871360YGg implements C0YF7 {
    public final ConcurrentHashMap<Class<?>, CopyOnWriteArraySet<InterfaceC1741206rq<?>>> LIZ = new ConcurrentHashMap<>();
    public final CopyOnWriteArraySet<InterfaceC1741206rq<InterfaceC871310YGb>> LIZIZ = new CopyOnWriteArraySet<>();

    @Override // X.InterfaceC871370YGh
    public final InterfaceC866920Xze LIZJ(final InterfaceC1741206rq<? super InterfaceC871310YGb> interfaceC1741206rq) {
        this.LIZIZ.add(interfaceC1741206rq);
        return new InterfaceC866920Xze() { // from class: X.0YGi
            @Override // X.InterfaceC866920Xze
            public final void unsubscribe() {
                this.LIZ.LIZIZ.remove(interfaceC1741206rq);
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0YGj] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // X.InterfaceC871370YGh
    public final C871390YGj LIZ(C1740506rj c1740506rj, final C0YI1 c0yi1) {
        ConcurrentHashMap<Class<?>, CopyOnWriteArraySet<InterfaceC1741206rq<?>>> concurrentHashMap = this.LIZ;
        Class<T> cls = c1740506rj.LIZ;
        CopyOnWriteArraySet<InterfaceC1741206rq<?>> copyOnWriteArraySet = concurrentHashMap.get(cls);
        if (copyOnWriteArraySet == null) {
            copyOnWriteArraySet = new CopyOnWriteArraySet<>();
            CopyOnWriteArraySet<InterfaceC1741206rq<?>> copyOnWriteArraySetPutIfAbsent = concurrentHashMap.putIfAbsent((Class<?>) cls, copyOnWriteArraySet);
            if (copyOnWriteArraySetPutIfAbsent != null) {
                copyOnWriteArraySet = copyOnWriteArraySetPutIfAbsent;
            }
        }
        final CopyOnWriteArraySet<InterfaceC1741206rq<?>> copyOnWriteArraySet2 = copyOnWriteArraySet;
        copyOnWriteArraySet2.add(c0yi1);
        return new InterfaceC866920Xze() { // from class: X.0YGj
            @Override // X.InterfaceC866920Xze
            public final void unsubscribe() {
                copyOnWriteArraySet2.remove(c0yi1);
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0Uz5] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // X.InterfaceC871370YGh
    public final C790130Uz5 LIZIZ(C1740506rj[] c1740506rjArr, C0YLS c0yls) {
        final ArrayList arrayList = new ArrayList(c1740506rjArr.length);
        for (C1740506rj c1740506rj : c1740506rjArr) {
            ConcurrentHashMap<Class<?>, CopyOnWriteArraySet<InterfaceC1741206rq<?>>> concurrentHashMap = this.LIZ;
            Class<T> cls = c1740506rj.LIZ;
            CopyOnWriteArraySet<InterfaceC1741206rq<?>> copyOnWriteArraySet = concurrentHashMap.get(cls);
            if (copyOnWriteArraySet == null) {
                copyOnWriteArraySet = new CopyOnWriteArraySet<>();
                CopyOnWriteArraySet<InterfaceC1741206rq<?>> copyOnWriteArraySetPutIfAbsent = concurrentHashMap.putIfAbsent((Class<?>) cls, copyOnWriteArraySet);
                if (copyOnWriteArraySetPutIfAbsent != null) {
                    copyOnWriteArraySet = copyOnWriteArraySetPutIfAbsent;
                }
            }
            CopyOnWriteArraySet<InterfaceC1741206rq<?>> copyOnWriteArraySet2 = copyOnWriteArraySet;
            copyOnWriteArraySet2.add(c0yls);
            arrayList.add(new ARunnableS83S0200000_14(copyOnWriteArraySet2, c0yls, 17));
        }
        return new InterfaceC866920Xze() { // from class: X.0Uz5
            @Override // X.InterfaceC866920Xze
            public final void unsubscribe() {
                Iterator<Runnable> it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    it2.next().run();
                }
            }
        };
    }

    public final <T extends InterfaceC871310YGb> void LJ(C1740506rj<T> c1740506rj, T t) {
        CopyOnWriteArraySet<InterfaceC1741206rq<?>> copyOnWriteArraySet = this.LIZ.get(c1740506rj.LIZ);
        if (copyOnWriteArraySet != null) {
            Iterator<InterfaceC1741206rq<?>> it2 = copyOnWriteArraySet.iterator();
            while (it2.hasNext()) {
                it2.next().onEvent(t);
            }
        }
        Iterator<InterfaceC1741206rq<InterfaceC871310YGb>> it3 = this.LIZIZ.iterator();
        while (it3.hasNext()) {
            it3.next().onEvent(t);
        }
    }

    public final void LJFF(int i, int i2) {
        C0YMI c0ymi;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2 && i2 != 3) {
                    return;
                } else {
                    c0ymi = C0YMI.COMPLETED;
                }
            } else {
                c0ymi = C0YMI.FAILED;
            }
        } else {
            c0ymi = C0YMI.STARTED;
        }
        LJ(InterfaceC871310YGb.LIZ, new C871400YGk(i, c0ymi));
    }

    public final void LJI(int i, int i2, boolean z, long j, int i3, Map<String, ? extends Object> map, Integer num) {
        LJ(InterfaceC871310YGb.LIZLLL, new C0YME(i, i2, z, j, i3, map, num));
    }
}
