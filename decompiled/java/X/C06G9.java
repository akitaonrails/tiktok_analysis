package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.06G9, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06G9 {
    public static final C06G9 ACTION_BAR;
    public static final C06G9 CARD_BANNER;
    public static final C06G9 DEEP_LINK;
    public static final C06G9 INVITE_CARD;
    public static final /* synthetic */ C06G9[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C06G9 RESTORE_APP_PUSH;
    public static final C06G9 STREAK_BADGE;
    public static final C06G9 STREAK_INLINE_MESSAGE;
    public static final C06G9 STREAK_PET_INLINE_MESSAGE;
    public static final C06G9 WIDGET;
    public final String LL;

    public static InterfaceC2044707zh<C06G9> getEntries() {
        return LLILLL;
    }

    static {
        C06G9 c06g9 = new C06G9("ACTION_BAR", 0, "action_bar");
        ACTION_BAR = c06g9;
        C06G9 c06g92 = new C06G9("WIDGET", 1, "widget");
        WIDGET = c06g92;
        C06G9 c06g93 = new C06G9("INVITE_CARD", 2, "invite_card");
        INVITE_CARD = c06g93;
        C06G9 c06g94 = new C06G9("STREAK_INLINE_MESSAGE", 3, "streak_inline_message");
        STREAK_INLINE_MESSAGE = c06g94;
        C06G9 c06g95 = new C06G9("STREAK_PET_INLINE_MESSAGE", 4, "streak_pet_inline_message");
        STREAK_PET_INLINE_MESSAGE = c06g95;
        C06G9 c06g96 = new C06G9("STREAK_BADGE", 5, "streak_badge");
        STREAK_BADGE = c06g96;
        C06G9 c06g97 = new C06G9("RESTORE_APP_PUSH", 6, "restore_app_push");
        RESTORE_APP_PUSH = c06g97;
        C06G9 c06g98 = new C06G9("CARD_BANNER", 7, "card_banner");
        CARD_BANNER = c06g98;
        C06G9 c06g99 = new C06G9("DEEP_LINK", 8, "deep_link");
        DEEP_LINK = c06g99;
        C06G9[] c06g9Arr = {c06g9, c06g92, c06g93, c06g94, c06g95, c06g96, c06g97, c06g98, c06g99};
        LLILLJJLI = c06g9Arr;
        LLILLL = new C2254308sP(c06g9Arr);
    }

    public static C06G9[] values() {
        return (C06G9[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C06G9 valueOf(String str) {
        return (C06G9) C08FF.LIZ(C06G9.class, str);
    }

    public C06G9(String str, int i, String str2) {
        this.LL = str2;
    }
}
