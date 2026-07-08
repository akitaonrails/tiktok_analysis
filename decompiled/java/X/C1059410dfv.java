package X;

import com.bytedance.hybrid.spark.SparkContext;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS560S0100000_16;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0dfv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1059410dfv implements InterfaceC1058960dfC {
    public final /* synthetic */ Function0<String> LIZ;

    public C1059410dfv(AwS560S0100000_16 awS560S0100000_16) {
        this.LIZ = awS560S0100000_16;
    }

    @Override // X.InterfaceC1058960dfC
    public final C1058950dfB LIZ(int i, String str, JSONObject jSONObject) {
        C1075770e6J c1075770e6J;
        if (str != null) {
            Function0<String> function0 = this.LIZ;
            if (i != 1) {
                if (i == 2) {
                    C1529880puk c1529880puk = SparkContext.Companion;
                    String strInvoke = function0.invoke();
                    c1529880puk.getClass();
                    C1537480q70 c1537480q70LIZIZ = C1529880puk.LIZIZ(strInvoke);
                    if (c1537480q70LIZIZ != null && (c1075770e6J = (C1075770e6J) c1537480q70LIZIZ.LJFF(C1075770e6J.class)) != null) {
                        if (jSONObject == null) {
                            jSONObject = new JSONObject();
                        }
                        c1075770e6J.sendEvent(str, jSONObject);
                    }
                    return new C1058950dfB();
                }
                return null;
            }
            ConcurrentHashMap<String, InterfaceC801410VcB> concurrentHashMap = AbstractC1059420dfw.LLILZIL;
            InterfaceC801410VcB interfaceC801410VcB = concurrentHashMap.get(str);
            if (interfaceC801410VcB != null) {
                if (jSONObject == null) {
                    interfaceC801410VcB.LIZ(C2097608Jq.LJIIIIZZ(new Pair("code", 1), new Pair("msg", "success"), new Pair("data", jSONObject)));
                } else {
                    interfaceC801410VcB.LIZ(C2348609Ie.LIZIZ(jSONObject));
                }
                concurrentHashMap.remove(str);
                return new C1058950dfB();
            }
            return null;
        }
        return null;
    }
}
