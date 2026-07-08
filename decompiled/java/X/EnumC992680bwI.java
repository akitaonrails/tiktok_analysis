package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bwI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC992680bwI {
    public static final EnumC992680bwI EXCLUDE;
    public static final /* synthetic */ EnumC992680bwI[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC992680bwI NONE;
    public static final EnumC992680bwI OVER;
    public final int LL;

    public static InterfaceC2044707zh<EnumC992680bwI> getEntries() {
        return LLILLL;
    }

    static {
        EnumC992680bwI enumC992680bwI = new EnumC992680bwI("NONE", 0, 0);
        NONE = enumC992680bwI;
        EnumC992680bwI enumC992680bwI2 = new EnumC992680bwI("OVER", 1, 1);
        OVER = enumC992680bwI2;
        EnumC992680bwI enumC992680bwI3 = new EnumC992680bwI("EXCLUDE", 2, -1);
        EXCLUDE = enumC992680bwI3;
        EnumC992680bwI[] enumC992680bwIArr = {enumC992680bwI, enumC992680bwI2, enumC992680bwI3};
        LLILLJJLI = enumC992680bwIArr;
        LLILLL = new C2254308sP(enumC992680bwIArr);
    }

    public static EnumC992680bwI[] values() {
        return (EnumC992680bwI[]) LLILLJJLI.clone();
    }

    public final int getFlag() {
        return this.LL;
    }

    public static EnumC992680bwI valueOf(String str) {
        return (EnumC992680bwI) C08FF.LIZ(EnumC992680bwI.class, str);
    }

    public EnumC992680bwI(String str, int i, int i2) {
        this.LL = i2;
    }
}
