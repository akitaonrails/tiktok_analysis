package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.lynx.spark.schema.model.SparkSchemaParam;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ConcurrentModificationException;
import java.util.LinkedList;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0q9G, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1538880q9G {
    public static final C1538880q9G LIZ = new C1538880q9G();
    public static InterfaceC1539040q9W LIZIZ;
    public static volatile Integer LIZJ;

    public final synchronized void LIZ(int i) {
        InterfaceC1541990qEH interfaceC1541990qEHLJIJJ;
        Integer num = LIZJ;
        if (num != null && i == num.intValue()) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("networkLevel", i);
            LinkedList<SparkContext> linkedList = new LinkedList();
            try {
                try {
                    C1537480q70.Companion.getClass();
                    for (C1537480q70 c1537480q70 : C1537480q70.hybridContextMap.values()) {
                        Integer num2 = LIZJ;
                        if (num2 != null && i == num2.intValue() && (c1537480q70 instanceof SparkContext) && ((SparkContext) c1537480q70) != null) {
                            linkedList.add(c1537480q70);
                        } else {
                            return;
                        }
                    }
                    for (SparkContext sparkContext : linkedList) {
                        Integer num3 = LIZJ;
                        if (num3 != null && i == num3.intValue()) {
                            C1529880puk c1529880puk = SparkContext.Companion;
                            SparkSchemaParam sparkSchemaParamLJJJI = sparkContext.LJJJI(-1);
                            if (sparkSchemaParamLJJJI != null && sparkSchemaParamLJJJI.getSubscribeNetworkLevel() && (interfaceC1541990qEHLJIJJ = sparkContext.LJIJJ()) != null) {
                                interfaceC1541990qEHLJIJJ.LIZ("networkLevelChange", jSONObject);
                            }
                        } else {
                            return;
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            } catch (ConcurrentModificationException e) {
                TryCatchGuardChecker.doCheck(e);
                C086F c086f = C086F.LIZ;
                C1538910q9J c1538910q9J = new C1538910q9J(i);
                c086f.getClass();
                C086F.LJI(c1538910q9J);
            }
        }
    }
}
