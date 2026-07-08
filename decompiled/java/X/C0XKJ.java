package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0XKJ, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XKJ implements IEvent {
    public final String LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final JSONObject LIZLLL;

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

    public C0XKJ(String str, int i, JSONObject jSONObject, String str2) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZLLL = jSONObject;
        this.LIZJ = str2;
    }
}
