package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07yh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2038507yh implements IEvent {
    public final String LIZ;
    public final boolean LIZIZ = true;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2038507yh)) {
            return false;
        }
        C2038507yh c2038507yh = (C2038507yh) obj;
        return Intrinsics.LJFF(this.LIZ, c2038507yh.LIZ) && this.LIZIZ == c2038507yh.LIZIZ;
    }

    public final int hashCode() {
        String str = this.LIZ;
        return ((str == null ? 0 : str.hashCode()) * 31) + C786410Ut5.Z2(this.LIZIZ);
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
        sbLIZ.append("DislikeStateEvent(aid=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isUserDislike=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2038507yh(String str) {
        this.LIZ = str;
    }
}
