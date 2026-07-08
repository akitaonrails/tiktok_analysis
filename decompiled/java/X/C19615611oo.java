package X;

import com.ss.android.ugc.aweme.sticker.data.CountDownStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;

/* JADX INFO: renamed from: X.11oo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19615611oo {
    public static final /* synthetic */ int LIZ = 0;

    public static long LIZIZ(long j) {
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        if (jCurrentTimeMillis > j) {
            return -1L;
        }
        return j - jCurrentTimeMillis;
    }

    public static String LIZJ(CountDownStickerStruct countDownStickerStruct) {
        long jLongValue;
        Long expiredTime = countDownStickerStruct.getExpiredTime();
        if (expiredTime != null) {
            jLongValue = expiredTime.longValue();
        } else {
            jLongValue = 0;
        }
        if (LIZIZ(jLongValue) > 0) {
            return "upcoming";
        }
        return "past";
    }

    public static boolean LIZLLL(InteractStickerStruct interactStickerStruct) {
        if (interactStickerStruct.getType() == EnumC1466150oFx.LIVE_EVENT_STORY.getType()) {
            return true;
        }
        return false;
    }

    public static void LIZ(C474500IjA c474500IjA, InteractStickerStruct interactStickerStruct, C705930RmZ c705930RmZ, boolean z) {
        long jLongValue;
        String str;
        String str2;
        String str3;
        String str4;
        C0R60 c0r60;
        C0R60 c0r602;
        c474500IjA.LJJII(Long.valueOf(interactStickerStruct.getCountDownStickerStruct().getEventId()), "live_event_id");
        Long expiredTime = interactStickerStruct.getCountDownStickerStruct().getExpiredTime();
        if (expiredTime != null) {
            jLongValue = expiredTime.longValue();
        } else {
            jLongValue = 0;
        }
        c474500IjA.LJJII(Long.valueOf(LIZIZ(jLongValue)), "countdown_time");
        String str5 = null;
        if (c705930RmZ != null && (c0r602 = c705930RmZ.LJIIZILJ) != null) {
            str = c0r602.LIZJ;
        } else {
            str = null;
        }
        c474500IjA.LJJII(str, "author_id");
        if (c705930RmZ != null && (c0r60 = c705930RmZ.LJIIZILJ) != null) {
            str2 = c0r60.LIZJ;
        } else {
            str2 = null;
        }
        c474500IjA.LJJII(str2, "anchor_id");
        if (LIZLLL(interactStickerStruct)) {
            str3 = "story";
        } else {
            str3 = "sticker";
        }
        c474500IjA.LJJII(str3, "enter_from");
        if (c705930RmZ != null) {
            str4 = c705930RmZ.LJFF;
        } else {
            str4 = null;
        }
        c474500IjA.LJJII(str4, "enter_method");
        if (c705930RmZ != null) {
            str5 = c705930RmZ.LIZLLL;
        }
        c474500IjA.LJJII(str5, "group_id");
        c474500IjA.LJJII(Integer.valueOf(z ? 1 : 0), "is_author");
        c474500IjA.LJJII("free_normal", "live_event_type");
        c474500IjA.LJJII(interactStickerStruct.getCountDownStickerStruct().getBusinessType(), "business_type");
    }
}
