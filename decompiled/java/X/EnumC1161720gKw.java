package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0gKw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1161720gKw {
    public static final EnumC1161720gKw DOUBLE_COLUMN;
    public static final /* synthetic */ EnumC1161720gKw[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1161720gKw SINGLE_COLUMN;
    public static final EnumC1161720gKw UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1161720gKw> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1161720gKw enumC1161720gKw = new EnumC1161720gKw("UNKNOWN", 0, 0);
        UNKNOWN = enumC1161720gKw;
        EnumC1161720gKw enumC1161720gKw2 = new EnumC1161720gKw("SINGLE_COLUMN", 1, 1);
        SINGLE_COLUMN = enumC1161720gKw2;
        EnumC1161720gKw enumC1161720gKw3 = new EnumC1161720gKw("DOUBLE_COLUMN", 2, 2);
        DOUBLE_COLUMN = enumC1161720gKw3;
        EnumC1161720gKw[] enumC1161720gKwArr = {enumC1161720gKw, enumC1161720gKw2, enumC1161720gKw3};
        LLILLJJLI = enumC1161720gKwArr;
        LLILLL = new C2254308sP(enumC1161720gKwArr);
    }

    public static EnumC1161720gKw[] values() {
        return (EnumC1161720gKw[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1161720gKw valueOf(String str) {
        return (EnumC1161720gKw) C08FF.LIZ(EnumC1161720gKw.class, str);
    }

    public EnumC1161720gKw(String str, int i, int i2) {
        this.LL = i2;
    }
}
