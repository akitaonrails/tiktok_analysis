package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wVL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1783210wVL {
    public static final EnumC1783210wVL COLLAPSE;
    public static final EnumC1783210wVL EXPAND;
    public static final /* synthetic */ EnumC1783210wVL[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1783210wVL> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1783210wVL enumC1783210wVL = new EnumC1783210wVL("EXPAND", 0);
        EXPAND = enumC1783210wVL;
        EnumC1783210wVL enumC1783210wVL2 = new EnumC1783210wVL("COLLAPSE", 1);
        COLLAPSE = enumC1783210wVL2;
        EnumC1783210wVL[] enumC1783210wVLArr = {enumC1783210wVL, enumC1783210wVL2};
        LL = enumC1783210wVLArr;
        LLILLJJLI = new C2254308sP(enumC1783210wVLArr);
    }

    public static EnumC1783210wVL[] values() {
        return (EnumC1783210wVL[]) LL.clone();
    }

    public static EnumC1783210wVL valueOf(String str) {
        return (EnumC1783210wVL) C08FF.LIZ(EnumC1783210wVL.class, str);
    }

    public EnumC1783210wVL(String str, int i) {
    }
}
