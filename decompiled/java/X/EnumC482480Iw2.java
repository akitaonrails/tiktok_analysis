package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Iw2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC482480Iw2 {
    public static final EnumC482480Iw2 AUTO_REFRESH;
    public static final EnumC482480Iw2 CLICK_PRELOAD;
    public static final C482500Iw4 Companion;
    public static final EnumC482480Iw2 DEFAULT;
    public static final EnumC482480Iw2 ERROR_RETRY;
    public static final EnumC482480Iw2 INIT;
    public static final /* synthetic */ EnumC482480Iw2[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC482480Iw2 PULLING;
    public static final EnumC482480Iw2 TOUCH_PRELOAD;
    public static final EnumC482480Iw2 USER_REFRESH;
    public final String LL;

    public static InterfaceC2044707zh<EnumC482480Iw2> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [X.0Iw4] */
    static {
        EnumC482480Iw2 enumC482480Iw2 = new EnumC482480Iw2("PULLING", 0, "polling");
        PULLING = enumC482480Iw2;
        EnumC482480Iw2 enumC482480Iw22 = new EnumC482480Iw2("TOUCH_PRELOAD", 1, "touch_preload");
        TOUCH_PRELOAD = enumC482480Iw22;
        EnumC482480Iw2 enumC482480Iw23 = new EnumC482480Iw2("CLICK_PRELOAD", 2, "click_preload");
        CLICK_PRELOAD = enumC482480Iw23;
        EnumC482480Iw2 enumC482480Iw24 = new EnumC482480Iw2("INIT", 3, "init");
        INIT = enumC482480Iw24;
        EnumC482480Iw2 enumC482480Iw25 = new EnumC482480Iw2("USER_REFRESH", 4, "user_refresh");
        USER_REFRESH = enumC482480Iw25;
        EnumC482480Iw2 enumC482480Iw26 = new EnumC482480Iw2("ERROR_RETRY", 5, "error_retry");
        ERROR_RETRY = enumC482480Iw26;
        EnumC482480Iw2 enumC482480Iw27 = new EnumC482480Iw2("AUTO_REFRESH", 6, "auto_refresh");
        AUTO_REFRESH = enumC482480Iw27;
        EnumC482480Iw2 enumC482480Iw28 = new EnumC482480Iw2(LivePreviewCTASmartDisplayManager.DEFAULT, 7, "default");
        DEFAULT = enumC482480Iw28;
        EnumC482480Iw2[] enumC482480Iw2Arr = {enumC482480Iw2, enumC482480Iw22, enumC482480Iw23, enumC482480Iw24, enumC482480Iw25, enumC482480Iw26, enumC482480Iw27, enumC482480Iw28};
        LLILLJJLI = enumC482480Iw2Arr;
        LLILLL = new C2254308sP(enumC482480Iw2Arr);
        Companion = new Object() { // from class: X.0Iw4
        };
    }

    public static EnumC482480Iw2[] values() {
        return (EnumC482480Iw2[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC482480Iw2 valueOf(String str) {
        return (EnumC482480Iw2) C08FF.LIZ(EnumC482480Iw2.class, str);
    }

    public EnumC482480Iw2(String str, int i, String str2) {
        this.LL = str2;
    }
}
