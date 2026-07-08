package X;

import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0I0E, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0I0E {
    public static final C0I0E ACTION_BACK_PRESSED;
    public static final C0I0E ACTION_CLICK_BACKGROUND;
    public static final C0I0E ACTION_ENTER_BACKGROUND;
    public static final C0I0E ACTION_OTHER;
    public static final C0I0E ACTION_SEND_MEDIA_MESSAGE;
    public static final C0I0E ACTION_SEND_MESSAGE;
    public static final C0I0E ACTION_SEND_QUICK_EMOJI;
    public static final C0I0E ACTION_SEND_STICKER;
    public static final C0I0E ACTION_SEND_STICKER_FROM_SEARCH;
    public static final C0I0E ACTION_SEND_VOICE_MESSAGE;
    public static final C0I0E ACTION_UNKNOWN;
    public static final /* synthetic */ C0I0E[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<C0I0E> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0I0E c0i0e = new C0I0E("ACTION_UNKNOWN", 0);
        ACTION_UNKNOWN = c0i0e;
        C0I0E c0i0e2 = new C0I0E("ACTION_CLICK_BACKGROUND", 1);
        ACTION_CLICK_BACKGROUND = c0i0e2;
        C0I0E c0i0e3 = new C0I0E("ACTION_ENTER_BACKGROUND", 2);
        ACTION_ENTER_BACKGROUND = c0i0e3;
        C0I0E c0i0e4 = new C0I0E("ACTION_BACK_PRESSED", 3);
        ACTION_BACK_PRESSED = c0i0e4;
        C0I0E c0i0e5 = new C0I0E("ACTION_SEND_MESSAGE", 4);
        ACTION_SEND_MESSAGE = c0i0e5;
        C0I0E c0i0e6 = new C0I0E("ACTION_SEND_QUICK_EMOJI", 5);
        ACTION_SEND_QUICK_EMOJI = c0i0e6;
        C0I0E c0i0e7 = new C0I0E("ACTION_OTHER", 6);
        ACTION_OTHER = c0i0e7;
        C0I0E c0i0e8 = new C0I0E("ACTION_SEND_STICKER", 7);
        ACTION_SEND_STICKER = c0i0e8;
        C0I0E c0i0e9 = new C0I0E("ACTION_SEND_STICKER_FROM_SEARCH", 8);
        ACTION_SEND_STICKER_FROM_SEARCH = c0i0e9;
        C0I0E c0i0e10 = new C0I0E("ACTION_SEND_VOICE_MESSAGE", 9);
        ACTION_SEND_VOICE_MESSAGE = c0i0e10;
        C0I0E c0i0e11 = new C0I0E("ACTION_SEND_MEDIA_MESSAGE", 10);
        ACTION_SEND_MEDIA_MESSAGE = c0i0e11;
        C0I0E[] c0i0eArr = {c0i0e, c0i0e2, c0i0e3, c0i0e4, c0i0e5, c0i0e6, c0i0e7, c0i0e8, c0i0e9, c0i0e10, c0i0e11};
        LL = c0i0eArr;
        LLILLJJLI = new C2254308sP(c0i0eArr);
    }

    public static C0I0E[] values() {
        return (C0I0E[]) LL.clone();
    }

    public final boolean isDismissOnBackground() {
        return this == ACTION_SEND_MEDIA_MESSAGE || this == ACTION_SEND_STICKER_FROM_SEARCH;
    }

    public final boolean isEligibleForDraft() {
        int i = C0I0D.LIZ[ordinal()];
        return (i == 1 || i == 2) ? false : true;
    }

    public final boolean isForceDismiss() {
        switch (C0I0D.LIZ[ordinal()]) {
            case 1:
            case 2:
            case 7:
            case 8:
            case BdTuring.TYPE_ECAF /* 9 */:
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
            case BdTuring.TYPE_EMAIL /* 11 */:
                return true;
            case 3:
            case 4:
            case 5:
            case 6:
                return false;
            default:
                throw new C1954807lC();
        }
    }

    public static C0I0E valueOf(String str) {
        return (C0I0E) C08FF.LIZ(C0I0E.class, str);
    }

    public C0I0E(String str, int i) {
    }
}
