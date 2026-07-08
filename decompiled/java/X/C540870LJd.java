package X;

/* JADX INFO: renamed from: X.0LJd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C540870LJd extends AbstractC540910LJh {
    public final int LIZ;
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C540870LJd)) {
            return false;
        }
        C540870LJd c540870LJd = (C540870LJd) obj;
        return this.LIZ == c540870LJd.LIZ && this.LIZIZ == c540870LJd.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PageSelectedData(position=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", shouldVibrate=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C540870LJd(int i, boolean z) {
        this.LIZ = i;
        this.LIZIZ = z;
    }
}
