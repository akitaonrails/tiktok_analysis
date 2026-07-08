package X;

import com.ss.android.ugc.governance.eventbus.IEvent;

/* JADX INFO: renamed from: X.0N55, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N55 implements IEvent {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0N55)) {
            return false;
        }
        C0N55 c0n55 = (C0N55) obj;
        return this.LIZ == c0n55.LIZ && this.LIZIZ == c0n55.LIZIZ && this.LIZJ == c0n55.LIZJ && this.LIZLLL == c0n55.LIZLLL;
    }

    public final int hashCode() {
        return (((((C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + C786410Ut5.Z2(this.LIZLLL);
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
        sbLIZ.append("SeriesScrollEvent(isOverlayShown=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", wasOverlayShownOnPreviousVideo=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", ifAbleToScroll=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", isEndPlay=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0N55(boolean z, boolean z2, boolean z3, boolean z4) {
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = z3;
        this.LIZLLL = z4;
    }
}
