package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0tpW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class EnumC1680400tpW {
    public static final /* synthetic */ EnumC1680400tpW[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1680400tpW Ltr;
    public static final EnumC1680400tpW Rtl;

    public static InterfaceC2044707zh<EnumC1680400tpW> getEntries() {
        return LLILLJJLI;
    }

    public static EnumC1680400tpW valueOf(String str) {
        return (EnumC1680400tpW) C08FF.LIZ(EnumC1680400tpW.class, str);
    }

    public static EnumC1680400tpW[] values() {
        return (EnumC1680400tpW[]) LL.clone();
    }

    static {
        EnumC1680400tpW enumC1680400tpW = new EnumC1680400tpW("Ltr", 0);
        Ltr = enumC1680400tpW;
        EnumC1680400tpW enumC1680400tpW2 = new EnumC1680400tpW("Rtl", 1);
        Rtl = enumC1680400tpW2;
        EnumC1680400tpW[] enumC1680400tpWArr = {enumC1680400tpW, enumC1680400tpW2};
        LL = enumC1680400tpWArr;
        LLILLJJLI = new C2254308sP(enumC1680400tpWArr);
    }

    public EnumC1680400tpW(String str, int i) {
    }
}
