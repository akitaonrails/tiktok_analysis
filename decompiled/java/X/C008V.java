package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.008V, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C008V {
    public static final C008V ERROR_DEFAULT;
    public static final C008V ERROR_EXPIRED;
    public static final C008V ERROR_RESTRICTED;
    public static final /* synthetic */ C008V[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<C008V> getEntries() {
        return LLILLJJLI;
    }

    static {
        C008V c008v = new C008V("ERROR_DEFAULT", 0);
        ERROR_DEFAULT = c008v;
        C008V c008v2 = new C008V("ERROR_EXPIRED", 1);
        ERROR_EXPIRED = c008v2;
        C008V c008v3 = new C008V("ERROR_RESTRICTED", 2);
        ERROR_RESTRICTED = c008v3;
        C008V[] c008vArr = {c008v, c008v2, c008v3};
        LL = c008vArr;
        LLILLJJLI = new C2254308sP(c008vArr);
    }

    public static C008V[] values() {
        return (C008V[]) LL.clone();
    }

    public static C008V valueOf(String str) {
        return (C008V) C08FF.LIZ(C008V.class, str);
    }

    public C008V(String str, int i) {
    }
}
