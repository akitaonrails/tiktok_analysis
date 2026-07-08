package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0O9w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C614900O9w implements IEvent {
    public final boolean LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public final boolean LJII;
    public final boolean LJIIIIZZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C614900O9w)) {
            return false;
        }
        C614900O9w c614900O9w = (C614900O9w) obj;
        return this.LIZ == c614900O9w.LIZ && Intrinsics.LJFF(this.LIZIZ, c614900O9w.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c614900O9w.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c614900O9w.LIZLLL) && Intrinsics.LJFF(this.LJ, c614900O9w.LJ) && this.LJFF == c614900O9w.LJFF && this.LJI == c614900O9w.LJI && this.LJII == c614900O9w.LJII && this.LJIIIIZZ == c614900O9w.LJIIIIZZ;
    }

    public final int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.LIZ) * 31;
        String str = this.LIZIZ;
        int iHashCode = (iZ2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LIZJ;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LIZLLL;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LJ;
        return ((((((((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LJFF)) * 31) + C786410Ut5.Z2(this.LJI)) * 31) + C786410Ut5.Z2(this.LJII)) * 31) + C786410Ut5.Z2(this.LJIIIIZZ);
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
        sbLIZ.append("CollectStatusChangeEvent(isCollected=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", poiId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", poiName=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", poiAddress=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", collectStatusAssemHashCode=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", isFromList=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", isFromMapMode=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", isFromPoiRevisit=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", isFromOptimistic=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C614900O9w(boolean z, String str, String str2, String str3, String str4, boolean z2, boolean z3, boolean z4, boolean z5, int i) {
        str = (i & 2) != 0 ? null : str;
        str2 = (i & 4) != 0 ? null : str2;
        str3 = (i & 8) != 0 ? null : str3;
        str4 = (i & 16) != 0 ? null : str4;
        z2 = (i & 32) != 0 ? false : z2;
        z3 = (i & 64) != 0 ? false : z3;
        z4 = (i & 128) != 0 ? false : z4;
        z5 = (i & 256) != 0 ? false : z5;
        this.LIZ = z;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = str4;
        this.LJFF = z2;
        this.LJI = z3;
        this.LJII = z4;
        this.LJIIIIZZ = z5;
    }
}
