package X;

/* JADX INFO: renamed from: X.0YBB, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YBB extends C0YBA {
    public final EnumC870230YBx LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0YBB) && this.LIZIZ == ((C0YBB) obj).LIZIZ;
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Equals(type=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0YBB(EnumC870230YBx enumC870230YBx) {
        this.LIZIZ = enumC870230YBx;
    }
}
