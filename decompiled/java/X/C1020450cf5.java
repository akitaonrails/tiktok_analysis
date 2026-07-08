package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0cf5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1020450cf5 implements IEvent {
    public final int LIZ;
    public final String LIZIZ;
    public final JSONObject LIZJ;

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

    public C1020450cf5(int i, String str, JSONObject jSONObject) {
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = jSONObject;
    }
}
