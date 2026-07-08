package X;

/* JADX INFO: renamed from: X.08lx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2214308lx {
    public final String LIZ;

    public C2214308lx(String str) {
        String strLIZ = C2214408ly.LIZ(str);
        this.LIZ = strLIZ != null ? strLIZ : str;
    }

    public C2214308lx(String str, String str2) {
        String strLIZ = C2214408ly.LIZ(str);
        if (strLIZ != null) {
            this.LIZ = new C0VSJ(strLIZ, str2).getPath();
        } else {
            this.LIZ = new C0VSJ(str, str2).getPath();
        }
    }
}
