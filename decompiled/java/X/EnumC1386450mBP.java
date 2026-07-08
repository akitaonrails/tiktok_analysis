package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0mBP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1386450mBP {
    public static final EnumC1386450mBP ERROR_AGE_GATE_LIMITATION;
    public static final EnumC1386450mBP ERROR_APP_VERSION_NOT_SUPPORTED;
    public static final EnumC1386450mBP ERROR_CANNOT_OPEN_MINIS;
    public static final EnumC1386450mBP ERROR_NATIVE_DOWNLAOD_FAILED;
    public static final EnumC1386450mBP ERROR_NETWORK_NOT_AVAILABLE;
    public static final EnumC1386450mBP ERROR_NO_PERMISSION;
    public static final EnumC1386450mBP ERROR_OFFLINE_BY_VIOLATION;
    public static final EnumC1386450mBP ERROR_OFFLINE_NOT_AVAILABLE;
    public static final EnumC1386450mBP ERROR_REGION_NOT_AVAILABLE;
    public static final /* synthetic */ EnumC1386450mBP[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1386450mBP> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1386450mBP enumC1386450mBP = new EnumC1386450mBP("ERROR_CANNOT_OPEN_MINIS", 0);
        ERROR_CANNOT_OPEN_MINIS = enumC1386450mBP;
        EnumC1386450mBP enumC1386450mBP2 = new EnumC1386450mBP("ERROR_NO_PERMISSION", 1);
        ERROR_NO_PERMISSION = enumC1386450mBP2;
        EnumC1386450mBP enumC1386450mBP3 = new EnumC1386450mBP("ERROR_REGION_NOT_AVAILABLE", 2);
        ERROR_REGION_NOT_AVAILABLE = enumC1386450mBP3;
        EnumC1386450mBP enumC1386450mBP4 = new EnumC1386450mBP("ERROR_OFFLINE_NOT_AVAILABLE", 3);
        ERROR_OFFLINE_NOT_AVAILABLE = enumC1386450mBP4;
        EnumC1386450mBP enumC1386450mBP5 = new EnumC1386450mBP("ERROR_NETWORK_NOT_AVAILABLE", 4);
        ERROR_NETWORK_NOT_AVAILABLE = enumC1386450mBP5;
        EnumC1386450mBP enumC1386450mBP6 = new EnumC1386450mBP("ERROR_AGE_GATE_LIMITATION", 5);
        ERROR_AGE_GATE_LIMITATION = enumC1386450mBP6;
        EnumC1386450mBP enumC1386450mBP7 = new EnumC1386450mBP("ERROR_APP_VERSION_NOT_SUPPORTED", 6);
        ERROR_APP_VERSION_NOT_SUPPORTED = enumC1386450mBP7;
        EnumC1386450mBP enumC1386450mBP8 = new EnumC1386450mBP("ERROR_OFFLINE_BY_VIOLATION", 7);
        ERROR_OFFLINE_BY_VIOLATION = enumC1386450mBP8;
        EnumC1386450mBP enumC1386450mBP9 = new EnumC1386450mBP("ERROR_NATIVE_DOWNLAOD_FAILED", 8);
        ERROR_NATIVE_DOWNLAOD_FAILED = enumC1386450mBP9;
        EnumC1386450mBP[] enumC1386450mBPArr = {enumC1386450mBP, enumC1386450mBP2, enumC1386450mBP3, enumC1386450mBP4, enumC1386450mBP5, enumC1386450mBP6, enumC1386450mBP7, enumC1386450mBP8, enumC1386450mBP9};
        LL = enumC1386450mBPArr;
        LLILLJJLI = new C2254308sP(enumC1386450mBPArr);
    }

    public static EnumC1386450mBP[] values() {
        return (EnumC1386450mBP[]) LL.clone();
    }

    public static EnumC1386450mBP valueOf(String str) {
        return (EnumC1386450mBP) C08FF.LIZ(EnumC1386450mBP.class, str);
    }

    public EnumC1386450mBP(String str, int i) {
    }
}
