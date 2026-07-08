package X;

/* JADX INFO: renamed from: X.0ZL7, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZL7 implements C0ZLF {
    public final boolean LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0ZL7) && this.LIZ == ((C0ZL7) obj).LIZ;
    }

    public final int hashCode() {
        return C786410Ut5.Z2(this.LIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Enable(socialAvatar=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0ZL7(boolean z) {
        this.LIZ = z;
    }
}
