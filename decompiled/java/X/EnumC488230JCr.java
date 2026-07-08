package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0JCr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC488230JCr {
    public static final EnumC488230JCr DATA_READY;
    public static final EnumC488230JCr FAIL;
    public static final EnumC488230JCr FAIL_LANDING;
    public static final EnumC488230JCr FAIL_TNS;
    public static final EnumC488230JCr INITIALIZED;
    public static final EnumC488230JCr IN_CACHE;
    public static final /* synthetic */ EnumC488230JCr[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC488230JCr LOADING;
    public static final EnumC488230JCr STREAMING;
    public static final EnumC488230JCr SUCCESS;

    public static InterfaceC2044707zh<EnumC488230JCr> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC488230JCr enumC488230JCr = new EnumC488230JCr("INITIALIZED", 0);
        INITIALIZED = enumC488230JCr;
        EnumC488230JCr enumC488230JCr2 = new EnumC488230JCr("LOADING", 1);
        LOADING = enumC488230JCr2;
        EnumC488230JCr enumC488230JCr3 = new EnumC488230JCr("STREAMING", 2);
        STREAMING = enumC488230JCr3;
        EnumC488230JCr enumC488230JCr4 = new EnumC488230JCr("DATA_READY", 3);
        DATA_READY = enumC488230JCr4;
        EnumC488230JCr enumC488230JCr5 = new EnumC488230JCr("SUCCESS", 4);
        SUCCESS = enumC488230JCr5;
        EnumC488230JCr enumC488230JCr6 = new EnumC488230JCr("IN_CACHE", 5);
        IN_CACHE = enumC488230JCr6;
        EnumC488230JCr enumC488230JCr7 = new EnumC488230JCr("FAIL", 6);
        FAIL = enumC488230JCr7;
        EnumC488230JCr enumC488230JCr8 = new EnumC488230JCr("FAIL_LANDING", 7);
        FAIL_LANDING = enumC488230JCr8;
        EnumC488230JCr enumC488230JCr9 = new EnumC488230JCr("FAIL_TNS", 8);
        FAIL_TNS = enumC488230JCr9;
        EnumC488230JCr[] enumC488230JCrArr = {enumC488230JCr, enumC488230JCr2, enumC488230JCr3, enumC488230JCr4, enumC488230JCr5, enumC488230JCr6, enumC488230JCr7, enumC488230JCr8, enumC488230JCr9};
        LL = enumC488230JCrArr;
        LLILLJJLI = new C2254308sP(enumC488230JCrArr);
    }

    public static EnumC488230JCr[] values() {
        return (EnumC488230JCr[]) LL.clone();
    }

    public static EnumC488230JCr valueOf(String str) {
        return (EnumC488230JCr) C08FF.LIZ(EnumC488230JCr.class, str);
    }

    public final boolean isAtLeast(EnumC488230JCr enumC488230JCr) {
        if (compareTo(enumC488230JCr) >= 0) {
            return true;
        }
        return false;
    }

    public EnumC488230JCr(String str, int i) {
    }
}
