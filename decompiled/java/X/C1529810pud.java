package X;

import com.lynx.tasm.LynxBackgroundRuntime;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pud, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1529810pud extends C09AY implements Function1<C1529820pue, Unit> {
    public final /* synthetic */ C1540540qBw LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1529810pud(C1540540qBw c1540540qBw) {
        super(1);
        this.LL = c1540540qBw;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1529820pue c1529820pue) {
        String str;
        C1529820pue c1529820pue2 = c1529820pue;
        C1540540qBw c1540540qBw = this.LL;
        c1540540qBw.getClass();
        C1537480q70 c1537480q70 = c1540540qBw.LIZ;
        String str2 = c1537480q70.containerId;
        C1520360pfO c1520360pfO = new C1520360pfO("spark_lynx_runtime_error");
        c1520360pfO.LIZIZ = c1537480q70.bid;
        c1520360pfO.LIZ = c1537480q70.LJIJI();
        c1520360pfO.LJIIJJI = EnumC993170bx5.Both;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("schema", c1540540qBw.LIZ.LJIJI());
        LynxBackgroundRuntime lynxBackgroundRuntime = c1540540qBw.LIZLLL;
        if (lynxBackgroundRuntime != null) {
            str = lynxBackgroundRuntime.LJI;
        } else {
            str = null;
        }
        jSONObject.put("url", str);
        jSONObject.put("error_code", c1529820pue2.LIZ);
        jSONObject.put("error_message", c1529820pue2.LIZIZ);
        HashMap<String, Object> map = c1529820pue2.LIZJ;
        if (map != null) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
        }
        c1520360pfO.LIZLLL = jSONObject;
        C1520080pew.LIZ(str2, c1520360pfO.LIZ());
        return Unit.LIZ;
    }
}
