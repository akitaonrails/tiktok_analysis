package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0N7K, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N7K {
    public static final C0N7K COMMON_ADD_BTN;
    public static final C0N7K COMMON_JSB;
    public static final C0N7K DIRECT_ADD_MODE;
    public static final /* synthetic */ C0N7K[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<C0N7K> getEntries() {
        return LLILLL;
    }

    static {
        C0N7K c0n7k = new C0N7K("DIRECT_ADD_MODE", 0, "client_active_common_direct_add");
        DIRECT_ADD_MODE = c0n7k;
        C0N7K c0n7k2 = new C0N7K("COMMON_ADD_BTN", 1, "client_active_common_web_container");
        COMMON_ADD_BTN = c0n7k2;
        C0N7K c0n7k3 = new C0N7K("COMMON_JSB", 2, "fe_active_common");
        COMMON_JSB = c0n7k3;
        C0N7K[] c0n7kArr = {c0n7k, c0n7k2, c0n7k3};
        LLILLJJLI = c0n7kArr;
        LLILLL = new C2254308sP(c0n7kArr);
    }

    public static C0N7K[] values() {
        return (C0N7K[]) LLILLJJLI.clone();
    }

    public final String getStr() {
        return this.LL;
    }

    public static C0N7K valueOf(String str) {
        return (C0N7K) C08FF.LIZ(C0N7K.class, str);
    }

    public C0N7K(String str, int i, String str2) {
        this.LL = str2;
    }
}
