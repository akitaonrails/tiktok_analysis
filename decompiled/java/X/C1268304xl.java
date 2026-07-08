package X;

/* JADX INFO: renamed from: X.04xl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1268304xl implements C06W3 {
    public final boolean LIZ;
    public final boolean LIZIZ;

    public C1268304xl() {
        this(true, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1268304xl)) {
            return false;
        }
        C1268304xl c1268304xl = (C1268304xl) obj;
        return this.LIZ == c1268304xl.LIZ && this.LIZIZ == c1268304xl.LIZIZ;
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InitHookConfig(enableInitHook=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", mDisableOptimizeViewHierarchy=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1268304xl(boolean z, boolean z2) {
        this.LIZ = z;
        this.LIZIZ = z2;
    }
}
