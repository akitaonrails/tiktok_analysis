package X;

import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import com.ss.android.ugc.governance.eventbus.IEvent;
import java.util.List;

/* JADX INFO: renamed from: X.0KeI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C522440KeI implements IEvent {
    public final List<TikTokMediaModel> LIZ;
    public final int LIZIZ;
    public final boolean LIZJ;

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

    /* JADX WARN: Multi-variable type inference failed */
    public C522440KeI(List<? extends TikTokMediaModel> list, int i, boolean z) {
        this.LIZ = list;
        this.LIZIZ = i;
        this.LIZJ = z;
    }
}
