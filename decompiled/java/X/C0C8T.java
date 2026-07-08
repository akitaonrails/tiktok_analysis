package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0C8T, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0C8T {
    public static final C0C8T DOUBLE;
    public static final /* synthetic */ C0C8T[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0C8T NONE;
    public static final C0C8T SINGLE;

    public static InterfaceC2044707zh<C0C8T> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0C8T c0c8t = new C0C8T("DOUBLE", 0);
        DOUBLE = c0c8t;
        C0C8T c0c8t2 = new C0C8T("SINGLE", 1);
        SINGLE = c0c8t2;
        C0C8T c0c8t3 = new C0C8T("NONE", 2);
        NONE = c0c8t3;
        C0C8T[] c0c8tArr = {c0c8t, c0c8t2, c0c8t3};
        LL = c0c8tArr;
        LLILLJJLI = new C2254308sP(c0c8tArr);
    }

    public static C0C8T[] values() {
        return (C0C8T[]) LL.clone();
    }

    public static C0C8T valueOf(String str) {
        return (C0C8T) C08FF.LIZ(C0C8T.class, str);
    }

    public C0C8T(String str, int i) {
    }
}
