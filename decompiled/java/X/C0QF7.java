package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QF7, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QF7 implements IEvent {
    public final C0QF8 LIZ;
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0QF7)) {
            return false;
        }
        C0QF7 c0qf7 = (C0QF7) obj;
        return Intrinsics.LJFF(this.LIZ, c0qf7.LIZ) && this.LIZIZ == c0qf7.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ);
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
        sbLIZ.append("CloseSearchBoxEvent(reason=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", needAnimation=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0QF7(EnumC1594380ram enumC1594380ram, boolean z) {
        this.LIZ = enumC1594380ram;
        this.LIZIZ = z;
    }
}
