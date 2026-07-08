package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.016Q, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C016Q {
    public static final C016Q CAPTION;
    public static final /* synthetic */ C016Q[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C016Q SUBTITLE_PANEL;
    public final String LL;

    public static InterfaceC2044707zh<C016Q> getEntries() {
        return LLILLL;
    }

    static {
        C016Q c016q = new C016Q("CAPTION", 0, "caption");
        CAPTION = c016q;
        C016Q c016q2 = new C016Q("SUBTITLE_PANEL", 1, "subtitle_panel");
        SUBTITLE_PANEL = c016q2;
        C016Q[] c016qArr = {c016q, c016q2};
        LLILLJJLI = c016qArr;
        LLILLL = new C2254308sP(c016qArr);
    }

    public static C016Q[] values() {
        return (C016Q[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C016Q valueOf(String str) {
        return (C016Q) C08FF.LIZ(C016Q.class, str);
    }

    public C016Q(String str, int i, String str2) {
        this.LL = str2;
    }
}
