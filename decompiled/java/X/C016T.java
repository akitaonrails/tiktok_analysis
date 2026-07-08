package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.016T, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C016T {
    public static final C016T CAPTIONS;
    public static final C016T HIDDEN;
    public static final C016T ICON;
    public static final /* synthetic */ C016T[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<C016T> getEntries() {
        return LLILLL;
    }

    static {
        C016T c016t = new C016T("CAPTIONS", 0, "captions");
        CAPTIONS = c016t;
        C016T c016t2 = new C016T("HIDDEN", 1, "hidden");
        HIDDEN = c016t2;
        C016T c016t3 = new C016T("ICON", 2, "icon");
        ICON = c016t3;
        C016T[] c016tArr = {c016t, c016t2, c016t3};
        LLILLJJLI = c016tArr;
        LLILLL = new C2254308sP(c016tArr);
    }

    public static C016T[] values() {
        return (C016T[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C016T valueOf(String str) {
        return (C016T) C08FF.LIZ(C016T.class, str);
    }

    public C016T(String str, int i, String str2) {
        this.LL = str2;
    }
}
