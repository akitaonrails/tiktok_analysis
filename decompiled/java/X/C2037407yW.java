package X;

import com.ss.android.ugc.governance.eventbus.IEvent;

/* JADX INFO: renamed from: X.07yW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2037407yW implements IEvent {
    public final boolean LIZ;
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2037407yW)) {
            return false;
        }
        C2037407yW c2037407yW = (C2037407yW) obj;
        return this.LIZ == c2037407yW.LIZ && this.LIZIZ == c2037407yW.LIZIZ;
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ);
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
        sbLIZ.append("PhotoIndicatorVisibilityEvent(visible=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isHolderSelected=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2037407yW(boolean z, boolean z2) {
        this.LIZ = z;
        this.LIZIZ = z2;
    }
}
