package X;

/* JADX INFO: renamed from: X.0e2K, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1073300e2K implements InterfaceC995310c0X {
    public final EnumC1073320e2M LIZ;
    public final boolean LIZIZ;

    public C1073300e2K() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1073300e2K)) {
            return false;
        }
        C1073300e2K c1073300e2K = (C1073300e2K) obj;
        return this.LIZ == c1073300e2K.LIZ && this.LIZIZ == c1073300e2K.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AuthFrequencyCheckContext(triggerScene=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", onlyCheck=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1073300e2K(int i) {
        this(EnumC1073320e2M.UNKNOWN, false);
    }

    public C1073300e2K(EnumC1073320e2M enumC1073320e2M, boolean z) {
        this.LIZ = enumC1073320e2M;
        this.LIZIZ = z;
    }
}
