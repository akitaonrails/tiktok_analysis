package X;

import com.ss.android.ugc.aweme.IRewardAdPreloadFactory;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0cwp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1031450cwp implements InterfaceC1031520cww, InterfaceC1033130czX {
    public final InterfaceC1033840d0g LL;

    public C1031450cwp() {
        IRewardAdPreloadFactory iRewardAdPreloadFactory = (IRewardAdPreloadFactory) PluggableExtentionKt.pluggableSpi$default(IRewardAdPreloadFactory.class, false, false, false, 14, null);
        this.LL = iRewardAdPreloadFactory != null ? iRewardAdPreloadFactory.LIZ(this) : null;
    }

    @Override // X.InterfaceC1031520cww
    public final InterfaceC1033840d0g LIZ() {
        return this.LL;
    }

    @Override // X.InterfaceC1033130czX
    public final void trackEvent(C1031310cwb c1031310cwb, Object obj) {
        Aweme aweme;
        if ((obj instanceof Aweme) && (aweme = (Aweme) obj) != null) {
            C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL(c1031310cwb.LIZ, c1031310cwb.LIZIZ, aweme.getAwemeRawAd());
            c1022820ciuLIZLLL.LIZJ(c1031310cwb.LIZJ, "refer");
            c1022820ciuLIZLLL.LIZ(c1031310cwb.LIZLLL);
            c1022820ciuLIZLLL.LJII();
        }
    }

    @Override // X.InterfaceC1033130czX
    public final void trackUserEvent(String str, JSONObject jSONObject) {
        C20684815ws.LJIJ(str, jSONObject);
    }

    @Override // X.InterfaceC1033030czN
    public final void request(EnumC1033610d0J enumC1033610d0J, String str, Map<String, String> map, Map<String, String> map2, Function1<? super AbstractC1033380czw, Unit> function1) {
        C1033570d0F.LIZ.getClass();
        C1033570d0F.LIZ(enumC1033610d0J, str, map, map2, function1);
    }
}
