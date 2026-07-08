package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.016U, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C016U {
    public static final C016U CAPTIONS;
    public static final C016U HIDDEN;
    public static final C016U ICON;
    public static final /* synthetic */ C016U[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<C016U> getEntries() {
        return LLILLL;
    }

    static {
        C016U c016u = new C016U("CAPTIONS", 0, "captions");
        CAPTIONS = c016u;
        C016U c016u2 = new C016U("HIDDEN", 1, "hidden");
        HIDDEN = c016u2;
        C016U c016u3 = new C016U("ICON", 2, "icon");
        ICON = c016u3;
        C016U[] c016uArr = {c016u, c016u2, c016u3};
        LLILLJJLI = c016uArr;
        LLILLL = new C2254308sP(c016uArr);
    }

    public static C016U[] values() {
        return (C016U[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C016U valueOf(String str) {
        return (C016U) C08FF.LIZ(C016U.class, str);
    }

    public C016U(String str, int i, String str2) {
        this.LL = str2;
    }
}
