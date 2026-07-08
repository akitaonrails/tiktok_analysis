package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0byC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC993860byC {
    public static final EnumC993860byC COMPILE;
    public static final EnumC993860byC CONSUME;
    public static final EnumC993860byC CREATE;
    public static final /* synthetic */ EnumC993860byC[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC993860byC> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC993860byC enumC993860byC = new EnumC993860byC("CREATE", 0);
        CREATE = enumC993860byC;
        EnumC993860byC enumC993860byC2 = new EnumC993860byC("CONSUME", 1);
        CONSUME = enumC993860byC2;
        EnumC993860byC enumC993860byC3 = new EnumC993860byC("COMPILE", 2);
        COMPILE = enumC993860byC3;
        EnumC993860byC[] enumC993860byCArr = {enumC993860byC, enumC993860byC2, enumC993860byC3};
        LL = enumC993860byCArr;
        LLILLJJLI = new C2254308sP(enumC993860byCArr);
    }

    public static EnumC993860byC[] values() {
        return (EnumC993860byC[]) LL.clone();
    }

    public static EnumC993860byC valueOf(String str) {
        return (EnumC993860byC) C08FF.LIZ(EnumC993860byC.class, str);
    }

    public EnumC993860byC(String str, int i) {
    }
}
