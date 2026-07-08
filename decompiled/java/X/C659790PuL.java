package X;

/* JADX INFO: renamed from: X.0PuL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C659790PuL implements InterfaceC111300bX {
    public final boolean LL;

    public C659790PuL() {
        this(false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C659790PuL) && this.LL == ((C659790PuL) obj).LL;
    }

    public final int hashCode() {
        return C786410Ut5.Z2(this.LL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchCardRootHierarchyData(isVisualSearchScene=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C659790PuL(boolean z) {
        this.LL = z;
    }
}
