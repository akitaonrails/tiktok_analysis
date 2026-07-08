package X;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gtb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1183210gtb implements Serializable {
    public final String dataVersion;
    public final String entityId;
    public final C1183220gtc mobParams;
    public final String poiId;
    public final String poiSessionId;
    public final String scene;
    public final String serviceType;

    public C1183210gtb() {
        this(null, null, null, null, null, "poi", "poi_recommend_feature_detail");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1183210gtb)) {
            return false;
        }
        C1183210gtb c1183210gtb = (C1183210gtb) obj;
        return Intrinsics.LJFF(this.poiId, c1183210gtb.poiId) && Intrinsics.LJFF(this.entityId, c1183210gtb.entityId) && Intrinsics.LJFF(this.dataVersion, c1183210gtb.dataVersion) && Intrinsics.LJFF(this.poiSessionId, c1183210gtb.poiSessionId) && Intrinsics.LJFF(this.mobParams, c1183210gtb.mobParams) && Intrinsics.LJFF(this.scene, c1183210gtb.scene) && Intrinsics.LJFF(this.serviceType, c1183210gtb.serviceType);
    }

    public int hashCode() {
        String str = this.poiId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.entityId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.dataVersion;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.poiSessionId;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        C1183220gtc c1183220gtc = this.mobParams;
        return ((((iHashCode4 + (c1183220gtc != null ? c1183220gtc.hashCode() : 0)) * 31) + this.scene.hashCode()) * 31) + this.serviceType.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiCategoryFeatureDetailDataParams(poiId=");
        sbLIZ.append(this.poiId);
        sbLIZ.append(", entityId=");
        sbLIZ.append(this.entityId);
        sbLIZ.append(", dataVersion=");
        sbLIZ.append(this.dataVersion);
        sbLIZ.append(", poiSessionId=");
        sbLIZ.append(this.poiSessionId);
        sbLIZ.append(", mobParams=");
        sbLIZ.append(this.mobParams);
        sbLIZ.append(", scene=");
        sbLIZ.append(this.scene);
        sbLIZ.append(", serviceType=");
        sbLIZ.append(this.serviceType);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1183210gtb(String str, String str2, String str3, String str4, C1183220gtc c1183220gtc, String str5, String str6) {
        this.poiId = str;
        this.entityId = str2;
        this.dataVersion = str3;
        this.poiSessionId = str4;
        this.mobParams = c1183220gtc;
        this.scene = str5;
        this.serviceType = str6;
    }
}
