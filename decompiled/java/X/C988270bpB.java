package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import org.json.JSONArray;

/* JADX INFO: renamed from: X.0bpB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C988270bpB implements IEvent {
    public final JSONArray LIZ;
    public final InterfaceC1028200cra LIZIZ;

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

    public C988270bpB(JSONArray jSONArray, InterfaceC1028200cra interfaceC1028200cra) {
        this.LIZ = jSONArray;
        this.LIZIZ = interfaceC1028200cra;
    }
}
