package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0zgM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC1905360zgM {
    public static final /* synthetic */ EnumC1905360zgM[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1905360zgM ONE;
    public static final EnumC1905360zgM THREE;
    public static final EnumC1905360zgM TWO;

    public static InterfaceC2044707zh<EnumC1905360zgM> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1905360zgM enumC1905360zgM = new EnumC1905360zgM("ONE", 0);
        ONE = enumC1905360zgM;
        EnumC1905360zgM enumC1905360zgM2 = new EnumC1905360zgM("TWO", 1);
        TWO = enumC1905360zgM2;
        EnumC1905360zgM enumC1905360zgM3 = new EnumC1905360zgM("THREE", 2);
        THREE = enumC1905360zgM3;
        EnumC1905360zgM[] enumC1905360zgMArr = {enumC1905360zgM, enumC1905360zgM2, enumC1905360zgM3};
        LL = enumC1905360zgMArr;
        LLILLJJLI = new C2254308sP(enumC1905360zgMArr);
    }

    public static EnumC1905360zgM[] values() {
        return (EnumC1905360zgM[]) LL.clone();
    }

    public static EnumC1905360zgM valueOf(String str) {
        return (EnumC1905360zgM) C08FF.LIZ(EnumC1905360zgM.class, str);
    }

    public EnumC1905360zgM(String str, int i) {
    }
}
