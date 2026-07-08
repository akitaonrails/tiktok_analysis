package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.08xr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2288108xr {
    public static final EnumC2288108xr DECODING;
    public static final EnumC2288108xr FAILED;
    public static final /* synthetic */ EnumC2288108xr[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC2288108xr NONE;
    public static final EnumC2288108xr PREPARED;
    public static final EnumC2288108xr SUCCESS;
    public static final EnumC2288108xr UPLOADING;

    public static InterfaceC2044707zh<EnumC2288108xr> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC2288108xr enumC2288108xr = new EnumC2288108xr("NONE", 0);
        NONE = enumC2288108xr;
        EnumC2288108xr enumC2288108xr2 = new EnumC2288108xr("PREPARED", 1);
        PREPARED = enumC2288108xr2;
        EnumC2288108xr enumC2288108xr3 = new EnumC2288108xr("DECODING", 2);
        DECODING = enumC2288108xr3;
        EnumC2288108xr enumC2288108xr4 = new EnumC2288108xr("UPLOADING", 3);
        UPLOADING = enumC2288108xr4;
        EnumC2288108xr enumC2288108xr5 = new EnumC2288108xr("SUCCESS", 4);
        SUCCESS = enumC2288108xr5;
        EnumC2288108xr enumC2288108xr6 = new EnumC2288108xr("FAILED", 5);
        FAILED = enumC2288108xr6;
        EnumC2288108xr[] enumC2288108xrArr = {enumC2288108xr, enumC2288108xr2, enumC2288108xr3, enumC2288108xr4, enumC2288108xr5, enumC2288108xr6};
        LL = enumC2288108xrArr;
        LLILLJJLI = new C2254308sP(enumC2288108xrArr);
    }

    public static EnumC2288108xr[] values() {
        return (EnumC2288108xr[]) LL.clone();
    }

    public static EnumC2288108xr valueOf(String str) {
        return (EnumC2288108xr) C08FF.LIZ(EnumC2288108xr.class, str);
    }

    public EnumC2288108xr(String str, int i) {
    }
}
