package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0a4n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC921070a4n {
    public static final EnumC921070a4n BLACK;
    public static final EnumC921070a4n CUT;
    public static final /* synthetic */ EnumC921070a4n[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC921070a4n NONE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC921070a4n> getEntries() {
        return LLILLL;
    }

    static {
        EnumC921070a4n enumC921070a4n = new EnumC921070a4n("CUT", 0, "cut");
        CUT = enumC921070a4n;
        EnumC921070a4n enumC921070a4n2 = new EnumC921070a4n("BLACK", 1, "black");
        BLACK = enumC921070a4n2;
        EnumC921070a4n enumC921070a4n3 = new EnumC921070a4n("NONE", 2, "none");
        NONE = enumC921070a4n3;
        EnumC921070a4n[] enumC921070a4nArr = {enumC921070a4n, enumC921070a4n2, enumC921070a4n3};
        LLILLJJLI = enumC921070a4nArr;
        LLILLL = new C2254308sP(enumC921070a4nArr);
    }

    public static EnumC921070a4n[] values() {
        return (EnumC921070a4n[]) LLILLJJLI.clone();
    }

    public final String getStr() {
        return this.LL;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.LL;
    }

    public static EnumC921070a4n valueOf(String str) {
        return (EnumC921070a4n) C08FF.LIZ(EnumC921070a4n.class, str);
    }

    public EnumC921070a4n(String str, int i, String str2) {
        this.LL = str2;
    }
}
