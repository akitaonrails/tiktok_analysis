package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0OO9, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OO9 {
    public static final C0OO9 ACTIVITY_BUBBLE;
    public static final C0OOA Companion;
    public static final C0OO9 INSPIRATION_CARD;
    public static final /* synthetic */ C0OO9[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0OO9 TEXT_GUIDE;
    public static final C0OO9 WRITE_BUTTON;
    public final String LL;

    public static InterfaceC2044707zh<C0OO9> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.0OOA] */
    static {
        C0OO9 c0oo9 = new C0OO9("TEXT_GUIDE", 0, "text_guide");
        TEXT_GUIDE = c0oo9;
        C0OO9 c0oo92 = new C0OO9("WRITE_BUTTON", 1, "write");
        WRITE_BUTTON = c0oo92;
        C0OO9 c0oo93 = new C0OO9("ACTIVITY_BUBBLE", 2, "activity_bubble");
        ACTIVITY_BUBBLE = c0oo93;
        C0OO9 c0oo94 = new C0OO9("INSPIRATION_CARD", 3, "inspiration_card");
        INSPIRATION_CARD = c0oo94;
        C0OO9[] c0oo9Arr = {c0oo9, c0oo92, c0oo93, c0oo94};
        LLILLJJLI = c0oo9Arr;
        LLILLL = new C2254308sP(c0oo9Arr);
        Companion = new Object() { // from class: X.0OOA
        };
    }

    public static C0OO9[] values() {
        return (C0OO9[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C0OO9 valueOf(String str) {
        return (C0OO9) C08FF.LIZ(C0OO9.class, str);
    }

    public C0OO9(String str, int i, String str2) {
        this.LL = str2;
    }
}
