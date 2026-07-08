package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wO5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1778710wO5 {
    public static final EnumC1778710wO5 ACTIVITY_CALLBACK;
    public static final /* synthetic */ EnumC1778710wO5[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1778710wO5 NATIVE;
    public static final EnumC1778710wO5 ROUTE;

    public static InterfaceC2044707zh<EnumC1778710wO5> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1778710wO5 enumC1778710wO5 = new EnumC1778710wO5("ACTIVITY_CALLBACK", 0);
        ACTIVITY_CALLBACK = enumC1778710wO5;
        EnumC1778710wO5 enumC1778710wO52 = new EnumC1778710wO5("ROUTE", 1);
        ROUTE = enumC1778710wO52;
        EnumC1778710wO5 enumC1778710wO53 = new EnumC1778710wO5("NATIVE", 2);
        NATIVE = enumC1778710wO53;
        EnumC1778710wO5[] enumC1778710wO5Arr = {enumC1778710wO5, enumC1778710wO52, enumC1778710wO53};
        LL = enumC1778710wO5Arr;
        LLILLJJLI = new C2254308sP(enumC1778710wO5Arr);
    }

    public static EnumC1778710wO5[] values() {
        return (EnumC1778710wO5[]) LL.clone();
    }

    public static EnumC1778710wO5 valueOf(String str) {
        return (EnumC1778710wO5) C08FF.LIZ(EnumC1778710wO5.class, str);
    }

    public EnumC1778710wO5(String str, int i) {
    }
}
