package X;

import com.bytedance.android.starship.engine.graph.config.ExpressionNodeConfig;
import com.bytedance.android.starship.engine.graph.config.NodeConfig;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0k8B, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1307570k8B extends AbstractC1307540k88 {
    public C1307780k8W LIZJ;
    public Map<String, ? extends Object> LIZLLL;
    public C1307420k7w LJ;

    public C1307570k8B(long j, NodeConfig nodeConfig) {
        super(j, nodeConfig);
    }

    @Override // X.AbstractC1307540k88, X.InterfaceC1307210k7b
    public final Object LIZ(C1307140k7U c1307140k7U, InterfaceC1364105Vn interfaceC1364105Vn) {
        ExpressionNodeConfig expressionNodeConfig;
        try {
            this.LJ = null;
            expressionNodeConfig = this.LIZIZ.expressionConfig;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.LJ = new C1307420k7w(this.LIZIZ, e);
        }
        if (expressionNodeConfig == null) {
            return Unit.LIZ;
        }
        JSONObject jSONObject = new JSONObject(expressionNodeConfig.expression);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("node");
        if (jSONObjectOptJSONObject != null) {
            jSONObject = jSONObjectOptJSONObject;
        }
        this.LIZJ = new C1307780k8W(C1308340k9Q.LIZ(jSONObject));
        String str = expressionNodeConfig.extraInputs;
        if (str != null) {
            this.LIZLLL = (Map) new Gson().LJIIIIZZ(str, new TypeToken<Map<String, ? extends Object>>() { // from class: X.00Vu
            }.getType());
        }
        List<String> list = this.LIZIZ.expressionConfig.models;
        if (list != null) {
            Iterator<String> it2 = list.iterator();
            while (it2.hasNext()) {
                C1309240kAs.LIZLLL(it2.next());
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x019c  */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.HashMap, java.util.LinkedHashMap, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v6 */
    @Override // X.InterfaceC1307210k7b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(X.C1307280k7i r9, com.bytedance.android.starship.engine.graph.foundation.Task r10, X.InterfaceC1364105Vn r11) throws X.C1307420k7w {
        /*
            Method dump skipped, instruction units count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1307570k8B.LIZJ(X.0k7i, com.bytedance.android.starship.engine.graph.foundation.Task, X.05Vn):java.lang.Object");
    }
}
