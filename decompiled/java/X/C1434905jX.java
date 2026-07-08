package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.governance.eventbus.IEvent;

/* JADX INFO: renamed from: X.05jX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1434905jX implements IEvent {
    public final String LIZ;
    public final String LIZIZ;
    public final IMUser LIZJ;

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

    public C1434905jX(IMUser iMUser, String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = iMUser;
    }
}
