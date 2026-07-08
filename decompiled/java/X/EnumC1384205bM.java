package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.05bM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC1384205bM {
    public static final EnumC1384205bM Default;
    public static final /* synthetic */ EnumC1384205bM[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1384205bM PreventUserInput;
    public static final EnumC1384205bM UserInput;

    public static InterfaceC2044707zh<EnumC1384205bM> getEntries() {
        return LLILLJJLI;
    }

    public static EnumC1384205bM valueOf(String str) {
        return (EnumC1384205bM) C08FF.LIZ(EnumC1384205bM.class, str);
    }

    public static EnumC1384205bM[] values() {
        return (EnumC1384205bM[]) LL.clone();
    }

    static {
        EnumC1384205bM enumC1384205bM = new EnumC1384205bM("Default", 0);
        Default = enumC1384205bM;
        EnumC1384205bM enumC1384205bM2 = new EnumC1384205bM("UserInput", 1);
        UserInput = enumC1384205bM2;
        EnumC1384205bM enumC1384205bM3 = new EnumC1384205bM("PreventUserInput", 2);
        PreventUserInput = enumC1384205bM3;
        EnumC1384205bM[] enumC1384205bMArr = {enumC1384205bM, enumC1384205bM2, enumC1384205bM3};
        LL = enumC1384205bMArr;
        LLILLJJLI = new C2254308sP(enumC1384205bMArr);
    }

    public EnumC1384205bM(String str, int i) {
    }
}
