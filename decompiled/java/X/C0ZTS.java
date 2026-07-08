package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ZTS, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZTS {
    public static final C0ZTS JOIN;
    public static final /* synthetic */ C0ZTS[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0ZTS OPEN_DETAIL;

    public static InterfaceC2044707zh<C0ZTS> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0ZTS c0zts = new C0ZTS("OPEN_DETAIL", 0);
        OPEN_DETAIL = c0zts;
        C0ZTS c0zts2 = new C0ZTS("JOIN", 1);
        JOIN = c0zts2;
        C0ZTS[] c0ztsArr = {c0zts, c0zts2};
        LL = c0ztsArr;
        LLILLJJLI = new C2254308sP(c0ztsArr);
    }

    public static C0ZTS[] values() {
        return (C0ZTS[]) LL.clone();
    }

    public static C0ZTS valueOf(String str) {
        return (C0ZTS) C08FF.LIZ(C0ZTS.class, str);
    }

    public C0ZTS(String str, int i) {
    }
}
