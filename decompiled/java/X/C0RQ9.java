package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0RQ9, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RQ9 {
    public static final /* synthetic */ C0RQ9[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0RQ9 TYPE_DOT_BOTTOM_AREA;
    public static final C0RQ9 TYPE_DOT_INTERACT_AREA_TABLET;
    public static final C0RQ9 TYPE_DOT_TOP_AREA;
    public final String LL;

    public static InterfaceC2044707zh<C0RQ9> getEntries() {
        return LLILLL;
    }

    static {
        C0RQ9 c0rq9 = new C0RQ9("TYPE_DOT_BOTTOM_AREA", 0, "dot_bottom");
        TYPE_DOT_BOTTOM_AREA = c0rq9;
        C0RQ9 c0rq92 = new C0RQ9("TYPE_DOT_TOP_AREA", 1, "dot_top");
        TYPE_DOT_TOP_AREA = c0rq92;
        C0RQ9 c0rq93 = new C0RQ9("TYPE_DOT_INTERACT_AREA_TABLET", 2, "dot_tablet");
        TYPE_DOT_INTERACT_AREA_TABLET = c0rq93;
        C0RQ9[] c0rq9Arr = {c0rq9, c0rq92, c0rq93};
        LLILLJJLI = c0rq9Arr;
        LLILLL = new C2254308sP(c0rq9Arr);
    }

    public static C0RQ9[] values() {
        return (C0RQ9[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C0RQ9 valueOf(String str) {
        return (C0RQ9) C08FF.LIZ(C0RQ9.class, str);
    }

    public C0RQ9(String str, int i, String str2) {
        this.LL = str2;
    }
}
