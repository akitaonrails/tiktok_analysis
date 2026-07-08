package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0kyP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1339950kyP implements IEvent {
    public final String LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final boolean LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1339950kyP)) {
            return false;
        }
        C1339950kyP c1339950kyP = (C1339950kyP) obj;
        return Intrinsics.LJFF(this.LIZ, c1339950kyP.LIZ) && this.LIZIZ == c1339950kyP.LIZIZ && this.LIZJ == c1339950kyP.LIZJ && this.LIZLLL == c1339950kyP.LIZLLL && this.LJ == c1339950kyP.LJ;
    }

    public final int hashCode() {
        return (((((((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31) + this.LIZLLL) * 31) + C786410Ut5.Z2(this.LJ);
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
        sbLIZ.append("CommentDiggChangeEventNew(cid=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", userDigg=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", diggCount=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", userBurried=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", isAuthorDigged=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1339950kyP(int i, int i2, int i3, String str, boolean z) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = i3;
        this.LJ = z;
    }
}
