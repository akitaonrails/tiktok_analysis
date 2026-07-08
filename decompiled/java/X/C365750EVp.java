package X;

/* JADX INFO: renamed from: X.0EVp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C365750EVp {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;

    public C365750EVp() {
        this(7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C365750EVp)) {
            return false;
        }
        C365750EVp c365750EVp = (C365750EVp) obj;
        return this.LIZ == c365750EVp.LIZ && this.LIZIZ == c365750EVp.LIZIZ && this.LIZJ == c365750EVp.LIZJ;
    }

    public final int hashCode() {
        return (((C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Z2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RetouchResFetchConfig(needFetchAlgModel=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", needFetchBeautyList=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", needFetchAutoRetouch=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C365750EVp(int i) {
        boolean z;
        boolean z2;
        if ((i & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z3 = (i & 4) != 0;
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = z3;
    }
}
