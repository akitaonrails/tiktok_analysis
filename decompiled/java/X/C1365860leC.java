package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0leC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1365860leC implements IEvent {
    public final String LIZ;
    public final String LIZIZ;
    public final long LIZJ = 2000;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final String LJFF;
    public final boolean LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1365860leC)) {
            return false;
        }
        C1365860leC c1365860leC = (C1365860leC) obj;
        return Intrinsics.LJFF(this.LIZ, c1365860leC.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1365860leC.LIZIZ) && this.LIZJ == c1365860leC.LIZJ && this.LIZLLL == c1365860leC.LIZLLL && this.LJ == c1365860leC.LJ && Intrinsics.LJFF(this.LJFF, c1365860leC.LJFF) && this.LJI == c1365860leC.LJI;
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (((((((((str == null ? 0 : str.hashCode()) * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31) + C786410Ut5.Z2(this.LJ)) * 31;
        String str2 = this.LJFF;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LJI);
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
        sbLIZ.append("ShareUndoEvent(awemeId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", identity=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", duration=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", hasShowAnimation=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", hasDismissAnimation=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", enterMethod=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", isCreateGroupAndShare=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1365860leC(boolean z, boolean z2, boolean z3, String str, String str2, String str3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZLLL = z;
        this.LJ = z2;
        this.LJFF = str3;
        this.LJI = z3;
    }
}
