package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.009R, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C009R {
    public static final /* synthetic */ C009R[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C009R NOT_SHOW;
    public static final C009R SHOW_COMPATIBLE_TIPS;
    public static final C009R SHOW_REMOVED_TIPS;

    public static InterfaceC2044707zh<C009R> getEntries() {
        return LLILLJJLI;
    }

    static {
        C009R c009r = new C009R("NOT_SHOW", 0);
        NOT_SHOW = c009r;
        C009R c009r2 = new C009R("SHOW_COMPATIBLE_TIPS", 1);
        SHOW_COMPATIBLE_TIPS = c009r2;
        C009R c009r3 = new C009R("SHOW_REMOVED_TIPS", 2);
        SHOW_REMOVED_TIPS = c009r3;
        C009R[] c009rArr = {c009r, c009r2, c009r3};
        LL = c009rArr;
        LLILLJJLI = new C2254308sP(c009rArr);
    }

    public static C009R[] values() {
        return (C009R[]) LL.clone();
    }

    public static C009R valueOf(String str) {
        return (C009R) C08FF.LIZ(C009R.class, str);
    }

    public C009R(String str, int i) {
    }
}
