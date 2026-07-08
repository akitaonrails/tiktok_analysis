package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.034K, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C034K implements IEvent {
    public final int LIZ = 2;
    public final String LIZIZ = "SearchResultFragment#handleBackPressed";

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C034K)) {
            return false;
        }
        C034K c034k = (C034K) obj;
        return this.LIZ == c034k.LIZ && Intrinsics.LJFF(this.LIZIZ, c034k.LIZIZ);
    }

    public final int hashCode() {
        int i = this.LIZ * 31;
        String str = this.LIZIZ;
        return i + (str == null ? 0 : str.hashCode());
    }

    @Override // com.ss.android.ugc.governance.eventbus.IEvent
    public final /* synthetic */ IEvent postSticky() {
        C1440005kM.LIZIZ(this);
        return this;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CancelMixRequestEvent(code=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", reason=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.ss.android.ugc.governance.eventbus.IEvent
    public final IEvent post() {
        C1440005kM.LIZ(this);
        return this;
    }
}
