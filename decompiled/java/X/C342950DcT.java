package X;

/* JADX INFO: renamed from: X.0DcT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C342950DcT {
    public final boolean LIZ;
    public final EnumC342940DcS LIZIZ;

    public C342950DcT() {
        this(3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C342950DcT)) {
            return false;
        }
        C342950DcT c342950DcT = (C342950DcT) obj;
        return this.LIZ == c342950DcT.LIZ && this.LIZIZ == c342950DcT.LIZIZ;
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.LIZ) * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LoadingUiState(visible=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", status=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C342950DcT(int i) {
        EnumC342940DcS enumC342940DcS;
        if ((i & 2) != 0) {
            enumC342940DcS = EnumC342940DcS.LOADING;
        } else {
            enumC342940DcS = null;
        }
        this(false, enumC342940DcS);
    }

    public C342950DcT(boolean z, EnumC342940DcS enumC342940DcS) {
        this.LIZ = z;
        this.LIZIZ = enumC342940DcS;
    }
}
