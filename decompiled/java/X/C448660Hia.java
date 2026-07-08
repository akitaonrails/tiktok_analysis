package X;

/* JADX INFO: renamed from: X.0Hia, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C448660Hia {
    public static final /* synthetic */ int LIZJ = 0;
    public final boolean LIZ;
    public final boolean LIZIZ;

    public /* synthetic */ C448660Hia() {
        this(true, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C448660Hia)) {
            return false;
        }
        C448660Hia c448660Hia = (C448660Hia) obj;
        return this.LIZ == c448660Hia.LIZ && this.LIZIZ == c448660Hia.LIZIZ;
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("QRCodeOpenResult(handled=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", keepScanMode=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C448660Hia(boolean z, boolean z2) {
        this.LIZ = z;
        this.LIZIZ = z2;
    }
}
