package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0xcy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1826380xcy {
    public static final EnumC1826380xcy EDIT_ONLY_ONE_TEMPLATE;
    public static final EnumC1826380xcy EDIT_SELECTED;
    public static final EnumC1826380xcy EDIT_UNSELECTED;
    public static final /* synthetic */ EnumC1826380xcy[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1826380xcy PREVIEW_DISPLAY;

    public static InterfaceC2044707zh<EnumC1826380xcy> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1826380xcy enumC1826380xcy = new EnumC1826380xcy("EDIT_ONLY_ONE_TEMPLATE", 0);
        EDIT_ONLY_ONE_TEMPLATE = enumC1826380xcy;
        EnumC1826380xcy enumC1826380xcy2 = new EnumC1826380xcy("EDIT_SELECTED", 1);
        EDIT_SELECTED = enumC1826380xcy2;
        EnumC1826380xcy enumC1826380xcy3 = new EnumC1826380xcy("EDIT_UNSELECTED", 2);
        EDIT_UNSELECTED = enumC1826380xcy3;
        EnumC1826380xcy enumC1826380xcy4 = new EnumC1826380xcy("PREVIEW_DISPLAY", 3);
        PREVIEW_DISPLAY = enumC1826380xcy4;
        EnumC1826380xcy[] enumC1826380xcyArr = {enumC1826380xcy, enumC1826380xcy2, enumC1826380xcy3, enumC1826380xcy4};
        LL = enumC1826380xcyArr;
        LLILLJJLI = new C2254308sP(enumC1826380xcyArr);
    }

    public static EnumC1826380xcy[] values() {
        return (EnumC1826380xcy[]) LL.clone();
    }

    public static EnumC1826380xcy valueOf(String str) {
        return (EnumC1826380xcy) C08FF.LIZ(EnumC1826380xcy.class, str);
    }

    public EnumC1826380xcy(String str, int i) {
    }
}
