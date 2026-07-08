package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.08OK, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08OK {
    public static final C08OK EU;
    public static final /* synthetic */ C08OK[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C08OK ROW;
    public static final C08OK US;

    public static InterfaceC2044707zh<C08OK> getEntries() {
        return LLILLJJLI;
    }

    static {
        C08OK c08ok = new C08OK("ROW", 0);
        ROW = c08ok;
        C08OK c08ok2 = new C08OK("US", 1);
        US = c08ok2;
        C08OK c08ok3 = new C08OK("EU", 2);
        EU = c08ok3;
        C08OK[] c08okArr = {c08ok, c08ok2, c08ok3};
        LL = c08okArr;
        LLILLJJLI = new C2254308sP(c08okArr);
    }

    public static C08OK[] values() {
        return (C08OK[]) LL.clone();
    }

    public static C08OK valueOf(String str) {
        return (C08OK) C08FF.LIZ(C08OK.class, str);
    }

    public C08OK(String str, int i) {
    }
}
