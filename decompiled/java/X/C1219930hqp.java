package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hqp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1219930hqp extends AbstractC1588120rQg {
    public final int LJI;
    public final int LJII;
    public final EnumC1586890rOh LJIIIIZZ;
    public final String LJIIIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1219930hqp)) {
            return false;
        }
        C1219930hqp c1219930hqp = (C1219930hqp) obj;
        return this.LJI == c1219930hqp.LJI && this.LJII == c1219930hqp.LJII && this.LJIIIIZZ == c1219930hqp.LJIIIIZZ && Intrinsics.LJFF(this.LJIIIZ, c1219930hqp.LJIIIZ);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LJI * 31) + this.LJII) * 31) + this.LJIIIIZZ.hashCode()) * 31;
        String str = this.LJIIIZ;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RefreshPagination(orderType=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", landingStrategyType=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", feedSource=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", recRefreshPageToken=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1588120rQg
    public final Integer LIZIZ() {
        return Integer.valueOf(this.LJII);
    }

    @Override // X.AbstractC1588120rQg
    public final EnumC1586890rOh LIZ() {
        return this.LJIIIIZZ;
    }

    @Override // X.AbstractC1588120rQg
    public final int LIZJ() {
        return this.LJI;
    }

    public /* synthetic */ C1219930hqp(int i, EnumC1586890rOh enumC1586890rOh) {
        this(1, i, enumC1586890rOh, null);
    }

    public C1219930hqp(int i, int i2, EnumC1586890rOh enumC1586890rOh, String str) {
        super(1, i, Integer.valueOf(i2), enumC1586890rOh, str, null, 32);
        this.LJI = i;
        this.LJII = i2;
        this.LJIIIIZZ = enumC1586890rOh;
        this.LJIIIZ = str;
    }
}
