package X;

/* JADX INFO: renamed from: X.0Lmz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C553310Lmz {
    public final boolean LIZ;
    public final boolean LIZIZ;

    public C553310Lmz() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C553310Lmz)) {
            return false;
        }
        C553310Lmz c553310Lmz = (C553310Lmz) obj;
        return this.LIZ == c553310Lmz.LIZ && this.LIZIZ == c553310Lmz.LIZIZ;
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("WorkflowAutoLifecyclePolicy(restoreOnFirstObserver=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", resumeOnFirstObserver=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C553310Lmz(int i) {
        this(false, true);
    }

    public C553310Lmz(boolean z, boolean z2) {
        this.LIZ = z;
        this.LIZIZ = z2;
    }
}
