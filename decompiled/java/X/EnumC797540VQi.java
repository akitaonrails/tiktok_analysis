package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0VQi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class EnumC797540VQi {
    public static final EnumC797540VQi COLUMN_CREATED_TIME;
    public static final EnumC797540VQi COLUMN_RELATION_TYPE;
    public static final EnumC797540VQi COLUMN_SEC_UID;
    public static final /* synthetic */ EnumC797540VQi[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public final String key;
    public final String type;

    public static InterfaceC2044707zh<EnumC797540VQi> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC797540VQi enumC797540VQi = new EnumC797540VQi("COLUMN_SEC_UID", 0, "SEC_UID", "TEXT PRIMARY KEY NOT NULL");
        COLUMN_SEC_UID = enumC797540VQi;
        EnumC797540VQi enumC797540VQi2 = new EnumC797540VQi("COLUMN_RELATION_TYPE", 1, "RELATION_TYPE", "INTEGER NOT NULL");
        COLUMN_RELATION_TYPE = enumC797540VQi2;
        EnumC797540VQi enumC797540VQi3 = new EnumC797540VQi("COLUMN_CREATED_TIME", 2, "CREATED_TIME", "INTEGER NOT NULL");
        COLUMN_CREATED_TIME = enumC797540VQi3;
        EnumC797540VQi[] enumC797540VQiArr = {enumC797540VQi, enumC797540VQi2, enumC797540VQi3};
        LL = enumC797540VQiArr;
        LLILLJJLI = new C2254308sP(enumC797540VQiArr);
    }

    public static EnumC797540VQi[] values() {
        return (EnumC797540VQi[]) LL.clone();
    }

    public static EnumC797540VQi valueOf(String str) {
        return (EnumC797540VQi) C08FF.LIZ(EnumC797540VQi.class, str);
    }

    public EnumC797540VQi(String str, int i, String str2, String str3) {
        this.key = str2;
        this.type = str3;
    }
}
