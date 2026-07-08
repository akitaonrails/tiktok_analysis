package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0566, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class AnonymousClass0566 {
    public static final /* synthetic */ AnonymousClass0566[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final AnonymousClass0566 STATUS_ID_BANNER;
    public static final AnonymousClass0566 STATUS_ID_NOT_SHOW_DIGITAL_WELLBEING_HUB_INTRO;
    public static final AnonymousClass0566 STATUS_ID_NOT_SHOW_MISSION_V2_HIGHTLIGHT;
    public static final AnonymousClass0566 STATUS_ID_NOT_SHOW_REMINDER;
    public static final AnonymousClass0566 STATUS_ID_PURPLE_BTN;
    public static final AnonymousClass0566 STATUS_ID_SHOW_BADGE;
    public static final AnonymousClass0566 STATUS_ID_SHOW_NEW_MISSIONS;
    public static final AnonymousClass0566 STATUS_ID_SHOW_REWARD_INTRO;
    public static final AnonymousClass0566 STATUS_ID_TOOLTIP;
    public static final AnonymousClass0566 STATUS_ID_TURNOFF_HIGHLIGHT;
    public static final AnonymousClass0566 STATUS_ID_UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<AnonymousClass0566> getEntries() {
        return LLILLL;
    }

    static {
        AnonymousClass0566 anonymousClass0566 = new AnonymousClass0566("STATUS_ID_UNKNOWN", 0, 0);
        STATUS_ID_UNKNOWN = anonymousClass0566;
        AnonymousClass0566 anonymousClass05662 = new AnonymousClass0566("STATUS_ID_BANNER", 1, 1);
        STATUS_ID_BANNER = anonymousClass05662;
        AnonymousClass0566 anonymousClass05663 = new AnonymousClass0566("STATUS_ID_TOOLTIP", 2, 2);
        STATUS_ID_TOOLTIP = anonymousClass05663;
        AnonymousClass0566 anonymousClass05664 = new AnonymousClass0566("STATUS_ID_PURPLE_BTN", 3, 3);
        STATUS_ID_PURPLE_BTN = anonymousClass05664;
        AnonymousClass0566 anonymousClass05665 = new AnonymousClass0566("STATUS_ID_SHOW_REWARD_INTRO", 4, 4);
        STATUS_ID_SHOW_REWARD_INTRO = anonymousClass05665;
        AnonymousClass0566 anonymousClass05666 = new AnonymousClass0566("STATUS_ID_TURNOFF_HIGHLIGHT", 5, 5);
        STATUS_ID_TURNOFF_HIGHLIGHT = anonymousClass05666;
        AnonymousClass0566 anonymousClass05667 = new AnonymousClass0566("STATUS_ID_NOT_SHOW_DIGITAL_WELLBEING_HUB_INTRO", 6, 6);
        STATUS_ID_NOT_SHOW_DIGITAL_WELLBEING_HUB_INTRO = anonymousClass05667;
        AnonymousClass0566 anonymousClass05668 = new AnonymousClass0566("STATUS_ID_SHOW_NEW_MISSIONS", 7, 7);
        STATUS_ID_SHOW_NEW_MISSIONS = anonymousClass05668;
        AnonymousClass0566 anonymousClass05669 = new AnonymousClass0566("STATUS_ID_SHOW_BADGE", 8, 8);
        STATUS_ID_SHOW_BADGE = anonymousClass05669;
        AnonymousClass0566 anonymousClass056610 = new AnonymousClass0566("STATUS_ID_NOT_SHOW_MISSION_V2_HIGHTLIGHT", 9, 9);
        STATUS_ID_NOT_SHOW_MISSION_V2_HIGHTLIGHT = anonymousClass056610;
        AnonymousClass0566 anonymousClass056611 = new AnonymousClass0566("STATUS_ID_NOT_SHOW_REMINDER", 10, 10);
        STATUS_ID_NOT_SHOW_REMINDER = anonymousClass056611;
        AnonymousClass0566[] anonymousClass0566Arr = {anonymousClass0566, anonymousClass05662, anonymousClass05663, anonymousClass05664, anonymousClass05665, anonymousClass05666, anonymousClass05667, anonymousClass05668, anonymousClass05669, anonymousClass056610, anonymousClass056611};
        LLILLJJLI = anonymousClass0566Arr;
        LLILLL = new C2254308sP(anonymousClass0566Arr);
    }

    public static AnonymousClass0566[] values() {
        return (AnonymousClass0566[]) LLILLJJLI.clone();
    }

    public final int getI() {
        return this.LL;
    }

    public static AnonymousClass0566 valueOf(String str) {
        return (AnonymousClass0566) C08FF.LIZ(AnonymousClass0566.class, str);
    }

    public AnonymousClass0566(String str, int i, int i2) {
        this.LL = i2;
    }
}
