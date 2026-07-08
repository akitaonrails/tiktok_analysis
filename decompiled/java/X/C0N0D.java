package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0N0D, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N0D {
    public static final C0N0D Circle;
    public static final /* synthetic */ C0N0D[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0N0D Rect;

    public static InterfaceC2044707zh<C0N0D> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0N0D c0n0d = new C0N0D("Circle", 0);
        Circle = c0n0d;
        C0N0D c0n0d2 = new C0N0D("Rect", 1);
        Rect = c0n0d2;
        C0N0D[] c0n0dArr = {c0n0d, c0n0d2};
        LL = c0n0dArr;
        LLILLJJLI = new C2254308sP(c0n0dArr);
    }

    public static C0N0D[] values() {
        return (C0N0D[]) LL.clone();
    }

    public static C0N0D valueOf(String str) {
        return (C0N0D) C08FF.LIZ(C0N0D.class, str);
    }

    public C0N0D(String str, int i) {
    }
}
