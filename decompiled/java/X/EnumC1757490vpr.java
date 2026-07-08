package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0vpr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1757490vpr {
    public static final C1757520vpu Companion;
    public static final /* synthetic */ EnumC1757490vpr[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1757490vpr PRE_CREATE;
    public static final EnumC1757490vpr PRE_DECODE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1757490vpr> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0vpu] */
    static {
        EnumC1757490vpr enumC1757490vpr = new EnumC1757490vpr("PRE_CREATE", 0, "precreate");
        PRE_CREATE = enumC1757490vpr;
        EnumC1757490vpr enumC1757490vpr2 = new EnumC1757490vpr("PRE_DECODE", 1, "predecode");
        PRE_DECODE = enumC1757490vpr2;
        EnumC1757490vpr[] enumC1757490vprArr = {enumC1757490vpr, enumC1757490vpr2};
        LLILLJJLI = enumC1757490vprArr;
        LLILLL = new C2254308sP(enumC1757490vprArr);
        Companion = new Object() { // from class: X.0vpu
        };
    }

    public static EnumC1757490vpr[] values() {
        return (EnumC1757490vpr[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1757490vpr valueOf(String str) {
        return (EnumC1757490vpr) C08FF.LIZ(EnumC1757490vpr.class, str);
    }

    public EnumC1757490vpr(String str, int i, String str2) {
        this.LL = str2;
    }
}
