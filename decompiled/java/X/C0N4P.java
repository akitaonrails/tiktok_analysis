package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0N4P, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N4P {
    public static final /* synthetic */ C0N4P[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0N4P PRELOADER_COMPONENT_NULL;
    public static final C0N4P PRELOAD_DATA_VALID;
    public static final C0N4P SUCCESS;
    public static final C0N4P TAB_UNAVAILABLE;
    public final String LL;

    public static InterfaceC2044707zh<C0N4P> getEntries() {
        return LLILLL;
    }

    static {
        C0N4P c0n4p = new C0N4P("SUCCESS", 0, "success");
        SUCCESS = c0n4p;
        C0N4P c0n4p2 = new C0N4P("TAB_UNAVAILABLE", 1, "tab_unavailable");
        TAB_UNAVAILABLE = c0n4p2;
        C0N4P c0n4p3 = new C0N4P("PRELOADER_COMPONENT_NULL", 2, "preloader_component_null");
        PRELOADER_COMPONENT_NULL = c0n4p3;
        C0N4P c0n4p4 = new C0N4P("PRELOAD_DATA_VALID", 3, "preload_data_valid");
        PRELOAD_DATA_VALID = c0n4p4;
        C0N4P[] c0n4pArr = {c0n4p, c0n4p2, c0n4p3, c0n4p4};
        LLILLJJLI = c0n4pArr;
        LLILLL = new C2254308sP(c0n4pArr);
    }

    public static C0N4P[] values() {
        return (C0N4P[]) LLILLJJLI.clone();
    }

    public final String getStatusStr() {
        return this.LL;
    }

    public static C0N4P valueOf(String str) {
        return (C0N4P) C08FF.LIZ(C0N4P.class, str);
    }

    public C0N4P(String str, int i, String str2) {
        this.LL = str2;
    }
}
