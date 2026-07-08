package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0zcE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC1902800zcE {
    public static final EnumC1902800zcE CLICK_THROUGH;
    public static final EnumC1902800zcE CLOSE;
    public static final /* synthetic */ EnumC1902800zcE[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1902800zcE REAL_CELL_CLICK;

    public static InterfaceC2044707zh<EnumC1902800zcE> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1902800zcE enumC1902800zcE = new EnumC1902800zcE("CLOSE", 0);
        CLOSE = enumC1902800zcE;
        EnumC1902800zcE enumC1902800zcE2 = new EnumC1902800zcE("CLICK_THROUGH", 1);
        CLICK_THROUGH = enumC1902800zcE2;
        EnumC1902800zcE enumC1902800zcE3 = new EnumC1902800zcE("REAL_CELL_CLICK", 2);
        REAL_CELL_CLICK = enumC1902800zcE3;
        EnumC1902800zcE[] enumC1902800zcEArr = {enumC1902800zcE, enumC1902800zcE2, enumC1902800zcE3};
        LL = enumC1902800zcEArr;
        LLILLJJLI = new C2254308sP(enumC1902800zcEArr);
    }

    public static EnumC1902800zcE[] values() {
        return (EnumC1902800zcE[]) LL.clone();
    }

    public static EnumC1902800zcE valueOf(String str) {
        return (EnumC1902800zcE) C08FF.LIZ(EnumC1902800zcE.class, str);
    }

    public EnumC1902800zcE(String str, int i) {
    }
}
