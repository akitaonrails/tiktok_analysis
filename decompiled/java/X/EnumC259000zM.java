package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00zM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC259000zM {
    public static final EnumC259000zM ALL_RESOLVED;
    public static final EnumC259000zM AWAITING;
    public static final EnumC259000zM IDLE;
    public static final /* synthetic */ EnumC259000zM[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC259000zM LONG_LIVING;
    public static final EnumC259000zM ONE_SETTLED;
    public static final EnumC259000zM ONGOING;

    public static InterfaceC2044707zh<EnumC259000zM> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC259000zM enumC259000zM = new EnumC259000zM("ONGOING", 0);
        ONGOING = enumC259000zM;
        EnumC259000zM enumC259000zM2 = new EnumC259000zM("AWAITING", 1);
        AWAITING = enumC259000zM2;
        EnumC259000zM enumC259000zM3 = new EnumC259000zM("ALL_RESOLVED", 2);
        ALL_RESOLVED = enumC259000zM3;
        EnumC259000zM enumC259000zM4 = new EnumC259000zM("LONG_LIVING", 3);
        LONG_LIVING = enumC259000zM4;
        EnumC259000zM enumC259000zM5 = new EnumC259000zM("ONE_SETTLED", 4);
        ONE_SETTLED = enumC259000zM5;
        EnumC259000zM enumC259000zM6 = new EnumC259000zM("IDLE", 5);
        IDLE = enumC259000zM6;
        EnumC259000zM[] enumC259000zMArr = {enumC259000zM, enumC259000zM2, enumC259000zM3, enumC259000zM4, enumC259000zM5, enumC259000zM6};
        LL = enumC259000zMArr;
        LLILLJJLI = new C2254308sP(enumC259000zMArr);
    }

    public static EnumC259000zM[] values() {
        return (EnumC259000zM[]) LL.clone();
    }

    public static EnumC259000zM valueOf(String str) {
        return (EnumC259000zM) C08FF.LIZ(EnumC259000zM.class, str);
    }

    public EnumC259000zM(String str, int i) {
    }
}
