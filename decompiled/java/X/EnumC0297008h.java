package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.008h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0297008h {
    public static final EnumC0297008h CAMERA_EDIT_MATERIAL;
    public static final EnumC0297008h CAMERA_PREVIEW_MATERIAL;
    public static final EnumC0297008h CAMERA_PREVIEW_MATERIAL_NO_PUBLISH;
    public static final EnumC0297008h CAMERA_PREVIEW_TEMPLATE;
    public static final /* synthetic */ EnumC0297008h[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC0297008h MODEL_PHOTOS_EDIT_MATERIAL;
    public static final EnumC0297008h MODE_PHOTOS_MODIFY_MODE_PHOTOS;
    public static final EnumC0297008h UNKNOWN;

    public static InterfaceC2044707zh<EnumC0297008h> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC0297008h enumC0297008h = new EnumC0297008h("UNKNOWN", 0);
        UNKNOWN = enumC0297008h;
        EnumC0297008h enumC0297008h2 = new EnumC0297008h("CAMERA_EDIT_MATERIAL", 1);
        CAMERA_EDIT_MATERIAL = enumC0297008h2;
        EnumC0297008h enumC0297008h3 = new EnumC0297008h("CAMERA_PREVIEW_MATERIAL", 2);
        CAMERA_PREVIEW_MATERIAL = enumC0297008h3;
        EnumC0297008h enumC0297008h4 = new EnumC0297008h("CAMERA_PREVIEW_MATERIAL_NO_PUBLISH", 3);
        CAMERA_PREVIEW_MATERIAL_NO_PUBLISH = enumC0297008h4;
        EnumC0297008h enumC0297008h5 = new EnumC0297008h("CAMERA_PREVIEW_TEMPLATE", 4);
        CAMERA_PREVIEW_TEMPLATE = enumC0297008h5;
        EnumC0297008h enumC0297008h6 = new EnumC0297008h("MODEL_PHOTOS_EDIT_MATERIAL", 5);
        MODEL_PHOTOS_EDIT_MATERIAL = enumC0297008h6;
        EnumC0297008h enumC0297008h7 = new EnumC0297008h("MODE_PHOTOS_MODIFY_MODE_PHOTOS", 6);
        MODE_PHOTOS_MODIFY_MODE_PHOTOS = enumC0297008h7;
        EnumC0297008h[] enumC0297008hArr = {enumC0297008h, enumC0297008h2, enumC0297008h3, enumC0297008h4, enumC0297008h5, enumC0297008h6, enumC0297008h7};
        LL = enumC0297008hArr;
        LLILLJJLI = new C2254308sP(enumC0297008hArr);
    }

    public static EnumC0297008h[] values() {
        return (EnumC0297008h[]) LL.clone();
    }

    public static EnumC0297008h valueOf(String str) {
        return (EnumC0297008h) C08FF.LIZ(EnumC0297008h.class, str);
    }

    public EnumC0297008h(String str, int i) {
    }
}
