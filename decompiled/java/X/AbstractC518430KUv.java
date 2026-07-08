package X;

import com.bytedance.android.livesdkapi.ws.LiveWsMessage;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AwS123S1200000_7;
import kotlin.text.Charsets;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0KUv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC518430KUv<IM_MESSAGE> implements InterfaceC1528010prj {
    public final Class<IM_MESSAGE> LIZ;
    public boolean LIZIZ;
    public final Map<String, InterfaceC518440KUw<IM_MESSAGE>> LIZJ = new LinkedHashMap();

    public abstract String LIZJ(IM_MESSAGE im_message);

    public abstract void LIZLLL();

    public abstract void LJ();

    public final String LJFF() {
        String strLJI = C13LE.LIZ(getClass()).LJI();
        return strLJI == null ? "AbsContractStatusUpdateHelper" : strLJI;
    }

    public AbstractC518430KUv(Class<IM_MESSAGE> cls) {
        this.LIZ = cls;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1528010prj
    public final void LIZ(LiveWsMessage liveWsMessage) {
        Object c098200Yq;
        try {
            String str = new String(liveWsMessage.LIZ(), Charsets.UTF_8);
            Object objFromJson = GsonProtectorUtils.fromJson(C19748512Ol.LIZIZ, str, (Class<Object>) this.LIZ);
            String strLIZJ = LIZJ(objFromJson);
            String strLJFF = LJFF();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onReceiveMsg=");
            sbLIZ.append(str);
            C20441214yg.LIZIZ(strLJFF, C2188811AlT.LIZIZ(sbLIZ));
            C176600m4.LIZJ(new AwS123S1200000_7((AbstractC518430KUv) this, (AbstractC518430KUv<int>) strLIZJ, (String) objFromJson, 3));
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C20441214yg.LJFF(LJFF(), "onReceiveMsg failed", thM5exceptionOrNullimpl);
        }
    }

    @Override // X.InterfaceC1528010prj
    public final void LIZIZ(EnumC1527990prh enumC1527990prh, JSONObject jSONObject) {
        String strLJFF = LJFF();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveWsConnectState=");
        sbLIZ.append(enumC1527990prh);
        sbLIZ.append(" connectJson=");
        sbLIZ.append(jSONObject);
        C20441214yg.LIZIZ(strLJFF, C2188811AlT.LIZIZ(sbLIZ));
    }
}
