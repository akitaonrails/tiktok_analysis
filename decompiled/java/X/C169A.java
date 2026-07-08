package X;

import com.tiktok.ttm.TTMParamData;
import com.tiktok.ttm.ttmparam.ITTMParamData;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.169A, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C169A extends ITTMParamData {
    public static final /* synthetic */ int LJFF = 0;
    public final String LIZIZ;
    public final String LIZJ;
    public final boolean LIZLLL;
    public final Map<String, ?> LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C169A)) {
            return false;
        }
        C169A c169a = (C169A) obj;
        return Intrinsics.LJFF(this.LIZIZ, c169a.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c169a.LIZJ) && this.LIZLLL == c169a.LIZLLL && Intrinsics.LJFF(this.LJ, c169a.LJ);
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public final Object getInputData() {
        return this;
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public final int getType() {
        return 2;
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZIZ.hashCode() * 31) + this.LIZJ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31;
        Map<String, ?> map = this.LJ;
        return iHashCode + (map == null ? 0 : map.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ConvContextETModel(convId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", eventName=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", isUnique=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", eventParams=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public final ITTMParamData getObjectItem(String str) {
        if (Intrinsics.LJFF(str, "eventParams")) {
            Map<String, ?> mapLJ = this.LJ;
            if (mapLJ == null) {
                mapLJ = C2097608Jq.LJ();
            }
            return new TTMParamData((Map<String, Object>) mapLJ).getActualParamData();
        }
        return new TTMParamData("").getActualParamData();
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public final long getIntValue(String str, int i) {
        if (!Intrinsics.LJFF(str, "isUnique") || !this.LIZLLL) {
            return 0L;
        }
        return 1L;
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public final String getStringValue(String str, int i) {
        if (Intrinsics.LJFF(str, "convId")) {
            return this.LIZIZ;
        }
        if (Intrinsics.LJFF(str, "eventName")) {
            return this.LIZJ;
        }
        return "";
    }

    public C169A(String str, String str2, boolean z, Map<String, ?> map) {
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = z;
        this.LJ = map;
    }
}
