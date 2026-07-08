package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Can, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC316430Can {
    public static final EnumC316430Can CAPABILITY_AME_TEMPLATE_ID;
    public static final EnumC316430Can CAPABILITY_APP_CLIENT_VERSION;
    public static final EnumC316430Can CAPABILITY_CREATE_DURATION;
    public static final EnumC316430Can CAPABILITY_ENTER_FROM;
    public static final EnumC316430Can CAPABILITY_ICON_EDIT;
    public static final EnumC316430Can CAPABILITY_PREVIEW_CNT;
    public static final EnumC316430Can CAPABILITY_TEMPLATE_RESOURCE_ID;
    public static final C316440Cao Companion;
    public static final /* synthetic */ EnumC316430Can[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC316430Can> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [X.0Cao] */
    static {
        EnumC316430Can enumC316430Can = new EnumC316430Can("CAPABILITY_ENTER_FROM", 0, "enter_from");
        CAPABILITY_ENTER_FROM = enumC316430Can;
        EnumC316430Can enumC316430Can2 = new EnumC316430Can("CAPABILITY_PREVIEW_CNT", 1, "preview_cnt");
        CAPABILITY_PREVIEW_CNT = enumC316430Can2;
        EnumC316430Can enumC316430Can3 = new EnumC316430Can("CAPABILITY_CREATE_DURATION", 2, "create_duration");
        CAPABILITY_CREATE_DURATION = enumC316430Can3;
        EnumC316430Can enumC316430Can4 = new EnumC316430Can("CAPABILITY_ICON_EDIT", 3, "icon_edit");
        CAPABILITY_ICON_EDIT = enumC316430Can4;
        EnumC316430Can enumC316430Can5 = new EnumC316430Can("CAPABILITY_AME_TEMPLATE_ID", 4, "ame_template_id");
        CAPABILITY_AME_TEMPLATE_ID = enumC316430Can5;
        EnumC316430Can enumC316430Can6 = new EnumC316430Can("CAPABILITY_TEMPLATE_RESOURCE_ID", 5, "template_resource_id");
        CAPABILITY_TEMPLATE_RESOURCE_ID = enumC316430Can6;
        EnumC316430Can enumC316430Can7 = new EnumC316430Can("CAPABILITY_APP_CLIENT_VERSION", 6, "app_client_version");
        CAPABILITY_APP_CLIENT_VERSION = enumC316430Can7;
        EnumC316430Can[] enumC316430CanArr = {enumC316430Can, enumC316430Can2, enumC316430Can3, enumC316430Can4, enumC316430Can5, enumC316430Can6, enumC316430Can7};
        LLILLJJLI = enumC316430CanArr;
        LLILLL = new C2254308sP(enumC316430CanArr);
        Companion = new Object() { // from class: X.0Cao
        };
    }

    public static EnumC316430Can[] values() {
        return (EnumC316430Can[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.LL;
    }

    public static EnumC316430Can valueOf(String str) {
        return (EnumC316430Can) C08FF.LIZ(EnumC316430Can.class, str);
    }

    public EnumC316430Can(String str, int i, String str2) {
        this.LL = str2;
    }
}
