package X;

/* JADX INFO: renamed from: X.0QnJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C680910QnJ implements C06W4 {
    public final boolean LIZ;

    public C680910QnJ() {
        this(false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C680910QnJ) && this.LIZ == ((C680910QnJ) obj).LIZ;
    }

    public final int hashCode() {
        return C786410Ut5.Z2(this.LIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AudioConfigAgent(disable=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C680910QnJ(boolean z) {
        this.LIZ = z;
    }
}
