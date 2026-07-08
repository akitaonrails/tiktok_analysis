package X;

/* JADX INFO: renamed from: X.0oeW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1481380oeW {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ThreadPoolInfo{idle=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", working=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", blocked=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append("}");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1481380oeW(int i, int i2, int i3) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
    }
}
