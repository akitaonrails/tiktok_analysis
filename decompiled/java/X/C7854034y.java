package X;

import com.ss.android.ugc.governance.eventbus.IEvent;

/* JADX INFO: renamed from: X.034y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C7854034y implements IEvent {
    public final String LIZ;
    public final String LIZIZ;
    public final int LIZJ;

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
        sbLIZ.append("BulletinOpenEvent(bbId='");
        sbLIZ.append(this.LIZ);
        sbLIZ.append("', uuid='");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append("', eventType=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C7854034y(String str, String str2, int i) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = i;
    }
}
