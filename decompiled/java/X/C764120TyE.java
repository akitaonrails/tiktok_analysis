package X;

/* JADX INFO: renamed from: X.0TyE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C764120TyE extends C764750TzF {
    public final boolean LIZ;

    public C764120TyE() {
        this(false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C764120TyE) && this.LIZ == ((C764120TyE) obj).LIZ;
    }

    public final int hashCode() {
        return C786410Ut5.Z2(this.LIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BackToPreviousSceneAction(forceCloseContainer=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C764120TyE(boolean z) {
        this.LIZ = z;
    }
}
