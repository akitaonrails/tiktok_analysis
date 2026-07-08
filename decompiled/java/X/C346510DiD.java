package X;

import java.util.List;
import kotlin.Pair;
import webcast.api.room.LivePodcastResponse;

/* JADX INFO: renamed from: X.0DiD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C346510DiD implements InterfaceC1478005qU {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1478005qU
    public final void subscribe(C09AJ<Pair<List<Object>, C1761680vwc>> c09aj) {
        switch (this.$t) {
            case 0:
                subscribe$0(this, c09aj);
                break;
            case 1:
                subscribe$1(this, c09aj);
                break;
        }
    }

    public C346510DiD(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void subscribe$0(C346510DiD c346510DiD, C09AJ c09aj) {
        C1C7U.LIZ("EffectProfileListRepository@4ea9.refreshCommon$1");
        C23250099c.LIZLLL(((C318050CdP) c346510DiD.l0).LIZ.scope(), C0PEM.LIZJ, null, new C317980CdI(c09aj, (C318050CdP) c346510DiD.l0, null), 2);
        C1C7U.LIZIZ("EffectProfileListRepository@4ea9.refreshCommon$1");
    }

    public static final void subscribe$1(C346510DiD c346510DiD, C09AJ c09aj) {
        LivePodcastResponse.ResponseData responseData = (LivePodcastResponse.ResponseData) c346510DiD.l0;
        C1C7U.LIZ("LiveServiceAdapter@4348.requestLivePermissionFromCache$2L");
        c09aj.onNext(responseData);
        C1C7U.LIZIZ("LiveServiceAdapter@4348.requestLivePermissionFromCache$2L");
    }
}
