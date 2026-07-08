package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0F7S, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0F7S {
    public static final C0F7S AI_CAPTION;
    public static final C0F7S AI_CREATE;
    public static final C0F7S EDIT;
    public static final C0F7S EDITOR_PRO;
    public static final C0F7S GLANCE_RECAP;
    public static final C0F7S INSTANT_CLONE;
    public static final /* synthetic */ C0F7S[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<C0F7S> getEntries() {
        return LLILLL;
    }

    static {
        C0F7S c0f7s = new C0F7S("EDIT", 0, 0);
        EDIT = c0f7s;
        C0F7S c0f7s2 = new C0F7S("EDITOR_PRO", 1, 1);
        EDITOR_PRO = c0f7s2;
        C0F7S c0f7s3 = new C0F7S("AI_CAPTION", 2, 3);
        AI_CAPTION = c0f7s3;
        C0F7S c0f7s4 = new C0F7S("AI_CREATE", 3, 4);
        AI_CREATE = c0f7s4;
        C0F7S c0f7s5 = new C0F7S("INSTANT_CLONE", 4, 5);
        INSTANT_CLONE = c0f7s5;
        C0F7S c0f7s6 = new C0F7S("GLANCE_RECAP", 5, 6);
        GLANCE_RECAP = c0f7s6;
        C0F7S[] c0f7sArr = {c0f7s, c0f7s2, c0f7s3, c0f7s4, c0f7s5, c0f7s6};
        LLILLJJLI = c0f7sArr;
        LLILLL = new C2254308sP(c0f7sArr);
    }

    public static C0F7S[] values() {
        return (C0F7S[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C0F7S valueOf(String str) {
        return (C0F7S) C08FF.LIZ(C0F7S.class, str);
    }

    public C0F7S(String str, int i, int i2) {
        this.LL = i2;
    }
}
