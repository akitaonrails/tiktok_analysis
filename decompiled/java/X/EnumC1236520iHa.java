package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0iHa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1236520iHa {
    public static final EnumC1236520iHa GROUP;
    public static final /* synthetic */ EnumC1236520iHa[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1236520iHa POST;
    public static final EnumC1236520iHa USER;

    public static InterfaceC2044707zh<EnumC1236520iHa> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1236520iHa enumC1236520iHa = new EnumC1236520iHa("POST", 0);
        POST = enumC1236520iHa;
        EnumC1236520iHa enumC1236520iHa2 = new EnumC1236520iHa("USER", 1);
        USER = enumC1236520iHa2;
        EnumC1236520iHa enumC1236520iHa3 = new EnumC1236520iHa("GROUP", 2);
        GROUP = enumC1236520iHa3;
        EnumC1236520iHa[] enumC1236520iHaArr = {enumC1236520iHa, enumC1236520iHa2, enumC1236520iHa3};
        LL = enumC1236520iHaArr;
        LLILLJJLI = new C2254308sP(enumC1236520iHaArr);
    }

    public static EnumC1236520iHa[] values() {
        return (EnumC1236520iHa[]) LL.clone();
    }

    public static EnumC1236520iHa valueOf(String str) {
        return (EnumC1236520iHa) C08FF.LIZ(EnumC1236520iHa.class, str);
    }

    public EnumC1236520iHa(String str, int i) {
    }
}
