package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00no, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC187400no {
    public static final /* synthetic */ EnumC187400no[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC187400no TOP_BUYER;
    public static final EnumC187400no TOP_VIEWER;
    public final int LL;
    public final String LLILLJJLI;

    public static InterfaceC2044707zh<EnumC187400no> getEntries() {
        return LLILZ;
    }

    static {
        EnumC187400no enumC187400no = new EnumC187400no("TOP_VIEWER", 0, 1, "top_viewers");
        TOP_VIEWER = enumC187400no;
        EnumC187400no enumC187400no2 = new EnumC187400no("TOP_BUYER", 1, 2, "top_buyers");
        TOP_BUYER = enumC187400no2;
        EnumC187400no[] enumC187400noArr = {enumC187400no, enumC187400no2};
        LLILLL = enumC187400noArr;
        LLILZ = new C2254308sP(enumC187400noArr);
    }

    public static EnumC187400no[] values() {
        return (EnumC187400no[]) LLILLL.clone();
    }

    public final String getRankingName() {
        return this.LLILLJJLI;
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC187400no valueOf(String str) {
        return (EnumC187400no) C08FF.LIZ(EnumC187400no.class, str);
    }

    public EnumC187400no(String str, int i, int i2, String str2) {
        this.LL = i2;
        this.LLILLJJLI = str2;
    }
}
