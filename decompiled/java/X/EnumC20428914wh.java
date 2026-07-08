package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.14wh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class EnumC20428914wh {
    public static final EnumC20428914wh BLUE;
    public static final EnumC20428914wh BROWN;
    public static final EnumC20428914wh DARK_BLUE;
    public static final EnumC20428914wh DARK_BROWN;
    public static final EnumC20428914wh DARK_GRAY;
    public static final EnumC20428914wh DARK_GREEN;
    public static final EnumC20428914wh DARK_PURPLE;
    public static final EnumC20428914wh GRAY;
    public static final EnumC20428914wh GREEN;
    public static final EnumC20428914wh LAVENDER;
    public static final /* synthetic */ EnumC20428914wh[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC20428914wh> getEntries() {
        return LLILLL;
    }

    static {
        EnumC20428914wh enumC20428914wh = new EnumC20428914wh("DARK_GRAY", 0, "#333333");
        DARK_GRAY = enumC20428914wh;
        EnumC20428914wh enumC20428914wh2 = new EnumC20428914wh("DARK_BLUE", 1, "#2E3340");
        DARK_BLUE = enumC20428914wh2;
        EnumC20428914wh enumC20428914wh3 = new EnumC20428914wh("DARK_GREEN", 2, "#283835");
        DARK_GREEN = enumC20428914wh3;
        EnumC20428914wh enumC20428914wh4 = new EnumC20428914wh("DARK_PURPLE", 3, "#3A2E40");
        DARK_PURPLE = enumC20428914wh4;
        EnumC20428914wh enumC20428914wh5 = new EnumC20428914wh("DARK_BROWN", 4, "#402E2E");
        DARK_BROWN = enumC20428914wh5;
        EnumC20428914wh enumC20428914wh6 = new EnumC20428914wh("GRAY", 5, "#757575");
        GRAY = enumC20428914wh6;
        EnumC20428914wh enumC20428914wh7 = new EnumC20428914wh("BLUE", 6, "#6A7694");
        BLUE = enumC20428914wh7;
        EnumC20428914wh enumC20428914wh8 = new EnumC20428914wh("GREEN", 7, "#5A7D75");
        GREEN = enumC20428914wh8;
        EnumC20428914wh enumC20428914wh9 = new EnumC20428914wh("LAVENDER", 8, "#846891");
        LAVENDER = enumC20428914wh9;
        EnumC20428914wh enumC20428914wh10 = new EnumC20428914wh("BROWN", 9, "#8C6565");
        BROWN = enumC20428914wh10;
        EnumC20428914wh[] enumC20428914whArr = {enumC20428914wh, enumC20428914wh2, enumC20428914wh3, enumC20428914wh4, enumC20428914wh5, enumC20428914wh6, enumC20428914wh7, enumC20428914wh8, enumC20428914wh9, enumC20428914wh10};
        LLILLJJLI = enumC20428914whArr;
        LLILLL = new C2254308sP(enumC20428914whArr);
    }

    public static EnumC20428914wh[] values() {
        return (EnumC20428914wh[]) LLILLJJLI.clone();
    }

    public final String getColor() {
        return this.LL;
    }

    public static EnumC20428914wh valueOf(String str) {
        return (EnumC20428914wh) C08FF.LIZ(EnumC20428914wh.class, str);
    }

    public EnumC20428914wh(String str, int i, String str2) {
        this.LL = str2;
    }
}
