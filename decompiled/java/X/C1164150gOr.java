package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.governance.eventbus.IEvent;

/* JADX INFO: renamed from: X.0gOr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1164150gOr implements IEvent {
    public final String LIZ;
    public final String LIZIZ;
    public final UrlModel LIZJ;
    public final Integer LIZLLL;
    public final Long LJ;

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

    public C1164150gOr(String str, String str2, UrlModel urlModel, Integer num, Long l) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = urlModel;
        this.LIZLLL = num;
        this.LJ = l;
    }
}
