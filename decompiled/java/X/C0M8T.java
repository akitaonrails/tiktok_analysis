package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0M8T, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0M8T {
    public static final /* synthetic */ C0M8T[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0M8T MULTI_ENTRANCE;
    public static final C0M8T NONE;
    public static final C0M8T TOP_BAR_ICON;

    public static InterfaceC2044707zh<C0M8T> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0M8T c0m8t = new C0M8T("NONE", 0);
        NONE = c0m8t;
        C0M8T c0m8t2 = new C0M8T("TOP_BAR_ICON", 1);
        TOP_BAR_ICON = c0m8t2;
        C0M8T c0m8t3 = new C0M8T("MULTI_ENTRANCE", 2);
        MULTI_ENTRANCE = c0m8t3;
        C0M8T[] c0m8tArr = {c0m8t, c0m8t2, c0m8t3};
        LL = c0m8tArr;
        LLILLJJLI = new C2254308sP(c0m8tArr);
    }

    public static C0M8T[] values() {
        return (C0M8T[]) LL.clone();
    }

    public static C0M8T valueOf(String str) {
        return (C0M8T) C08FF.LIZ(C0M8T.class, str);
    }

    public C0M8T(String str, int i) {
    }
}
