package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.13ln, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class EnumC20106513ln {
    public static final EnumC20106513ln BOOLEAN;
    public static final EnumC20106513ln DATA;
    public static final EnumC20106513ln INT;
    public static final /* synthetic */ EnumC20106513ln[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC20106513ln LONG;
    public static final EnumC20106513ln STRING;

    public static InterfaceC2044707zh<EnumC20106513ln> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC20106513ln enumC20106513ln = new EnumC20106513ln("BOOLEAN", 0);
        BOOLEAN = enumC20106513ln;
        EnumC20106513ln enumC20106513ln2 = new EnumC20106513ln("INT", 1);
        INT = enumC20106513ln2;
        EnumC20106513ln enumC20106513ln3 = new EnumC20106513ln("LONG", 2);
        LONG = enumC20106513ln3;
        EnumC20106513ln enumC20106513ln4 = new EnumC20106513ln("STRING", 3);
        STRING = enumC20106513ln4;
        EnumC20106513ln enumC20106513ln5 = new EnumC20106513ln("DATA", 4);
        DATA = enumC20106513ln5;
        EnumC20106513ln[] enumC20106513lnArr = {enumC20106513ln, enumC20106513ln2, enumC20106513ln3, enumC20106513ln4, enumC20106513ln5};
        LL = enumC20106513lnArr;
        LLILLJJLI = new C2254308sP(enumC20106513lnArr);
    }

    public static EnumC20106513ln[] values() {
        return (EnumC20106513ln[]) LL.clone();
    }

    public static EnumC20106513ln valueOf(String str) {
        return (EnumC20106513ln) C08FF.LIZ(EnumC20106513ln.class, str);
    }

    public EnumC20106513ln(String str, int i) {
    }
}
