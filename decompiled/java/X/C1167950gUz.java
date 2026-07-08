package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.governance.eventbus.IEvent;

/* JADX INFO: renamed from: X.0gUz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1167950gUz implements IEvent {
    public final String LIZ;
    public final UrlModel LIZIZ;
    public final Boolean LIZJ;
    public final String LIZLLL;
    public final Integer LJ;

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

    public C1167950gUz(String str, UrlModel urlModel, Boolean bool, String str2, Integer num) {
        this.LIZ = str;
        this.LIZIZ = urlModel;
        this.LIZJ = bool;
        this.LIZLLL = str2;
        this.LJ = num;
    }
}
