package X;

/* JADX INFO: renamed from: X.0T8M, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0T8M {
    public final int LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0T8M) && this.LIZ == ((C0T8M) obj).LIZ;
    }

    public final int hashCode() {
        return this.LIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoShareCloseButtonPositionEvent(screenY=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0T8M(int i) {
        this.LIZ = i;
    }
}
