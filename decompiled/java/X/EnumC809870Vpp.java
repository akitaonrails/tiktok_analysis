package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Vpp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class EnumC809870Vpp {
    public static final EnumC809870Vpp FIREBASE;
    public static final EnumC809870Vpp INIT;
    public static final /* synthetic */ EnumC809870Vpp[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC809870Vpp UPDATE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC809870Vpp> getEntries() {
        return LLILLL;
    }

    static {
        EnumC809870Vpp enumC809870Vpp = new EnumC809870Vpp("INIT", 0, "[INIT]");
        INIT = enumC809870Vpp;
        EnumC809870Vpp enumC809870Vpp2 = new EnumC809870Vpp("UPDATE", 1, "[UPDATE]");
        UPDATE = enumC809870Vpp2;
        EnumC809870Vpp enumC809870Vpp3 = new EnumC809870Vpp("FIREBASE", 2, "[FIREBASE]");
        FIREBASE = enumC809870Vpp3;
        EnumC809870Vpp[] enumC809870VppArr = {enumC809870Vpp, enumC809870Vpp2, enumC809870Vpp3};
        LLILLJJLI = enumC809870VppArr;
        LLILLL = new C2254308sP(enumC809870VppArr);
    }

    public static EnumC809870Vpp[] values() {
        return (EnumC809870Vpp[]) LLILLJJLI.clone();
    }

    public final String getTag() {
        return this.LL;
    }

    public static EnumC809870Vpp valueOf(String str) {
        return (EnumC809870Vpp) C08FF.LIZ(EnumC809870Vpp.class, str);
    }

    public EnumC809870Vpp(String str, int i, String str2) {
        this.LL = str2;
    }
}
