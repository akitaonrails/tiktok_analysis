package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0N4I, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N4I {
    public static final C0N4I FAILED;
    public static final /* synthetic */ C0N4I[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0N4I NOT_REGISTERED;
    public static final C0N4I SUBMITTED;
    public static final C0N4I SUCCESS;
    public final int LL;

    public static InterfaceC2044707zh<C0N4I> getEntries() {
        return LLILLL;
    }

    static {
        C0N4I c0n4i = new C0N4I("NOT_REGISTERED", 0, 1);
        NOT_REGISTERED = c0n4i;
        C0N4I c0n4i2 = new C0N4I("SUCCESS", 1, 2);
        SUCCESS = c0n4i2;
        C0N4I c0n4i3 = new C0N4I("SUBMITTED", 2, 3);
        SUBMITTED = c0n4i3;
        C0N4I c0n4i4 = new C0N4I("FAILED", 3, 4);
        FAILED = c0n4i4;
        C0N4I[] c0n4iArr = {c0n4i, c0n4i2, c0n4i3, c0n4i4};
        LLILLJJLI = c0n4iArr;
        LLILLL = new C2254308sP(c0n4iArr);
    }

    public static C0N4I[] values() {
        return (C0N4I[]) LLILLJJLI.clone();
    }

    public final int getStatus() {
        return this.LL;
    }

    public static C0N4I valueOf(String str) {
        return (C0N4I) C08FF.LIZ(C0N4I.class, str);
    }

    public C0N4I(String str, int i, int i2) {
        this.LL = i2;
    }
}
