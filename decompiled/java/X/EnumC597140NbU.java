package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0NbU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC597140NbU {
    public static final EnumC597140NbU LLILLJJLI;
    public static final EnumC597140NbU LLILLL;
    public static final EnumC597140NbU LLILZ;
    public static final /* synthetic */ EnumC597140NbU[] LLILZIL;
    public final String LL;

    static {
        EnumC597140NbU enumC597140NbU = new EnumC597140NbU("INSERT_OR_UPDATE", 0, "insert_or_update");
        LLILLJJLI = enumC597140NbU;
        EnumC597140NbU enumC597140NbU2 = new EnumC597140NbU("REPLACE_ALL", 1, "replace_all");
        LLILLL = enumC597140NbU2;
        EnumC597140NbU enumC597140NbU3 = new EnumC597140NbU("REMOVE", 2, "remove");
        LLILZ = enumC597140NbU3;
        EnumC597140NbU[] enumC597140NbUArr = {enumC597140NbU, enumC597140NbU2, enumC597140NbU3};
        LLILZIL = enumC597140NbUArr;
        new C2254308sP(enumC597140NbUArr);
    }

    public static EnumC597140NbU[] values() {
        return (EnumC597140NbU[]) LLILZIL.clone();
    }

    public static EnumC597140NbU valueOf(String str) {
        return (EnumC597140NbU) C08FF.LIZ(EnumC597140NbU.class, str);
    }

    public EnumC597140NbU(String str, int i, String str2) {
        this.LL = str2;
    }
}
