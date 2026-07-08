package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Mwv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C584950Mwv implements IEvent {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C584950Mwv)) {
            return false;
        }
        C584950Mwv c584950Mwv = (C584950Mwv) obj;
        return this.LIZ == c584950Mwv.LIZ && this.LIZIZ == c584950Mwv.LIZIZ && Intrinsics.LJFF(this.LIZJ, c584950Mwv.LIZJ);
    }

    public final int hashCode() {
        return (((C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + this.LIZJ.hashCode();
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
        sbLIZ.append("MiniDramaSpecialCardEvent(needRemoveCard=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", needInsertCard=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", removeCardReason=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C584950Mwv(boolean z, boolean z2, String str) {
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = str;
    }
}
