package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0DCO, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DCO {
    public static final C0DCO ACCOUNT_SWITCHED;
    public static final /* synthetic */ C0DCO[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0DCO LOGOUT;

    public static InterfaceC2044707zh<C0DCO> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0DCO c0dco = new C0DCO("LOGOUT", 0);
        LOGOUT = c0dco;
        C0DCO c0dco2 = new C0DCO("ACCOUNT_SWITCHED", 1);
        ACCOUNT_SWITCHED = c0dco2;
        C0DCO[] c0dcoArr = {c0dco, c0dco2};
        LL = c0dcoArr;
        LLILLJJLI = new C2254308sP(c0dcoArr);
    }

    public static C0DCO[] values() {
        return (C0DCO[]) LL.clone();
    }

    public static C0DCO valueOf(String str) {
        return (C0DCO) C08FF.LIZ(C0DCO.class, str);
    }

    public C0DCO(String str, int i) {
    }
}
