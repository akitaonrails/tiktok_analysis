package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: X.0jo3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1295090jo3 {
    public static final C1295090jo3 LIZJ = new C1295090jo3("COMPOSITION");
    public final List<String> LIZ;
    public InterfaceC1295760jp8 LIZIZ;

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        InterfaceC1295760jp8 interfaceC1295760jp8 = this.LIZIZ;
        return iHashCode + (interfaceC1295760jp8 != null ? interfaceC1295760jp8.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("KeyPath{keys=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(",resolved=");
        sbLIZ.append(this.LIZIZ != null);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1295090jo3(C1295090jo3 c1295090jo3) {
        this.LIZ = new ArrayList(c1295090jo3.LIZ);
        this.LIZIZ = c1295090jo3.LIZIZ;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1295090jo3.class != obj.getClass()) {
            return false;
        }
        C1295090jo3 c1295090jo3 = (C1295090jo3) obj;
        if (!this.LIZ.equals(c1295090jo3.LIZ)) {
            return false;
        }
        InterfaceC1295760jp8 interfaceC1295760jp8 = this.LIZIZ;
        InterfaceC1295760jp8 interfaceC1295760jp82 = c1295090jo3.LIZIZ;
        if (interfaceC1295760jp8 != null) {
            return interfaceC1295760jp8.equals(interfaceC1295760jp82);
        }
        if (interfaceC1295760jp82 == null) {
            return true;
        }
        return false;
    }

    public C1295090jo3(String... strArr) {
        this.LIZ = Arrays.asList(strArr);
    }

    public final boolean LIZ(int i, String str) {
        boolean z;
        boolean z2;
        if (i >= this.LIZ.size()) {
            return false;
        }
        if (i == this.LIZ.size() - 1) {
            z = true;
        } else {
            z = false;
        }
        String str2 = (String) ListProtector.get(this.LIZ, i);
        if (!str2.equals("**")) {
            if (!str2.equals(str) && !str2.equals("*")) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (!z) {
                if (i != this.LIZ.size() - 2) {
                    return false;
                }
                if (!((String) ListProtector.get(this.LIZ, r1.size() - 1)).equals("**")) {
                    return false;
                }
            }
            if (!z2) {
                return false;
            }
            return true;
        }
        if (z) {
            return true;
        }
        if (((String) ListProtector.get(this.LIZ, i + 1)).equals(str)) {
            if (i != this.LIZ.size() - 2) {
                if (i != this.LIZ.size() - 3) {
                    return false;
                }
                if (!((String) ListProtector.get(this.LIZ, r1.size() - 1)).equals("**")) {
                    return false;
                }
            }
            return true;
        }
        int i2 = i + 1;
        if (i2 < this.LIZ.size() - 1) {
            return false;
        }
        return ((String) ListProtector.get(this.LIZ, i2)).equals(str);
    }

    public final int LIZIZ(int i, String str) {
        if ("__container".equals(str)) {
            return 0;
        }
        if (!((String) ListProtector.get(this.LIZ, i)).equals("**")) {
            return 1;
        }
        if (i == this.LIZ.size() - 1 || !((String) ListProtector.get(this.LIZ, i + 1)).equals(str)) {
            return 0;
        }
        return 2;
    }

    public final boolean LIZJ(int i, String str) {
        if ("__container".equals(str)) {
            return true;
        }
        if (i >= this.LIZ.size()) {
            return false;
        }
        if (((String) ListProtector.get(this.LIZ, i)).equals(str) || ((String) ListProtector.get(this.LIZ, i)).equals("**") || ((String) ListProtector.get(this.LIZ, i)).equals("*")) {
            return true;
        }
        return false;
    }

    public final boolean LIZLLL(int i, String str) {
        if ("__container".equals(str) || i < this.LIZ.size() - 1 || ((String) ListProtector.get(this.LIZ, i)).equals("**")) {
            return true;
        }
        return false;
    }
}
