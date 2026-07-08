package X;

/* JADX INFO: renamed from: X.0KhK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C524320KhK implements InterfaceC524330KhL {
    public final int LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C524320KhK) && this.LIZ == ((C524320KhK) obj).LIZ;
    }

    @Override // X.InterfaceC524330KhL
    public final String getKey() {
        return "launch_intent_for_result";
    }

    public final int hashCode() {
        return this.LIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ForResult(requestCode=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C524320KhK(int i) {
        this.LIZ = i;
    }
}
