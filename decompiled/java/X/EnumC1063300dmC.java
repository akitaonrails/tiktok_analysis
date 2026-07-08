package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0dmC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1063300dmC {
    public static final EnumC1063300dmC ALL;
    public static final /* synthetic */ EnumC1063300dmC[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1063300dmC LYNX;
    public static final EnumC1063300dmC NATIVEVIEW;
    public static final EnumC1063300dmC NONE;
    public static final EnumC1063300dmC RN;
    public static final EnumC1063300dmC SDUI;
    public static final EnumC1063300dmC WEB;
    public static final EnumC1063300dmC Worker;

    public static InterfaceC2044707zh<EnumC1063300dmC> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1063300dmC enumC1063300dmC = new EnumC1063300dmC("RN", 0);
        RN = enumC1063300dmC;
        EnumC1063300dmC enumC1063300dmC2 = new EnumC1063300dmC("WEB", 1);
        WEB = enumC1063300dmC2;
        EnumC1063300dmC enumC1063300dmC3 = new EnumC1063300dmC("LYNX", 2);
        LYNX = enumC1063300dmC3;
        EnumC1063300dmC enumC1063300dmC4 = new EnumC1063300dmC("SDUI", 3);
        SDUI = enumC1063300dmC4;
        EnumC1063300dmC enumC1063300dmC5 = new EnumC1063300dmC("Worker", 4);
        Worker = enumC1063300dmC5;
        EnumC1063300dmC enumC1063300dmC6 = new EnumC1063300dmC("NONE", 5);
        NONE = enumC1063300dmC6;
        EnumC1063300dmC enumC1063300dmC7 = new EnumC1063300dmC("ALL", 6);
        ALL = enumC1063300dmC7;
        EnumC1063300dmC enumC1063300dmC8 = new EnumC1063300dmC("NATIVEVIEW", 7);
        NATIVEVIEW = enumC1063300dmC8;
        EnumC1063300dmC[] enumC1063300dmCArr = {enumC1063300dmC, enumC1063300dmC2, enumC1063300dmC3, enumC1063300dmC4, enumC1063300dmC5, enumC1063300dmC6, enumC1063300dmC7, enumC1063300dmC8};
        LL = enumC1063300dmCArr;
        LLILLJJLI = new C2254308sP(enumC1063300dmCArr);
    }

    public static EnumC1063300dmC[] values() {
        return (EnumC1063300dmC[]) LL.clone();
    }

    public static EnumC1063300dmC valueOf(String str) {
        return (EnumC1063300dmC) C08FF.LIZ(EnumC1063300dmC.class, str);
    }

    public EnumC1063300dmC(String str, int i) {
    }
}
