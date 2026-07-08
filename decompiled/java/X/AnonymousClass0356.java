package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0356, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class AnonymousClass0356 implements IEvent {
    public final String LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass0356)) {
            return false;
        }
        AnonymousClass0356 anonymousClass0356 = (AnonymousClass0356) obj;
        return Intrinsics.LJFF(this.LIZ, anonymousClass0356.LIZ) && Intrinsics.LJFF(this.LIZIZ, anonymousClass0356.LIZIZ);
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
        sbLIZ.append("AdPreloadGeckoFailEvent(channel=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", errorMessage=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AnonymousClass0356(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
