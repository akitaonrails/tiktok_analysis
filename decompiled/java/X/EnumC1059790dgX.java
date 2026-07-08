package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0dgX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1059790dgX {
    public static final EnumC1059790dgX ALL;
    public static final /* synthetic */ EnumC1059790dgX[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1059790dgX LYNX;
    public static final EnumC1059790dgX NONE;
    public static final EnumC1059790dgX RN;
    public static final EnumC1059790dgX WEB;

    public static InterfaceC2044707zh<EnumC1059790dgX> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1059790dgX enumC1059790dgX = new EnumC1059790dgX("RN", 0);
        RN = enumC1059790dgX;
        EnumC1059790dgX enumC1059790dgX2 = new EnumC1059790dgX("WEB", 1);
        WEB = enumC1059790dgX2;
        EnumC1059790dgX enumC1059790dgX3 = new EnumC1059790dgX("LYNX", 2);
        LYNX = enumC1059790dgX3;
        EnumC1059790dgX enumC1059790dgX4 = new EnumC1059790dgX("NONE", 3);
        NONE = enumC1059790dgX4;
        EnumC1059790dgX enumC1059790dgX5 = new EnumC1059790dgX("ALL", 4);
        ALL = enumC1059790dgX5;
        EnumC1059790dgX[] enumC1059790dgXArr = {enumC1059790dgX, enumC1059790dgX2, enumC1059790dgX3, enumC1059790dgX4, enumC1059790dgX5};
        LL = enumC1059790dgXArr;
        LLILLJJLI = new C2254308sP(enumC1059790dgXArr);
    }

    public static EnumC1059790dgX[] values() {
        return (EnumC1059790dgX[]) LL.clone();
    }

    public static EnumC1059790dgX valueOf(String str) {
        return (EnumC1059790dgX) C08FF.LIZ(EnumC1059790dgX.class, str);
    }

    public EnumC1059790dgX(String str, int i) {
    }
}
