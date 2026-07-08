package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0FO2, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FO2 {
    public static final C0FO2 ERROR;
    public static final C0FO2 IDLE;
    public static final /* synthetic */ C0FO2[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0FO2 LOADING;
    public static final C0FO2 SUCCESS;

    public static InterfaceC2044707zh<C0FO2> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0FO2 c0fo2 = new C0FO2("IDLE", 0);
        IDLE = c0fo2;
        C0FO2 c0fo22 = new C0FO2("LOADING", 1);
        LOADING = c0fo22;
        C0FO2 c0fo23 = new C0FO2("SUCCESS", 2);
        SUCCESS = c0fo23;
        C0FO2 c0fo24 = new C0FO2("ERROR", 3);
        ERROR = c0fo24;
        C0FO2[] c0fo2Arr = {c0fo2, c0fo22, c0fo23, c0fo24};
        LL = c0fo2Arr;
        LLILLJJLI = new C2254308sP(c0fo2Arr);
    }

    public static C0FO2[] values() {
        return (C0FO2[]) LL.clone();
    }

    public static C0FO2 valueOf(String str) {
        return (C0FO2) C08FF.LIZ(C0FO2.class, str);
    }

    public C0FO2(String str, int i) {
    }
}
