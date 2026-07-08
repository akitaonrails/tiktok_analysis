package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0PqH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC657270PqH {
    public static final EnumC657270PqH AUTHOR_AREA;
    public static final EnumC657270PqH DESC_STYLE;
    public static final EnumC657270PqH DIGG_STATE;
    public static final EnumC657270PqH IMAGE_LANDING_INSITE_CELL;
    public static final /* synthetic */ EnumC657270PqH[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC657270PqH TAG_AREA;
    public static final EnumC657270PqH TEXT_DESC_AREA;

    public static InterfaceC2044707zh<EnumC657270PqH> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC657270PqH enumC657270PqH = new EnumC657270PqH("DIGG_STATE", 0);
        DIGG_STATE = enumC657270PqH;
        EnumC657270PqH enumC657270PqH2 = new EnumC657270PqH("TAG_AREA", 1);
        TAG_AREA = enumC657270PqH2;
        EnumC657270PqH enumC657270PqH3 = new EnumC657270PqH("DESC_STYLE", 2);
        DESC_STYLE = enumC657270PqH3;
        EnumC657270PqH enumC657270PqH4 = new EnumC657270PqH("TEXT_DESC_AREA", 3);
        TEXT_DESC_AREA = enumC657270PqH4;
        EnumC657270PqH enumC657270PqH5 = new EnumC657270PqH("AUTHOR_AREA", 4);
        AUTHOR_AREA = enumC657270PqH5;
        EnumC657270PqH enumC657270PqH6 = new EnumC657270PqH("IMAGE_LANDING_INSITE_CELL", 5);
        IMAGE_LANDING_INSITE_CELL = enumC657270PqH6;
        EnumC657270PqH[] enumC657270PqHArr = {enumC657270PqH, enumC657270PqH2, enumC657270PqH3, enumC657270PqH4, enumC657270PqH5, enumC657270PqH6};
        LL = enumC657270PqHArr;
        LLILLJJLI = new C2254308sP(enumC657270PqHArr);
    }

    public static EnumC657270PqH[] values() {
        return (EnumC657270PqH[]) LL.clone();
    }

    public static EnumC657270PqH valueOf(String str) {
        return (EnumC657270PqH) C08FF.LIZ(EnumC657270PqH.class, str);
    }

    public EnumC657270PqH(String str, int i) {
    }
}
