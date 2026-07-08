package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00zL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC258900zL {
    public static final EnumC258900zL ALL_RESOLVED;
    public static final EnumC258900zL AWAITING;
    public static final EnumC258900zL IDLE;
    public static final /* synthetic */ EnumC258900zL[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC258900zL LONG_LIVING;
    public static final EnumC258900zL ONE_SETTLED;
    public static final EnumC258900zL ONGOING;

    public static InterfaceC2044707zh<EnumC258900zL> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC258900zL enumC258900zL = new EnumC258900zL("ONGOING", 0);
        ONGOING = enumC258900zL;
        EnumC258900zL enumC258900zL2 = new EnumC258900zL("AWAITING", 1);
        AWAITING = enumC258900zL2;
        EnumC258900zL enumC258900zL3 = new EnumC258900zL("ALL_RESOLVED", 2);
        ALL_RESOLVED = enumC258900zL3;
        EnumC258900zL enumC258900zL4 = new EnumC258900zL("LONG_LIVING", 3);
        LONG_LIVING = enumC258900zL4;
        EnumC258900zL enumC258900zL5 = new EnumC258900zL("ONE_SETTLED", 4);
        ONE_SETTLED = enumC258900zL5;
        EnumC258900zL enumC258900zL6 = new EnumC258900zL("IDLE", 5);
        IDLE = enumC258900zL6;
        EnumC258900zL[] enumC258900zLArr = {enumC258900zL, enumC258900zL2, enumC258900zL3, enumC258900zL4, enumC258900zL5, enumC258900zL6};
        LL = enumC258900zLArr;
        LLILLJJLI = new C2254308sP(enumC258900zLArr);
    }

    public static EnumC258900zL[] values() {
        return (EnumC258900zL[]) LL.clone();
    }

    public static EnumC258900zL valueOf(String str) {
        return (EnumC258900zL) C08FF.LIZ(EnumC258900zL.class, str);
    }

    public EnumC258900zL(String str, int i) {
    }
}
