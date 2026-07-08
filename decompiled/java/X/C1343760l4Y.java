package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import java.util.List;

/* JADX INFO: renamed from: X.0l4Y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1343760l4Y implements IEvent {
    public final List<String> LIZ;
    public final String LIZIZ;

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

    public C1343760l4Y(List list, String str) {
        this.LIZ = list;
        this.LIZIZ = str;
    }
}
