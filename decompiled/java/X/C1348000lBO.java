package X;

/* JADX INFO: renamed from: X.0lBO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1348000lBO {
    public final boolean LIZ;
    public final boolean LIZIZ;

    public C1348000lBO() {
        this(false, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1348000lBO)) {
            return false;
        }
        C1348000lBO c1348000lBO = (C1348000lBO) obj;
        return this.LIZ == c1348000lBO.LIZ && this.LIZIZ == c1348000lBO.LIZIZ;
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PlusStatus(isVisible=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isKeyboardIcon=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1348000lBO(boolean z, boolean z2) {
        this.LIZ = z;
        this.LIZIZ = z2;
    }
}
