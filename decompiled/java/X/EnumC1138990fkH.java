package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0fkH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1138990fkH {
    public static final EnumC1138990fkH ALPHA_PLAYER;
    public static final /* synthetic */ EnumC1138990fkH[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1138990fkH LYNX;
    public static final EnumC1138990fkH NONE;
    public static final EnumC1138990fkH STICKER;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1138990fkH> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1138990fkH enumC1138990fkH = new EnumC1138990fkH("NONE", 0, "none");
        NONE = enumC1138990fkH;
        EnumC1138990fkH enumC1138990fkH2 = new EnumC1138990fkH("ALPHA_PLAYER", 1, "alpha_player");
        ALPHA_PLAYER = enumC1138990fkH2;
        EnumC1138990fkH enumC1138990fkH3 = new EnumC1138990fkH("LYNX", 2, "lynx_native");
        LYNX = enumC1138990fkH3;
        EnumC1138990fkH enumC1138990fkH4 = new EnumC1138990fkH("STICKER", 3, "sticker");
        STICKER = enumC1138990fkH4;
        EnumC1138990fkH[] enumC1138990fkHArr = {enumC1138990fkH, enumC1138990fkH2, enumC1138990fkH3, enumC1138990fkH4};
        LLILLJJLI = enumC1138990fkHArr;
        LLILLL = new C2254308sP(enumC1138990fkHArr);
    }

    public static EnumC1138990fkH[] values() {
        return (EnumC1138990fkH[]) LLILLJJLI.clone();
    }

    public final String getTypeString() {
        return this.LL;
    }

    public static EnumC1138990fkH valueOf(String str) {
        return (EnumC1138990fkH) C08FF.LIZ(EnumC1138990fkH.class, str);
    }

    public EnumC1138990fkH(String str, int i, String str2) {
        this.LL = str2;
    }
}
