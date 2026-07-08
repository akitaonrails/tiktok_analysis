package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0EyP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC382030EyP {
    public static final EnumC382030EyP CANCEL;
    public static final EnumC382030EyP CANCEL_AND_DELETE;
    public static final EnumC382030EyP EXECUTE_IF_NEEDED;
    public static final /* synthetic */ EnumC382030EyP[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC382030EyP RESTORE;
    public static final EnumC382030EyP RETRY;
    public static final EnumC382030EyP STOP;
    public static final EnumC382030EyP STOP_FAILED;

    public static InterfaceC2044707zh<EnumC382030EyP> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC382030EyP enumC382030EyP = new EnumC382030EyP("CANCEL", 0);
        CANCEL = enumC382030EyP;
        EnumC382030EyP enumC382030EyP2 = new EnumC382030EyP("STOP", 1);
        STOP = enumC382030EyP2;
        EnumC382030EyP enumC382030EyP3 = new EnumC382030EyP("STOP_FAILED", 2);
        STOP_FAILED = enumC382030EyP3;
        EnumC382030EyP enumC382030EyP4 = new EnumC382030EyP("RETRY", 3);
        RETRY = enumC382030EyP4;
        EnumC382030EyP enumC382030EyP5 = new EnumC382030EyP("RESTORE", 4);
        RESTORE = enumC382030EyP5;
        EnumC382030EyP enumC382030EyP6 = new EnumC382030EyP("EXECUTE_IF_NEEDED", 5);
        EXECUTE_IF_NEEDED = enumC382030EyP6;
        EnumC382030EyP enumC382030EyP7 = new EnumC382030EyP("CANCEL_AND_DELETE", 6);
        CANCEL_AND_DELETE = enumC382030EyP7;
        EnumC382030EyP[] enumC382030EyPArr = {enumC382030EyP, enumC382030EyP2, enumC382030EyP3, enumC382030EyP4, enumC382030EyP5, enumC382030EyP6, enumC382030EyP7};
        LL = enumC382030EyPArr;
        LLILLJJLI = new C2254308sP(enumC382030EyPArr);
    }

    public static EnumC382030EyP[] values() {
        return (EnumC382030EyP[]) LL.clone();
    }

    public static EnumC382030EyP valueOf(String str) {
        return (EnumC382030EyP) C08FF.LIZ(EnumC382030EyP.class, str);
    }

    public EnumC382030EyP(String str, int i) {
    }
}
