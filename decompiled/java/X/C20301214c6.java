package X;

/* JADX INFO: renamed from: X.14c6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20301214c6 {
    public final String LIZ;
    public final String LIZIZ;
    public final EnumC19357510oH LIZJ;
    public final C20301714cB LIZLLL;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StoreRegionInfo(storeIdc=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", storeRegion=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", storeSourceType=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", extra=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C20301214c6(String str, String str2, EnumC19357510oH enumC19357510oH, C20301714cB c20301714cB) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = enumC19357510oH;
        this.LIZLLL = c20301714cB;
    }
}
