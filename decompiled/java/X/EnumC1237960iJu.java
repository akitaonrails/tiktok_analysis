package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0iJu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1237960iJu {
    public static final EnumC1237960iJu BIND_PHONE;
    public static final /* synthetic */ EnumC1237960iJu[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1237960iJu VERIFY_EMAIL;
    public static final EnumC1237960iJu VERIFY_PHONE;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1237960iJu> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1237960iJu enumC1237960iJu = new EnumC1237960iJu("VERIFY_PHONE", 0, 1);
        VERIFY_PHONE = enumC1237960iJu;
        EnumC1237960iJu enumC1237960iJu2 = new EnumC1237960iJu("VERIFY_EMAIL", 1, 2);
        VERIFY_EMAIL = enumC1237960iJu2;
        EnumC1237960iJu enumC1237960iJu3 = new EnumC1237960iJu("BIND_PHONE", 2, 3);
        BIND_PHONE = enumC1237960iJu3;
        EnumC1237960iJu[] enumC1237960iJuArr = {enumC1237960iJu, enumC1237960iJu2, enumC1237960iJu3};
        LLILLJJLI = enumC1237960iJuArr;
        LLILLL = new C2254308sP(enumC1237960iJuArr);
    }

    public static EnumC1237960iJu[] values() {
        return (EnumC1237960iJu[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1237960iJu valueOf(String str) {
        return (EnumC1237960iJu) C08FF.LIZ(EnumC1237960iJu.class, str);
    }

    public EnumC1237960iJu(String str, int i, int i2) {
        this.LL = i2;
    }
}
