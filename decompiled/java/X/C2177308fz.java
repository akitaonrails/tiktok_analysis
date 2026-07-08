package X;

import android.content.Context;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.pitaya.api.PitayaProxy;
import com.bytedance.pitaya.api.bean.PTYProxySetting;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.pitaya.experiment.PitayaExperiment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.08fz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2177308fz extends C09AY implements Function0<Unit> {
    public final /* synthetic */ Context LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2177308fz(Context context) {
        super(0);
        this.LL = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("pitaya_proxy_init_switch", false) && PitayaExperiment.LIZ.enable == 1) {
            PTYProxySetting pTYProxySetting = new PTYProxySetting(false);
            pTYProxySetting.setApplogProxyEnabled(true);
            PitayaProxy.init(this.LL, pTYProxySetting);
            long jCurrentTimeMillis = System.currentTimeMillis() - C1150504el.LIZ().LJJII;
            SettingsManager.LIZLLL().getClass();
            if (SettingsManager.LIZ("pitaya_proxy_init_switch", false)) {
                AppLogNewUtils.onEventV3("pitaya_proxy_ready", new JSONObject().put("duration", jCurrentTimeMillis));
            }
        }
        return Unit.LIZ;
    }
}
