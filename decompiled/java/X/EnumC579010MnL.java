package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0MnL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC579010MnL {
    public static final EnumC579010MnL LL;
    public static final EnumC579010MnL LLILLJJLI;
    public static final /* synthetic */ EnumC579010MnL[] LLILLL;

    static {
        EnumC579010MnL enumC579010MnL = new EnumC579010MnL("STOP", 0);
        LL = enumC579010MnL;
        EnumC579010MnL enumC579010MnL2 = new EnumC579010MnL("GO_NEXT", 1);
        LLILLJJLI = enumC579010MnL2;
        EnumC579010MnL[] enumC579010MnLArr = {enumC579010MnL, enumC579010MnL2};
        LLILLL = enumC579010MnLArr;
        new C2254308sP(enumC579010MnLArr);
    }

    public static EnumC579010MnL[] values() {
        return (EnumC579010MnL[]) LLILLL.clone();
    }

    public static EnumC579010MnL valueOf(String str) {
        return (EnumC579010MnL) C08FF.LIZ(EnumC579010MnL.class, str);
    }

    public EnumC579010MnL(String str, int i) {
    }
}
