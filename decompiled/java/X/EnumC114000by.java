package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00by, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC114000by {
    public static final /* synthetic */ EnumC114000by[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC114000by PACKAGE_GROUP_TYPE_REGULAR;
    public static final EnumC114000by PACKAGE_GROUP_TYPE_SPECIAL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC114000by> getEntries() {
        return LLILLL;
    }

    static {
        EnumC114000by enumC114000by = new EnumC114000by("PACKAGE_GROUP_TYPE_REGULAR", 0, 1);
        PACKAGE_GROUP_TYPE_REGULAR = enumC114000by;
        EnumC114000by enumC114000by2 = new EnumC114000by("PACKAGE_GROUP_TYPE_SPECIAL", 1, 2);
        PACKAGE_GROUP_TYPE_SPECIAL = enumC114000by2;
        EnumC114000by[] enumC114000byArr = {enumC114000by, enumC114000by2};
        LLILLJJLI = enumC114000byArr;
        LLILLL = new C2254308sP(enumC114000byArr);
    }

    public static EnumC114000by[] values() {
        return (EnumC114000by[]) LLILLJJLI.clone();
    }

    public final int getProtoValue() {
        return this.LL;
    }

    public static EnumC114000by valueOf(String str) {
        return (EnumC114000by) C08FF.LIZ(EnumC114000by.class, str);
    }

    public EnumC114000by(String str, int i, int i2) {
        this.LL = i2;
    }
}
