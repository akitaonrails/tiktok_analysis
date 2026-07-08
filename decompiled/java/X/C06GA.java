package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.06GA, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06GA {
    public static final C06GA ACTION_BAR;
    public static final C06GA CARD_BANNER;
    public static final C06GA DEEP_LINK;
    public static final C06GA INLINE_MESSAGE;
    public static final C06GA INVITE_CARD;
    public static final /* synthetic */ C06GA[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C06GA OTHER;
    public static final C06GA RESTORE_APP_PUSH;
    public static final C06GA STREAK;
    public static final C06GA WIDGET;
    public final String LL;

    public static InterfaceC2044707zh<C06GA> getEntries() {
        return LLILLL;
    }

    static {
        C06GA c06ga = new C06GA("ACTION_BAR", 0, "action_bar");
        ACTION_BAR = c06ga;
        C06GA c06ga2 = new C06GA("WIDGET", 1, "widget");
        WIDGET = c06ga2;
        C06GA c06ga3 = new C06GA("INLINE_MESSAGE", 2, "inline_message");
        INLINE_MESSAGE = c06ga3;
        C06GA c06ga4 = new C06GA("STREAK", 3, "streak");
        STREAK = c06ga4;
        C06GA c06ga5 = new C06GA("INVITE_CARD", 4, "invite_card");
        INVITE_CARD = c06ga5;
        C06GA c06ga6 = new C06GA("RESTORE_APP_PUSH", 5, "restore_app_push");
        RESTORE_APP_PUSH = c06ga6;
        C06GA c06ga7 = new C06GA("OTHER", 6, "other");
        OTHER = c06ga7;
        C06GA c06ga8 = new C06GA("CARD_BANNER", 7, "card_banner");
        CARD_BANNER = c06ga8;
        C06GA c06ga9 = new C06GA("DEEP_LINK", 8, "deep_link");
        DEEP_LINK = c06ga9;
        C06GA[] c06gaArr = {c06ga, c06ga2, c06ga3, c06ga4, c06ga5, c06ga6, c06ga7, c06ga8, c06ga9};
        LLILLJJLI = c06gaArr;
        LLILLL = new C2254308sP(c06gaArr);
    }

    public static C06GA[] values() {
        return (C06GA[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C06GA valueOf(String str) {
        return (C06GA) C08FF.LIZ(C06GA.class, str);
    }

    public C06GA(String str, int i, String str2) {
        this.LL = str2;
    }
}
