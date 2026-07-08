package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0x9g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1808220x9g {
    public static final EnumC1808220x9g LL;
    public static final EnumC1808220x9g LLILLJJLI;
    public static final EnumC1808220x9g LLILLL;
    public static final EnumC1808220x9g LLILZ;
    public static final EnumC1808220x9g LLILZIL;
    public static final /* synthetic */ EnumC1808220x9g[] LLILZLL;

    static {
        EnumC1808220x9g enumC1808220x9g = new EnumC1808220x9g("IDLE", 0);
        LL = enumC1808220x9g;
        EnumC1808220x9g enumC1808220x9g2 = new EnumC1808220x9g("INPUT", 1);
        LLILLJJLI = enumC1808220x9g2;
        EnumC1808220x9g enumC1808220x9g3 = new EnumC1808220x9g("CACHE_HIT", 2);
        LLILLL = enumC1808220x9g3;
        EnumC1808220x9g enumC1808220x9g4 = new EnumC1808220x9g("REQUEST", 3);
        LLILZ = enumC1808220x9g4;
        EnumC1808220x9g enumC1808220x9g5 = new EnumC1808220x9g("DISPLAY", 4);
        LLILZIL = enumC1808220x9g5;
        EnumC1808220x9g[] enumC1808220x9gArr = {enumC1808220x9g, enumC1808220x9g2, enumC1808220x9g3, enumC1808220x9g4, enumC1808220x9g5};
        LLILZLL = enumC1808220x9gArr;
        new C2254308sP(enumC1808220x9gArr);
    }

    public static EnumC1808220x9g[] values() {
        return (EnumC1808220x9g[]) LLILZLL.clone();
    }

    public static EnumC1808220x9g valueOf(String str) {
        return (EnumC1808220x9g) C08FF.LIZ(EnumC1808220x9g.class, str);
    }

    public EnumC1808220x9g(String str, int i) {
    }
}
