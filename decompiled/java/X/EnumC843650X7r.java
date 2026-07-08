package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0X7r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class EnumC843650X7r {
    public static final /* synthetic */ EnumC843650X7r[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC843650X7r NONE;
    public static final EnumC843650X7r ONLY_REPORT;
    public static final EnumC843650X7r VERIFY;
    public final int LL;

    public static InterfaceC2044707zh<EnumC843650X7r> getEntries() {
        return LLILLL;
    }

    static {
        EnumC843650X7r enumC843650X7r = new EnumC843650X7r("NONE", 0, 0);
        NONE = enumC843650X7r;
        EnumC843650X7r enumC843650X7r2 = new EnumC843650X7r("ONLY_REPORT", 1, 1);
        ONLY_REPORT = enumC843650X7r2;
        EnumC843650X7r enumC843650X7r3 = new EnumC843650X7r("VERIFY", 2, 2);
        VERIFY = enumC843650X7r3;
        EnumC843650X7r[] enumC843650X7rArr = {enumC843650X7r, enumC843650X7r2, enumC843650X7r3};
        LLILLJJLI = enumC843650X7rArr;
        LLILLL = new C2254308sP(enumC843650X7rArr);
    }

    public static EnumC843650X7r[] values() {
        return (EnumC843650X7r[]) LLILLJJLI.clone();
    }

    public final int getCode() {
        return this.LL;
    }

    public static EnumC843650X7r valueOf(String str) {
        return (EnumC843650X7r) C08FF.LIZ(EnumC843650X7r.class, str);
    }

    public EnumC843650X7r(String str, int i, int i2) {
        this.LL = i2;
    }
}
