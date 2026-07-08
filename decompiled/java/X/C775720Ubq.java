package X;

/* JADX INFO: renamed from: X.0Ubq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C775720Ubq implements InterfaceC775640Ubi {
    public final boolean LIZ;
    public final boolean LIZIZ;

    public C775720Ubq() {
        this(false, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C775720Ubq)) {
            return false;
        }
        C775720Ubq c775720Ubq = (C775720Ubq) obj;
        return this.LIZ == c775720Ubq.LIZ && this.LIZIZ == c775720Ubq.LIZIZ;
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StableModeUIState(switchOpened=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isFirstShow=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C775720Ubq(boolean z, boolean z2) {
        this.LIZ = z;
        this.LIZIZ = z2;
    }
}
