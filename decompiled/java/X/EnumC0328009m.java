package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.009m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0328009m {
    public static final /* synthetic */ EnumC0328009m[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC0328009m SPECIFIC;
    public static final EnumC0328009m WRAP_CONTENT;

    public static InterfaceC2044707zh<EnumC0328009m> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC0328009m enumC0328009m = new EnumC0328009m("WRAP_CONTENT", 0);
        WRAP_CONTENT = enumC0328009m;
        EnumC0328009m enumC0328009m2 = new EnumC0328009m("SPECIFIC", 1);
        SPECIFIC = enumC0328009m2;
        EnumC0328009m[] enumC0328009mArr = {enumC0328009m, enumC0328009m2};
        LL = enumC0328009mArr;
        LLILLJJLI = new C2254308sP(enumC0328009mArr);
    }

    public static EnumC0328009m[] values() {
        return (EnumC0328009m[]) LL.clone();
    }

    public static EnumC0328009m valueOf(String str) {
        return (EnumC0328009m) C08FF.LIZ(EnumC0328009m.class, str);
    }

    public EnumC0328009m(String str, int i) {
    }
}
