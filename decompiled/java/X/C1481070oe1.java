package X;

import com.ss.android.ugc.aweme.player.ab.abs.buffer.WaterLevelCacheData;

/* JADX INFO: renamed from: X.0oe1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1481070oe1 {
    public static final WaterLevelCacheData LIZ = new WaterLevelCacheData(10, 100);

    public static final WaterLevelCacheData LIZ() {
        WaterLevelCacheData waterLevelCacheData;
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        WaterLevelCacheData waterLevelCacheData2 = LIZ;
        Object objLJJII = c0c64LJIILLIIL.LJJII(WaterLevelCacheData.class, waterLevelCacheData2, "water_level_cache_exp", true);
        return (!(objLJJII instanceof WaterLevelCacheData) || (waterLevelCacheData = (WaterLevelCacheData) objLJJII) == null) ? waterLevelCacheData2 : waterLevelCacheData;
    }
}
