package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Y9U, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Y9U {
    public static final /* synthetic */ int LIZLLL = 0;
    public final List<C869670Y9t> LIZ;
    public final C0Y9M LIZIZ;
    public final int LIZJ;

    static {
        new C0Y9T();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0Y9U)) {
            return false;
        }
        C0Y9U c0y9u = (C0Y9U) obj;
        return Intrinsics.LJFF(this.LIZ, c0y9u.LIZ) && this.LIZIZ == c0y9u.LIZIZ && this.LIZJ == c0y9u.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MessageQuery(filters=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", orderBy=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", limit=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0Y9U(List<C869670Y9t> list, C0Y9M c0y9m, int i) {
        this.LIZ = list;
        this.LIZIZ = c0y9m;
        this.LIZJ = i;
        if (!list.isEmpty()) {
            return;
        }
        "At least one filter is required".toString();
        throw new IllegalArgumentException("At least one filter is required");
    }
}
