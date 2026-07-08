package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0soc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class EnumC1641400soc {
    public static final EnumC1641400soc COLLECT;
    public static final EnumC1641400soc EMOJI;
    public static final EnumC1641400soc GIF_SUBPAGE;
    public static final /* synthetic */ EnumC1641400soc[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1641400soc MAIN;
    public static final EnumC1641400soc PROVIDER;
    public static final EnumC1641400soc SET_STICKER;
    public static final EnumC1641400soc SET_STICKER_SUBPAGE;

    public static InterfaceC2044707zh<EnumC1641400soc> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1641400soc enumC1641400soc = new EnumC1641400soc("MAIN", 0);
        MAIN = enumC1641400soc;
        EnumC1641400soc enumC1641400soc2 = new EnumC1641400soc("EMOJI", 1);
        EMOJI = enumC1641400soc2;
        EnumC1641400soc enumC1641400soc3 = new EnumC1641400soc("PROVIDER", 2);
        PROVIDER = enumC1641400soc3;
        EnumC1641400soc enumC1641400soc4 = new EnumC1641400soc("COLLECT", 3);
        COLLECT = enumC1641400soc4;
        EnumC1641400soc enumC1641400soc5 = new EnumC1641400soc("GIF_SUBPAGE", 4);
        GIF_SUBPAGE = enumC1641400soc5;
        EnumC1641400soc enumC1641400soc6 = new EnumC1641400soc("SET_STICKER", 5);
        SET_STICKER = enumC1641400soc6;
        EnumC1641400soc enumC1641400soc7 = new EnumC1641400soc("SET_STICKER_SUBPAGE", 6);
        SET_STICKER_SUBPAGE = enumC1641400soc7;
        EnumC1641400soc[] enumC1641400socArr = {enumC1641400soc, enumC1641400soc2, enumC1641400soc3, enumC1641400soc4, enumC1641400soc5, enumC1641400soc6, enumC1641400soc7};
        LL = enumC1641400socArr;
        LLILLJJLI = new C2254308sP(enumC1641400socArr);
    }

    public static EnumC1641400soc[] values() {
        return (EnumC1641400soc[]) LL.clone();
    }

    public static EnumC1641400soc valueOf(String str) {
        return (EnumC1641400soc) C08FF.LIZ(EnumC1641400soc.class, str);
    }

    public EnumC1641400soc(String str, int i) {
    }
}
