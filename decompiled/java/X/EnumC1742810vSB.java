package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0vSB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1742810vSB {
    public static final EnumC1742810vSB INIT;
    public static final /* synthetic */ EnumC1742810vSB[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1742810vSB LOAD_MORE;
    public static final EnumC1742810vSB REFRESH;

    public static InterfaceC2044707zh<EnumC1742810vSB> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1742810vSB enumC1742810vSB = new EnumC1742810vSB("REFRESH", 0);
        REFRESH = enumC1742810vSB;
        EnumC1742810vSB enumC1742810vSB2 = new EnumC1742810vSB("LOAD_MORE", 1);
        LOAD_MORE = enumC1742810vSB2;
        EnumC1742810vSB enumC1742810vSB3 = new EnumC1742810vSB("INIT", 2);
        INIT = enumC1742810vSB3;
        EnumC1742810vSB[] enumC1742810vSBArr = {enumC1742810vSB, enumC1742810vSB2, enumC1742810vSB3};
        LL = enumC1742810vSBArr;
        LLILLJJLI = new C2254308sP(enumC1742810vSBArr);
    }

    public static EnumC1742810vSB[] values() {
        return (EnumC1742810vSB[]) LL.clone();
    }

    public static EnumC1742810vSB valueOf(String str) {
        return (EnumC1742810vSB) C08FF.LIZ(EnumC1742810vSB.class, str);
    }

    public EnumC1742810vSB(String str, int i) {
    }
}
