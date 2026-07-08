package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.02zA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C767402zA implements IEvent {
    public final String LIZ;
    public final JSONObject LIZIZ;

    public C767402zA() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C767402zA)) {
            return false;
        }
        C767402zA c767402zA = (C767402zA) obj;
        return Intrinsics.LJFF(this.LIZ, c767402zA.LIZ) && Intrinsics.LJFF(this.LIZIZ, c767402zA.LIZIZ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        JSONObject jSONObject = this.LIZIZ;
        return iHashCode + (jSONObject != null ? jSONObject.hashCode() : 0);
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
        sbLIZ.append("ECOpenProductListEvent(event=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", params=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C767402zA(String str, JSONObject jSONObject) {
        this.LIZ = str;
        this.LIZIZ = jSONObject;
    }
}
