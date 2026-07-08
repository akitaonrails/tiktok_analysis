package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0pW8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1514620pW8 {
    public static final EnumC1514620pW8 Error;
    public static final EnumC1514620pW8 Info;
    public static final /* synthetic */ EnumC1514620pW8[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1514620pW8 Warn;

    public static InterfaceC2044707zh<EnumC1514620pW8> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1514620pW8 enumC1514620pW8 = new EnumC1514620pW8("Info", 0);
        Info = enumC1514620pW8;
        EnumC1514620pW8 enumC1514620pW82 = new EnumC1514620pW8("Warn", 1);
        Warn = enumC1514620pW82;
        EnumC1514620pW8 enumC1514620pW83 = new EnumC1514620pW8("Error", 2);
        Error = enumC1514620pW83;
        EnumC1514620pW8[] enumC1514620pW8Arr = {enumC1514620pW8, enumC1514620pW82, enumC1514620pW83};
        LL = enumC1514620pW8Arr;
        LLILLJJLI = new C2254308sP(enumC1514620pW8Arr);
    }

    public static EnumC1514620pW8[] values() {
        return (EnumC1514620pW8[]) LL.clone();
    }

    public static EnumC1514620pW8 valueOf(String str) {
        return (EnumC1514620pW8) C08FF.LIZ(EnumC1514620pW8.class, str);
    }

    public EnumC1514620pW8(String str, int i) {
    }
}
