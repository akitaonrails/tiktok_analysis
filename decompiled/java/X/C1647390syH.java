package X;

/* JADX INFO: renamed from: X.0syH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1647390syH {
    public final Object LIZ;
    public final Object LIZIZ;
    public final int LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final Object LJI;
    public final boolean LJII;
    public final boolean LJIIIIZZ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BottomTabIndexChangeEvent{fromTag=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", toTag=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1647390syH(Object obj, Object obj2, int i, boolean z, boolean z2, boolean z3, Object obj3, boolean z4, boolean z5, int i2) {
        z = (i2 & 8) != 0 ? true : z;
        z2 = (i2 & 16) != 0 ? true : z2;
        z3 = (i2 & 32) != 0 ? false : z3;
        obj3 = (i2 & 64) != 0 ? obj2 : obj3;
        z4 = (i2 & 128) != 0 ? false : z4;
        z5 = (i2 & 256) != 0 ? false : z5;
        this.LIZ = obj;
        this.LIZIZ = obj2;
        this.LIZJ = i;
        this.LIZLLL = z;
        this.LJ = z2;
        this.LJFF = z3;
        this.LJI = obj3;
        this.LJII = z4;
        this.LJIIIIZZ = z5;
    }
}
