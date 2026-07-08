package X;

import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: renamed from: X.137A, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public abstract class C137A<K, V> extends AbstractConcurrentMapC1486340omW<K, V> implements Serializable {
    public static final long serialVersionUID = 3;
    public final C137L LL;
    public final C137L LLILLJJLI;
    public final C137H<Object> LLILLL;
    public final int LLILZ;
    public transient ConcurrentMap<K, V> LLILZIL;

    @Override // X.AbstractConcurrentMapC1486340omW, X.C08J5, X.C08J6
    public final Object LJIIL() {
        return this.LLILZIL;
    }

    @Override // X.AbstractConcurrentMapC1486340omW, X.C08J5
    /* JADX INFO: renamed from: LJIIZILJ */
    public final Map LJIIL() {
        return this.LLILZIL;
    }

    @Override // X.AbstractConcurrentMapC1486340omW
    /* JADX INFO: renamed from: LJJ */
    public final ConcurrentMap<K, V> LJIIL() {
        return this.LLILZIL;
    }

    public C137A(C137L c137l, C137L c137l2, C137H c137h, int i, ConcurrentMap concurrentMap) {
        this.LL = c137l;
        this.LLILLJJLI = c137l2;
        this.LLILLL = c137h;
        this.LLILZ = i;
        this.LLILZIL = concurrentMap;
    }
}
