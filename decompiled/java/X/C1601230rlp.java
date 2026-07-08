package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.network.spi.INetworkStateService;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0rlp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1601230rlp extends C09AY implements Function0<JSONObject> {
    public final /* synthetic */ C1601460rmC LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1601230rlp(C1601460rmC c1601460rmC) {
        super(0);
        this.LL = c1601460rmC;
    }

    @Override // kotlin.jvm.functions.Function0
    public final JSONObject invoke() throws JSONException {
        Pair[] pairArr = new Pair[8];
        pairArr[0] = new Pair("internet_speed", Integer.valueOf(C1479130oat.LJII()));
        C844470XAv.LIZ.getClass();
        pairArr[1] = new Pair("access_type", C786710UtZ.LIZ(C844470XAv.LIZ()));
        INetworkStateService iNetworkStateService = (INetworkStateService) ServiceManager.get().getService(INetworkStateService.class);
        pairArr[2] = new Pair("network_status", iNetworkStateService != null ? Integer.valueOf(iNetworkStateService.getEffectiveConnectionType()).toString() : null);
        pairArr[3] = new Pair("has_splash", Integer.valueOf(C1030680cva.LJIJI ? 1 : 0));
        pairArr[4] = new Pair("nu_request_type", String.valueOf(this.LL.LJIJ));
        C1601590rmP c1601590rmP = this.LL.LJJJ;
        pairArr[5] = new Pair("remaining_list_cnt", c1601590rmP != null ? Integer.valueOf(c1601590rmP.LIZIZ) : null);
        pairArr[6] = new Pair("enter_from", "homepage_hot");
        pairArr[7] = new Pair("session_number", Integer.valueOf(this.LL.LJJJJ));
        JSONObject jSONObjectLIZ = C591500NHw.LIZ(pairArr);
        if (C1238740iLA.LIZIZ().LIZ(0, "cold_start_times") <= 1) {
            jSONObjectLIZ.putOpt("from_start_to_feed_request_finish_duration", Long.valueOf(SystemClock.elapsedRealtime() - C1150504el.LIZ().LJJIII));
        }
        return jSONObjectLIZ;
    }
}
