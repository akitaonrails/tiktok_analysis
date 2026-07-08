package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Iyq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C484220Iyq implements IEvent {
    public final JSONObject LIZ;

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

    public C484220Iyq(JSONObject jSONObject) {
        this.LIZ = jSONObject;
    }
}
