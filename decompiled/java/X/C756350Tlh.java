package X;

import com.ss.android.ugc.aweme.commercialize.live.business.links.model.BusinessLinksLiveLinkCard;
import com.ss.android.ugc.aweme.commercialize.live.business.links.model.BusinessLinksLiveLinkPin;
import com.ss.android.ugc.governance.eventbus.IEvent;

/* JADX INFO: renamed from: X.0Tlh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C756350Tlh implements IEvent {
    public final BusinessLinksLiveLinkPin LIZ;
    public final BusinessLinksLiveLinkCard LIZIZ;

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

    public C756350Tlh(BusinessLinksLiveLinkPin businessLinksLiveLinkPin, BusinessLinksLiveLinkCard businessLinksLiveLinkCard) {
        this.LIZ = businessLinksLiveLinkPin;
        this.LIZIZ = businessLinksLiveLinkCard;
    }
}
