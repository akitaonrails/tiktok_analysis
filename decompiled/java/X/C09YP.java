package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.09YP, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09YP {
    public final String LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final Map<String, Object> LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C09YP)) {
            return false;
        }
        C09YP c09yp = (C09YP) obj;
        return Intrinsics.LJFF(this.LIZ, c09yp.LIZ) && this.LIZIZ == c09yp.LIZIZ && Intrinsics.LJFF(this.LIZJ, c09yp.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c09yp.LIZLLL);
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode();
    }

    public C09YP(int i, String str, String str2, Map map) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = str2;
        this.LIZLLL = map;
    }
}
