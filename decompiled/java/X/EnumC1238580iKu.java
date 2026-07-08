package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0iKu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1238580iKu {
    public static final EnumC1238580iKu ACCOUNT_REGION;
    public static final EnumC1238580iKu AGE_VERIFICATION;
    public static final EnumC1238580iKu AUTOFILL;
    public static final EnumC1238580iKu DOB;
    public static final EnumC1238580iKu EMAIL;
    public static final /* synthetic */ EnumC1238580iKu[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1238580iKu PHONE;

    public static InterfaceC2044707zh<EnumC1238580iKu> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1238580iKu enumC1238580iKu = new EnumC1238580iKu("PHONE", 0);
        PHONE = enumC1238580iKu;
        EnumC1238580iKu enumC1238580iKu2 = new EnumC1238580iKu("EMAIL", 1);
        EMAIL = enumC1238580iKu2;
        EnumC1238580iKu enumC1238580iKu3 = new EnumC1238580iKu("DOB", 2);
        DOB = enumC1238580iKu3;
        EnumC1238580iKu enumC1238580iKu4 = new EnumC1238580iKu("ACCOUNT_REGION", 3);
        ACCOUNT_REGION = enumC1238580iKu4;
        EnumC1238580iKu enumC1238580iKu5 = new EnumC1238580iKu("AGE_VERIFICATION", 4);
        AGE_VERIFICATION = enumC1238580iKu5;
        EnumC1238580iKu enumC1238580iKu6 = new EnumC1238580iKu("AUTOFILL", 5);
        AUTOFILL = enumC1238580iKu6;
        EnumC1238580iKu[] enumC1238580iKuArr = {enumC1238580iKu, enumC1238580iKu2, enumC1238580iKu3, enumC1238580iKu4, enumC1238580iKu5, enumC1238580iKu6};
        LL = enumC1238580iKuArr;
        LLILLJJLI = new C2254308sP(enumC1238580iKuArr);
    }

    public static EnumC1238580iKu[] values() {
        return (EnumC1238580iKu[]) LL.clone();
    }

    public static EnumC1238580iKu valueOf(String str) {
        return (EnumC1238580iKu) C08FF.LIZ(EnumC1238580iKu.class, str);
    }

    public EnumC1238580iKu(String str, int i) {
    }
}
