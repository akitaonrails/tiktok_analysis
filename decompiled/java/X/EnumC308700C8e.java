package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0C8e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC308700C8e {
    public static final EnumC308700C8e FRIENDS_2TAB_ASSEM_INIT;
    public static final EnumC308700C8e FRIENDS_PRELOAD_TOP_VIEW;
    public static final EnumC308700C8e FRIENDS_PROTOCOL_ENABLE;
    public static final EnumC308700C8e FRIENDS_SERVICE_SHOULD_SHOW_FRIENDS_TAB;
    public static final /* synthetic */ EnumC308700C8e[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC308700C8e> getEntries() {
        return LLILLL;
    }

    static {
        EnumC308700C8e enumC308700C8e = new EnumC308700C8e("FRIENDS_2TAB_ASSEM_INIT", 0, "friends_2tab_assem_init");
        FRIENDS_2TAB_ASSEM_INIT = enumC308700C8e;
        EnumC308700C8e enumC308700C8e2 = new EnumC308700C8e("FRIENDS_PROTOCOL_ENABLE", 1, "friends_protocol_enable");
        FRIENDS_PROTOCOL_ENABLE = enumC308700C8e2;
        EnumC308700C8e enumC308700C8e3 = new EnumC308700C8e("FRIENDS_SERVICE_SHOULD_SHOW_FRIENDS_TAB", 2, "friends_service_should_show_friends_tab");
        FRIENDS_SERVICE_SHOULD_SHOW_FRIENDS_TAB = enumC308700C8e3;
        EnumC308700C8e enumC308700C8e4 = new EnumC308700C8e("FRIENDS_PRELOAD_TOP_VIEW", 3, "friends_preload_top_view");
        FRIENDS_PRELOAD_TOP_VIEW = enumC308700C8e4;
        EnumC308700C8e[] enumC308700C8eArr = {enumC308700C8e, enumC308700C8e2, enumC308700C8e3, enumC308700C8e4};
        LLILLJJLI = enumC308700C8eArr;
        LLILLL = new C2254308sP(enumC308700C8eArr);
    }

    public static EnumC308700C8e[] values() {
        return (EnumC308700C8e[]) LLILLJJLI.clone();
    }

    public final String getTokenName() {
        return this.LL;
    }

    public static EnumC308700C8e valueOf(String str) {
        return (EnumC308700C8e) C08FF.LIZ(EnumC308700C8e.class, str);
    }

    public EnumC308700C8e(String str, int i, String str2) {
        this.LL = str2;
    }
}
