package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0853, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class AnonymousClass0853 implements IEvent {
    public final JSONObject LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass0853)) {
            return false;
        }
        AnonymousClass0853 anonymousClass0853 = (AnonymousClass0853) obj;
        return Intrinsics.LJFF(this.LIZ, anonymousClass0853.LIZ) && Intrinsics.LJFF(this.LIZIZ, anonymousClass0853.LIZIZ);
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
        sbLIZ.append("TransferSearchHorizontalEventV2(response=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", containerId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AnonymousClass0853(String str, JSONObject jSONObject) {
        this.LIZ = jSONObject;
        this.LIZIZ = str;
    }
}
