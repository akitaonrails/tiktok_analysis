package X;

/* JADX INFO: renamed from: X.0wM8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1777500wM8 extends AbstractC1777520wMA {
    public final EnumC1778350wNV LIZ;

    public C1777500wM8() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1777500wM8) && this.LIZ == ((C1777500wM8) obj).LIZ;
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OpenIndustryStatusCheckPage(toast=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1777500wM8(int i) {
        this(EnumC1778350wNV.NONE);
    }

    public C1777500wM8(EnumC1778350wNV enumC1778350wNV) {
        this.LIZ = enumC1778350wNV;
    }
}
