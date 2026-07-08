package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0K3I, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0K3I {
    public static final C0K3I COMMENT;
    public static final /* synthetic */ C0K3I[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0K3I REPLY;
    public static final C0K3I REPLY_TO_REPLY;
    public final int LL;

    public static InterfaceC2044707zh<C0K3I> getEntries() {
        return LLILLL;
    }

    static {
        C0K3I c0k3i = new C0K3I("COMMENT", 0, 0);
        COMMENT = c0k3i;
        C0K3I c0k3i2 = new C0K3I("REPLY", 1, 1);
        REPLY = c0k3i2;
        C0K3I c0k3i3 = new C0K3I("REPLY_TO_REPLY", 2, 2);
        REPLY_TO_REPLY = c0k3i3;
        C0K3I[] c0k3iArr = {c0k3i, c0k3i2, c0k3i3};
        LLILLJJLI = c0k3iArr;
        LLILLL = new C2254308sP(c0k3iArr);
    }

    public static C0K3I[] values() {
        return (C0K3I[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C0K3I valueOf(String str) {
        return (C0K3I) C08FF.LIZ(C0K3I.class, str);
    }

    public C0K3I(String str, int i, int i2) {
        this.LL = i2;
    }
}
