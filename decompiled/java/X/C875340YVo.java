package X;

/* JADX INFO: renamed from: X.0YVo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public class C875340YVo implements InterfaceC875360YVq {
    public static final String[] LIZIZ = {"", "-journal", "-wal", ".sm", ".bak", "-vfslog", "-vfslo1"};
    public final C0YEM LIZ;

    public C875340YVo(C0YEM c0yem) {
        this.LIZ = c0yem;
    }

    public final void LIZIZ(String str) {
        if (str != null && !str.equalsIgnoreCase(":memory:") && str.trim().length() != 0) {
            C868780Y6i c868780Y6iLIZLLL = this.LIZ.LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("WCDB.DefaultDatabaseErrorHandler Remove database file: ");
            sbLIZ.append(str);
            c868780Y6iLIZLLL.LJI(C2188811AlT.LIZIZ(sbLIZ));
            C0VSJ c0vsj = new C0VSJ(str);
            C0VSJ c0vsj2 = new C0VSJ(c0vsj.getParentFile(), "corrupted");
            if (!c0vsj2.mkdirs()) {
                this.LIZ.LIZLLL().LJI("WCDB.DefaultDatabaseErrorHandler Could not create directory for corrupted database. Corruption backup may be unavailable.");
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(c0vsj2.getPath());
            sbLIZ2.append("/");
            sbLIZ2.append(c0vsj.getName());
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            for (String str2 : LIZIZ) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(str);
                sbLIZ3.append(str2);
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append(strLIZIZ);
                sbLIZ4.append(str2);
                String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ4);
                C0VSJ c0vsj3 = new C0VSJ(strLIZIZ2);
                if (!c0vsj3.renameTo(new C0VSJ(strLIZIZ3))) {
                    c0vsj3.delete();
                }
            }
        }
    }
}
