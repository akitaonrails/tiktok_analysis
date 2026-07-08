package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0N6C, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N6C {
    public static final /* synthetic */ C0N6C[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0N6C MANAGE_MY_ACCOUNT;
    public final String LL = "manage_my_account";

    public static InterfaceC2044707zh<C0N6C> getEntries() {
        return LLILLL;
    }

    static {
        C0N6C c0n6c = new C0N6C();
        MANAGE_MY_ACCOUNT = c0n6c;
        C0N6C[] c0n6cArr = {c0n6c};
        LLILLJJLI = c0n6cArr;
        LLILLL = new C2254308sP(c0n6cArr);
    }

    public static C0N6C[] values() {
        return (C0N6C[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C0N6C valueOf(String str) {
        return (C0N6C) C08FF.LIZ(C0N6C.class, str);
    }
}
