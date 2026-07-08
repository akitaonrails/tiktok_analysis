package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0xWg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1822480xWg {
    public static final EnumC1822480xWg FETCH_CACHE_THEN_CATCH_IN_FLIGHT_RESPONSE;
    public static final EnumC1822480xWg FETCH_CACHE_THEN_FETCH_REMOTE;
    public static final EnumC1822480xWg FETCH_FROM_CACHE_ONLY;
    public static final EnumC1822480xWg FETCH_REMOTE_ONLY_WHEN_NO_CACHE;
    public static final EnumC1822480xWg IGNORE_CACHE;
    public static final /* synthetic */ EnumC1822480xWg[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1822480xWg> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1822480xWg enumC1822480xWg = new EnumC1822480xWg("FETCH_CACHE_THEN_FETCH_REMOTE", 0);
        FETCH_CACHE_THEN_FETCH_REMOTE = enumC1822480xWg;
        EnumC1822480xWg enumC1822480xWg2 = new EnumC1822480xWg("IGNORE_CACHE", 1);
        IGNORE_CACHE = enumC1822480xWg2;
        EnumC1822480xWg enumC1822480xWg3 = new EnumC1822480xWg("FETCH_FROM_CACHE_ONLY", 2);
        FETCH_FROM_CACHE_ONLY = enumC1822480xWg3;
        EnumC1822480xWg enumC1822480xWg4 = new EnumC1822480xWg("FETCH_REMOTE_ONLY_WHEN_NO_CACHE", 3);
        FETCH_REMOTE_ONLY_WHEN_NO_CACHE = enumC1822480xWg4;
        EnumC1822480xWg enumC1822480xWg5 = new EnumC1822480xWg("FETCH_CACHE_THEN_CATCH_IN_FLIGHT_RESPONSE", 4);
        FETCH_CACHE_THEN_CATCH_IN_FLIGHT_RESPONSE = enumC1822480xWg5;
        EnumC1822480xWg[] enumC1822480xWgArr = {enumC1822480xWg, enumC1822480xWg2, enumC1822480xWg3, enumC1822480xWg4, enumC1822480xWg5};
        LL = enumC1822480xWgArr;
        LLILLJJLI = new C2254308sP(enumC1822480xWgArr);
    }

    public static EnumC1822480xWg[] values() {
        return (EnumC1822480xWg[]) LL.clone();
    }

    public static EnumC1822480xWg valueOf(String str) {
        return (EnumC1822480xWg) C08FF.LIZ(EnumC1822480xWg.class, str);
    }

    public EnumC1822480xWg(String str, int i) {
    }
}
