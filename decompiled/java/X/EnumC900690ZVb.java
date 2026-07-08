package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ZVb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC900690ZVb {
    public static final /* synthetic */ EnumC900690ZVb[] LL;

    static {
        EnumC900690ZVb[] enumC900690ZVbArr = {new EnumC900690ZVb("COLUMN_BUSINESS_TYPE", 0, "business_type", "INTEGER"), new EnumC900690ZVb("COLUMN_BUSINESS_ID", 1, "business_id", "TEXT"), new EnumC900690ZVb("COLUMN_CONTENT_TYPE", 2, "content_type", "INTEGER"), new EnumC900690ZVb("COLUMN_SEARCH_CONTENT", 3, "search_content", "TEXT"), new EnumC900690ZVb("COLUMN_UPDATE_TIME", 4, "update_time", "INTEGER"), new EnumC900690ZVb("COLUMN_GROUPING_TYPE", 5, "grouping_type", "INTEGER"), new EnumC900690ZVb("COLUMN_GROUPING_ID", 6, "grouping_id", "TEXT"), new EnumC900690ZVb("COLUMN_FILTER", 7, "filter", "TEXT"), new EnumC900690ZVb("COLUMN_EXT", 8, "ext", "TEXT")};
        LL = enumC900690ZVbArr;
        new C2254308sP(enumC900690ZVbArr);
    }

    public static EnumC900690ZVb[] values() {
        return (EnumC900690ZVb[]) LL.clone();
    }

    public static EnumC900690ZVb valueOf(String str) {
        return (EnumC900690ZVb) C08FF.LIZ(EnumC900690ZVb.class, str);
    }

    public EnumC900690ZVb(String str, int i, String str2, String str3) {
    }
}
