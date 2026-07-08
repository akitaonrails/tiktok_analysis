package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0I6s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC461200I6s {
    public static final /* synthetic */ EnumC461200I6s[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC461200I6s MIDDLE;
    public static final EnumC461200I6s TOP;

    public static InterfaceC2044707zh<EnumC461200I6s> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC461200I6s enumC461200I6s = new EnumC461200I6s("TOP", 0);
        TOP = enumC461200I6s;
        EnumC461200I6s enumC461200I6s2 = new EnumC461200I6s("MIDDLE", 1);
        MIDDLE = enumC461200I6s2;
        EnumC461200I6s[] enumC461200I6sArr = {enumC461200I6s, enumC461200I6s2};
        LL = enumC461200I6sArr;
        LLILLJJLI = new C2254308sP(enumC461200I6sArr);
    }

    public static EnumC461200I6s[] values() {
        return (EnumC461200I6s[]) LL.clone();
    }

    public static EnumC461200I6s valueOf(String str) {
        return (EnumC461200I6s) C08FF.LIZ(EnumC461200I6s.class, str);
    }

    public EnumC461200I6s(String str, int i) {
    }
}
