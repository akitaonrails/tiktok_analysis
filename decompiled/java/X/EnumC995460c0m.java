package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0c0m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC995460c0m {
    public static final /* synthetic */ EnumC995460c0m[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC995460c0m Max;
    public static final EnumC995460c0m Min;

    public static InterfaceC2044707zh<EnumC995460c0m> getEntries() {
        return LLILLJJLI;
    }

    public static EnumC995460c0m valueOf(String str) {
        return (EnumC995460c0m) C08FF.LIZ(EnumC995460c0m.class, str);
    }

    public static EnumC995460c0m[] values() {
        return (EnumC995460c0m[]) LL.clone();
    }

    static {
        EnumC995460c0m enumC995460c0m = new EnumC995460c0m("Min", 0);
        Min = enumC995460c0m;
        EnumC995460c0m enumC995460c0m2 = new EnumC995460c0m("Max", 1);
        Max = enumC995460c0m2;
        EnumC995460c0m[] enumC995460c0mArr = {enumC995460c0m, enumC995460c0m2};
        LL = enumC995460c0mArr;
        LLILLJJLI = new C2254308sP(enumC995460c0mArr);
    }

    public EnumC995460c0m(String str, int i) {
    }
}
