package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hqo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1219920hqo extends AbstractC1588120rQg {
    public final int LJI;
    public final EnumC1586890rOh LJII;
    public final String LJIIIIZZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1219920hqo)) {
            return false;
        }
        C1219920hqo c1219920hqo = (C1219920hqo) obj;
        return this.LJI == c1219920hqo.LJI && this.LJII == c1219920hqo.LJII && Intrinsics.LJFF(this.LJIIIIZZ, c1219920hqo.LJIIIIZZ);
    }

    public final int hashCode() {
        return (((this.LJI * 31) + this.LJII.hashCode()) * 31) + this.LJIIIIZZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LoadMorePagination(orderType=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", feedSource=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", loadMorePageToken=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1588120rQg
    public final EnumC1586890rOh LIZ() {
        return this.LJII;
    }

    @Override // X.AbstractC1588120rQg
    public final int LIZJ() {
        return this.LJI;
    }

    public C1219920hqo(int i, EnumC1586890rOh enumC1586890rOh, String str) {
        super(2, i, null, enumC1586890rOh, str, null, 36);
        this.LJI = i;
        this.LJII = enumC1586890rOh;
        this.LJIIIIZZ = str;
    }
}
