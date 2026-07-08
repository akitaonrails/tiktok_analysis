package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0czo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1033300czo extends AbstractC1033200cze {
    public final Throwable LIZ;

    @Override // X.AbstractC1033200cze
    public final int LIZ() {
        return 1;
    }

    @Override // X.AbstractC1033200cze
    public final String LIZIZ() {
        return "throwableFailure";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1033300czo) && Intrinsics.LJFF(this.LIZ, ((C1033300czo) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ThrowableFailure(throwable=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1033300czo(Throwable th) {
        this.LIZ = th;
    }
}
