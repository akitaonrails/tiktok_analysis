package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Yo9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC885270Yo9 {
    public static final EnumC885270Yo9 ARCHIVE_SELECTED;
    public static final /* synthetic */ EnumC885270Yo9[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC885270Yo9 MUTE_SELECTED;
    public static final EnumC885270Yo9 PRIMARY_ALL;
    public static final EnumC885270Yo9 PRIMARY_SELECTED;
    public static final EnumC885270Yo9 PRIMARY_UNSPAM;
    public static final EnumC885270Yo9 READ_ALL;
    public static final EnumC885270Yo9 READ_SELECTED;
    public static final EnumC885270Yo9 SECONDARY_ALL;
    public static final EnumC885270Yo9 SECONDARY_SELECTED;
    public static final EnumC885270Yo9 SECONDARY_UNSPAM;
    public static final EnumC885270Yo9 SPAM_ALL;
    public static final EnumC885270Yo9 SPAM_SELECTED;
    public static final EnumC885270Yo9 STAR_SELECTED;
    public static final EnumC885270Yo9 UNARCHIVE_SELECTED;
    public static final EnumC885270Yo9 UNMUTE_SELECTED;
    public static final EnumC885270Yo9 UNREAD_SELECTED;
    public static final EnumC885270Yo9 UNSPAM_ALL;
    public static final EnumC885270Yo9 UNSPAM_SELECTED;
    public static final EnumC885270Yo9 UNSTAR_SELECTED;
    public final String LL;
    public final String LLILLJJLI;

    public static InterfaceC2044707zh<EnumC885270Yo9> getEntries() {
        return LLILZ;
    }

    static {
        EnumC885270Yo9 enumC885270Yo9 = new EnumC885270Yo9("PRIMARY_SELECTED", 0, "primary_selected", "primary");
        PRIMARY_SELECTED = enumC885270Yo9;
        EnumC885270Yo9 enumC885270Yo92 = new EnumC885270Yo9("PRIMARY_ALL", 1, "primary_all", "primary");
        PRIMARY_ALL = enumC885270Yo92;
        EnumC885270Yo9 enumC885270Yo93 = new EnumC885270Yo9("SECONDARY_SELECTED", 2, "secondary_selected", "secondary");
        SECONDARY_SELECTED = enumC885270Yo93;
        EnumC885270Yo9 enumC885270Yo94 = new EnumC885270Yo9("SECONDARY_ALL", 3, "secondary_all", "secondary");
        SECONDARY_ALL = enumC885270Yo94;
        EnumC885270Yo9 enumC885270Yo95 = new EnumC885270Yo9("PRIMARY_UNSPAM", 4, "primary_selected", "primary");
        PRIMARY_UNSPAM = enumC885270Yo95;
        EnumC885270Yo9 enumC885270Yo96 = new EnumC885270Yo9("SECONDARY_UNSPAM", 5, "secondary_selected", "secondary");
        SECONDARY_UNSPAM = enumC885270Yo96;
        EnumC885270Yo9 enumC885270Yo97 = new EnumC885270Yo9("SPAM_SELECTED", 6, "spam_selected", "spam");
        SPAM_SELECTED = enumC885270Yo97;
        EnumC885270Yo9 enumC885270Yo98 = new EnumC885270Yo9("SPAM_ALL", 7, "spam_all", "spam");
        SPAM_ALL = enumC885270Yo98;
        EnumC885270Yo9 enumC885270Yo99 = new EnumC885270Yo9("UNSPAM_SELECTED", 8, "unspam_selected", "unspam");
        UNSPAM_SELECTED = enumC885270Yo99;
        EnumC885270Yo9 enumC885270Yo910 = new EnumC885270Yo9("UNSPAM_ALL", 9, "unspam_all", "unspam");
        UNSPAM_ALL = enumC885270Yo910;
        EnumC885270Yo9 enumC885270Yo911 = new EnumC885270Yo9("STAR_SELECTED", 10, "star_selected", "star");
        STAR_SELECTED = enumC885270Yo911;
        EnumC885270Yo9 enumC885270Yo912 = new EnumC885270Yo9("UNSTAR_SELECTED", 11, "unstar_selected", "unstar");
        UNSTAR_SELECTED = enumC885270Yo912;
        EnumC885270Yo9 enumC885270Yo913 = new EnumC885270Yo9("MUTE_SELECTED", 12, "mute_selected", "mute");
        MUTE_SELECTED = enumC885270Yo913;
        EnumC885270Yo9 enumC885270Yo914 = new EnumC885270Yo9("UNMUTE_SELECTED", 13, "unmute_selected", "unmute");
        UNMUTE_SELECTED = enumC885270Yo914;
        EnumC885270Yo9 enumC885270Yo915 = new EnumC885270Yo9("READ_SELECTED", 14, "read_selected", "read");
        READ_SELECTED = enumC885270Yo915;
        EnumC885270Yo9 enumC885270Yo916 = new EnumC885270Yo9("READ_ALL", 15, "read_all", "read");
        READ_ALL = enumC885270Yo916;
        EnumC885270Yo9 enumC885270Yo917 = new EnumC885270Yo9("UNREAD_SELECTED", 16, "unread_selected", "unread");
        UNREAD_SELECTED = enumC885270Yo917;
        EnumC885270Yo9 enumC885270Yo918 = new EnumC885270Yo9("UNARCHIVE_SELECTED", 17, "unarchive_selected", "unarchive");
        UNARCHIVE_SELECTED = enumC885270Yo918;
        EnumC885270Yo9 enumC885270Yo919 = new EnumC885270Yo9("ARCHIVE_SELECTED", 18, "archive_selected", "archive");
        ARCHIVE_SELECTED = enumC885270Yo919;
        EnumC885270Yo9[] enumC885270Yo9Arr = {enumC885270Yo9, enumC885270Yo92, enumC885270Yo93, enumC885270Yo94, enumC885270Yo95, enumC885270Yo96, enumC885270Yo97, enumC885270Yo98, enumC885270Yo99, enumC885270Yo910, enumC885270Yo911, enumC885270Yo912, enumC885270Yo913, enumC885270Yo914, enumC885270Yo915, enumC885270Yo916, enumC885270Yo917, enumC885270Yo918, enumC885270Yo919};
        LLILLL = enumC885270Yo9Arr;
        LLILZ = new C2254308sP(enumC885270Yo9Arr);
    }

    public static EnumC885270Yo9[] values() {
        return (EnumC885270Yo9[]) LLILLL.clone();
    }

    public final EnumC885270Yo9 getUndoActionType() {
        switch (C885290YoB.LIZ[ordinal()]) {
            case 1:
                return SECONDARY_SELECTED;
            case 2:
                return SECONDARY_ALL;
            case 3:
                return PRIMARY_SELECTED;
            case 4:
                return PRIMARY_ALL;
            case 5:
                return SPAM_SELECTED;
            case 6:
                return SPAM_SELECTED;
            case 7:
                return UNARCHIVE_SELECTED;
            case 8:
                return ARCHIVE_SELECTED;
            case BdTuring.TYPE_ECAF /* 9 */:
                return UNSPAM_SELECTED;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return UNSPAM_ALL;
            case BdTuring.TYPE_EMAIL /* 11 */:
                return SPAM_SELECTED;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return SPAM_ALL;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return UNSTAR_SELECTED;
            case 14:
                return STAR_SELECTED;
            case 15:
                return UNMUTE_SELECTED;
            case 16:
                return MUTE_SELECTED;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
            case 19:
                return null;
            default:
                throw new C1954807lC();
        }
    }

    public final String getBatchActionTypeMobValue() {
        return this.LL;
    }

    public final String getSingleTargetMobValue() {
        return this.LLILLJJLI;
    }

    public static EnumC885270Yo9 valueOf(String str) {
        return (EnumC885270Yo9) C08FF.LIZ(EnumC885270Yo9.class, str);
    }

    public EnumC885270Yo9(String str, int i, String str2, String str3) {
        this.LL = str2;
        this.LLILLJJLI = str3;
    }
}
