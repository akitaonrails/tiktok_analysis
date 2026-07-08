package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0T4N, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0T4N implements IEvent {
    public final String LIZ;
    public final JSONObject LIZIZ;
    public final String LIZJ = null;
    public final Object LIZLLL = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0T4N)) {
            return false;
        }
        C0T4N c0t4n = (C0T4N) obj;
        return Intrinsics.LJFF(this.LIZ, c0t4n.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0t4n.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0t4n.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c0t4n.LIZLLL);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        JSONObject jSONObject = this.LIZIZ;
        int iHashCode2 = (iHashCode + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
        String str = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Object obj = this.LIZLLL;
        return iHashCode3 + (obj != null ? obj.hashCode() : 0);
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
        sbLIZ.append("JsBridgeEvent(funcName=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", params=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", callbackId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", jsBridge=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0T4N(String str, JSONObject jSONObject) {
        this.LIZ = str;
        this.LIZIZ = jSONObject;
    }
}
