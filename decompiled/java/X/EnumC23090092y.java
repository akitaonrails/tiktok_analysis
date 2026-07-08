package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.092y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC23090092y {
    public static final EnumC23090092y ARTIST_CACHE;
    public static final EnumC23090092y EFFECT_MANAGER;
    public static final EnumC23090092y EFFECT_MANAGER_MODEL;
    public static final EnumC23090092y IMUSE_CACHE;
    public static final /* synthetic */ EnumC23090092y[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC23090092y MATERIAL_RESOURCE_CACHE;
    public static final EnumC23090092y MEDIA_CACHE;
    public static final EnumC23090092y OUTPUT;
    public static final EnumC23090092y TEMPLATE_CACHE;
    public static final EnumC23090092y TEMPLATE_WORKSPACE;
    public static final EnumC23090092y VEEDITOR;
    public static final EnumC23090092y VESDK;
    public final String LL;

    public static InterfaceC2044707zh<EnumC23090092y> getEntries() {
        return LLILLL;
    }

    static {
        EnumC23090092y enumC23090092y = new EnumC23090092y("VESDK", 0, "vesdk");
        VESDK = enumC23090092y;
        EnumC23090092y enumC23090092y2 = new EnumC23090092y("VEEDITOR", 1, "veeditor");
        VEEDITOR = enumC23090092y2;
        EnumC23090092y enumC23090092y3 = new EnumC23090092y("EFFECT_MANAGER", 2, "effectmanager");
        EFFECT_MANAGER = enumC23090092y3;
        EnumC23090092y enumC23090092y4 = new EnumC23090092y("EFFECT_MANAGER_MODEL", 3, "effectmodel");
        EFFECT_MANAGER_MODEL = enumC23090092y4;
        EnumC23090092y enumC23090092y5 = new EnumC23090092y("MEDIA_CACHE", 4, "media_cache");
        MEDIA_CACHE = enumC23090092y5;
        EnumC23090092y enumC23090092y6 = new EnumC23090092y("TEMPLATE_CACHE", 5, "template_cache");
        TEMPLATE_CACHE = enumC23090092y6;
        EnumC23090092y enumC23090092y7 = new EnumC23090092y("TEMPLATE_WORKSPACE", 6, "workspace");
        TEMPLATE_WORKSPACE = enumC23090092y7;
        EnumC23090092y enumC23090092y8 = new EnumC23090092y("OUTPUT", 7, "output");
        OUTPUT = enumC23090092y8;
        EnumC23090092y enumC23090092y9 = new EnumC23090092y("ARTIST_CACHE", 8, "artist_cache");
        ARTIST_CACHE = enumC23090092y9;
        EnumC23090092y enumC23090092y10 = new EnumC23090092y("IMUSE_CACHE", 9, "imuse_cache");
        IMUSE_CACHE = enumC23090092y10;
        EnumC23090092y enumC23090092y11 = new EnumC23090092y("MATERIAL_RESOURCE_CACHE", 10, "material_resource_cache");
        MATERIAL_RESOURCE_CACHE = enumC23090092y11;
        EnumC23090092y[] enumC23090092yArr = {enumC23090092y, enumC23090092y2, enumC23090092y3, enumC23090092y4, enumC23090092y5, enumC23090092y6, enumC23090092y7, enumC23090092y8, enumC23090092y9, enumC23090092y10, enumC23090092y11};
        LLILLJJLI = enumC23090092yArr;
        LLILLL = new C2254308sP(enumC23090092yArr);
    }

    public static EnumC23090092y[] values() {
        return (EnumC23090092y[]) LLILLJJLI.clone();
    }

    public final String getDirName() {
        return this.LL;
    }

    public static EnumC23090092y valueOf(String str) {
        return (EnumC23090092y) C08FF.LIZ(EnumC23090092y.class, str);
    }

    public EnumC23090092y(String str, int i, String str2) {
        this.LL = str2;
    }
}
