package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.06hS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1676806hS<T> {
    public final Set<T> LIZ;
    public final C1DEV LIZIZ;
    public Set<? extends T> LIZJ;

    public final void LIZJ() {
        C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZ, null, new C1677206hW(this, null), 2);
    }

    public final String toString() {
        return this.LIZJ.toString();
    }

    public C1676806hS() {
        this.LIZIZ = new C1DEV(false);
        this.LIZJ = C08CX.INSTANCE;
        this.LIZ = new LinkedHashSet();
    }

    public C1676806hS(Collection<? extends T> collection) {
        this.LIZIZ = new C1DEV(false);
        this.LIZJ = C08CX.INSTANCE;
        this.LIZ = C13LP.LLIIIZ(collection);
        this.LIZJ = C13LP.LLIIJI(collection);
    }

    public final void LIZ(T t) {
        C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZ, null, new C1677006hU(this, t, null), 2);
    }

    public final boolean LIZIZ(Function1<? super T, Boolean> function1) {
        Set<? extends T> set = this.LIZJ;
        if ((set instanceof Collection) && set.isEmpty()) {
            return false;
        }
        Iterator<T> it2 = set.iterator();
        while (it2.hasNext()) {
            if (function1.invoke(it2.next()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final void LIZLLL(T t) {
        C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZ, null, new C1677106hV(this, t, null), 2);
    }

    public final void LJ(Function1<? super T, Boolean> function1) {
        C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZ, null, new C1676906hT(this, function1, null), 2);
    }
}
