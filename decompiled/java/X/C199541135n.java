package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: X.135n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C199541135n implements Iterator<Map.Entry<String, Object>> {
    public int LL = -1;
    public C199545135r LLILLJJLI;
    public Object LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;
    public C199545135r LLILZLL;
    public final /* synthetic */ C199539135l LLIZ;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.LLILZIL) {
            this.LLILZIL = true;
            this.LLILLL = null;
            while (this.LLILLL == null) {
                int i = this.LL + 1;
                this.LL = i;
                if (i >= this.LLIZ.LLILLJJLI.LIZJ.size()) {
                    break;
                }
                C199544135q c199544135q = this.LLIZ.LLILLJJLI;
                C199545135r c199545135rLIZ = c199544135q.LIZ((String) ListProtector.get(c199544135q.LIZJ, this.LL));
                this.LLILLJJLI = c199545135rLIZ;
                this.LLILLL = c199545135rLIZ.LIZ(this.LLIZ.LL);
            }
        }
        return this.LLILLL != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        C19864312np.LJIILJJIL((this.LLILZLL == null || this.LLILZ) ? false : true);
        this.LLILZ = true;
        this.LLILZLL.LIZLLL(this.LLIZ.LL, null);
    }

    @Override // java.util.Iterator
    public final Map.Entry<String, Object> next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        final C199545135r c199545135r = this.LLILLJJLI;
        this.LLILZLL = c199545135r;
        final Object obj = this.LLILLL;
        this.LLILZIL = false;
        this.LLILZ = false;
        this.LLILLJJLI = null;
        this.LLILLL = null;
        final C199539135l c199539135l = this.LLIZ;
        return new Map.Entry<String, Object>(c199545135r, obj) { // from class: X.135p
            public Object LL;
            public final C199545135r LLILLJJLI;

            @Override // java.util.Map.Entry
            /* JADX INFO: renamed from: LIZ, reason: merged with bridge method [inline-methods] */
            public final String getKey() {
                String str = this.LLILLJJLI.LIZLLL;
                return this.LLILLL.LLILLJJLI.LIZ ? str.toLowerCase(Locale.US) : str;
            }

            @Override // java.util.Map.Entry
            public final int hashCode() {
                return getKey().hashCode() ^ this.LL.hashCode();
            }

            @Override // java.util.Map.Entry
            public final Object getValue() {
                return this.LL;
            }

            @Override // java.util.Map.Entry
            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj2;
                if (getKey().equals(entry.getKey()) && this.LL.equals(entry.getValue())) {
                    return true;
                }
                return false;
            }

            @Override // java.util.Map.Entry
            public final Object setValue(Object obj2) {
                Object obj3 = this.LL;
                obj2.getClass();
                this.LL = obj2;
                this.LLILLJJLI.LIZLLL(this.LLILLL.LL, obj2);
                return obj3;
            }

            {
                this.LLILLJJLI = c199545135r;
                obj.getClass();
                this.LL = obj;
            }
        };
    }

    public C199541135n(C199539135l c199539135l) {
        this.LLIZ = c199539135l;
    }
}
