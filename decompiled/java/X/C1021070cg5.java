package X;

import com.ss.android.ugc.aweme.commercialize.model.AiAgentConfig;
import com.ss.android.ugc.aweme.commercialize.router.api.model.CRouterCoreModel;
import com.ss.android.ugc.aweme.commercialize.router.api.model.CRouterDeeplinkModel;
import com.ss.android.ugc.aweme.commercialize.router.api.model.CRouterWebModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0cg5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1021070cg5 extends AbstractC1021230cgL<InterfaceC1021090cg7> {
    public final InterfaceC1021090cg7 LLILLJJLI;

    @Override // X.InterfaceC1010530cP5
    public final /* bridge */ /* synthetic */ Object Mh() {
        return this.LLILLJJLI;
    }

    public C1021070cg5(InterfaceC1021090cg7 interfaceC1021090cg7) {
        this.LLILLJJLI = interfaceC1021090cg7;
    }

    @Override // X.AbstractC1021230cgL
    public final C1021060cg4 LIZ(String str) {
        AwemeRawAd awemeRawAd;
        boolean z;
        AwemeRawAd awemeRawAd2;
        String openUrl;
        CRouterCoreModel cRouterCoreModel;
        Aweme aweme = this.LLILLJJLI.getAweme();
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            CRouterCoreModel cRouterCoreModel2 = new CRouterCoreModel(null, 0, null, new CRouterWebModel(awemeRawAd.getWebUrl(), awemeRawAd.getWebTitle(), false, false, 0, null), null, null, null);
            if (str != null) {
                z = true;
            } else {
                z = false;
            }
            C1021060cg4 c1021060cg4 = new C1021060cg4(cRouterCoreModel2, new C1025430cn7(null, null, null, new AiAgentConfig(z, str, this.LLILLJJLI.LIZ()), 95), 4);
            Aweme aweme2 = this.LLILLJJLI.getAweme();
            if (aweme2 != null && (awemeRawAd2 = aweme2.getAwemeRawAd()) != null && (openUrl = awemeRawAd2.getOpenUrl()) != null && u.LJJIIJZLJL(openUrl, "aweme://ec/pdp", false) && (cRouterCoreModel = c1021060cg4.LIZ) != null) {
                cRouterCoreModel.setDeeplinkModel(new CRouterDeeplinkModel(openUrl));
            }
            return c1021060cg4;
        }
        return null;
    }
}
