package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0N6B, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N6B {
    public static final /* synthetic */ C0N6B[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0N6B MANAGE_MY_ACCOUNT;
    public final String LL = "manage_my_account";

    public static InterfaceC2044707zh<C0N6B> getEntries() {
        return LLILLL;
    }

    static {
        C0N6B c0n6b = new C0N6B();
        MANAGE_MY_ACCOUNT = c0n6b;
        C0N6B[] c0n6bArr = {c0n6b};
        LLILLJJLI = c0n6bArr;
        LLILLL = new C2254308sP(c0n6bArr);
    }

    public static C0N6B[] values() {
        return (C0N6B[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C0N6B valueOf(String str) {
        return (C0N6B) C08FF.LIZ(C0N6B.class, str);
    }
}
