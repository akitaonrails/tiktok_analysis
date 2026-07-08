package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0S4A, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0S4A {
    public static final C0S4A INVALID;
    public static final /* synthetic */ C0S4A[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0S4A VALID;
    public static final C0S4A VALID_ALARM;

    public static InterfaceC2044707zh<C0S4A> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0S4A c0s4a = new C0S4A("VALID", 0);
        VALID = c0s4a;
        C0S4A c0s4a2 = new C0S4A("VALID_ALARM", 1);
        VALID_ALARM = c0s4a2;
        C0S4A c0s4a3 = new C0S4A("INVALID", 2);
        INVALID = c0s4a3;
        C0S4A[] c0s4aArr = {c0s4a, c0s4a2, c0s4a3};
        LL = c0s4aArr;
        LLILLJJLI = new C2254308sP(c0s4aArr);
    }

    public static C0S4A[] values() {
        return (C0S4A[]) LL.clone();
    }

    public static C0S4A valueOf(String str) {
        return (C0S4A) C08FF.LIZ(C0S4A.class, str);
    }

    public C0S4A(String str, int i) {
    }
}
