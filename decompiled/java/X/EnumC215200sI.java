package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00sI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC215200sI {
    public static final EnumC215200sI FEED_SIDEBAR;
    public static final /* synthetic */ EnumC215200sI[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC215200sI PROFILE_SIDEBAR;

    public static InterfaceC2044707zh<EnumC215200sI> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC215200sI enumC215200sI = new EnumC215200sI("PROFILE_SIDEBAR", 0);
        PROFILE_SIDEBAR = enumC215200sI;
        EnumC215200sI enumC215200sI2 = new EnumC215200sI("FEED_SIDEBAR", 1);
        FEED_SIDEBAR = enumC215200sI2;
        EnumC215200sI[] enumC215200sIArr = {enumC215200sI, enumC215200sI2};
        LL = enumC215200sIArr;
        LLILLJJLI = new C2254308sP(enumC215200sIArr);
    }

    public static EnumC215200sI[] values() {
        return (EnumC215200sI[]) LL.clone();
    }

    public static EnumC215200sI valueOf(String str) {
        return (EnumC215200sI) C08FF.LIZ(EnumC215200sI.class, str);
    }

    public EnumC215200sI(String str, int i) {
    }
}
