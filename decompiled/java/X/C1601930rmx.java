package X;

import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.network.spi.INetworkStateService;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0rmx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1601930rmx extends C09AY implements Function0<JSONObject> {
    public final /* synthetic */ FeedItemList LL;
    public final /* synthetic */ C1494850p0F LLILLJJLI;
    public final /* synthetic */ C1601460rmC LLILLL;
    public final /* synthetic */ Long LLILZ;
    public final /* synthetic */ JSONObject LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1601930rmx(FeedItemList feedItemList, C1494850p0F c1494850p0F, C1601460rmC c1601460rmC, Long l, JSONObject jSONObject) {
        super(0);
        this.LL = feedItemList;
        this.LLILLJJLI = c1494850p0F;
        this.LLILLL = c1601460rmC;
        this.LLILZ = l;
        this.LLILZIL = jSONObject;
    }

    @Override // kotlin.jvm.functions.Function0
    public final JSONObject invoke() throws JSONException {
        C0XPL c0xpl;
        String strOptString;
        List<Aweme> items;
        Long networkInfoKey;
        FeedItemList feedItemList = this.LL;
        Long lValueOf = Long.valueOf((feedItemList == null || (networkInfoKey = feedItemList.getNetworkInfoKey()) == null) ? 0L : networkInfoKey.longValue());
        String str = null;
        if (lValueOf != null) {
            lValueOf.longValue();
            ConcurrentHashMap<Long, C0XPL> concurrentHashMap = C0XPJ.LIZ;
            c0xpl = concurrentHashMap.get(lValueOf);
            if (c0xpl != null) {
                concurrentHashMap.remove(lValueOf);
            }
        } else {
            c0xpl = null;
        }
        Integer num = c0xpl != null ? c0xpl.LIZ : null;
        Pair[] pairArr = new Pair[13];
        FeedItemList feedItemList2 = this.LL;
        pairArr[0] = new Pair("log_id", feedItemList2 != null ? feedItemList2.getRequestId() : null);
        C1494850p0F c1494850p0F = this.LLILLJJLI;
        pairArr[1] = new Pair("send_bytes", c1494850p0F != null ? Long.valueOf(c1494850p0F.LJIJI) : null);
        C1494850p0F c1494850p0F2 = this.LLILLJJLI;
        pairArr[2] = new Pair("received_bytes", c1494850p0F2 != null ? Long.valueOf(c1494850p0F2.LJIJJ) : null);
        pairArr[3] = new Pair("is_success", 1);
        pairArr[4] = new Pair("session_number", Integer.valueOf(this.LLILLL.LJJJIL));
        pairArr[5] = new Pair("internet_speed", Integer.valueOf(C1479130oat.LJII()));
        C844470XAv.LIZ.getClass();
        pairArr[6] = new Pair("access_type", C786710UtZ.LIZ(C844470XAv.LIZ()));
        INetworkStateService iNetworkStateService = (INetworkStateService) ServiceManager.get().getService(INetworkStateService.class);
        pairArr[7] = new Pair("network_status", iNetworkStateService != null ? Integer.valueOf(iNetworkStateService.getEffectiveConnectionType()).toString() : null);
        FeedItemList feedItemList3 = this.LL;
        pairArr[8] = new Pair("items_count", Integer.valueOf((feedItemList3 == null || (items = feedItemList3.getItems()) == null) ? 0 : items.size()));
        pairArr[9] = new Pair("total_duration", this.LLILZ);
        C1601590rmP c1601590rmP = this.LLILLL.LJJJ;
        pairArr[10] = new Pair("parse_request_duration", c1601590rmP != null ? Long.valueOf(c1601590rmP.LIZJ) : null);
        C1601590rmP c1601590rmP2 = this.LLILLL.LJJJ;
        pairArr[11] = new Pair("parse_response_duration", c1601590rmP2 != null ? Long.valueOf(c1601590rmP2.LIZLLL) : null);
        pairArr[12] = new Pair("retry_count", num);
        JSONObject jSONObjectLIZ = C591500NHw.LIZ(pairArr);
        if (this.LLILLL.LJJJIL == 0) {
            jSONObjectLIZ.putOpt("from_start_to_feed_network_duration", Long.valueOf(SystemClock.elapsedRealtime() - C1150504el.LIZ().LJJIII));
        }
        C1601950rmz c1601950rmz = C1601950rmz.LIZ;
        JSONObject jSONObject = this.LLILZIL;
        try {
            c1601950rmz.getClass();
            if (jSONObject != null) {
                Iterator<String> itKeys = jSONObject.keys();
                strOptString = null;
                while (true) {
                    if (!itKeys.hasNext()) {
                        break;
                    }
                    String next = itKeys.next();
                    if (u.LJIJI("tlb-backup", next, true)) {
                        strOptString = "tlb";
                        break;
                    }
                    if (u.LJIJI("provider", next, true)) {
                        strOptString = jSONObject.optString(next);
                    }
                }
            } else {
                strOptString = null;
            }
            if (!(strOptString == null || strOptString.length() == 0)) {
                jSONObjectLIZ.putOpt("demotion", strOptString);
            }
            if (jSONObject != null) {
                Iterator<String> itKeys2 = jSONObject.keys();
                while (true) {
                    if (!itKeys2.hasNext()) {
                        break;
                    }
                    String next2 = itKeys2.next();
                    if (u.LJIJI("x-backend", next2, true)) {
                        str = (String) C13LP.LJJLIIIJJI(a0.LJJLIIIJILLIZJL(jSONObject.optString(next2), new String[]{"|"}, 0, 6));
                        break;
                    }
                }
            }
            if (!(str == null || str.length() == 0)) {
                jSONObjectLIZ.putOpt("vdc", str);
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
            return jSONObjectLIZ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return jSONObjectLIZ;
        }
    }
}
