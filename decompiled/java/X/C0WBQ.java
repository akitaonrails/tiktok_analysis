package X;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: X.0WBQ, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public class C0WBQ<T> {
    public final Set<C0WBF<? super T>> LIZ;
    public final Set<C0WBG> LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public C0WBM<T> LJ;
    public final Set<Class<?>> LJFF;

    public final C0WBP<T> LIZIZ() {
        if (this.LJ != null) {
            return new C0WBP<>(new HashSet(this.LIZ), new HashSet(this.LIZIZ), this.LIZJ, this.LIZLLL, this.LJ, this.LJFF);
        }
        throw new IllegalStateException("Missing required property: factory.");
    }

    public final void LIZ(C0WBG c0wbg) {
        if (!((HashSet) this.LIZ).contains(c0wbg.LIZ)) {
            ((HashSet) this.LIZIZ).add(c0wbg);
            return;
        }
        throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
    }

    public C0WBQ(Class cls, Class[] clsArr) {
        HashSet hashSet = new HashSet();
        this.LIZ = hashSet;
        this.LIZIZ = new HashSet();
        this.LIZJ = 0;
        this.LIZLLL = 0;
        this.LJFF = new HashSet();
        hashSet.add(C0WBF.LIZ(cls));
        for (Class cls2 : clsArr) {
            if (cls2 != null) {
                ((HashSet) this.LIZ).add(C0WBF.LIZ(cls2));
            } else {
                throw new NullPointerException("Null interface");
            }
        }
    }
}
