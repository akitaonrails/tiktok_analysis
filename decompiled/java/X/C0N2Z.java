package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0N2Z, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N2Z implements IEvent {
    public final int LIZ;
    public final InterfaceC1041760dDS LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0N2Z)) {
            return false;
        }
        C0N2Z c0n2z = (C0N2Z) obj;
        return this.LIZ == c0n2z.LIZ && Intrinsics.LJFF(this.LIZIZ, c0n2z.LIZIZ);
    }

    public final int hashCode() {
        int i = this.LIZ * 31;
        InterfaceC1041760dDS interfaceC1041760dDS = this.LIZIZ;
        return i + (interfaceC1041760dDS == null ? 0 : interfaceC1041760dDS.hashCode());
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
        sbLIZ.append("GetStatusEvent(webViewHash=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", iReturn=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0N2Z(int i, InterfaceC1041760dDS interfaceC1041760dDS) {
        this.LIZ = i;
        this.LIZIZ = interfaceC1041760dDS;
    }
}
