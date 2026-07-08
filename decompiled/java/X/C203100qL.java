package X;

import com.bytedance.android.livesdk.chatroom.api.SubPinCard;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.00qL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C203100qL extends C09AY implements Function1<SparkContext, Unit> {
    public final /* synthetic */ SubPinCard LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C203100qL(SubPinCard subPinCard) {
        super(1);
        this.LL = subPinCard;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(SparkContext sparkContext) {
        SparkContext sparkContext2 = sparkContext;
        try {
            final SubPinCard subPinCard = this.LL;
            sparkContext2.LJJJJZ(new AbstractC1539010q9T() { // from class: X.00ac
                @Override // X.AbstractC1539010q9T, X.InterfaceC1057870ddR
                public final void LJJJLL(InterfaceC1531560pxS interfaceC1531560pxS) {
                    Object obj;
                    JSONObject jSONObject;
                    if (interfaceC1531560pxS instanceof C1537910q7h) {
                        SubPinCard subPinCard2 = subPinCard;
                        try {
                            C1537910q7h c1537910q7h = (C1537910q7h) interfaceC1531560pxS;
                            C1067460dsu c1067460dsu = new C1067460dsu();
                            Gson gson = C19748512Ol.LIZIZ;
                            SubPinCard.SubPinCardExtra subPinCardExtra = subPinCard2.extraInfo;
                            if (subPinCardExtra == null || (obj = subPinCardExtra.sovInfo) == null) {
                                obj = "";
                            }
                            String strLJIILL = gson.LJIILL(obj);
                            try {
                                jSONObject = new JSONObject();
                                jSONObject.put("sov_data", new JSONObject(strLJIILL));
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                jSONObject = new JSONObject();
                            }
                            for (Map.Entry entry : ((LinkedHashMap) subPinCard2.LIZ).entrySet()) {
                                jSONObject.put((String) entry.getKey(), entry.getValue());
                            }
                            c1067460dsu.LIZ("initial_data", jSONObject);
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("initDataObject: ");
                            sbLIZ.append(jSONObject);
                            C20441214yg.LJ("PinCardExt", C2188811AlT.LIZIZ(sbLIZ));
                            c1537910q7h.LJIJJLI(c1067460dsu);
                            C189200o6.m2constructorimpl(Unit.LIZ);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            C189200o6.m2constructorimpl(new C098200Yq(th));
                        }
                    }
                }
            });
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJI("PinCardExt", e);
        }
        return Unit.LIZ;
    }
}
