package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import java.util.List;

/* JADX INFO: renamed from: X.0Odq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C624080Odq implements IEvent {
    public final List<C623970Odf> LIZ;

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

    public C624080Odq(List<C623970Odf> list) {
        this.LIZ = list;
    }
}
