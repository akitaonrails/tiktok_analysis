package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0JRw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC492180JRw {
    public static final /* synthetic */ EnumC492180JRw[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC492180JRw SUB_EMOTE_POLL_CREATE_POPUP;
    public static final EnumC492180JRw SUB_EMOTE_POLL_RESULT_POPUP;
    public static final EnumC492180JRw SUB_ONLY_LIVE_PAGE;
    public static final EnumC492180JRw SUB_ONLY_LIVE_PREVIEW_PAGE;
    public static final EnumC492180JRw SUB_ONLY_VIDEO_PAGE;
    public static final EnumC492180JRw SUB_ONLY_VIDEO_POPUP;
    public static final EnumC492180JRw SUB_SPACE_DETAIL_POPUP;
    public static final EnumC492180JRw SUB_SPACE_PAGE;
    public static final EnumC492180JRw SUB_SPACE_POPUP;

    public static InterfaceC2044707zh<EnumC492180JRw> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC492180JRw enumC492180JRw = new EnumC492180JRw("SUB_ONLY_LIVE_PAGE", 0);
        SUB_ONLY_LIVE_PAGE = enumC492180JRw;
        EnumC492180JRw enumC492180JRw2 = new EnumC492180JRw("SUB_ONLY_LIVE_PREVIEW_PAGE", 1);
        SUB_ONLY_LIVE_PREVIEW_PAGE = enumC492180JRw2;
        EnumC492180JRw enumC492180JRw3 = new EnumC492180JRw("SUB_ONLY_VIDEO_PAGE", 2);
        SUB_ONLY_VIDEO_PAGE = enumC492180JRw3;
        EnumC492180JRw enumC492180JRw4 = new EnumC492180JRw("SUB_ONLY_VIDEO_POPUP", 3);
        SUB_ONLY_VIDEO_POPUP = enumC492180JRw4;
        EnumC492180JRw enumC492180JRw5 = new EnumC492180JRw("SUB_SPACE_PAGE", 4);
        SUB_SPACE_PAGE = enumC492180JRw5;
        EnumC492180JRw enumC492180JRw6 = new EnumC492180JRw("SUB_SPACE_POPUP", 5);
        SUB_SPACE_POPUP = enumC492180JRw6;
        EnumC492180JRw enumC492180JRw7 = new EnumC492180JRw("SUB_SPACE_DETAIL_POPUP", 6);
        SUB_SPACE_DETAIL_POPUP = enumC492180JRw7;
        EnumC492180JRw enumC492180JRw8 = new EnumC492180JRw("SUB_EMOTE_POLL_CREATE_POPUP", 7);
        SUB_EMOTE_POLL_CREATE_POPUP = enumC492180JRw8;
        EnumC492180JRw enumC492180JRw9 = new EnumC492180JRw("SUB_EMOTE_POLL_RESULT_POPUP", 8);
        SUB_EMOTE_POLL_RESULT_POPUP = enumC492180JRw9;
        EnumC492180JRw[] enumC492180JRwArr = {enumC492180JRw, enumC492180JRw2, enumC492180JRw3, enumC492180JRw4, enumC492180JRw5, enumC492180JRw6, enumC492180JRw7, enumC492180JRw8, enumC492180JRw9};
        LL = enumC492180JRwArr;
        LLILLJJLI = new C2254308sP(enumC492180JRwArr);
    }

    public static EnumC492180JRw[] values() {
        return (EnumC492180JRw[]) LL.clone();
    }

    public static EnumC492180JRw valueOf(String str) {
        return (EnumC492180JRw) C08FF.LIZ(EnumC492180JRw.class, str);
    }

    public EnumC492180JRw(String str, int i) {
    }
}
