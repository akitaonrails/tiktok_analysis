package X;

/* JADX INFO: renamed from: X.08Fo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2087008Fo {
    public final int LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2087008Fo)) {
            return false;
        }
        C2087008Fo c2087008Fo = (C2087008Fo) obj;
        return this.LIZ == c2087008Fo.LIZ && this.LIZIZ == c2087008Fo.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AssetCountStat(globalAssetCount=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", globalAssetManagerCount=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2087008Fo(int i, int i2) {
        this.LIZ = i;
        this.LIZIZ = i2;
    }
}
