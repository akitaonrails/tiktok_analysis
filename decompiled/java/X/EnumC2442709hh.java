package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.09hh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2442709hh {
    public static final EnumC2442709hh FAIL;
    public static final EnumC2442709hh IAB_FORCE_EXTERNAL_BROWSER;
    public static final EnumC2442709hh IAB_OPEN_DIRECT;
    public static final EnumC2442709hh IAB_OPEN_WITH_SAFETY_NOTICE;
    public static final EnumC2442709hh IAB_PLACEHOLDER_BLOCK;
    public static final /* synthetic */ EnumC2442709hh[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC2442709hh UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC2442709hh> getEntries() {
        return LLILLL;
    }

    static {
        EnumC2442709hh enumC2442709hh = new EnumC2442709hh("FAIL", 0, 5);
        FAIL = enumC2442709hh;
        EnumC2442709hh enumC2442709hh2 = new EnumC2442709hh("UNKNOWN", 1, 0);
        UNKNOWN = enumC2442709hh2;
        EnumC2442709hh enumC2442709hh3 = new EnumC2442709hh("IAB_OPEN_DIRECT", 2, 1);
        IAB_OPEN_DIRECT = enumC2442709hh3;
        EnumC2442709hh enumC2442709hh4 = new EnumC2442709hh("IAB_OPEN_WITH_SAFETY_NOTICE", 3, 2);
        IAB_OPEN_WITH_SAFETY_NOTICE = enumC2442709hh4;
        EnumC2442709hh enumC2442709hh5 = new EnumC2442709hh("IAB_FORCE_EXTERNAL_BROWSER", 4, 3);
        IAB_FORCE_EXTERNAL_BROWSER = enumC2442709hh5;
        EnumC2442709hh enumC2442709hh6 = new EnumC2442709hh("IAB_PLACEHOLDER_BLOCK", 5, 4);
        IAB_PLACEHOLDER_BLOCK = enumC2442709hh6;
        EnumC2442709hh[] enumC2442709hhArr = {enumC2442709hh, enumC2442709hh2, enumC2442709hh3, enumC2442709hh4, enumC2442709hh5, enumC2442709hh6};
        LLILLJJLI = enumC2442709hhArr;
        LLILLL = new C2254308sP(enumC2442709hhArr);
    }

    public static EnumC2442709hh[] values() {
        return (EnumC2442709hh[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC2442709hh valueOf(String str) {
        return (EnumC2442709hh) C08FF.LIZ(EnumC2442709hh.class, str);
    }

    public EnumC2442709hh(String str, int i, int i2) {
        this.LL = i2;
    }
}
