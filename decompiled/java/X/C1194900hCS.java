package X;

/* JADX INFO: renamed from: X.0hCS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1194900hCS {
    public final EnumC1195650hDf LIZ;
    public final EnumC1175460gh6 LIZIZ;
    public final EnumC1195670hDh LIZJ;

    public C1194900hCS() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1194900hCS)) {
            return false;
        }
        C1194900hCS c1194900hCS = (C1194900hCS) obj;
        return this.LIZ == c1194900hCS.LIZ && this.LIZIZ == c1194900hCS.LIZIZ && this.LIZJ == c1194900hCS.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LsChipStyle(size=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", variant=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", appearance=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1194900hCS(int i) {
        this(EnumC1195650hDf.MEDIUM, EnumC1175460gh6.CAPSULE, EnumC1195670hDh.STROKED);
    }

    public C1194900hCS(EnumC1195650hDf enumC1195650hDf, EnumC1175460gh6 enumC1175460gh6, EnumC1195670hDh enumC1195670hDh) {
        this.LIZ = enumC1195650hDf;
        this.LIZIZ = enumC1175460gh6;
        this.LIZJ = enumC1195670hDh;
    }
}
