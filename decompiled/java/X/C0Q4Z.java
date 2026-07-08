package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Q4Z, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0Q4Z {
    public static final C0Q4Z DATA_BINDED;
    public static final C0Q4Z DATA_PARSED;
    public static final C0Q4Z IDLE;
    public static final /* synthetic */ C0Q4Z[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0Q4Z SHOW_FAILED;
    public static final C0Q4Z SHOW_SUCCEEDED;

    public static InterfaceC2044707zh<C0Q4Z> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0Q4Z c0q4z = new C0Q4Z("IDLE", 0);
        IDLE = c0q4z;
        C0Q4Z c0q4z2 = new C0Q4Z("DATA_PARSED", 1);
        DATA_PARSED = c0q4z2;
        C0Q4Z c0q4z3 = new C0Q4Z("DATA_BINDED", 2);
        DATA_BINDED = c0q4z3;
        C0Q4Z c0q4z4 = new C0Q4Z("SHOW_SUCCEEDED", 3);
        SHOW_SUCCEEDED = c0q4z4;
        C0Q4Z c0q4z5 = new C0Q4Z("SHOW_FAILED", 4);
        SHOW_FAILED = c0q4z5;
        C0Q4Z[] c0q4zArr = {c0q4z, c0q4z2, c0q4z3, c0q4z4, c0q4z5};
        LL = c0q4zArr;
        LLILLJJLI = new C2254308sP(c0q4zArr);
    }

    public static C0Q4Z[] values() {
        return (C0Q4Z[]) LL.clone();
    }

    public static C0Q4Z valueOf(String str) {
        return (C0Q4Z) C08FF.LIZ(C0Q4Z.class, str);
    }

    public C0Q4Z(String str, int i) {
    }
}
