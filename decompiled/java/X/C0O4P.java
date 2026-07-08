package X;

import android.util.LruCache;

/* JADX INFO: renamed from: X.0O4P, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public class C0O4P<PO> extends C0O72<String, PO> {
    public final int LIZIZ;
    public final long LIZJ;
    public final C01GW LIZLLL;

    public C0O4P() {
        this(0, 3);
    }

    @Override // X.C0O72
    public final Object LIZLLL(String str) {
        C0O4U c0o4u = (C0O4U) ((LruCache) this.LIZLLL.getValue()).get(str);
        if (c0o4u != null) {
            if (this.LIZJ > 0 && System.currentTimeMillis() - c0o4u.LIZIZ > this.LIZJ) {
                remove(str);
                return null;
            }
            return c0o4u.LIZ;
        }
        return null;
    }

    @Override // X.C0O72
    public final C0O4U LJ(String str) {
        return (C0O4U) ((LruCache) this.LIZLLL.getValue()).remove(str);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C0O4P(int i, int i2) {
        long j;
        i = (i2 & 1) != 0 ? Integer.MAX_VALUE : i;
        if ((i2 & 2) != 0) {
            j = -1;
        } else {
            j = 0;
        }
        this(i, j);
    }

    @Override // X.C0O72
    public final C0O4V LJFF(Object obj, Object obj2) {
        String str = (String) obj;
        C0O4V c0o4v = new C0O4V(str, obj2, System.currentTimeMillis());
        ((LruCache) this.LIZLLL.getValue()).put(str, c0o4v);
        return c0o4v;
    }

    public final C0O4U LJI(Object obj, Object obj2) {
        long jCurrentTimeMillis;
        String str = (String) obj;
        C0O4U<PO> c0o4uRemove = remove(str);
        if (c0o4uRemove != null) {
            jCurrentTimeMillis = c0o4uRemove.LIZIZ;
        } else {
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        C0O4V c0o4v = new C0O4V(str, obj2, jCurrentTimeMillis);
        ((LruCache) this.LIZLLL.getValue()).put(str, c0o4v);
        return c0o4v;
    }

    public C0O4P(int i, long j) {
        this.LIZIZ = i;
        this.LIZJ = j;
        this.LIZLLL = C452501pT.LIZIZ(new C0O4Q(this));
    }
}
