package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0SkU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C730120SkU implements IEvent {
    public final String LIZ;
    public final long LIZIZ;
    public final int LIZJ;
    public final EnumC730430Skz LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C730120SkU)) {
            return false;
        }
        C730120SkU c730120SkU = (C730120SkU) obj;
        return Intrinsics.LJFF(this.LIZ, c730120SkU.LIZ) && this.LIZIZ == c730120SkU.LIZIZ && this.LIZJ == c730120SkU.LIZJ && this.LIZLLL == c730120SkU.LIZLLL;
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + this.LIZJ) * 31) + this.LIZLLL.hashCode();
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
        sbLIZ.append("SyncDiggStateEvent(aid=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", count=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", userDigg=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", from=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C730120SkU(String str, long j, int i, EnumC730430Skz enumC730430Skz) {
        this.LIZ = str;
        this.LIZIZ = j;
        this.LIZJ = i;
        this.LIZLLL = enumC730430Skz;
    }
}
