package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0vqN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1757810vqN {
    public static final C1757820vqO Companion;
    public static final /* synthetic */ EnumC1757810vqN[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1757810vqN LYNX;
    public static final EnumC1757810vqN MYNA;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1757810vqN> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0vqO] */
    static {
        EnumC1757810vqN enumC1757810vqN = new EnumC1757810vqN("MYNA", 0, "Myna");
        MYNA = enumC1757810vqN;
        EnumC1757810vqN enumC1757810vqN2 = new EnumC1757810vqN("LYNX", 1, "Lynx");
        LYNX = enumC1757810vqN2;
        EnumC1757810vqN[] enumC1757810vqNArr = {enumC1757810vqN, enumC1757810vqN2};
        LLILLJJLI = enumC1757810vqNArr;
        LLILLL = new C2254308sP(enumC1757810vqNArr);
        Companion = new Object() { // from class: X.0vqO
        };
    }

    public static EnumC1757810vqN[] values() {
        return (EnumC1757810vqN[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1757810vqN valueOf(String str) {
        return (EnumC1757810vqN) C08FF.LIZ(EnumC1757810vqN.class, str);
    }

    public EnumC1757810vqN(String str, int i, String str2) {
        this.LL = str2;
    }
}
