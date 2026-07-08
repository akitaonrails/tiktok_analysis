package X;

import java.util.Arrays;
import java.util.logging.Logger;

/* JADX INFO: renamed from: X.138X, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C138X<K, V> {
    public static final C199606138a LJII = new C139C() { // from class: X.138a
        @Override // X.C139C
        public final long LIZ() {
            return 0L;
        }
    };
    public final int LIZ = -1;
    public final int LIZIZ = -1;
    public long LIZJ = -1;
    public final long LIZLLL = -1;
    public final long LJ = -1;
    public final long LJFF = -1;
    public final long LJI = -1;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.138a] */
    static {
        Logger.getLogger(C138X.class.getName());
    }

    public final C199607138b LIZ() {
        if (this.LIZLLL != -1) {
            throw new IllegalStateException("maximumWeight requires weigher");
        }
        if (this.LJI == -1) {
            return new C199607138b(this);
        }
        throw new IllegalStateException("refreshAfterWrite requires a LoadingCache");
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [X.138Y] */
    public final String toString() {
        final String simpleName = C138X.class.getSimpleName();
        ?? r4 = new Object(simpleName) { // from class: X.138Y
            public final String LIZ;
            public final C138Z LIZIZ;
            public C138Z LIZJ;

            public final String toString() {
                StringBuilder sb = new StringBuilder(32);
                sb.append(this.LIZ);
                sb.append('{');
                C138Z c138z = this.LIZIZ.LIZJ;
                String str = "";
                while (c138z != null) {
                    Object obj = c138z.LIZIZ;
                    sb.append(str);
                    String str2 = c138z.LIZ;
                    if (str2 != null) {
                        sb.append(str2);
                        sb.append('=');
                    }
                    if (obj == null || !obj.getClass().isArray()) {
                        sb.append(obj);
                    } else {
                        String strDeepToString = Arrays.deepToString(new Object[]{obj});
                        sb.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                    }
                    c138z = c138z.LIZJ;
                    str = ", ";
                }
                sb.append('}');
                return sb.toString();
            }

            {
                C138Z c138z = new C138Z();
                this.LIZIZ = c138z;
                this.LIZJ = c138z;
                this.LIZ = simpleName;
            }

            public final void LIZ(Object obj, String str) {
                C138Z c138z = new C138Z();
                this.LIZJ.LIZJ = c138z;
                this.LIZJ = c138z;
                c138z.LIZIZ = obj;
                c138z.LIZ = str;
            }
        };
        int i = this.LIZ;
        if (i != -1) {
            r4.LIZ(String.valueOf(i), "initialCapacity");
        }
        int i2 = this.LIZIZ;
        if (i2 != -1) {
            r4.LIZ(String.valueOf(i2), "concurrencyLevel");
        }
        long j = this.LIZJ;
        if (j != -1) {
            r4.LIZ(String.valueOf(j), "maximumSize");
        }
        long j2 = this.LIZLLL;
        if (j2 != -1) {
            r4.LIZ(String.valueOf(j2), "maximumWeight");
        }
        if (this.LJ != -1) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LJ);
            sbLIZ.append("ns");
            r4.LIZ(C2188811AlT.LIZIZ(sbLIZ), "expireAfterWrite");
        }
        if (this.LJFF != -1) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(this.LJFF);
            sbLIZ2.append("ns");
            r4.LIZ(C2188811AlT.LIZIZ(sbLIZ2), "expireAfterAccess");
        }
        return r4.toString();
    }
}
