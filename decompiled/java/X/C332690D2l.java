package X;

import com.bytedance.ies.ugc.aweme.rich.model.CommonAdData;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0D2l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C332690D2l implements Serializable {
    public final String channelName;
    public final String productId;
    public final int protocolType;
    public final CommonAdData rawAdData;
    public final String source;
    public final String sourceAid;
    public final String tiktokShopId;
    public final String tiktokSpuId;
    public final String uniqueId;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C332690D2l)) {
            return false;
        }
        C332690D2l c332690D2l = (C332690D2l) obj;
        return Intrinsics.LJFF(this.productId, c332690D2l.productId) && this.protocolType == c332690D2l.protocolType && Intrinsics.LJFF(this.tiktokSpuId, c332690D2l.tiktokSpuId) && Intrinsics.LJFF(this.tiktokShopId, c332690D2l.tiktokShopId) && Intrinsics.LJFF(this.channelName, c332690D2l.channelName) && Intrinsics.LJFF(this.source, c332690D2l.source) && Intrinsics.LJFF(this.sourceAid, c332690D2l.sourceAid) && Intrinsics.LJFF(this.rawAdData, c332690D2l.rawAdData);
    }

    public int hashCode() {
        int iHashCode = ((this.productId.hashCode() * 31) + this.protocolType) * 31;
        String str = this.tiktokSpuId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.tiktokShopId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.channelName;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.source;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.sourceAid;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        CommonAdData commonAdData = this.rawAdData;
        return iHashCode6 + (commonAdData != null ? commonAdData.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PdpIdentity(productId=");
        sbLIZ.append(this.productId);
        sbLIZ.append(", protocolType=");
        sbLIZ.append(this.protocolType);
        sbLIZ.append(", tiktokSpuId=");
        sbLIZ.append(this.tiktokSpuId);
        sbLIZ.append(", tiktokShopId=");
        sbLIZ.append(this.tiktokShopId);
        sbLIZ.append(", channelName=");
        sbLIZ.append(this.channelName);
        sbLIZ.append(", source=");
        sbLIZ.append(this.source);
        sbLIZ.append(", sourceAid=");
        sbLIZ.append(this.sourceAid);
        sbLIZ.append(", rawAdData=");
        sbLIZ.append(this.rawAdData);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getUniqueId$ucp_impl_release() {
        return this.uniqueId;
    }

    public C332690D2l(String str, int i, String str2, String str3, String str4, String str5, String str6, CommonAdData commonAdData) {
        this.productId = str;
        this.protocolType = i;
        this.tiktokSpuId = str2;
        this.tiktokShopId = str3;
        this.channelName = str4;
        this.source = str5;
        this.sourceAid = str6;
        this.rawAdData = commonAdData;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('#');
        sbLIZ.append(str2 == null ? "" : str2);
        this.uniqueId = C2188811AlT.LIZIZ(sbLIZ);
    }
}
