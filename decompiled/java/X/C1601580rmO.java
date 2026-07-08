package X;

import android.os.SystemClock;
import android.text.TextUtils;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.app.services.IHybridABInfoService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.network.spi.INetworkStateService;
import java.util.concurrent.ExecutorService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0rmO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1601580rmO extends C09AY implements Function0<Unit> {
    public final /* synthetic */ Function0<JSONObject> LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ C1601460rmC LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1601580rmO(C1601460rmC c1601460rmC, String str, Function0 function0) {
        super(0);
        this.LL = function0;
        this.LLILLJJLI = str;
        this.LLILLL = c1601460rmC;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ExecutorService executorServiceLJFF = C20684815ws.LJFF();
        final Function0<JSONObject> function0 = this.LL;
        final String str = this.LLILLJJLI;
        final C1601460rmC c1601460rmC = this.LLILLL;
        executorServiceLJFF.execute(new Runnable() { // from class: X.0rn0
            public final void LIZ() throws JSONException {
                JSONObject jSONObjectInvoke = function0.invoke();
                jSONObjectInvoke.putOpt("sub_event", str);
                C1601950rmz.LIZ.getClass();
                boolean zBooleanValue = C1514430pVp.LIZLLL().booleanValue();
                int i = !TextUtils.isEmpty(DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId()) ? 1 : 0;
                long jElapsedRealtime = SystemClock.elapsedRealtime() - C1150504el.LIZ().LJJIII;
                Integer numLIZIZ = ((IHybridABInfoService) ServiceManager.get().getService(IHybridABInfoService.class)).LIZIZ();
                int iIntValue = numLIZIZ != null ? numLIZIZ.intValue() : 0;
                jSONObjectInvoke.putOpt("from_start_to_current_duration", Long.valueOf(jElapsedRealtime));
                jSONObjectInvoke.putOpt("is_hybrid_ab_recv", Integer.valueOf(iIntValue));
                jSONObjectInvoke.putOpt("is_cold_start_first_launch", Integer.valueOf(zBooleanValue ? 1 : 0));
                jSONObjectInvoke.putOpt("is_did_ready", Integer.valueOf(i));
                C0CR3.LIZ.getClass();
                jSONObjectInvoke.putOpt("is_hybrid_ab_api_rev", Integer.valueOf(C0CR3.LJIIIZ ? 1 : 0));
                jSONObjectInvoke.putOpt("is_in_nuj_process", Integer.valueOf(C19254610Um.LIZIZ.LJJIJIIJI()));
                C1913090zsp.LIZ.getClass();
                jSONObjectInvoke.putOpt("feed_status_on_video_show", Boolean.valueOf(C1913090zsp.LJ));
                jSONObjectInvoke.putOpt("internet_speed", Integer.valueOf(C1479130oat.LJII()));
                C844470XAv.LIZ.getClass();
                jSONObjectInvoke.putOpt("access_type", C786710UtZ.LIZ(C844470XAv.LIZ()));
                INetworkStateService iNetworkStateService = (INetworkStateService) ServiceManager.get().getService(INetworkStateService.class);
                jSONObjectInvoke.putOpt("network_status", iNetworkStateService != null ? Integer.valueOf(iNetworkStateService.getEffectiveConnectionType()).toString() : null);
                C1601460rmC c1601460rmC2 = c1601460rmC;
                C1601590rmP c1601590rmP = c1601460rmC2.LJJJ;
                jSONObjectInvoke.putOpt("unique_request_id", c1601590rmP != null ? Long.valueOf(c1601590rmP.LIZ).toString() : null);
                jSONObjectInvoke.putOpt("pull_type", Integer.valueOf(c1601460rmC2.LIZIZ));
                jSONObjectInvoke.putOpt("request_method", c1601460rmC2.LJJIZ);
                jSONObjectInvoke.putOpt("aweme_ids", c1601460rmC2.LJIIIIZZ);
                jSONObjectInvoke.putOpt("aweme_id", c1601460rmC2.LIZLLL);
                String str2 = c1601460rmC2.LJJJI;
                jSONObjectInvoke.putOpt("aweme_ids_insert_reason", (str2 == null || str2.length() == 0) ? c1601460rmC2.LJIIZILJ : c1601460rmC2.LJJJI);
                C20684815ws.LJIJ("perf_feed_response", jSONObjectInvoke);
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("FeedApiPerfMonitor@ab05.reportEvent$1$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("FeedApiPerfMonitor@ab05.reportEvent$1$1");
            }
        });
        return Unit.LIZ;
    }
}
