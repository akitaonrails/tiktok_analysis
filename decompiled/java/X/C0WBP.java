package X;

import java.util.Arrays;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: renamed from: X.0WBP, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WBP<T> {
    public final Set<C0WBF<? super T>> LIZ;
    public final Set<C0WBG> LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final C0WBM<T> LJ;
    public final Set<Class<?>> LJFF;

    public C0WBP() {
        throw null;
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.LIZ.toArray()) + ">{" + this.LIZJ + ", type=" + this.LIZLLL + ", deps=" + Arrays.toString(this.LIZIZ.toArray()) + "}";
    }

    public static <T> C0WBQ<T> LIZ(Class<T> cls) {
        return new C0WBQ<>(cls, new Class[0]);
    }

    public static <T> C0WBP<T> LIZIZ(T t, Class<T> cls, Class<? super T>... clsArr) {
        C0WBQ c0wbq = new C0WBQ(cls, clsArr);
        c0wbq.LJ = new C819110WBh(t);
        return c0wbq.LIZIZ();
    }

    public C0WBP(Set set, Set set2, int i, int i2, C0WBM c0wbm, Set set3) {
        this.LIZ = Collections.unmodifiableSet(set);
        this.LIZIZ = Collections.unmodifiableSet(set2);
        this.LIZJ = i;
        this.LIZLLL = i2;
        this.LJ = c0wbm;
        this.LJFF = Collections.unmodifiableSet(set3);
    }
}
