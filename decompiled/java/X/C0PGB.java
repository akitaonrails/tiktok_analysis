package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0PGB, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PGB {
    public static final C0PGB INFLOW_REQUEST_END;
    public static final C0PGB INFLOW_REQUEST_START;
    public static final /* synthetic */ C0PGB[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0PGB OUT_DATA_END;
    public static final C0PGB OUT_DATA_START;

    public static InterfaceC2044707zh<C0PGB> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0PGB c0pgb = new C0PGB("INFLOW_REQUEST_START", 0);
        INFLOW_REQUEST_START = c0pgb;
        C0PGB c0pgb2 = new C0PGB("INFLOW_REQUEST_END", 1);
        INFLOW_REQUEST_END = c0pgb2;
        C0PGB c0pgb3 = new C0PGB("OUT_DATA_START", 2);
        OUT_DATA_START = c0pgb3;
        C0PGB c0pgb4 = new C0PGB("OUT_DATA_END", 3);
        OUT_DATA_END = c0pgb4;
        C0PGB[] c0pgbArr = {c0pgb, c0pgb2, c0pgb3, c0pgb4};
        LL = c0pgbArr;
        LLILLJJLI = new C2254308sP(c0pgbArr);
    }

    public static C0PGB[] values() {
        return (C0PGB[]) LL.clone();
    }

    public static C0PGB valueOf(String str) {
        return (C0PGB) C08FF.LIZ(C0PGB.class, str);
    }

    public C0PGB(String str, int i) {
    }
}
