package X;

import com.ss.android.ugc.aweme.ad.feed.feinteraction.AdFeInteractionImpl;
import com.ss.android.ugc.aweme.ad.feed.feinteraction.IAdFeInteraction;
import com.ss.android.ugc.aweme.commercialize.model.AdFeInteractionModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.List;

/* JADX INFO: renamed from: X.0cZ4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1016720cZ4 implements IAdFeInteraction {
    public static final C1016720cZ4 LIZIZ = new C1016720cZ4();
    public final /* synthetic */ IAdFeInteraction LIZ;

    @Override // com.ss.android.ugc.aweme.ad.feed.feinteraction.IAdFeInteraction
    public final AdFeInteractionModel LIZ(Aweme aweme) {
        return this.LIZ.LIZ(aweme);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.feinteraction.IAdFeInteraction
    public final void LIZIZ(AwemeRawAd awemeRawAd, List<String> list) {
        this.LIZ.LIZIZ(awemeRawAd, list);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.feinteraction.IAdFeInteraction
    public final boolean LIZJ(Aweme aweme) {
        return this.LIZ.LIZJ(aweme);
    }

    public C1016720cZ4() {
        IAdFeInteraction iAdFeInteraction;
        Object objLIZ = C04TD.LIZ(IAdFeInteraction.class, false);
        if (objLIZ != null) {
            iAdFeInteraction = (IAdFeInteraction) objLIZ;
        } else {
            if (C04TD.LJLLILLLL == null) {
                synchronized (IAdFeInteraction.class) {
                    if (C04TD.LJLLILLLL == null) {
                        C04TD.LJLLILLLL = new AdFeInteractionImpl();
                    }
                }
            }
            iAdFeInteraction = C04TD.LJLLILLLL;
        }
        this.LIZ = iAdFeInteraction;
    }
}
