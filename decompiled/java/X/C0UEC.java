package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0UEC, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UEC {
    public static final C0UEC ALBUM;
    public static final C0UEC BEAUTY;
    public static final C0UEC EFFECT;
    public static final C0UEC FILTER;
    public static final C0UEC FLASH;
    public static final C0UEC GAME;
    public static final /* synthetic */ C0UEC[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<C0UEC> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0UEC c0uec = new C0UEC("FILTER", 0);
        FILTER = c0uec;
        C0UEC c0uec2 = new C0UEC("BEAUTY", 1);
        BEAUTY = c0uec2;
        C0UEC c0uec3 = new C0UEC("ALBUM", 2);
        ALBUM = c0uec3;
        C0UEC c0uec4 = new C0UEC("FLASH", 3);
        FLASH = c0uec4;
        C0UEC c0uec5 = new C0UEC("EFFECT", 4);
        EFFECT = c0uec5;
        C0UEC c0uec6 = new C0UEC("GAME", 5);
        GAME = c0uec6;
        C0UEC[] c0uecArr = {c0uec, c0uec2, c0uec3, c0uec4, c0uec5, c0uec6};
        LL = c0uecArr;
        LLILLJJLI = new C2254308sP(c0uecArr);
    }

    public static C0UEC[] values() {
        return (C0UEC[]) LL.clone();
    }

    public static C0UEC valueOf(String str) {
        return (C0UEC) C08FF.LIZ(C0UEC.class, str);
    }

    public C0UEC(String str, int i) {
    }
}
