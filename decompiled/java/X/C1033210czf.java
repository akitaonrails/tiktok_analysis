package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0czf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1033210czf extends AbstractC1033200cze {
    public final int LIZ;
    public final String LIZIZ;

    @Override // X.AbstractC1033200cze
    public final int LIZ() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1033210czf)) {
            return false;
        }
        C1033210czf c1033210czf = (C1033210czf) obj;
        return this.LIZ == c1033210czf.LIZ && Intrinsics.LJFF(this.LIZIZ, c1033210czf.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Server(code=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", message=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1033200cze
    public final String LIZIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZ);
        sbLIZ.append('-');
        sbLIZ.append(this.LIZIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1033210czf(int i, String str) {
        this.LIZ = i;
        this.LIZIZ = str;
    }
}
