package X;

/* JADX INFO: renamed from: X.0gAy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1155540gAy implements InterfaceC0148002o {
    public final boolean LL;

    public C1155540gAy() {
        this(false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1155540gAy) && this.LL == ((C1155540gAy) obj).LL;
    }

    public final int hashCode() {
        return C786410Ut5.Z2(this.LL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiCollectState(isCollected=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1155540gAy(boolean z) {
        this.LL = z;
    }
}
