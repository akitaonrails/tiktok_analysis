package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wPX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1779610wPX {
    public static final /* synthetic */ EnumC1779610wPX[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1779610wPX TAG_ICON;
    public static final EnumC1779610wPX TAG_TEXT;
    public static final EnumC1779610wPX TAG_TILE_IMAGE;

    public static InterfaceC2044707zh<EnumC1779610wPX> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1779610wPX enumC1779610wPX = new EnumC1779610wPX("TAG_ICON", 0);
        TAG_ICON = enumC1779610wPX;
        EnumC1779610wPX enumC1779610wPX2 = new EnumC1779610wPX("TAG_TEXT", 1);
        TAG_TEXT = enumC1779610wPX2;
        EnumC1779610wPX enumC1779610wPX3 = new EnumC1779610wPX("TAG_TILE_IMAGE", 2);
        TAG_TILE_IMAGE = enumC1779610wPX3;
        EnumC1779610wPX[] enumC1779610wPXArr = {enumC1779610wPX, enumC1779610wPX2, enumC1779610wPX3};
        LL = enumC1779610wPXArr;
        LLILLJJLI = new C2254308sP(enumC1779610wPXArr);
    }

    public static EnumC1779610wPX[] values() {
        return (EnumC1779610wPX[]) LL.clone();
    }

    public static EnumC1779610wPX valueOf(String str) {
        return (EnumC1779610wPX) C08FF.LIZ(EnumC1779610wPX.class, str);
    }

    public EnumC1779610wPX(String str, int i) {
    }
}
