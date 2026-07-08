package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Sf9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class EnumC726810Sf9 {
    public static final EnumC726810Sf9 LANDSCAPE;
    public static final /* synthetic */ EnumC726810Sf9[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC726810Sf9 PORTRAIT;

    public static InterfaceC2044707zh<EnumC726810Sf9> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC726810Sf9 enumC726810Sf9 = new EnumC726810Sf9("PORTRAIT", 0);
        PORTRAIT = enumC726810Sf9;
        EnumC726810Sf9 enumC726810Sf92 = new EnumC726810Sf9("LANDSCAPE", 1);
        LANDSCAPE = enumC726810Sf92;
        EnumC726810Sf9[] enumC726810Sf9Arr = {enumC726810Sf9, enumC726810Sf92};
        LL = enumC726810Sf9Arr;
        LLILLJJLI = new C2254308sP(enumC726810Sf9Arr);
    }

    public static EnumC726810Sf9[] values() {
        return (EnumC726810Sf9[]) LL.clone();
    }

    public static EnumC726810Sf9 valueOf(String str) {
        return (EnumC726810Sf9) C08FF.LIZ(EnumC726810Sf9.class, str);
    }

    public EnumC726810Sf9(String str, int i) {
    }
}
