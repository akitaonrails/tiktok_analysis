package X;

/* JADX INFO: renamed from: X.0hRa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1204280hRa implements InterfaceC111300bX {
    public final EnumC1204230hRV LL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1204280hRa) && this.LL == ((C1204280hRa) obj).LL;
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StatusHierarchyData(type=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1204280hRa(EnumC1204230hRV enumC1204230hRV) {
        this.LL = enumC1204230hRV;
    }
}
