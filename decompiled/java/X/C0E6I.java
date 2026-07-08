package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0E6I, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0E6I {
    public static final C0E6I DRAGGING;
    public static final C0E6I IDLE;
    public static final /* synthetic */ C0E6I[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0E6I SETTLING;

    public static InterfaceC2044707zh<C0E6I> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0E6I c0e6i = new C0E6I("IDLE", 0);
        IDLE = c0e6i;
        C0E6I c0e6i2 = new C0E6I("DRAGGING", 1);
        DRAGGING = c0e6i2;
        C0E6I c0e6i3 = new C0E6I("SETTLING", 2);
        SETTLING = c0e6i3;
        C0E6I[] c0e6iArr = {c0e6i, c0e6i2, c0e6i3};
        LL = c0e6iArr;
        LLILLJJLI = new C2254308sP(c0e6iArr);
    }

    public static C0E6I[] values() {
        return (C0E6I[]) LL.clone();
    }

    public static C0E6I valueOf(String str) {
        return (C0E6I) C08FF.LIZ(C0E6I.class, str);
    }

    public C0E6I(String str, int i) {
    }
}
