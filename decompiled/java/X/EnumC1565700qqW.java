package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0qqW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1565700qqW {
    public static final EnumC1565700qqW IN;
    public static final /* synthetic */ EnumC1565700qqW[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1565700qqW NONE;
    public static final EnumC1565700qqW OUT;

    public static InterfaceC2044707zh<EnumC1565700qqW> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1565700qqW enumC1565700qqW = new EnumC1565700qqW("OUT", 0);
        OUT = enumC1565700qqW;
        EnumC1565700qqW enumC1565700qqW2 = new EnumC1565700qqW("IN", 1);
        IN = enumC1565700qqW2;
        EnumC1565700qqW enumC1565700qqW3 = new EnumC1565700qqW("NONE", 2);
        NONE = enumC1565700qqW3;
        EnumC1565700qqW[] enumC1565700qqWArr = {enumC1565700qqW, enumC1565700qqW2, enumC1565700qqW3};
        LL = enumC1565700qqWArr;
        LLILLJJLI = new C2254308sP(enumC1565700qqWArr);
    }

    public static EnumC1565700qqW[] values() {
        return (EnumC1565700qqW[]) LL.clone();
    }

    public static EnumC1565700qqW valueOf(String str) {
        return (EnumC1565700qqW) C08FF.LIZ(EnumC1565700qqW.class, str);
    }

    public EnumC1565700qqW(String str, int i) {
    }
}
