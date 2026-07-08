package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.k;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.rich.reward.IGmtRewardAdPreloadFactory;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0cwq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1031460cwq implements InterfaceC1031520cww, InterfaceC1033150czZ {
    public final InterfaceC1033840d0g LL;

    @Override // X.InterfaceC1033000czK
    public final Gson getGson() {
        C1227904rF.LIZ.getClass();
        return C1227904rF.LIZLLL();
    }

    public C1031460cwq() {
        IGmtRewardAdPreloadFactory iGmtRewardAdPreloadFactory = (IGmtRewardAdPreloadFactory) PluggableExtentionKt.pluggableSpi$default(IGmtRewardAdPreloadFactory.class, false, false, false, 14, null);
        this.LL = iGmtRewardAdPreloadFactory != null ? iGmtRewardAdPreloadFactory.LIZ(this, new C1031490cwt(C1033060czQ.LIZ())) : null;
    }

    @Override // X.InterfaceC1031520cww
    public final InterfaceC1033840d0g LIZ() {
        return this.LL;
    }

    @Override // X.InterfaceC1033000czK
    public final void incentiveAdPreloadData(Object obj) {
        C989170bqd.LIZ.getClass();
        C989170bqd.LIZ(obj);
    }

    @Override // X.InterfaceC1033000czK
    public final Object parsingHostModel(k kVar) {
        Object c098200Yq;
        try {
            C1227904rF.LIZ.getClass();
            c098200Yq = (Aweme) C1227904rF.LIZLLL().LIZJ(kVar, Aweme.class);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            return null;
        }
        return c098200Yq;
    }

    @Override // X.InterfaceC1033150czZ
    public final void trackEvent(C1031480cws c1031480cws, Object obj) {
        Aweme aweme;
        if ((obj instanceof Aweme) && (aweme = (Aweme) obj) != null) {
            C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL(c1031480cws.LIZ, c1031480cws.LIZIZ, aweme.getAwemeRawAd());
            c1022820ciuLIZLLL.LIZJ(c1031480cws.LIZJ, "refer");
            c1022820ciuLIZLLL.LIZ(c1031480cws.LIZLLL);
            c1022820ciuLIZLLL.LJII();
        }
    }

    @Override // X.InterfaceC1033150czZ
    public final void trackUserEvent(String str, JSONObject jSONObject) {
        C20684815ws.LJIJ(str, jSONObject);
    }

    @Override // X.InterfaceC1033000czK
    public final void request(EnumC1033600d0I enumC1033600d0I, String str, Map<String, String> map, Map<String, String> map2, Function1<? super AbstractC1033390czx, Unit> function1) {
        C1033580d0G.LIZ.getClass();
        C1033580d0G.LIZ(enumC1033600d0I, str, map, map2, function1);
    }
}
