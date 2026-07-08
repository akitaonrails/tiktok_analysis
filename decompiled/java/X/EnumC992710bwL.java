package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bwL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC992710bwL {
    public static final EnumC992710bwL AUTOTOPUP;
    public static final EnumC992710bwL BUY;
    public static final C992720bwM Companion;
    public static final /* synthetic */ EnumC992710bwL[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC992710bwL> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0bwM] */
    static {
        EnumC992710bwL enumC992710bwL = new EnumC992710bwL("BUY", 0, "buy");
        BUY = enumC992710bwL;
        EnumC992710bwL enumC992710bwL2 = new EnumC992710bwL("AUTOTOPUP", 1, "autoTopUp");
        AUTOTOPUP = enumC992710bwL2;
        EnumC992710bwL[] enumC992710bwLArr = {enumC992710bwL, enumC992710bwL2};
        LLILLJJLI = enumC992710bwLArr;
        LLILLL = new C2254308sP(enumC992710bwLArr);
        Companion = new Object() { // from class: X.0bwM
        };
    }

    public static EnumC992710bwL[] values() {
        return (EnumC992710bwL[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC992710bwL valueOf(String str) {
        return (EnumC992710bwL) C08FF.LIZ(EnumC992710bwL.class, str);
    }

    public EnumC992710bwL(String str, int i, String str2) {
        this.LL = str2;
    }
}
