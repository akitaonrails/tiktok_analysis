package X;

import com.bytedance.android.livesdk.model.message.PushContractStatusResult;
import com.bytedance.android.livesdkapi.ws.LiveWsMessage;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Unit;
import kotlin.text.Charsets;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0KMv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C516350KMv implements InterfaceC1528010prj {
    public static boolean LIZIZ;
    public static final C516350KMv LIZ = new C516350KMv();
    public static final Set<C0KO8> LIZJ = new LinkedHashSet();

    @Override // X.InterfaceC1528010prj
    public final void LIZ(LiveWsMessage liveWsMessage) {
        try {
            String str = new String(liveWsMessage.LIZ(), Charsets.UTF_8);
            PushContractStatusResult pushContractStatusResult = (PushContractStatusResult) C19748512Ol.LIZIZ.LJII(str, PushContractStatusResult.class);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onReceiveMsg=");
            sbLIZ.append(str);
            C20441214yg.LIZIZ("ContractStatusUpdateHelper", C2188811AlT.LIZIZ(sbLIZ));
            C176600m4.LIZJ(new C0KN0(pushContractStatusResult));
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @Override // X.InterfaceC1528010prj
    public final void LIZIZ(EnumC1527990prh enumC1527990prh, JSONObject jSONObject) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveWsConnectState=");
        sbLIZ.append(enumC1527990prh);
        sbLIZ.append(" connectJson=");
        sbLIZ.append(jSONObject);
        C20441214yg.LIZIZ("ContractStatusUpdateHelper", C2188811AlT.LIZIZ(sbLIZ));
    }
}
