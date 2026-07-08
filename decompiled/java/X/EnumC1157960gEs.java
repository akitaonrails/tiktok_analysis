package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0gEs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1157960gEs {
    public static final EnumC1157960gEs BLACK;
    public static final EnumC1157960gEs BOLD;
    public static final /* synthetic */ EnumC1157960gEs[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1157960gEs> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1157960gEs enumC1157960gEs = new EnumC1157960gEs("BOLD", 0, "1");
        BOLD = enumC1157960gEs;
        EnumC1157960gEs enumC1157960gEs2 = new EnumC1157960gEs("BLACK", 1, "2");
        BLACK = enumC1157960gEs2;
        EnumC1157960gEs[] enumC1157960gEsArr = {enumC1157960gEs, enumC1157960gEs2};
        LLILLJJLI = enumC1157960gEsArr;
        LLILLL = new C2254308sP(enumC1157960gEsArr);
    }

    public static EnumC1157960gEs[] values() {
        return (EnumC1157960gEs[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1157960gEs valueOf(String str) {
        return (EnumC1157960gEs) C08FF.LIZ(EnumC1157960gEs.class, str);
    }

    public EnumC1157960gEs(String str, int i, String str2) {
        this.LL = str2;
    }
}
