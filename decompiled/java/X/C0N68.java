package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0N68, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N68 {
    public static final /* synthetic */ C0N68[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0N68 MANAGE_MY_ACCOUNT;
    public final String LL = "manage_my_account";

    public static InterfaceC2044707zh<C0N68> getEntries() {
        return LLILLL;
    }

    static {
        C0N68 c0n68 = new C0N68();
        MANAGE_MY_ACCOUNT = c0n68;
        C0N68[] c0n68Arr = {c0n68};
        LLILLJJLI = c0n68Arr;
        LLILLL = new C2254308sP(c0n68Arr);
    }

    public static C0N68[] values() {
        return (C0N68[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C0N68 valueOf(String str) {
        return (C0N68) C08FF.LIZ(C0N68.class, str);
    }
}
