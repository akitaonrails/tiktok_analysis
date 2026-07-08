package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0qyh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1570770qyh {
    public static final EnumC1570770qyh COLD_LAUNCH;
    public static final EnumC1570770qyh ENTER_BACKGROUND;
    public static final EnumC1570770qyh HOT_LAUNCH;
    public static final /* synthetic */ EnumC1570770qyh[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1570770qyh> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1570770qyh enumC1570770qyh = new EnumC1570770qyh("COLD_LAUNCH", 0, "cold_launch");
        COLD_LAUNCH = enumC1570770qyh;
        EnumC1570770qyh enumC1570770qyh2 = new EnumC1570770qyh("HOT_LAUNCH", 1, "hot_launch");
        HOT_LAUNCH = enumC1570770qyh2;
        EnumC1570770qyh enumC1570770qyh3 = new EnumC1570770qyh("ENTER_BACKGROUND", 2, "enter_background");
        ENTER_BACKGROUND = enumC1570770qyh3;
        EnumC1570770qyh[] enumC1570770qyhArr = {enumC1570770qyh, enumC1570770qyh2, enumC1570770qyh3};
        LLILLJJLI = enumC1570770qyhArr;
        LLILLL = new C2254308sP(enumC1570770qyhArr);
    }

    public static EnumC1570770qyh[] values() {
        return (EnumC1570770qyh[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1570770qyh valueOf(String str) {
        return (EnumC1570770qyh) C08FF.LIZ(EnumC1570770qyh.class, str);
    }

    public EnumC1570770qyh(String str, int i, String str2) {
        this.LL = str2;
    }
}
