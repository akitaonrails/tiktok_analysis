package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0dmN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1063410dmN {
    public static final EnumC1063410dmN JSB;
    public static final /* synthetic */ EnumC1063410dmN[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1063410dmN NORMAL;

    public static InterfaceC2044707zh<EnumC1063410dmN> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1063410dmN enumC1063410dmN = new EnumC1063410dmN("NORMAL", 0);
        NORMAL = enumC1063410dmN;
        EnumC1063410dmN enumC1063410dmN2 = new EnumC1063410dmN("JSB", 1);
        JSB = enumC1063410dmN2;
        EnumC1063410dmN[] enumC1063410dmNArr = {enumC1063410dmN, enumC1063410dmN2};
        LL = enumC1063410dmNArr;
        LLILLJJLI = new C2254308sP(enumC1063410dmNArr);
    }

    public static EnumC1063410dmN[] values() {
        return (EnumC1063410dmN[]) LL.clone();
    }

    public static EnumC1063410dmN valueOf(String str) {
        return (EnumC1063410dmN) C08FF.LIZ(EnumC1063410dmN.class, str);
    }

    public EnumC1063410dmN(String str, int i) {
    }
}
