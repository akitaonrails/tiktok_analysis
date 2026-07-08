package X;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00Yq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C098200Yq implements Serializable {
    public final Throwable exception;

    public int hashCode() {
        return this.exception.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Failure(");
        sbLIZ.append(this.exception);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C098200Yq(Throwable th) {
        this.exception = th;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof C098200Yq) && Intrinsics.LJFF(this.exception, ((C098200Yq) obj).exception)) {
            return true;
        }
        return false;
    }
}
