package X;

import com.ss.android.ugc.aweme.commercialize.router.api.model.CRouterCoreModel;
import com.ss.android.ugc.aweme.commercialize.routeradapter.api.openapi.invoke.ICRouterAdapterService;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import kotlin.jvm.internal.AFwS204S0000000_16;

/* JADX INFO: renamed from: X.0cfy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public abstract class AbstractC1021000cfy implements InterfaceC1021030cg1 {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(532));
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(531));

    public static C1025430cn7 LJ() {
        return new C1025430cn7(null, null, null, null, 127);
    }

    public static AwemeRawAd LIZLLL(C1025880cnq c1025880cnq) {
        Object obj;
        if (c1025880cnq != null) {
            obj = c1025880cnq.LIZLLL;
        } else {
            obj = null;
        }
        if (!(obj instanceof AwemeRawAd)) {
            return null;
        }
        return (AwemeRawAd) obj;
    }

    public final CRouterCoreModel LIZJ(AwemeRawAd awemeRawAd) {
        return ((ICRouterAdapterService) this.LIZIZ.getValue()).LIZLLL(awemeRawAd);
    }
}
