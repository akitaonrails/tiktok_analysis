package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0y4g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1843560y4g {
    public static final C1843570y4h Companion;
    public static final EnumC1843560y4g FAST;
    public static final /* synthetic */ EnumC1843560y4g[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1843560y4g SLOW;
    public static final EnumC1843560y4g UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1843560y4g> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0y4h] */
    static {
        EnumC1843560y4g enumC1843560y4g = new EnumC1843560y4g("FAST", 0, 1);
        FAST = enumC1843560y4g;
        EnumC1843560y4g enumC1843560y4g2 = new EnumC1843560y4g("SLOW", 1, 0);
        SLOW = enumC1843560y4g2;
        EnumC1843560y4g enumC1843560y4g3 = new EnumC1843560y4g("UNKNOWN", 2, -1);
        UNKNOWN = enumC1843560y4g3;
        EnumC1843560y4g[] enumC1843560y4gArr = {enumC1843560y4g, enumC1843560y4g2, enumC1843560y4g3};
        LLILLJJLI = enumC1843560y4gArr;
        LLILLL = new C2254308sP(enumC1843560y4gArr);
        Companion = new Object() { // from class: X.0y4h
        };
    }

    public static EnumC1843560y4g[] values() {
        return (EnumC1843560y4g[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static final EnumC1843560y4g parse(int i) {
        Companion.getClass();
        if (i != 0) {
            if (i != 1) {
                return UNKNOWN;
            }
            return FAST;
        }
        return SLOW;
    }

    public static EnumC1843560y4g valueOf(String str) {
        return (EnumC1843560y4g) C08FF.LIZ(EnumC1843560y4g.class, str);
    }

    public EnumC1843560y4g(String str, int i, int i2) {
        this.LL = i2;
    }
}
