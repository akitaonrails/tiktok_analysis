package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Ir1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC479370Ir1 {
    public static final EnumC479370Ir1 CLICK_PRELOAD;
    public static final C479390Ir3 Companion;
    public static final EnumC479370Ir1 DEFAULT;
    public static final EnumC479370Ir1 ERROR_RETRY;
    public static final EnumC479370Ir1 INIT;
    public static final EnumC479370Ir1 INIT_PART;
    public static final /* synthetic */ EnumC479370Ir1[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC479370Ir1 LOAD_MORE;
    public static final EnumC479370Ir1 PLAY_TAB_SELECTED;
    public static final EnumC479370Ir1 PRELOAD;
    public static final EnumC479370Ir1 PULLING;
    public static final EnumC479370Ir1 TIMEOUT_AUTO_REFRESH;
    public static final EnumC479370Ir1 TOUCH_PRELOAD;
    public static final EnumC479370Ir1 USER_REFRESH;
    public final String LL;

    public static InterfaceC2044707zh<EnumC479370Ir1> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v24, types: [X.0Ir3] */
    static {
        EnumC479370Ir1 enumC479370Ir1 = new EnumC479370Ir1("PULLING", 0, "polling");
        PULLING = enumC479370Ir1;
        EnumC479370Ir1 enumC479370Ir12 = new EnumC479370Ir1("TOUCH_PRELOAD", 1, "touch_preload");
        TOUCH_PRELOAD = enumC479370Ir12;
        EnumC479370Ir1 enumC479370Ir13 = new EnumC479370Ir1("CLICK_PRELOAD", 2, "click_preload");
        CLICK_PRELOAD = enumC479370Ir13;
        EnumC479370Ir1 enumC479370Ir14 = new EnumC479370Ir1("INIT", 3, "init");
        INIT = enumC479370Ir14;
        EnumC479370Ir1 enumC479370Ir15 = new EnumC479370Ir1("USER_REFRESH", 4, "user_refresh");
        USER_REFRESH = enumC479370Ir15;
        EnumC479370Ir1 enumC479370Ir16 = new EnumC479370Ir1("ERROR_RETRY", 5, "error_retry");
        ERROR_RETRY = enumC479370Ir16;
        EnumC479370Ir1 enumC479370Ir17 = new EnumC479370Ir1("TIMEOUT_AUTO_REFRESH", 6, "timeout_auto_refresh");
        TIMEOUT_AUTO_REFRESH = enumC479370Ir17;
        EnumC479370Ir1 enumC479370Ir18 = new EnumC479370Ir1("PLAY_TAB_SELECTED", 7, "play_tab_selected");
        PLAY_TAB_SELECTED = enumC479370Ir18;
        EnumC479370Ir1 enumC479370Ir19 = new EnumC479370Ir1(LivePreviewCTASmartDisplayManager.DEFAULT, 8, "default");
        DEFAULT = enumC479370Ir19;
        EnumC479370Ir1 enumC479370Ir110 = new EnumC479370Ir1("PRELOAD", 9, "preload");
        PRELOAD = enumC479370Ir110;
        EnumC479370Ir1 enumC479370Ir111 = new EnumC479370Ir1("LOAD_MORE", 10, "load_more");
        LOAD_MORE = enumC479370Ir111;
        EnumC479370Ir1 enumC479370Ir112 = new EnumC479370Ir1("INIT_PART", 11, "init_part");
        INIT_PART = enumC479370Ir112;
        EnumC479370Ir1[] enumC479370Ir1Arr = {enumC479370Ir1, enumC479370Ir12, enumC479370Ir13, enumC479370Ir14, enumC479370Ir15, enumC479370Ir16, enumC479370Ir17, enumC479370Ir18, enumC479370Ir19, enumC479370Ir110, enumC479370Ir111, enumC479370Ir112};
        LLILLJJLI = enumC479370Ir1Arr;
        LLILLL = new C2254308sP(enumC479370Ir1Arr);
        Companion = new Object() { // from class: X.0Ir3
        };
    }

    public static EnumC479370Ir1[] values() {
        return (EnumC479370Ir1[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC479370Ir1 valueOf(String str) {
        return (EnumC479370Ir1) C08FF.LIZ(EnumC479370Ir1.class, str);
    }

    public EnumC479370Ir1(String str, int i, String str2) {
        this.LL = str2;
    }
}
