package X;

/* JADX INFO: renamed from: X.0tgH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1674670tgH implements InterfaceC1674710tgL {
    public final EnumC1674690tgJ LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1674670tgH) && this.LIZ == ((C1674670tgH) obj).LIZ;
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CreateOrUpdateCollectionFailed(type=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1674670tgH(EnumC1674690tgJ enumC1674690tgJ) {
        this.LIZ = enumC1674690tgJ;
    }
}
