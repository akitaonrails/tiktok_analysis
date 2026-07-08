package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0MxO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C585240MxO implements IEvent {
    public final String LIZ;
    public final String LIZIZ;

    public C585240MxO() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C585240MxO)) {
            return false;
        }
        C585240MxO c585240MxO = (C585240MxO) obj;
        return Intrinsics.LJFF(this.LIZ, c585240MxO.LIZ) && Intrinsics.LJFF(this.LIZIZ, c585240MxO.LIZIZ);
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
        sbLIZ.append("PoiAlbumFinishEvent(poiId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", albumSessionId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C585240MxO(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
