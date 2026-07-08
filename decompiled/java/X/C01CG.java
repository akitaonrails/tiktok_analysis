package X;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: X.01CG, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01CG {
    public static final /* synthetic */ int LJ = 0;
    public final String LIZ;
    public final Set<String> LIZIZ;
    public Integer LIZJ;
    public String LIZLLL;

    public final int hashCode() {
        if (this.LIZJ == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.LIZ);
            C13EQ.LJJIJLIJ(this.LIZIZ);
            Iterator<T> it2 = this.LIZIZ.iterator();
            while (it2.hasNext()) {
                sb.append((String) it2.next());
            }
            this.LIZJ = Integer.valueOf(sb.toString().hashCode());
        }
        return this.LIZJ.intValue();
    }

    public final String toString() {
        if (this.LIZLLL == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.LIZ);
            if (!this.LIZIZ.isEmpty()) {
                sb.append('?');
            }
            C13EQ.LJJIJLIJ(this.LIZIZ);
            int i = 0;
            for (Object obj : this.LIZIZ) {
                int i2 = i + 1;
                if (i < 0) {
                    C1697810uHb.LJIJI();
                    throw null;
                }
                sb.append((String) obj);
                if (i < this.LIZIZ.size() - 1) {
                    sb.append('&');
                }
                i = i2;
            }
            this.LIZLLL = sb.toString();
        }
        return this.LIZLLL;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof String) {
            return equals(C01CF.LIZ((String) obj));
        }
        if ((obj instanceof C01CG) && hashCode() == ((C01CG) obj).hashCode()) {
            return true;
        }
        return false;
    }

    public C01CG(String str, Set<String> set) {
        this.LIZ = str;
        this.LIZIZ = set;
    }
}
