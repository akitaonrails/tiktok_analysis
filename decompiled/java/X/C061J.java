package X;

/* JADX INFO: renamed from: X.061J, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C061J implements InterfaceC111300bX {
    public final EnumC904370Zdr LL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C061J) && this.LL == ((C061J) obj).LL;
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MediaGridContentHierarchyData(mediaGridType=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C061J(EnumC904370Zdr enumC904370Zdr) {
        this.LL = enumC904370Zdr;
    }
}
