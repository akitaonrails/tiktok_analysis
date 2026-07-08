package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0M3g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC562220M3g {
    public static final EnumC562220M3g ALL;
    public static final EnumC562220M3g INVISIBLE;
    public static final /* synthetic */ EnumC562220M3g[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC562220M3g NORMAL;
    public static final EnumC562220M3g POSTED;

    public static InterfaceC2044707zh<EnumC562220M3g> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC562220M3g enumC562220M3g = new EnumC562220M3g("ALL", 0);
        ALL = enumC562220M3g;
        EnumC562220M3g enumC562220M3g2 = new EnumC562220M3g("NORMAL", 1);
        NORMAL = enumC562220M3g2;
        EnumC562220M3g enumC562220M3g3 = new EnumC562220M3g("POSTED", 2);
        POSTED = enumC562220M3g3;
        EnumC562220M3g enumC562220M3g4 = new EnumC562220M3g("INVISIBLE", 3);
        INVISIBLE = enumC562220M3g4;
        EnumC562220M3g[] enumC562220M3gArr = {enumC562220M3g, enumC562220M3g2, enumC562220M3g3, enumC562220M3g4};
        LL = enumC562220M3gArr;
        LLILLJJLI = new C2254308sP(enumC562220M3gArr);
    }

    public static EnumC562220M3g[] values() {
        return (EnumC562220M3g[]) LL.clone();
    }

    public static EnumC562220M3g valueOf(String str) {
        return (EnumC562220M3g) C08FF.LIZ(EnumC562220M3g.class, str);
    }

    public EnumC562220M3g(String str, int i) {
    }
}
