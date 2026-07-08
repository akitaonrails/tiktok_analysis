package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0hON, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1202290hON {
    public static final EnumC1202290hON CONTAINER;
    public static final /* synthetic */ EnumC1202290hON[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1202290hON POPUP;

    public static InterfaceC2044707zh<EnumC1202290hON> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1202290hON enumC1202290hON = new EnumC1202290hON("CONTAINER", 0);
        CONTAINER = enumC1202290hON;
        EnumC1202290hON enumC1202290hON2 = new EnumC1202290hON("POPUP", 1);
        POPUP = enumC1202290hON2;
        EnumC1202290hON[] enumC1202290hONArr = {enumC1202290hON, enumC1202290hON2};
        LL = enumC1202290hONArr;
        LLILLJJLI = new C2254308sP(enumC1202290hONArr);
    }

    public static EnumC1202290hON[] values() {
        return (EnumC1202290hON[]) LL.clone();
    }

    public static EnumC1202290hON valueOf(String str) {
        return (EnumC1202290hON) C08FF.LIZ(EnumC1202290hON.class, str);
    }

    public EnumC1202290hON(String str, int i) {
    }
}
