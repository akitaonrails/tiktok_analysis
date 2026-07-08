package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.016P, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C016P {
    public static final C016P CAPTION;
    public static final /* synthetic */ C016P[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C016P SUBTITLE_PANEL;
    public final String LL;

    public static InterfaceC2044707zh<C016P> getEntries() {
        return LLILLL;
    }

    static {
        C016P c016p = new C016P("CAPTION", 0, "caption");
        CAPTION = c016p;
        C016P c016p2 = new C016P("SUBTITLE_PANEL", 1, "subtitle_panel");
        SUBTITLE_PANEL = c016p2;
        C016P[] c016pArr = {c016p, c016p2};
        LLILLJJLI = c016pArr;
        LLILLL = new C2254308sP(c016pArr);
    }

    public static C016P[] values() {
        return (C016P[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C016P valueOf(String str) {
        return (C016P) C08FF.LIZ(C016P.class, str);
    }

    public C016P(String str, int i, String str2) {
        this.LL = str2;
    }
}
