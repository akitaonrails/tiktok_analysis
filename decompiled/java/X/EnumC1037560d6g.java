package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0d6g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1037560d6g {
    public static final C1037580d6i Companion;
    public static final /* synthetic */ EnumC1037560d6g[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1037560d6g LYNX;
    public static final EnumC1037560d6g MINI_PROGRAM;
    public static final EnumC1037560d6g SERIES;
    public static final EnumC1037560d6g WEB;

    public static InterfaceC2044707zh<EnumC1037560d6g> getEntries() {
        return LLILLJJLI;
    }

    public static final EnumC1037560d6g getFromUrl(String str) {
        Companion.getClass();
        return C1037580d6i.LIZ(str);
    }

    static {
        EnumC1037560d6g enumC1037560d6g = new EnumC1037560d6g("WEB", 0);
        WEB = enumC1037560d6g;
        EnumC1037560d6g enumC1037560d6g2 = new EnumC1037560d6g("LYNX", 1);
        LYNX = enumC1037560d6g2;
        EnumC1037560d6g enumC1037560d6g3 = new EnumC1037560d6g("MINI_PROGRAM", 2);
        MINI_PROGRAM = enumC1037560d6g3;
        EnumC1037560d6g enumC1037560d6g4 = new EnumC1037560d6g("SERIES", 3);
        SERIES = enumC1037560d6g4;
        EnumC1037560d6g[] enumC1037560d6gArr = {enumC1037560d6g, enumC1037560d6g2, enumC1037560d6g3, enumC1037560d6g4};
        LL = enumC1037560d6gArr;
        LLILLJJLI = new C2254308sP(enumC1037560d6gArr);
        Companion = new C1037580d6i();
    }

    public static EnumC1037560d6g[] values() {
        return (EnumC1037560d6g[]) LL.clone();
    }

    public static EnumC1037560d6g valueOf(String str) {
        return (EnumC1037560d6g) C08FF.LIZ(EnumC1037560d6g.class, str);
    }

    public EnumC1037560d6g(String str, int i) {
    }
}
