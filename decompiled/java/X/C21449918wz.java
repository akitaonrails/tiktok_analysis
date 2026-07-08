package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: renamed from: X.18wz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21449918wz implements Iterable<C21450018x0>, Cloneable {
    public static final String[] LLILZ = new String[0];
    public int LL;
    public String[] LLILLJJLI;
    public String[] LLILLL;

    public final int hashCode() {
        return (((this.LL * 31) + Arrays.hashCode(this.LLILLJJLI)) * 31) + Arrays.hashCode(this.LLILLL);
    }

    @Override // java.lang.Iterable
    public final Iterator<C21450018x0> iterator() {
        return new C21449818wy(this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C21449818wy c21449818wy = new C21449818wy(this);
        while (c21449818wy.hasNext()) {
            C21450018x0 c21450018x0 = (C21450018x0) c21449818wy.next();
            sb.append(c21450018x0.LL);
            sb.append("=\"");
            sb.append(c21450018x0.LLILLJJLI);
            sb.append("\" ");
        }
        return sb.toString();
    }

    public C21449918wz() {
        String[] strArr = LLILZ;
        this.LLILLJJLI = strArr;
        this.LLILLL = strArr;
    }

    public final Object clone() {
        try {
            C21449918wz c21449918wz = (C21449918wz) super.clone();
            c21449918wz.LL = this.LL;
            String[] strArr = this.LLILLJJLI;
            int i = this.LL;
            String[] strArr2 = new String[i];
            System.arraycopy(strArr, 0, strArr2, 0, Math.min(strArr.length, i));
            this.LLILLJJLI = strArr2;
            String[] strArr3 = this.LLILLL;
            int i2 = this.LL;
            String[] strArr4 = new String[i2];
            System.arraycopy(strArr3, 0, strArr4, 0, Math.min(strArr3.length, i2));
            this.LLILLL = strArr4;
            return c21449918wz;
        } catch (CloneNotSupportedException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new RuntimeException(e);
        }
    }

    public final int LIZJ(String str) {
        if (str != null) {
            for (int i = 0; i < this.LL; i++) {
                if (str.equals(this.LLILLJJLI[i])) {
                    return i;
                }
            }
            return -1;
        }
        throw new IllegalArgumentException("Object must not be null");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C21449918wz.class != obj.getClass()) {
            return false;
        }
        C21449918wz c21449918wz = (C21449918wz) obj;
        if (this.LL != c21449918wz.LL || !Arrays.equals(this.LLILLJJLI, c21449918wz.LLILLJJLI)) {
            return false;
        }
        return Arrays.equals(this.LLILLL, c21449918wz.LLILLL);
    }
}
