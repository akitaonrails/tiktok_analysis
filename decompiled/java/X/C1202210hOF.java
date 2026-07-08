package X;

import com.ss.android.ugc.aweme.poi.PoiData;
import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hOF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1202210hOF implements IEvent {
    public final PoiData LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1202210hOF)) {
            return false;
        }
        C1202210hOF c1202210hOF = (C1202210hOF) obj;
        return Intrinsics.LJFF(this.LIZ, c1202210hOF.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1202210hOF.LIZIZ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // com.ss.android.ugc.governance.eventbus.IEvent
    public final /* synthetic */ IEvent post() {
        C1440005kM.LIZ(this);
        return this;
    }

    @Override // com.ss.android.ugc.governance.eventbus.IEvent
    public final /* synthetic */ IEvent postSticky() {
        C1440005kM.LIZIZ(this);
        return this;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiVideoPublish(poiData=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", shootWay=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1202210hOF(PoiData poiData, String str) {
        this.LIZ = poiData;
        this.LIZIZ = str;
    }
}
