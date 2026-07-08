package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gxW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1185640gxW implements IEvent {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;

    public C1185640gxW() {
        this(null, null, null, null, 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1185640gxW)) {
            return false;
        }
        C1185640gxW c1185640gxW = (C1185640gxW) obj;
        return Intrinsics.LJFF(this.LIZ, c1185640gxW.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1185640gxW.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1185640gxW.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1185640gxW.LIZLLL) && Intrinsics.LJFF(this.LJ, c1185640gxW.LJ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LIZLLL;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.LJ;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
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
        sbLIZ.append("PoiAnchorModuleEvent(poiId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", poiSessionId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", anchorModuleInstanceId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", fromScene=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", albumSessionId=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1185640gxW(String str, String str2, String str3, String str4, int i) {
        str = (i & 1) != 0 ? null : str;
        str2 = (i & 2) != 0 ? null : str2;
        str3 = (i & 4) != 0 ? null : str3;
        str4 = (i & 16) != 0 ? null : str4;
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = null;
        this.LJ = str4;
    }
}
