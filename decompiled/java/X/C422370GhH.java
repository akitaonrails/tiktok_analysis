package X;

/* JADX INFO: renamed from: X.0GhH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C422370GhH implements InterfaceC422390GhJ {
    public final float LIZ;

    public C422370GhH() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C422370GhH) && Float.compare(this.LIZ, ((C422370GhH) obj).LIZ) == 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Tail(scale=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.LIZ);
    }

    public C422370GhH(float f) {
        this.LIZ = f;
    }

    public /* synthetic */ C422370GhH(int i) {
        this(1.0f);
    }
}
