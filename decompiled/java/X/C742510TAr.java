package X;

import com.ss.android.ugc.aweme.favorites.business.collection.CollectionManageRequest;
import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0TAr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C742510TAr implements IEvent {
    public final CollectionManageRequest LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C742510TAr)) {
            return false;
        }
        C742510TAr c742510TAr = (C742510TAr) obj;
        return Intrinsics.LJFF(this.LIZ, c742510TAr.LIZ) && Intrinsics.LJFF(this.LIZIZ, c742510TAr.LIZIZ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        return iHashCode + (str == null ? 0 : str.hashCode());
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
        sbLIZ.append("VideoCollectionOperationEvent(request=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", enterMethod=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C742510TAr(CollectionManageRequest collectionManageRequest, String str) {
        this.LIZ = collectionManageRequest;
        this.LIZIZ = str;
    }
}
