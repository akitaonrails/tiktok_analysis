package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0iBI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1232620iBI {
    public static final /* synthetic */ EnumC1232620iBI[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1232620iBI MAIN;
    public static final EnumC1232620iBI SECONDARY;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1232620iBI> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1232620iBI enumC1232620iBI = new EnumC1232620iBI("MAIN", 0, "Main");
        MAIN = enumC1232620iBI;
        EnumC1232620iBI enumC1232620iBI2 = new EnumC1232620iBI("SECONDARY", 1, "Secondary");
        SECONDARY = enumC1232620iBI2;
        EnumC1232620iBI[] enumC1232620iBIArr = {enumC1232620iBI, enumC1232620iBI2};
        LLILLJJLI = enumC1232620iBIArr;
        LLILLL = new C2254308sP(enumC1232620iBIArr);
    }

    public static EnumC1232620iBI[] values() {
        return (EnumC1232620iBI[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1232620iBI valueOf(String str) {
        return (EnumC1232620iBI) C08FF.LIZ(EnumC1232620iBI.class, str);
    }

    public EnumC1232620iBI(String str, int i, String str2) {
        this.LL = str2;
    }
}
