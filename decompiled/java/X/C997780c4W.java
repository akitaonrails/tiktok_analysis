package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridContainerManager;
import com.ss.android.ugc.aweme.commercialize.model.AdDescriptiveCTAStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0c4W, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C997780c4W extends C0T4Y {
    public static final /* synthetic */ int LIZLLL = 0;
    public C997400c3u LIZIZ;
    public AbstractC1028360crq LIZJ;

    @Override // X.C0T2H
    public final boolean LIZLLL() {
        return true;
    }

    @Override // X.C0T2H
    public final boolean LJIIJJI(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        AdDescriptiveCTAStruct adDescriptiveCTA;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && (adDescriptiveCTA = awemeRawAd.getAdDescriptiveCTA()) != null && adDescriptiveCTA.getBottomContainer() != null) {
            return true;
        }
        return false;
    }

    @Override // X.C0T2H
    public final void LIZ(Context context, Aweme aweme) {
        if (LJIIJJI(aweme)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("remove cache ,cache key = ");
            sbLIZ.append(C1000480c8s.LIZ(aweme));
            C2188811AlT.LIZIZ(sbLIZ);
            C811103Ev.LIZ("feed_fyp_descriptive_bottom_container");
            LJIIIIZZ(context, aweme);
            AbstractC1028360crq abstractC1028360crq = this.LIZJ;
            if (abstractC1028360crq != null) {
                abstractC1028360crq.LJIL(C1000480c8s.LIZ(aweme));
            }
        }
    }

    @Override // X.C0T2H
    public final void LJFF(Context context, Aweme aweme) {
        if (this.LIZIZ == null) {
            this.LIZIZ = new C997400c3u();
        }
        C997400c3u c997400c3u = this.LIZIZ;
        if (c997400c3u != null) {
            c997400c3u.LIZIZ();
        }
        this.LIZJ = ((IAdHybridContainerManager) ServiceManager.get().getService(IAdHybridContainerManager.class)).LIZIZ(C1000480c8s.LIZJ(context, aweme), C1000480c8s.LIZIZ(context, aweme), null);
    }

    public final void LJIIIIZZ(Context context, Aweme aweme) {
        if (this.LIZJ == null) {
            this.LIZJ = ((IAdHybridContainerManager) ServiceManager.get().getService(IAdHybridContainerManager.class)).LIZLLL(C1000480c8s.LIZJ(context, aweme), C1000480c8s.LIZIZ(context, aweme));
        }
    }

    @Override // X.C0T2H
    public final void LJ(int i, Context context, List list) {
        if (i >= 0 && i < list.size() && !AwemeExtKt.isAdTraffic((Aweme) ListProtector.get(list, i))) {
            Iterator it2 = list.iterator();
            int i2 = 0;
            while (it2.hasNext()) {
                Aweme aweme = (Aweme) it2.next();
                if (LJIIJJI(aweme) && i2 + 6 < i) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("remove cache ,cache key = ");
                    sbLIZ.append(C1000480c8s.LIZ(aweme));
                    C2188811AlT.LIZIZ(sbLIZ);
                    C811103Ev.LIZ("feed_fyp_descriptive_bottom_container");
                    LJIIIIZZ(context, aweme);
                    AbstractC1028360crq abstractC1028360crq = this.LIZJ;
                    if (abstractC1028360crq != null) {
                        abstractC1028360crq.LJIL(C1000480c8s.LIZ(aweme));
                    }
                }
                i2++;
            }
        }
    }
}
