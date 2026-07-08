package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Z7X, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Z7X {
    public static final C0Z7X Hidden;
    public static final /* synthetic */ C0Z7X[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0Z7X Shown;

    public static InterfaceC2044707zh<C0Z7X> getEntries() {
        return LLILLJJLI;
    }

    public static C0Z7X valueOf(String str) {
        return (C0Z7X) C08FF.LIZ(C0Z7X.class, str);
    }

    public static C0Z7X[] values() {
        return (C0Z7X[]) LL.clone();
    }

    static {
        C0Z7X c0z7x = new C0Z7X("Shown", 0);
        Shown = c0z7x;
        C0Z7X c0z7x2 = new C0Z7X("Hidden", 1);
        Hidden = c0z7x2;
        C0Z7X[] c0z7xArr = {c0z7x, c0z7x2};
        LL = c0z7xArr;
        LLILLJJLI = new C2254308sP(c0z7xArr);
    }

    public C0Z7X(String str, int i) {
    }
}
