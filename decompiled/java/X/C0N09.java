package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0N09, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N09 implements IEvent {
    public final int LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0N09)) {
            return false;
        }
        C0N09 c0n09 = (C0N09) obj;
        return this.LIZ == c0n09.LIZ && this.LIZIZ == c0n09.LIZIZ && Intrinsics.LJFF(this.LIZJ, c0n09.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c0n09.LIZLLL);
    }

    public final int hashCode() {
        return (((((this.LIZ * 31) + this.LIZIZ) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode();
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
        sbLIZ.append("BALiveLeadsGenPinActionEvent(pinAction=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", pinPeriod=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", liveCardTitle=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", liveCardIntro=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0N09(int i, int i2, String str, String str2) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = str;
        this.LIZLLL = str2;
    }
}
