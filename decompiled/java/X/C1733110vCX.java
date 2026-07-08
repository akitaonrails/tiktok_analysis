package X;

import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.billboard.model.ECWatcherWaterMark;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vCX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1733110vCX {
    public final ECWatcherWaterMark LIZ;
    public final Map<String, Object> LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1733110vCX)) {
            return false;
        }
        C1733110vCX c1733110vCX = (C1733110vCX) obj;
        return Intrinsics.LJFF(this.LIZ, c1733110vCX.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1733110vCX.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1733110vCX.LIZJ);
    }

    public final int hashCode() {
        ECWatcherWaterMark eCWatcherWaterMark = this.LIZ;
        int iHashCode = (eCWatcherWaterMark == null ? 0 : eCWatcherWaterMark.hashCode()) * 31;
        Map<String, Object> map = this.LIZIZ;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.LIZJ;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ECWatcherWaterMarkState(waterMark=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", daInfo=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", roomId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1733110vCX(ECWatcherWaterMark eCWatcherWaterMark, Map<String, ? extends Object> map, String str) {
        this.LIZ = eCWatcherWaterMark;
        this.LIZIZ = map;
        this.LIZJ = str;
    }
}
