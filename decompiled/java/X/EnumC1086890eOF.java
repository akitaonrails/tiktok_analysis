package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0eOF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1086890eOF {
    public static final EnumC1086890eOF FIRST;
    public static final /* synthetic */ EnumC1086890eOF[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1086890eOF NOT_POLLING;
    public static final EnumC1086890eOF POLLING;

    public static InterfaceC2044707zh<EnumC1086890eOF> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1086890eOF enumC1086890eOF = new EnumC1086890eOF("FIRST", 0);
        FIRST = enumC1086890eOF;
        EnumC1086890eOF enumC1086890eOF2 = new EnumC1086890eOF("POLLING", 1);
        POLLING = enumC1086890eOF2;
        EnumC1086890eOF enumC1086890eOF3 = new EnumC1086890eOF("NOT_POLLING", 2);
        NOT_POLLING = enumC1086890eOF3;
        EnumC1086890eOF[] enumC1086890eOFArr = {enumC1086890eOF, enumC1086890eOF2, enumC1086890eOF3};
        LL = enumC1086890eOFArr;
        LLILLJJLI = new C2254308sP(enumC1086890eOFArr);
    }

    public static EnumC1086890eOF[] values() {
        return (EnumC1086890eOF[]) LL.clone();
    }

    public static EnumC1086890eOF valueOf(String str) {
        return (EnumC1086890eOF) C08FF.LIZ(EnumC1086890eOF.class, str);
    }

    public EnumC1086890eOF(String str, int i) {
    }
}
