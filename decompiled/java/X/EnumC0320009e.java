package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.009e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0320009e {
    public static final C0321009f Companion;
    public static final /* synthetic */ EnumC0320009e[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC0320009e MODERATION_ASSETS;
    public static final EnumC0320009e MODERATION_TEXTS;
    public static final EnumC0320009e QUALITY_ASSETS_TYPE;
    public static final EnumC0320009e QUALITY_FEATURE_TYPE_COUNT;
    public static final EnumC0320009e QUALITY_OBJECT_COUNT;
    public static final EnumC0320009e QUALITY_OBJECT_WITH_USER_ASSETS_COUNT;
    public static final EnumC0320009e QUALITY_PREVIEW_COUNT;
    public static final EnumC0320009e QUALITY_VALID_ACTION_COUNT;
    public static final EnumC0320009e QUALITY_VALID_COMMAND_COUNT;
    public final String LL;

    public static InterfaceC2044707zh<EnumC0320009e> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [X.009f] */
    static {
        EnumC0320009e enumC0320009e = new EnumC0320009e("QUALITY_PREVIEW_COUNT", 0, "quality_preview_count");
        QUALITY_PREVIEW_COUNT = enumC0320009e;
        EnumC0320009e enumC0320009e2 = new EnumC0320009e("QUALITY_OBJECT_COUNT", 1, "quality_object_count");
        QUALITY_OBJECT_COUNT = enumC0320009e2;
        EnumC0320009e enumC0320009e3 = new EnumC0320009e("QUALITY_FEATURE_TYPE_COUNT", 2, "quality_feature_type_count");
        QUALITY_FEATURE_TYPE_COUNT = enumC0320009e3;
        EnumC0320009e enumC0320009e4 = new EnumC0320009e("QUALITY_VALID_COMMAND_COUNT", 3, "quality_valid_command_count");
        QUALITY_VALID_COMMAND_COUNT = enumC0320009e4;
        EnumC0320009e enumC0320009e5 = new EnumC0320009e("QUALITY_OBJECT_WITH_USER_ASSETS_COUNT", 4, "quality_object_with_user_assets_count");
        QUALITY_OBJECT_WITH_USER_ASSETS_COUNT = enumC0320009e5;
        EnumC0320009e enumC0320009e6 = new EnumC0320009e("QUALITY_VALID_ACTION_COUNT", 5, "quality_valid_action_count");
        QUALITY_VALID_ACTION_COUNT = enumC0320009e6;
        EnumC0320009e enumC0320009e7 = new EnumC0320009e("QUALITY_ASSETS_TYPE", 6, "quality_assets_type");
        QUALITY_ASSETS_TYPE = enumC0320009e7;
        EnumC0320009e enumC0320009e8 = new EnumC0320009e("MODERATION_TEXTS", 7, "moderation_texts");
        MODERATION_TEXTS = enumC0320009e8;
        EnumC0320009e enumC0320009e9 = new EnumC0320009e("MODERATION_ASSETS", 8, "moderation_assets");
        MODERATION_ASSETS = enumC0320009e9;
        EnumC0320009e[] enumC0320009eArr = {enumC0320009e, enumC0320009e2, enumC0320009e3, enumC0320009e4, enumC0320009e5, enumC0320009e6, enumC0320009e7, enumC0320009e8, enumC0320009e9};
        LLILLJJLI = enumC0320009eArr;
        LLILLL = new C2254308sP(enumC0320009eArr);
        Companion = new Object() { // from class: X.009f
        };
    }

    public static EnumC0320009e[] values() {
        return (EnumC0320009e[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.LL;
    }

    public static EnumC0320009e valueOf(String str) {
        return (EnumC0320009e) C08FF.LIZ(EnumC0320009e.class, str);
    }

    public EnumC0320009e(String str, int i, String str2) {
        this.LL = str2;
    }
}
