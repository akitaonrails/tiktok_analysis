package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bx3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC993150bx3 {
    public static final EnumC993150bx3 CONFLICT_TYPE;
    public static final EnumC993150bx3 FEED_DEFICIENCY;
    public static final EnumC993150bx3 INVALID_FEED_LIST_ID;
    public static final EnumC993150bx3 INVALID_ITEM_ID;
    public static final EnumC993150bx3 INVALID_ITEM_TYPE;
    public static final EnumC993150bx3 INVALID_LYNX_SCHEMA;
    public static final EnumC993150bx3 INVALID_SECTION_ID;
    public static final /* synthetic */ EnumC993150bx3[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC993150bx3 NO_MATCH_ITEM_TYPE;
    public final int LL;
    public final String LLILLJJLI;

    public static InterfaceC2044707zh<EnumC993150bx3> getEntries() {
        return LLILZ;
    }

    static {
        EnumC993150bx3 enumC993150bx3 = new EnumC993150bx3("INVALID_ITEM_ID", 0, 0, "Invalid item id");
        INVALID_ITEM_ID = enumC993150bx3;
        EnumC993150bx3 enumC993150bx32 = new EnumC993150bx3("INVALID_ITEM_TYPE", 1, 1, "Invalid item type");
        INVALID_ITEM_TYPE = enumC993150bx32;
        EnumC993150bx3 enumC993150bx33 = new EnumC993150bx3("INVALID_SECTION_ID", 2, 2, "Invalid section id");
        INVALID_SECTION_ID = enumC993150bx33;
        EnumC993150bx3 enumC993150bx34 = new EnumC993150bx3("INVALID_LYNX_SCHEMA", 3, 3, "Invalid lynx schema");
        INVALID_LYNX_SCHEMA = enumC993150bx34;
        EnumC993150bx3 enumC993150bx35 = new EnumC993150bx3("NO_MATCH_ITEM_TYPE", 4, 4, "No match item type");
        NO_MATCH_ITEM_TYPE = enumC993150bx35;
        EnumC993150bx3 enumC993150bx36 = new EnumC993150bx3("CONFLICT_TYPE", 5, 5, "Conflict type");
        CONFLICT_TYPE = enumC993150bx36;
        EnumC993150bx3 enumC993150bx37 = new EnumC993150bx3("FEED_DEFICIENCY", 6, 6, "Feed data is less than 10");
        FEED_DEFICIENCY = enumC993150bx37;
        EnumC993150bx3 enumC993150bx38 = new EnumC993150bx3("INVALID_FEED_LIST_ID", 7, 7, "Invalid feed list id");
        INVALID_FEED_LIST_ID = enumC993150bx38;
        EnumC993150bx3[] enumC993150bx3Arr = {enumC993150bx3, enumC993150bx32, enumC993150bx33, enumC993150bx34, enumC993150bx35, enumC993150bx36, enumC993150bx37, enumC993150bx38};
        LLILLL = enumC993150bx3Arr;
        LLILZ = new C2254308sP(enumC993150bx3Arr);
    }

    public static EnumC993150bx3[] values() {
        return (EnumC993150bx3[]) LLILLL.clone();
    }

    public final int getCode() {
        return this.LL;
    }

    public final String getMessage() {
        return this.LLILLJJLI;
    }

    public static EnumC993150bx3 valueOf(String str) {
        return (EnumC993150bx3) C08FF.LIZ(EnumC993150bx3.class, str);
    }

    public EnumC993150bx3(String str, int i, int i2, String str2) {
        this.LL = i2;
        this.LLILLJJLI = str2;
    }
}
