package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ZVN, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZVN {
    public static final C0ZVN IM_FEATURE_STATUS_ALLOWED;
    public static final C0ZVN IM_FEATURE_STATUS_DISALLOWED;
    public static final C0ZVN IM_FEATURE_STATUS_UNKNOWN;
    public static final /* synthetic */ C0ZVN[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<C0ZVN> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0ZVN c0zvn = new C0ZVN("IM_FEATURE_STATUS_UNKNOWN", 0);
        IM_FEATURE_STATUS_UNKNOWN = c0zvn;
        C0ZVN c0zvn2 = new C0ZVN("IM_FEATURE_STATUS_ALLOWED", 1);
        IM_FEATURE_STATUS_ALLOWED = c0zvn2;
        C0ZVN c0zvn3 = new C0ZVN("IM_FEATURE_STATUS_DISALLOWED", 2);
        IM_FEATURE_STATUS_DISALLOWED = c0zvn3;
        C0ZVN[] c0zvnArr = {c0zvn, c0zvn2, c0zvn3};
        LL = c0zvnArr;
        LLILLJJLI = new C2254308sP(c0zvnArr);
    }

    public static C0ZVN[] values() {
        return (C0ZVN[]) LL.clone();
    }

    public static C0ZVN valueOf(String str) {
        return (C0ZVN) C08FF.LIZ(C0ZVN.class, str);
    }

    public C0ZVN(String str, int i) {
    }
}
