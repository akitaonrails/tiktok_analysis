package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0lbI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1364060lbI {
    public static final EnumC1364060lbI LL;
    public static final EnumC1364060lbI LLILLJJLI;
    public static final /* synthetic */ EnumC1364060lbI[] LLILLL;

    static {
        EnumC1364060lbI enumC1364060lbI = new EnumC1364060lbI("NONE", 0);
        LL = enumC1364060lbI;
        EnumC1364060lbI enumC1364060lbI2 = new EnumC1364060lbI("SELECTED", 1);
        LLILLJJLI = enumC1364060lbI2;
        EnumC1364060lbI[] enumC1364060lbIArr = {enumC1364060lbI, enumC1364060lbI2};
        LLILLL = enumC1364060lbIArr;
        new C2254308sP(enumC1364060lbIArr);
    }

    public static EnumC1364060lbI[] values() {
        return (EnumC1364060lbI[]) LLILLL.clone();
    }

    public static EnumC1364060lbI valueOf(String str) {
        return (EnumC1364060lbI) C08FF.LIZ(EnumC1364060lbI.class, str);
    }

    public EnumC1364060lbI(String str, int i) {
    }
}
