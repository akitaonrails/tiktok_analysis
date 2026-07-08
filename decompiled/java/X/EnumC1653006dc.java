package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.06dc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC1653006dc {
    public static final EnumC1653006dc AIMOJI;
    public static final EnumC1653006dc AISELF;
    public static final /* synthetic */ EnumC1653006dc[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1653006dc STICKER;
    public static final EnumC1653006dc TENOR;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1653006dc> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1653006dc enumC1653006dc = new EnumC1653006dc("STICKER", 0, "sticker");
        STICKER = enumC1653006dc;
        EnumC1653006dc enumC1653006dc2 = new EnumC1653006dc("TENOR", 1, "tenor");
        TENOR = enumC1653006dc2;
        EnumC1653006dc enumC1653006dc3 = new EnumC1653006dc("AIMOJI", 2, "aimoji");
        AIMOJI = enumC1653006dc3;
        EnumC1653006dc enumC1653006dc4 = new EnumC1653006dc("AISELF", 3, "ai_self_sticker");
        AISELF = enumC1653006dc4;
        EnumC1653006dc[] enumC1653006dcArr = {enumC1653006dc, enumC1653006dc2, enumC1653006dc3, enumC1653006dc4};
        LLILLJJLI = enumC1653006dcArr;
        LLILLL = new C2254308sP(enumC1653006dcArr);
    }

    public static EnumC1653006dc[] values() {
        return (EnumC1653006dc[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1653006dc valueOf(String str) {
        return (EnumC1653006dc) C08FF.LIZ(EnumC1653006dc.class, str);
    }

    public EnumC1653006dc(String str, int i, String str2) {
        this.LL = str2;
    }
}
