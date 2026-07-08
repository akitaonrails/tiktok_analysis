package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.031s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C7770031s implements IEvent {
    public final String LIZ;
    public final Boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7770031s)) {
            return false;
        }
        C7770031s c7770031s = (C7770031s) obj;
        return Intrinsics.LJFF(this.LIZ, c7770031s.LIZ) && Intrinsics.LJFF(this.LIZIZ, c7770031s.LIZIZ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.LIZIZ;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
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
        sbLIZ.append("LikeChangeEvent(cid=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isLikedByCreator=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C7770031s(String str, Boolean bool) {
        this.LIZ = str;
        this.LIZIZ = bool;
    }
}
