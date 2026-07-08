package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Zql, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC912370Zql {
    public static final /* synthetic */ EnumC912370Zql[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC912370Zql PUBLICRESOURCESCENE_AIMOJI;
    public static final EnumC912370Zql PUBLICRESOURCESCENE_OTHERSTICKERS;
    public static final EnumC912370Zql PUBLICRESOURCESCENE_SHAREVIDEO;
    public static final EnumC912370Zql PUBLICRESOURCESCENE_STICKERSET;
    public static final EnumC912370Zql PUBLICRESOURCESCENE_UNKNOWN;
    public static final EnumC912370Zql PUBLICRESOURCESCENE_VIDEO2STICKER;
    public final int LL;

    public static InterfaceC2044707zh<EnumC912370Zql> getEntries() {
        return LLILLL;
    }

    static {
        EnumC912370Zql enumC912370Zql = new EnumC912370Zql("PUBLICRESOURCESCENE_UNKNOWN", 0, 0);
        PUBLICRESOURCESCENE_UNKNOWN = enumC912370Zql;
        EnumC912370Zql enumC912370Zql2 = new EnumC912370Zql("PUBLICRESOURCESCENE_STICKERSET", 1, 1);
        PUBLICRESOURCESCENE_STICKERSET = enumC912370Zql2;
        EnumC912370Zql enumC912370Zql3 = new EnumC912370Zql("PUBLICRESOURCESCENE_VIDEO2STICKER", 2, 2);
        PUBLICRESOURCESCENE_VIDEO2STICKER = enumC912370Zql3;
        EnumC912370Zql enumC912370Zql4 = new EnumC912370Zql("PUBLICRESOURCESCENE_SHAREVIDEO", 3, 3);
        PUBLICRESOURCESCENE_SHAREVIDEO = enumC912370Zql4;
        EnumC912370Zql enumC912370Zql5 = new EnumC912370Zql("PUBLICRESOURCESCENE_AIMOJI", 4, 4);
        PUBLICRESOURCESCENE_AIMOJI = enumC912370Zql5;
        EnumC912370Zql enumC912370Zql6 = new EnumC912370Zql("PUBLICRESOURCESCENE_OTHERSTICKERS", 5, 5);
        PUBLICRESOURCESCENE_OTHERSTICKERS = enumC912370Zql6;
        EnumC912370Zql[] enumC912370ZqlArr = {enumC912370Zql, enumC912370Zql2, enumC912370Zql3, enumC912370Zql4, enumC912370Zql5, enumC912370Zql6};
        LLILLJJLI = enumC912370ZqlArr;
        LLILLL = new C2254308sP(enumC912370ZqlArr);
    }

    public static EnumC912370Zql[] values() {
        return (EnumC912370Zql[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC912370Zql valueOf(String str) {
        return (EnumC912370Zql) C08FF.LIZ(EnumC912370Zql.class, str);
    }

    public EnumC912370Zql(String str, int i, int i2) {
        this.LL = i2;
    }
}
