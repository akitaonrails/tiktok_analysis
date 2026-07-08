package X;

/* JADX INFO: renamed from: X.0Ube, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C775600Ube implements InterfaceC775640Ubi {
    public final boolean LIZ;
    public final boolean LIZIZ;

    public C775600Ube() {
        this(false, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C775600Ube)) {
            return false;
        }
        C775600Ube c775600Ube = (C775600Ube) obj;
        return this.LIZ == c775600Ube.LIZ && this.LIZIZ == c775600Ube.LIZIZ;
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NoiseUIState(switchOpened=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", backgroundDetectEnable=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C775600Ube(boolean z, boolean z2) {
        this.LIZ = z;
        this.LIZIZ = z2;
    }

    public static C775600Ube LIZ(C775600Ube c775600Ube, boolean z, int i) {
        boolean z2;
        if ((i & 1) != 0) {
            z = c775600Ube.LIZ;
        }
        if ((i & 2) != 0) {
            z2 = c775600Ube.LIZIZ;
        } else {
            z2 = false;
        }
        c775600Ube.getClass();
        return new C775600Ube(z, z2);
    }
}
