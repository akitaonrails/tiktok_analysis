package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0oob, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1487630oob {
    public static final EnumC1487630oob HIGH;
    public static final /* synthetic */ EnumC1487630oob[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1487630oob LOW;
    public static final EnumC1487630oob NORMAL;
    public static final EnumC1487630oob NO_PRELOAD;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1487630oob> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1487630oob enumC1487630oob = new EnumC1487630oob("NO_PRELOAD", 0, 0);
        NO_PRELOAD = enumC1487630oob;
        EnumC1487630oob enumC1487630oob2 = new EnumC1487630oob("HIGH", 1, 1);
        HIGH = enumC1487630oob2;
        EnumC1487630oob enumC1487630oob3 = new EnumC1487630oob("NORMAL", 2, 2);
        NORMAL = enumC1487630oob3;
        EnumC1487630oob enumC1487630oob4 = new EnumC1487630oob("LOW", 3, 3);
        LOW = enumC1487630oob4;
        EnumC1487630oob[] enumC1487630oobArr = {enumC1487630oob, enumC1487630oob2, enumC1487630oob3, enumC1487630oob4};
        LLILLJJLI = enumC1487630oobArr;
        LLILLL = new C2254308sP(enumC1487630oobArr);
    }

    public static EnumC1487630oob[] values() {
        return (EnumC1487630oob[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1487630oob valueOf(String str) {
        return (EnumC1487630oob) C08FF.LIZ(EnumC1487630oob.class, str);
    }

    public EnumC1487630oob(String str, int i, int i2) {
        this.LL = i2;
    }
}
