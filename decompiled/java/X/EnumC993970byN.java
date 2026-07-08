package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0byN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC993970byN {
    public static final EnumC993970byN AMAZON;
    public static final EnumC993970byN AP;
    public static final C993980byO Companion;
    public static final EnumC993970byN GP;
    public static final /* synthetic */ EnumC993970byN[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC993970byN UNKNOWN;
    public static final EnumC993970byN WEB;
    public final String LL;

    public static InterfaceC2044707zh<EnumC993970byN> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.0byO] */
    static {
        EnumC993970byN enumC993970byN = new EnumC993970byN("UNKNOWN", 0, "UNKNOWN");
        UNKNOWN = enumC993970byN;
        EnumC993970byN enumC993970byN2 = new EnumC993970byN("GP", 1, "GP");
        GP = enumC993970byN2;
        EnumC993970byN enumC993970byN3 = new EnumC993970byN("AP", 2, "AP");
        AP = enumC993970byN3;
        EnumC993970byN enumC993970byN4 = new EnumC993970byN("AMAZON", 3, "Amazon");
        AMAZON = enumC993970byN4;
        EnumC993970byN enumC993970byN5 = new EnumC993970byN("WEB", 4, "Web");
        WEB = enumC993970byN5;
        EnumC993970byN[] enumC993970byNArr = {enumC993970byN, enumC993970byN2, enumC993970byN3, enumC993970byN4, enumC993970byN5};
        LLILLJJLI = enumC993970byNArr;
        LLILLL = new C2254308sP(enumC993970byNArr);
        Companion = new Object() { // from class: X.0byO
        };
    }

    public static EnumC993970byN[] values() {
        return (EnumC993970byN[]) LLILLJJLI.clone();
    }

    public final String getChannelName() {
        return this.LL;
    }

    public static EnumC993970byN valueOf(String str) {
        return (EnumC993970byN) C08FF.LIZ(EnumC993970byN.class, str);
    }

    public EnumC993970byN(String str, int i, String str2) {
        this.LL = str2;
    }
}
