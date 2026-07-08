package X;

/* JADX INFO: renamed from: X.03lS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C937203lS {
    public final int LIZ;
    public final boolean LIZIZ;

    public C937203lS() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C937203lS)) {
            return false;
        }
        C937203lS c937203lS = (C937203lS) obj;
        return this.LIZ == c937203lS.LIZ && this.LIZIZ == c937203lS.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("QuantityInfo(quantity=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isRestore=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C937203lS(int i) {
        this(1, false);
    }

    public C937203lS(int i, boolean z) {
        this.LIZ = i;
        this.LIZIZ = z;
    }
}
