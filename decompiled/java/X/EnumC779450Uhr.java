package X;

import com.bytedance.android.livesdk.livesetting.broadcast.AutoSpeedTestSceneSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.ManualSpeedTestSceneSetting;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Uhr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class EnumC779450Uhr {
    public static final /* synthetic */ EnumC779450Uhr[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC779450Uhr SCENE_TIKTOK_GAME_LIVE_AUTO;
    public static final EnumC779450Uhr SCENE_TIKTOK_GAME_LIVE_MANUAL;
    public static final EnumC779450Uhr SCENE_TIKTOK_SERVER_ERROR_DEBUG;
    public static final EnumC779450Uhr SCENE_UNKNOWN;
    public final String LL;

    public static InterfaceC2044707zh<EnumC779450Uhr> getEntries() {
        return LLILLL;
    }

    static {
        EnumC779450Uhr enumC779450Uhr = new EnumC779450Uhr("SCENE_UNKNOWN", 0, "unknown");
        SCENE_UNKNOWN = enumC779450Uhr;
        EnumC779450Uhr enumC779450Uhr2 = new EnumC779450Uhr("SCENE_TIKTOK_GAME_LIVE_AUTO", 1, AutoSpeedTestSceneSetting.INSTANCE.getValue());
        SCENE_TIKTOK_GAME_LIVE_AUTO = enumC779450Uhr2;
        EnumC779450Uhr enumC779450Uhr3 = new EnumC779450Uhr("SCENE_TIKTOK_GAME_LIVE_MANUAL", 2, ManualSpeedTestSceneSetting.INSTANCE.getValue());
        SCENE_TIKTOK_GAME_LIVE_MANUAL = enumC779450Uhr3;
        EnumC779450Uhr enumC779450Uhr4 = new EnumC779450Uhr("SCENE_TIKTOK_SERVER_ERROR_DEBUG", 3, "tiktok_server_error_debug");
        SCENE_TIKTOK_SERVER_ERROR_DEBUG = enumC779450Uhr4;
        EnumC779450Uhr[] enumC779450UhrArr = {enumC779450Uhr, enumC779450Uhr2, enumC779450Uhr3, enumC779450Uhr4};
        LLILLJJLI = enumC779450UhrArr;
        LLILLL = new C2254308sP(enumC779450UhrArr);
    }

    public static EnumC779450Uhr[] values() {
        return (EnumC779450Uhr[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC779450Uhr valueOf(String str) {
        return (EnumC779450Uhr) C08FF.LIZ(EnumC779450Uhr.class, str);
    }

    public EnumC779450Uhr(String str, int i, String str2) {
        this.LL = str2;
    }
}
