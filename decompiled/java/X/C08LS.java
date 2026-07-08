package X;

/* JADX INFO: renamed from: X.08LS, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08LS implements C08LR {
    public final float LIZ = 1218.47f;
    public final float LIZIZ = 55.85f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C08LS)) {
            return false;
        }
        C08LS c08ls = (C08LS) obj;
        return Float.compare(this.LIZ, c08ls.LIZ) == 0 && Float.compare(this.LIZIZ, c08ls.LIZIZ) == 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SpringParam(stiffness=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", damping=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.LIZ) * 31) + Float.floatToIntBits(this.LIZIZ);
    }
}
