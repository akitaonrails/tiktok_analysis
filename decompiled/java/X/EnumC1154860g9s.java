package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0g9s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1154860g9s {
    public static final EnumC1154860g9s ENTRANCE;
    public static final EnumC1154860g9s LIST_FIRST_LEVEL_TAB;
    public static final EnumC1154860g9s LIST_HISTORICAL_RANKING_ENTRANCE;
    public static final EnumC1154860g9s LIST_SECOND_LEVEL_TAB;
    public static final /* synthetic */ EnumC1154860g9s[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1154860g9s UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1154860g9s> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1154860g9s enumC1154860g9s = new EnumC1154860g9s("UNKNOWN", 0, -1);
        UNKNOWN = enumC1154860g9s;
        EnumC1154860g9s enumC1154860g9s2 = new EnumC1154860g9s("ENTRANCE", 1, 1);
        ENTRANCE = enumC1154860g9s2;
        EnumC1154860g9s enumC1154860g9s3 = new EnumC1154860g9s("LIST_FIRST_LEVEL_TAB", 2, 2);
        LIST_FIRST_LEVEL_TAB = enumC1154860g9s3;
        EnumC1154860g9s enumC1154860g9s4 = new EnumC1154860g9s("LIST_SECOND_LEVEL_TAB", 3, 3);
        LIST_SECOND_LEVEL_TAB = enumC1154860g9s4;
        EnumC1154860g9s enumC1154860g9s5 = new EnumC1154860g9s("LIST_HISTORICAL_RANKING_ENTRANCE", 4, 4);
        LIST_HISTORICAL_RANKING_ENTRANCE = enumC1154860g9s5;
        EnumC1154860g9s[] enumC1154860g9sArr = {enumC1154860g9s, enumC1154860g9s2, enumC1154860g9s3, enumC1154860g9s4, enumC1154860g9s5};
        LLILLJJLI = enumC1154860g9sArr;
        LLILLL = new C2254308sP(enumC1154860g9sArr);
    }

    public static EnumC1154860g9s[] values() {
        return (EnumC1154860g9s[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC1154860g9s valueOf(String str) {
        return (EnumC1154860g9s) C08FF.LIZ(EnumC1154860g9s.class, str);
    }

    public EnumC1154860g9s(String str, int i, int i2) {
        this.LL = i2;
    }
}
