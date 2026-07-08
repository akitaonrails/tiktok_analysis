package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0XQe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C848460XQe implements IEvent {
    public final String LIZ;
    public final JSONObject LIZIZ;

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

    public C848460XQe(String str, JSONObject jSONObject) {
        this.LIZ = str;
        this.LIZIZ = jSONObject;
    }
}
