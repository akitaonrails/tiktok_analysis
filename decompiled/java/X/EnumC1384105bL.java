package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.05bL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC1384105bL {
    public static final EnumC1384105bL Default;
    public static final /* synthetic */ EnumC1384105bL[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1384105bL PreventUserInput;
    public static final EnumC1384105bL UserInput;

    public static InterfaceC2044707zh<EnumC1384105bL> getEntries() {
        return LLILLJJLI;
    }

    public static EnumC1384105bL valueOf(String str) {
        return (EnumC1384105bL) C08FF.LIZ(EnumC1384105bL.class, str);
    }

    public static EnumC1384105bL[] values() {
        return (EnumC1384105bL[]) LL.clone();
    }

    static {
        EnumC1384105bL enumC1384105bL = new EnumC1384105bL("Default", 0);
        Default = enumC1384105bL;
        EnumC1384105bL enumC1384105bL2 = new EnumC1384105bL("UserInput", 1);
        UserInput = enumC1384105bL2;
        EnumC1384105bL enumC1384105bL3 = new EnumC1384105bL("PreventUserInput", 2);
        PreventUserInput = enumC1384105bL3;
        EnumC1384105bL[] enumC1384105bLArr = {enumC1384105bL, enumC1384105bL2, enumC1384105bL3};
        LL = enumC1384105bLArr;
        LLILLJJLI = new C2254308sP(enumC1384105bLArr);
    }

    public EnumC1384105bL(String str, int i) {
    }
}
