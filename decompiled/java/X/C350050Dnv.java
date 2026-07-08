package X;

/* JADX INFO: renamed from: X.0Dnv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C350050Dnv {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isChange=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isSubVideoTrackChanged=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", recordAudioChangedForCompile=");
        sbLIZ.append(this.LIZLLL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C350050Dnv(boolean z, boolean z2, boolean z3, boolean z4) {
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = z3;
        this.LIZLLL = z4;
    }

    public static C350050Dnv LIZ(C350050Dnv c350050Dnv, boolean z, boolean z2, boolean z3, int i) {
        boolean z4;
        if ((i & 1) != 0) {
            z = c350050Dnv.LIZ;
        }
        if ((i & 2) != 0) {
            z2 = c350050Dnv.LIZIZ;
        }
        if ((i & 4) != 0) {
            z3 = c350050Dnv.LIZJ;
        }
        if ((i & 8) != 0) {
            z4 = c350050Dnv.LIZLLL;
        } else {
            z4 = false;
        }
        return new C350050Dnv(z, z2, z3, z4);
    }
}
