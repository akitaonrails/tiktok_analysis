package X;

import com.ss.android.ugc.aweme.placediscovery.param.MapBounds;
import java.io.Serializable;

/* JADX INFO: renamed from: X.0ggS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1175060ggS implements Serializable {
    public final String fromGroupId;
    public final String fromPoiId;
    public final boolean gpsIsEncrypted;
    public final int limit;
    public final C1174450gfT mapCategoryStatus;
    public final C1174800gg2 mapCenter;
    public final MapBounds mapWindow;
    public final String nearbyTabName;
    public final int page;
    public final String poiID;
    public final String regionName;
    public final EnumC1175380ggy scene;
    public final EnumC1174970ggJ subScene;
    public final String targetRegion;

    public C1175060ggS(EnumC1174970ggJ enumC1174970ggJ, String str, int i, int i2, EnumC1175380ggy enumC1175380ggy, MapBounds mapBounds, String str2, C1174800gg2 c1174800gg2, boolean z, String str3, String str4, String str5, String str6, C1174450gfT c1174450gfT) {
        this.subScene = enumC1174970ggJ;
        this.targetRegion = str;
        this.page = i;
        this.limit = i2;
        this.scene = enumC1175380ggy;
        this.mapWindow = mapBounds;
        this.nearbyTabName = str2;
        this.mapCenter = c1174800gg2;
        this.gpsIsEncrypted = z;
        this.regionName = str3;
        this.poiID = str4;
        this.fromGroupId = str5;
        this.fromPoiId = str6;
        this.mapCategoryStatus = c1174450gfT;
    }
}
