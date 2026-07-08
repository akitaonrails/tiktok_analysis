package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.046V, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C046V {
    public static final C046V HIDE_TITLE_ALWAYS;
    public static final /* synthetic */ C046V[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C046V SHOW_TITLE_ALWAYS;
    public static final C046V SHOW_TITLE_IF_NOT_PDP_OR_REVIEW;
    public final int LL;

    public static InterfaceC2044707zh<C046V> getEntries() {
        return LLILLL;
    }

    static {
        C046V c046v = new C046V("SHOW_TITLE_ALWAYS", 0, 0);
        SHOW_TITLE_ALWAYS = c046v;
        C046V c046v2 = new C046V("HIDE_TITLE_ALWAYS", 1, 1);
        HIDE_TITLE_ALWAYS = c046v2;
        C046V c046v3 = new C046V("SHOW_TITLE_IF_NOT_PDP_OR_REVIEW", 2, 2);
        SHOW_TITLE_IF_NOT_PDP_OR_REVIEW = c046v3;
        C046V[] c046vArr = {c046v, c046v2, c046v3};
        LLILLJJLI = c046vArr;
        LLILLL = new C2254308sP(c046vArr);
    }

    public static C046V[] values() {
        return (C046V[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static C046V valueOf(String str) {
        return (C046V) C08FF.LIZ(C046V.class, str);
    }

    public C046V(String str, int i, int i2) {
        this.LL = i2;
    }
}
