package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0P2g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC638400P2g {
    public static final EnumC638400P2g FIRST_PHASE;
    public static final /* synthetic */ EnumC638400P2g[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC638400P2g SECOND_PHASE;
    public static final EnumC638400P2g START;
    public static final EnumC638400P2g THIRD_PHASE;

    public static InterfaceC2044707zh<EnumC638400P2g> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC638400P2g enumC638400P2g = new EnumC638400P2g("START", 0);
        START = enumC638400P2g;
        EnumC638400P2g enumC638400P2g2 = new EnumC638400P2g("FIRST_PHASE", 1);
        FIRST_PHASE = enumC638400P2g2;
        EnumC638400P2g enumC638400P2g3 = new EnumC638400P2g("SECOND_PHASE", 2);
        SECOND_PHASE = enumC638400P2g3;
        EnumC638400P2g enumC638400P2g4 = new EnumC638400P2g("THIRD_PHASE", 3);
        THIRD_PHASE = enumC638400P2g4;
        EnumC638400P2g[] enumC638400P2gArr = {enumC638400P2g, enumC638400P2g2, enumC638400P2g3, enumC638400P2g4};
        LL = enumC638400P2gArr;
        LLILLJJLI = new C2254308sP(enumC638400P2gArr);
    }

    public static EnumC638400P2g[] values() {
        return (EnumC638400P2g[]) LL.clone();
    }

    public static EnumC638400P2g valueOf(String str) {
        return (EnumC638400P2g) C08FF.LIZ(EnumC638400P2g.class, str);
    }

    public EnumC638400P2g(String str, int i) {
    }
}
