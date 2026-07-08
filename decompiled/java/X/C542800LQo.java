package X;

import java.io.Serializable;

/* JADX INFO: renamed from: X.0LQo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C542800LQo<T extends Serializable> {
    public final T LIZ;
    public final Exception LIZIZ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIGCArchWorkflowGeneralInvocationResult(result=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", error=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C542800LQo(T t, Exception exc) {
        this.LIZ = t;
        this.LIZIZ = exc;
    }
}
