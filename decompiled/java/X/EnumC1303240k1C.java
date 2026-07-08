package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0k1C, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class EnumC1303240k1C {
    public static final EnumC1303240k1C AVMANAGEMENT;
    public static final EnumC1303240k1C BIZ;
    public static final EnumC1303240k1C COMMON;
    public static final EnumC1303240k1C DSL;
    public static final EnumC1303240k1C LAYOUT;
    public static final EnumC1303240k1C LINKER;
    public static final /* synthetic */ EnumC1303240k1C[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1303240k1C PERFORMANCE;
    public static final EnumC1303240k1C PERMISSION;
    public static final EnumC1303240k1C PLAY;
    public static final EnumC1303240k1C RTC;
    public static final EnumC1303240k1C RUST;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1303240k1C> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1303240k1C enumC1303240k1C = new EnumC1303240k1C("LAYOUT", 0, "Layout");
        LAYOUT = enumC1303240k1C;
        EnumC1303240k1C enumC1303240k1C2 = new EnumC1303240k1C("LINKER", 1, "Linker");
        LINKER = enumC1303240k1C2;
        EnumC1303240k1C enumC1303240k1C3 = new EnumC1303240k1C("AVMANAGEMENT", 2, "AVManagement");
        AVMANAGEMENT = enumC1303240k1C3;
        EnumC1303240k1C enumC1303240k1C4 = new EnumC1303240k1C("PERMISSION", 3, "Permission");
        PERMISSION = enumC1303240k1C4;
        EnumC1303240k1C enumC1303240k1C5 = new EnumC1303240k1C("PERFORMANCE", 4, "Performance");
        PERFORMANCE = enumC1303240k1C5;
        EnumC1303240k1C enumC1303240k1C6 = new EnumC1303240k1C("BIZ", 5, "Biz");
        BIZ = enumC1303240k1C6;
        EnumC1303240k1C enumC1303240k1C7 = new EnumC1303240k1C("RTC", 6, "Rtc");
        RTC = enumC1303240k1C7;
        EnumC1303240k1C enumC1303240k1C8 = new EnumC1303240k1C("COMMON", 7, "Common");
        COMMON = enumC1303240k1C8;
        EnumC1303240k1C enumC1303240k1C9 = new EnumC1303240k1C("RUST", 8, "Rust");
        RUST = enumC1303240k1C9;
        EnumC1303240k1C enumC1303240k1C10 = new EnumC1303240k1C("DSL", 9, "Dsl");
        DSL = enumC1303240k1C10;
        EnumC1303240k1C enumC1303240k1C11 = new EnumC1303240k1C("PLAY", 10, "Play");
        PLAY = enumC1303240k1C11;
        EnumC1303240k1C[] enumC1303240k1CArr = {enumC1303240k1C, enumC1303240k1C2, enumC1303240k1C3, enumC1303240k1C4, enumC1303240k1C5, enumC1303240k1C6, enumC1303240k1C7, enumC1303240k1C8, enumC1303240k1C9, enumC1303240k1C10, enumC1303240k1C11};
        LLILLJJLI = enumC1303240k1CArr;
        LLILLL = new C2254308sP(enumC1303240k1CArr);
    }

    public static EnumC1303240k1C[] values() {
        return (EnumC1303240k1C[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1303240k1C valueOf(String str) {
        return (EnumC1303240k1C) C08FF.LIZ(EnumC1303240k1C.class, str);
    }

    public EnumC1303240k1C(String str, int i, String str2) {
        this.LL = str2;
    }
}
