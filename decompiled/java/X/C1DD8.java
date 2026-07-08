package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1DD8, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DD8 {
    public static final C1DD8 DISLIKE;
    public static final C1DD8 LIKE;
    public static final /* synthetic */ C1DD8[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C1DD8 SHOWN;
    public static final C1DD8 SWIPE;
    public final String LL;

    public static InterfaceC2044707zh<C1DD8> getEntries() {
        return LLILLL;
    }

    static {
        C1DD8 c1dd8 = new C1DD8("LIKE", 0, "Like");
        LIKE = c1dd8;
        C1DD8 c1dd82 = new C1DD8("DISLIKE", 1, "Dislike");
        DISLIKE = c1dd82;
        C1DD8 c1dd83 = new C1DD8("SWIPE", 2, "Swipe");
        SWIPE = c1dd83;
        C1DD8 c1dd84 = new C1DD8("SHOWN", 3, "Shown");
        SHOWN = c1dd84;
        C1DD8[] c1dd8Arr = {c1dd8, c1dd82, c1dd83, c1dd84};
        LLILLJJLI = c1dd8Arr;
        LLILLL = new C2254308sP(c1dd8Arr);
    }

    public static C1DD8[] values() {
        return (C1DD8[]) LLILLJJLI.clone();
    }

    public final String getEtValue() {
        return this.LL;
    }

    public static C1DD8 valueOf(String str) {
        return (C1DD8) C08FF.LIZ(C1DD8.class, str);
    }

    public C1DD8(String str, int i, String str2) {
        this.LL = str2;
    }
}
