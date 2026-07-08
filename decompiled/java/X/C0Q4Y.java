package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Q4Y, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0Q4Y {
    public static final C0Q4Y BUFFER;
    public static final C0Q4Y LATEST;
    public static final /* synthetic */ C0Q4Y[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<C0Q4Y> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0Q4Y c0q4y = new C0Q4Y("BUFFER", 0);
        BUFFER = c0q4y;
        C0Q4Y c0q4y2 = new C0Q4Y("LATEST", 1);
        LATEST = c0q4y2;
        C0Q4Y[] c0q4yArr = {c0q4y, c0q4y2};
        LL = c0q4yArr;
        LLILLJJLI = new C2254308sP(c0q4yArr);
    }

    public static C0Q4Y[] values() {
        return (C0Q4Y[]) LL.clone();
    }

    public static C0Q4Y valueOf(String str) {
        return (C0Q4Y) C08FF.LIZ(C0Q4Y.class, str);
    }

    public C0Q4Y(String str, int i) {
    }
}
