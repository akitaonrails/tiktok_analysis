package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0iIW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1237100iIW {
    public static final EnumC1237100iIW EMAIL;
    public static final /* synthetic */ EnumC1237100iIW[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1237100iIW PHONE;
    public static final EnumC1237100iIW TOTP;
    public static final EnumC1237100iIW UNDEFINED;

    public static InterfaceC2044707zh<EnumC1237100iIW> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1237100iIW enumC1237100iIW = new EnumC1237100iIW("UNDEFINED", 0);
        UNDEFINED = enumC1237100iIW;
        EnumC1237100iIW enumC1237100iIW2 = new EnumC1237100iIW("PHONE", 1);
        PHONE = enumC1237100iIW2;
        EnumC1237100iIW enumC1237100iIW3 = new EnumC1237100iIW("EMAIL", 2);
        EMAIL = enumC1237100iIW3;
        EnumC1237100iIW enumC1237100iIW4 = new EnumC1237100iIW("TOTP", 3);
        TOTP = enumC1237100iIW4;
        EnumC1237100iIW[] enumC1237100iIWArr = {enumC1237100iIW, enumC1237100iIW2, enumC1237100iIW3, enumC1237100iIW4};
        LL = enumC1237100iIWArr;
        LLILLJJLI = new C2254308sP(enumC1237100iIWArr);
    }

    public static EnumC1237100iIW[] values() {
        return (EnumC1237100iIW[]) LL.clone();
    }

    public static EnumC1237100iIW valueOf(String str) {
        return (EnumC1237100iIW) C08FF.LIZ(EnumC1237100iIW.class, str);
    }

    public EnumC1237100iIW(String str, int i) {
    }
}
