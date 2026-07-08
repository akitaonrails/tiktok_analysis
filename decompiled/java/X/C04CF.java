package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.04CF, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C04CF {
    public static final C04CF DESCRIPTION;
    public static final /* synthetic */ C04CF[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C04CF NOT_SHOW;
    public static final C04CF REVIEW;

    public static InterfaceC2044707zh<C04CF> getEntries() {
        return LLILLJJLI;
    }

    static {
        C04CF c04cf = new C04CF("NOT_SHOW", 0);
        NOT_SHOW = c04cf;
        C04CF c04cf2 = new C04CF("REVIEW", 1);
        REVIEW = c04cf2;
        C04CF c04cf3 = new C04CF("DESCRIPTION", 2);
        DESCRIPTION = c04cf3;
        C04CF[] c04cfArr = {c04cf, c04cf2, c04cf3};
        LL = c04cfArr;
        LLILLJJLI = new C2254308sP(c04cfArr);
    }

    public static C04CF[] values() {
        return (C04CF[]) LL.clone();
    }

    public static C04CF valueOf(String str) {
        return (C04CF) C08FF.LIZ(C04CF.class, str);
    }

    public C04CF(String str, int i) {
    }
}
