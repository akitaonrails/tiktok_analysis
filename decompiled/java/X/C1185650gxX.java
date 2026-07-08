package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gxX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1185650gxX implements IEvent {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;

    public C1185650gxX() {
        this(null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1185650gxX)) {
            return false;
        }
        C1185650gxX c1185650gxX = (C1185650gxX) obj;
        return Intrinsics.LJFF(this.LIZ, c1185650gxX.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1185650gxX.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1185650gxX.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1185650gxX.LIZLLL);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LIZLLL;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
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
        sbLIZ.append("OnTakeoutPushReceivedEvent(poiId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", orderTrackUrl=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", ttoclid=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", partnerName=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1185650gxX(String str, String str2, String str3, String str4) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
    }
}
