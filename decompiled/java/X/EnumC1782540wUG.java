package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wUG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1782540wUG {
    public static final EnumC1782540wUG ACCOUNT_OPERATION;
    public static final /* synthetic */ EnumC1782540wUG[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1782540wUG SAVE_FAILURE;
    public static final EnumC1782540wUG TIME_EXPIRED;
    public static final EnumC1782540wUG USE_PRELOAD;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1782540wUG> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1782540wUG enumC1782540wUG = new EnumC1782540wUG("ACCOUNT_OPERATION", 0, 0);
        ACCOUNT_OPERATION = enumC1782540wUG;
        EnumC1782540wUG enumC1782540wUG2 = new EnumC1782540wUG("SAVE_FAILURE", 1, 1);
        SAVE_FAILURE = enumC1782540wUG2;
        EnumC1782540wUG enumC1782540wUG3 = new EnumC1782540wUG("TIME_EXPIRED", 2, 2);
        TIME_EXPIRED = enumC1782540wUG3;
        EnumC1782540wUG enumC1782540wUG4 = new EnumC1782540wUG("USE_PRELOAD", 3, 3);
        USE_PRELOAD = enumC1782540wUG4;
        EnumC1782540wUG[] enumC1782540wUGArr = {enumC1782540wUG, enumC1782540wUG2, enumC1782540wUG3, enumC1782540wUG4};
        LLILLJJLI = enumC1782540wUGArr;
        LLILLL = new C2254308sP(enumC1782540wUGArr);
    }

    public static EnumC1782540wUG[] values() {
        return (EnumC1782540wUG[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1782540wUG valueOf(String str) {
        return (EnumC1782540wUG) C08FF.LIZ(EnumC1782540wUG.class, str);
    }

    public EnumC1782540wUG(String str, int i, int i2) {
        this.LL = i2;
    }
}
