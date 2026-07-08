package X;

import android.graphics.PointF;
import com.ss.android.ugc.governance.eventbus.IEvent;

/* JADX INFO: renamed from: X.0RSR, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RSR implements IEvent {
    public final int LIZ;
    public final Integer LIZIZ;
    public String LIZJ = "";
    public String LIZLLL = "";
    public PointF LJ = new PointF();

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

    public C0RSR(int i, Integer num) {
        this.LIZ = i;
        this.LIZIZ = num;
    }
}
