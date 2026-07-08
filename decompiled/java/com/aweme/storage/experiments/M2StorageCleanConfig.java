package com.aweme.storage.experiments;

import X.C09CT;
import X.C13BV;
import X.C2097608Jq;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes36.dex */
public final class M2StorageCleanConfig {

    @C09CT("av_effect_clean_max_days")
    public final int avEffectCleanMaxDays;

    @C09CT("available_storage_clean_cache")
    public final long availableStorageCleanCache;

    @C09CT("enable_storage_clean_df")
    public final boolean enableStorageCleanDF;

    @C09CT("enable_storage_clean_vdex")
    public final boolean enableStorageCleanVDex;

    @C09CT("extreme_cleaner_white_list")
    public final List<String> extremeCleanerWhiteList;

    @C09CT("gecko_clean_ak_and_white_list")
    public final Map<String, List<String>> geckoCleanAKAndWhiteList;

    @C09CT("gecko_expire_days")
    public final int geckoExpireDays;

    public M2StorageCleanConfig() {
        this(0L, null, 0, null, 0, false, false, 127, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public M2StorageCleanConfig(long j, List<String> list, int i, Map<String, ? extends List<String>> map, int i2, boolean z, boolean z2) {
        this.availableStorageCleanCache = j;
        this.extremeCleanerWhiteList = list;
        this.geckoExpireDays = i;
        this.geckoCleanAKAndWhiteList = map;
        this.avEffectCleanMaxDays = i2;
        this.enableStorageCleanDF = z;
        this.enableStorageCleanVDex = z2;
    }

    public M2StorageCleanConfig(long j, List list, int i, Map map, int i2, boolean z, boolean z2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 1500L : j, (i3 & 2) != 0 ? C13BV.INSTANCE : list, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? C2097608Jq.LJ() : map, (i3 & 16) != 0 ? 1 : i2, (i3 & 32) != 0 ? false : z, (i3 & 64) == 0 ? z2 : false);
    }
}
