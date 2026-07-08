package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07yU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2037207yU implements IEvent {
    public final String LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2037207yU)) {
            return false;
        }
        C2037207yU c2037207yU = (C2037207yU) obj;
        return Intrinsics.LJFF(this.LIZ, c2037207yU.LIZ) && Intrinsics.LJFF(this.LIZIZ, c2037207yU.LIZIZ);
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
        sbLIZ.append("ReadC2PAWithoutCreationInfoEvent(bucketTaskId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", simpleMediaModel=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2037207yU(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
