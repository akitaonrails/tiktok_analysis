package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.13xr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class EnumC20181313xr {
    public static final EnumC20181313xr CACHE_HIT;
    public static final EnumC20181313xr FAILED;
    public static final EnumC20181313xr IN_FLIGHT;
    public static final /* synthetic */ EnumC20181313xr[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC20181313xr NOT_STARTED;
    public final String LL;

    public static InterfaceC2044707zh<EnumC20181313xr> getEntries() {
        return LLILLL;
    }

    static {
        EnumC20181313xr enumC20181313xr = new EnumC20181313xr("NOT_STARTED", 0, "not_started");
        NOT_STARTED = enumC20181313xr;
        EnumC20181313xr enumC20181313xr2 = new EnumC20181313xr("IN_FLIGHT", 1, "in_flight");
        IN_FLIGHT = enumC20181313xr2;
        EnumC20181313xr enumC20181313xr3 = new EnumC20181313xr("CACHE_HIT", 2, "cache_hit");
        CACHE_HIT = enumC20181313xr3;
        EnumC20181313xr enumC20181313xr4 = new EnumC20181313xr("FAILED", 3, "failed");
        FAILED = enumC20181313xr4;
        EnumC20181313xr[] enumC20181313xrArr = {enumC20181313xr, enumC20181313xr2, enumC20181313xr3, enumC20181313xr4};
        LLILLJJLI = enumC20181313xrArr;
        LLILLL = new C2254308sP(enumC20181313xrArr);
    }

    public static EnumC20181313xr[] values() {
        return (EnumC20181313xr[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC20181313xr valueOf(String str) {
        return (EnumC20181313xr) C08FF.LIZ(EnumC20181313xr.class, str);
    }

    public EnumC20181313xr(String str, int i, String str2) {
        this.LL = str2;
    }
}
