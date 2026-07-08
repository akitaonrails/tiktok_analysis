package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ofF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1481830ofF {
    public static final EnumC1481830ofF CONVIA;
    public static final EnumC1481830ofF DT;
    public static final EnumC1481830ofF DT_AND_CONVIA;
    public static final /* synthetic */ EnumC1481830ofF[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1481830ofF> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1481830ofF enumC1481830ofF = new EnumC1481830ofF("DT", 0);
        DT = enumC1481830ofF;
        EnumC1481830ofF enumC1481830ofF2 = new EnumC1481830ofF("CONVIA", 1);
        CONVIA = enumC1481830ofF2;
        EnumC1481830ofF enumC1481830ofF3 = new EnumC1481830ofF("DT_AND_CONVIA", 2);
        DT_AND_CONVIA = enumC1481830ofF3;
        EnumC1481830ofF[] enumC1481830ofFArr = {enumC1481830ofF, enumC1481830ofF2, enumC1481830ofF3};
        LL = enumC1481830ofFArr;
        LLILLJJLI = new C2254308sP(enumC1481830ofFArr);
    }

    public static EnumC1481830ofF[] values() {
        return (EnumC1481830ofF[]) LL.clone();
    }

    public static EnumC1481830ofF valueOf(String str) {
        return (EnumC1481830ofF) C08FF.LIZ(EnumC1481830ofF.class, str);
    }

    public EnumC1481830ofF(String str, int i) {
    }
}
