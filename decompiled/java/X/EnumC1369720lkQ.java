package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0lkQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1369720lkQ {
    public static final EnumC1369720lkQ COLLAPSE;
    public static final EnumC1369720lkQ CONCAT_HORIZONTAL;
    public static final EnumC1369720lkQ EXPAND;
    public static final EnumC1369720lkQ HORIZONTAL;
    public static final EnumC1369720lkQ HORIZONTAL_WITHOUT_FILLMODE;
    public static final EnumC1369720lkQ HORIZONTAL_WITH_FILLMODE;
    public static final /* synthetic */ EnumC1369720lkQ[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1369720lkQ VERTICAL;
    public static final EnumC1369720lkQ VERTICAL_WITH_FILLMODE;

    public static InterfaceC2044707zh<EnumC1369720lkQ> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1369720lkQ enumC1369720lkQ = new EnumC1369720lkQ("HORIZONTAL", 0);
        HORIZONTAL = enumC1369720lkQ;
        EnumC1369720lkQ enumC1369720lkQ2 = new EnumC1369720lkQ("VERTICAL", 1);
        VERTICAL = enumC1369720lkQ2;
        EnumC1369720lkQ enumC1369720lkQ3 = new EnumC1369720lkQ("COLLAPSE", 2);
        COLLAPSE = enumC1369720lkQ3;
        EnumC1369720lkQ enumC1369720lkQ4 = new EnumC1369720lkQ("EXPAND", 3);
        EXPAND = enumC1369720lkQ4;
        EnumC1369720lkQ enumC1369720lkQ5 = new EnumC1369720lkQ("HORIZONTAL_WITHOUT_FILLMODE", 4);
        HORIZONTAL_WITHOUT_FILLMODE = enumC1369720lkQ5;
        EnumC1369720lkQ enumC1369720lkQ6 = new EnumC1369720lkQ("HORIZONTAL_WITH_FILLMODE", 5);
        HORIZONTAL_WITH_FILLMODE = enumC1369720lkQ6;
        EnumC1369720lkQ enumC1369720lkQ7 = new EnumC1369720lkQ("VERTICAL_WITH_FILLMODE", 6);
        VERTICAL_WITH_FILLMODE = enumC1369720lkQ7;
        EnumC1369720lkQ enumC1369720lkQ8 = new EnumC1369720lkQ("CONCAT_HORIZONTAL", 7);
        CONCAT_HORIZONTAL = enumC1369720lkQ8;
        EnumC1369720lkQ[] enumC1369720lkQArr = {enumC1369720lkQ, enumC1369720lkQ2, enumC1369720lkQ3, enumC1369720lkQ4, enumC1369720lkQ5, enumC1369720lkQ6, enumC1369720lkQ7, enumC1369720lkQ8};
        LL = enumC1369720lkQArr;
        LLILLJJLI = new C2254308sP(enumC1369720lkQArr);
    }

    public static EnumC1369720lkQ[] values() {
        return (EnumC1369720lkQ[]) LL.clone();
    }

    public static EnumC1369720lkQ valueOf(String str) {
        return (EnumC1369720lkQ) C08FF.LIZ(EnumC1369720lkQ.class, str);
    }

    public EnumC1369720lkQ(String str, int i) {
    }
}
