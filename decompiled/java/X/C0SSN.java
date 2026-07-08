package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0SSN, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SSN {
    public static final C0SSN HORIZONTAL;
    public static final /* synthetic */ C0SSN[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0SSN NONE;
    public static final C0SSN VERTICAL;

    public static InterfaceC2044707zh<C0SSN> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0SSN c0ssn = new C0SSN("HORIZONTAL", 0);
        HORIZONTAL = c0ssn;
        C0SSN c0ssn2 = new C0SSN("VERTICAL", 1);
        VERTICAL = c0ssn2;
        C0SSN c0ssn3 = new C0SSN("NONE", 2);
        NONE = c0ssn3;
        C0SSN[] c0ssnArr = {c0ssn, c0ssn2, c0ssn3};
        LL = c0ssnArr;
        LLILLJJLI = new C2254308sP(c0ssnArr);
    }

    public static C0SSN[] values() {
        return (C0SSN[]) LL.clone();
    }

    public static C0SSN valueOf(String str) {
        return (C0SSN) C08FF.LIZ(C0SSN.class, str);
    }

    public C0SSN(String str, int i) {
    }
}
