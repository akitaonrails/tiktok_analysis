package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07yT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2037107yT implements IEvent {
    public final String LIZ;
    public final String LIZIZ;

    public C2037107yT() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2037107yT)) {
            return false;
        }
        C2037107yT c2037107yT = (C2037107yT) obj;
        return Intrinsics.LJFF(this.LIZ, c2037107yT.LIZ) && Intrinsics.LJFF(this.LIZIZ, c2037107yT.LIZIZ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
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
        sbLIZ.append("LiveExitEvent(firstEnterFromMerge=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", firstEnterMethod=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2037107yT(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
