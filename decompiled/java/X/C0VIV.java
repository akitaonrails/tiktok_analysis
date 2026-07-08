package X;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: X.0VIV, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VIV {
    public final Set<C0VIE> LIZ = new HashSet();

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0VIV.class == obj.getClass()) {
            return this.LIZ.equals(((C0VIV) obj).LIZ);
        }
        return false;
    }
}
