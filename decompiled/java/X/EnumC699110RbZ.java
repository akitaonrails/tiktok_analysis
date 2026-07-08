package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0RbZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class EnumC699110RbZ {
    public static final EnumC699110RbZ BIZ_ENABLE;
    public static final EnumC699110RbZ CHECKER_ACTIVE;
    public static final EnumC699110RbZ CHECKER_DENSITY;
    public static final EnumC699110RbZ CHECKER_ENABLE;
    public static final EnumC699110RbZ CHECKER_SIGNAL;
    public static final EnumC699110RbZ CONTAINERAVOID;
    public static final EnumC699110RbZ FINALFILTER;
    public static final EnumC699110RbZ FINALSHOW;
    public static final EnumC699110RbZ GLOBALAVOID;
    public static final /* synthetic */ EnumC699110RbZ[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC699110RbZ N2ONE;
    public static final EnumC699110RbZ OUTREACH_ENABLE;
    public static final EnumC699110RbZ PENDING;
    public static final EnumC699110RbZ STANDARDAVOID;
    public final String LL;

    public static InterfaceC2044707zh<EnumC699110RbZ> getEntries() {
        return LLILLL;
    }

    static {
        EnumC699110RbZ enumC699110RbZ = new EnumC699110RbZ("BIZ_ENABLE", 0, "enable");
        BIZ_ENABLE = enumC699110RbZ;
        EnumC699110RbZ enumC699110RbZ2 = new EnumC699110RbZ("OUTREACH_ENABLE", 1, "enable");
        OUTREACH_ENABLE = enumC699110RbZ2;
        EnumC699110RbZ enumC699110RbZ3 = new EnumC699110RbZ("CHECKER_ENABLE", 2, "checker_enable");
        CHECKER_ENABLE = enumC699110RbZ3;
        EnumC699110RbZ enumC699110RbZ4 = new EnumC699110RbZ("CHECKER_SIGNAL", 3, "checker_signal");
        CHECKER_SIGNAL = enumC699110RbZ4;
        EnumC699110RbZ enumC699110RbZ5 = new EnumC699110RbZ("CHECKER_DENSITY", 4, "checker_density");
        CHECKER_DENSITY = enumC699110RbZ5;
        EnumC699110RbZ enumC699110RbZ6 = new EnumC699110RbZ("CHECKER_ACTIVE", 5, "checker_active");
        CHECKER_ACTIVE = enumC699110RbZ6;
        EnumC699110RbZ enumC699110RbZ7 = new EnumC699110RbZ("STANDARDAVOID", 6, "standard");
        STANDARDAVOID = enumC699110RbZ7;
        EnumC699110RbZ enumC699110RbZ8 = new EnumC699110RbZ("N2ONE", 7, "N to 1");
        N2ONE = enumC699110RbZ8;
        EnumC699110RbZ enumC699110RbZ9 = new EnumC699110RbZ("CONTAINERAVOID", 8, "container_avoid");
        CONTAINERAVOID = enumC699110RbZ9;
        EnumC699110RbZ enumC699110RbZ10 = new EnumC699110RbZ("GLOBALAVOID", 9, "global_avoid");
        GLOBALAVOID = enumC699110RbZ10;
        EnumC699110RbZ enumC699110RbZ11 = new EnumC699110RbZ("FINALFILTER", 10, "final_filter");
        FINALFILTER = enumC699110RbZ11;
        EnumC699110RbZ enumC699110RbZ12 = new EnumC699110RbZ("FINALSHOW", 11, "show");
        FINALSHOW = enumC699110RbZ12;
        EnumC699110RbZ enumC699110RbZ13 = new EnumC699110RbZ("PENDING", 12, "pending_result");
        PENDING = enumC699110RbZ13;
        EnumC699110RbZ[] enumC699110RbZArr = {enumC699110RbZ, enumC699110RbZ2, enumC699110RbZ3, enumC699110RbZ4, enumC699110RbZ5, enumC699110RbZ6, enumC699110RbZ7, enumC699110RbZ8, enumC699110RbZ9, enumC699110RbZ10, enumC699110RbZ11, enumC699110RbZ12, enumC699110RbZ13};
        LLILLJJLI = enumC699110RbZArr;
        LLILLL = new C2254308sP(enumC699110RbZArr);
    }

    public static EnumC699110RbZ[] values() {
        return (EnumC699110RbZ[]) LLILLJJLI.clone();
    }

    public final String getDesc() {
        return this.LL;
    }

    public static EnumC699110RbZ valueOf(String str) {
        return (EnumC699110RbZ) C08FF.LIZ(EnumC699110RbZ.class, str);
    }

    public EnumC699110RbZ(String str, int i, String str2) {
        this.LL = str2;
    }
}
