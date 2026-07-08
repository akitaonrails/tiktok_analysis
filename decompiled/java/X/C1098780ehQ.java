package X;

import android.os.SystemClock;
import com.bytedance.android.livesdk.livesetting.hybrid.LiveHybridLynxCodeCacheOptimizeSetting;
import com.bytedance.android.livesdk.livesetting.hybrid.LiveTop3HybridContainerDynamicParamsSetting;
import com.bytedance.hybrid.spark.SparkContext;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0ehQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1098780ehQ extends C09AY implements Function1<SparkContext, Unit> {
    public final /* synthetic */ C1098800ehS LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1098780ehQ(C1098800ehS c1098800ehS, String str, String str2) {
        super(1);
        this.LL = c1098800ehS;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(SparkContext sparkContext) {
        final SparkContext sparkContext2 = sparkContext;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (LiveHybridLynxCodeCacheOptimizeSetting.INSTANCE.shortTouchEnable()) {
            sparkContext2.LJJJZ("enable_code_cache", "1");
        }
        Map<String, String> commonParams = LiveTop3HybridContainerDynamicParamsSetting.INSTANCE.getCommonParams();
        if (commonParams != null) {
            for (Map.Entry<String, String> entry : commonParams.entrySet()) {
                sparkContext2.LJJJZ(entry.getKey(), entry.getValue());
            }
        }
        Map<String, String> shortTouchParams = LiveTop3HybridContainerDynamicParamsSetting.INSTANCE.getShortTouchParams();
        if (shortTouchParams != null) {
            for (Map.Entry<String, String> entry2 : shortTouchParams.entrySet()) {
                sparkContext2.LJJJZ(entry2.getKey(), entry2.getValue());
            }
        }
        C1098070egH c1098070egHLIZIZ = LIZIZ();
        String str = this.LLILLJJLI;
        String str2 = this.LLILLL;
        c1098070egHLIZIZ.LJIILIIL = "spark_lite";
        if (str == null) {
            str = "";
        }
        c1098070egHLIZIZ.LIZIZ = str;
        c1098070egHLIZIZ.LJII = jCurrentTimeMillis;
        c1098070egHLIZIZ.LIZJ = str2;
        c1098070egHLIZIZ.LIZ(Boolean.TRUE, "preloadAndDecodeResource");
        C1538590q8n c1538590q8n = new C1538590q8n();
        c1538590q8n.LIZ = false;
        c1538590q8n.LJI = true;
        sparkContext2.liteLynxConfig = c1538590q8n;
        final C1098800ehS c1098800ehS = this.LL;
        sparkContext2.LJJIJIIJIL(new AbstractC1538740q92() { // from class: X.0ehT
            @Override // X.AbstractC1537870q7d
            public final void LJLIIIL(InterfaceC1541990qEH interfaceC1541990qEH) {
                LIZIZ().LJIIJ = System.currentTimeMillis();
                C1098850ehX c1098850ehX = c1098800ehS.LLJJ;
                C1098070egH c1098070egHLIZIZ2 = c1098850ehX.LIZIZ();
                AbstractC1098820ehU.LIZJ(c1098850ehX, "container_load", new HashMap(c1098070egHLIZIZ2.LIZIZ()), C2097608Jq.LJIIJ(new Pair("duration", Long.valueOf(AbstractC1098820ehU.LIZ(c1098070egHLIZIZ2.LJIIIZ, c1098070egHLIZIZ2.LJIIJ))), new Pair("duration_from_create", Long.valueOf(AbstractC1098820ehU.LIZ(c1098070egHLIZIZ2.LJII, c1098070egHLIZIZ2.LJIIJ)))));
                c1098800ehS.setEndTime(SystemClock.elapsedRealtime());
                String str3 = sparkContext2.containerId;
                String name = c1098800ehS.getName();
                String strLJIJI = sparkContext2.LJIJI();
                long endTime = -1;
                if (c1098800ehS.getStartTime() != -1) {
                    endTime = c1098800ehS.getEndTime() - c1098800ehS.getStartTime();
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("container_id", str3);
                linkedHashMap.put("card_name", name);
                linkedHashMap.put("container_name", "spark");
                linkedHashMap.put("url", strLJIJI);
                linkedHashMap.put("duration", Long.valueOf(endTime));
                C1CC2.LJII(0, "ttlive_card_view_load_succeed", linkedHashMap);
                linkedHashMap.put("event_name", "ttlive_card_view_load_succeed");
                C1143300frE.LJIIJJI().LJII("ttlive_hybrid", linkedHashMap);
                InterfaceC1098840ehW loadCallback = c1098800ehS.getLoadCallback();
                if (loadCallback != null) {
                    loadCallback.LJJIZ();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // X.AbstractC1537870q7d
            public final void LJLIIL(InterfaceC1541990qEH interfaceC1541990qEH, String str3) {
                c1098800ehS.setStartTime(SystemClock.elapsedRealtime());
                LIZIZ().LJIIIZ = System.currentTimeMillis();
                InterfaceC1098840ehW loadCallback = c1098800ehS.getLoadCallback();
                if (loadCallback != null) {
                    loadCallback.LIZ();
                }
            }

            @Override // X.AbstractC1537870q7d
            public final void LJL(InterfaceC1541990qEH interfaceC1541990qEH, String str3, C1542120qEU c1542120qEU) {
                LIZIZ().LJIIJ = System.currentTimeMillis();
                C1098850ehX c1098850ehX = c1098800ehS.LLJJ;
                String str4 = c1542120qEU.LIZIZ;
                C1098070egH c1098070egHLIZIZ2 = c1098850ehX.LIZIZ();
                long jLIZ = AbstractC1098820ehU.LIZ(c1098070egHLIZIZ2.LJIIIZ, c1098070egHLIZIZ2.LJIIJ);
                long jLIZ2 = AbstractC1098820ehU.LIZ(c1098070egHLIZIZ2.LJII, c1098070egHLIZIZ2.LJIIJ);
                HashMap map = new HashMap(c1098070egHLIZIZ2.LIZIZ());
                Pair[] pairArr = new Pair[3];
                pairArr[0] = new Pair("duration", Long.valueOf(jLIZ));
                pairArr[1] = new Pair("duration_from_create", Long.valueOf(jLIZ2));
                if (str4 == null) {
                    str4 = "";
                }
                pairArr[2] = new Pair("error_message", str4);
                AbstractC1098820ehU.LIZJ(c1098850ehX, "container_load", map, C2097608Jq.LJIIJ(pairArr));
                String str5 = sparkContext2.containerId;
                String name = c1098800ehS.getName();
                String strLJIJI = sparkContext2.LJIJI();
                Integer num = c1542120qEU.LIZ;
                String str6 = c1542120qEU.LIZIZ;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("container_id", str5);
                linkedHashMap.put("card_name", name);
                linkedHashMap.put("container_name", "spark");
                linkedHashMap.put("url", strLJIJI);
                linkedHashMap.put("error_code", num);
                linkedHashMap.put("error_reason", str6);
                C1CC2.LJII(1, "ttlive_card_view_load_failed", linkedHashMap);
                linkedHashMap.put("event_name", "ttlive_card_view_load_failed");
                C1143300frE.LJIIJJI().LJ("ttlive_hybrid", linkedHashMap);
                InterfaceC1098840ehW loadCallback = c1098800ehS.getLoadCallback();
                if (loadCallback != null) {
                    loadCallback.LIZIZ(c1542120qEU.LIZIZ);
                }
            }
        });
        return Unit.LIZ;
    }
}
