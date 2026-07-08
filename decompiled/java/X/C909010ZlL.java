package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.chatroom.api.actionbar.ActionBarButtonType;

/* JADX INFO: renamed from: X.0ZlL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public /* synthetic */ class C909010ZlL {
    public static final /* synthetic */ int[] LIZ;
    public static final /* synthetic */ int[] LIZIZ;

    static {
        int[] iArr = new int[C0IBF.values().length];
        try {
            iArr[C0IBF.FEATURE_STATUS_DISABLED.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[C0IBF.FEATURE_STATUS_HIDE.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
        int[] iArr2 = new int[ActionBarButtonType.values().length];
        try {
            iArr2[ActionBarButtonType.ANIMATED_EMOJI.ordinal()] = 1;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr2[ActionBarButtonType.NORMAL_EMOJI.ordinal()] = 2;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        try {
            iArr2[ActionBarButtonType.NUDGE.ordinal()] = 3;
        } catch (NoSuchFieldError e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        try {
            iArr2[ActionBarButtonType.NUDGE_BACK.ordinal()] = 4;
        } catch (NoSuchFieldError e6) {
            TryCatchGuardChecker.doCheck(e6);
        }
        try {
            iArr2[ActionBarButtonType.STREAK.ordinal()] = 5;
        } catch (NoSuchFieldError e7) {
            TryCatchGuardChecker.doCheck(e7);
        }
        try {
            iArr2[ActionBarButtonType.STREAK_BACK.ordinal()] = 6;
        } catch (NoSuchFieldError e8) {
            TryCatchGuardChecker.doCheck(e8);
        }
        try {
            iArr2[ActionBarButtonType.STICKER.ordinal()] = 7;
        } catch (NoSuchFieldError e9) {
            TryCatchGuardChecker.doCheck(e9);
        }
        try {
            iArr2[ActionBarButtonType.SET_STICKER.ordinal()] = 8;
        } catch (NoSuchFieldError e10) {
            TryCatchGuardChecker.doCheck(e10);
        }
        try {
            iArr2[ActionBarButtonType.VIDEO_SHARE.ordinal()] = 9;
        } catch (NoSuchFieldError e11) {
            TryCatchGuardChecker.doCheck(e11);
        }
        try {
            iArr2[ActionBarButtonType.STICKER_STORE.ordinal()] = 10;
        } catch (NoSuchFieldError e12) {
            TryCatchGuardChecker.doCheck(e12);
        }
        try {
            iArr2[ActionBarButtonType.GO_LIVE.ordinal()] = 11;
        } catch (NoSuchFieldError e13) {
            TryCatchGuardChecker.doCheck(e13);
        }
        try {
            iArr2[ActionBarButtonType.WATCH_LIVE.ordinal()] = 12;
        } catch (NoSuchFieldError e14) {
            TryCatchGuardChecker.doCheck(e14);
        }
        try {
            iArr2[ActionBarButtonType.LIGHT_INTERACTION.ordinal()] = 13;
        } catch (NoSuchFieldError e15) {
            TryCatchGuardChecker.doCheck(e15);
        }
        try {
            iArr2[ActionBarButtonType.EFFECTS.ordinal()] = 14;
        } catch (NoSuchFieldError e16) {
            TryCatchGuardChecker.doCheck(e16);
        }
        try {
            iArr2[ActionBarButtonType.PHOTO_SWAP.ordinal()] = 15;
        } catch (NoSuchFieldError e17) {
            TryCatchGuardChecker.doCheck(e17);
        }
        try {
            iArr2[ActionBarButtonType.AI_GROUP_SHOT.ordinal()] = 16;
        } catch (NoSuchFieldError e18) {
            TryCatchGuardChecker.doCheck(e18);
        }
        try {
            iArr2[ActionBarButtonType.STREAK_PET.ordinal()] = 17;
        } catch (NoSuchFieldError e19) {
            TryCatchGuardChecker.doCheck(e19);
        }
        try {
            iArr2[ActionBarButtonType.FORTUNE_COOKIE.ordinal()] = 18;
        } catch (NoSuchFieldError e20) {
            TryCatchGuardChecker.doCheck(e20);
        }
        try {
            iArr2[ActionBarButtonType.SOCIAL_AVATAR.ordinal()] = 19;
        } catch (NoSuchFieldError e21) {
            TryCatchGuardChecker.doCheck(e21);
        }
        try {
            iArr2[ActionBarButtonType.UNIVERSAL_BUTTON.ordinal()] = 20;
        } catch (NoSuchFieldError e22) {
            TryCatchGuardChecker.doCheck(e22);
        }
        try {
            iArr2[ActionBarButtonType.PLAYOFF.ordinal()] = 21;
        } catch (NoSuchFieldError e23) {
            TryCatchGuardChecker.doCheck(e23);
        }
        try {
            iArr2[ActionBarButtonType.SHARED_FEED.ordinal()] = 22;
        } catch (NoSuchFieldError e24) {
            TryCatchGuardChecker.doCheck(e24);
        }
        try {
            iArr2[ActionBarButtonType.AVATAR_DUO_INVITATION.ordinal()] = 23;
        } catch (NoSuchFieldError e25) {
            TryCatchGuardChecker.doCheck(e25);
        }
        try {
            iArr2[ActionBarButtonType.AI_THEATER.ordinal()] = 24;
        } catch (NoSuchFieldError e26) {
            TryCatchGuardChecker.doCheck(e26);
        }
        try {
            iArr2[ActionBarButtonType.GROUP_LIVE_EVENT.ordinal()] = 25;
        } catch (NoSuchFieldError e27) {
            TryCatchGuardChecker.doCheck(e27);
        }
        try {
            iArr2[ActionBarButtonType.MIX_STUDIO.ordinal()] = 26;
        } catch (NoSuchFieldError e28) {
            TryCatchGuardChecker.doCheck(e28);
        }
        try {
            iArr2[ActionBarButtonType.GREETING_CARD.ordinal()] = 27;
        } catch (NoSuchFieldError e29) {
            TryCatchGuardChecker.doCheck(e29);
        }
        try {
            iArr2[ActionBarButtonType.SUGGESTED_QUERY.ordinal()] = 28;
        } catch (NoSuchFieldError e30) {
            TryCatchGuardChecker.doCheck(e30);
        }
        try {
            iArr2[ActionBarButtonType.FORM_CARD_ENTRANCE.ordinal()] = 29;
        } catch (NoSuchFieldError e31) {
            TryCatchGuardChecker.doCheck(e31);
        }
        try {
            iArr2[ActionBarButtonType.UNKNOWN.ordinal()] = 30;
        } catch (NoSuchFieldError e32) {
            TryCatchGuardChecker.doCheck(e32);
        }
        LIZIZ = iArr2;
    }
}
