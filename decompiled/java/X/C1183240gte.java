package X;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gte, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1183240gte implements Serializable {
    public final String dataVersion;
    public final C1183220gtc mobParams;
    public final String poiId;
    public final String poiSessionId;
    public final String scene;
    public final String serviceType;
    public final C1184490gvf shareParams;

    public C1183240gte() {
        this(null, null, null, new C1184490gvf(null, null, null, null), null, "poi", "poi_recommend_feature");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1183240gte)) {
            return false;
        }
        C1183240gte c1183240gte = (C1183240gte) obj;
        return Intrinsics.LJFF(this.poiId, c1183240gte.poiId) && Intrinsics.LJFF(this.poiSessionId, c1183240gte.poiSessionId) && Intrinsics.LJFF(this.dataVersion, c1183240gte.dataVersion) && Intrinsics.LJFF(this.shareParams, c1183240gte.shareParams) && Intrinsics.LJFF(this.mobParams, c1183240gte.mobParams) && Intrinsics.LJFF(this.scene, c1183240gte.scene) && Intrinsics.LJFF(this.serviceType, c1183240gte.serviceType);
    }

    public int hashCode() {
        String str = this.poiId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.poiSessionId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.dataVersion;
        int iHashCode3 = (((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.shareParams.hashCode()) * 31;
        C1183220gtc c1183220gtc = this.mobParams;
        return ((((iHashCode3 + (c1183220gtc != null ? c1183220gtc.hashCode() : 0)) * 31) + this.scene.hashCode()) * 31) + this.serviceType.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiCategoryFeatureDataParams(poiId=");
        sbLIZ.append(this.poiId);
        sbLIZ.append(", poiSessionId=");
        sbLIZ.append(this.poiSessionId);
        sbLIZ.append(", dataVersion=");
        sbLIZ.append(this.dataVersion);
        sbLIZ.append(", shareParams=");
        sbLIZ.append(this.shareParams);
        sbLIZ.append(", mobParams=");
        sbLIZ.append(this.mobParams);
        sbLIZ.append(", scene=");
        sbLIZ.append(this.scene);
        sbLIZ.append(", serviceType=");
        sbLIZ.append(this.serviceType);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1183240gte(String str, String str2, String str3, C1184490gvf c1184490gvf, C1183220gtc c1183220gtc, String str4, String str5) {
        this.poiId = str;
        this.poiSessionId = str2;
        this.dataVersion = str3;
        this.shareParams = c1184490gvf;
        this.mobParams = c1183220gtc;
        this.scene = str4;
        this.serviceType = str5;
    }
}
