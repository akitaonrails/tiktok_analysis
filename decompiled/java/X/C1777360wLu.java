package X;

/* JADX INFO: renamed from: X.0wLu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1777360wLu extends AbstractC1777330wLr {
    public final EnumC1813200xHi LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1777360wLu) && this.LIZ == ((C1777360wLu) obj).LIZ;
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FetchAutoPostList(autoPostType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1777360wLu(EnumC1813200xHi enumC1813200xHi) {
        this.LIZ = enumC1813200xHi;
    }
}
