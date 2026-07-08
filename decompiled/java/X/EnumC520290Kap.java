package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Kap, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC520290Kap {
    public static final C520310Kar Companion;
    public static final EnumC520290Kap DEFAULT_LYNX;
    public static final /* synthetic */ EnumC520290Kap[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC520290Kap TTGP;
    public final String schemaHost;
    public final String schemaProtocol;

    public static InterfaceC2044707zh<EnumC520290Kap> getEntries() {
        return LLILLJJLI;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0Kar] */
    static {
        EnumC520290Kap enumC520290Kap = new EnumC520290Kap("TTGP", 0, "xtab", "ttgp");
        TTGP = enumC520290Kap;
        EnumC520290Kap enumC520290Kap2 = new EnumC520290Kap("DEFAULT_LYNX", 1, "*", "*");
        DEFAULT_LYNX = enumC520290Kap2;
        EnumC520290Kap[] enumC520290KapArr = {enumC520290Kap, enumC520290Kap2};
        LL = enumC520290KapArr;
        LLILLJJLI = new C2254308sP(enumC520290KapArr);
        Companion = new Object() { // from class: X.0Kar
        };
    }

    public static EnumC520290Kap[] values() {
        return (EnumC520290Kap[]) LL.clone();
    }

    public static EnumC520290Kap valueOf(String str) {
        return (EnumC520290Kap) C08FF.LIZ(EnumC520290Kap.class, str);
    }

    public EnumC520290Kap(String str, int i, String str2, String str3) {
        this.schemaProtocol = str2;
        this.schemaHost = str3;
    }
}
