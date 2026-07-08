package X;

/* JADX INFO: renamed from: X.0VQg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C797520VQg {
    public static final /* synthetic */ C797520VQg LIZ = new C797520VQg();
    public static final String LIZIZ;
    public static final String LIZJ;
    public static final String LIZLLL;
    public static final String LJ;

    static {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("create table if not exists RECENT_SHARE (");
        EnumC797530VQh enumC797530VQh = EnumC797530VQh.COLUMN_ID;
        sbLIZ.append(enumC797530VQh.key);
        sbLIZ.append(' ');
        sbLIZ.append(enumC797530VQh.type);
        sbLIZ.append(',');
        EnumC797530VQh enumC797530VQh2 = EnumC797530VQh.COLUMN_SHARE_TIME;
        sbLIZ.append(enumC797530VQh2.key);
        sbLIZ.append(' ');
        sbLIZ.append(enumC797530VQh2.type);
        sbLIZ.append(");");
        LIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("create table if not exists RECENT_SHARE (");
        sbLIZ2.append(enumC797530VQh.key);
        sbLIZ2.append(' ');
        sbLIZ2.append(enumC797530VQh.type);
        sbLIZ2.append(',');
        sbLIZ2.append(enumC797530VQh2.key);
        sbLIZ2.append(' ');
        sbLIZ2.append(enumC797530VQh2.type);
        sbLIZ2.append(',');
        EnumC797530VQh enumC797530VQh3 = EnumC797530VQh.COLUMN_SEND_TIME;
        sbLIZ2.append(enumC797530VQh3.key);
        sbLIZ2.append(' ');
        sbLIZ2.append(enumC797530VQh3.type);
        sbLIZ2.append(',');
        EnumC797530VQh enumC797530VQh4 = EnumC797530VQh.COLUMN_CURR_UID;
        sbLIZ2.append(enumC797530VQh4.key);
        sbLIZ2.append(' ');
        sbLIZ2.append(enumC797530VQh4.type);
        sbLIZ2.append(",PRIMARY KEY(");
        sbLIZ2.append(enumC797530VQh.key);
        sbLIZ2.append(", ");
        sbLIZ2.append(enumC797530VQh4.key);
        sbLIZ2.append("));");
        LIZJ = C2188811AlT.LIZIZ(sbLIZ2);
        LIZLLL = "DROP TABLE IF EXISTS RECENT_SHARE";
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("ALTER table RECENT_SHARE ADD column ");
        EnumC797530VQh enumC797530VQh5 = EnumC797530VQh.COLUMN_SHARE_TYPE;
        sbLIZ3.append(enumC797530VQh5.key);
        sbLIZ3.append(' ');
        sbLIZ3.append(enumC797530VQh5.type);
        sbLIZ3.append(';');
        LJ = C2188811AlT.LIZIZ(sbLIZ3);
    }
}
