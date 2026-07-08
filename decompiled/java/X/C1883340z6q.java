package X;

import android.os.Build;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0z6q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1883340z6q {
    public final C01GW LIZ = C452501pT.LIZIZ(new C1883350z6r());

    public final ConcurrentHashMap<Class<?>, InterfaceC1883360z6s> LIZIZ() {
        return (ConcurrentHashMap) this.LIZ.getValue();
    }

    public C1883340z6q() {
        LIZJ(InterfaceC1883430z6z.class, new InterfaceC1883430z6z() { // from class: X.0z6u
            @Override // X.InterfaceC1883360z6s
            public final void LJLJL() {
            }

            @Override // X.InterfaceC1883360z6s
            public final void LLLZI() {
            }
        });
        LIZJ(InterfaceC1883420z6y.class, new InterfaceC1883420z6y() { // from class: X.0z6t
            @Override // X.InterfaceC1883360z6s
            public final void LJLJL() {
            }

            @Override // X.InterfaceC1883360z6s
            public final void LLLZI() {
            }
        });
        LIZJ(InterfaceC1881720z4E.class, new InterfaceC1881720z4E() { // from class: X.0z5b
            public final C01GW LL = C452501pT.LIZIZ(new C1882580z5c());

            @Override // X.InterfaceC1883360z6s
            public final void LJLJL() {
            }

            @Override // X.InterfaceC1883360z6s
            public final void LLLZI() {
            }

            @Override // X.InterfaceC1881720z4E
            public final <T> T LJIIIIZZ(Class<T> cls) {
                T t = (T) ((ConcurrentHashMap) this.LL.getValue()).get(cls);
                if (t == null) {
                    C480460Ism.LIZ().getClass();
                    return (T) C480460Ism.LIZLLL(cls);
                }
                return t;
            }

            @Override // X.InterfaceC1881720z4E
            public final void LIZLLL(Class cls, C1881950z4b c1881950z4b) {
                if (Build.VERSION.SDK_INT >= 24) {
                    ((ConcurrentHashMap) this.LL.getValue()).remove(cls, c1881950z4b);
                } else {
                    ((ConcurrentHashMap) this.LL.getValue()).remove(cls);
                }
            }

            @Override // X.InterfaceC1881720z4E
            public final void LJFF(Class cls, C1881950z4b c1881950z4b) {
                ((ConcurrentHashMap) this.LL.getValue()).put(cls, c1881950z4b);
            }
        });
    }

    public final <T extends InterfaceC1883360z6s> T LIZ(Class<T> cls) {
        T t = (T) LIZIZ().get(cls);
        if (t != null && cls.isInstance(t)) {
            return t;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends InterfaceC1883360z6s> void LIZJ(Class<T> cls, T t) {
        LIZIZ().put(cls, t);
        t.LLLZI();
    }

    public final <T extends InterfaceC1883360z6s> void LIZLLL(Class<T> cls, T t) {
        if (Build.VERSION.SDK_INT >= 24) {
            LIZIZ().remove(cls, t);
        } else {
            LIZIZ().remove(cls);
        }
        t.LJLJL();
    }
}
