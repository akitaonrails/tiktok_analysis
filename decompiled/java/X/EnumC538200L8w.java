package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0L8w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC538200L8w {
    public static final EnumC538200L8w AI_IMAGE;
    public static final EnumC538200L8w ALL;
    public static final EnumC538200L8w LIVE_PHOTO;
    public static final /* synthetic */ EnumC538200L8w[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC538200L8w PHOTO;
    public static final EnumC538200L8w VIDEO;
    public final String LL;

    public static InterfaceC2044707zh<EnumC538200L8w> getEntries() {
        return LLILLL;
    }

    static {
        EnumC538200L8w enumC538200L8w = new EnumC538200L8w("ALL", 0, "all");
        ALL = enumC538200L8w;
        EnumC538200L8w enumC538200L8w2 = new EnumC538200L8w("VIDEO", 1, "video");
        VIDEO = enumC538200L8w2;
        EnumC538200L8w enumC538200L8w3 = new EnumC538200L8w("PHOTO", 2, "photo");
        PHOTO = enumC538200L8w3;
        EnumC538200L8w enumC538200L8w4 = new EnumC538200L8w("LIVE_PHOTO", 3, "live");
        LIVE_PHOTO = enumC538200L8w4;
        EnumC538200L8w enumC538200L8w5 = new EnumC538200L8w("AI_IMAGE", 4, "ai_image");
        AI_IMAGE = enumC538200L8w5;
        EnumC538200L8w[] enumC538200L8wArr = {enumC538200L8w, enumC538200L8w2, enumC538200L8w3, enumC538200L8w4, enumC538200L8w5};
        LLILLJJLI = enumC538200L8wArr;
        LLILLL = new C2254308sP(enumC538200L8wArr);
    }

    public static EnumC538200L8w[] values() {
        return (EnumC538200L8w[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC538200L8w valueOf(String str) {
        return (EnumC538200L8w) C08FF.LIZ(EnumC538200L8w.class, str);
    }

    public EnumC538200L8w(String str, int i, String str2) {
        this.LL = str2;
    }
}
