package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0S5m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class EnumC715680S5m {
    public static final /* synthetic */ EnumC715680S5m[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC715680S5m NOT_OVERWRITTEN;
    public static final EnumC715680S5m OVERRIDE_TO_ORIGINAL;
    public static final EnumC715680S5m OVERRIDE_TO_TRANSLATED;

    public static InterfaceC2044707zh<EnumC715680S5m> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC715680S5m enumC715680S5m = new EnumC715680S5m("OVERRIDE_TO_TRANSLATED", 0);
        OVERRIDE_TO_TRANSLATED = enumC715680S5m;
        EnumC715680S5m enumC715680S5m2 = new EnumC715680S5m("OVERRIDE_TO_ORIGINAL", 1);
        OVERRIDE_TO_ORIGINAL = enumC715680S5m2;
        EnumC715680S5m enumC715680S5m3 = new EnumC715680S5m("NOT_OVERWRITTEN", 2);
        NOT_OVERWRITTEN = enumC715680S5m3;
        EnumC715680S5m[] enumC715680S5mArr = {enumC715680S5m, enumC715680S5m2, enumC715680S5m3};
        LL = enumC715680S5mArr;
        LLILLJJLI = new C2254308sP(enumC715680S5mArr);
    }

    public static EnumC715680S5m[] values() {
        return (EnumC715680S5m[]) LL.clone();
    }

    public static EnumC715680S5m valueOf(String str) {
        return (EnumC715680S5m) C08FF.LIZ(EnumC715680S5m.class, str);
    }

    public EnumC715680S5m(String str, int i) {
    }
}
