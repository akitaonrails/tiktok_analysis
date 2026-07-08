package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0dtC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1067640dtC {
    public static final /* synthetic */ EnumC1067640dtC[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1067640dtC LYNX;
    public static final EnumC1067640dtC LYNX_JS_RUNTIME;
    public static final EnumC1067640dtC SDUI;
    public static final EnumC1067640dtC UNKNOWN;
    public static final EnumC1067640dtC WEB;

    public static InterfaceC2044707zh<EnumC1067640dtC> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1067640dtC enumC1067640dtC = new EnumC1067640dtC("UNKNOWN", 0);
        UNKNOWN = enumC1067640dtC;
        EnumC1067640dtC enumC1067640dtC2 = new EnumC1067640dtC("WEB", 1);
        WEB = enumC1067640dtC2;
        EnumC1067640dtC enumC1067640dtC3 = new EnumC1067640dtC("LYNX", 2);
        LYNX = enumC1067640dtC3;
        EnumC1067640dtC enumC1067640dtC4 = new EnumC1067640dtC("SDUI", 3);
        SDUI = enumC1067640dtC4;
        EnumC1067640dtC enumC1067640dtC5 = new EnumC1067640dtC("LYNX_JS_RUNTIME", 4);
        LYNX_JS_RUNTIME = enumC1067640dtC5;
        EnumC1067640dtC[] enumC1067640dtCArr = {enumC1067640dtC, enumC1067640dtC2, enumC1067640dtC3, enumC1067640dtC4, enumC1067640dtC5};
        LL = enumC1067640dtCArr;
        LLILLJJLI = new C2254308sP(enumC1067640dtCArr);
    }

    public static EnumC1067640dtC[] values() {
        return (EnumC1067640dtC[]) LL.clone();
    }

    public static EnumC1067640dtC valueOf(String str) {
        return (EnumC1067640dtC) C08FF.LIZ(EnumC1067640dtC.class, str);
    }

    public EnumC1067640dtC(String str, int i) {
    }
}
