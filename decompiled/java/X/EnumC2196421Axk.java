package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1Axk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class EnumC2196421Axk {
    public static final EnumC2196421Axk ACTIVITY_CREATE;
    public static final EnumC2196421Axk FETCH_LINK;
    public static final EnumC2196421Axk GAME_READY;
    public static final EnumC2196421Axk IFRAME_LOAD;
    public static final /* synthetic */ EnumC2196421Axk[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC2196421Axk MAIN_FRAME_LOAD;
    public static final EnumC2196421Axk META_LOAD;
    public static final EnumC2196421Axk SCHEMA_HANDLER;
    public static final EnumC2196421Axk WEBVIEW_INIT;
    public static final EnumC2196421Axk WEBVIEW_LOAD;

    public static InterfaceC2044707zh<EnumC2196421Axk> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC2196421Axk enumC2196421Axk = new EnumC2196421Axk("SCHEMA_HANDLER", 0);
        SCHEMA_HANDLER = enumC2196421Axk;
        EnumC2196421Axk enumC2196421Axk2 = new EnumC2196421Axk("ACTIVITY_CREATE", 1);
        ACTIVITY_CREATE = enumC2196421Axk2;
        EnumC2196421Axk enumC2196421Axk3 = new EnumC2196421Axk("WEBVIEW_INIT", 2);
        WEBVIEW_INIT = enumC2196421Axk3;
        EnumC2196421Axk enumC2196421Axk4 = new EnumC2196421Axk("META_LOAD", 3);
        META_LOAD = enumC2196421Axk4;
        EnumC2196421Axk enumC2196421Axk5 = new EnumC2196421Axk("MAIN_FRAME_LOAD", 4);
        MAIN_FRAME_LOAD = enumC2196421Axk5;
        EnumC2196421Axk enumC2196421Axk6 = new EnumC2196421Axk("IFRAME_LOAD", 5);
        IFRAME_LOAD = enumC2196421Axk6;
        EnumC2196421Axk enumC2196421Axk7 = new EnumC2196421Axk("WEBVIEW_LOAD", 6);
        WEBVIEW_LOAD = enumC2196421Axk7;
        EnumC2196421Axk enumC2196421Axk8 = new EnumC2196421Axk("GAME_READY", 7);
        GAME_READY = enumC2196421Axk8;
        EnumC2196421Axk enumC2196421Axk9 = new EnumC2196421Axk("FETCH_LINK", 8);
        FETCH_LINK = enumC2196421Axk9;
        EnumC2196421Axk[] enumC2196421AxkArr = {enumC2196421Axk, enumC2196421Axk2, enumC2196421Axk3, enumC2196421Axk4, enumC2196421Axk5, enumC2196421Axk6, enumC2196421Axk7, enumC2196421Axk8, enumC2196421Axk9};
        LL = enumC2196421AxkArr;
        LLILLJJLI = new C2254308sP(enumC2196421AxkArr);
    }

    public static EnumC2196421Axk[] values() {
        return (EnumC2196421Axk[]) LL.clone();
    }

    public static EnumC2196421Axk valueOf(String str) {
        return (EnumC2196421Axk) C08FF.LIZ(EnumC2196421Axk.class, str);
    }

    public EnumC2196421Axk(String str, int i) {
    }
}
