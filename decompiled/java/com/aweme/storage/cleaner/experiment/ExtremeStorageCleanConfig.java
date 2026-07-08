package com.aweme.storage.cleaner.experiment;

import X.C09CT;
import X.C13BV;
import X.C2097608Jq;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes36.dex */
public final class ExtremeStorageCleanConfig {

    @C09CT("alog_mb_size")
    public final int alogMBSize;

    @C09CT("detach_current_thread_crash_fix_ab2")
    public final int detachCurrentThreadCrashFix;

    @C09CT("disable_clean_in_android_lollipop")
    public final int disableCleanInAndroidLollipop;

    @C09CT("disable_feed_cache")
    public final boolean disableFeedCache;

    @C09CT("switch_enable")
    public final boolean enable;

    @C09CT("extreme_clean_hours_duration")
    public final int extremeCleanHoursDuration;

    @C09CT("extreme_cleaner_white_list")
    public final List<String> extremeCleanerWhiteList;

    @C09CT("extreme_low_state_days_duration")
    public final int extremeLowStateDaysDuration;

    @C09CT("gecko_ad_landing_page_preload_cache_count")
    public final int geckoAdLandingPagePreloadCacheCount;

    @C09CT("gecko_ad_lynx_page_preload_cache_count")
    public final int geckoAdLynxPaePreloadCacheCount;

    @C09CT("gecko_ad_splash_page_preload_cache_count")
    public final int geckoAdSplashPagePreloadCacheCount;

    @C09CT("gecko_clean_ak_and_white_list")
    public final Map<String, List<String>> geckoCleanAKAndWhiteList;

    @C09CT("gecko_expire_days")
    public final int geckoExpireDays;

    @C09CT("studio_av_storage_clean_opt")
    public final int studioAVStorageCleanOpt;

    public ExtremeStorageCleanConfig() {
        this(false, 0, 0, null, 0, null, 0, 0, 0, 0, false, 0, 0, 0, 16383, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ExtremeStorageCleanConfig(boolean z, int i, int i2, List<String> list, int i3, Map<String, ? extends List<String>> map, int i4, int i5, int i6, int i7, boolean z2, int i8, int i9, int i10) {
        this.enable = z;
        this.extremeLowStateDaysDuration = i;
        this.extremeCleanHoursDuration = i2;
        this.extremeCleanerWhiteList = list;
        this.geckoExpireDays = i3;
        this.geckoCleanAKAndWhiteList = map;
        this.alogMBSize = i4;
        this.geckoAdSplashPagePreloadCacheCount = i5;
        this.geckoAdLynxPaePreloadCacheCount = i6;
        this.geckoAdLandingPagePreloadCacheCount = i7;
        this.disableFeedCache = z2;
        this.studioAVStorageCleanOpt = i8;
        this.detachCurrentThreadCrashFix = i9;
        this.disableCleanInAndroidLollipop = i10;
    }

    public ExtremeStorageCleanConfig(boolean z, int i, int i2, List list, int i3, Map map, int i4, int i5, int i6, int i7, boolean z2, int i8, int i9, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z, (i11 & 2) != 0 ? 14 : i, (i11 & 4) != 0 ? 24 : i2, (i11 & 8) != 0 ? C13BV.INSTANCE : list, (i11 & 16) != 0 ? 7 : i3, (i11 & 32) != 0 ? C2097608Jq.LJ() : map, (i11 & 64) != 0 ? 20 : i4, (i11 & 128) != 0 ? 6 : i5, (i11 & 256) != 0 ? 10 : i6, (i11 & 512) != 0 ? 2 : i7, (i11 & 1024) != 0 ? false : z2, (i11 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? 0 : i8, (i11 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? -1 : i9, (i11 & 8192) == 0 ? i10 : 0);
    }
}
