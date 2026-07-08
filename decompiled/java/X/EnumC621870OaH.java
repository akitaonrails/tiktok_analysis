package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0OaH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC621870OaH {
    public static final EnumC621870OaH CONTENT_KEY;
    public static final EnumC621870OaH CONTENT_VALUE;
    public static final C621880OaI Companion;
    public static final EnumC621870OaH ITEM_ID;
    public static final /* synthetic */ EnumC621870OaH[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public final String LL;
    public final String LLILLJJLI;

    public static InterfaceC2044707zh<EnumC621870OaH> getEntries() {
        return LLILZ;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0OaI] */
    static {
        EnumC621870OaH enumC621870OaH = new EnumC621870OaH("ITEM_ID", 0, "item_id", "TEXT NOT NULL");
        ITEM_ID = enumC621870OaH;
        EnumC621870OaH enumC621870OaH2 = new EnumC621870OaH("CONTENT_KEY", 1, "contentKey", "TEXT NOT NULL");
        CONTENT_KEY = enumC621870OaH2;
        EnumC621870OaH enumC621870OaH3 = new EnumC621870OaH("CONTENT_VALUE", 2, "contentValue", "TEXT");
        CONTENT_VALUE = enumC621870OaH3;
        EnumC621870OaH[] enumC621870OaHArr = {enumC621870OaH, enumC621870OaH2, enumC621870OaH3};
        LLILLL = enumC621870OaHArr;
        LLILZ = new C2254308sP(enumC621870OaHArr);
        Companion = new Object() { // from class: X.0OaI
        };
    }

    public static EnumC621870OaH[] values() {
        return (EnumC621870OaH[]) LLILLL.clone();
    }

    public final String getKey() {
        return this.LL;
    }

    public final String getType() {
        return this.LLILLJJLI;
    }

    public static EnumC621870OaH valueOf(String str) {
        return (EnumC621870OaH) C08FF.LIZ(EnumC621870OaH.class, str);
    }

    public EnumC621870OaH(String str, int i, String str2, String str3) {
        this.LL = str2;
        this.LLILLJJLI = str3;
    }
}
