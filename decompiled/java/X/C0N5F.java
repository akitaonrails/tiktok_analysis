package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0N5F, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N5F implements IEvent {
    public final C1365810le7 LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0N5F)) {
            return false;
        }
        C0N5F c0n5f = (C0N5F) obj;
        return Intrinsics.LJFF(this.LIZ, c0n5f.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0n5f.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
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
        sbLIZ.append("MessageShareCompleteClickedEvent(params=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", toastId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0N5F(C1365810le7 c1365810le7, String str) {
        this.LIZ = c1365810le7;
        this.LIZIZ = str;
    }
}
