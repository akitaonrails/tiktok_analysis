package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0mBM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1386420mBM {
    public static final C1386430mBN Companion;
    public static final /* synthetic */ EnumC1386420mBM[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1386420mBM MINIS_STATUS_AGE_LIMITATION;
    public static final EnumC1386420mBM MINIS_STATUS_APP_VERSION_NOT_SUPPORTED;
    public static final EnumC1386420mBM MINIS_STATUS_NO_PERMISSION;
    public static final EnumC1386420mBM MINIS_STATUS_OFFLINE;
    public static final EnumC1386420mBM MINIS_STATUS_OFFLINE_BY_VIOLATION;
    public static final EnumC1386420mBM MINIS_STATUS_ONLINE;
    public static final EnumC1386420mBM MINIS_STATUS_UNKNOWN;
    public static final EnumC1386420mBM MINIS_STATUS_UNSUPPORTED_REGION;

    /* JADX INFO: renamed from: MINIS_STATUS_UPGRADE_VERSIOÔN, reason: contains not printable characters */
    public static final EnumC1386420mBM f9MINIS_STATUS_UPGRADE_VERSION;

    public static InterfaceC2044707zh<EnumC1386420mBM> getEntries() {
        return LLILLJJLI;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [X.0mBN] */
    static {
        EnumC1386420mBM enumC1386420mBM = new EnumC1386420mBM("MINIS_STATUS_UNKNOWN", 0);
        MINIS_STATUS_UNKNOWN = enumC1386420mBM;
        EnumC1386420mBM enumC1386420mBM2 = new EnumC1386420mBM("MINIS_STATUS_ONLINE", 1);
        MINIS_STATUS_ONLINE = enumC1386420mBM2;
        EnumC1386420mBM enumC1386420mBM3 = new EnumC1386420mBM("MINIS_STATUS_OFFLINE", 2);
        MINIS_STATUS_OFFLINE = enumC1386420mBM3;
        EnumC1386420mBM enumC1386420mBM4 = new EnumC1386420mBM("MINIS_STATUS_NO_PERMISSION", 3);
        MINIS_STATUS_NO_PERMISSION = enumC1386420mBM4;
        EnumC1386420mBM enumC1386420mBM5 = new EnumC1386420mBM("MINIS_STATUS_UNSUPPORTED_REGION", 4);
        MINIS_STATUS_UNSUPPORTED_REGION = enumC1386420mBM5;
        EnumC1386420mBM enumC1386420mBM6 = new EnumC1386420mBM("MINIS_STATUS_AGE_LIMITATION", 5);
        MINIS_STATUS_AGE_LIMITATION = enumC1386420mBM6;
        EnumC1386420mBM enumC1386420mBM7 = new EnumC1386420mBM("MINIS_STATUS_UPGRADE_VERSIOÔN", 6);
        f9MINIS_STATUS_UPGRADE_VERSION = enumC1386420mBM7;
        EnumC1386420mBM enumC1386420mBM8 = new EnumC1386420mBM("MINIS_STATUS_APP_VERSION_NOT_SUPPORTED", 7);
        MINIS_STATUS_APP_VERSION_NOT_SUPPORTED = enumC1386420mBM8;
        EnumC1386420mBM enumC1386420mBM9 = new EnumC1386420mBM("MINIS_STATUS_OFFLINE_BY_VIOLATION", 8);
        MINIS_STATUS_OFFLINE_BY_VIOLATION = enumC1386420mBM9;
        EnumC1386420mBM[] enumC1386420mBMArr = {enumC1386420mBM, enumC1386420mBM2, enumC1386420mBM3, enumC1386420mBM4, enumC1386420mBM5, enumC1386420mBM6, enumC1386420mBM7, enumC1386420mBM8, enumC1386420mBM9};
        LL = enumC1386420mBMArr;
        LLILLJJLI = new C2254308sP(enumC1386420mBMArr);
        Companion = new Object() { // from class: X.0mBN
        };
    }

    public static EnumC1386420mBM[] values() {
        return (EnumC1386420mBM[]) LL.clone();
    }

    public static EnumC1386420mBM valueOf(String str) {
        return (EnumC1386420mBM) C08FF.LIZ(EnumC1386420mBM.class, str);
    }

    public EnumC1386420mBM(String str, int i) {
    }
}
