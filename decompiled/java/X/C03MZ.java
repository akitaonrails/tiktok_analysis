package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.03MZ, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03MZ {
    public static final C03MZ DOUBLE_LEFT;
    public static final C03MZ DOUBLE_RIGHT;
    public static final /* synthetic */ C03MZ[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C03MZ SINGLE;

    public static InterfaceC2044707zh<C03MZ> getEntries() {
        return LLILLJJLI;
    }

    static {
        C03MZ c03mz = new C03MZ("SINGLE", 0);
        SINGLE = c03mz;
        C03MZ c03mz2 = new C03MZ("DOUBLE_LEFT", 1);
        DOUBLE_LEFT = c03mz2;
        C03MZ c03mz3 = new C03MZ("DOUBLE_RIGHT", 2);
        DOUBLE_RIGHT = c03mz3;
        C03MZ[] c03mzArr = {c03mz, c03mz2, c03mz3};
        LL = c03mzArr;
        LLILLJJLI = new C2254308sP(c03mzArr);
    }

    public static C03MZ[] values() {
        return (C03MZ[]) LL.clone();
    }

    public static C03MZ valueOf(String str) {
        return (C03MZ) C08FF.LIZ(C03MZ.class, str);
    }

    public C03MZ(String str, int i) {
    }
}
