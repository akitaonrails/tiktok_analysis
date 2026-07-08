package X;

import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Vzh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class EnumC815990Vzh {
    public static final EnumC815990Vzh CLEAN_MEMORY;
    public static final EnumC815990Vzh DEBUG_SHORTCUT;
    public static final EnumC815990Vzh DEFAULT;
    public static final EnumC815990Vzh DISCOVER;
    public static final EnumC815990Vzh FRIENDS;
    public static final EnumC815990Vzh GUEST_MODE_SHORTCUT;
    public static final /* synthetic */ EnumC815990Vzh[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC815990Vzh NOTIFICATION;
    public static final EnumC815990Vzh REMOVE_TIKTOK;
    public static final EnumC815990Vzh SCAN;
    public static final EnumC815990Vzh SHOOTING;
    public static final EnumC815990Vzh TTS_REWARDS;
    public static final EnumC815990Vzh WATCH_NOW;
    public static final EnumC815990Vzh WILL_GET_MOST;
    public static final EnumC815990Vzh WITHDRAWAL;
    public final String LL;
    public final int LLILLJJLI;

    public static InterfaceC2044707zh<EnumC815990Vzh> getEntries() {
        return LLILZ;
    }

    static {
        EnumC815990Vzh enumC815990Vzh = new EnumC815990Vzh("DEBUG_SHORTCUT", 0, "DEBUG_SHORTCUT", 10241024);
        DEBUG_SHORTCUT = enumC815990Vzh;
        EnumC815990Vzh enumC815990Vzh2 = new EnumC815990Vzh("REMOVE_TIKTOK", 1, "REMOVE_TIKTOK", 9999);
        REMOVE_TIKTOK = enumC815990Vzh2;
        EnumC815990Vzh enumC815990Vzh3 = new EnumC815990Vzh("WATCH_NOW", 2, "WATCH_NOW", LSPassThroughRecordSizeConfig.DEFAULT);
        WATCH_NOW = enumC815990Vzh3;
        EnumC815990Vzh enumC815990Vzh4 = new EnumC815990Vzh("CLEAN_MEMORY", 3, "CLEAN_MEMORY", 900);
        CLEAN_MEMORY = enumC815990Vzh4;
        EnumC815990Vzh enumC815990Vzh5 = new EnumC815990Vzh("TTS_REWARDS", 4, "TTS_REWARDS", 1110);
        TTS_REWARDS = enumC815990Vzh5;
        EnumC815990Vzh enumC815990Vzh6 = new EnumC815990Vzh("WILL_GET_MOST", 5, "WILL_GET_MOST", 1100);
        WILL_GET_MOST = enumC815990Vzh6;
        EnumC815990Vzh enumC815990Vzh7 = new EnumC815990Vzh("WITHDRAWAL", 6, "WITHDRAWAL", 1100);
        WITHDRAWAL = enumC815990Vzh7;
        EnumC815990Vzh enumC815990Vzh8 = new EnumC815990Vzh("GUEST_MODE_SHORTCUT", 7, "GUEST_MODE_SHORTCUT", 600);
        GUEST_MODE_SHORTCUT = enumC815990Vzh8;
        EnumC815990Vzh enumC815990Vzh9 = new EnumC815990Vzh("NOTIFICATION", 8, "NOTIFICATION", 500);
        NOTIFICATION = enumC815990Vzh9;
        EnumC815990Vzh enumC815990Vzh10 = new EnumC815990Vzh("SHOOTING", 9, "SHOOTING", 400);
        SHOOTING = enumC815990Vzh10;
        EnumC815990Vzh enumC815990Vzh11 = new EnumC815990Vzh("FRIENDS", 10, "FRIENDS", DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL);
        FRIENDS = enumC815990Vzh11;
        EnumC815990Vzh enumC815990Vzh12 = new EnumC815990Vzh("DISCOVER", 11, "DISCOVER", 299);
        DISCOVER = enumC815990Vzh12;
        EnumC815990Vzh enumC815990Vzh13 = new EnumC815990Vzh("SCAN", 12, "SCAN", 200);
        SCAN = enumC815990Vzh13;
        EnumC815990Vzh enumC815990Vzh14 = new EnumC815990Vzh(LivePreviewCTASmartDisplayManager.DEFAULT, 13, LivePreviewCTASmartDisplayManager.DEFAULT, 1);
        DEFAULT = enumC815990Vzh14;
        EnumC815990Vzh[] enumC815990VzhArr = {enumC815990Vzh, enumC815990Vzh2, enumC815990Vzh3, enumC815990Vzh4, enumC815990Vzh5, enumC815990Vzh6, enumC815990Vzh7, enumC815990Vzh8, enumC815990Vzh9, enumC815990Vzh10, enumC815990Vzh11, enumC815990Vzh12, enumC815990Vzh13, enumC815990Vzh14};
        LLILLL = enumC815990VzhArr;
        LLILZ = new C2254308sP(enumC815990VzhArr);
    }

    public static EnumC815990Vzh[] values() {
        return (EnumC815990Vzh[]) LLILLL.clone();
    }

    public final String getShortcutId() {
        return this.LL;
    }

    public final int getShortcutPriority() {
        return this.LLILLJJLI;
    }

    public static EnumC815990Vzh valueOf(String str) {
        return (EnumC815990Vzh) C08FF.LIZ(EnumC815990Vzh.class, str);
    }

    public EnumC815990Vzh(String str, int i, String str2, int i2) {
        this.LL = str2;
        this.LLILLJJLI = i2;
    }
}
