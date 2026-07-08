package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0O7Y, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0O7Y {
    public static final C0O7Y Default;
    public static final /* synthetic */ C0O7Y[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0O7Y Merged;
    public static final C0O7Y Running;

    public static InterfaceC2044707zh<C0O7Y> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0O7Y c0o7y = new C0O7Y("Default", 0);
        Default = c0o7y;
        C0O7Y c0o7y2 = new C0O7Y("Running", 1);
        Running = c0o7y2;
        C0O7Y c0o7y3 = new C0O7Y("Merged", 2);
        Merged = c0o7y3;
        C0O7Y[] c0o7yArr = {c0o7y, c0o7y2, c0o7y3};
        LL = c0o7yArr;
        LLILLJJLI = new C2254308sP(c0o7yArr);
    }

    public static C0O7Y[] values() {
        return (C0O7Y[]) LL.clone();
    }

    public static C0O7Y valueOf(String str) {
        return (C0O7Y) C08FF.LIZ(C0O7Y.class, str);
    }

    public C0O7Y(String str, int i) {
    }
}
