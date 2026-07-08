package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.facebook.common.references.SharedReference;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0kX9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1323050kX9<T> implements Cloneable, Closeable {
    public static final Class<C1323050kX9> LLILLL = C1323050kX9.class;
    public static final C1323060kXA LLILZ = new InterfaceC1290810jh9<Closeable>() { // from class: X.0kXA
        @Override // X.InterfaceC1290810jh9
        public final void LIZ(Closeable closeable) {
            try {
                C1323080kXC.LIZ(closeable);
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    };
    public boolean LL;
    public final SharedReference<T> LLILLJJLI;

    /* JADX INFO: renamed from: LIZ, reason: merged with bridge method [inline-methods] */
    public final synchronized C1323050kX9<T> clone() {
        C1322350kW1.LJFF(LJIILLIIL());
        return new C1323050kX9<>(this.LLILLJJLI);
    }

    public final synchronized C1323050kX9<T> LIZLLL() {
        if (!LJIILLIIL()) {
            return null;
        }
        return clone();
    }

    public final synchronized boolean LJIILLIIL() {
        return !this.LL;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            try {
                if (this.LL) {
                    return;
                }
                this.LL = true;
                this.LLILLJJLI.deleteReference();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void finalize() throws Throwable {
        try {
            synchronized (this) {
                try {
                    if (this.LL) {
                        super.finalize();
                        return;
                    }
                    Class<C1323050kX9> cls = LLILLL;
                    Integer numValueOf = Integer.valueOf(System.identityHashCode(this));
                    Integer numValueOf2 = Integer.valueOf(System.identityHashCode(this.LLILLJJLI));
                    String name = this.LLILLJJLI.get().getClass().getName();
                    if (C1328570kg3.LIZ.LIZIZ(3)) {
                        C1328570kg3.LIZ.d(cls.getSimpleName(), C786410Ut5.k4(null, "Finalized without closing: %x %x (type = %s)", new Object[]{numValueOf, numValueOf2, name}));
                    }
                    close();
                    super.finalize();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            super.finalize();
            throw th2;
        }
    }

    public final synchronized T get() {
        return this.LLILLJJLI.get();
    }

    public final int LJIILL() {
        if (LJIILLIIL()) {
            return System.identityHashCode(this.LLILLJJLI.get());
        }
        return 0;
    }

    public C1323050kX9(SharedReference<T> sharedReference) {
        sharedReference.getClass();
        this.LLILLJJLI = sharedReference;
        sharedReference.addReference();
    }

    public static <T> List<C1323050kX9<T>> LIZIZ(Collection<C1323050kX9<T>> collection) {
        if (collection == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator<C1323050kX9<T>> it2 = collection.iterator();
        while (it2.hasNext()) {
            arrayList.add(LJFF(it2.next()));
        }
        return arrayList;
    }

    public static <T> C1323050kX9<T> LJFF(C1323050kX9<T> c1323050kX9) {
        if (c1323050kX9 != null) {
            return c1323050kX9.LIZLLL();
        }
        return null;
    }

    public static void LJI(Iterable<? extends C1323050kX9<?>> iterable) {
        if (iterable != null) {
            Iterator<? extends C1323050kX9<?>> it2 = iterable.iterator();
            while (it2.hasNext()) {
                LJII(it2.next());
            }
        }
    }

    public static void LJII(C1323050kX9<?> c1323050kX9) {
        if (c1323050kX9 != null) {
            c1323050kX9.close();
        }
    }

    public static boolean LJIJJ(C1323050kX9<?> c1323050kX9) {
        if (c1323050kX9 != null && c1323050kX9.LJIILLIIL()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Incorrect types in method signature: <T::Ljava/io/Closeable;>(TT;)LX/0kX9<TT;>; */
    public static C1323050kX9 LJIJJLI(Closeable closeable) {
        if (closeable == null) {
            return null;
        }
        return new C1323050kX9(closeable, LLILZ);
    }

    public C1323050kX9(T t, InterfaceC1290810jh9<T> interfaceC1290810jh9) {
        this.LLILLJJLI = new SharedReference<>(t, interfaceC1290810jh9);
    }

    public static <T> C1323050kX9<T> LJJIZ(T t, InterfaceC1290810jh9<T> interfaceC1290810jh9) {
        if (t == null) {
            return null;
        }
        return new C1323050kX9<>(t, interfaceC1290810jh9);
    }
}
