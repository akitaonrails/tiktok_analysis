package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Mye, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC586020Mye {
    public static final EnumC586020Mye AREA_CARD;
    public static final EnumC586020Mye AREA_DECORATION;
    public static final EnumC586020Mye AREA_DECORATION_WITH_PARENT_WIDTH;
    public static final /* synthetic */ EnumC586020Mye[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC586020Mye> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC586020Mye enumC586020Mye = new EnumC586020Mye("AREA_CARD", 0);
        AREA_CARD = enumC586020Mye;
        EnumC586020Mye enumC586020Mye2 = new EnumC586020Mye("AREA_DECORATION", 1);
        AREA_DECORATION = enumC586020Mye2;
        EnumC586020Mye enumC586020Mye3 = new EnumC586020Mye("AREA_DECORATION_WITH_PARENT_WIDTH", 2);
        AREA_DECORATION_WITH_PARENT_WIDTH = enumC586020Mye3;
        EnumC586020Mye[] enumC586020MyeArr = {enumC586020Mye, enumC586020Mye2, enumC586020Mye3};
        LL = enumC586020MyeArr;
        LLILLJJLI = new C2254308sP(enumC586020MyeArr);
    }

    public static EnumC586020Mye[] values() {
        return (EnumC586020Mye[]) LL.clone();
    }

    public static EnumC586020Mye valueOf(String str) {
        return (EnumC586020Mye) C08FF.LIZ(EnumC586020Mye.class, str);
    }

    public EnumC586020Mye(String str, int i) {
    }
}
