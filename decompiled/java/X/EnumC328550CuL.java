package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0CuL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC328550CuL {
    public static final C328560CuM Companion;
    public static final EnumC328550CuL FIXED;
    public static final /* synthetic */ EnumC328550CuL[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC328550CuL PARAM_BASED;

    public static InterfaceC2044707zh<EnumC328550CuL> getEntries() {
        return LLILLJJLI;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0CuM] */
    static {
        EnumC328550CuL enumC328550CuL = new EnumC328550CuL("FIXED", 0);
        FIXED = enumC328550CuL;
        EnumC328550CuL enumC328550CuL2 = new EnumC328550CuL("PARAM_BASED", 1);
        PARAM_BASED = enumC328550CuL2;
        EnumC328550CuL[] enumC328550CuLArr = {enumC328550CuL, enumC328550CuL2};
        LL = enumC328550CuLArr;
        LLILLJJLI = new C2254308sP(enumC328550CuLArr);
        Companion = new Object() { // from class: X.0CuM
        };
    }

    public static EnumC328550CuL[] values() {
        return (EnumC328550CuL[]) LL.clone();
    }

    public static EnumC328550CuL valueOf(String str) {
        return (EnumC328550CuL) C08FF.LIZ(EnumC328550CuL.class, str);
    }

    public EnumC328550CuL(String str, int i) {
    }
}
