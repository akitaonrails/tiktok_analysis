package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0eIR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1083290eIR {
    public static final /* synthetic */ EnumC1083290eIR[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1083290eIR P0;
    public static final EnumC1083290eIR P1;
    public static final EnumC1083290eIR P2;
    public static final EnumC1083290eIR P3;

    public static InterfaceC2044707zh<EnumC1083290eIR> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1083290eIR enumC1083290eIR = new EnumC1083290eIR("P3", 0);
        P3 = enumC1083290eIR;
        EnumC1083290eIR enumC1083290eIR2 = new EnumC1083290eIR("P2", 1);
        P2 = enumC1083290eIR2;
        EnumC1083290eIR enumC1083290eIR3 = new EnumC1083290eIR("P1", 2);
        P1 = enumC1083290eIR3;
        EnumC1083290eIR enumC1083290eIR4 = new EnumC1083290eIR("P0", 3);
        P0 = enumC1083290eIR4;
        EnumC1083290eIR[] enumC1083290eIRArr = {enumC1083290eIR, enumC1083290eIR2, enumC1083290eIR3, enumC1083290eIR4};
        LL = enumC1083290eIRArr;
        LLILLJJLI = new C2254308sP(enumC1083290eIRArr);
    }

    public static EnumC1083290eIR[] values() {
        return (EnumC1083290eIR[]) LL.clone();
    }

    public static EnumC1083290eIR valueOf(String str) {
        return (EnumC1083290eIR) C08FF.LIZ(EnumC1083290eIR.class, str);
    }

    public EnumC1083290eIR(String str, int i) {
    }
}
