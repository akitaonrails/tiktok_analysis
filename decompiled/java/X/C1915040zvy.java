package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.pns.consent.collector.IPNSConsentCollectorDepService;
import com.ss.android.ugc.aweme.pns.consent.collector.api.CollectConsentParam;
import com.ss.android.ugc.aweme.pns.consent.collector.api.IPNSConsentCollectorService;
import com.ss.android.ugc.aweme.pns.usercommunication.api.UserCommunicationProcessorModel;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS394S0200000_28;
import kotlin.jvm.internal.AwS429S0200000_28;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0zvy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1915040zvy implements InterfaceC1915220zwG {
    public final String LIZ;
    public final InterfaceC1915180zwC LIZIZ;
    public final Map<String, String> LIZJ;
    public String LIZLLL;

    @Override // X.InterfaceC1915220zwG
    public final CollectConsentParam LIZ() {
        List<UserCommunicationProcessorModel> listLIZ;
        UserCommunicationProcessorModel next;
        String str;
        CollectConsentParam collectConsentParamLJ;
        String strOptString = "";
        IPNSConsentCollectorDepService iPNSConsentCollectorDepService = (IPNSConsentCollectorDepService) PluggableExtentionKt.pluggableSpi$default(IPNSConsentCollectorDepService.class, false, false, false, 14, null);
        if (iPNSConsentCollectorDepService != null && (listLIZ = iPNSConsentCollectorDepService.LIZ(this.LIZ)) != null) {
            Iterator<UserCommunicationProcessorModel> it2 = listLIZ.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                if (Intrinsics.LJFF(next.processorID, "ConsentCollectProcessor")) {
                    break;
                }
            }
            UserCommunicationProcessorModel userCommunicationProcessorModel = next;
            if (userCommunicationProcessorModel == null) {
                return null;
            }
            Object obj = userCommunicationProcessorModel.processorData;
            if (!(obj instanceof String) || (str = (String) obj) == null) {
                return null;
            }
            try {
                strOptString = new JSONObject(str).optString("popup_id", "");
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            this.LIZLLL = strOptString;
            IPNSConsentCollectorService iPNSConsentCollectorService = (IPNSConsentCollectorService) PluggableExtentionKt.pluggableSpi$default(IPNSConsentCollectorService.class, false, false, false, 14, null);
            if (iPNSConsentCollectorService != null && (collectConsentParamLJ = iPNSConsentCollectorService.LJ(str)) != null) {
                collectConsentParamLJ.LIZ = this.LIZJ;
                return collectConsentParamLJ;
            }
        }
        return null;
    }

    @Override // X.InterfaceC1915220zwG
    public final InterfaceC1915180zwC LIZIZ() {
        InterfaceC1915180zwC interfaceC1915180zwC = this.LIZIZ;
        if (interfaceC1915180zwC != null) {
            return interfaceC1915180zwC;
        }
        if (this.LIZLLL.length() <= 0) {
            return null;
        }
        final String str = this.LIZLLL;
        return new InterfaceC1915180zwC(str) { // from class: X.0zvt
            public final String LIZ;

            @Override // X.InterfaceC1915180zwC
            public final void LIZ() {
            }

            @Override // X.InterfaceC1915180zwC
            public final void LIZJ(EnumC1876780ywG enumC1876780ywG) {
            }

            @Override // X.InterfaceC1915180zwC
            public final void LJ() {
            }

            @Override // X.InterfaceC1915180zwC
            public final void onDismiss() {
            }

            @Override // X.InterfaceC1915180zwC
            public final void onRejected() {
            }

            {
                this.LIZ = str;
            }

            @Override // X.InterfaceC1915180zwC
            public final boolean LIZIZ(EnumC1876780ywG enumC1876780ywG, CollectConsentParam collectConsentParam) {
                return C1914950zvp.LIZ(enumC1876780ywG, collectConsentParam);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC1915180zwC
            public final void LIZLLL(Context context, CollectConsentParam collectConsentParam, C1914970zvr c1914970zvr, AwS429S0200000_28 awS429S0200000_28, AwS394S0200000_28 awS394S0200000_28, C1914980zvs c1914980zvs) {
                if (this.LIZ.length() == 0) {
                    awS394S0200000_28.invoke("dynamic_id_empty");
                    return;
                }
                C1518550pcT c1518550pcT = C1518550pcT.LIZ;
                String str2 = this.LIZ;
                C1914920zvm c1914920zvm = new C1914920zvm(context, collectConsentParam, c1914970zvr, awS429S0200000_28, awS394S0200000_28, c1914980zvs);
                c1518550pcT.getClass();
                Object obj = ((LinkedHashMap) C1518550pcT.LIZJ).get(str2);
                if (obj != null) {
                    c1914920zvm.invoke(obj);
                    return;
                }
                int value = EnumC1518670pcf.SCENE_PULL_WITH_ID.getValue();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("{\"id\": \"");
                sbLIZ.append(str2);
                sbLIZ.append("\"}");
                C1518550pcT.LIZLLL(c1518550pcT, value, C2097908Jt.LIZJ(new Pair("extra", C2188811AlT.LIZIZ(sbLIZ))), c1914920zvm);
            }
        };
    }

    public C1915040zvy(String str, C1916300zy0 c1916300zy0, Map map, int i) {
        c1916300zy0 = (i & 2) != 0 ? null : c1916300zy0;
        map = (i & 4) != 0 ? C2097608Jq.LJ() : map;
        this.LIZ = str;
        this.LIZIZ = c1916300zy0;
        this.LIZJ = map;
        this.LIZLLL = "";
    }
}
