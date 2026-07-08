package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0JMN, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JMN {
    public static final C0JMN AVAILABLE;
    public static final C0JMN FETCHING;
    public static final /* synthetic */ C0JMN[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0JMN NOT_AVAILABLE;

    public static InterfaceC2044707zh<C0JMN> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0JMN c0jmn = new C0JMN("NOT_AVAILABLE", 0);
        NOT_AVAILABLE = c0jmn;
        C0JMN c0jmn2 = new C0JMN("FETCHING", 1);
        FETCHING = c0jmn2;
        C0JMN c0jmn3 = new C0JMN("AVAILABLE", 2);
        AVAILABLE = c0jmn3;
        C0JMN[] c0jmnArr = {c0jmn, c0jmn2, c0jmn3};
        LL = c0jmnArr;
        LLILLJJLI = new C2254308sP(c0jmnArr);
    }

    public static C0JMN[] values() {
        return (C0JMN[]) LL.clone();
    }

    public static C0JMN valueOf(String str) {
        return (C0JMN) C08FF.LIZ(C0JMN.class, str);
    }

    public C0JMN(String str, int i) {
    }
}
