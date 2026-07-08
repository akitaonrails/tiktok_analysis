package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0M4F, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0M4F {
    public static final C0M4F ALL;
    public static final C0M4F EXCEPT_STORY;
    public static final C0M4F EXCEPT_TTN;
    public static final /* synthetic */ C0M4F[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0M4F STORY_ONLY;
    public static final C0M4F TTN_ONLY;
    public final int LL;

    public static InterfaceC2044707zh<C0M4F> getEntries() {
        return LLILLL;
    }

    static {
        C0M4F c0m4f = new C0M4F("ALL", 0, 255);
        ALL = c0m4f;
        C0M4I c0m4i = C0M4I.TTN;
        C0M4F c0m4f2 = new C0M4F("EXCEPT_TTN", 1, c0m4i.getValue() ^ 255);
        EXCEPT_TTN = c0m4f2;
        C0M4F c0m4f3 = new C0M4F("TTN_ONLY", 2, c0m4i.getValue());
        TTN_ONLY = c0m4f3;
        C0M4I c0m4i2 = C0M4I.STORY_LIGHTENING;
        C0M4F c0m4f4 = new C0M4F("STORY_ONLY", 3, c0m4i2.getValue());
        STORY_ONLY = c0m4f4;
        C0M4F c0m4f5 = new C0M4F("EXCEPT_STORY", 4, 255 ^ c0m4i2.getValue());
        EXCEPT_STORY = c0m4f5;
        C0M4F[] c0m4fArr = {c0m4f, c0m4f2, c0m4f3, c0m4f4, c0m4f5};
        LLILLJJLI = c0m4fArr;
        LLILLL = new C2254308sP(c0m4fArr);
    }

    public static C0M4F[] values() {
        return (C0M4F[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C0M4F valueOf(String str) {
        return (C0M4F) C08FF.LIZ(C0M4F.class, str);
    }

    public C0M4F(String str, int i, int i2) {
        this.LL = i2;
    }
}
