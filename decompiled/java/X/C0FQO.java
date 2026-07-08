package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0FQO, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FQO {
    public static final C0FQO CANCELED;
    public static final C0FQO FAILED;
    public static final /* synthetic */ C0FQO[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0FQO SUCCESS;
    public final int LL;

    public static InterfaceC2044707zh<C0FQO> getEntries() {
        return LLILLL;
    }

    static {
        C0FQO c0fqo = new C0FQO("SUCCESS", 0, 0);
        SUCCESS = c0fqo;
        C0FQO c0fqo2 = new C0FQO("FAILED", 1, 1);
        FAILED = c0fqo2;
        C0FQO c0fqo3 = new C0FQO("CANCELED", 2, 2);
        CANCELED = c0fqo3;
        C0FQO[] c0fqoArr = {c0fqo, c0fqo2, c0fqo3};
        LLILLJJLI = c0fqoArr;
        LLILLL = new C2254308sP(c0fqoArr);
    }

    public static C0FQO[] values() {
        return (C0FQO[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C0FQO valueOf(String str) {
        return (C0FQO) C08FF.LIZ(C0FQO.class, str);
    }

    public C0FQO(String str, int i, int i2) {
        this.LL = i2;
    }
}
