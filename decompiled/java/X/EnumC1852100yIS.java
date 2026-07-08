package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0yIS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1852100yIS {
    public static final /* synthetic */ EnumC1852100yIS[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1852100yIS PHOTO_PICKER_PANEL_CLOSE;
    public static final EnumC1852100yIS PHOTO_PICKER_PANEL_DISABLE;
    public static final EnumC1852100yIS PHOTO_PICKER_PANEL_FORBIDDEN;
    public static final EnumC1852100yIS PHOTO_PICKER_PANEL_OPEN;

    public static InterfaceC2044707zh<EnumC1852100yIS> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1852100yIS enumC1852100yIS = new EnumC1852100yIS("PHOTO_PICKER_PANEL_OPEN", 0);
        PHOTO_PICKER_PANEL_OPEN = enumC1852100yIS;
        EnumC1852100yIS enumC1852100yIS2 = new EnumC1852100yIS("PHOTO_PICKER_PANEL_CLOSE", 1);
        PHOTO_PICKER_PANEL_CLOSE = enumC1852100yIS2;
        EnumC1852100yIS enumC1852100yIS3 = new EnumC1852100yIS("PHOTO_PICKER_PANEL_DISABLE", 2);
        PHOTO_PICKER_PANEL_DISABLE = enumC1852100yIS3;
        EnumC1852100yIS enumC1852100yIS4 = new EnumC1852100yIS("PHOTO_PICKER_PANEL_FORBIDDEN", 3);
        PHOTO_PICKER_PANEL_FORBIDDEN = enumC1852100yIS4;
        EnumC1852100yIS[] enumC1852100yISArr = {enumC1852100yIS, enumC1852100yIS2, enumC1852100yIS3, enumC1852100yIS4};
        LL = enumC1852100yISArr;
        LLILLJJLI = new C2254308sP(enumC1852100yISArr);
    }

    public static EnumC1852100yIS[] values() {
        return (EnumC1852100yIS[]) LL.clone();
    }

    public static EnumC1852100yIS valueOf(String str) {
        return (EnumC1852100yIS) C08FF.LIZ(EnumC1852100yIS.class, str);
    }

    public EnumC1852100yIS(String str, int i) {
    }
}
