package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EQM, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EQM {
    public final C0EQL LIZ;
    public final C05WK LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0EQM)) {
            return false;
        }
        C0EQM c0eqm = (C0EQM) obj;
        return Intrinsics.LJFF(this.LIZ, c0eqm.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0eqm.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LyricAppliedSource(miniDraftConfig=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", downloadResult=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0EQM(C0EQL c0eql, C05WK c05wk) {
        this.LIZ = c0eql;
        this.LIZIZ = c05wk;
    }
}
